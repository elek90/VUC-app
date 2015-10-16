package dk.schoubo.library.android.ui.framework;


public class PayloadClick implements Payload
{
  private final int index;
  public int getIndex() { return index; }
  public boolean isArray() { return index != -1; }

  private PayloadClick(final int index)
  {
    this.index = index;
  }

  public static PayloadClick create()
  {
    return new PayloadClick(-1);
  }

  public static PayloadClick create(final int index)
  {
    return new PayloadClick(index);
  }

}
