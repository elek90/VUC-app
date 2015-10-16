package dk.schoubo.library.android.ui.framework;

import android.content.Intent;


public class PayloadReceiverCall implements Payload
{
  private final Intent intent;
  public Intent getIntent() { return intent; }

  private PayloadReceiverCall(final Intent intent)
  {
    this.intent = intent;
  }

  public static PayloadReceiverCall create(final Intent intent)
  {
    return new PayloadReceiverCall(intent);
  }

}
