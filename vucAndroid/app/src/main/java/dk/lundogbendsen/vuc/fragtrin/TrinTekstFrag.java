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
  private EditText tekst;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    View rod = inflater.inflate(R.layout.svar_tekst_frag, container, false);
    tekst = (EditText) rod.findViewById(R.id.tekst);
    tekst.setText(trin.tekst);
    return rod;
  }

  @Override
  public void onDestroyView() {
    trin.tekst = tekst.getText().toString();
    //Observatører.ændret(trin):
    super.onDestroyView();
  }
}
