package dk.lundogbendsen.vuc.skrald.nav1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.util.ArrayList;
import java.util.Arrays;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Trin;


public class SkraldFrag21Forside extends Fragment implements AbsListView.OnItemClickListener, View.OnClickListener, Runnable {
  private SkraldFrag2EmneViewpager ejerFragment;

  private TextView overskrift;

  private ListView listView;
  private BaseAdapter adapter;
  private Button næste;
  private ArrayList<Trin> liste;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    ejerFragment = (SkraldFrag2EmneViewpager) getParentFragment();

    View rod = inflater.inflate(R.layout.skrald_frag2_s1_forside, container, false);

    overskrift = (TextView) rod.findViewById(R.id.overskrift);
    overskrift.setText(Brugervalg.instans.emne.navn);

    liste = new ArrayList<Trin>(Arrays.asList(Brugervalg.instans.emne.trin));
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
        if (v==null) v = inflater.inflate(R.layout.skrald_frag2_s1_forside_elem, null);
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

    Brugervalg.instans.observatører.add(this);
    return rod;
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    Brugervalg.instans.observatører.remove(this);
  }

  @Override
  public void run() {
    liste = new ArrayList<Trin>(Arrays.asList(Brugervalg.instans.emne.trin));
    adapter.notifyDataSetChanged();
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    ejerFragment.hopTilEmne(position);
  }

  @Override
  public void onClick(View v) {
    ejerFragment.næste();
  }
}
