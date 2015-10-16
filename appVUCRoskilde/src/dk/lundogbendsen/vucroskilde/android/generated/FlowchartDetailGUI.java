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


public class FlowchartDetailGUI extends CommonGUI<VUCRoskildeBusinessContext, FlowchartMainActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final FlowchartMainGUI masterguictx;
  public final LinearLayout detail;
  public final TextView textViewFlowchartDetailFlowchartTitle;
  public final ImageButton imageButtonFlowchartDetailDoExercise;

  public FlowchartDetailGUI(final RootActivity<VUCRoskildeBusinessContext, FlowchartMainGUI, FlowchartMainActionPoint, NavigationPoint> activity, FlowchartMainGUI masterguictx, Long key)
  {
    super(activity);
    this.masterguictx = masterguictx;

    LayoutInflater inflater = LayoutInflater.from(masterguictx.getActivity());
    detail = (LinearLayout) inflater.inflate(R.layout.item_flowchartdetail, null);
    detail.setTag(key);


    textViewFlowchartDetailFlowchartTitle = (TextView) detail.findViewById(R.id.textViewFlowchartDetailFlowchartTitle);
    imageButtonFlowchartDetailDoExercise = (ImageButton) detail.findViewById(R.id.imageButtonFlowchartDetailDoExercise);
    imageButtonFlowchartDetailDoExercise.setOnClickListener(this);
    imageButtonFlowchartDetailDoExercise.setTag(key);
  }

  public static FlowchartDetailGUI create(final RootActivity<VUCRoskildeBusinessContext, FlowchartMainGUI, FlowchartMainActionPoint, NavigationPoint> activity, FlowchartMainGUI masterguictx, Long key)
  {
    return new FlowchartDetailGUI(activity, masterguictx, key);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonFlowchartDetailDoExercise: { activity.onAction(view, FlowchartMainActionPoint.CLICKCHILDFLOWCHARTDETAILDOEXERCISEIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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

  @Override public FlowchartMainActionPoint getBack() { return FlowchartMainActionPoint.BACKFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getRefresh() { return FlowchartMainActionPoint.REFRESHFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getCreate() { return FlowchartMainActionPoint.CREATEFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getStart() { return FlowchartMainActionPoint.STARTFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getResume() { return FlowchartMainActionPoint.RESUMEFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getPause() { return FlowchartMainActionPoint.PAUSEFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getStop() { return FlowchartMainActionPoint.STOPFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getDestroy() { return FlowchartMainActionPoint.DESTROYFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getWindowFocusChanged() { return FlowchartMainActionPoint.WINDOWFOCUSCHANGEDFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getRestart() { return FlowchartMainActionPoint.RESTARTFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getNewIntent() { return FlowchartMainActionPoint.NEWINTENTFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getSaveInstanceState() { return FlowchartMainActionPoint.SAVEINSTANCESTATEFLOWCHARTMAIN; } 

  @Override public FlowchartMainActionPoint getRestoreInstanceState() { return FlowchartMainActionPoint.RESTOREINSTANCESTATEFLOWCHARTMAIN; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
    NavigationPoint rc = NavigationPoint.values()[requestCode];
    activity.onReturn(rc, resultCode, data);
  }

}
