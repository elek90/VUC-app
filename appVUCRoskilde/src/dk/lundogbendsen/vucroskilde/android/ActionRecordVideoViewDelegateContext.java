/** THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android;

import android.app.Activity;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.lundogbendsen.vucroskilde.android.util.FileUtil;
import dk.lundogbendsen.vucroskilde.android.util.VideoPlayerWrapper;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadResume;


public class ActionRecordVideoViewDelegateContext extends ActionRecordVideoViewDelegateRoot
{

  @SuppressWarnings("unused")
  private ActionRecordVideoXML action;
  private ActionRecordVideoXML answer;
private MediaRefXML videoFileRef;

private VideoPlayerWrapper mpw;
private VideoRecorderWrapper mrw;

  private ActionRecordVideoViewDelegateContext(final ActionRecordVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordVideoGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionRecordVideoViewDelegate create(final ActionRecordVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordVideoGUI guictx)
  {
    return new ActionRecordVideoViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionRecordVideoDoRegretImageButton(final View view, final PayloadClick payload)
  {
    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      videoFileRef.setPlacementPath(answer.getVideoRef().getPlacementPath());
      videoFileRef.setPlacementType(answer.getVideoRef().getPlacementType());

      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewClickActionRecordVideoDoSaveImageButton(final View view, final PayloadClick payload)
  {
    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      answer.getVideoRef().setPlacementPath(videoFileRef.getPlacementPath());
      answer.getVideoRef().setPlacementType(videoFileRef.getPlacementType());

      goReturn(Activity.RESULT_OK);
    }
  }

  
  @Override
  public void onViewClickActionRecordVideoDoRecordImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaPlaying())
    {
      busctx.setMediaPosition(0);
      mpw.stopMediaPlayer();
      mpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }

    if (busctx.isMediaRecording())
    {
      busctx.setMediaPosition(0);
      mrw.stopMediaRecorder();
      mrw.destroyMediaRecorder();
      busctx.setMediaRecording(false);
    }
    else
    {
      mrw.createMediaRecorder();
      mrw.startMediaRecorder();
      busctx.setMediaRecording(true);
    }
    
    activity.refreshGUI();
  }

  
  @Override
  public void onViewClickActionRecordVideoDoPlayImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaRecording())
    {
      mrw.stopMediaRecorder();
      mrw.destroyMediaRecorder();
      busctx.setMediaRecording(false);
    }

    if (busctx.isMediaPlaying())
    {
//      busctx.setMediaPosition(mpw.getCurrentPosition());
      mpw.stopMediaPlayer();
      mpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }
    else
    {
      mpw.createMediaPlayer();
      mpw.startMediaPlayer(); // busctx.getMediaPosition()
      busctx.setMediaPlaying(true);
    }
    
    activity.refreshGUI();
  }


  @Override
  public void onViewBackActionRecordVideo(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewRefreshActionRecordVideo(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    guictx.textViewActionRecordVideoText.setText(action.getDescription());

    if (busctx.isMediaPlaying())
    {
      guictx.imageButtonActionRecordVideoDoPlay.setImageResource(R.drawable.ic_pause_black_24dp);
    }
    else
    {
      guictx.imageButtonActionRecordVideoDoPlay.setImageResource(R.drawable.ic_play_arrow_black_24dp);
    }

    if (busctx.isMediaRecording())
    {
      guictx.imageButtonActionRecordVideoDoRecord.setImageResource(R.drawable.ic_stop_black_24dp);
    }
    else
    {
      guictx.imageButtonActionRecordVideoDoRecord.setImageResource(R.drawable.ic_keyboard_voice_black_24dp);
    }
  }

  @Override
  public void onViewCreateActionRecordVideo(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordVideoXML> getCurrentAction();
    answer = busctx.<ActionRecordVideoXML> getAnswer();

    videoFileRef = MediaRefXML.create();
    videoFileRef.setPlacementPath(FileUtil.getNewMediaPath(activity, FileUtil.generateVideoFilename(action.getId())));
    videoFileRef.setPlacementType(PlacementType.STORAGE);
    
    mrw = new VideoRecorderWrapper(videoFileRef);

    mpw = new VideoPlayerWrapper(videoFileRef, activity, guictx.videoViewActionRecordVideoVideo);
    busctx.setMediaPlaying(false);
    busctx.setMediaPosition(0);

    busctx.setMediaRecording(false);

    activity.refreshGUI();
  }


  @Override
  public void onViewResumeActionRecordVideo(final View view, final PayloadResume payload)
  {
    mrw.createMediaRecorder();
    busctx.setMediaRecording(false);

    mpw.createMediaPlayer();
    if (busctx.isMediaPlaying())
    {
      mpw.startMediaPlayer(); //     mrw.createMediaRecorder();
      busctx.setMediaPlaying(true);
    }

    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionRecordVideo(final View view, final PayloadPause payload)
  {
    if (busctx.isMediaRecording())
    {
      busctx.setMediaPosition(0);
      mrw.stopMediaRecorder();
      mrw.destroyMediaRecorder();
      busctx.setMediaRecording(false); // We will not recommence after a stop
    }
    else
    {
      mrw.destroyMediaRecorder();
      busctx.setMediaRecording(false);
    }

    if (busctx.isMediaPlaying())
    {
//      busctx.setMediaPosition(mpw.getCurrentPosition());
      mpw.stopMediaPlayer();
      mpw.destroyMediaPlayer();
      busctx.setMediaPlaying(true);
    }
    else
    {
      mpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }
  }


  @Override
  public void onViewDestroyActionRecordVideo(final View view, final PayloadDestroy payload)
  {
    mrw = null;
    mpw = null;
  }

}
