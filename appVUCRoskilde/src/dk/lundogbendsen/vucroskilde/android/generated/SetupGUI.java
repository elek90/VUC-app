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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadCheck;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class SetupGUI extends CommonGUI<VUCRoskildeBusinessContext, SetupActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final CheckBox checkBoxSetupTeacher;
  public final TextView textViewSetupEmailLabel;
  public final EditText editTextSetupEmail;
  public final CheckBox checkBoxSetupHighQualityVideo;
  public final TextView textViewSetupMaxVideoSizeBytesLabel;
  public final EditText editTextSetupMaxVideoSizeBytes;

  public SetupGUI(final RootActivity<VUCRoskildeBusinessContext, SetupGUI, SetupActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_setup);

    checkBoxSetupTeacher = (CheckBox) activity.findViewById(R.id.checkBoxSetupTeacher);
    checkBoxSetupTeacher.setOnClickListener(this);
    textViewSetupEmailLabel = (TextView) activity.findViewById(R.id.textViewSetupEmailLabel);
    editTextSetupEmail = (EditText) activity.findViewById(R.id.editTextSetupEmail);
    checkBoxSetupHighQualityVideo = (CheckBox) activity.findViewById(R.id.checkBoxSetupHighQualityVideo);
    checkBoxSetupHighQualityVideo.setOnClickListener(this);
    textViewSetupMaxVideoSizeBytesLabel = (TextView) activity.findViewById(R.id.textViewSetupMaxVideoSizeBytesLabel);
    editTextSetupMaxVideoSizeBytes = (EditText) activity.findViewById(R.id.editTextSetupMaxVideoSizeBytes);
  }

  public static SetupGUI create(final RootActivity<VUCRoskildeBusinessContext, SetupGUI, SetupActionPoint, NavigationPoint> activity)
  {
    return new SetupGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.checkBoxSetupTeacher: { activity.onAction(view, SetupActionPoint.CLICKSETUPTEACHERCHECKBOX, PayloadCheck.create(-1, ((CheckBox)view).isChecked())); break; } 
      case R.id.checkBoxSetupHighQualityVideo: { activity.onAction(view, SetupActionPoint.CLICKSETUPHIGHQUALITYVIDEOCHECKBOX, PayloadCheck.create(-1, ((CheckBox)view).isChecked())); break; } 
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

  @Override public SetupActionPoint getBack() { return SetupActionPoint.BACKSETUP; } 

  @Override public SetupActionPoint getRefresh() { return SetupActionPoint.REFRESHSETUP; } 

  @Override public SetupActionPoint getCreate() { return SetupActionPoint.CREATESETUP; } 

  @Override public SetupActionPoint getStart() { return SetupActionPoint.STARTSETUP; } 

  @Override public SetupActionPoint getResume() { return SetupActionPoint.RESUMESETUP; } 

  @Override public SetupActionPoint getPause() { return SetupActionPoint.PAUSESETUP; } 

  @Override public SetupActionPoint getStop() { return SetupActionPoint.STOPSETUP; } 

  @Override public SetupActionPoint getDestroy() { return SetupActionPoint.DESTROYSETUP; } 

  @Override public SetupActionPoint getWindowFocusChanged() { return SetupActionPoint.WINDOWFOCUSCHANGEDSETUP; } 

  @Override public SetupActionPoint getRestart() { return SetupActionPoint.RESTARTSETUP; } 

  @Override public SetupActionPoint getNewIntent() { return SetupActionPoint.NEWINTENTSETUP; } 

  @Override public SetupActionPoint getSaveInstanceState() { return SetupActionPoint.SAVEINSTANCESTATESETUP; } 

  @Override public SetupActionPoint getRestoreInstanceState() { return SetupActionPoint.RESTOREINSTANCESTATESETUP; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
