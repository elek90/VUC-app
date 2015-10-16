package dk.schoubo.library.android.ui.framework;


public class PayloadRefresh implements Payload
{
  private PayloadRefresh()
  {
  }

  public static PayloadRefresh create()
  {
    return new PayloadRefresh();
  }
}
