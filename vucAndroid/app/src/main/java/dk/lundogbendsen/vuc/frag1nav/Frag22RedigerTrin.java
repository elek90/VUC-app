package dk.lundogbendsen.vuc.frag1nav;

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

import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.App;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Logik;
import dk.lundogbendsen.vuc.domæne.Trin;


public class Frag22RedigerTrin extends Fragment implements View.OnClickListener {
  static String TRIN = "TRIN";

  private Frag2EmneViewpager ejerFragment;
  public Trin trin;
  private ImageView billede;
  private YouTubeThumbnailView yttn;
  private AQuery aq;
  private Spinner spinner;
  private ArrayList<Ikon> ikoner;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    if (trin ==null) trin = (Trin) getArguments().getSerializable(TRIN);
    ejerFragment = (Frag2EmneViewpager) getParentFragment();

    View rod = inflater.inflate(R.layout.frag2_s2_trin_rediger, container, false);
    aq = new AQuery(rod);
    aq.id(R.id.næste).clicked(this);

    aq.id(R.id.overskrift).text(trin.navn);
    aq.id(R.id.trin_multimedie).text(trin.videoUrl);
    aq.id(R.id.tekst).text(trin.tekst);


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

      @Override
      public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getView(position, convertView, parent);
      }
    };


    spinner = aq.id(R.id.billede).getSpinner();
    //adapter.setDropDownViewResource(R.layout.ikon_listeelement);
    spinner.setAdapter(adapter);
    spinner.setSelection(ikoner.indexOf(trin.ikon));


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
    trin.navn = aq.id(R.id.overskrift).getText().toString();
    trin.tekst = aq.id(R.id.tekst).getText().toString();
    trin.videoUrl = aq.id(R.id.trin_multimedie).getText().toString();
    trin.ikon = (Ikon) spinner.getSelectedItem();
    App.instans.firebaseRefLogik.setValue(Logik.instans);
    App.kortToast("Data gemt");
    getFragmentManager().popBackStack();
  }

}
