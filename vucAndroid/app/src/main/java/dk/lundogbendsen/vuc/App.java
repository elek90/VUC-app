package dk.lundogbendsen.vuc;

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
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;

import com.bugsense.trace.BugSenseHandler;
import com.cloudinary.Cloudinary;
import com.crashlytics.android.Crashlytics;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import dk.lundogbendsen.vuc.diverse.AppOpdatering;
import dk.lundogbendsen.vuc.diverse.FilCache;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.diverse.Netvaerksstatus;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Logik;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.nav2.HovedAkt;
import dk.lundogbendsen.vuc.skrald.nav1.SkraldHovedAkt;
import io.fabric.sdk.android.Fabric;


public class App extends Application {
  public static final boolean PRODUKTION = !BuildConfig.DEBUG;
  public static boolean EMULATOR = true; // Sæt i onCreate(), ellers virker det ikke i std Java
  public static App instans;
  public static SharedPreferences prefs;
  public static ConnectivityManager connectivityManager;
  public static String versionsnavn = BuildConfig.VERSION_NAME;
  public static NotificationManager notificationManager;
  public static AudioManager audioManager;
  public static boolean fejlsøgning = false;
  public static Handler hovedtråd;
  public static Typeface skrift;

  public static Netvaerksstatus netværk;
  public static Resources res;
  /** Tidsstempel der kan bruges til at afgøre hvilke filer der faktisk er brugt efter denne opstart */
  private static long TIDSSTEMPEL_VED_OPSTART;
  private static SharedPreferences grunddata_prefs;
  private static String versionsnavnDetaljer;
  public static Fragment synligtFragment;
  public static boolean opstartTest = false;
  public static ArrayList<Fragment> onActivityResultListe = new ArrayList<>();
  public static Cloudinary cloudinary;
  public static File fillager;
  public static int erIgang;

  public void nulstilData() {
    Logik.instans.lavTestdata();
    Brugervalg.instans.opdaterValgFraNyLogikinstans(Logik.instans);
    Fb.gemTestdata();
  }


  @SuppressLint("NewApi")
  @Override
  public void onCreate() {
    TIDSSTEMPEL_VED_OPSTART = System.currentTimeMillis();
    instans = this;
    netværk = new Netvaerksstatus();
    EMULATOR = Build.PRODUCT.contains("sdk") || Build.MODEL.contains("Emulator");
    if (!EMULATOR) {
      BugSenseHandler.initAndStartSession(this, getString(PRODUKTION ? R.string.bugsense_nøgle : R.string.bugsense_testnøgle));
      Fabric.with(this, new Crashlytics());
    }
    super.onCreate();
    /*
    Answers.getInstance().logLogin(new LoginEvent().putMethod("metode").putSuccess(true));
    Crashlytics.setUserIdentifier("12345");
    Crashlytics.setUserEmail("user@fabric.io");
    Crashlytics.setUserName("Test User");
    //throw new RuntimeException("This is a crash");
    */

    hovedtråd = new Handler();
    connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    audioManager = (AudioManager) App.instans.getSystemService(Context.AUDIO_SERVICE);
    prefs = PreferenceManager.getDefaultSharedPreferences(this);
    fejlsøgning = prefs.getBoolean("fejlsøgning", false);
    res = App.instans.getResources();

    File[] filesDirs = ContextCompat.getExternalFilesDirs(this, Environment.DIRECTORY_PICTURES);
    Log.d("filesDirs="+Arrays.toString(filesDirs));
    for (File f : filesDirs) {
      if (f==null) continue; // Det er set at en af indgangene er null, så vi itererer over dem
      fillager = f;
      break;
    }
    Log.d("fillager="+fillager+"  mkdirs "+fillager.mkdirs()+ " skrivbar "+fillager.canWrite());

    // HTTP-forbindelser havde en fejl præ froyo, men jeg har også set problemet på Xperia Play, der er 2.3.4 (!)
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
      System.setProperty("http.keepAlive", "false");
    }
    String packageName = getPackageName();
    try {
      if ("dk.lundogbendsen.vuc".equals(packageName)) {
        if (!PRODUKTION) App.langToast("Sæt PRODUKTIONs-flaget");
      } else {
        if (PRODUKTION) App.langToast("Testudgave - fjern PRODUKTIONs-flaget");
      }
      //noinspection ConstantConditions
      PackageInfo pi = getPackageManager().getPackageInfo(packageName, 0);
      //App.versionsnavn = pi.versionName;
      App.versionsnavnDetaljer = packageName + "/" + pi.versionName;
      //while (PRODUKTION_PÅ_PRØVE && App.versionsnavn.endsWith("x")) App.versionsnavn = App.versionsnavn.substring(0, App.versionsnavn.length()-1);
      if (EMULATOR) App.versionsnavnDetaljer += " EMU";
      Log.d("App.versionsnavn=" + App.versionsnavnDetaljer);

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
    Brugervalg.instans.opdaterValgFraNyLogikinstans(Logik.instans);
    Fb.initFb();
    Log.d("onCreate tog " + (System.currentTimeMillis() - TIDSSTEMPEL_VED_OPSTART) + " ms");

    AppOpdatering.tjekForNyAPK(this);
    Brugervalg.instans.redigeringstilstand = App.prefs.getBoolean("redigeringstilstand",false);


    Map config = new HashMap();
    config.put("cloud_name", res.getString(R.string.cloudinary_cloud_name));
    config.put("api_key",  res.getString(R.string.cloudinary_api_key));
    config.put("api_secret", res.getString(R.string.cloudinary_api_secret));
    cloudinary = new Cloudinary(config);
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
    hovedtråd.post(new Runnable() {
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
    hovedtråd.post(new Runnable() {
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


  /** Kan kaldes for at afgøre om vi er igang med at teste noget fra en main()-metode eller app'en rent faktisk kører */
  public static boolean testFraMain() {
    return instans == null;
  }

  public static void udestår(String hvad) {
    langToast("UDESTÅR:\n"+hvad);
  }

  public static void sætErIGang(boolean iGang, String hvad) {
    erIgang += iGang?1:-1;
    Log.d("erIgang="+erIgang +" for "+hvad+ "  "+aktivitetIForgrunden+" "+iGang);
    if (aktivitetIForgrunden instanceof SkraldHovedAkt) {
      ((SkraldHovedAkt) aktivitetIForgrunden).opdaterErIGang();
    }
    if (aktivitetIForgrunden instanceof HovedAkt) {
      ((HovedAkt) aktivitetIForgrunden).opdaterErIGang();
    }
  }

  public static boolean tjekIntent(Intent i) {
      if (i.resolveActivity(instans.getPackageManager()) != null) return true;
      //App.langToast("Program kan ikke startes");
      return false;
  }
}
