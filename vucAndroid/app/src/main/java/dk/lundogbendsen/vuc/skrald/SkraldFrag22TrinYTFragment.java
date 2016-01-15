package dk.lundogbendsen.vuc.skrald;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.diverse.IkonTilDrawable;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.skrald.nav1.SkraldFrag2EmneViewpager;


public class SkraldFrag22TrinYTFragment extends Fragment implements View.OnClickListener, YouTubePlayer.OnInitializedListener {
  static String TRIN = "TRIN";

  private SkraldFrag2EmneViewpager ejerFragment;
  private TextView overskrift;
  private Trin trin;
  private ImageView billede;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    trin = (Trin) getArguments().getSerializable(TRIN);

    View rod = inflater.inflate(R.layout.skrald_frag2_s2_trin, container, false);
    overskrift = (TextView) rod.findViewById(R.id.overskrift);
    overskrift.setText(trin.navn);

    billede = (ImageView) rod.findViewById(R.id.billede);
    Integer resId = IkonTilDrawable.ikonTilDrawable.get(trin.ikon);
    if (resId != null) billede.setImageResource(resId);
    //else billede.setVisibility(View.GONE);

    rod.findViewById(R.id.næste).setOnClickListener(this);
    ejerFragment = (SkraldFrag2EmneViewpager) getParentFragment();

    if (trin.videoUrl!=null) {
      if (savedInstanceState==null) {
        youTubePlayerSupportFragment = new YouTubePlayerSupportFragment();
        getChildFragmentManager().beginTransaction().add(R.id.trin_multimedie, youTubePlayerSupportFragment).commit();
        youTubePlayerSupportFragment.initialize(Diverse.YOUTUBE_NØGLE, this);
      } else {
        youTubePlayerSupportFragment = (YouTubePlayerSupportFragment) getChildFragmentManager().findFragmentById(R.id.trin_multimedie);
      }
    }

    return rod;
  }


  @Override
  public void onClick(View v) {
    ejerFragment.næste();
  }


  ///////////////////// Youtube ////////////////////
  private YouTubePlayerSupportFragment youTubePlayerSupportFragment;

  @Override
  public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
                                      boolean wasRestored) {
    if (!wasRestored) {
      player.cueVideo("nCgQDjiotG0");
    }
  }

  private static final int RECOVERY_DIALOG_REQUEST = 1;

  @Override
  public void onInitializationFailure(YouTubePlayer.Provider provider,
                                      YouTubeInitializationResult errorReason) {
    if (errorReason.isUserRecoverableError()) {
      errorReason.getErrorDialog(getActivity(), RECOVERY_DIALOG_REQUEST).show();
    } else {
      String errorMessage = "Youtube kunne ikke startes: "+errorReason.toString();
      Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_LONG).show();
    }
  }

  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (requestCode == RECOVERY_DIALOG_REQUEST && youTubePlayerSupportFragment!=null) {
      // Retry initialization if user performed a recovery action
      youTubePlayerSupportFragment.initialize(Diverse.YOUTUBE_NØGLE, this);
    }
  }

}
