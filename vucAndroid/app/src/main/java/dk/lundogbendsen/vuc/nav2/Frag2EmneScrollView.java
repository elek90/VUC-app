package dk.lundogbendsen.vuc.nav2;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;

public class Frag2EmneScrollView extends Fragment {

  private LinearLayout viewPager;
  private LinkedHashMap<Trin, Integer> kategorier;
  private ScrollView scrollView;
  private boolean initialiseret; // Tilføj kun underfragmenter FØRSTE gang

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View rod = inflater.inflate(R.layout.frag2_emne_scrollview, container, false);
    viewPager = (LinearLayout) rod.findViewById(R.id.viewpager);
    scrollView = (ScrollView) rod.findViewById(R.id.scrollView);
    FragmentManager fm = getChildFragmentManager();
    kategorier = new LinkedHashMap<Trin,Integer>();
    for (int n=0; n<Brugervalg.instans.emne.trin.length; n++) {
      Trin t = Brugervalg.instans.emne.trin[n];
      if (t.ikon.type == Ikon.Type.kategori) {
        kategorier.put(t, n);
      }
      if (savedInstanceState==null && !initialiseret) {
        Fragment f = Fragmentfabrikering.nytFragment(t, n == Brugervalg.instans.emne.trin.length - 1);
        fm.beginTransaction().add(R.id.viewpager, f, "frag_trin_" + t.id).commit();
        fm.executePendingTransactions();
      }
    }

    ((HovedAkt) getActivity()).sætKategorier(new ArrayList<>(kategorier.keySet()));
    App.hovedtråd.post(new Runnable() {
      @Override
      public void run() {
        Log.d("viewPager.getChildCount() = "+viewPager.getChildCount());
        for (int n = 0; n<viewPager.getChildCount(); n++) {
          Log.d("viewPager.getChild() = "+viewPager.getChildAt(n).getTag());
        }
      }
    });
    if (savedInstanceState==null && !kategorier.isEmpty() && !initialiseret) {
      Diverse.udførSidstIHovedtråden(100, new Runnable() {
        @Override
        public void run() {
          ((HovedAkt) getActivity()).visMenu();
        }
      });

    }
    initialiseret = true;
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

  public void startRedigering() {
    final Snackbar sb = Snackbar.make(viewPager, "Tryk på overskriften på punktet du vil redigere", Snackbar.LENGTH_INDEFINITE);
    sb.show();
    viewPager.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View v, MotionEvent event) {
        int y = (int) event.getY();
        viewPager.setOnTouchListener(null);
        sb.dismiss();
        Rect hitRect = new Rect();
        for (int n = 0; n<viewPager.getChildCount(); n++) {
          View c = viewPager.getChildAt(n);
          c.getHitRect(hitRect);
          boolean ramt = hitRect.intersect(0, y - 1, Integer.MAX_VALUE, y + 1);
          Log.d(n);
          Log.d("viewPager.getChild() = "+ramt+hitRect+" "+c.getTag());
          Object synligtFragment = c.getTag();
          if (ramt && synligtFragment instanceof TrinFrag) {
            Frag22RedigerTrin f2 = new Frag22RedigerTrin();
            f2.setArguments(((TrinFrag)synligtFragment).getArguments());
            getFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right)
                    .replace(R.id.hovedakt_indhold, f2)
                    .addToBackStack(null).commit();
          }
        }
        return true;
      }
    });
  }
}
