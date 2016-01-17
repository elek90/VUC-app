package dk.lundogbendsen.vuc.skrald.nav1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.util.ArrayList;
import java.util.Arrays;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Emne;
import dk.lundogbendsen.vuc.domæne.Optagelse;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;
import dk.lundogbendsen.vuc.skrald.SkraldNav2Frag2EmneHorisontalViewpager;


public class SkraldFrag23Aflevering extends TrinFrag implements View.OnClickListener, AdapterView.OnItemClickListener {

  private TextView overskrift;

  private ListView listView;
  private ListAdapter adapter;
  private Button næste;
  private ArrayList<Trin> liste;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    View rod = inflater.inflate(R.layout.skrald_frag2_s1_forside, container, false);
    rod.setTag(this);
    overskrift = (TextView) rod.findViewById(R.id.overskrift);
    overskrift.setText(trin.navn);

    liste = new ArrayList<Trin>(Arrays.asList(Brugervalg.instans.emne.trin));
    liste.remove(trin);
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
    næste.setText("Aflevér");

    return rod;
  }


  @NonNull
  public static String lavEmail(Emne e) {
    StringBuilder sb = new StringBuilder();
    sb.append("Besvarelse af "+e.navn+"\n\n");
    int antal=0, besv=0;
    for (Trin t : e.trin) {
      if (!TrinFrag.ikonTilFragment.containsKey(t.ikon)) continue;
      antal++;
      sb.append("Svar "+antal+": "+t.navn+":\n");
      if (t.svar!=null && t.svar.harIndhold()) {
        if (t.svar.tekst!=null && t.svar.tekst.length()>0) sb.append(t.svar.tekst+"\n");
        if (t.svar.optagelser!=null) for (Optagelse o:t.svar.optagelser) {
          sb.append(o.url+"\n");
          if (o.tekst!=null && o.tekst.length()>0) sb.append(o.tekst+"\n");
        }
        besv++;
      } else {
        sb.append("mangler");
      }
    }
    return sb.toString();
  }


  @Override
  public void onClick(View v) {
    Intent i = new Intent(Intent.ACTION_SEND);
    i.setType("message/rfc822");
    i.putExtra(Intent.EXTRA_EMAIL, new String[]{"nordfalk@lundogbendsen.dk"});
    i.putExtra(Intent.EXTRA_CC, new String[]{"nordfalk@lundogbendsen.dk"});
    String tekst = lavEmail(Brugervalg.instans.emne);
    i.putExtra(Intent.EXTRA_SUBJECT, tekst.split("\n")[0]);
    i.putExtra(Intent.EXTRA_TEXT, tekst);
    Log.d(tekst);
//        i.putExtra(Intent.EXTRA_STREAM, MinProvider.URI);

    startActivity(Intent.createChooser(i, "Send e-post..."));
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    Fragment ejerFragment = getParentFragment();
    if (ejerFragment instanceof SkraldFrag2EmneViewpager) ((SkraldFrag2EmneViewpager) ejerFragment).hopTilEmne(position);;
    if (ejerFragment instanceof SkraldNav2Frag2EmneHorisontalViewpager) ((SkraldNav2Frag2EmneHorisontalViewpager) ejerFragment).hopTilEmne(position);;
  }
}
