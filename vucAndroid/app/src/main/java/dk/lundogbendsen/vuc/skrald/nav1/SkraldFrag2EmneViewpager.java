package dk.lundogbendsen.vuc.skrald.nav1;

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

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;

public class SkraldFrag2EmneViewpager extends Fragment {

  /**
   * The {@link ViewPager} that will host the section contents.
   */
  private ViewPager viewPager;
  private ArrayList faner;
  private PagerSlidingTabStrip pagerSlidingTabStrip;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    faner = new ArrayList();
    faner.add(new SkraldFrag21Forside());
    faner.addAll(Arrays.asList(Brugervalg.instans.emne.trin));

    View rod = inflater.inflate(R.layout.skrald_frag2_emne_viewpager, container, false);
    viewPager = (ViewPager) rod.findViewById(R.id.viewpager);
    viewPager.setAdapter(new FaneAdapter(getChildFragmentManager()));
//        viewPager.setPageTransformer(false, new ZoomOutPageTransformer());
    pagerSlidingTabStrip = (PagerSlidingTabStrip) rod.findViewById(R.id.faneblade);
    pagerSlidingTabStrip.setViewPager(viewPager);
    pagerSlidingTabStrip.setVisibility(View.GONE);

    viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
      @Override
      public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
      }

      @Override
      public void onPageSelected(int position) {
        pagerSlidingTabStrip.setVisibility(position == 0 ? View.GONE : View.VISIBLE);
      }

      @Override
      public void onPageScrollStateChanged(int state) {
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
      if (f instanceof Trin) return SkraldFragmentfabrikering.nytFragment((Trin) f, position==getCount()-1);
      return new SkraldFrag21Forside(); // fejl
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
