package dk.schoubo.library.android.ui.framework;

public class PayloadAnimationFinish implements Payload
{
  public final boolean canceled;

  private PayloadAnimationFinish(final boolean canceled)
  {
    this.canceled = canceled;
  }

  public static PayloadAnimationFinish create(final boolean canceled)
  {
    return new PayloadAnimationFinish(canceled);
  }

}
