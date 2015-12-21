package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import dk.lundogbendsen.vuc.domæne.Aflevering;
import dk.lundogbendsen.vuc.domæne.Trin;

/**
 * Created by j on 01-11-15.
 */
public class Fragmentfabrikering {

  public static Fragment nytFragment(Trin opg, boolean sidste) {
    Fragment fragment;
    if (opg instanceof Aflevering || sidste) fragment = new Frag23Aflevering();
    else {
      Frag22Trin f = new Frag22Trin();
      f.trin = opg;
      fragment = f;
    }
    Bundle args = new Bundle();
    args.putSerializable(Frag22Trin.TRIN, opg);
    fragment.setArguments(args);
    return fragment;
  }
}
