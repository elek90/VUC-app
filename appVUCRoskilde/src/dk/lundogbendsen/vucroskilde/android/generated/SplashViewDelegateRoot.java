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
import java.util.Timer;
import java.util.TimerTask;


public abstract class SplashViewDelegateRoot extends CommonViewDelegateRoot implements SplashViewDelegate
{
  protected final SplashRootActivity activity;
  protected final VUCRoskildeBusinessContext busctx;
  protected final SplashGUI guictx;
  protected SplashViewDelegateRoot(final SplashRootActivity activity, final VUCRoskildeBusinessContext busctx, final SplashGUI guictx)
  {
    super(activity);
    this.activity = activity;
    this.busctx = busctx;
    this.guictx = guictx;
  }

  @Override
  public void onViewBackSplash(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public abstract void onViewRefreshSplash(final View view, final PayloadRefresh payload);

  @Override
  public void onViewCreateSplash(final View view, final PayloadCreate payload)
  {
    showFlash(busctx.getSplashTimeMS());
  }

  @Override
  public void onViewStartSplash(final View view, final PayloadStart payload)
  {
  }

  @Override
  public void onViewResumeSplash(final View view, final PayloadResume payload)
  {
    activity.refreshGUI();
  }

  @Override
  public void onViewPauseSplash(final View view, final PayloadPause payload)
  {
  }

  @Override
  public void onViewStopSplash(final View view, final PayloadStop payload)
  {
  }

  @Override
  public void onViewDestroySplash(final View view, final PayloadDestroy payload)
  {
  }

  @Override
  public void onViewWindowFocusChangedSplash(final View view, final PayloadWindowFocusChanged payload)
  {
  }

  @Override
  public void onViewRestartSplash(final View view, final PayloadRestart payload)
  {
  }

  @Override
  public void onViewNewIntentSplash(final View view, final PayloadNewIntent payload)
  {
  }

  @Override
  public void onViewSaveInstanceStateSplash(final View view, final PayloadSaveInstanceState payload)
  {
  }

  @Override
  public void onViewRestoreInstanceStateSplash(final View view, final PayloadRestoreInstanceState payload)
  {
  }

  private volatile long elapsed;
  private volatile boolean working;
  private Timer timerPause;
  private Thread threadInitialization;

  protected void showFlash(final long mstotal)
  {
    final long INTERVAL = 500;

    TimerTask pauseTask = new TimerTask()
    {
      @Override
      public void run()
      {
        elapsed += INTERVAL;
        if (!working && elapsed > mstotal)
        {
          this.cancel();
          Intent intent = new Intent(activity, FlowchartMainActivity.class);
          activity.startActivity(intent);
          activity.finish();
        }
      }
    };

    Runnable initializeTask = new Runnable()
    {
      @Override
      public void run()
      {
        if (busctx.isNotYetInitialized()) busctx.initializeDuringSplash(activity);
        working = false;
      }
    };

    working = true;
    elapsed = 0;

    timerPause = new Timer();
    timerPause.schedule(pauseTask, mstotal, INTERVAL);
    threadInitialization = new Thread(initializeTask);
    threadInitialization.start();
  }

}
