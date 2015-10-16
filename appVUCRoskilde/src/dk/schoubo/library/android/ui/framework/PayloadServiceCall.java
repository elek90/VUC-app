package dk.schoubo.library.android.ui.framework;

import android.content.Intent;


public class PayloadServiceCall implements Payload
{
  private final Intent intent;
  public Intent getIntent() { return intent; }

  private final int startId;
  public int getStartId() { return startId; }

  private final int flags;
  public int getFlags() { return flags; }

  private PayloadServiceCall(final Intent intent, final int flags, final int startId)
  {
    this.intent = intent;
    this.startId = startId;
    this.flags = flags;
  }

  public static PayloadServiceCall create(final Intent intent, final int flags, final int startId)
  {
    return new PayloadServiceCall(intent, flags, startId);
  }
}
