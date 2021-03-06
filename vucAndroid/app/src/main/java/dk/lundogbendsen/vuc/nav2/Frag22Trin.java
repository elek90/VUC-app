package dk.lundogbendsen.vuc.nav2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeIntents;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.domæne.Svar;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;


public class Frag22Trin extends TrinFrag implements YouTubeThumbnailView.OnInitializedListener {

  private YouTubeThumbnailView yttn;
  private AQuery aq;
  private boolean initialiseret; // Tilføj kun underfragmenter FØRSTE gang

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    View rod = inflater.inflate(R.layout.frag2_s2_trin, container, false);
    rod.setTag(this);
    aq = new AQuery(rod);

    aq.id(R.id.overskrift).text(trin.navn);
    Integer resId = IkonTilDrawable.ikonTilDrawable.get(trin.ikon);
    if (resId != null) aq.id(R.id.billede).image(resId);
    else aq.id(R.id.billede).gone();


    yttn = (YouTubeThumbnailView) rod.findViewById(R.id.trin_multimedie);
    if (trin.videoUrl!=null && trin.videoUrl.length()>5) {
      yttn.initialize(Diverse.YOUTUBE_NØGLE, this);
      yttn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          // public static Intent createPlayVideoIntentWithOptions (Context context, String videoId, boolean fullscreen, boolean finishOnEnd)
          Intent i = YouTubeIntents.createPlayVideoIntentWithOptions(getActivity(), trin.videoUrl, false, true);
          if (App.tjekIntent(i)) startActivity(i);
          else startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/"+trin.videoUrl)));
        }
      });
    } else {
      yttn.setVisibility(View.GONE);
    }

    aq.id(R.id.tekst).text(trin.tekst).visibility(aq.getText().length()>0?View.VISIBLE:View.GONE);
    Linkify.addLinks(aq.getTextView(), Linkify.ALL);
    if (savedInstanceState==null && !initialiseret) {
      Fragment f = TrinFrag.nytFragment(trin);
      if (f!=null) {
        if (trin.svar==null) trin.svar = new Svar();
        getChildFragmentManager().beginTransaction().add(R.id.besvarelsesfrag, f).commit();
      }
    }
    initialiseret = true;

    return rod;
  }

  ///////////////////// Youtube ////////////////////

  @Override
  public void onInitializationSuccess(YouTubeThumbnailView view, YouTubeThumbnailLoader loader) {
    view.setImageResource(R.drawable.video_loading_thumbnail);
    loader.setVideo(trin.videoUrl);
  }

  private static boolean youtubefejlVist = false;
  @Override
  public void onInitializationFailure(YouTubeThumbnailView view, YouTubeInitializationResult errorReason) {
    view.setImageResource(R.drawable.video_no_thumbnail);
    if (youtubefejlVist) return;
    App.kortToast("Kan ikke vise Youtube-miniaturer: "+errorReason.toString());
    youtubefejlVist = true;
  }
}
