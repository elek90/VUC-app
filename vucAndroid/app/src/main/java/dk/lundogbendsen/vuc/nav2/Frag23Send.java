package dk.lundogbendsen.vuc.nav2;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;


public class Frag23Send extends TrinFrag implements View.OnClickListener {


  private AQuery aq;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    View rod = inflater.inflate(R.layout.frag2_s2_send, container, false);
    rod.setTag(this);
    aq = new AQuery(rod);
    aq.id(R.id.send).clicked(this);

    aq.id(R.id.overskrift).text(trin.navn);
    Integer resId = IkonTilDrawable.ikonTilDrawable.get(trin.ikon);
    if (resId != null) aq.id(R.id.billede).image(resId);
    else aq.id(R.id.billede).gone();

    aq.id(R.id.tekst).text(trin.tekst).visibility(aq.getText().length()>0?View.VISIBLE:View.GONE);
    Linkify.addLinks(aq.getTextView(), Linkify.ALL);
    return rod;
  }

  @Override
  public void onClick(View v) {
    getActivity().getSupportFragmentManager().beginTransaction()
            .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right)
            .replace(R.id.hovedakt_indhold, new Frag3Aflevering())
            .addToBackStack(null)
            .commit();
  }
}
