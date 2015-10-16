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
import dk.lundogbendsen.vucroskilde.android.AboutViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.AboutViewDelegate;
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


public abstract class AboutRootActivity extends RootActivity<VUCRoskildeBusinessContext, AboutGUI, AboutActionPoint, NavigationPoint>
{

  private AboutViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = AboutGUI.create(this);
    viewdelegatectx = AboutViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, AboutActionPoint.CREATEABOUT, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, AboutActionPoint.STARTABOUT, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, AboutActionPoint.RESUMEABOUT, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, AboutActionPoint.PAUSEABOUT, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, AboutActionPoint.STOPABOUT, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, AboutActionPoint.DESTROYABOUT, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, AboutActionPoint.WINDOWFOCUSCHANGEDABOUT, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, AboutActionPoint.RESTARTABOUT, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, AboutActionPoint.NEWINTENTABOUT, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, AboutActionPoint.SAVEINSTANCESTATEABOUT, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, AboutActionPoint.RESTOREINSTANCESTATEABOUT, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, AboutActionPoint.REFRESHABOUT, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final AboutActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case BACKABOUT:
      {
        viewdelegatectx.onViewBackAbout(view, (PayloadBack)payload);
        break;
      }
      case REFRESHABOUT:
      {
        viewdelegatectx.onViewRefreshAbout(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEABOUT:
      {
        viewdelegatectx.onViewCreateAbout(view, (PayloadCreate)payload);
        break;
      }
      case STARTABOUT:
      {
        viewdelegatectx.onViewStartAbout(view, (PayloadStart)payload);
        break;
      }
      case RESUMEABOUT:
      {
        viewdelegatectx.onViewResumeAbout(view, (PayloadResume)payload);
        break;
      }
      case PAUSEABOUT:
      {
        viewdelegatectx.onViewPauseAbout(view, (PayloadPause)payload);
        break;
      }
      case STOPABOUT:
      {
        viewdelegatectx.onViewStopAbout(view, (PayloadStop)payload);
        break;
      }
      case DESTROYABOUT:
      {
        viewdelegatectx.onViewDestroyAbout(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDABOUT:
      {
        viewdelegatectx.onViewWindowFocusChangedAbout(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTABOUT:
      {
        viewdelegatectx.onViewRestartAbout(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTABOUT:
      {
        viewdelegatectx.onViewNewIntentAbout(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEABOUT:
      {
        viewdelegatectx.onViewSaveInstanceStateAbout(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEABOUT:
      {
        viewdelegatectx.onViewRestoreInstanceStateAbout(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity About since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
