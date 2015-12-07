package dk.lundogbendsen.vuc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class Splash_akt extends Activity implements Runnable {

  static Splash_akt aktivitetDerVisesNu = null;
  Handler handler = new Handler();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Log.d("Splash_akt", "aktiviteten blev startet!");
    setContentView(R.layout.splash_akt);

    // Hvis savedInstanceState ikke er null er det en aktivitet der er ved at blive genstartet
    if (savedInstanceState == null) {
      handler.postDelayed(this, 3000); // <1> Kør run() om 3 sekunder
    }
    aktivitetDerVisesNu = this;
  }

  public void run() {
    startActivity(new Intent(this, HovedAkt.class));
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