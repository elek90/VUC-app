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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ActionRecordImageGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionRecordImageActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final TextView textViewActionRecordImageText;
  public final ImageView imageViewActionRecordImageImage;
  public final ImageButton imageButtonActionRecordImageDoSelect;
  public final ImageButton imageButtonActionRecordImageDoRecord;
  public final ImageButton imageButtonActionRecordImageDoRegret;
  public final ImageButton imageButtonActionRecordImageDoSave;

  public ActionRecordImageGUI(final RootActivity<VUCRoskildeBusinessContext, ActionRecordImageGUI, ActionRecordImageActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionrecordimage);

    textViewActionRecordImageText = (TextView) activity.findViewById(R.id.textViewActionRecordImageText);
    imageViewActionRecordImageImage = (ImageView) activity.findViewById(R.id.imageViewActionRecordImageImage);
    imageButtonActionRecordImageDoSelect = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordImageDoSelect);
    imageButtonActionRecordImageDoSelect.setOnClickListener(this);
    imageButtonActionRecordImageDoRecord = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordImageDoRecord);
    imageButtonActionRecordImageDoRecord.setOnClickListener(this);
    imageButtonActionRecordImageDoRegret = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordImageDoRegret);
    imageButtonActionRecordImageDoRegret.setOnClickListener(this);
    imageButtonActionRecordImageDoSave = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordImageDoSave);
    imageButtonActionRecordImageDoSave.setOnClickListener(this);
  }

  public static ActionRecordImageGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionRecordImageGUI, ActionRecordImageActionPoint, NavigationPoint> activity)
  {
    return new ActionRecordImageGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonActionRecordImageDoSelect: { activity.onAction(view, ActionRecordImageActionPoint.CLICKACTIONRECORDIMAGEDOSELECTIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordImageDoRecord: { activity.onAction(view, ActionRecordImageActionPoint.CLICKACTIONRECORDIMAGEDORECORDIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordImageDoRegret: { activity.onAction(view, ActionRecordImageActionPoint.CLICKACTIONRECORDIMAGEDOREGRETIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordImageDoSave: { activity.onAction(view, ActionRecordImageActionPoint.CLICKACTIONRECORDIMAGEDOSAVEIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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

  @Override public ActionRecordImageActionPoint getBack() { return ActionRecordImageActionPoint.BACKACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getRefresh() { return ActionRecordImageActionPoint.REFRESHACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getCreate() { return ActionRecordImageActionPoint.CREATEACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getStart() { return ActionRecordImageActionPoint.STARTACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getResume() { return ActionRecordImageActionPoint.RESUMEACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getPause() { return ActionRecordImageActionPoint.PAUSEACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getStop() { return ActionRecordImageActionPoint.STOPACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getDestroy() { return ActionRecordImageActionPoint.DESTROYACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getWindowFocusChanged() { return ActionRecordImageActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getRestart() { return ActionRecordImageActionPoint.RESTARTACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getNewIntent() { return ActionRecordImageActionPoint.NEWINTENTACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getSaveInstanceState() { return ActionRecordImageActionPoint.SAVEINSTANCESTATEACTIONRECORDIMAGE; } 

  @Override public ActionRecordImageActionPoint getRestoreInstanceState() { return ActionRecordImageActionPoint.RESTOREINSTANCESTATEACTIONRECORDIMAGE; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
    NavigationPoint rc = NavigationPoint.values()[requestCode];
    activity.onReturn(rc, resultCode, data);
  }

}
