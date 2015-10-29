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


public class ActionShowAudioGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionShowAudioActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final ImageButton imageButtonActionShowAudioDoPlay;
  public final TextView textViewActionShowAudioText;

  public ActionShowAudioGUI(final RootActivity<VUCRoskildeBusinessContext, ActionShowAudioGUI, ActionShowAudioActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionshowaudio);

    imageButtonActionShowAudioDoPlay = (ImageButton) activity.findViewById(R.id.imageButtonActionShowAudioDoPlay);
    imageButtonActionShowAudioDoPlay.setOnClickListener(this);
    textViewActionShowAudioText = (TextView) activity.findViewById(R.id.textViewActionShowAudioText);
  }

  public static ActionShowAudioGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionShowAudioGUI, ActionShowAudioActionPoint, NavigationPoint> activity)
  {
    return new ActionShowAudioGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonActionShowAudioDoPlay: { activity.onAction(view, ActionShowAudioActionPoint.CLICKACTIONSHOWAUDIODOPLAYIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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

  @Override public ActionShowAudioActionPoint getBack() { return ActionShowAudioActionPoint.BACKACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getRefresh() { return ActionShowAudioActionPoint.REFRESHACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getCreate() { return ActionShowAudioActionPoint.CREATEACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getStart() { return ActionShowAudioActionPoint.STARTACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getResume() { return ActionShowAudioActionPoint.RESUMEACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getPause() { return ActionShowAudioActionPoint.PAUSEACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getStop() { return ActionShowAudioActionPoint.STOPACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getDestroy() { return ActionShowAudioActionPoint.DESTROYACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getWindowFocusChanged() { return ActionShowAudioActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getRestart() { return ActionShowAudioActionPoint.RESTARTACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getNewIntent() { return ActionShowAudioActionPoint.NEWINTENTACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getSaveInstanceState() { return ActionShowAudioActionPoint.SAVEINSTANCESTATEACTIONSHOWAUDIO; } 

  @Override public ActionShowAudioActionPoint getRestoreInstanceState() { return ActionShowAudioActionPoint.RESTOREINSTANCESTATEACTIONSHOWAUDIO; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
