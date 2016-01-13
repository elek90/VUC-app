package dk.lundogbendsen.vuc.fragtrin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Log;


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
  public void onPause() {
    String t = tekst.getText().toString();
    if (!t.equals(trin.svar.tekst)) {
      trin.svar.tekst = t;
      trin.svar.ændretSkalGemmes = true;
    }
    super.onPause();
  }
}
