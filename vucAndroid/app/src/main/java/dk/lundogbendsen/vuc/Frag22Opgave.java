package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeIntents;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.domæne.Opgave;


public class Frag22Opgave extends Fragment implements View.OnClickListener, YouTubeThumbnailView.OnInitializedListener {
  static String OPGAVE = "OPGAVE";

  private Frag2EmneViewpager ejerFragment;
  private TextView overskrift;
  private Opgave opgave;
  private ImageView billede;
  private YouTubeThumbnailView yttn;
  private AQuery aq;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    opgave = (Opgave) getArguments().getSerializable(OPGAVE);

    View rod = inflater.inflate(R.layout.frag2_s2_opgave, container, false);
    aq = new AQuery(rod);
    overskrift = (TextView) rod.findViewById(R.id.overskrift);
    overskrift.setText(opgave.navn);

    billede = (ImageView) rod.findViewById(R.id.billede);
    Integer resId = IkonTilDrawable.ikonTilDrawable.get(opgave.ikon);
    if (resId != null) billede.setImageResource(resId);
    //else billede.setVisibility(View.GONE);

    rod.findViewById(R.id.næste).setOnClickListener(this);
    ejerFragment = (Frag2EmneViewpager) getParentFragment();

    if (opgave.videoUrl!=null) {
      yttn = (YouTubeThumbnailView) rod.findViewById(R.id.opgave_multimedie);
      yttn.initialize(Diverse.YOUTUBE_NØGLE, this);
      yttn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          // public static Intent createPlayVideoIntentWithOptions (Context context, String videoId, boolean fullscreen, boolean finishOnEnd)
          startActivity(YouTubeIntents.createPlayVideoIntentWithOptions(getActivity(), opgave.videoUrl, false, true));
        }
      });
      aq.id(R.id.tekst).text(opgave.videoUrl);
    } else
    if (opgave.tekst != null) {
      aq.id(R.id.tekst).text(opgave.tekst);
    }
    else if (opgave.url != null) {
      aq.id(R.id.tekst).text("Læs mere på:\n"+opgave.url);
      Linkify.addLinks(aq.getTextView(), Linkify.ALL);
    }


    return rod;
  }


  @Override
  public void onClick(View v) {
    ejerFragment.næste();
  }


  ///////////////////// Youtube ////////////////////

  @Override
  public void onInitializationSuccess(YouTubeThumbnailView view, YouTubeThumbnailLoader loader) {
    view.setImageResource(R.drawable.loading_thumbnail);
    loader.setVideo(opgave.videoUrl);
  }

  @Override
  public void onInitializationFailure(YouTubeThumbnailView view, YouTubeInitializationResult errorReason) {
    view.setImageResource(R.drawable.no_thumbnail);
    String errorMessage = "Youtube kunne ikke startes: "+errorReason.toString();
    Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_LONG).show();
  }
}
