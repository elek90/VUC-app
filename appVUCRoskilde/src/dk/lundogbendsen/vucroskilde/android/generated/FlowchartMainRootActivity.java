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
import dk.lundogbendsen.vucroskilde.android.FlowchartMainViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartMainViewDelegate;
import dk.schoubo.library.android.LibraryConstants;
import dk.schoubo.library.android.ui.framework.Payload;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadMenu;
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


public abstract class FlowchartMainRootActivity extends RootActivity<VUCRoskildeBusinessContext, FlowchartMainGUI, FlowchartMainActionPoint, NavigationPoint>
{

  private FlowchartMainViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = FlowchartMainGUI.create(this);
    viewdelegatectx = FlowchartMainViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, FlowchartMainActionPoint.CREATEFLOWCHARTMAIN, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, FlowchartMainActionPoint.STARTFLOWCHARTMAIN, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, FlowchartMainActionPoint.RESUMEFLOWCHARTMAIN, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, FlowchartMainActionPoint.PAUSEFLOWCHARTMAIN, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, FlowchartMainActionPoint.STOPFLOWCHARTMAIN, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, FlowchartMainActionPoint.DESTROYFLOWCHARTMAIN, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, FlowchartMainActionPoint.WINDOWFOCUSCHANGEDFLOWCHARTMAIN, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, FlowchartMainActionPoint.RESTARTFLOWCHARTMAIN, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, FlowchartMainActionPoint.NEWINTENTFLOWCHARTMAIN, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, FlowchartMainActionPoint.SAVEINSTANCESTATEFLOWCHARTMAIN, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, FlowchartMainActionPoint.RESTOREINSTANCESTATEFLOWCHARTMAIN, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, FlowchartMainActionPoint.REFRESHFLOWCHARTMAIN, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final FlowchartMainActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKFLOWCHARTMAINSETUPMENUITEM:
      {
        viewdelegatectx.onViewClickFlowchartMainSetupMenuItem(view, (PayloadMenu)payload);
        break;
      }
      case CLICKFLOWCHARTMAINABOUTMENUITEM:
      {
        viewdelegatectx.onViewClickFlowchartMainAboutMenuItem(view, (PayloadMenu)payload);
        break;
      }
      case CLICKCHILDFLOWCHARTDETAILDOEXERCISEIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickChildFlowchartDetailDoExerciseImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewBackFlowchartMain(view, (PayloadBack)payload);
        break;
      }
      case REFRESHFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewRefreshFlowchartMain(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewCreateFlowchartMain(view, (PayloadCreate)payload);
        break;
      }
      case STARTFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewStartFlowchartMain(view, (PayloadStart)payload);
        break;
      }
      case RESUMEFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewResumeFlowchartMain(view, (PayloadResume)payload);
        break;
      }
      case PAUSEFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewPauseFlowchartMain(view, (PayloadPause)payload);
        break;
      }
      case STOPFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewStopFlowchartMain(view, (PayloadStop)payload);
        break;
      }
      case DESTROYFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewDestroyFlowchartMain(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewWindowFocusChangedFlowchartMain(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewRestartFlowchartMain(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewNewIntentFlowchartMain(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewSaveInstanceStateFlowchartMain(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEFLOWCHARTMAIN:
      {
        viewdelegatectx.onViewRestoreInstanceStateFlowchartMain(view, (PayloadRestoreInstanceState)payload);
        break;
      }
    }
  }

  @Override
  public final void onReturn(final NavigationPoint requestCode, final int resultCode, final Intent data)
  {
    switch (requestCode)
    {
      case SETUP:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromSetupOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromSetupRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromSetupCancelled(data);
            break;
          }
        }
        break;
      }
      case ABOUT:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromAboutOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromAboutRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromAboutCancelled(data);
            break;
          }
        }
        break;
      }
      case SPLASH:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromSplashOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromSplashRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromSplashCancelled(data);
            break;
          }
        }
        break;
      }
      case EXERCISESTEP:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromExerciseStepOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromExerciseStepRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromExerciseStepCancelled(data);
            break;
          }
        }
        break;
      }
      default:
      {
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity FlowchartMain since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
