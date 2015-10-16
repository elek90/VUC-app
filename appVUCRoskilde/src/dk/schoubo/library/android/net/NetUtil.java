package dk.schoubo.library.android.net;

import android.app.Activity;
import android.content.Context;
import android.net.*;

public class NetUtil
{
  public static boolean isDeviceOnline(final Activity activity)
  {
    ConnectivityManager connMgr = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
    return networkInfo != null && networkInfo.isConnected();
  }
}
