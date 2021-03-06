package dk.lundogbendsen.vuc.nav2;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import dk.lundogbendsen.vuc.domæne.Aflevering;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;

/**
 * Created by j on 01-11-15.
 */
public class Fragmentfabrikering {

  public static Fragment nytFragment(Trin trin, boolean sidste) {
    Fragment fragment;
    if (trin instanceof Aflevering || sidste) fragment = new Frag23Send();
    else if (trin.ikon.type == Ikon.Type.kategori) {
      fragment = new Frag22Kategori();
    } else {
      Frag22Trin f = new Frag22Trin();
      f.trin = trin;
      fragment = f;
    }
    Bundle args = new Bundle();
    args.putSerializable(TrinFrag.TRINID, trin.id);
    fragment.setArguments(args);
    return fragment;
  }
}
