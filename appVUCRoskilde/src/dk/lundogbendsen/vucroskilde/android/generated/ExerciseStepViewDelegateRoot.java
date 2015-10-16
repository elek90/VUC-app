/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.CommonViewDelegateRoot;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadMenu;
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


public abstract class ExerciseStepViewDelegateRoot extends CommonViewDelegateRoot implements ExerciseStepViewDelegate
{
  protected final ExerciseStepRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final ExerciseStepGUI guictx;
  protected ExerciseStepViewDelegateRoot(final ExerciseStepRootActivity activity, final VUCRoskildeBusinessContext busctx, final ExerciseStepGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public abstract void onViewClickExerciseStepDoPreviousImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickExerciseStepDoNextImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickExerciseStepShowOverviewMenuItem(final View view, final PayloadMenu payload);

  @Override
  public abstract void onViewClickChildStepDetailDoStepImageButton(final View view, final PayloadClick payload);

  @Override
  public void onViewBackExerciseStep(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshExerciseStep(final View view, final PayloadRefresh payload);

  @Override
  public abstract void onViewCreateExerciseStep(final View view, final PayloadCreate payload);

  @Override
  public void onViewStartExerciseStep(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeExerciseStep(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseExerciseStep(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopExerciseStep(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroyExerciseStep(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedExerciseStep(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartExerciseStep(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentExerciseStep(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateExerciseStep(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateExerciseStep(final View view, final PayloadRestoreInstanceState payload)
  {
  }

  @Override
  public void onReturnFromExerciseOverviewOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExerciseOverviewRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromExerciseOverviewRetryManually not implemented");
  }

  @Override
  public void onReturnFromExerciseOverviewCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowVideoOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowVideoRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionShowVideoRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionShowVideoCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowTextOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowTextRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionShowTextRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionShowTextCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowAudioOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowAudioRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionShowAudioRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionShowAudioCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowImageOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionShowImageRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionShowImageRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionShowImageCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordVideoOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordVideoRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionRecordVideoRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionRecordVideoCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordTextOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordTextRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionRecordTextRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionRecordTextCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordAudioOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordAudioRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionRecordAudioRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionRecordAudioCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordImageOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionRecordImageRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionRecordImageRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionRecordImageCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionSendReportOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromActionSendReportRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ExerciseStepViewDelegateContext.onReturnFromActionSendReportRetryManually not implemented");
  }

  @Override
  public void onReturnFromActionSendReportCancelled(final Intent data)
  {
    activity.refreshGUI();
  }
  public void goSubExerciseOverview()
  {
    Intent intent = new Intent(activity, ExerciseOverviewActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.EXERCISEOVERVIEW.ordinal());
  }

  public void goSubActionShowVideo()
  {
    Intent intent = new Intent(activity, ActionShowVideoActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONSHOWVIDEO.ordinal());
  }

  public void goSubActionShowText()
  {
    Intent intent = new Intent(activity, ActionShowTextActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONSHOWTEXT.ordinal());
  }

  public void goSubActionShowAudio()
  {
    Intent intent = new Intent(activity, ActionShowAudioActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONSHOWAUDIO.ordinal());
  }

  public void goSubActionShowImage()
  {
    Intent intent = new Intent(activity, ActionShowImageActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONSHOWIMAGE.ordinal());
  }

  public void goSubActionRecordVideo()
  {
    Intent intent = new Intent(activity, ActionRecordVideoActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONRECORDVIDEO.ordinal());
  }

  public void goSubActionRecordText()
  {
    Intent intent = new Intent(activity, ActionRecordTextActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONRECORDTEXT.ordinal());
  }

  public void goSubActionRecordAudio()
  {
    Intent intent = new Intent(activity, ActionRecordAudioActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONRECORDAUDIO.ordinal());
  }

  public void goSubActionRecordImage()
  {
    Intent intent = new Intent(activity, ActionRecordImageActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONRECORDIMAGE.ordinal());
  }

  public void goSubActionSendReport()
  {
    Intent intent = new Intent(activity, ActionSendReportActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ACTIONSENDREPORT.ordinal());
  }

}
