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


public abstract class FlowchartMainViewDelegateRoot extends CommonViewDelegateRoot implements FlowchartMainViewDelegate
{
  protected final FlowchartMainRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final FlowchartMainGUI guictx;
  protected FlowchartMainViewDelegateRoot(final FlowchartMainRootActivity activity, final VUCRoskildeBusinessContext busctx, final FlowchartMainGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public abstract void onViewClickFlowchartMainSetupMenuItem(final View view, final PayloadMenu payload);

  @Override
  public abstract void onViewClickFlowchartMainAboutMenuItem(final View view, final PayloadMenu payload);

  @Override
  public abstract void onViewClickChildFlowchartDetailDoExerciseImageButton(final View view, final PayloadClick payload);

  @Override
  public void onViewBackFlowchartMain(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshFlowchartMain(final View view, final PayloadRefresh payload);

  @Override
  public abstract void onViewCreateFlowchartMain(final View view, final PayloadCreate payload);

  @Override
  public void onViewStartFlowchartMain(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeFlowchartMain(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseFlowchartMain(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopFlowchartMain(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroyFlowchartMain(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedFlowchartMain(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartFlowchartMain(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentFlowchartMain(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateFlowchartMain(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateFlowchartMain(final View view, final PayloadRestoreInstanceState payload)
  {
  }

  @Override
  public void onReturnFromSetupOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromSetupRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "FlowchartMainViewDelegateContext.onReturnFromSetupRetryManually not implemented");
  }

  @Override
  public void onReturnFromSetupCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromAboutOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromAboutRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "FlowchartMainViewDelegateContext.onReturnFromAboutRetryManually not implemented");
  }

  @Override
  public void onReturnFromAboutCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromSplashOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromSplashRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "FlowchartMainViewDelegateContext.onReturnFromSplashRetryManually not implemented");
  }

  @Override
  public void onReturnFromSplashCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExerciseStepOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExerciseStepRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "FlowchartDetailViewDelegateContext.onReturnFromExerciseStepRetryManually not implemented");
  }

  @Override
  public void onReturnFromExerciseStepCancelled(final Intent data)
  {
    activity.refreshGUI();
  }
  public void goSubSetup()
  {
    Intent intent = new Intent(activity, SetupActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.SETUP.ordinal());
  }

  public void goSubAbout()
  {
    Intent intent = new Intent(activity, AboutActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.ABOUT.ordinal());
  }

  public void goSubSplash()
  {
    Intent intent = new Intent(activity, SplashActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.SPLASH.ordinal());
  }

  public void goSubExerciseStep()
  {
    Intent intent = new Intent(activity, ExerciseStepActivity.class);
    activity.startActivityForResult(intent, NavigationPoint.EXERCISESTEP.ordinal());
  }

}
