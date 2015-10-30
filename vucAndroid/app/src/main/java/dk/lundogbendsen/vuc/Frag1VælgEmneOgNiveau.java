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


public class Frag1VælgEmneOgNiveau extends Fragment implements AbsListView.OnItemClickListener {

    private ListView listView;

    private ListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1_vaelg_emne_og_niveau, container, false);

        adapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, Logik.i.bru.fag.emner);

        listView = (ListView) view.findViewById(android.R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        getFragmentManager().beginTransaction()
                .replace(R.id.hovedakt_indhold, new Frag2ØvelseViewpager()).addToBackStack(null).commit();
    }

}
