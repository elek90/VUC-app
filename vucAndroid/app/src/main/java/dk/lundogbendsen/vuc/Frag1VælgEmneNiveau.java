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

import dk.lundogbendsen.vuc.domæne.Logik;
import dk.lundogbendsen.vuc.domæne.Valg;


public class Frag1VælgEmneNiveau extends Fragment implements AbsListView.OnItemClickListener, Runnable {

    private ListView listView;

    private ListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rod = inflater.inflate(R.layout.frag1_vaelg_emne_niveau, container, false);
        Valg.i.observatører.add(this);

        listView = (ListView) rod.findViewById(android.R.id.list);
        listView.setOnItemClickListener(this);

        run();

        return rod;
    }

    @Override
    public void onDestroyView() {
        Valg.i.observatører.remove(this);
        super.onDestroyView();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Valg.i.emne = Valg.i.fag.emner[position];
        getFragmentManager().beginTransaction()
                .replace(R.id.hovedakt_indhold, new Frag2ØvelseViewpager()).addToBackStack(null).commit();
    }

    @Override
    public void run() {
        adapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, Valg.i.fag.emner);
        listView.setAdapter(adapter);
    }
}
