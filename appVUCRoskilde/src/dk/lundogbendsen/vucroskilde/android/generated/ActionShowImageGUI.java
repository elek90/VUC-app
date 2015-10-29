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


public class ActionShowImageGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionShowImageActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final ImageView imageViewActionShowImageImage;
  public final TextView textViewActionShowImageText;

  public ActionShowImageGUI(final RootActivity<VUCRoskildeBusinessContext, ActionShowImageGUI, ActionShowImageActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionshowimage);

    imageViewActionShowImageImage = (ImageView) activity.findViewById(R.id.imageViewActionShowImageImage);
    textViewActionShowImageText = (TextView) activity.findViewById(R.id.textViewActionShowImageText);
  }

  public static ActionShowImageGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionShowImageGUI, ActionShowImageActionPoint, NavigationPoint> activity)
  {
    return new ActionShowImageGUI(activity);
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

  @Override public ActionShowImageActionPoint getBack() { return ActionShowImageActionPoint.BACKACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getRefresh() { return ActionShowImageActionPoint.REFRESHACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getCreate() { return ActionShowImageActionPoint.CREATEACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getStart() { return ActionShowImageActionPoint.STARTACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getResume() { return ActionShowImageActionPoint.RESUMEACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getPause() { return ActionShowImageActionPoint.PAUSEACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getStop() { return ActionShowImageActionPoint.STOPACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getDestroy() { return ActionShowImageActionPoint.DESTROYACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getWindowFocusChanged() { return ActionShowImageActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getRestart() { return ActionShowImageActionPoint.RESTARTACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getNewIntent() { return ActionShowImageActionPoint.NEWINTENTACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getSaveInstanceState() { return ActionShowImageActionPoint.SAVEINSTANCESTATEACTIONSHOWIMAGE; } 

  @Override public ActionShowImageActionPoint getRestoreInstanceState() { return ActionShowImageActionPoint.RESTOREINSTANCESTATEACTIONSHOWIMAGE; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
