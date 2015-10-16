package dk.schoubo.library.android.ui.framework;

public class PayloadResume implements Payload
{
  private PayloadResume()
  {
  }

  public static PayloadResume create()
  {
    return new PayloadResume();
  }
}
