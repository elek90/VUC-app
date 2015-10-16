package dk.schoubo.library.android.ui.framework;

public class PayloadStop implements Payload
{
  private PayloadStop()
  {
  }

  public static PayloadStop create()
  {
    return new PayloadStop();
  }
}
