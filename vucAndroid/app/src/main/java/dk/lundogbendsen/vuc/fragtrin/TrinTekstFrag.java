package dk.lundogbendsen.vuc.fragtrin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Trin;


public class TrinTekstFrag extends TrinFrag {
  private EditText tekst;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    Log.d("onCreateView "+this);

    View rod = inflater.inflate(R.layout.svar_tekst_frag, container, false);
    tekst = (EditText) rod.findViewById(R.id.tekst);
    tekst.setText(trin.svar.tekst);
    return rod;
  }

  @Override
  public void onDestroyView() {
    Log.d("onDestroyView "+this);
    String t = tekst.getText().toString();
    if (!t.equals(trin.svar.tekst)) {
      trin.svar.tekst = t;
      trin.svar.ændretSkalGemmes = true;
    }
    //Observatører.ændret(trin):
    super.onDestroyView();
  }
}
