package dk.schoubo.library.android.ui.framework;

import android.widget.Adapter;
import android.widget.AdapterView;

public class PayloadItemDeselected<B extends Adapter> implements Payload
{
  public final AdapterView<B> parent;

  private PayloadItemDeselected(final AdapterView<B> parent)
  {
    this.parent = parent;
  }

  public static <B extends Adapter> PayloadItemDeselected<B> create(final AdapterView<B> parent)
  {
    return new PayloadItemDeselected<B>(parent);
  }

}
