package dk.lundogbendsen.vuc.fragtrin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.domæne.Trin;


public class TrinTekstFrag extends TrinFrag {
  static String TEKST = "TEKST";
  private EditText tekst;

  public static Fragment nytFragment(String tekst) {
    Fragment fragment = new TrinTekstFrag();
    Bundle args = new Bundle();
    args.putString(TrinTekstFrag.TEKST, tekst);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    View rod = inflater.inflate(R.layout.svar_tekst_frag, container, false);
    tekst = (EditText) rod.findViewById(R.id.tekst);
    tekst.setText(getArguments().getString(TEKST));

    return rod;
  }

  @Override
  public void opdaterBesvarelse(Trin trin) {
    trin.svar.tekst = tekst.getText().toString();
  }
}
