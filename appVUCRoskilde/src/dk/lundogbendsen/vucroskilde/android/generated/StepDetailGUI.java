/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class StepDetailGUI extends CommonGUI<VUCRoskildeBusinessContext, ExerciseStepActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final ExerciseStepGUI masterguictx;
  public final LinearLayout detail;
  public final TextView textViewStepDetailStepNumber;
  public final TextView textViewStepDetailStepTitle;
  public final ImageButton imageButtonStepDetailDoStep;

  public StepDetailGUI(final RootActivity<VUCRoskildeBusinessContext, ExerciseStepGUI, ExerciseStepActionPoint, NavigationPoint> activity, ExerciseStepGUI masterguictx, Long key)
  {
    super(activity);
    this.masterguictx = masterguictx;

    LayoutInflater inflater = LayoutInflater.from(masterguictx.getActivity());
    detail = (LinearLayout) inflater.inflate(R.layout.item_stepdetail, null);
    detail.setTag(key);


    textViewStepDetailStepNumber = (TextView) detail.findViewById(R.id.textViewStepDetailStepNumber);
    textViewStepDetailStepTitle = (TextView) detail.findViewById(R.id.textViewStepDetailStepTitle);
    imageButtonStepDetailDoStep = (ImageButton) detail.findViewById(R.id.imageButtonStepDetailDoStep);
    imageButtonStepDetailDoStep.setOnClickListener(this);
    imageButtonStepDetailDoStep.setTag(key);
  }

  public static StepDetailGUI create(final RootActivity<VUCRoskildeBusinessContext, ExerciseStepGUI, ExerciseStepActionPoint, NavigationPoint> activity, ExerciseStepGUI masterguictx, Long key)
  {
    return new StepDetailGUI(activity, masterguictx, key);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonStepDetailDoStep: { activity.onAction(view, ExerciseStepActionPoint.CLICKCHILDSTEPDETAILDOSTEPIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      default: { throw new RuntimeException("Serious error in generated code: onClick not covered..."); } 
    }
  }

  @Override
  public void onItemSelected(final AdapterView<?> parent, final View view, final int pos, final long id)
  {
    switch (parent.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onItemSelected not covered..."); } 
    }
  }

  @Override
  public void onNothingSelected(final AdapterView<?> parent)
  {
    switch (parent.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onNothingSelected not covered..."); } 
    }
  }

  @Override
  public void onWheelSpin(final View view, final WheelAdapter adapter, final int pos)
  {
    switch (view.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onWheelSpin not covered..."); } 
    }
  }

  @Override
  public void onCheckedChanged(final CompoundButton button, final boolean isChecked)
  {
    switch (button.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onCheckedChanged not covered..."); } 
    }
  }

  @Override
  public boolean onCreateOptionsMenu(final Menu menu)
  {
    return activity.onCreateOptionsMenuSuper(menu);
  }

  @Override
  public boolean onOptionsItemSelected(final MenuItem item)
  {
    return activity.onOptionsItemSelectedSuper(item); 
  }

  @Override public ExerciseStepActionPoint getBack() { return ExerciseStepActionPoint.BACKEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getRefresh() { return ExerciseStepActionPoint.REFRESHEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getCreate() { return ExerciseStepActionPoint.CREATEEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getStart() { return ExerciseStepActionPoint.STARTEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getResume() { return ExerciseStepActionPoint.RESUMEEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getPause() { return ExerciseStepActionPoint.PAUSEEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getStop() { return ExerciseStepActionPoint.STOPEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getDestroy() { return ExerciseStepActionPoint.DESTROYEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getWindowFocusChanged() { return ExerciseStepActionPoint.WINDOWFOCUSCHANGEDEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getRestart() { return ExerciseStepActionPoint.RESTARTEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getNewIntent() { return ExerciseStepActionPoint.NEWINTENTEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getSaveInstanceState() { return ExerciseStepActionPoint.SAVEINSTANCESTATEEXERCISESTEP; } 

  @Override public ExerciseStepActionPoint getRestoreInstanceState() { return ExerciseStepActionPoint.RESTOREINSTANCESTATEEXERCISESTEP; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
