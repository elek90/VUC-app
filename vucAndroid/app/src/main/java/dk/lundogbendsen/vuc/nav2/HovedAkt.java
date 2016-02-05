package dk.lundogbendsen.vuc.nav2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.util.ArrayList;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.Login_akt;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.AppOpdatering;
import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.skrald.SkraldNav2Frag2EmneHorisontalViewpager;
import dk.lundogbendsen.vuc.skrald.nav1.SkraldHovedAkt;

public class HovedAkt extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener, View.OnClickListener {

  private DrawerLayout drawer;
  private FloatingActionButton fab;
  private ProgressBar progressBar;
  private LinearLayout kategorier;
  private ScrollView navigationView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.hovedakt);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    progressBar = (ProgressBar) findViewById(R.id.progressBar);
    kategorier = (LinearLayout) findViewById(R.id.kategorier);

    navigationView = (ScrollView) findViewById(R.id.nav_view);


    drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    final ViewGroup frame = (ViewGroup) findViewById(R.id.hovedakt_indhold);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
      public float lastTranslate;

      @SuppressLint("NewApi")
      public void onDrawerSlide(View drawerView, float slideOffset)
      {
        float moveFactor = (navigationView.getWidth() * slideOffset);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
        {
          frame.setTranslationX(moveFactor);
        }
        else
        {
          TranslateAnimation anim = new TranslateAnimation(lastTranslate, moveFactor, 0.0f, 0.0f);
          anim.setDuration(0);
          anim.setFillAfter(true);
          frame.startAnimation(anim);

          lastTranslate = moveFactor;
        }
      }
    };
    drawer.setDrawerListener(toggle);
    toggle.syncState();

    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, android.R.id.text1, Brugervalg.instans.bru.holdListe);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    Spinner spinner = (Spinner) findViewById(R.id.fag);
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(this);


    drawer.setScrimColor(Color.TRANSPARENT); // 0x10000000);


    AQuery aq = new AQuery(this);
    aq.id(R.id.redigeringstilstand).clicked(this).checked(Brugervalg.instans.redigeringstilstand);
    aq.id(R.id.nulstil_data).clicked(this);
    aq.id(R.id.hent_ny_version).clicked(this);
    aq.id(R.id.emner).clicked(this);
    aq.id(R.id.log_ud).clicked(this);
    aq.id(R.id.skift_navigation).clicked(this);
    aq.id(R.id.skift_navigation2).clicked(this);


    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
              .add(R.id.hovedakt_indhold, new Frag1VælgEmne()).commit();
    }

    fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Fragment f = getSupportFragmentManager().findFragmentById(R.id.hovedakt_indhold);
        if (f instanceof Frag2EmneScrollView) {
          ((Frag2EmneScrollView) f).startRedigering();
          Brugervalg.instans.redigererNu = true;
          Brugervalg.instans.opdaterObservatører();
        } else {
          Snackbar.make(view, "Kun trin kan p.t. redigeres", Snackbar.LENGTH_LONG)
                  .setAction("Action", null).show();
        }
      }
    });

    Brugervalg.instans.tilføjOgKørObservatør(brugervalgtObservatør);
    kategorier.removeAllViews(); // sættes dynamisk i sætKategorier()
  }

  public void sætKategorier(ArrayList<Trin> trin) {
    kategorier.removeAllViews();
    for (Trin t : trin) {
      TextView katTv = (TextView) getLayoutInflater().inflate(R.layout.venstremenu_kategori, null, true);
      katTv.setText(t.navn);
      katTv.setCompoundDrawablesWithIntrinsicBounds(0, IkonTilDrawable.ikonTilDrawable.get(t.ikon), 0, 0);
      katTv.setOnClickListener(this);
      katTv.setBackgroundResource(IkonTilDrawable.ikonfarver.get(t.ikon));
      katTv.setOnTouchListener(farvKnapNårDenErTrykketNed);
      katTv.setTag(t);
      kategorier.addView(katTv);
    }
  }

  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    Log.d("onConfigurationChanged start");
    super.onConfigurationChanged(newConfig);
    Log.d("onConfigurationChanged slut 1");
    drawer.requestLayout();
    Log.d("onConfigurationChanged slut 2");
  }

  View.OnTouchListener farvKnapNårDenErTrykketNed = new View.OnTouchListener() {
    public boolean onTouch(View view, MotionEvent me) {
      Log.d("onTouch()", me.toString());
      TextView ib = (TextView) view;
      if (me.getAction() == MotionEvent.ACTION_DOWN) {
        ib.setAlpha(0.5f);
      } else if (me.getAction() == MotionEvent.ACTION_MOVE) {
      } else {
        ib.setAlpha(1);
      }
      return false;
    }
  };

  @Override
  protected void onDestroy() {
    Brugervalg.instans.observatører.remove(brugervalgtObservatør);
    super.onDestroy();
  }

  Runnable brugervalgtObservatør = new Runnable() {
    @Override
    public void run() {
      boolean synlig = Brugervalg.instans.redigeringstilstand && !Brugervalg.instans.redigererNu;
      final int vis = synlig ? View.VISIBLE : View.GONE;
      if (fab.getVisibility()==vis) return;
      fab.setVisibility(View.VISIBLE);
      fab.animate().alpha(synlig ? 1 : 0).setListener(new AnimatorListenerAdapter() {
        @Override
        public void onAnimationEnd(Animator animation) {
          fab.setVisibility(vis);
        }
      });
/*      navigationView.getMenu().findItem(R.id.redigeringstilstand).setTitle(
              Brugervalg.instans.redigeringstilstand ?
                      "Se som elev" : "Redigér som lærer");
                      */
    }
  };

  boolean førsteGang = true;
  @Override
  public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    if (førsteGang) {
      førsteGang = false;
      return;
    }
    Brugervalg.instans.hold = Brugervalg.instans.bru.holdListe[position];
    Brugervalg.instans.opdaterObservatører();
    drawer.closeDrawer(GravityCompat.START);
    if (App.fejlsøgning) App.kortToast("onItemSelected "+position);
    getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
  }

  @Override
  public void onNothingSelected(AdapterView<?> parent) {
  }

  @Override
  public void onClick(View v) {
    Log.d("klik "+v);
    drawer.closeDrawer(GravityCompat.START);
    navigationView.scrollTo(0,0); // rul op i toppen
    Trin trin = (Trin) v.getTag();
    if (trin!=null) {
      Fragment f = getSupportFragmentManager().findFragmentById(R.id.hovedakt_indhold);
      if (f instanceof Frag2EmneScrollView) {
        ((Frag2EmneScrollView) f).scrollTilKategori(trin);
      }
      return;
    }
    int id = v.getId();
    if (id == R.id.emner) {
      getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    } else if (id == R.id.log_ud) {
      Fb.firebaseRod.unauth();
      Fb.authData = null;
      finish();
      startActivity(new Intent(this, Login_akt.class));
    } else if (id == R.id.redigeringstilstand) {
      Brugervalg.instans.redigeringstilstand = !Brugervalg.instans.redigeringstilstand;
      App.prefs.edit().putBoolean("redigeringstilstand",Brugervalg.instans.redigeringstilstand).commit();
      Brugervalg.instans.opdaterObservatører();
    } else if (id == R.id.hent_ny_version) {
      startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(AppOpdatering.APK_URL)));
    } else if (id == R.id.nulstil_data) {
      App.instans.nulstilData();
    } else if (id == R.id.skift_navigation) {
      getSupportFragmentManager().beginTransaction()
              .replace(R.id.hovedakt_indhold, new SkraldNav2Frag2EmneHorisontalViewpager()).addToBackStack(null).commit();
    } else if (id == R.id.skift_navigation2) {
      startActivity(new Intent(this, SkraldHovedAkt.class));
    } else {
      //v.setAlpha(1); // hack fordi farvKnapNårDenErTrykketNed ikke altid slipper farven
      Snackbar.make(findViewById(R.id.hovedakt_indhold), "Emner med ¹ er ikke implementeret endnu", Snackbar.LENGTH_LONG).show();
    }

    drawer.closeDrawer(GravityCompat.START);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    System.out.println("onActivityResult AKT"+ requestCode + " gav resultat " + resultCode + " med data=" + data);
    super.onActivityResult(requestCode, resultCode, data);
    for (Fragment f : App.onActivityResultListe) f.onActivityResult(requestCode, resultCode, data);
  }

  public void opdaterErIGang() {
    //Log.d("erIgang XX="+(App.erIgang>0));
    progressBar.setVisibility(App.erIgang>0?View.VISIBLE:View.GONE);
  }

  @Override
  protected void onResume() {
    opdaterErIGang();
    App.instans.aktivitetStartet(this);
    super.onResume();
  }

  @Override
  protected void onPause() {
    App.instans.aktivitetStoppet(this);
    super.onPause();
  }

  public void visMenu() {
    drawer.openDrawer(GravityCompat.START);
  }
}
