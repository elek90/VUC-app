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
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ActionRecordAudioGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionRecordAudioActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final TextView textViewActionRecordAudioCaption;
  public final ImageButton imageButtonActionRecordAudioDoRecord;
  public final ImageButton imageButtonActionRecordAudioDoPlay;
  public final ImageButton imageButtonActionRecordAudioDoRegret;
  public final ImageButton imageButtonActionRecordAudioDoSave;

  public ActionRecordAudioGUI(final RootActivity<VUCRoskildeBusinessContext, ActionRecordAudioGUI, ActionRecordAudioActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionrecordaudio);

    textViewActionRecordAudioCaption = (TextView) activity.findViewById(R.id.textViewActionRecordAudioCaption);
    imageButtonActionRecordAudioDoRecord = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordAudioDoRecord);
    imageButtonActionRecordAudioDoRecord.setOnClickListener(this);
    imageButtonActionRecordAudioDoPlay = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordAudioDoPlay);
    imageButtonActionRecordAudioDoPlay.setOnClickListener(this);
    imageButtonActionRecordAudioDoRegret = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordAudioDoRegret);
    imageButtonActionRecordAudioDoRegret.setOnClickListener(this);
    imageButtonActionRecordAudioDoSave = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordAudioDoSave);
    imageButtonActionRecordAudioDoSave.setOnClickListener(this);
  }

  public static ActionRecordAudioGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionRecordAudioGUI, ActionRecordAudioActionPoint, NavigationPoint> activity)
  {
    return new ActionRecordAudioGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonActionRecordAudioDoRecord: { activity.onAction(view, ActionRecordAudioActionPoint.CLICKACTIONRECORDAUDIODORECORDIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordAudioDoPlay: { activity.onAction(view, ActionRecordAudioActionPoint.CLICKACTIONRECORDAUDIODOPLAYIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordAudioDoRegret: { activity.onAction(view, ActionRecordAudioActionPoint.CLICKACTIONRECORDAUDIODOREGRETIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordAudioDoSave: { activity.onAction(view, ActionRecordAudioActionPoint.CLICKACTIONRECORDAUDIODOSAVEIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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

  @Override public ActionRecordAudioActionPoint getBack() { return ActionRecordAudioActionPoint.BACKACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getRefresh() { return ActionRecordAudioActionPoint.REFRESHACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getCreate() { return ActionRecordAudioActionPoint.CREATEACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getStart() { return ActionRecordAudioActionPoint.STARTACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getResume() { return ActionRecordAudioActionPoint.RESUMEACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getPause() { return ActionRecordAudioActionPoint.PAUSEACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getStop() { return ActionRecordAudioActionPoint.STOPACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getDestroy() { return ActionRecordAudioActionPoint.DESTROYACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getWindowFocusChanged() { return ActionRecordAudioActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getRestart() { return ActionRecordAudioActionPoint.RESTARTACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getNewIntent() { return ActionRecordAudioActionPoint.NEWINTENTACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getSaveInstanceState() { return ActionRecordAudioActionPoint.SAVEINSTANCESTATEACTIONRECORDAUDIO; } 

  @Override public ActionRecordAudioActionPoint getRestoreInstanceState() { return ActionRecordAudioActionPoint.RESTOREINSTANCESTATEACTIONRECORDAUDIO; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
