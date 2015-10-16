package dk.schoubo.library.android.ui.framework;

public class PayloadAnimationCycle implements Payload
{
  public final long millisUntilFinished;

  private PayloadAnimationCycle(final long millisUntilFinished)
  {
    this.millisUntilFinished = millisUntilFinished;
  }

  public static PayloadAnimationCycle create(final long millisUntilFinished)
  {
    return new PayloadAnimationCycle(millisUntilFinished);
  }

}
