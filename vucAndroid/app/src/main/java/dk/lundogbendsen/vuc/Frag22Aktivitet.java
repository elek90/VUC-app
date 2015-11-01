package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.TextView;

import dk.lundogbendsen.vuc.domæne.Aktivitet;
import dk.lundogbendsen.vuc.domæne.Valg;


public class Frag22Aktivitet extends Fragment implements View.OnClickListener {
    static String AKTIVITET = "AKTIVITET";

    private Frag2ØvelseViewpager ejerFragment;
    private TextView overskrift;
    private Aktivitet aktivitet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        aktivitet = (Aktivitet) getArguments().getSerializable(AKTIVITET);

        View rod = inflater.inflate(R.layout.frag2_s2_aktivitet, container, false);
        overskrift = (TextView) rod.findViewById(R.id.overskrift);
        overskrift.setText(aktivitet.navn);

        rod.findViewById(R.id.næste).setOnClickListener(this);
        ejerFragment = (Frag2ØvelseViewpager) getParentFragment();

        return rod;
    }


    @Override
    public void onClick(View v) {
        ejerFragment.næste();
    }
}
