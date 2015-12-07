package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import dk.lundogbendsen.vuc.domæne.Aflevering;
import dk.lundogbendsen.vuc.domæne.Opgave;

/**
 * Created by j on 01-11-15.
 */
public class Fragmentfabrikering {

  public static Fragment nytFragment(Opgave opg) {
    Fragment fragment;
    if (opg instanceof Aflevering) fragment = new Frag23Aflevering();
    else {
      Frag22Opgave f = new Frag22Opgave();
      f.opgave = opg;
      fragment = f;
    }
    Bundle args = new Bundle();
    args.putSerializable(Frag22Opgave.OPGAVE, opg);
    fragment.setArguments(args);
    return fragment;
  }
}
