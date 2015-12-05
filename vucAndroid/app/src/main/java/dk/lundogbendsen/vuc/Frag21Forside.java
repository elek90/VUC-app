package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import dk.lundogbendsen.vuc.domæne.Brugervalg;


public class Frag21Forside extends Fragment implements AbsListView.OnItemClickListener, View.OnClickListener {
  private Frag2EmneViewpager ejerFragment;

  private TextView overskrift;

  private ListView listView;
  private ListAdapter adapter;
  private Button næste;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    ejerFragment = (Frag2EmneViewpager) getParentFragment();

    View rod = inflater.inflate(R.layout.frag2_s1_forside, container, false);

    overskrift = (TextView) rod.findViewById(R.id.overskrift);
    overskrift.setText(Brugervalg.instans.emne.navn);

    adapter = new ArrayAdapter(getActivity(),
            android.R.layout.simple_list_item_1, android.R.id.text1, Brugervalg.instans.emne.opgaver);

    listView = (ListView) rod.findViewById(android.R.id.list);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(this);


    næste = (Button) rod.findViewById(R.id.næste);
    næste.setOnClickListener(this);

    return rod;
  }


  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    ejerFragment.hopTilAktivitet(position);
  }

  @Override
  public void onClick(View v) {
    ejerFragment.næste();
  }
}
