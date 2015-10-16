/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.content.Intent;
import android.view.View;
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


public interface ExerciseStepViewDelegate
{
  public void onViewClickExerciseStepDoPreviousImageButton(final View view, final PayloadClick payload);
  public void onViewClickExerciseStepDoNextImageButton(final View view, final PayloadClick payload);
  public void onViewClickExerciseStepShowOverviewMenuItem(final View view, final PayloadMenu payload);
  public void onViewClickChildStepDetailDoStepImageButton(final View view, final PayloadClick payload);
  public void onViewBackExerciseStep(final View view, final PayloadBack payload);
  public void onViewRefreshExerciseStep(final View view, final PayloadRefresh payload);
  public void onViewCreateExerciseStep(final View view, final PayloadCreate payload);
  public void onViewStartExerciseStep(final View view, final PayloadStart payload);
  public void onViewResumeExerciseStep(final View view, final PayloadResume payload);
  public void onViewPauseExerciseStep(final View view, final PayloadPause payload);
  public void onViewStopExerciseStep(final View view, final PayloadStop payload);
  public void onViewDestroyExerciseStep(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedExerciseStep(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartExerciseStep(final View view, final PayloadRestart payload);
  public void onViewNewIntentExerciseStep(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateExerciseStep(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateExerciseStep(final View view, final PayloadRestoreInstanceState payload);

  public void onReturnFromExerciseOverviewOK(final Intent data);
  public void onReturnFromExerciseOverviewRetryManually(final Intent data);
  public void onReturnFromExerciseOverviewCancelled(final Intent data);
  public void onReturnFromActionShowVideoOK(final Intent data);
  public void onReturnFromActionShowVideoRetryManually(final Intent data);
  public void onReturnFromActionShowVideoCancelled(final Intent data);
  public void onReturnFromActionShowTextOK(final Intent data);
  public void onReturnFromActionShowTextRetryManually(final Intent data);
  public void onReturnFromActionShowTextCancelled(final Intent data);
  public void onReturnFromActionShowAudioOK(final Intent data);
  public void onReturnFromActionShowAudioRetryManually(final Intent data);
  public void onReturnFromActionShowAudioCancelled(final Intent data);
  public void onReturnFromActionShowImageOK(final Intent data);
  public void onReturnFromActionShowImageRetryManually(final Intent data);
  public void onReturnFromActionShowImageCancelled(final Intent data);
  public void onReturnFromActionRecordVideoOK(final Intent data);
  public void onReturnFromActionRecordVideoRetryManually(final Intent data);
  public void onReturnFromActionRecordVideoCancelled(final Intent data);
  public void onReturnFromActionRecordTextOK(final Intent data);
  public void onReturnFromActionRecordTextRetryManually(final Intent data);
  public void onReturnFromActionRecordTextCancelled(final Intent data);
  public void onReturnFromActionRecordAudioOK(final Intent data);
  public void onReturnFromActionRecordAudioRetryManually(final Intent data);
  public void onReturnFromActionRecordAudioCancelled(final Intent data);
  public void onReturnFromActionRecordImageOK(final Intent data);
  public void onReturnFromActionRecordImageRetryManually(final Intent data);
  public void onReturnFromActionRecordImageCancelled(final Intent data);
  public void onReturnFromActionSendReportOK(final Intent data);
  public void onReturnFromActionSendReportRetryManually(final Intent data);
  public void onReturnFromActionSendReportCancelled(final Intent data);

}
