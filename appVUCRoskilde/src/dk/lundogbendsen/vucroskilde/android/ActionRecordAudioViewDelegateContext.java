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
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioXML;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;
import dk.lundogbendsen.vucroskilde.android.util.AudioPlayerWrapper;
import dk.lundogbendsen.vucroskilde.android.util.AudioRecorderWrapper;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.lundogbendsen.vucroskilde.android.util.FileUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadResume;

public class ActionRecordAudioViewDelegateContext extends ActionRecordAudioViewDelegateRoot
{
  @SuppressWarnings("unused")
  private static final String TAG = ActionRecordAudioViewDelegateContext.class.getName();
  
  private ActionRecordAudioXML action;
  private ActionRecordAudioXML answer;

  private AudioRecorderWrapper mrw;
  private AudioPlayerWrapper mpw;
  private MediaRefXML audioFileRef;

  private ActionRecordAudioViewDelegateContext(final ActionRecordAudioRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordAudioGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionRecordAudioViewDelegate create(final ActionRecordAudioRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordAudioGUI guictx)
  {
    return new ActionRecordAudioViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionRecordAudioDoRecordImageButton(final View view, final PayloadClick payload)
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
  public void onViewClickActionRecordAudioDoPlayImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaRecording())
    {
      mrw.stopMediaRecorder();
      mrw.destroyMediaRecorder();
      busctx.setMediaRecording(false);
    }

    if (busctx.isMediaPlaying())
    {
      busctx.setMediaPosition(mpw.getCurrentPosition());
      mpw.stopMediaPlayer();
      mpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }
    else
    {
      mpw.createMediaPlayer();
      mpw.startMediaPlayer(busctx.getMediaPosition());
      busctx.setMediaPlaying(true);
    }
    
    activity.refreshGUI();
  }

  @Override
  public void onViewClickActionRecordAudioDoRegretImageButton(final View view, final PayloadClick payload)
  {
    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      audioFileRef.setPlacementPath(answer.getAudioRef().getPlacementPath());
      audioFileRef.setPlacementType(answer.getAudioRef().getPlacementType());

      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewClickActionRecordAudioDoSaveImageButton(final View view, final PayloadClick payload)
  {
    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      answer.getAudioRef().setPlacementPath(audioFileRef.getPlacementPath());
      answer.getAudioRef().setPlacementType(audioFileRef.getPlacementType());

      goReturn(Activity.RESULT_OK);
    }

  }

  @Override
  public void onViewBackActionRecordAudio(final View view, final PayloadBack payload)
  {
    if (busctx.isMediaRecording())
    {
      mrw.stopMediaRecorder();
      mrw.destroyMediaRecorder();
      busctx.setMediaRecording(false);
    }

    if (busctx.isMediaPlaying())
    {
      mpw.stopMediaPlayer();
      mpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }

    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewCreateActionRecordAudio(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordAudioXML> getCurrentAction(busctx.getCurrentStepIfSelected());
    answer = busctx.<ActionRecordAudioXML> getAnswer();

    audioFileRef = MediaRefXML.create();
    audioFileRef.setPlacementPath(FileUtil.getNewMediaPath(activity, FileUtil.generateAudioFilename(action.getId())));
    audioFileRef.setPlacementType(PlacementType.STORAGE);
    
    mrw = new AudioRecorderWrapper(audioFileRef);

    mpw = new AudioPlayerWrapper(audioFileRef, activity, new OnCompletionListener()
    {
      @Override
      public void onCompletion(final MediaPlayer mp)
      {
        busctx.setMediaPlaying(false);
        activity.refreshGUI();
      }
    });
    busctx.setMediaPlaying(false);
    busctx.setMediaPosition(0);

    busctx.setMediaRecording(false);

    activity.refreshGUI();
  }

  @Override
  public void onViewResumeActionRecordAudio(final View view, final PayloadResume payload)
  {
    mrw.createMediaRecorder();
    busctx.setMediaRecording(false);

    mpw.createMediaPlayer();
    if (busctx.isMediaPlaying())
    {
      mpw.startMediaPlayer(busctx.getMediaPosition());
      busctx.setMediaPlaying(true);
    }

    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionRecordAudio(final View view, final PayloadPause payload)
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
      busctx.setMediaPosition(mpw.getCurrentPosition());
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
  public void onViewRefreshActionRecordAudio(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    guictx.textViewActionRecordAudioText.setText(action.getDescription());

    if (busctx.isMediaPlaying())
    {
      guictx.imageButtonActionRecordAudioDoPlay.setImageResource(R.drawable.ic_pause_black_24dp);
    }
    else
    {
      guictx.imageButtonActionRecordAudioDoPlay.setImageResource(R.drawable.ic_play_arrow_black_24dp);
    }

    if (busctx.isMediaRecording())
    {
      guictx.imageButtonActionRecordAudioDoRecord.setImageResource(R.drawable.ic_stop_black_24dp);
    }
    else
    {
      guictx.imageButtonActionRecordAudioDoRecord.setImageResource(R.drawable.ic_keyboard_voice_black_24dp);
    }
  }

  @Override
  public void onViewDestroyActionRecordAudio(final View view, final PayloadDestroy payload)
  {
    mrw = null;
    mpw = null;
  }

}
