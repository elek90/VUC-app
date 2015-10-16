package dk.schoubo.library.android.ui.framework;

import android.view.View;

import com.sinkpoint.smoothwheel.WheelAdapter;

public class PayloadWheelSpin implements Payload
{
  public final View view;
  public final WheelAdapter adapter;
  public final int pos;

  private PayloadWheelSpin(final View view, final WheelAdapter adapter, final int pos)
  {
    this.view = view;
    this.adapter = adapter;
    this.pos = pos;
  }

  public static PayloadWheelSpin create(final View view, final WheelAdapter adapter, final int pos)
  {
    return new PayloadWheelSpin(view, adapter, pos);
  }
}
