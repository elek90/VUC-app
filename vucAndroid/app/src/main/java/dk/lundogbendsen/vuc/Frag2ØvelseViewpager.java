package dk.lundogbendsen.vuc;

import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.Arrays;

import dk.lundogbendsen.vuc.domæne.Aktivitet;
import dk.lundogbendsen.vuc.domæne.Valg;

public class Frag2ØvelseViewpager extends Fragment {

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager viewPager;
    private ArrayList faner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        faner = new ArrayList();
        faner.add(new Frag21Forside());
        faner.addAll(Arrays.asList(Valg.i.emne.aktiviteter));

        View rod = inflater.inflate(R.layout.frag2_oevelse_viewpager, container, false);
        viewPager = (ViewPager) rod.findViewById(R.id.viewpager);
        viewPager.setAdapter(new FaneAdapter(getChildFragmentManager()));
//        viewPager.setPageTransformer(false, new ZoomOutPageTransformer());

        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) rod.findViewById(R.id.faneblade);
        pagerSlidingTabStrip.setViewPager(viewPager);

        return rod;
    }

    public void næste() {
        int i = viewPager.getCurrentItem();
        viewPager.setCurrentItem(i + 1, true);
    }

    public void hopTilAktivitet(int position) {
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
            if (f instanceof Aktivitet) return Fragmentfabrikering.nytFragment((Aktivitet)f);
            return new Frag21Forside(); // fejl
        }

        @Override
        public int getCount() {
            return faner.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position==0) return "";
            Object f = faner.get(position);
            if (f instanceof Aktivitet) return ((Aktivitet)f).navn;
            return "??"+position;
        }
    }
}
