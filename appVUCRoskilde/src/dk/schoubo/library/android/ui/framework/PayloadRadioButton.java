package dk.schoubo.library.android.ui.framework;


public class PayloadRadioButton implements Payload
{
  private final int index;
  public int getIndex() { return index; }
  public boolean isArray() { return index != -1; }

  private final boolean isSelected;
  public boolean isSelected() { return isSelected; }
  
  private PayloadRadioButton(final int index, final boolean isSelected)
  {
    this.index = index;
    this.isSelected = isSelected;
  }

  public static PayloadRadioButton create(final boolean isSelected)
  {
    return new PayloadRadioButton(-1, isSelected);
  }

  public static PayloadRadioButton create(final int index, final boolean isSelected)
  {
    return new PayloadRadioButton(index, isSelected);
  }

}
