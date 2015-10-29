/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.CommonViewDelegateRoot;
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


public abstract class ActionRecordImageViewDelegateRoot extends CommonViewDelegateRoot implements ActionRecordImageViewDelegate
{
  protected final ActionRecordImageRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final ActionRecordImageGUI guictx;
  protected ActionRecordImageViewDelegateRoot(final ActionRecordImageRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordImageGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public abstract void onViewClickActionRecordImageDoSelectImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickActionRecordImageDoRecordImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickActionRecordImageDoRegretImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickActionRecordImageDoSaveImageButton(final View view, final PayloadClick payload);

  @Override
  public void onViewBackActionRecordImage(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshActionRecordImage(final View view, final PayloadRefresh payload);

  @Override
  public abstract void onViewCreateActionRecordImage(final View view, final PayloadCreate payload);

  @Override
  public void onViewStartActionRecordImage(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeActionRecordImage(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionRecordImage(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopActionRecordImage(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroyActionRecordImage(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedActionRecordImage(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartActionRecordImage(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentActionRecordImage(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateActionRecordImage(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateActionRecordImage(final View view, final PayloadRestoreInstanceState payload)
  {
  }

  @Override
  public void onReturnFromExternalCameraOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExternalCameraRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ActionRecordImageViewDelegateContext.onReturnFromExternalCameraRetryManually not implemented");
  }

  @Override
  public void onReturnFromExternalCameraCancelled(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExternalGalleryOK(final Intent data)
  {
    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExternalGalleryRetryManually(final Intent data)
  {
    Log.wtf(TAG(), "ActionRecordImageViewDelegateContext.onReturnFromExternalGalleryRetryManually not implemented");
  }

  @Override
  public void onReturnFromExternalGalleryCancelled(final Intent data)
  {
    activity.refreshGUI();
  }
  public void goSubExternalCamera()
  {
    Log.wtf(TAG(), "Must be handcrafted....");
  }

  public void goSubExternalGallery()
  {
    Log.wtf(TAG(), "Must be handcrafted....");
  }

}
