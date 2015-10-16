package dk.schoubo.library.android.ui.framework;

public class PayloadStart implements Payload
{
  private PayloadStart()
  {
  }

  public static PayloadStart create()
  {
    return new PayloadStart();
  }
}
