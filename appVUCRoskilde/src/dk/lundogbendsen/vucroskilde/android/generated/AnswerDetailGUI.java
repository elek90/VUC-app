/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.content.Intent;
import android.view.LayoutInflater;
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
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class AnswerDetailGUI extends CommonGUI<VUCRoskildeBusinessContext, ActionSendReportActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final ActionSendReportGUI masterguictx;
  public final LinearLayout detail;
  public final TextView textViewAnswerDetailStepNumber;
  public final TextView textViewAnswerDetailStepTitle;
  public final ImageButton imageButtonAnswerDetailDoStep;
  public final ImageButton imageButtonAnswerDetailViewStep;
  public final ImageButton imageButtonAnswerDetailDeleteStep;

  public AnswerDetailGUI(final RootActivity<VUCRoskildeBusinessContext, ActionSendReportGUI, ActionSendReportActionPoint, NavigationPoint> activity, ActionSendReportGUI masterguictx, Long key)
  {
    super(activity);
    this.masterguictx = masterguictx;

    LayoutInflater inflater = LayoutInflater.from(masterguictx.getActivity());
    detail = (LinearLayout) inflater.inflate(R.layout.item_answerdetail, null);
    detail.setTag(key);


    textViewAnswerDetailStepNumber = (TextView) detail.findViewById(R.id.textViewAnswerDetailStepNumber);
    textViewAnswerDetailStepTitle = (TextView) detail.findViewById(R.id.textViewAnswerDetailStepTitle);
    imageButtonAnswerDetailDoStep = (ImageButton) detail.findViewById(R.id.imageButtonAnswerDetailDoStep);
    imageButtonAnswerDetailDoStep.setOnClickListener(this);
    imageButtonAnswerDetailDoStep.setTag(key);
    imageButtonAnswerDetailViewStep = (ImageButton) detail.findViewById(R.id.imageButtonAnswerDetailViewStep);
    imageButtonAnswerDetailViewStep.setOnClickListener(this);
    imageButtonAnswerDetailViewStep.setTag(key);
    imageButtonAnswerDetailDeleteStep = (ImageButton) detail.findViewById(R.id.imageButtonAnswerDetailDeleteStep);
    imageButtonAnswerDetailDeleteStep.setOnClickListener(this);
    imageButtonAnswerDetailDeleteStep.setTag(key);
  }

  public static AnswerDetailGUI create(final RootActivity<VUCRoskildeBusinessContext, ActionSendReportGUI, ActionSendReportActionPoint, NavigationPoint> activity, ActionSendReportGUI masterguictx, Long key)
  {
    return new AnswerDetailGUI(activity, masterguictx, key);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      case R.id.imageButtonAnswerDetailDoStep: { activity.onAction(view, ActionSendReportActionPoint.CLICKCHILDANSWERDETAILDOSTEPIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonAnswerDetailViewStep: { activity.onAction(view, ActionSendReportActionPoint.CLICKCHILDANSWERDETAILVIEWSTEPIMAGEBUTTON, PayloadClick.create(-1)); break; } 
      case R.id.imageButtonAnswerDetailDeleteStep: { activity.onAction(view, ActionSendReportActionPoint.CLICKCHILDANSWERDETAILDELETESTEPIMAGEBUTTON, PayloadClick.create(-1)); break; } 
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
