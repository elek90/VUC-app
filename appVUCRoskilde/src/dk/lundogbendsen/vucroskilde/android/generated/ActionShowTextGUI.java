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
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ActionShowTextGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionShowTextActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final TextView textViewActionShowTextCaption;
  public final TextView textViewActionShowTextText;

  public ActionShowTextGUI(final RootActivity<VUCRoskildeBusinessContext, ActionShowTextGUI, ActionShowTextActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionshowtext);

    textViewActionShowTextCaption = (TextView) activity.findViewById(R.id.textViewActionShowTextCaption);
    textViewActionShowTextText = (TextView) activity.findViewById(R.id.textViewActionShowTextText);
  }

  public static ActionShowTextGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionShowTextGUI, ActionShowTextActionPoint, NavigationPoint> activity)
  {
    return new ActionShowTextGUI(activity);
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

  @Override public ActionShowTextActionPoint getBack() { return ActionShowTextActionPoint.BACKACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getRefresh() { return ActionShowTextActionPoint.REFRESHACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getCreate() { return ActionShowTextActionPoint.CREATEACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getStart() { return ActionShowTextActionPoint.STARTACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getResume() { return ActionShowTextActionPoint.RESUMEACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getPause() { return ActionShowTextActionPoint.PAUSEACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getStop() { return ActionShowTextActionPoint.STOPACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getDestroy() { return ActionShowTextActionPoint.DESTROYACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getWindowFocusChanged() { return ActionShowTextActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getRestart() { return ActionShowTextActionPoint.RESTARTACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getNewIntent() { return ActionShowTextActionPoint.NEWINTENTACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getSaveInstanceState() { return ActionShowTextActionPoint.SAVEINSTANCESTATEACTIONSHOWTEXT; } 

  @Override public ActionShowTextActionPoint getRestoreInstanceState() { return ActionShowTextActionPoint.RESTOREINSTANCESTATEACTIONSHOWTEXT; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
