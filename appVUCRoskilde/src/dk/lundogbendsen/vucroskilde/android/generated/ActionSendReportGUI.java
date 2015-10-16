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
import android.widget.LinearLayout;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class ActionSendReportGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionSendReportActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final LinearLayout linearLayoutActionSendReportAnswers;
  public final ImageButton imageButtonActionSendReportDoSend;

  public ActionSendReportGUI(final RootActivity<VUCRoskildeBusinessContext, ActionSendReportGUI, ActionSendReportActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_actionsendreport);

    linearLayoutActionSendReportAnswers = (LinearLayout) activity.findViewById(R.id.linearLayoutActionSendReportAnswers);
    imageButtonActionSendReportDoSend = (ImageButton) activity.findViewById(R.id.imageButtonActionSendReportDoSend);
    imageButtonActionSendReportDoSend.setOnClickListener(this);
  }

  public static ActionSendReportGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionSendReportGUI, ActionSendReportActionPoint, NavigationPoint> activity)
  {
    return new ActionSendReportGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonActionSendReportDoSend: { activity.onAction(view, ActionSendReportActionPoint.CLICKACTIONSENDREPORTDOSENDIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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

  @Override public ActionSendReportActionPoint getBack() { return ActionSendReportActionPoint.BACKACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getRefresh() { return ActionSendReportActionPoint.REFRESHACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getCreate() { return ActionSendReportActionPoint.CREATEACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getStart() { return ActionSendReportActionPoint.STARTACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getResume() { return ActionSendReportActionPoint.RESUMEACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getPause() { return ActionSendReportActionPoint.PAUSEACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getStop() { return ActionSendReportActionPoint.STOPACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getDestroy() { return ActionSendReportActionPoint.DESTROYACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getWindowFocusChanged() { return ActionSendReportActionPoint.WINDOWFOCUSCHANGEDACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getRestart() { return ActionSendReportActionPoint.RESTARTACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getNewIntent() { return ActionSendReportActionPoint.NEWINTENTACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getSaveInstanceState() { return ActionSendReportActionPoint.SAVEINSTANCESTATEACTIONSENDREPORT; } 

  @Override public ActionSendReportActionPoint getRestoreInstanceState() { return ActionSendReportActionPoint.RESTOREINSTANCESTATEACTIONSENDREPORT; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
