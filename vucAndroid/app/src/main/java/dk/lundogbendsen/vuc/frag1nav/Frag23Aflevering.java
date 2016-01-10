package dk.lundogbendsen.vuc.frag1nav;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.util.ArrayList;
import java.util.Arrays;

import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;


public class Frag23Aflevering extends TrinFrag implements View.OnClickListener, AdapterView.OnItemClickListener {
  private Frag2EmneViewpager ejerFragment;

  private TextView overskrift;

  private ListView listView;
  private ListAdapter adapter;
  private Button næste;
  private ArrayList<Trin> liste;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    ejerFragment = (Frag2EmneViewpager) getParentFragment();

    View rod = inflater.inflate(R.layout.frag2_s1_forside, container, false);
    overskrift = (TextView) rod.findViewById(R.id.overskrift);
    overskrift.setText(trin.navn);

    liste = new ArrayList<Trin>(Arrays.asList(Brugervalg.instans.emne.trin));
    liste.remove(trin);
    adapter = new BaseAdapter() {
      @Override
      public int getCount() {
        return liste.size();
      }

      @Override
      public Object getItem(int position) {
        return null;
      }

      @Override
      public long getItemId(int position) {
        return 0;
      }

      LayoutInflater inflater = getActivity().getLayoutInflater();
      @Override
      public View getView(int position, View v, ViewGroup parent) {
        if (v==null) v = inflater.inflate(R.layout.frag2_s1_forside_elem, null);
        AQuery aq = new AQuery(v);
        Trin trin = liste.get(position);
        aq.id(R.id.ikon).image(IkonTilDrawable.ikonTilDrawable.get(trin.ikon));
        aq.id(R.id.tekst).text(trin.navn);
        aq.id(R.id.status).visibility(trin.udført?View.VISIBLE:View.GONE);

        return v;
      }
    };

    listView = (ListView) rod.findViewById(android.R.id.list);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(this);

    næste = (Button) rod.findViewById(R.id.næste);
    næste.setOnClickListener(this);
    næste.setText("Aflevér");

    return rod;
  }


  @Override
  public void onClick(View v) {
    Intent i = new Intent(Intent.ACTION_SEND);
    i.setType("message/rfc822");
    i.putExtra(Intent.EXTRA_EMAIL, new String[]{"jacob.nordfalk@gmail.com"});
    i.putExtra(Intent.EXTRA_CC, new String[]{"jacob.nordfalk@gmail.com"});
    i.putExtra(Intent.EXTRA_SUBJECT, "Et billede fra AndroidElementer");
    i.putExtra(Intent.EXTRA_TEXT, "Her er et billede");
//        i.putExtra(Intent.EXTRA_STREAM, MinProvider.URI);

    startActivity(Intent.createChooser(i, "Send e-post..."));
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    ejerFragment.hopTilEmne(position);
  }
}
