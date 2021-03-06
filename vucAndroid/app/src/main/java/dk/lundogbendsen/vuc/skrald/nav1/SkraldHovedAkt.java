package dk.lundogbendsen.vuc.skrald.nav1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.AppOpdatering;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.nav2.Frag22RedigerTrin;

public class SkraldHovedAkt extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

  private DrawerLayout drawer;
  private FloatingActionButton fab;
  private NavigationView navigationView;
  private ProgressBar progressBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.skrald_hoved_akt);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    progressBar = (ProgressBar) findViewById(R.id.progressBar);

    navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);


    drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    final FrameLayout frame = (FrameLayout) findViewById(R.id.hovedakt_indhold);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.setDrawerListener(toggle);
    toggle.syncState();

    View headerView = navigationView.inflateHeaderView(R.layout.skrald_venstremenu_top);
    /*
    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, android.R.id.text1, Brugervalg.instans.bru.holdListe);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    Spinner spinner = (Spinner) headerView.findViewById(R.id.fag);
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(this);
    */
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
              .add(R.id.hovedakt_indhold, new SkraldFrag1VælgEmne()).commit();
    }

    fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (App.synligtFragment instanceof SkraldFrag22Trin) {
          Frag22RedigerTrin f2 = new Frag22RedigerTrin();
          f2.setArguments(App.synligtFragment.getArguments());
          getSupportFragmentManager().beginTransaction()
                  .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right)
                  .replace(R.id.hovedakt_indhold, f2)
                  .addToBackStack(null).commit();
          return;
        }
        Snackbar.make(view, "Kun trin kan p.t. redigeres", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
      }
    });

    Brugervalg.instans.tilføjOgKørObservatør(brugervalgtObservatør);
  }

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
      //fab.setVisibility(Brugervalg.instans.redigeringstilstand ? View.VISIBLE : View.GONE);
      navigationView.getMenu().findItem(R.id.redigeringstilstand).setTitle(
              Brugervalg.instans.redigeringstilstand ?
                      "Se som elev" : "Redigér som lærer");
    }
  };

  /*
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
  */

  @Override
  public void onBackPressed() {
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.emner) {
      getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    } else if (id == R.id.redigeringstilstand) {
      Brugervalg.instans.redigeringstilstand = !Brugervalg.instans.redigeringstilstand;
      App.prefs.edit().putBoolean("redigeringstilstand",Brugervalg.instans.redigeringstilstand).commit();
      Brugervalg.instans.opdaterObservatører();
    } else if (id == R.id.hent_ny_version) {
      startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(AppOpdatering.APK_URL)));
    } else if (id == R.id.nulstil_data) {
      App.instans.nulstilData();
    } else {
      Snackbar.make(findViewById(R.id.hovedakt_indhold), "Emner med ¹ er ikke implementeret endnu", Snackbar.LENGTH_LONG).show();
    }

    drawer.closeDrawer(GravityCompat.START);
    return true;
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
}
