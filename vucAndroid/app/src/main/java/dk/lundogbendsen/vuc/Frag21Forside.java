package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import dk.lundogbendsen.vuc.domæne.Logik;
import dk.lundogbendsen.vuc.domæne.Valg;


public class Frag21Forside extends Fragment implements AbsListView.OnItemClickListener, View.OnClickListener {

    private ListView listView;

    private ListAdapter adapter;
    private Frag2ØvelseViewpager ejerFragment;
    private TextView overskrift;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rod = inflater.inflate(R.layout.frag2_s1_forside, container, false);

        adapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, Logik.i.valg.fag.emner);

        listView = (ListView) rod.findViewById(android.R.id.list);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(this);

        overskrift = (TextView) rod.findViewById(R.id.overskrift);
        overskrift.setText(Valg.i.emne.navn);

        rod.findViewById(R.id.start).setOnClickListener(this);
        ejerFragment = (Frag2ØvelseViewpager) getParentFragment();

        return rod;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        getFragmentManager().beginTransaction()
                .replace(R.id.hovedakt_indhold, new Frag2ØvelseViewpager()).addToBackStack(null).commit();
    }

    @Override
    public void onClick(View v) {
        ejerFragment.næste();
    }
}
