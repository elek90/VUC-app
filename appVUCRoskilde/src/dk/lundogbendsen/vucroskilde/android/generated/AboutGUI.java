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


public class AboutGUI extends CommonGUI<VUCRoskildeBusinessContext, AboutActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final TextView textViewAboutDescription;

  public AboutGUI(final RootActivity<VUCRoskildeBusinessContext, AboutGUI, AboutActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_about);

    textViewAboutDescription = (TextView) activity.findViewById(R.id.textViewAboutDescription);
  }

  public static AboutGUI create(final RootActivity<VUCRoskildeBusinessContext, AboutGUI, AboutActionPoint, NavigationPoint> activity)
  {
    return new AboutGUI(activity);
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

  @Override public AboutActionPoint getBack() { return AboutActionPoint.BACKABOUT; } 

  @Override public AboutActionPoint getRefresh() { return AboutActionPoint.REFRESHABOUT; } 

  @Override public AboutActionPoint getCreate() { return AboutActionPoint.CREATEABOUT; } 

  @Override public AboutActionPoint getStart() { return AboutActionPoint.STARTABOUT; } 

  @Override public AboutActionPoint getResume() { return AboutActionPoint.RESUMEABOUT; } 

  @Override public AboutActionPoint getPause() { return AboutActionPoint.PAUSEABOUT; } 

  @Override public AboutActionPoint getStop() { return AboutActionPoint.STOPABOUT; } 

  @Override public AboutActionPoint getDestroy() { return AboutActionPoint.DESTROYABOUT; } 

  @Override public AboutActionPoint getWindowFocusChanged() { return AboutActionPoint.WINDOWFOCUSCHANGEDABOUT; } 

  @Override public AboutActionPoint getRestart() { return AboutActionPoint.RESTARTABOUT; } 

  @Override public AboutActionPoint getNewIntent() { return AboutActionPoint.NEWINTENTABOUT; } 

  @Override public AboutActionPoint getSaveInstanceState() { return AboutActionPoint.SAVEINSTANCESTATEABOUT; } 

  @Override public AboutActionPoint getRestoreInstanceState() { return AboutActionPoint.RESTOREINSTANCESTATEABOUT; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
