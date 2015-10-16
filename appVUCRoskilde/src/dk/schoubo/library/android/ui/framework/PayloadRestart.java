package dk.schoubo.library.android.ui.framework;

public class PayloadRestart implements Payload
{
  private PayloadRestart()
  {
  }

  public static PayloadRestart create()
  {
    return new PayloadRestart();
  }
}
