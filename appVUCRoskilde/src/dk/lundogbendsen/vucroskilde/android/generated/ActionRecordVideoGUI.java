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
import android.widget.VideoView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ActionRecordVideoGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionRecordVideoActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final VideoView videoViewActionRecordVideoVideo;
  public final TextView textViewActionRecordVideoText;
  public final ImageButton imageButtonActionRecordVideoDoRecord;
  public final ImageButton imageButtonActionRecordVideoDoPlay;
  public final ImageButton imageButtonActionRecordVideoDoRegret;
  public final ImageButton imageButtonActionRecordVideoDoSave;

  public ActionRecordVideoGUI(final RootActivity<VUCRoskildeBusinessContext, ActionRecordVideoGUI, ActionRecordVideoActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionrecordvideo);

    videoViewActionRecordVideoVideo = (VideoView) activity.findViewById(R.id.videoViewActionRecordVideoVideo);
    textViewActionRecordVideoText = (TextView) activity.findViewById(R.id.textViewActionRecordVideoText);
    imageButtonActionRecordVideoDoRecord = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordVideoDoRecord);
    imageButtonActionRecordVideoDoRecord.setOnClickListener(this);
    imageButtonActionRecordVideoDoPlay = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordVideoDoPlay);
    imageButtonActionRecordVideoDoPlay.setOnClickListener(this);
    imageButtonActionRecordVideoDoRegret = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordVideoDoRegret);
    imageButtonActionRecordVideoDoRegret.setOnClickListener(this);
    imageButtonActionRecordVideoDoSave = (ImageButton) activity.findViewById(R.id.imageButtonActionRecordVideoDoSave);
    imageButtonActionRecordVideoDoSave.setOnClickListener(this);
  }

  public static ActionRecordVideoGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionRecordVideoGUI, ActionRecordVideoActionPoint, NavigationPoint> activity)
  {
    return new ActionRecordVideoGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonActionRecordVideoDoRecord: { activity.onAction(view, ActionRecordVideoActionPoint.CLICKACTIONRECORDVIDEODORECORDIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordVideoDoPlay: { activity.onAction(view, ActionRecordVideoActionPoint.CLICKACTIONRECORDVIDEODOPLAYIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordVideoDoRegret: { activity.onAction(view, ActionRecordVideoActionPoint.CLICKACTIONRECORDVIDEODOREGRETIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonActionRecordVideoDoSave: { activity.onAction(view, ActionRecordVideoActionPoint.CLICKACTIONRECORDVIDEODOSAVEIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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

  @Override public ActionRecordVideoActionPoint getBack() { return ActionRecordVideoActionPoint.BACKACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getRefresh() { return ActionRecordVideoActionPoint.REFRESHACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getCreate() { return ActionRecordVideoActionPoint.CREATEACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getStart() { return ActionRecordVideoActionPoint.STARTACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getResume() { return ActionRecordVideoActionPoint.RESUMEACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getPause() { return ActionRecordVideoActionPoint.PAUSEACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getStop() { return ActionRecordVideoActionPoint.STOPACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getDestroy() { return ActionRecordVideoActionPoint.DESTROYACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getWindowFocusChanged() { return ActionRecordVideoActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getRestart() { return ActionRecordVideoActionPoint.RESTARTACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getNewIntent() { return ActionRecordVideoActionPoint.NEWINTENTACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getSaveInstanceState() { return ActionRecordVideoActionPoint.SAVEINSTANCESTATEACTIONRECORDVIDEO; } 

  @Override public ActionRecordVideoActionPoint getRestoreInstanceState() { return ActionRecordVideoActionPoint.RESTOREINSTANCESTATEACTIONRECORDVIDEO; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
