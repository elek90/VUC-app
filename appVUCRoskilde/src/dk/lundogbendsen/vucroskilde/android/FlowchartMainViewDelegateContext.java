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
import android.content.Intent;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseXML;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartDetailGUI;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartMainGUI;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartMainRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartMainViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartMainViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadMenu;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;

public class FlowchartMainViewDelegateContext extends FlowchartMainViewDelegateRoot
{

  private FlowchartMainViewDelegateContext(final FlowchartMainRootActivity activity, final VUCRoskildeBusinessContext busctx, final FlowchartMainGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static FlowchartMainViewDelegate create(final FlowchartMainRootActivity activity, final VUCRoskildeBusinessContext busctx, final FlowchartMainGUI guictx)
  {
    return new FlowchartMainViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickFlowchartMainSetupMenuItem(final View view, final PayloadMenu payload)
  {
    goSubSetup();
  }

  @Override
  public void onViewClickFlowchartMainAboutMenuItem(final View view, final PayloadMenu payload)
  {
    goSubAbout();
  }

  @Override
  public void onViewClickChildFlowchartDetailDoExerciseImageButton(final View view, final PayloadClick payload)
  {
    FlowchartXML flowchart = busctx.getFlowchartById((Long) view.getTag());
    ExerciseXML exercise = busctx.newExercise(flowchart);
    busctx.setCurrentExercise(exercise);
    goSubExerciseStep();
  }

  @Override
  public void onViewBackFlowchartMain(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public void onViewRefreshFlowchartMain(final View view, final PayloadRefresh payload)
  {
    int n = busctx.getExecutableFlowcharts().size();
    DisplayUtil.formatActionbar(activity, "" + (n == 0 ? "Ingen" : "" + n) + " øvelse" + (n == 1 ? "" : "r")); // TODO String resource instead

    guictx.linearLayoutFlowchartMainExerciseList.removeAllViews();
    for (FlowchartXML flowchart : busctx.getExecutableFlowcharts())
    {
      FlowchartDetailGUI exercisedetailguictx = FlowchartDetailGUI.create(activity, guictx, flowchart.getId());
      exercisedetailguictx.textViewFlowchartDetailFlowchartTitle.setText(flowchart.getFlowchartName());
      guictx.linearLayoutFlowchartMainExerciseList.addView(exercisedetailguictx.detail);
    }
  }

  @Override
  public void onViewCreateFlowchartMain(final View view, final PayloadCreate payload)
  {
    activity.getActionBar().hide();

    if (busctx.isNotYetInitialized()) goSubSplash();
  }

  @Override
  public void onReturnFromSplashOK(final Intent data)
  {
    if (busctx.isNotYetInitialized()) activity.finish();
  }

  @Override
  public void onReturnFromSplashRetryManually(final Intent data)
  {
    activity.finish();
  }

  @Override
  public void onReturnFromSplashCancelled(final Intent data)
  {
    activity.finish();
  }

}
