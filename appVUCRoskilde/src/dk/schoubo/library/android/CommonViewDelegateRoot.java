package dk.schoubo.library.android;

import dk.schoubo.library.android.util.LogUtil;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public abstract class CommonViewDelegateRoot
{
//  private static final String TAG = CommonViewDelegateRoot.class.getName();

  public final String TAG() { return LogUtil.getClassName(this); }

  private final Activity activity;

  public CommonViewDelegateRoot(final Activity activity)
  {
    this.activity = activity;
  }

  public void goReturn(final int result)
  {
    if (SharedLibrarySingleton.isDebugging(SharedLibraryDebugType.NAVIGATION))
      Log.d(TAG(), "Return from "+activity.getClass().getSimpleName()+" with status "+result);

    activity.setResult(result);
    activity.finish();
  }

  public void goReturn(final int result, final Bundle extras)
  {
    if (SharedLibrarySingleton.isDebugging(SharedLibraryDebugType.NAVIGATION))
      Log.d(TAG(), "Return from "+activity.getClass().getSimpleName()+" with status "+result+" and extras...");

    Intent databackIntent = new Intent();
    databackIntent.putExtras(extras);
    activity.setResult(result, databackIntent);
    activity.finish();
  }

}
