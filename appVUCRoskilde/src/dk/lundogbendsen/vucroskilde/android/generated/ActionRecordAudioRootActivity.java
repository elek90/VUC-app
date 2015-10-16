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
import dk.lundogbendsen.vucroskilde.android.ActionRecordAudioViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioViewDelegate;
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


public abstract class ActionRecordAudioRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionRecordAudioGUI, ActionRecordAudioActionPoint, NavigationPoint>
{

  private ActionRecordAudioViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionRecordAudioGUI.create(this);
    viewdelegatectx = ActionRecordAudioViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionRecordAudioActionPoint.CREATEACTIONRECORDAUDIO, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionRecordAudioActionPoint.STARTACTIONRECORDAUDIO, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionRecordAudioActionPoint.RESUMEACTIONRECORDAUDIO, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionRecordAudioActionPoint.PAUSEACTIONRECORDAUDIO, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionRecordAudioActionPoint.STOPACTIONRECORDAUDIO, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionRecordAudioActionPoint.DESTROYACTIONRECORDAUDIO, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionRecordAudioActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDAUDIO, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionRecordAudioActionPoint.RESTARTACTIONRECORDAUDIO, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionRecordAudioActionPoint.NEWINTENTACTIONRECORDAUDIO, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionRecordAudioActionPoint.SAVEINSTANCESTATEACTIONRECORDAUDIO, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionRecordAudioActionPoint.RESTOREINSTANCESTATEACTIONRECORDAUDIO, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionRecordAudioActionPoint.REFRESHACTIONRECORDAUDIO, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionRecordAudioActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKACTIONRECORDAUDIODORECORDIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordAudioDoRecordImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDAUDIODOPLAYIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordAudioDoPlayImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDAUDIODOREGRETIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordAudioDoRegretImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDAUDIODOSAVEIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordAudioDoSaveImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewBackActionRecordAudio(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewRefreshActionRecordAudio(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewCreateActionRecordAudio(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewStartActionRecordAudio(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewResumeActionRecordAudio(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewPauseActionRecordAudio(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewStopActionRecordAudio(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewDestroyActionRecordAudio(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewWindowFocusChangedActionRecordAudio(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewRestartActionRecordAudio(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewNewIntentActionRecordAudio(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewSaveInstanceStateActionRecordAudio(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONRECORDAUDIO:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionRecordAudio(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionRecordAudio since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
