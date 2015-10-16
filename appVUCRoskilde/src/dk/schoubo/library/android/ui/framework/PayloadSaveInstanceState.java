package dk.schoubo.library.android.ui.framework;

import android.os.Bundle;

public class PayloadSaveInstanceState implements Payload
{
  private final Bundle bundle;
  public Bundle getBundle() { return bundle; }

  private PayloadSaveInstanceState(final Bundle bundle)
  {
    this.bundle = bundle;
  }

  public static PayloadSaveInstanceState create(final Bundle bundle)
  {
    return new PayloadSaveInstanceState(bundle);
  }
}
