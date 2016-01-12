package dk.lundogbendsen.vuc.frag1nav;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.domæne.Brugervalg;


public class Frag1VælgEmne extends Fragment implements AbsListView.OnItemClickListener, Runnable {

  private ListView listView;

  private ListAdapter adapter;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View rod = inflater.inflate(R.layout.frag1_vaelg_emne_niveau, container, false);

    listView = (ListView) rod.findViewById(android.R.id.list);
    listView.setOnItemClickListener(this);


    Brugervalg.instans.observatører.add(this);
    run();
    if (App.opstartTest) Brugervalg.instans.observatører.add(new Runnable() {
      @Override
      public void run() {
        if (getActivity()!=null) onItemClick(null, null, 0, 0);
        Brugervalg.instans.observatører.remove(this);
      }
    });
    return rod;
  }

  @Override
  public void onDestroyView() {
    Brugervalg.instans.observatører.remove(this);
    super.onDestroyView();
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    Brugervalg.instans.emne = Brugervalg.instans.hold.emner[position];
    getFragmentManager().beginTransaction()
            .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right)
            .replace(R.id.hovedakt_indhold, new Frag2EmneViewpager()).addToBackStack(null).commit();
  }

  @Override
  public void run() {
    adapter = new ArrayAdapter(getActivity(),
            android.R.layout.simple_list_item_1, android.R.id.text1, Brugervalg.instans.hold.emner);
    listView.setAdapter(adapter);
  }
}
