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
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.lundogbendsen.vucroskilde.android.util.AudioPlayerWrapper;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadResume;

public class ActionShowAudioViewDelegateContext extends ActionShowAudioViewDelegateRoot
{
  private ActionShowAudioXML action;

  private AudioPlayerWrapper mpw;

  private ActionShowAudioViewDelegateContext(final ActionShowAudioRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowAudioGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionShowAudioViewDelegate create(final ActionShowAudioRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowAudioGUI guictx)
  {
    return new ActionShowAudioViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionShowAudioDoPlayImageButton(final View view, final PayloadClick payload)
  {
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
  public void onViewBackActionShowAudio(final View view, final PayloadBack payload)
  {
    mpw.stopMediaPlayer();
    mpw.destroyMediaPlayer();
    busctx.setMediaPlaying(false);
    
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewRefreshActionShowAudio(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    guictx.textViewActionShowAudioText.setText(action.getDescription());

    if (busctx.isMediaPlaying())
    {
      guictx.imageButtonActionShowAudioDoPlay.setImageResource(R.drawable.ic_pause_black_24dp);
    }
    else
    {
      guictx.imageButtonActionShowAudioDoPlay.setImageResource(R.drawable.ic_play_arrow_black_24dp);
    }
  }

  @Override
  public void onViewCreateActionShowAudio(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionShowAudioXML> getCurrentAction(busctx.getCurrentStepIfSelected());

    mpw = new AudioPlayerWrapper(action.getAudioRef(), activity, new OnCompletionListener()
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

    activity.refreshGUI();
  }

  @Override
  public void onViewResumeActionShowAudio(final View view, final PayloadResume payload)
  {
    mpw.createMediaPlayer();
    if (busctx.isMediaPlaying())
    {
      mpw.startMediaPlayer(busctx.getMediaPosition());
      busctx.setMediaPlaying(true);
    }
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionShowAudio(final View view, final PayloadPause payload)
  {
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
  public void onViewDestroyActionShowAudio(final View view, final PayloadDestroy payload)
  {
    mpw = null;
  }



}
