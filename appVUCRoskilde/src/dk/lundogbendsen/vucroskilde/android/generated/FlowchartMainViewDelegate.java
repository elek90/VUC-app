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


public interface FlowchartMainViewDelegate
{
  public void onViewClickFlowchartMainSetupMenuItem(final View view, final PayloadMenu payload);
  public void onViewClickFlowchartMainAboutMenuItem(final View view, final PayloadMenu payload);
  public void onViewClickChildFlowchartDetailDoExerciseImageButton(final View view, final PayloadClick payload);
  public void onViewBackFlowchartMain(final View view, final PayloadBack payload);
  public void onViewRefreshFlowchartMain(final View view, final PayloadRefresh payload);
  public void onViewCreateFlowchartMain(final View view, final PayloadCreate payload);
  public void onViewStartFlowchartMain(final View view, final PayloadStart payload);
  public void onViewResumeFlowchartMain(final View view, final PayloadResume payload);
  public void onViewPauseFlowchartMain(final View view, final PayloadPause payload);
  public void onViewStopFlowchartMain(final View view, final PayloadStop payload);
  public void onViewDestroyFlowchartMain(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedFlowchartMain(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartFlowchartMain(final View view, final PayloadRestart payload);
  public void onViewNewIntentFlowchartMain(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateFlowchartMain(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateFlowchartMain(final View view, final PayloadRestoreInstanceState payload);

  public void onReturnFromSetupOK(final Intent data);
  public void onReturnFromSetupRetryManually(final Intent data);
  public void onReturnFromSetupCancelled(final Intent data);
  public void onReturnFromAboutOK(final Intent data);
  public void onReturnFromAboutRetryManually(final Intent data);
  public void onReturnFromAboutCancelled(final Intent data);
  public void onReturnFromSplashOK(final Intent data);
  public void onReturnFromSplashRetryManually(final Intent data);
  public void onReturnFromSplashCancelled(final Intent data);
  public void onReturnFromExerciseStepOK(final Intent data);
  public void onReturnFromExerciseStepRetryManually(final Intent data);
  public void onReturnFromExerciseStepCancelled(final Intent data);

}
