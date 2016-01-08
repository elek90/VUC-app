package dk.lundogbendsen.vuc.frag1nav;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeIntents;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.List;

import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.App;
import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Ikon;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.domæne.Svar;
import dk.lundogbendsen.vuc.fragsvar.SvarBillederFrag;
import dk.lundogbendsen.vuc.fragsvar.SvarTekstFrag;
import dk.lundogbendsen.vuc.fragsvar.SvarFrag;


public class Frag22Trin extends Fragment implements View.OnClickListener, YouTubeThumbnailView.OnInitializedListener {
  static String TRIN = "TRIN";

  private Frag2EmneViewpager ejerFragment;
  public Trin trin;
  private YouTubeThumbnailView yttn;
  private AQuery aq;
  private boolean besvarelsesfragOprettet;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    if (trin ==null) trin = (Trin) getArguments().getSerializable(TRIN);
    ejerFragment = (Frag2EmneViewpager) getParentFragment();

    View rod = inflater.inflate(R.layout.frag2_s2_trin, container, false);
    aq = new AQuery(rod);
    aq.id(R.id.næste).clicked(this);

    aq.id(R.id.overskrift).text(trin.navn);
    Integer resId = IkonTilDrawable.ikonTilDrawable.get(trin.ikon);
    if (resId != null) aq.id(R.id.billede).image(resId);


    if (trin.videoUrl!=null && trin.videoUrl.length()>5) {
      yttn = (YouTubeThumbnailView) rod.findViewById(R.id.trin_multimedie);
      yttn.initialize(Diverse.YOUTUBE_NØGLE, this);
      yttn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          // public static Intent createPlayVideoIntentWithOptions (Context context, String videoId, boolean fullscreen, boolean finishOnEnd)
          startActivity(YouTubeIntents.createPlayVideoIntentWithOptions(getActivity(), trin.videoUrl, false, true));
        }
      });
    }
    if (trin.tekst != null) {
      aq.id(R.id.tekst).text(trin.tekst);
      Linkify.addLinks(aq.getTextView(), Linkify.ALL);
    } else {
      if (savedInstanceState==null && !besvarelsesfragOprettet) {
        besvarelsesfragOprettet = true;
        if (trin.svar==null) trin.svar = new Svar();

        if (trin.ikon == Ikon.notesblok || trin.ikon == Ikon.pen_og_blyant) {
          Fragment f = SvarTekstFrag.nytFragment(trin.svar.tekst);
          getChildFragmentManager().beginTransaction().add(R.id.besvarelsesfrag, f).commit();
        }

        if (trin.ikon == Ikon.kamera || trin.ikon == Ikon.foto) {
          Fragment f = SvarBillederFrag.nytFragment(trin);
          getChildFragmentManager().beginTransaction().add(R.id.besvarelsesfrag, f).commit();
        }
      }
    }

    return rod;
  }

  @Override
  public void onDestroyView() {
    List<Fragment> svarfragmenter = getChildFragmentManager().getFragments();
    if (svarfragmenter != null) for (Fragment f : svarfragmenter) {
      Log.d("onDestroyView f = " + f);
      if (f instanceof SvarFrag) {
        SvarFrag sf = (SvarFrag) f;
        sf.opdaterBesvarelse(trin);
      }
    }
    super.onDestroyView();
  }

  @Override
  public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
      trin.udført = true;
      App.synligtFragment = this;
    } else if (App.synligtFragment == this) App.synligtFragment = null;
  }

  @Override
  public void onClick(View v) {
    ejerFragment.næste();
  }


  ///////////////////// Youtube ////////////////////

  @Override
  public void onInitializationSuccess(YouTubeThumbnailView view, YouTubeThumbnailLoader loader) {
    view.setImageResource(R.drawable.loading_thumbnail);
    loader.setVideo(trin.videoUrl);
  }

  @Override
  public void onInitializationFailure(YouTubeThumbnailView view, YouTubeInitializationResult errorReason) {
    view.setImageResource(R.drawable.no_thumbnail);
    String errorMessage = "Youtube kunne ikke startes: "+errorReason.toString();
    Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_LONG).show();
  }
}
