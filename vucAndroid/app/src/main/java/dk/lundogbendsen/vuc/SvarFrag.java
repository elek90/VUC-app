package dk.lundogbendsen.vuc;

import android.support.v4.app.Fragment;

import dk.lundogbendsen.vuc.domæne.Opgave;
import dk.lundogbendsen.vuc.domæne.Svar;

/**
 * Created by j on 09-12-15.
 */
public abstract class SvarFrag extends Fragment {

  public Opgave opgave;

  public abstract void opdaterBesvarelse(Opgave opgave);
}
