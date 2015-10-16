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
import dk.lundogbendsen.vucroskilde.android.ActionRecordTextViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextViewDelegate;
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


public abstract class ActionRecordTextRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionRecordTextGUI, ActionRecordTextActionPoint, NavigationPoint>
{

  private ActionRecordTextViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionRecordTextGUI.create(this);
    viewdelegatectx = ActionRecordTextViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionRecordTextActionPoint.CREATEACTIONRECORDTEXT, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionRecordTextActionPoint.STARTACTIONRECORDTEXT, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionRecordTextActionPoint.RESUMEACTIONRECORDTEXT, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionRecordTextActionPoint.PAUSEACTIONRECORDTEXT, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionRecordTextActionPoint.STOPACTIONRECORDTEXT, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionRecordTextActionPoint.DESTROYACTIONRECORDTEXT, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionRecordTextActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDTEXT, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionRecordTextActionPoint.RESTARTACTIONRECORDTEXT, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionRecordTextActionPoint.NEWINTENTACTIONRECORDTEXT, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionRecordTextActionPoint.SAVEINSTANCESTATEACTIONRECORDTEXT, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionRecordTextActionPoint.RESTOREINSTANCESTATEACTIONRECORDTEXT, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionRecordTextActionPoint.REFRESHACTIONRECORDTEXT, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionRecordTextActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKACTIONRECORDTEXTDOREGRETIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordTextDoRegretImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDTEXTDOSAVEIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordTextDoSaveImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewBackActionRecordText(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewRefreshActionRecordText(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewCreateActionRecordText(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewStartActionRecordText(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewResumeActionRecordText(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewPauseActionRecordText(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewStopActionRecordText(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewDestroyActionRecordText(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewWindowFocusChangedActionRecordText(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewRestartActionRecordText(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewNewIntentActionRecordText(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewSaveInstanceStateActionRecordText(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONRECORDTEXT:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionRecordText(view, (PayloadRestoreInstanceState)payload);
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
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionRecordText since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
