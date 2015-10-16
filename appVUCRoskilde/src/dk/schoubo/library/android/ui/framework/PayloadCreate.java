package dk.schoubo.library.android.ui.framework;

import android.os.Bundle;


public class PayloadCreate implements Payload
{
  private final Bundle savedInstanceState;
  public Bundle getSavedInstanceState() { return savedInstanceState; }

  private PayloadCreate(final Bundle savedInstanceState)
  {
    this.savedInstanceState = savedInstanceState;
  }

  public static PayloadCreate create(final Bundle savedInstanceState)
  {
    return new PayloadCreate(savedInstanceState);
  }
}
