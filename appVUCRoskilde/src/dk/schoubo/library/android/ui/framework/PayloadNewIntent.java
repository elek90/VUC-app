package dk.schoubo.library.android.ui.framework;

import android.content.Intent;

public class PayloadNewIntent implements Payload
{
  private final Intent intent;
  public Intent getIntent() { return intent; }

  private PayloadNewIntent(final Intent intent)
  {
    this.intent = intent;
  }

  public static PayloadNewIntent create(final Intent intent)
  {
    return new PayloadNewIntent(intent);
  }
}
