package dk.schoubo.library.android.ui.framework;


public class PayloadCheck implements Payload
{
  private final int index;
  public int getIndex() { return index; }
  public boolean isArray() { return index != -1; }

  private final boolean isSelected;
  public boolean isSelected() { return isSelected; }
  
  private PayloadCheck(final int index, final boolean isSelected)
  {
    super();
    this.index = index;
    this.isSelected = isSelected;
  }

  public static PayloadCheck create(final int index, final boolean isSelected)
  {
    return new PayloadCheck(index, isSelected);
  }

  public static PayloadCheck create(final boolean isSelected)
  {
    return new PayloadCheck(-1, isSelected);
  }
}
