package dk.lundogbendsen.vuc.nav2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;

public class Nav2Frag2EmneScrollView extends Fragment {

  private LinearLayout viewPager;
  private LinkedHashMap<Trin, Integer> kategorier;
  private ScrollView scrollView;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View rod = inflater.inflate(R.layout.nav2_frag2_emne_scrollview, container, false);
    viewPager = (LinearLayout) rod.findViewById(R.id.viewpager);
    scrollView = (ScrollView) rod.findViewById(R.id.scrollView);
    FragmentManager fm = getChildFragmentManager();
    kategorier = new LinkedHashMap<Trin,Integer>();
    for (int n=0; n<Brugervalg.instans.emne.trin.length; n++) {
      Trin t = Brugervalg.instans.emne.trin[n];
      if (t.ikon.type == Ikon.Type.kategori) {
        kategorier.put(t, n);
      }
      if (savedInstanceState==null) {
        Fragment f = Nav2Fragmentfabrikering.nytFragment(t, n == Brugervalg.instans.emne.trin.length - 1);
        fm.beginTransaction().add(R.id.viewpager, f, "frag_trin_" + t.id).commit();
        fm.executePendingTransactions();
      }
    }
    ((Nav2HovedAkt) getActivity()).sætKategorier(new ArrayList<>(kategorier.keySet()));
    App.forgrundstråd.post(new Runnable() {
      @Override
      public void run() {
        Log.d("viewPager.getChildCount() = "+viewPager.getChildCount());
        for (int n = 0; n<viewPager.getChildCount(); n++) {
          Log.d("viewPager.getChild() = "+viewPager.getChildAt(n).getTag());
        }
      }
    });
    return rod;
  }

  @Override
  public void onPause() {
    Fb.gemSvarForEmne(Brugervalg.instans.bru, Brugervalg.instans.emne);
    super.onPause();
  }

  public void scrollTilKategori(Trin trin) {
    int n = kategorier.get(trin);
    View fokusView = viewPager.getChildAt(n);
    scrollView.smoothScrollTo(0, fokusView.getTop());
//    scrollView.requestChildFocus(fokusView, fokusView);
  }
/*
  public void næste() {
    int i = viewPager.getCurrentItem();
    viewPager.setCurrentItem(i + 1, true);
  }

  public void hopTilEmne(int position) {
    viewPager.setCurrentItem(position + 1, true);
  }*/
}
