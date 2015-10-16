package dk.schoubo.library.android.ui.framework;

import android.os.Bundle;

public class PayloadRestoreInstanceState implements Payload
{
  private final Bundle bundle;
  public Bundle getBundle() { return bundle; }

  private PayloadRestoreInstanceState(final Bundle bundle)
  {
    this.bundle = bundle;
  }

  public static PayloadRestoreInstanceState create(final Bundle bundle)
  {
    return new PayloadRestoreInstanceState(bundle);
  }
}
