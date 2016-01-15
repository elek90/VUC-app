package dk.lundogbendsen.vuc.nav2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;


public class Frag22Kategori extends TrinFrag {

  private AQuery aq;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    View rod = inflater.inflate(R.layout.frag2_s2_kategori, container, false);
    rod.setTag(this);
    aq = new AQuery(rod);

    aq.id(R.id.overskrift).text(trin.navn);
    Integer resId = IkonTilDrawable.ikonTilDrawable.get(trin.ikon);
    aq.id(R.id.billede).image(resId);

    rod.setBackgroundResource(IkonTilDrawable.ikonfarver.get(trin.ikon));

    return rod;
  }
}
