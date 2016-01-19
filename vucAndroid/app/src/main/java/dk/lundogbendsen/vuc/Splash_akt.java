package dk.lundogbendsen.vuc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.androidquery.AQuery;

import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.nav2.HovedAkt;

public class Splash_akt extends Activity implements Runnable {

  static boolean velkomstVist = false;
  static Splash_akt aktivitetDerVisesNu = null;
  Handler handler = new Handler();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Log.d("Splash_akt: aktiviteten blev startet!");
    setContentView(R.layout.splash_akt);
    new AQuery(this).id(R.id.version).text(App.versionsnavn);

    aktivitetDerVisesNu = this;
    // Hvis savedInstanceState ikke er null er det en aktivitet der er ved at blive genstartet
    if (savedInstanceState == null) {
      if (velkomstVist) run(); else
      //handler.postDelayed(this, 2000); // <1> Kør run() om 3 sekunder
      Brugervalg.instans.observatører.add(this);
    }
    velkomstVist = true;
  }

  public void run() {
    if (!Fb.initialiseret) return; // Vent lidt længere.....
    Log.d("Splash_akt: Fb.initialiseret så vi kan gå videre...");
    if (Fb.firebaseBruger == null) { //  App.prefs.getString(BRUGERNAVN, null)==
      startActivity(new Intent(this, Login_akt.class));
    } else {
      startActivity(new Intent(this, HovedAkt.class));
    }
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    aktivitetDerVisesNu.finish();  // <2> Luk velkomsaktiviteten
    aktivitetDerVisesNu = null;
    Brugervalg.instans.observatører.remove(this);
  }

  /**
   * Kaldes hvis brugeren trykker på tilbage-knappen.
   * I så tilfælde skal vi ikke hoppe videre til næste aktivitet
   */
  @Override
  public void finish() {
    super.finish();
    handler.removeCallbacks(this);
  }
}