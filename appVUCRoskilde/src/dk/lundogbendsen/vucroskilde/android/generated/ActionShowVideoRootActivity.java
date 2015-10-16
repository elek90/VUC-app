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
import dk.lundogbendsen.vucroskilde.android.ActionShowVideoViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoViewDelegate;
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


public abstract class ActionShowVideoRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionShowVideoGUI, ActionShowVideoActionPoint, NavigationPoint>
{

  private ActionShowVideoViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionShowVideoGUI.create(this);
    viewdelegatectx = ActionShowVideoViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionShowVideoActionPoint.CREATEACTIONSHOWVIDEO, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionShowVideoActionPoint.STARTACTIONSHOWVIDEO, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionShowVideoActionPoint.RESUMEACTIONSHOWVIDEO, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionShowVideoActionPoint.PAUSEACTIONSHOWVIDEO, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionShowVideoActionPoint.STOPACTIONSHOWVIDEO, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionShowVideoActionPoint.DESTROYACTIONSHOWVIDEO, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionShowVideoActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWVIDEO, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionShowVideoActionPoint.RESTARTACTIONSHOWVIDEO, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionShowVideoActionPoint.NEWINTENTACTIONSHOWVIDEO, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionShowVideoActionPoint.SAVEINSTANCESTATEACTIONSHOWVIDEO, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionShowVideoActionPoint.RESTOREINSTANCESTATEACTIONSHOWVIDEO, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionShowVideoActionPoint.REFRESHACTIONSHOWVIDEO, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionShowVideoActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case BACKACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewBackActionShowVideo(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewRefreshActionShowVideo(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewCreateActionShowVideo(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewStartActionShowVideo(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewResumeActionShowVideo(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewPauseActionShowVideo(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewStopActionShowVideo(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewDestroyActionShowVideo(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewWindowFocusChangedActionShowVideo(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewRestartActionShowVideo(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewNewIntentActionShowVideo(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewSaveInstanceStateActionShowVideo(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONSHOWVIDEO:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionShowVideo(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionShowVideo since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
