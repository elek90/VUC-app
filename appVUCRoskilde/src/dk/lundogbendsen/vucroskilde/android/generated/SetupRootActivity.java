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
import dk.lundogbendsen.vucroskilde.android.SetupViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.SetupViewDelegate;
import dk.schoubo.library.android.ui.framework.Payload;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadCheck;
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


public abstract class SetupRootActivity extends RootActivity<VUCRoskildeBusinessContext, SetupGUI, SetupActionPoint, NavigationPoint>
{

  private SetupViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = SetupGUI.create(this);
    viewdelegatectx = SetupViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, SetupActionPoint.CREATESETUP, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, SetupActionPoint.STARTSETUP, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, SetupActionPoint.RESUMESETUP, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, SetupActionPoint.PAUSESETUP, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, SetupActionPoint.STOPSETUP, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, SetupActionPoint.DESTROYSETUP, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, SetupActionPoint.WINDOWFOCUSCHANGEDSETUP, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, SetupActionPoint.RESTARTSETUP, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, SetupActionPoint.NEWINTENTSETUP, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, SetupActionPoint.SAVEINSTANCESTATESETUP, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, SetupActionPoint.RESTOREINSTANCESTATESETUP, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, SetupActionPoint.REFRESHSETUP, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final SetupActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKSETUPTEACHERCHECKBOX:
      {
        viewdelegatectx.onViewClickSetupTeacherCheckBox(view, (PayloadCheck)payload);
        break;
      }
      case BACKSETUP:
      {
        viewdelegatectx.onViewBackSetup(view, (PayloadBack)payload);
        break;
      }
      case REFRESHSETUP:
      {
        viewdelegatectx.onViewRefreshSetup(view, (PayloadRefresh)payload);
        break;
      }
      case CREATESETUP:
      {
        viewdelegatectx.onViewCreateSetup(view, (PayloadCreate)payload);
        break;
      }
      case STARTSETUP:
      {
        viewdelegatectx.onViewStartSetup(view, (PayloadStart)payload);
        break;
      }
      case RESUMESETUP:
      {
        viewdelegatectx.onViewResumeSetup(view, (PayloadResume)payload);
        break;
      }
      case PAUSESETUP:
      {
        viewdelegatectx.onViewPauseSetup(view, (PayloadPause)payload);
        break;
      }
      case STOPSETUP:
      {
        viewdelegatectx.onViewStopSetup(view, (PayloadStop)payload);
        break;
      }
      case DESTROYSETUP:
      {
        viewdelegatectx.onViewDestroySetup(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDSETUP:
      {
        viewdelegatectx.onViewWindowFocusChangedSetup(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTSETUP:
      {
        viewdelegatectx.onViewRestartSetup(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTSETUP:
      {
        viewdelegatectx.onViewNewIntentSetup(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATESETUP:
      {
        viewdelegatectx.onViewSaveInstanceStateSetup(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATESETUP:
      {
        viewdelegatectx.onViewRestoreInstanceStateSetup(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity Setup since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
