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
import dk.lundogbendsen.vucroskilde.android.ActionRecordVideoViewDelegateContext;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoViewDelegate;
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


public abstract class ActionRecordVideoRootActivity extends RootActivity<VUCRoskildeBusinessContext, ActionRecordVideoGUI, ActionRecordVideoActionPoint, NavigationPoint>
{

  private ActionRecordVideoViewDelegate viewdelegatectx;



  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    guictx = ActionRecordVideoGUI.create(this);
    viewdelegatectx = ActionRecordVideoViewDelegateContext.create(this, busctx, guictx);

    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
    }

    onAction(null, ActionRecordVideoActionPoint.CREATEACTIONRECORDVIDEO, PayloadCreate.create(savedInstanceState));
  }


  @Override
  public void onStart()
  {
    super.onStart();
    onAction(null, ActionRecordVideoActionPoint.STARTACTIONRECORDVIDEO, PayloadStart.create());
  }

  @Override
  public void onResume()
  {
    super.onResume();
    onAction(null, ActionRecordVideoActionPoint.RESUMEACTIONRECORDVIDEO, PayloadResume.create());
  }

  @Override
  public void onPause()
  {
    super.onPause();
    onAction(null, ActionRecordVideoActionPoint.PAUSEACTIONRECORDVIDEO, PayloadPause.create());
  }

  @Override
  public void onStop()
  {
    super.onStop();
    onAction(null, ActionRecordVideoActionPoint.STOPACTIONRECORDVIDEO, PayloadStop.create());
  }

  @Override
  public void onDestroy()
  {
    super.onDestroy();
    onAction(null, ActionRecordVideoActionPoint.DESTROYACTIONRECORDVIDEO, PayloadDestroy.create());
  }

  @Override
  public void onWindowFocusChanged(final boolean hasFocus)
  {
    super.onWindowFocusChanged(hasFocus);
    onAction(null, ActionRecordVideoActionPoint.WINDOWFOCUSCHANGEDACTIONRECORDVIDEO, PayloadWindowFocusChanged.create(hasFocus));
  }

  @Override
  public void onRestart()
  {
    super.onRestart();
    onAction(null, ActionRecordVideoActionPoint.RESTARTACTIONRECORDVIDEO, PayloadRestart.create());
  }

  @Override
  public void onNewIntent(final Intent intent)
  {
    super.onNewIntent(intent);
    onAction(null, ActionRecordVideoActionPoint.NEWINTENTACTIONRECORDVIDEO, PayloadNewIntent.create(intent));
  }

  @Override
  public void onSaveInstanceState(final Bundle instanceState)
  {
    super.onSaveInstanceState(instanceState);
    onAction(null, ActionRecordVideoActionPoint.SAVEINSTANCESTATEACTIONRECORDVIDEO, PayloadSaveInstanceState.create(instanceState));
  }

  @Override
  public void onRestoreInstanceState(final Bundle instanceState)
  {
    super.onRestoreInstanceState(instanceState);
    onAction(null, ActionRecordVideoActionPoint.RESTOREINSTANCESTATEACTIONRECORDVIDEO, PayloadRestoreInstanceState.create(instanceState));
  }
  @Override
  public final void refreshGUI()
  {
    onAction(null, ActionRecordVideoActionPoint.REFRESHACTIONRECORDVIDEO, PayloadRefresh.create());
  }

  @Override
  public final void onAction(final View view, final ActionRecordVideoActionPoint actionpoint, final Payload payload)
  {
    switch (actionpoint)
    {
      case CLICKACTIONRECORDVIDEODOSELECTIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordVideoDoSelectImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDVIDEODORECORDIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordVideoDoRecordImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDVIDEODOPLAYIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordVideoDoPlayImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDVIDEODOREGRETIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordVideoDoRegretImageButton(view, (PayloadClick)payload);
        break;
      }
      case CLICKACTIONRECORDVIDEODOSAVEIMAGEBUTTON:
      {
        viewdelegatectx.onViewClickActionRecordVideoDoSaveImageButton(view, (PayloadClick)payload);
        break;
      }
      case BACKACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewBackActionRecordVideo(view, (PayloadBack)payload);
        break;
      }
      case REFRESHACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewRefreshActionRecordVideo(view, (PayloadRefresh)payload);
        break;
      }
      case CREATEACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewCreateActionRecordVideo(view, (PayloadCreate)payload);
        break;
      }
      case STARTACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewStartActionRecordVideo(view, (PayloadStart)payload);
        break;
      }
      case RESUMEACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewResumeActionRecordVideo(view, (PayloadResume)payload);
        break;
      }
      case PAUSEACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewPauseActionRecordVideo(view, (PayloadPause)payload);
        break;
      }
      case STOPACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewStopActionRecordVideo(view, (PayloadStop)payload);
        break;
      }
      case DESTROYACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewDestroyActionRecordVideo(view, (PayloadDestroy)payload);
        break;
      }
      case WINDOWFOCUSCHANGEDACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewWindowFocusChangedActionRecordVideo(view, (PayloadWindowFocusChanged)payload);
        break;
      }
      case RESTARTACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewRestartActionRecordVideo(view, (PayloadRestart)payload);
        break;
      }
      case NEWINTENTACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewNewIntentActionRecordVideo(view, (PayloadNewIntent)payload);
        break;
      }
      case SAVEINSTANCESTATEACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewSaveInstanceStateActionRecordVideo(view, (PayloadSaveInstanceState)payload);
        break;
      }
      case RESTOREINSTANCESTATEACTIONRECORDVIDEO:
      {
        viewdelegatectx.onViewRestoreInstanceStateActionRecordVideo(view, (PayloadRestoreInstanceState)payload);
        break;
      }
    }
  }

  @Override
  public final void onReturn(final NavigationPoint requestCode, final int resultCode, final Intent data)
  {
    switch (requestCode)
    {
      case EXTERNALVIDEOCAMERA:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromExternalVideoCameraOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromExternalVideoCameraRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromExternalVideoCameraCancelled(data);
            break;
          }
        }
        break;
      }
      case EXTERNALVIDEOGALLERY:
      {
        switch (resultCode)
        {
          case LibraryConstants.RESULT_OK:
          {
            viewdelegatectx.onReturnFromExternalVideoGalleryOK(data);
            break;
          }
          case LibraryConstants.RESULT_RETRY_MANUALLY:
          {
            viewdelegatectx.onReturnFromExternalVideoGalleryRetryManually(data);
            break;
          }
          case LibraryConstants.RESULT_CANCELED:
          {
            viewdelegatectx.onReturnFromExternalVideoGalleryCancelled(data);
            break;
          }
        }
        break;
      }
      default:
      {
        Log.wtf(TAG(), "Navigation to "+requestCode+" should never return to the Activity ActionRecordVideo since that Activity did not declare it?");
        finish();
        break;
      }
    }
    refreshGUI();
  }

}
