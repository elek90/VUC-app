/** THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android;

import android.app.Activity;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadNewIntent;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadRestart;
import dk.schoubo.library.android.ui.framework.PayloadRestoreInstanceState;
import dk.schoubo.library.android.ui.framework.PayloadResume;
import dk.schoubo.library.android.ui.framework.PayloadSaveInstanceState;
import dk.schoubo.library.android.ui.framework.PayloadStart;
import dk.schoubo.library.android.ui.framework.PayloadStop;
import dk.schoubo.library.android.ui.framework.PayloadWindowFocusChanged;


public class ActionSendReportViewDelegateContext extends ActionSendReportViewDelegateRoot
{

  private ActionSendReportXML action;

  private ActionSendReportViewDelegateContext(final ActionSendReportRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionSendReportGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionSendReportViewDelegate create(final ActionSendReportRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionSendReportGUI guictx)
  {
    return new ActionSendReportViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionSendReportDoSendImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewBackActionSendReport(final View view, final PayloadBack payload)
  {
    // TODO To be filled out by YOU   -- super contains   goReturn(Activity.RESULT_CANCELED);
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public void onViewRefreshActionSendReport(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getText());
   // TODO To be filled out by YOU
  }

  @Override
  public void onViewCreateActionSendReport(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionSendReportXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewStartActionSendReport(final View view, final PayloadStart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewResumeActionSendReport(final View view, final PayloadResume payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewPauseActionSendReport(final View view, final PayloadPause payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewStopActionSendReport(final View view, final PayloadStop payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewDestroyActionSendReport(final View view, final PayloadDestroy payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewWindowFocusChangedActionSendReport(final View view, final PayloadWindowFocusChanged payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestartActionSendReport(final View view, final PayloadRestart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewNewIntentActionSendReport(final View view, final PayloadNewIntent payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewSaveInstanceStateActionSendReport(final View view, final PayloadSaveInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestoreInstanceStateActionSendReport(final View view, final PayloadRestoreInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }



}
