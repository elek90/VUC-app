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
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseOverviewGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseOverviewRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseOverviewViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseOverviewViewDelegateRoot;
import dk.schoubo.library.android.ui.framework.PayloadBack;
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


public class ExerciseOverviewViewDelegateContext extends ExerciseOverviewViewDelegateRoot
{

  private ExerciseOverviewViewDelegateContext(final ExerciseOverviewRootActivity activity, final VUCRoskildeBusinessContext busctx, final ExerciseOverviewGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ExerciseOverviewViewDelegate create(final ExerciseOverviewRootActivity activity, final VUCRoskildeBusinessContext busctx, final ExerciseOverviewGUI guictx)
  {
    return new ExerciseOverviewViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewBackExerciseOverview(final View view, final PayloadBack payload)
  {
    // TODO To be filled out by YOU   -- super contains   goReturn(Activity.RESULT_CANCELED);
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public void onViewRefreshExerciseOverview(final View view, final PayloadRefresh payload)
  {
    // TODO To be filled out by YOU
    guictx.imageViewExerciseOverviewExerciseOverview.setImageResource(R.drawable.ic_launcher);
    // guictx.textViewExerciseOverviewExerciseTitle.setText("...");
    // guictx.textViewExerciseOverviewExerciseStep.setText("...");
  }

  @Override
  public void onViewCreateExerciseOverview(final View view, final PayloadCreate payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewStartExerciseOverview(final View view, final PayloadStart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewResumeExerciseOverview(final View view, final PayloadResume payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewPauseExerciseOverview(final View view, final PayloadPause payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewStopExerciseOverview(final View view, final PayloadStop payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewDestroyExerciseOverview(final View view, final PayloadDestroy payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewWindowFocusChangedExerciseOverview(final View view, final PayloadWindowFocusChanged payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestartExerciseOverview(final View view, final PayloadRestart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewNewIntentExerciseOverview(final View view, final PayloadNewIntent payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewSaveInstanceStateExerciseOverview(final View view, final PayloadSaveInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestoreInstanceStateExerciseOverview(final View view, final PayloadRestoreInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }



}
