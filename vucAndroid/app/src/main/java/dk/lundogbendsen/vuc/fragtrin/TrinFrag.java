package dk.lundogbendsen.vuc.fragtrin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Trin;

/**
 * Created by j on 09-12-15.
 */
public abstract class TrinFrag extends Fragment {

  public static final String TRINID = Trin.class.getName();
  @Nullable
  public static Fragment nytFragment(Trin trin) {
    Fragment fragment = null;

    if (trin.ikon == Ikon.notesblok || trin.ikon == Ikon.pen_og_blyant) {
      fragment = new TrinTekstFrag();
    }

    if (trin.ikon == Ikon.kamera || trin.ikon == Ikon.foto) {
      fragment = new TrinBillederFrag();
    }
    if (fragment!=null) {
      Bundle args = new Bundle();
      args.putString(TRINID, trin.id);
      fragment.setArguments(args);
    }
    return fragment;
  }

  public Trin trin;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    String id = getArguments().getString(TRINID);
    trin = Trin.idref.get(id);
    if (trin==null) {
      trin = new Trin(Ikon.advarsel, "trin mangler for "+getArguments());
      Log.rapporterFejl(trin.navn);
    }
  }
}
