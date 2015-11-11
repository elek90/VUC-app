package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import dk.lundogbendsen.vuc.domæne.Aktivitet;


public class Frag22Aktivitet extends Fragment implements View.OnClickListener {
    static String AKTIVITET = "AKTIVITET";

    private Frag2EmneViewpager ejerFragment;
    private TextView overskrift;
    private Aktivitet aktivitet;
    private ImageView billede;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        aktivitet = (Aktivitet) getArguments().getSerializable(AKTIVITET);

        View rod = inflater.inflate(R.layout.frag2_s2_aktivitet, container, false);
        overskrift = (TextView) rod.findViewById(R.id.overskrift);
        overskrift.setText(aktivitet.navn);

        billede = (ImageView) rod.findViewById(R.id.billede);
        Integer resId = IkonTilDrawable.ikonTilDrawable.get(aktivitet.ikon);
        if (resId!=null) billede.setImageResource(resId);
        //else billede.setVisibility(View.GONE);

        rod.findViewById(R.id.næste).setOnClickListener(this);
        ejerFragment = (Frag2EmneViewpager) getParentFragment();

        return rod;
    }


    @Override
    public void onClick(View v) {
        ejerFragment.næste();
    }
}
