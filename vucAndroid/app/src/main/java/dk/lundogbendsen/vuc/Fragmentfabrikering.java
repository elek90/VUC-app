package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import dk.lundogbendsen.vuc.domæne.Aflevering;
import dk.lundogbendsen.vuc.domæne.Opgave;

/**
 * Created by j on 01-11-15.
 */
public class Fragmentfabrikering {

  public static Fragment nytFragment(Opgave a) {
    Fragment fragment;
    if (a instanceof Aflevering) fragment = new Frag23Aflevering();
    else fragment = new Frag22Opgave();
    Bundle args = new Bundle();
    args.putSerializable(Frag22Opgave.OPGAVE, a);
    fragment.setArguments(args);
    return fragment;
  }
}
