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
import android.widget.VideoView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ActionShowVideoGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionShowVideoActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final VideoView videoViewActionShowVideoVideo;
  public final TextView textViewActionShowVideoText;

  public ActionShowVideoGUI(final RootActivity<VUCRoskildeBusinessContext, ActionShowVideoGUI, ActionShowVideoActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionshowvideo);

    videoViewActionShowVideoVideo = (VideoView) activity.findViewById(R.id.videoViewActionShowVideoVideo);
    textViewActionShowVideoText = (TextView) activity.findViewById(R.id.textViewActionShowVideoText);
  }

  public static ActionShowVideoGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionShowVideoGUI, ActionShowVideoActionPoint, NavigationPoint> activity)
  {
    return new ActionShowVideoGUI(activity);
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

  @Override public ActionShowVideoActionPoint getBack() { return ActionShowVideoActionPoint.BACKACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getRefresh() { return ActionShowVideoActionPoint.REFRESHACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getCreate() { return ActionShowVideoActionPoint.CREATEACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getStart() { return ActionShowVideoActionPoint.STARTACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getResume() { return ActionShowVideoActionPoint.RESUMEACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getPause() { return ActionShowVideoActionPoint.PAUSEACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getStop() { return ActionShowVideoActionPoint.STOPACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getDestroy() { return ActionShowVideoActionPoint.DESTROYACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getWindowFocusChanged() { return ActionShowVideoActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getRestart() { return ActionShowVideoActionPoint.RESTARTACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getNewIntent() { return ActionShowVideoActionPoint.NEWINTENTACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getSaveInstanceState() { return ActionShowVideoActionPoint.SAVEINSTANCESTATEACTIONSHOWVIDEO; } 

  @Override public ActionShowVideoActionPoint getRestoreInstanceState() { return ActionShowVideoActionPoint.RESTOREINSTANCESTATEACTIONSHOWVIDEO; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
