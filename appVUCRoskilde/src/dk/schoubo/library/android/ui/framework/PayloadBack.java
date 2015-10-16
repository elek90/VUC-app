package dk.schoubo.library.android.ui.framework;

public class PayloadBack implements Payload
{
  private PayloadBack()
  {
  }

  public static PayloadBack create()
  {
    return new PayloadBack();
  }
}
