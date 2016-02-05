package dk.lundogbendsen.vuc.nav2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.androidquery.AQuery;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Emne;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;


public class Frag1VælgEmne extends Fragment implements AbsListView.OnItemClickListener, Runnable, View.OnClickListener {

  private ListView listView;

  private ArrayAdapter adapter;
  public static final String INDLÆSER = "Indlæser...";
  public static final String EJ_BEGYNDT = "ikke begyndt";
  public static final String FÆRDIG = "færdig";
  private AQuery aq;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View rod = inflater.inflate(R.layout.frag1_vaelg_emne, container, false);

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
    for (final Emne e : Brugervalg.instans.hold.emner) {
      e.tmpData = INDLÆSER;
      Fb.indlæsSvarForEmne(Brugervalg.instans.bru, e, new Runnable() {
        @Override
        public void run() {
          e.tmpData = findStatus(e);
          adapter.notifyDataSetChanged();
        }
      });
    }
    aq = new AQuery(rod);
    rod.findViewById(R.id.tilføj_nyt_emne).setOnClickListener(this);
    return rod;
  }

  @NonNull
  public static String findStatus(Emne e) {
    int antal=0, besv=0;
    for (Trin t : e.trin) {
      if (!TrinFrag.ikonTilTrinFrag.containsKey(t.ikon)) continue;
      antal++;
      if (t.svar!=null && t.svar.harIndhold()) besv++;
    }
    String status = EJ_BEGYNDT;
    if (besv==0) status = EJ_BEGYNDT;
    else if (besv==antal) status = FÆRDIG;
    else status = besv+" af "+antal+" besvaret";
    return status;
  }


  @Override
  public void onDestroyView() {
    Brugervalg.instans.observatører.remove(this);
    super.onDestroyView();
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    Brugervalg.instans.emne = Brugervalg.instans.hold.emner[position];
    Fb.indlæsSvarForEmne(Brugervalg.instans.bru, Brugervalg.instans.emne, new Runnable() {
      @Override
      public void run() {
        getFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right)
                .replace(R.id.hovedakt_indhold, new Frag2EmneScrollView()).addToBackStack(null).commit();
      }
    });
  }

  @Override
  public void run() {
    adapter = new ArrayAdapter(getActivity(),
            R.layout.frag1_vaelg_emne_elem, R.id.tekst, Brugervalg.instans.hold.emner) {
      @Override
      public View getView(int position, View convertView, ViewGroup parent) {
        View rod = super.getView(position, convertView, parent);
        Log.d("Brugervalg.instans.hold.emner[position]="+Brugervalg.instans.hold.emner[position]);
        Emne e = Brugervalg.instans.hold.emner[position];
        String beskrivelse = e==null?"(fejl - e==null)":e.tmpData;
        new AQuery(rod)
                .id(R.id.beskrivelse).text(beskrivelse)
                .id(R.id.tekst).getTextView().setCompoundDrawablesWithIntrinsicBounds(0,0,
                beskrivelse==FÆRDIG?R.drawable.oi_actions_dialog_yes:0
                ,0);
        return rod;
      }
    };
    listView.setAdapter(adapter);
  }

  @Override
  public void onClick(View v) {
    String emnekode = aq.id(R.id.emnekode).getText().toString();
    Log.d("Fb.firebaseBruger ?= " + Fb.firebaseBruger);
    Fb.firebaseBruger.child("emner").child(emnekode).setValue("1");
    App.langToast("Ikke implementeret endnu");
  }
}
