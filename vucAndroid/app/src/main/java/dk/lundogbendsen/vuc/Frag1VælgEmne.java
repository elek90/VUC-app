package dk.lundogbendsen.vuc;

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

import dk.lundogbendsen.vuc.domæne.Brugervalg;


public class Frag1VælgEmne extends Fragment implements AbsListView.OnItemClickListener, Runnable {

    private ListView listView;

    private ListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rod = inflater.inflate(R.layout.frag1_vaelg_emne_niveau, container, false);
        Brugervalg.instans.observatører.add(this);

        listView = (ListView) rod.findViewById(android.R.id.list);
        listView.setOnItemClickListener(this);

        run();

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
                .replace(R.id.hovedakt_indhold, new Frag2EmneViewpager()).addToBackStack(null).commit();
    }

    @Override
    public void run() {
        adapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, Brugervalg.instans.hold.emner);
        listView.setAdapter(adapter);
    }
}
