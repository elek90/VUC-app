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
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ExerciseOverviewGUI extends CommonGUI<VUCRoskildeBusinessContext, ExerciseOverviewActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final ImageView imageViewExerciseOverviewExerciseOverview;
  public final TextView textViewExerciseOverviewExerciseTitle;
  public final TextView textViewExerciseOverviewExerciseStep;

  public ExerciseOverviewGUI(final RootActivity<VUCRoskildeBusinessContext, ExerciseOverviewGUI, ExerciseOverviewActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_exerciseoverview);

    imageViewExerciseOverviewExerciseOverview = (ImageView) activity.findViewById(R.id.imageViewExerciseOverviewExerciseOverview);
    textViewExerciseOverviewExerciseTitle = (TextView) activity.findViewById(R.id.textViewExerciseOverviewExerciseTitle);
    textViewExerciseOverviewExerciseStep = (TextView) activity.findViewById(R.id.textViewExerciseOverviewExerciseStep);
  }

  public static ExerciseOverviewGUI create(final RootActivity<VUCRoskildeBusinessContext, ExerciseOverviewGUI, ExerciseOverviewActionPoint, NavigationPoint> activity)
  {
    return new ExerciseOverviewGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
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

  @Override public ExerciseOverviewActionPoint getBack() { return ExerciseOverviewActionPoint.BACKEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getRefresh() { return ExerciseOverviewActionPoint.REFRESHEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getCreate() { return ExerciseOverviewActionPoint.CREATEEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getStart() { return ExerciseOverviewActionPoint.STARTEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getResume() { return ExerciseOverviewActionPoint.RESUMEEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getPause() { return ExerciseOverviewActionPoint.PAUSEEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getStop() { return ExerciseOverviewActionPoint.STOPEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getDestroy() { return ExerciseOverviewActionPoint.DESTROYEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getWindowFocusChanged() { return ExerciseOverviewActionPoint.WINDOWFOCUSCHANGEDEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getRestart() { return ExerciseOverviewActionPoint.RESTARTEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getNewIntent() { return ExerciseOverviewActionPoint.NEWINTENTEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getSaveInstanceState() { return ExerciseOverviewActionPoint.SAVEINSTANCESTATEEXERCISEOVERVIEW; } 

  @Override public ExerciseOverviewActionPoint getRestoreInstanceState() { return ExerciseOverviewActionPoint.RESTOREINSTANCESTATEEXERCISEOVERVIEW; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
