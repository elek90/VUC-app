package dk.schoubo.library.android.ui.framework;

import android.os.CountDownTimer;
import android.view.View;
import dk.schoubo.library.android.BusinessContext;

public class BlinkTimer<C extends BusinessContext, G extends CommonGUI<C, A, D>, A extends Enum<?>, D extends Enum<?>> implements AnimationTimer
{
  private final View view;
  private final RootActivity<C, G, A, D> activity;
  private final A actionpointStart;
  private final A actionpointCycle;
  private final A actionpointFinish;

  private CountDownTimer timer;

  private BlinkTimer(final View view, final RootActivity<C, G, A, D> activity, final A actionpointStart, final A actionpointCycle, final A actionpointFinish)
  {
    timer = createTimer();
    this.view = view;
    this.activity = activity;
    this.actionpointStart = actionpointStart;
    this.actionpointCycle = actionpointCycle;
    this.actionpointFinish = actionpointFinish;
  }

  public static <C extends BusinessContext, G extends CommonGUI<C, A, D>, A extends Enum<?>, D extends Enum<?>>
  BlinkTimer<C, G, A, D> create(final View view, final RootActivity<C, G, A, D> activity, final A actionpointStart, final A actionpointCycle, final A actionpointFinish)
  {
    return new BlinkTimer<C, G, A, D>(view, activity, actionpointStart, actionpointCycle, actionpointFinish);
  }

  private CountDownTimer createTimer()
  {
    CountDownTimer cdt = new CountDownTimer(Long.MAX_VALUE, 100L)
    {
      private int cycle = 0;
      private final int cycleLength = 10;
      private final int cycleOnPoint = 5;

      @Override
      public void onTick(final long millisUntilFinished)
      {
        if (cycle == 0)
        {
          activity.onAction(view, actionpointCycle, PayloadAnimationCycle.create(millisUntilFinished));
        }

        cycle += 1;
        if (cycle == cycleOnPoint)
        {
          view.setVisibility(View.VISIBLE);
        }
        else if (cycle >= cycleLength)
        {
          cycle = 0;
          view.setVisibility(View.INVISIBLE);
        }
      }

      @Override
      public void onFinish()
      {
        activity.onAction(view, actionpointFinish, PayloadAnimationFinish.create(false));
      }
    };
    return cdt;
  }

  @Override
  public void start()
  {
    timer.start();
    activity.onAction(view, actionpointStart, PayloadAnimationStart.create());
  }

  @Override
  public void stop()
  {
    timer.cancel();
    activity.onAction(view, actionpointFinish, PayloadAnimationFinish.create(true));
    timer = createTimer();
  }

}
