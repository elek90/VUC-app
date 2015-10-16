package dk.schoubo.library.android.ui.framework;


public class PayloadMenu implements Payload
{
  private PayloadMenu()
  {
  }

  public static PayloadMenu create()
  {
    return new PayloadMenu();
  }
}
