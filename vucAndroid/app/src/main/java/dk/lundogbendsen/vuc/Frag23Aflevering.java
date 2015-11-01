package dk.lundogbendsen.vuc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import dk.lundogbendsen.vuc.Frag2ØvelseViewpager;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.domæne.Aktivitet;
import dk.lundogbendsen.vuc.domæne.Valg;


public class Frag23Aflevering extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    private Frag2ØvelseViewpager ejerFragment;
    private Aktivitet aktivitet;

    private TextView overskrift;

    private ListView listView;
    private ListAdapter adapter;
    private Button næste;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        aktivitet = (Aktivitet) getArguments().getSerializable(Frag22Aktivitet.AKTIVITET);
        ejerFragment = (Frag2ØvelseViewpager) getParentFragment();

        View rod = inflater.inflate(R.layout.frag2_s1_forside, container, false);
        overskrift = (TextView) rod.findViewById(R.id.overskrift);
        overskrift.setText(aktivitet.navn);

        adapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, Valg.i.emne.aktiviteter);

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
        ejerFragment.hopTilAktivitet(position);
    }
}
