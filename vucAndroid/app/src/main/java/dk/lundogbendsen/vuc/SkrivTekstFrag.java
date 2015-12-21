package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import dk.lundogbendsen.vuc.domæne.Trin;


public class SkrivTekstFrag extends SvarFrag {
  static String TEKST = "TEKST";
  private EditText tekst;

  public static Fragment nytFragment(String tekst) {
    Fragment fragment = new SkrivTekstFrag();
    Bundle args = new Bundle();
    args.putString(SkrivTekstFrag.TEKST, tekst);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    View rod = inflater.inflate(R.layout.skriv_tekst_frag, container, false);
    tekst = (EditText) rod.findViewById(R.id.tekst);
    tekst.setText(getArguments().getString(TEKST));

    return rod;
  }

  @Override
  public void opdaterBesvarelse(Trin trin) {
    trin.svar.tekst = tekst.getText().toString();
  }
}
