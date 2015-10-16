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
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseStepGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseStepRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseStepViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseStepViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartXML;
import dk.lundogbendsen.vucroskilde.android.generated.StepDetailGUI;
import dk.lundogbendsen.vucroskilde.android.generated.StepXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadMenu;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;

public class ExerciseStepViewDelegateContext extends ExerciseStepViewDelegateRoot
{

  private static final String TAG = ExerciseStepViewDelegateContext.class.getSimpleName();

  private ExerciseStepViewDelegateContext(final ExerciseStepRootActivity activity, final VUCRoskildeBusinessContext busctx, final ExerciseStepGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ExerciseStepViewDelegate create(final ExerciseStepRootActivity activity, final VUCRoskildeBusinessContext busctx, final ExerciseStepGUI guictx)
  {
    return new ExerciseStepViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewCreateExerciseStep(final View view, final PayloadCreate payload)
  {
    if (busctx.getCurrentExercise() == null)
    {
      Toast.makeText(activity, "No flowchart selected?", Toast.LENGTH_LONG).show();
      Log.wtf(TAG, "No flowchart selected?");
      goReturn(Activity.RESULT_CANCELED);
    }
    else
    {
      activity.refreshGUI();
    }
  }

  @Override
  public void onViewRefreshExerciseStep(final View view, final PayloadRefresh payload)
  {
    if (busctx.isFlowchartsStackEmpty())
    {
      Toast.makeText(activity, "Stack of flowcharts empty", Toast.LENGTH_LONG).show();
      Log.wtf(TAG, "Stack of flowcharts empty");
      goReturn(Activity.RESULT_CANCELED);
    }

    DisplayUtil.formatActionbar(activity, busctx.getFlowchartById(busctx.getCurrentExercise().getFlowchart()).getFlowchartName());

    FlowchartXML flowchart = busctx.getCurrentFlowchart();
    refreshGUIFlowchart(flowchart);

    guictx.linearLayoutExerciseStepNextPrevious.setVisibility(View.VISIBLE);
    StepXML stepPrevious = busctx.getAboveStepPrevious();
    if (stepPrevious != null)
    {
      guictx.textViewExerciseStepPreviousTitle.setText(stepPrevious.getText());
      guictx.textViewExerciseStepPreviousTitle.setVisibility(View.VISIBLE);
      guictx.imageButtonExerciseStepDoPrevious.setVisibility(View.VISIBLE);
    }
    else
    {
      guictx.textViewExerciseStepPreviousTitle.setVisibility(View.GONE);
      guictx.imageButtonExerciseStepDoPrevious.setVisibility(View.GONE);
    }

    StepXML stepNext = busctx.getAboveStepNext();
    if (stepNext != null)
    {
      guictx.textViewExerciseStepNextTitle.setText(stepNext.getText());
      guictx.textViewExerciseStepNextTitle.setVisibility(View.VISIBLE);
      guictx.imageButtonExerciseStepDoNext.setVisibility(View.VISIBLE);
    }
    else
    {
      guictx.textViewExerciseStepNextTitle.setVisibility(View.GONE);
      guictx.imageButtonExerciseStepDoNext.setVisibility(View.GONE);
    }
  }

  private void refreshGUIFlowchart(final FlowchartXML flowchart)
  {
    guictx.textViewExerciseStepExerciseTitle.setText(flowchart.getFlowchartName());

    // Log.i("--FLOW--", "Viser steps for flowchart " + flowchart.getFlowchartName());

    guictx.linearLayoutExerciseStepExerciseStep.removeAllViews();
    long i = 0;
    for (StepXML step : flowchart.getSteps())
    {
      StepDetailGUI stepdetailgui = StepDetailGUI.create(activity, guictx, i);

      stepdetailgui.textViewStepDetailStepNumber.setText("" + (i + 1));
      stepdetailgui.textViewStepDetailStepTitle.setText(step.getText());

      StepType steptype = StepType.valueOf(step.getStepType());
      stepdetailgui.imageButtonStepDetailDoStep.setImageResource(steptype.getResId());
      
      // Log.i("--FLOW--", "Viser step " + (i + 1) + " af " + flowchart.getSteps().size() + ": " + step.getText());

      guictx.linearLayoutExerciseStepExerciseStep.addView(stepdetailgui.detail);
      i++;
    }
  }

  @Override
  public void onViewClickExerciseStepDoPreviousImageButton(final View view, final PayloadClick payload)
  {
    busctx.setAboveStepPrevious();
    activity.refreshGUI();
  }

  @Override
  public void onViewClickExerciseStepDoNextImageButton(final View view, final PayloadClick payload)
  {
    busctx.setAboveStepNext();
    activity.refreshGUI();
  }

  @Override
  public void onViewBackExerciseStep(final View view, final PayloadBack payload)
  {
    if (busctx.getFlowchartsStackSize() <= 1)
    {
      goReturn(Activity.RESULT_OK);
    }
    else
    {
      busctx.unstack();

      activity.refreshGUI();
    }
  }

  @Override
  public void onViewClickExerciseStepShowOverviewMenuItem(final View view, final PayloadMenu payload)
  {
    Toast.makeText(activity, "ENDNU IKKE LAVET", Toast.LENGTH_SHORT).show();
  }

  @Override
  public void onViewClickChildStepDetailDoStepImageButton(final View view, final PayloadClick payload)
  {
    Long tag = (Long) view.getTag();
    int index = tag.intValue();

    busctx.stack(index);

    StepXML step = busctx.getCurrentStepIfSelected();
    if (step == null)
    {
      activity.refreshGUI();
    }
    else
    {
      StepType steptype = StepType.valueOf(step.getStepType());
      switch (steptype)
      {
        case SHOW_AUDIO:
        {
          goSubActionShowAudio();
          break;
        }
        case SHOW_PICTURE:
        {
          goSubActionShowImage();
          break;
        }
        case SHOW_TEXT:
        {
          goSubActionShowText();
          break;
        }
        case SHOW_VIDEO:
        {
          goSubActionShowVideo();
          break;
        }
        case RECORD_AUDIO:
        {
          goSubActionRecordAudio();
          break;
        }
        case RECORD_IMAGE:
        {
          goSubActionRecordImage();
          break;
        }
        case RECORD_TEXT:
        {
          goSubActionRecordText();
          break;
        }
        case RECORD_VIDEO:
        {
          goSubActionRecordVideo();
          break;
        }
        case SEND_REPORT:
        {
          goSubActionSendReport();
          break;
        }
        case SUB_FLOWCHART:
        {
          Toast.makeText(activity, "Showing a leaf step, but getting type SUB_FLOWCHART?", Toast.LENGTH_LONG).show();
          Log.wtf(TAG, "Showing a leaf step, but getting type SUB_FLOWCHART?");
          goReturn(Activity.RESULT_CANCELED);
          // throw new RuntimeException("Should never meet SUB_FLOWCHART after CurrentStep is set...?");
        }

      }
    }
  }

}
