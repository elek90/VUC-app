package dk.lundogbendsen.vuc.skrald;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.Arrays;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.skrald.nav1.Frag21Forside;
import dk.lundogbendsen.vuc.skrald.nav1.Fragmentfabrikering;
import fr.castorflex.android.verticalviewpager.VerticalViewPager;

public class Nav2Frag2EmneHorisontalViewpager extends Fragment {

  /**
   * The {@link ViewPager} that will host the section contents.
   */
  private VerticalViewPager viewPager;
  private ArrayList faner;
  private PagerSlidingTabStrip pagerSlidingTabStrip;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    faner = new ArrayList();
    faner.addAll(Arrays.asList(Brugervalg.instans.emne.trin));

    View rod = inflater.inflate(R.layout.nav2_frag2_emne_viewpager, container, false);
    viewPager = (VerticalViewPager) rod.findViewById(R.id.viewpager);
    viewPager.setAdapter(new FaneAdapter(getChildFragmentManager()));
    Fb.indlæsSvarForEmne(Brugervalg.instans.bru, Brugervalg.instans.emne, new Runnable() {
      @Override
      public void run() {
        viewPager.getAdapter().notifyDataSetChanged();
        if (App.opstartTest) {
          App.opstartTest = false;
          viewPager.setCurrentItem(8);
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

  public void næste() {
    int i = viewPager.getCurrentItem();
    viewPager.setCurrentItem(i + 1, true);
  }

  public void hopTilEmne(int position) {
    viewPager.setCurrentItem(position + 1, true);
  }

  public class FaneAdapter extends FragmentPagerAdapter {

    public FaneAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override
    public Fragment getItem(int position) {
      Object f = faner.get(position);
      if (f instanceof Fragment) return (Fragment) f;
      if (f instanceof Trin) return Fragmentfabrikering.nytFragment((Trin) f, position==getCount()-1);
      return new Frag21Forside(); // fejl
    }

    @Override
    public int getCount() {
      return faner.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
      if (position == 0) return "Oversigt";
      Object f = faner.get(position);
      if (f instanceof Trin) return ((Trin) f).navn;
      return "??" + position;
    }
  }
}
