/**
 * THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */

package dk.lundogbendsen.vucroskilde.android;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.lundogbendsen.vucroskilde.android.util.VideoPlayerWrapper;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadResume;

public class ActionShowVideoViewDelegateContext extends ActionShowVideoViewDelegateRoot
{

  @SuppressWarnings("unused")
  private static final String TAG = ActionShowVideoViewDelegateContext.class.getName();

  private ActionShowVideoViewDelegateContext(final ActionShowVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowVideoGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionShowVideoViewDelegate create(final ActionShowVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowVideoGUI guictx)
  {
    return new ActionShowVideoViewDelegateContext(activity, busctx, guictx);
  }

  private ActionShowVideoXML action;

  private MediaRefXML videoFileRef;

  private VideoPlayerWrapper wpw;

  @Override
  public void onViewCreateActionShowVideo(final View view, final PayloadCreate payload)
  {
    // media_Controller = new MediaController(activity);

    action = busctx.<ActionShowVideoXML> getCurrentAction();

    videoFileRef = MediaRefXML.create();
    videoFileRef.setPlacementPath(action.getVideoRef().getPlacementPath());
    videoFileRef.setPlacementType(action.getVideoRef().getPlacementType());

    wpw = new VideoPlayerWrapper(videoFileRef, activity, guictx.videoViewActionShowVideoVideo);
    busctx.setMediaPlaying(false);
    busctx.setMediaPosition(0);
  }

  @Override
  public void onViewRefreshActionShowVideo(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    DisplayMetrics dm = new DisplayMetrics();
    activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
    int height = dm.heightPixels;
    int width = dm.widthPixels;
    guictx.videoViewActionShowVideoVideo.setMinimumWidth(width);
    guictx.videoViewActionShowVideoVideo.setMinimumHeight(height);

    wpw.createMediaPlayer();
    wpw.startMediaPlayer();

    guictx.textViewActionShowVideoCaption.setText(action.getDescription());
  }

  // // TODO Use streaming - works
  // Toast.makeText(activity, "Video: "+action.getVideoRef(), Toast.LENGTH_LONG).show();
  // Uri uri = Uri.parse(action.getVideoRef());
  // Intent intent = new Intent(Intent.ACTION_VIEW, uri);
  // intent.setDataAndType(uri, "video/mp4");
  // activity.startActivity(intent);
  // husk også noget kontrol når den returnerer, så vi ikke bare spørger efter media player igen og igen...

  @Override
  public void onViewBackActionShowVideo(final View view, final PayloadBack payload)
  {
    wpw.stopMediaPlayer();
    wpw.destroyMediaPlayer();

    goReturn(Activity.RESULT_OK);
  }

  
  @Override
  public void onViewResumeActionShowVideo(final View view, final PayloadResume payload)
  {
    wpw.createMediaPlayer();
    if (busctx.isMediaPlaying())
    {
      wpw.startMediaPlayer();
      busctx.setMediaPlaying(true);
    }

    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionShowVideo(final View view, final PayloadPause payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(true);
    }
    else
    {
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }
  }

  @Override
  public void onViewDestroyActionShowVideo(final View view, final PayloadDestroy payload)
  {
    wpw = null;
  }

}
