package dk.schoubo.library.android.ui.framework;

public class PayloadPause implements Payload
{
  private PayloadPause()
  {
  }

  public static PayloadPause create()
  {
    return new PayloadPause();
  }
}
