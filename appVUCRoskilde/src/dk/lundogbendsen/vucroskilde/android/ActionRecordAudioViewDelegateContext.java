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
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadNewIntent;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadRestart;
import dk.schoubo.library.android.ui.framework.PayloadRestoreInstanceState;
import dk.schoubo.library.android.ui.framework.PayloadResume;
import dk.schoubo.library.android.ui.framework.PayloadSaveInstanceState;
import dk.schoubo.library.android.ui.framework.PayloadStart;
import dk.schoubo.library.android.ui.framework.PayloadStop;
import dk.schoubo.library.android.ui.framework.PayloadWindowFocusChanged;


public class ActionRecordAudioViewDelegateContext extends ActionRecordAudioViewDelegateRoot
{
  private ActionRecordAudioXML action;

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
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewClickActionRecordAudioDoPlayImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewClickActionRecordAudioDoRegretImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewClickActionRecordAudioDoSaveImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewBackActionRecordAudio(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewRefreshActionRecordAudio(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewCreateActionRecordAudio(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordAudioXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewStartActionRecordAudio(final View view, final PayloadStart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewResumeActionRecordAudio(final View view, final PayloadResume payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewPauseActionRecordAudio(final View view, final PayloadPause payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewStopActionRecordAudio(final View view, final PayloadStop payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewDestroyActionRecordAudio(final View view, final PayloadDestroy payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewWindowFocusChangedActionRecordAudio(final View view, final PayloadWindowFocusChanged payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestartActionRecordAudio(final View view, final PayloadRestart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewNewIntentActionRecordAudio(final View view, final PayloadNewIntent payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewSaveInstanceStateActionRecordAudio(final View view, final PayloadSaveInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestoreInstanceStateActionRecordAudio(final View view, final PayloadRestoreInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }



}
