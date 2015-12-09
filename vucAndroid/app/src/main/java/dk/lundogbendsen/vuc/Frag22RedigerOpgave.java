package dk.lundogbendsen.vuc;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.androidquery.AQuery;
import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.ArrayList;

import dk.lundogbendsen.vuc.diverse.App;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Logik;
import dk.lundogbendsen.vuc.domæne.Opgave;


public class Frag22RedigerOpgave extends Fragment implements View.OnClickListener {
  static String OPGAVE = "OPGAVE";

  private Frag2EmneViewpager ejerFragment;
  public Opgave opgave;
  private ImageView billede;
  private YouTubeThumbnailView yttn;
  private AQuery aq;
  private Spinner spinner;
  private ArrayList<Ikon> ikoner;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    if (opgave==null) opgave = (Opgave) getArguments().getSerializable(OPGAVE);
    ejerFragment = (Frag2EmneViewpager) getParentFragment();

    View rod = inflater.inflate(R.layout.frag2_s2_rediger_opgave, container, false);
    aq = new AQuery(rod);
    aq.id(R.id.næste).clicked(this);

    aq.id(R.id.overskrift).text(opgave.navn);
    aq.id(R.id.opgave_multimedie).text(opgave.videoUrl);
    aq.id(R.id.tekst).text(opgave.tekst);


    ikoner = new ArrayList(IkonTilDrawable.ikonTilDrawable.keySet());

    ArrayAdapter adapter = new ArrayAdapter(getActivity(), R.layout.ikon_listeelement, R.id.listeelem_overskrift, ikoner) {

      @Override
      public View getView(int position, View cachedView, ViewGroup parent) {
        View view = super.getView(position, cachedView, parent);
        Ikon ikon = ikoner.get(position);

        ImageView billede = (ImageView) view.findViewById(R.id.listeelem_billede);
        billede.setImageResource(IkonTilDrawable.ikonTilDrawable.get(ikon));
        if (ikon == Ikon.advarsel) {
          billede.setImageResource(R.drawable.ta_status_dialog_warning);
          Log.d("IkonTilDrawable.ikonTilDrawable.get(ikon) "+IkonTilDrawable.ikonTilDrawable.get(ikon)+"  "+ikon);
        }

        return view;
      }
    };


    spinner = aq.id(R.id.billede).getSpinner();
    adapter.setDropDownViewResource(R.layout.ikon_listeelement);
    spinner.setAdapter(adapter);
    spinner.setSelection(ikoner.indexOf(opgave.ikon));


    Brugervalg.instans.redigererNu = true;
    Brugervalg.instans.opdaterObservatører();
    return rod;
  }

  @Override
  public void onDestroy() {
    Brugervalg.instans.redigererNu = false;
    Brugervalg.instans.opdaterObservatører();
    super.onDestroy();
  }

  @Override
  public void onClick(View v) {
    opgave.navn = aq.id(R.id.overskrift).getText().toString();
    opgave.tekst = aq.id(R.id.tekst).getText().toString();
    opgave.videoUrl = aq.id(R.id.opgave_multimedie).getText().toString();
    opgave.ikon = (Ikon) spinner.getSelectedItem();
    App.kortToast("Data gemt");
    App.instans.firebaseRefLogik.setValue(Logik.instans);
    getFragmentManager().popBackStack();
  }

}
