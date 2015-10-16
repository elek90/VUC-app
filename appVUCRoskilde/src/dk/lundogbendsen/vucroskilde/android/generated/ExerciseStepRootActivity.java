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
import dk.lundogbendsen.vucroskilde.android.ExerciseStepViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseStepViewDelegate;
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


public abstract class ExerciseStepRootActivity extends RootActivity<VUCRoskildeBusinessContext, ExerciseStepGUI, ExerciseStepActionPoint, NavigationPoint>
{

  private ExerciseStepViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ExerciseStepGUI.create(this);
    viewdelegatectx = ExerciseStepViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ExerciseStepActionPoint.CREATEEXERCISESTEP, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ExerciseStepActionPoint.STARTEXERCISESTEP, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ExerciseStepActionPoint.RESUMEEXERCISESTEP, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ExerciseStepActionPoint.PAUSEEXERCISESTEP, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ExerciseStepActionPoint.STOPEXERCISESTEP, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ExerciseStepActionPoint.DESTROYEXERCISESTEP, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ExerciseStepActionPoint.WINDOWFOCUSCHANGEDEXERCISESTEP, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ExerciseStepActionPoint.RESTARTEXERCISESTEP, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ExerciseStepActionPoint.NEWINTENTEXERCISESTEP, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ExerciseStepActionPoint.SAVEINSTANCESTATEEXERCISESTEP, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ExerciseStepActionPoint.RESTOREINSTANCESTATEEXERCISESTEP, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ExerciseStepActionPoint.REFRESHEXERCISESTEP, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ExerciseStepActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKEXERCISESTEPDOPREVIOUSIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickExerciseStepDoPreviousImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKEXERCISESTEPDONEXTIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickExerciseStepDoNextImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKEXERCISESTEPSHOWOVERVIEWMENUITEM:
      {
        viewdelegatectx.onViewClickExerciseStepShowOverviewMenuItem(view, (PayloadMenu)payload);
        break;
      }
      case CLICKCHILDSTEPDETAILDOSTEPIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickChildStepDetailDoStepImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKEXERCISESTEP:
      {
        viewdelegatectx.onViewBackExerciseStep(view, (PayloadBack)payload);
        break;
      }
      case REFRESHEXERCISESTEP:
      {
        viewdelegatectx.onViewRefreshExerciseStep(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEEXERCISESTEP:
      {
        viewdelegatectx.onViewCreateExerciseStep(view, (PayloadCreate)payload);
        break;
      }
      case STARTEXERCISESTEP:
      {
        viewdelegatectx.onViewStartExerciseStep(view, (PayloadStart)payload);
        break;
      }
      case RESUMEEXERCISESTEP:
      {
        viewdelegatectx.onViewResumeExerciseStep(view, (PayloadResume)payload);
        break;
      }
      case PAUSEEXERCISESTEP:
      {
        viewdelegatectx.onViewPauseExerciseStep(view, (PayloadPause)payload);
        break;
      }
      case STOPEXERCISESTEP:
      {
        viewdelegatectx.onViewStopExerciseStep(view, (PayloadStop)payload);
        break;
      }
      case DESTROYEXERCISESTEP:
      {
        viewdelegatectx.onViewDestroyExerciseStep(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDEXERCISESTEP:
      {
        viewdelegatectx.onViewWindowFocusChangedExerciseStep(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTEXERCISESTEP:
      {
        viewdelegatectx.onViewRestartExerciseStep(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTEXERCISESTEP:
      {
        viewdelegatectx.onViewNewIntentExerciseStep(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEEXERCISESTEP:
      {
        viewdelegatectx.onViewSaveInstanceStateExerciseStep(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEEXERCISESTEP:
      {
        viewdelegatectx.onViewRestoreInstanceStateExerciseStep(view, (PayloadRestoreInstanceState)payload);
        break;
      }
    }
  }

  @Override
  public final void onReturn(final NavigationPoint requestCode, final int resultCode, final Intent data)
  {
    switch (requestCode)
    {
      case EXERCISEOVERVIEW:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromExerciseOverviewOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromExerciseOverviewRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromExerciseOverviewCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONSHOWVIDEO:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionShowVideoOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionShowVideoRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionShowVideoCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONSHOWTEXT:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionShowTextOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionShowTextRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionShowTextCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONSHOWAUDIO:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionShowAudioOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionShowAudioRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionShowAudioCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONSHOWIMAGE:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionShowImageOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionShowImageRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionShowImageCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONRECORDVIDEO:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionRecordVideoOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionRecordVideoRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionRecordVideoCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONRECORDTEXT:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionRecordTextOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionRecordTextRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionRecordTextCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONRECORDAUDIO:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionRecordAudioOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionRecordAudioRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionRecordAudioCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONRECORDIMAGE:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionRecordImageOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionRecordImageRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionRecordImageCancelled(data);
            break;
          }
        }
        break;
      }
      case ACTIONSENDREPORT:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromActionSendReportOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromActionSendReportRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromActionSendReportCancelled(data);
            break;
          }
        }
        break;
      }
      default:
      {
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ExerciseStep since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
