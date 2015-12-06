package dk.lundogbendsen.vuc.diverse;

/**
 * @author j
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.bugsense.trace.BugSenseHandler;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.io.File;
import java.io.FileOutputStream;

import dk.lundogbendsen.vuc.BuildConfig;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Logik;


public class App extends Application {
  public static final boolean PRODUKTION = !BuildConfig.DEBUG;
  public static boolean EMULATOR = true; // Sæt i onCreate(), ellers virker det ikke i std Java
  public static App instans;
  public static SharedPreferences prefs;
  public static ConnectivityManager connectivityManager;
  public static String versionsnavn = "(ukendt)";
  public static NotificationManager notificationManager;
  public static AudioManager audioManager;
  public static boolean fejlsøgning = false;
  public static Handler forgrundstråd;
  public static Typeface skrift;

  public static Netvaerksstatus netværk;
  public static Resources res;
  /** Tidsstempel der kan bruges til at afgøre hvilke filer der faktisk er brugt efter denne opstart */
  private static long TIDSSTEMPEL_VED_OPSTART;
  private static SharedPreferences grunddata_prefs;


  @SuppressLint("NewApi")
  @Override
  public void onCreate() {
    TIDSSTEMPEL_VED_OPSTART = System.currentTimeMillis();
    instans = this;
    netværk = new Netvaerksstatus();
    EMULATOR = Build.PRODUCT.contains("sdk") || Build.MODEL.contains("Emulator");
    if (!EMULATOR)
      BugSenseHandler.initAndStartSession(this, getString(PRODUKTION ? R.string.bugsense_nøgle : R.string.bugsense_testnøgle));
    super.onCreate();

    forgrundstråd = new Handler();
    connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    audioManager = (AudioManager) App.instans.getSystemService(Context.AUDIO_SERVICE);
    prefs = PreferenceManager.getDefaultSharedPreferences(this);
    fejlsøgning = prefs.getBoolean("fejlsøgning", false);
    res = App.instans.getResources();

    // HTTP-forbindelser havde en fejl præ froyo, men jeg har også set problemet på Xperia Play, der er 2.3.4 (!)
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
      System.setProperty("http.keepAlive", "false");
    }
    String packageName = getPackageName();
    try {
      if ("dk.lundogbendsen.vuc.prod".equals(packageName)) {
        if (!PRODUKTION) App.langToast("Sæt PRODUKTIONs-flaget");
      } else {
        if (PRODUKTION) App.langToast("Testudgave - fjern PRODUKTIONs-flaget");
      }
      //noinspection ConstantConditions
      PackageInfo pi = getPackageManager().getPackageInfo(packageName, 0);
      App.versionsnavn = packageName + "/" + pi.versionName;
      //while (PRODUKTION_PÅ_PRØVE && App.versionsnavn.endsWith("x")) App.versionsnavn = App.versionsnavn.substring(0, App.versionsnavn.length()-1);
      if (EMULATOR) App.versionsnavn += " EMU";
      Log.d("App.versionsnavn=" + App.versionsnavn);

      Class.forName("android.os.AsyncTask"); // Fix for http://code.google.com/p/android/issues/detail?id=20915
    } catch (Exception e) {
      Log.rapporterFejl(e);
    }


    FilCache.init(new File(getCacheDir(), "FilCache"));


    registerReceiver(netværk, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    netværk.onReceive(this, null); // Få opdateret netværksstatus

    try {
      skrift = Typeface.createFromAsset(getAssets(), "skrifttype-mangler-endnu.otf");
    } catch (Exception e) {
      if (PRODUKTION) Log.e("DRs skrifttyper er ikke tilgængelige", e);
      skrift = Typeface.DEFAULT;
    }

    Logik.instans.lavTestdata();
    Brugervalg.instans.initTestData(Logik.instans);
    Firebase.setAndroidContext(this);
    Firebase firebaseRef = new Firebase("https://vuc.firebaseio.com/").child("v1");
    firebaseRef.child("logik").setValue(Logik.instans);

    firebaseRef.child("logik").addValueEventListener(new ValueEventListener() {
      @Override
      public void onDataChange(DataSnapshot dataSnapshot) {
        Logik nyLogik = dataSnapshot.getValue(Logik.class);
        System.out.println(nyLogik.brugere);
      }

      @Override
      public void onCancelled(FirebaseError firebaseError) {

      }
    });
    Log.d("onCreate tog " + (System.currentTimeMillis() - TIDSSTEMPEL_VED_OPSTART) + " ms");
  }

  /*
   * Kilde: http://developer.android.com/training/basics/network-ops/managing.html
   */
  public static boolean erOnline() {
    NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    return (networkInfo != null && networkInfo.isConnected());
  }


  public static Activity aktivitetIForgrunden = null;
  public static Activity senesteAktivitetIForgrunden = null;

  public void aktivitetStartet(Activity akt) {
    senesteAktivitetIForgrunden = aktivitetIForgrunden = akt;
  }

  public void aktivitetStoppet(Activity akt) {
    if (akt != aktivitetIForgrunden) return; // en anden aktivitet er allerede startet
    aktivitetIForgrunden = null;
  }


  private static Toast forrigeToast;

  public static void langToast(String txt) {
    Log.d("langToast(" + txt);
    if (aktivitetIForgrunden == null) txt = "VUC:\n" + txt;
    final String txt2 = txt;
    forgrundstråd.post(new Runnable() {
      @Override
      public void run() {
        // lange toasts bør blive hængende
        if (forrigeToast != null && forrigeToast.getDuration() == Toast.LENGTH_SHORT && !App.fejlsøgning && !App.EMULATOR)
          forrigeToast.cancel();
        forrigeToast = Toast.makeText(instans, txt2, Toast.LENGTH_LONG);
        forrigeToast.show();
      }
    });
  }

  public static void kortToast(String txt) {
    Log.d("kortToast(" + txt);
    if (aktivitetIForgrunden == null) txt = "VUC:\n" + txt;
    final String txt2 = txt;
    forgrundstråd.post(new Runnable() {
      @Override
      public void run() {
        // lange toasts bør blive hængende
        if (forrigeToast != null && forrigeToast.getDuration() == Toast.LENGTH_SHORT && !App.fejlsøgning && !App.EMULATOR)
          forrigeToast.cancel();
        forrigeToast = Toast.makeText(instans, txt2, Toast.LENGTH_SHORT);
        forrigeToast.show();
      }
    });
  }

  public static void kortToast(int resId) {
    kortToast(instans.getResources().getString(resId));
  }

  public static void langToast(int resId) {
    langToast(instans.getResources().getString(resId));
  }

  public static void kontakt(Activity akt, String emne, String txt, String vedhæftning) {
    String[] modtagere = new String[]{"nordfalk@lundogbendsen.dk"};

    Intent i = new Intent(Intent.ACTION_SEND);
    i.setType("text/plain");
    i.putExtra(Intent.EXTRA_EMAIL, modtagere);
    i.putExtra(Intent.EXTRA_SUBJECT, emne);


    android.util.Log.d("KONTAKT", txt);
    if (vedhæftning != null) try {
      String logfil = "programlog.txt";
      @SuppressLint("WorldReadableFiles") FileOutputStream fos = akt.openFileOutput(logfil, akt.MODE_WORLD_READABLE);
      fos.write(vedhæftning.getBytes());
      fos.close();
      Uri uri = Uri.fromFile(new File(akt.getFilesDir().getAbsolutePath(), logfil));
      txt += "\n\nRul op øverst i meddelelsen og giv din feedback, tak.";
      i.putExtra(Intent.EXTRA_STREAM, uri);
    } catch (Exception e) {
      Log.e(e);
      txt += "\n" + e;
    }
    i.putExtra(Intent.EXTRA_TEXT, txt);
//    akt.startActivity(Intent.createChooser(i, "Send meddelelse..."));
    try {
      akt.startActivity(i);
    } catch (Exception e) {
      App.langToast(e.toString());
      Log.rapporterFejl(e);
    }
  }


  /** Kan kaldet til at afgøre om vi er igang med at teste noget fra en main()-metode eller app'en rent faktisk kører */
  public static boolean testFraMain() {
    return instans == null;
  }

}
