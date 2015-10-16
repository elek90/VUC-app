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
import dk.lundogbendsen.vucroskilde.android.ActionShowTextViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextViewDelegate;
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


public abstract class ActionShowTextRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionShowTextGUI, ActionShowTextActionPoint, NavigationPoint>
{

  private ActionShowTextViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionShowTextGUI.create(this);
    viewdelegatectx = ActionShowTextViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionShowTextActionPoint.CREATEACTIONSHOWTEXT, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionShowTextActionPoint.STARTACTIONSHOWTEXT, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionShowTextActionPoint.RESUMEACTIONSHOWTEXT, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionShowTextActionPoint.PAUSEACTIONSHOWTEXT, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionShowTextActionPoint.STOPACTIONSHOWTEXT, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionShowTextActionPoint.DESTROYACTIONSHOWTEXT, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionShowTextActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWTEXT, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionShowTextActionPoint.RESTARTACTIONSHOWTEXT, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionShowTextActionPoint.NEWINTENTACTIONSHOWTEXT, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionShowTextActionPoint.SAVEINSTANCESTATEACTIONSHOWTEXT, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionShowTextActionPoint.RESTOREINSTANCESTATEACTIONSHOWTEXT, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionShowTextActionPoint.REFRESHACTIONSHOWTEXT, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionShowTextActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case BACKACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewBackActionShowText(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewRefreshActionShowText(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewCreateActionShowText(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewStartActionShowText(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewResumeActionShowText(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewPauseActionShowText(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewStopActionShowText(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewDestroyActionShowText(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewWindowFocusChangedActionShowText(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewRestartActionShowText(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewNewIntentActionShowText(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewSaveInstanceStateActionShowText(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONSHOWTEXT:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionShowText(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionShowText since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
