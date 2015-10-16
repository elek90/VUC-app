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


public abstract class ActionShowVideoViewDelegateRoot extends CommonViewDelegateRoot implements ActionShowVideoViewDelegate
{
  protected final ActionShowVideoRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final ActionShowVideoGUI guictx;
  protected ActionShowVideoViewDelegateRoot(final ActionShowVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowVideoGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public void onViewBackActionShowVideo(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshActionShowVideo(final View view, final PayloadRefresh payload);

  @Override
  public abstract void onViewCreateActionShowVideo(final View view, final PayloadCreate payload);

  @Override
  public void onViewStartActionShowVideo(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeActionShowVideo(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionShowVideo(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopActionShowVideo(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroyActionShowVideo(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedActionShowVideo(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartActionShowVideo(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentActionShowVideo(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateActionShowVideo(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateActionShowVideo(final View view, final PayloadRestoreInstanceState payload)
  {
  }
}
