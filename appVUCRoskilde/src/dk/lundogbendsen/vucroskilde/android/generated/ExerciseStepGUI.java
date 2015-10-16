/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
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
import dk.schoubo.library.android.ui.framework.PayloadMenu;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ExerciseStepGUI extends CommonGUI<VUCRoskildeBusinessContext, ExerciseStepActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final LinearLayout linearLayoutExerciseStepExerciseStep;
  public final TextView textViewExerciseStepExerciseTitle;
  public final TextView textViewExerciseStepPreviousTitle;
  public final ImageButton imageButtonExerciseStepDoPrevious;
  public final TextView textViewExerciseStepNextTitle;
  public final ImageButton imageButtonExerciseStepDoNext;
  public final LinearLayout linearLayoutExerciseStepNextPrevious;

  public ExerciseStepGUI(final RootActivity<VUCRoskildeBusinessContext, ExerciseStepGUI, ExerciseStepActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_exercisestep);

    linearLayoutExerciseStepExerciseStep = (LinearLayout) activity.findViewById(R.id.linearLayoutExerciseStepExerciseStep);
    textViewExerciseStepExerciseTitle = (TextView) activity.findViewById(R.id.textViewExerciseStepExerciseTitle);
    textViewExerciseStepPreviousTitle = (TextView) activity.findViewById(R.id.textViewExerciseStepPreviousTitle);
    imageButtonExerciseStepDoPrevious = (ImageButton) activity.findViewById(R.id.imageButtonExerciseStepDoPrevious);
    imageButtonExerciseStepDoPrevious.setOnClickListener(this);
    textViewExerciseStepNextTitle = (TextView) activity.findViewById(R.id.textViewExerciseStepNextTitle);
    imageButtonExerciseStepDoNext = (ImageButton) activity.findViewById(R.id.imageButtonExerciseStepDoNext);
    imageButtonExerciseStepDoNext.setOnClickListener(this);
    linearLayoutExerciseStepNextPrevious = (LinearLayout) activity.findViewById(R.id.linearLayoutExerciseStepNextPrevious);
  }

  public static ExerciseStepGUI create(final RootActivity<VUCRoskildeBusinessContext, ExerciseStepGUI, ExerciseStepActionPoint, NavigationPoint> activity)
  {
    return new ExerciseStepGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonExerciseStepDoPrevious: { activity.onAction(view, ExerciseStepActionPoint.CLICKEXERCISESTEPDOPREVIOUSIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonExerciseStepDoNext: { activity.onAction(view, ExerciseStepActionPoint.CLICKEXERCISESTEPDONEXTIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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
    MenuInflater inflater = activity.getMenuInflater();
    inflater.inflate(R.menu.menu_exercisestep, menu);
    return activity.onCreateOptionsMenuSuper(menu);
  }

  @Override
  public boolean onOptionsItemSelected(final MenuItem item)
  {
    switch (item.getItemId())
    {
      case R.id.menuItemExerciseStepShowOverview: { activity.onAction(null, ExerciseStepActionPoint.CLICKEXERCISESTEPSHOWOVERVIEWMENUITEM, PayloadMenu.create()); break; } 
      default: { break; } 
    }
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
    NavigationPoint rc = NavigationPoint.values()[requestCode];
    activity.onReturn(rc, resultCode, data);
  }

}
