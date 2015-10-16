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
import dk.schoubo.library.android.ui.framework.PayloadCheck;
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


public abstract class SetupViewDelegateRoot extends CommonViewDelegateRoot implements SetupViewDelegate
{
  protected final SetupRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final SetupGUI guictx;
  protected SetupViewDelegateRoot(final SetupRootActivity activity, final VUCRoskildeBusinessContext busctx, final SetupGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public abstract void onViewClickSetupTeacherCheckBox(final View view, final PayloadCheck payload);

  @Override
  public void onViewBackSetup(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshSetup(final View view, final PayloadRefresh payload);

  @Override
  public abstract void onViewCreateSetup(final View view, final PayloadCreate payload);

  @Override
  public void onViewStartSetup(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeSetup(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseSetup(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopSetup(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroySetup(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedSetup(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartSetup(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentSetup(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateSetup(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateSetup(final View view, final PayloadRestoreInstanceState payload)
  {
  }
}
