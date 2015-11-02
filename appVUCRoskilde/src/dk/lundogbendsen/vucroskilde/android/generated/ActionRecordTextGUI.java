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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ActionRecordTextGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionRecordTextActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final TextView textViewActionRecordTextCaption;
  public final EditText editTextActionRecordTextText;
  public final ImageButton imageButtonActionRecordTextDoRegret;
  public final ImageButton imageButtonActionRecordTextDoSave;

  public ActionRecordTextGUI(final RootActivity<VUCRoskildeBusinessContext, ActionRecordTextGUI, ActionRecordTextActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionrecordtext);

    textViewActionRecordTextCaption = (TextView) activity.findViewById(R.id.textViewActionRecordTextCaption);
    editTextActionRecordTextText = (EditText) activity.findViewById(R.id.editTextActionRecordTextText);
    imageButtonActionRecordTextDoRegret = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordTextDoRegret);
    imageButtonActionRecordTextDoRegret.setOnClickListener(this);
    imageButtonActionRecordTextDoSave = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordTextDoSave);
    imageButtonActionRecordTextDoSave.setOnClickListener(this);
  }

  public static ActionRecordTextGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionRecordTextGUI, ActionRecordTextActionPoint, NavigationPoint> activity)
  {
    return new ActionRecordTextGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonActionRecordTextDoRegret: { activity.onAction(view, ActionRecordTextActionPoint.CLICKACTIONRECORDTEXTDOREGRETIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordTextDoSave: { activity.onAction(view, ActionRecordTextActionPoint.CLICKACTIONRECORDTEXTDOSAVEIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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

  @Override public ActionRecordTextActionPoint getBack() { return ActionRecordTextActionPoint.BACKACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getRefresh() { return ActionRecordTextActionPoint.REFRESHACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getCreate() { return ActionRecordTextActionPoint.CREATEACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getStart() { return ActionRecordTextActionPoint.STARTACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getResume() { return ActionRecordTextActionPoint.RESUMEACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getPause() { return ActionRecordTextActionPoint.PAUSEACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getStop() { return ActionRecordTextActionPoint.STOPACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getDestroy() { return ActionRecordTextActionPoint.DESTROYACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getWindowFocusChanged() { return ActionRecordTextActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getRestart() { return ActionRecordTextActionPoint.RESTARTACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getNewIntent() { return ActionRecordTextActionPoint.NEWINTENTACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getSaveInstanceState() { return ActionRecordTextActionPoint.SAVEINSTANCESTATEACTIONRECORDTEXT; } 

  @Override public ActionRecordTextActionPoint getRestoreInstanceState() { return ActionRecordTextActionPoint.RESTOREINSTANCESTATEACTIONRECORDTEXT; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
