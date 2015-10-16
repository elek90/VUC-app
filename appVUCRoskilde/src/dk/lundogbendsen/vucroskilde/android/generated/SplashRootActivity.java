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
import dk.lundogbendsen.vucroskilde.android.SplashViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.SplashViewDelegate;
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


public abstract class SplashRootActivity extends RootActivity<VUCRoskildeBusinessContext, SplashGUI, SplashActionPoint, NavigationPoint>
{

  private SplashViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = SplashGUI.create(this);
    viewdelegatectx = SplashViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, SplashActionPoint.CREATESPLASH, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, SplashActionPoint.STARTSPLASH, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, SplashActionPoint.RESUMESPLASH, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, SplashActionPoint.PAUSESPLASH, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, SplashActionPoint.STOPSPLASH, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, SplashActionPoint.DESTROYSPLASH, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, SplashActionPoint.WINDOWFOCUSCHANGEDSPLASH, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, SplashActionPoint.RESTARTSPLASH, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, SplashActionPoint.NEWINTENTSPLASH, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, SplashActionPoint.SAVEINSTANCESTATESPLASH, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, SplashActionPoint.RESTOREINSTANCESTATESPLASH, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, SplashActionPoint.REFRESHSPLASH, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final SplashActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case BACKSPLASH:
      {
        viewdelegatectx.onViewBackSplash(view, (PayloadBack)payload);
        break;
      }
      case REFRESHSPLASH:
      {
        viewdelegatectx.onViewRefreshSplash(view, (PayloadRefresh)payload);
        break;
      }
      case CREATESPLASH:
      {
        viewdelegatectx.onViewCreateSplash(view, (PayloadCreate)payload);
        break;
      }
      case STARTSPLASH:
      {
        viewdelegatectx.onViewStartSplash(view, (PayloadStart)payload);
        break;
      }
      case RESUMESPLASH:
      {
        viewdelegatectx.onViewResumeSplash(view, (PayloadResume)payload);
        break;
      }
      case PAUSESPLASH:
      {
        viewdelegatectx.onViewPauseSplash(view, (PayloadPause)payload);
        break;
      }
      case STOPSPLASH:
      {
        viewdelegatectx.onViewStopSplash(view, (PayloadStop)payload);
        break;
      }
      case DESTROYSPLASH:
      {
        viewdelegatectx.onViewDestroySplash(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDSPLASH:
      {
        viewdelegatectx.onViewWindowFocusChangedSplash(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTSPLASH:
      {
        viewdelegatectx.onViewRestartSplash(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTSPLASH:
      {
        viewdelegatectx.onViewNewIntentSplash(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATESPLASH:
      {
        viewdelegatectx.onViewSaveInstanceStateSplash(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATESPLASH:
      {
        viewdelegatectx.onViewRestoreInstanceStateSplash(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity Splash since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
