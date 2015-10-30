/**
 * THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */

package dk.lundogbendsen.vucroskilde.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import android.app.Activity;
import dk.lundogbendsen.vucroskilde.android.data.StepType;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseXML;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartXML;
import dk.lundogbendsen.vucroskilde.android.generated.StepXML;
import dk.lundogbendsen.vucroskilde.android.generated.StudentXML;
import dk.lundogbendsen.vucroskilde.android.generated.VUCRoskildeBusinessContextRoot;

public class VUCRoskildeBusinessContext extends VUCRoskildeBusinessContextRoot
{

  public static final VUCRoskildeBusinessContext INSTANCE = new VUCRoskildeBusinessContext();

  @Override
  public long getSplashTimeMS()
  {
    return 800;
  }

  public void initializeDuringSplash(final Activity activity)
  {
    setInitialized();
  }

  public Collection<FlowchartXML> getExecutableFlowcharts()
  {
    return TestData.getInstance().getExecutableFlowcharts().values();
  }

  public FlowchartXML getFlowchartById(final Long id)
  {
    return TestData.getInstance().getFlowcharts().get(id);
  }

  public StepXML getStepById(final Long id)
  {
    return TestData.getInstance().getSteps().get(id);
  }

  private ExerciseXML currentExercise = null;

  public ExerciseXML getExerciseById(final int id)
  {
    return TestData.getInstance().getExercises().get(id);
  }

  public ExerciseXML getCurrentExercise()
  {
    return currentExercise;
  }

  public void setCurrentExercise(final ExerciseXML currentExercise)
  {
    this.currentExercise = currentExercise;
    stackFlowcharts.clear();
    stackFlowcharts.addLast(getFlowchartById(currentExercise.getFlowchart()));
    stackSelectedStep.clear();
    stackSelectedStep.addLast(0);
    currentStep = null;
  }

  private final StudentXML currentStudent = TestData.getInstance().studentAnna;

  public StudentXML getCurrentStudent()
  {
    return currentStudent;
  }

  public <T> T getCurrentAction()
  {
    StepXML step = getCurrentStepIfSelected();
    if (step == null) return null;

    Long actionid = step.getActionId();
    if (actionid == null) return null;

    return TestData.getInstance().getAction(step.getStepType(), actionid);
  }

  private StepXML currentStep;
  private final LinkedList<Integer> stackSelectedStep = new LinkedList<Integer>();

  public StepXML getCurrentStepIfSelected()
  {
    return currentStep;
  }

  public void setCurrentStep(final StepXML step)
  {
    currentStep = step;
  }

  public void stackSelectedStep(final int index)
  {
    stackSelectedStep.addLast(index);
  }

  public int unstackSelectedStep()
  {
    currentStep = null;
    return stackSelectedStep.removeLast();
  }

  public ExerciseXML newExercise(final FlowchartXML flowchart)
  {
    ExerciseXML e1 = TestData.getInstance().createExercise(flowchart, getCurrentStudent());
    if (flowchart.getSteps().isEmpty()) throw new RuntimeException("Flowchart has no steps");

    return e1;
  }

  public void setCurrentStepPrevious()
  {
    int stepindex = stackSelectedStep.removeLast();
    if (stepindex > 0) stepindex--;
    stackSelectedStep.addLast(stepindex);

    currentStep = getCurrentStep(stepindex);
  }

  public void setCurrentStepNext()
  {
    FlowchartXML flowchart = stackFlowcharts.getLast();
    int stepindex = stackSelectedStep.removeLast();
    if (stepindex < flowchart.getSteps().size() - 1) stepindex++;
    stackSelectedStep.addLast(stepindex);

    currentStep = getCurrentStep(stepindex);
  }

  private final LinkedList<FlowchartXML> stackFlowcharts = new LinkedList<FlowchartXML>();

  public FlowchartXML unstackFlowchart()
  {
    return stackFlowcharts.removeLast();
  }

  public void stackFlowchart(final FlowchartXML flowchart)
  {
    if (flowchart == null) { throw new RuntimeException("Cannot add null flowchart to stack"); }

    stackFlowcharts.addLast(flowchart);
  }

  public boolean isFlowchartsStackEmpty()
  {
    return stackFlowcharts.isEmpty();
  }

  public int getFlowchartsStackSize()
  {
    return stackFlowcharts.size();
  }

  public FlowchartXML getCurrentFlowchart()
  {
    return stackFlowcharts.getLast();
  }

  public StepXML getCurrentStep(final int index)
  {
    FlowchartXML flowchart = stackFlowcharts.getLast();
    ArrayList<StepXML> steps = new ArrayList<StepXML>(flowchart.getSteps());
    StepXML step = steps.get(index);
    return step;
  }

  public StepXML getAboveStepPrevious()
  {
    if (stackFlowcharts.size() < 2) return null;
    int d = (currentStep != null ? 0 : 1);

    int index = stackSelectedStep.getLast();
    FlowchartXML flowchart = stackFlowcharts.get(stackFlowcharts.size() - 1 - d);
    if (index > 0)
    {
      ArrayList<StepXML> steps = new ArrayList<StepXML>(flowchart.getSteps());
      StepXML step = steps.get(index - 1);
      return step;
    }
    else
    {
      return null;
    }
  }

  public StepXML getAboveStepNext()
  {
    if (stackFlowcharts.size() < 2) return null;
    int d = (currentStep != null ? 0 : 1);

    int index = stackSelectedStep.getLast();
    FlowchartXML flowchart = stackFlowcharts.get(stackFlowcharts.size() - 1 - d);
    if (index < flowchart.getSteps().size() - 1)
    {
      ArrayList<StepXML> steps = new ArrayList<StepXML>(flowchart.getSteps());
      StepXML step = steps.get(index + 1);
      return step;
    }
    else
    {
      return null;
    }
  }

  public void setAboveStepPrevious()
  {
    int index = stackSelectedStep.getLast();
    unstack();
    if (index > 0) index--;
    stack(index);
  }

  public void setAboveStepNext()
  {
    int index = stackSelectedStep.getLast();
    unstack();
    if (index < getCurrentFlowchart().getSteps().size() - 1) index++;
    stack(index);
  }

  public void unstack()
  {
    if (getCurrentStepIfSelected() == null) unstackFlowchart();
    unstackSelectedStep();
  }

  public void stack(final int index)
  {
    StepXML step = getCurrentStep(index);

    if (step.getStepType() != StepType.SUB_FLOWCHART)
    {
      stackSelectedStep(index);
      setCurrentStep(step);
    }
    else
    {
      FlowchartXML flowchart = getFlowchartById(step.getSubflowchartId());
      stackFlowchart(flowchart);
      stackSelectedStep(index);
      setCurrentStep(null);
    }
  }

  public String getSelectedStepsString(final Long index)
  {
    String res = "";
    String sep = "";
    boolean first = true;
    for (Integer n : stackSelectedStep)
    {
      if (!first)
      {
        res += sep + (n + 1);
        sep = ".";
      }
      else
      {
        first = false;
      }
    }

    if (index != null) res += sep + (index + 1);

    return res;
  }

  private <T> T getAnswer(final ExerciseXML exercise, final StepXML step)
  {
    return TestData.getInstance().<T> getAnswer(exercise, step);
  }

  public <T> T getAnswer()
  {
    return getAnswer(getCurrentExercise(), getCurrentStepIfSelected());
  }

  public Map<Long, Object> getAnswers(final ExerciseXML exercise)
  {
    return TestData.getInstance().getAnswers(exercise);
  }

  private boolean isMediaPlaying = false;

  public void setMediaPlaying(final boolean isMediaPlaying)
  {
    this.isMediaPlaying = isMediaPlaying;
  }

  public boolean isMediaPlaying()
  {
    return isMediaPlaying;
  }

  private int MediaPosition = 0;

  public void setMediaPosition(final int MediaPosition)
  {
    this.MediaPosition = MediaPosition;
  }

  public int getMediaPosition()
  {
    return MediaPosition;
  }

  private boolean isMediaRecording = false;

  public void setMediaRecording(final boolean isMediaRecording)
  {
    this.isMediaRecording = isMediaRecording;
  }

  public boolean isMediaRecording()
  {
    return isMediaRecording;
  }

  private boolean runAsTeacher;

  public void setRunAsTeacher(final boolean runAsTeacher)
  {
    this.runAsTeacher = runAsTeacher;
  }

  public boolean getRunasTeacher()
  {
    return runAsTeacher;
  }
}
