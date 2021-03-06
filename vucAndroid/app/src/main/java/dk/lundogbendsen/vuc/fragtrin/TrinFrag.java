package dk.lundogbendsen.vuc.fragtrin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import java.util.HashMap;

import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Trin;

/**
 * Repræsenterer alle de trin, som brugeren kan/skal besvare
 * Created by j on 09-12-15.
 */
public abstract class TrinFrag extends Fragment {
  public static final HashMap<Ikon,Class<? extends TrinFrag>> ikonTilTrinFrag = new HashMap<>();
  static {
    ikonTilTrinFrag.put(Ikon.notesblok, TrinTekstFrag.class);
    ikonTilTrinFrag.put(Ikon.pen_og_blyant, TrinTekstFrag.class);
    ikonTilTrinFrag.put(Ikon.kamera, TrinBillederFrag.class);
    ikonTilTrinFrag.put(Ikon.foto, TrinBillederFrag.class);
    ikonTilTrinFrag.put(Ikon.notesblok, TrinTekstFrag.class);
    ikonTilTrinFrag.put(Ikon.skriv__uden_ikon, TrinTekstFrag.class);
  }

  public static final String TRINID = Trin.class.getName();
  @Nullable
  public static Fragment nytFragment(Trin trin) {
    Fragment fragment = null;

    Class<? extends TrinFrag> fragmenttype = ikonTilTrinFrag.get(trin.ikon);
    if (fragmenttype!=null) try {
      fragment = fragmenttype.newInstance();
    } catch (Exception e) { Log.rapporterFejl(e); }

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
      trin = new Trin(Ikon.advarsel, "trin mangler for "+id+" "+getArguments());
      Log.rapporterFejl(trin.navn);
    }
  }

  @Override
  public String toString() {
    return trin.id + " " + super.toString();
  }
}
