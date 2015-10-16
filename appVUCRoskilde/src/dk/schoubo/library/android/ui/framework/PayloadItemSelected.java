package dk.schoubo.library.android.ui.framework;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

public class PayloadItemSelected<B extends Adapter> implements Payload
{
  public final AdapterView<B> parent;
  public final View view;
  public final int pos;
  public final long id;

  public PayloadItemSelected(final AdapterView<B> parent, final View view, final int pos, final long id)
  {
    this.parent = parent;
    this.view = view;
    this.pos = pos;
    this.id = id;
  }

  public static <B extends Adapter> PayloadItemSelected<B> create(final AdapterView<B> parent, final View view, final int pos, final long id)
  {
    return new PayloadItemSelected<B>(parent, view, pos, id);
  }

}
