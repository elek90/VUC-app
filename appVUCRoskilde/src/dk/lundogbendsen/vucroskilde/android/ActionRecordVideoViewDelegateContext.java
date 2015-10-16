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
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoXML;
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


public class ActionRecordVideoViewDelegateContext extends ActionRecordVideoViewDelegateRoot
{

  private ActionRecordVideoXML action;

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
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewClickActionRecordVideoDoSaveImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewBackActionRecordVideo(final View view, final PayloadBack payload)
  {
    // TODO To be filled out by YOU   -- super contains   goReturn(Activity.RESULT_CANCELED);
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public void onViewRefreshActionRecordVideo(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getText());
    // TODO To be filled out by YOU
    // guictx.videoViewActionRecordVideoVideo.setVideoURI(Uri.parse("..."));
  }

  @Override
  public void onViewCreateActionRecordVideo(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordVideoXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewStartActionRecordVideo(final View view, final PayloadStart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewResumeActionRecordVideo(final View view, final PayloadResume payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewPauseActionRecordVideo(final View view, final PayloadPause payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewStopActionRecordVideo(final View view, final PayloadStop payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewDestroyActionRecordVideo(final View view, final PayloadDestroy payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewWindowFocusChangedActionRecordVideo(final View view, final PayloadWindowFocusChanged payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestartActionRecordVideo(final View view, final PayloadRestart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewNewIntentActionRecordVideo(final View view, final PayloadNewIntent payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewSaveInstanceStateActionRecordVideo(final View view, final PayloadSaveInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestoreInstanceStateActionRecordVideo(final View view, final PayloadRestoreInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }



}
