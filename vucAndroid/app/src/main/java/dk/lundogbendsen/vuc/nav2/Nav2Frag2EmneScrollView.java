package dk.lundogbendsen.vuc.nav2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.Arrays;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.frag1nav.Frag21Forside;
import dk.lundogbendsen.vuc.frag1nav.Fragmentfabrikering;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;

public class Nav2Frag2EmneScrollView extends Fragment {

  private LinearLayout viewPager;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View rod = inflater.inflate(R.layout.nav2_frag2_emne_scrollview, container, false);
    viewPager = (LinearLayout) rod.findViewById(R.id.viewpager);
    FragmentManager fm = getChildFragmentManager();
    for (int n=0; n<Brugervalg.instans.emne.trin.length; n++) {
      Trin t = Brugervalg.instans.emne.trin[n];
      Fragment f = Nav2Fragmentfabrikering.nytFragment(t, n==Brugervalg.instans.emne.trin.length-1);
      fm.beginTransaction().add(R.id.viewpager, f, "frag_trin_"+t.id).commit();
      fm.executePendingTransactions();
    }
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
/*
  public void næste() {
    int i = viewPager.getCurrentItem();
    viewPager.setCurrentItem(i + 1, true);
  }

  public void hopTilEmne(int position) {
    viewPager.setCurrentItem(position + 1, true);
  }*/
}
