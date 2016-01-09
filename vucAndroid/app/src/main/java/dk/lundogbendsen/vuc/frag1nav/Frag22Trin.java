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

import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.domæne.Svar;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;


public class Frag22Trin extends TrinFrag implements View.OnClickListener, YouTubeThumbnailView.OnInitializedListener {

  private Frag2EmneViewpager ejerFragment;
  private YouTubeThumbnailView yttn;
  private AQuery aq;
  private boolean besvarelsesfragOprettet;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


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
        Fragment f = TrinFrag.nytFragment(trin);
        if (f!=null) {
          getChildFragmentManager().beginTransaction().add(R.id.besvarelsesfrag, f).commit();
        }
      }
    }

    return rod;
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
