package dk.schoubo.library.android.ui.framework;

public class PayloadDestroy implements Payload
{
  private PayloadDestroy()
  {
  }

  public static PayloadDestroy create()
  {
    return new PayloadDestroy();
  }
}
