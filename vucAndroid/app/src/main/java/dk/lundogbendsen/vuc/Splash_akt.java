package dk.lundogbendsen.vuc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.androidquery.AQuery;

import dk.lundogbendsen.vuc.nav2.HovedAkt2;

public class Splash_akt extends Activity implements Runnable {

  static Splash_akt aktivitetDerVisesNu = null;
  Handler handler = new Handler();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Log.d("Splash_akt", "aktiviteten blev startet!");
    setContentView(R.layout.splash_akt);
    new AQuery(this).id(R.id.version).text(App.versionsnavn);

    aktivitetDerVisesNu = this;
    if (App.opstartTest) run(); else
    // Hvis savedInstanceState ikke er null er det en aktivitet der er ved at blive genstartet
    if (savedInstanceState == null) {
      handler.postDelayed(this, 2000); // <1> Kør run() om 3 sekunder
    }
  }

  public void run() {
    startActivity(new Intent(this, HovedAkt2.class));
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    aktivitetDerVisesNu.finish();  // <2> Luk velkomsaktiviteten
    aktivitetDerVisesNu = null;
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