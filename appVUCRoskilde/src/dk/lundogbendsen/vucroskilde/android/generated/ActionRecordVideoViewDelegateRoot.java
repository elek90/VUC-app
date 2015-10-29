/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.app.Activity;
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


public abstract class ActionRecordVideoViewDelegateRoot extends CommonViewDelegateRoot implements ActionRecordVideoViewDelegate
{
  protected final ActionRecordVideoRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final ActionRecordVideoGUI guictx;
  protected ActionRecordVideoViewDelegateRoot(final ActionRecordVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordVideoGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public abstract void onViewClickActionRecordVideoDoRecordImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickActionRecordVideoDoPlayImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickActionRecordVideoDoRegretImageButton(final View view, final PayloadClick payload);

  @Override
  public abstract void onViewClickActionRecordVideoDoSaveImageButton(final View view, final PayloadClick payload);

  @Override
  public void onViewBackActionRecordVideo(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshActionRecordVideo(final View view, final PayloadRefresh payload);

  @Override
  public abstract void onViewCreateActionRecordVideo(final View view, final PayloadCreate payload);

  @Override
  public void onViewStartActionRecordVideo(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeActionRecordVideo(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionRecordVideo(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopActionRecordVideo(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroyActionRecordVideo(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedActionRecordVideo(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartActionRecordVideo(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentActionRecordVideo(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateActionRecordVideo(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateActionRecordVideo(final View view, final PayloadRestoreInstanceState payload)
  {
  }
}
