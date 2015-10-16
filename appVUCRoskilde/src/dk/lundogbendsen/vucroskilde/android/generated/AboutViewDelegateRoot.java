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


public abstract class AboutViewDelegateRoot extends CommonViewDelegateRoot implements AboutViewDelegate
{
  protected final AboutRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final AboutGUI guictx;
  protected AboutViewDelegateRoot(final AboutRootActivity activity, final VUCRoskildeBusinessContext busctx, final AboutGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public void onViewBackAbout(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshAbout(final View view, final PayloadRefresh payload);

  @Override
  public abstract void onViewCreateAbout(final View view, final PayloadCreate payload);

  @Override
  public void onViewStartAbout(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeAbout(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseAbout(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopAbout(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroyAbout(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedAbout(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartAbout(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentAbout(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateAbout(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateAbout(final View view, final PayloadRestoreInstanceState payload)
  {
  }
}
