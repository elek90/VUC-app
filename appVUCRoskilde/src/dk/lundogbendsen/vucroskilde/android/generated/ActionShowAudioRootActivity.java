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
import dk.lundogbendsen.vucroskilde.android.ActionShowAudioViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioViewDelegate;
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


public abstract class ActionShowAudioRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionShowAudioGUI, ActionShowAudioActionPoint, NavigationPoint>
{

  private ActionShowAudioViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionShowAudioGUI.create(this);
    viewdelegatectx = ActionShowAudioViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionShowAudioActionPoint.CREATEACTIONSHOWAUDIO, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionShowAudioActionPoint.STARTACTIONSHOWAUDIO, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionShowAudioActionPoint.RESUMEACTIONSHOWAUDIO, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionShowAudioActionPoint.PAUSEACTIONSHOWAUDIO, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionShowAudioActionPoint.STOPACTIONSHOWAUDIO, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionShowAudioActionPoint.DESTROYACTIONSHOWAUDIO, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionShowAudioActionPoint.WINDOWFOCUSCHANGEDACTIONSHOWAUDIO, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionShowAudioActionPoint.RESTARTACTIONSHOWAUDIO, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionShowAudioActionPoint.NEWINTENTACTIONSHOWAUDIO, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionShowAudioActionPoint.SAVEINSTANCESTATEACTIONSHOWAUDIO, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionShowAudioActionPoint.RESTOREINSTANCESTATEACTIONSHOWAUDIO, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionShowAudioActionPoint.REFRESHACTIONSHOWAUDIO, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionShowAudioActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKACTIONSHOWAUDIODOPLAYIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionShowAudioDoPlayImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewBackActionShowAudio(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewRefreshActionShowAudio(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewCreateActionShowAudio(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewStartActionShowAudio(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewResumeActionShowAudio(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewPauseActionShowAudio(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewStopActionShowAudio(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewDestroyActionShowAudio(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewWindowFocusChangedActionShowAudio(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewRestartActionShowAudio(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewNewIntentActionShowAudio(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewSaveInstanceStateActionShowAudio(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONSHOWAUDIO:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionShowAudio(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionShowAudio since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
