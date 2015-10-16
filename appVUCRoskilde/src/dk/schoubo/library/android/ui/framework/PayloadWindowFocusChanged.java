package dk.schoubo.library.android.ui.framework;


public class PayloadWindowFocusChanged implements Payload
{
  private final boolean hasFocus;
  public boolean hasFocus() { return hasFocus; }
  
  private PayloadWindowFocusChanged(final boolean hasFocus)
  {
    super();
    this.hasFocus = hasFocus;
  }

  public static PayloadWindowFocusChanged create(final boolean hasFocus)
  {
    return new PayloadWindowFocusChanged(hasFocus);
  }
}
