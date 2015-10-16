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
import dk.lundogbendsen.vucroskilde.android.ExerciseOverviewViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseOverviewViewDelegate;
import dk.schoubo.library.android.ui.framework.Payload;
import dk.schoubo.library.android.ui.framework.PayloadBack;
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


public abstract class ExerciseOverviewRootActivity extends RootActivity<VUCRoskildeBusinessContext, ExerciseOverviewGUI, ExerciseOverviewActionPoint, NavigationPoint>
{

  private ExerciseOverviewViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ExerciseOverviewGUI.create(this);
    viewdelegatectx = ExerciseOverviewViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ExerciseOverviewActionPoint.CREATEEXERCISEOVERVIEW, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ExerciseOverviewActionPoint.STARTEXERCISEOVERVIEW, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ExerciseOverviewActionPoint.RESUMEEXERCISEOVERVIEW, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ExerciseOverviewActionPoint.PAUSEEXERCISEOVERVIEW, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ExerciseOverviewActionPoint.STOPEXERCISEOVERVIEW, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ExerciseOverviewActionPoint.DESTROYEXERCISEOVERVIEW, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ExerciseOverviewActionPoint.WINDOWFOCUSCHANGEDEXERCISEOVERVIEW, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ExerciseOverviewActionPoint.RESTARTEXERCISEOVERVIEW, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ExerciseOverviewActionPoint.NEWINTENTEXERCISEOVERVIEW, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ExerciseOverviewActionPoint.SAVEINSTANCESTATEEXERCISEOVERVIEW, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ExerciseOverviewActionPoint.RESTOREINSTANCESTATEEXERCISEOVERVIEW, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ExerciseOverviewActionPoint.REFRESHEXERCISEOVERVIEW, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ExerciseOverviewActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case BACKEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewBackExerciseOverview(view, (PayloadBack)payload);
        break;
      }
      case REFRESHEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewRefreshExerciseOverview(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewCreateExerciseOverview(view, (PayloadCreate)payload);
        break;
      }
      case STARTEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewStartExerciseOverview(view, (PayloadStart)payload);
        break;
      }
      case RESUMEEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewResumeExerciseOverview(view, (PayloadResume)payload);
        break;
      }
      case PAUSEEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewPauseExerciseOverview(view, (PayloadPause)payload);
        break;
      }
      case STOPEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewStopExerciseOverview(view, (PayloadStop)payload);
        break;
      }
      case DESTROYEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewDestroyExerciseOverview(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewWindowFocusChangedExerciseOverview(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewRestartExerciseOverview(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewNewIntentExerciseOverview(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewSaveInstanceStateExerciseOverview(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEEXERCISEOVERVIEW:
      {
        viewdelegatectx.onViewRestoreInstanceStateExerciseOverview(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ExerciseOverview since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
