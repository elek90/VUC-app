package dk.lundogbendsen.vuc.fragtrin;

import android.support.v4.app.Fragment;

import dk.lundogbendsen.vuc.domæne.Trin;

/**
 * Created by j on 09-12-15.
 */
public abstract class TrinFrag extends Fragment {

  public Trin trin;

  public abstract void opdaterBesvarelse(Trin trin);
}
