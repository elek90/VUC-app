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
import dk.lundogbendsen.vucroskilde.android.ActionRecordImageViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageViewDelegate;
import dk.schoubo.library.android.LibraryConstants;
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


public abstract class ActionRecordImageRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionRecordImageGUI, ActionRecordImageActionPoint, NavigationPoint>
{

  private ActionRecordImageViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionRecordImageGUI.create(this);
    viewdelegatectx = ActionRecordImageViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionRecordImageActionPoint.CREATEACTIONRECORDIMAGE, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionRecordImageActionPoint.STARTACTIONRECORDIMAGE, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionRecordImageActionPoint.RESUMEACTIONRECORDIMAGE, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionRecordImageActionPoint.PAUSEACTIONRECORDIMAGE, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionRecordImageActionPoint.STOPACTIONRECORDIMAGE, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionRecordImageActionPoint.DESTROYACTIONRECORDIMAGE, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionRecordImageActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDIMAGE, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionRecordImageActionPoint.RESTARTACTIONRECORDIMAGE, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionRecordImageActionPoint.NEWINTENTACTIONRECORDIMAGE, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionRecordImageActionPoint.SAVEINSTANCESTATEACTIONRECORDIMAGE, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionRecordImageActionPoint.RESTOREINSTANCESTATEACTIONRECORDIMAGE, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionRecordImageActionPoint.REFRESHACTIONRECORDIMAGE, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionRecordImageActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKACTIONRECORDIMAGEDOSELECTIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordImageDoSelectImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDIMAGEDORECORDIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordImageDoRecordImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDIMAGEDOREGRETIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordImageDoRegretImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDIMAGEDOSAVEIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordImageDoSaveImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewBackActionRecordImage(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewRefreshActionRecordImage(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewCreateActionRecordImage(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewStartActionRecordImage(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewResumeActionRecordImage(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewPauseActionRecordImage(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewStopActionRecordImage(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewDestroyActionRecordImage(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewWindowFocusChangedActionRecordImage(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewRestartActionRecordImage(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewNewIntentActionRecordImage(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewSaveInstanceStateActionRecordImage(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONRECORDIMAGE:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionRecordImage(view, (PayloadRestoreInstanceState)payload);
        break;
      }
    }
  }

  @Override
  public final void onReturn(final NavigationPoint requestCode, final int resultCode, final Intent data)
  {
    switch (requestCode)
    {
      case EXTERNALIMAGECAMERA:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromExternalImageCameraOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromExternalImageCameraRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromExternalImageCameraCancelled(data);
            break;
          }
        }
        break;
      }
      case EXTERNALIMAGEGALLERY:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromExternalImageGalleryOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromExternalImageGalleryRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromExternalImageGalleryCancelled(data);
            break;
          }
        }
        break;
      }
      default:
      {
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionRecordImage since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
