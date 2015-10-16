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
import dk.lundogbendsen.vucroskilde.android.ActionShowImageViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageViewDelegate;
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


public abstract class ActionShowImageRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionShowImageGUI, ActionShowImageActionPoint, NavigationPoint>
{

  private ActionShowImageViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionShowImageGUI.create(this);
    viewdelegatectx = ActionShowImageViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionShowImageActionPoint.CREATEACTIONSHOWIMAGE, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionShowImageActionPoint.STARTACTIONSHOWIMAGE, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionShowImageActionPoint.RESUMEACTIONSHOWIMAGE, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionShowImageActionPoint.PAUSEACTIONSHOWIMAGE, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionShowImageActionPoint.STOPACTIONSHOWIMAGE, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionShowImageActionPoint.DESTROYACTIONSHOWIMAGE, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionShowImageActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWIMAGE, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionShowImageActionPoint.RESTARTACTIONSHOWIMAGE, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionShowImageActionPoint.NEWINTENTACTIONSHOWIMAGE, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionShowImageActionPoint.SAVEINSTANCESTATEACTIONSHOWIMAGE, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionShowImageActionPoint.RESTOREINSTANCESTATEACTIONSHOWIMAGE, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionShowImageActionPoint.REFRESHACTIONSHOWIMAGE, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionShowImageActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case BACKACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewBackActionShowImage(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewRefreshActionShowImage(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewCreateActionShowImage(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewStartActionShowImage(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewResumeActionShowImage(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewPauseActionShowImage(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewStopActionShowImage(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewDestroyActionShowImage(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewWindowFocusChangedActionShowImage(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewRestartActionShowImage(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewNewIntentActionShowImage(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewSaveInstanceStateActionShowImage(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONSHOWIMAGE:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionShowImage(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionShowImage since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
