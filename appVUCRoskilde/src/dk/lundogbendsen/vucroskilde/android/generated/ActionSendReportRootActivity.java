/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.ActionSendReportViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportViewDelegate;
import dk.schoubo.library.android.ui.framework.Payload;
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
import dk.schoubo.library.android.ui.framework.RootActivity;


public abstract class ActionSendReportRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionSendReportGUI, ActionSendReportActionPoint, NavigationPoint>
{

  private ActionSendReportViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionSendReportGUI.create(this);
    viewdelegatectx = ActionSendReportViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionSendReportActionPoint.CREATEACTIONSENDREPORT, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionSendReportActionPoint.STARTACTIONSENDREPORT, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionSendReportActionPoint.RESUMEACTIONSENDREPORT, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionSendReportActionPoint.PAUSEACTIONSENDREPORT, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionSendReportActionPoint.STOPACTIONSENDREPORT, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionSendReportActionPoint.DESTROYACTIONSENDREPORT, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionSendReportActionPoint.WINDOWFOCUSCHANGEDACTIONSENDREPORT, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionSendReportActionPoint.RESTARTACTIONSENDREPORT, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionSendReportActionPoint.NEWINTENTACTIONSENDREPORT, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionSendReportActionPoint.SAVEINSTANCESTATEACTIONSENDREPORT, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionSendReportActionPoint.RESTOREINSTANCESTATEACTIONSENDREPORT, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionSendReportActionPoint.REFRESHACTIONSENDREPORT, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionSendReportActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKACTIONSENDREPORTDOSENDIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionSendReportDoSendImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKCHILDANSWERDETAILDOSTEPIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickChildAnswerDetailDoStepImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKCHILDANSWERDETAILVIEWSTEPIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickChildAnswerDetailViewStepImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKCHILDANSWERDETAILDELETESTEPIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickChildAnswerDetailDeleteStepImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKACTIONSENDREPORT:
      {
        viewdelegatectx.onViewBackActionSendReport(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONSENDREPORT:
      {
        viewdelegatectx.onViewRefreshActionSendReport(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONSENDREPORT:
      {
        viewdelegatectx.onViewCreateActionSendReport(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONSENDREPORT:
      {
        viewdelegatectx.onViewStartActionSendReport(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONSENDREPORT:
      {
        viewdelegatectx.onViewResumeActionSendReport(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONSENDREPORT:
      {
        viewdelegatectx.onViewPauseActionSendReport(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONSENDREPORT:
      {
        viewdelegatectx.onViewStopActionSendReport(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONSENDREPORT:
      {
        viewdelegatectx.onViewDestroyActionSendReport(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONSENDREPORT:
      {
        viewdelegatectx.onViewWindowFocusChangedActionSendReport(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONSENDREPORT:
      {
        viewdelegatectx.onViewRestartActionSendReport(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONSENDREPORT:
      {
        viewdelegatectx.onViewNewIntentActionSendReport(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONSENDREPORT:
      {
        viewdelegatectx.onViewSaveInstanceStateActionSendReport(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONSENDREPORT:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionSendReport(view, (PayloadRestoreInstanceState)payload);
        break;
      }
    }
  }

  @Override
  public final void onReturn(final NavigationPoint requestCode, final int resultCode, final Intent data)
  {
    switch (requestCode)
    {
      default:
      {
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionSendReport since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
