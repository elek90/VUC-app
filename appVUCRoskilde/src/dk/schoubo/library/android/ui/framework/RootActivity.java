package dk.schoubo.library.android.ui.framework;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.Html.ImageGetter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import dk.schoubo.library.android.BusinessContext;
import dk.schoubo.library.android.RootGlobalState;
import dk.schoubo.library.android.util.LogUtil;

public abstract class RootActivity <C extends BusinessContext, G extends CommonGUI<C, A, D>, A extends Enum<?>, D extends Enum<?>> extends Activity
{
  public final String TAG() { return LogUtil.getClassName(this); }

  @SuppressWarnings("unchecked")
  public RootGlobalState<C> getGlobalState()
  {
    return (RootGlobalState<C>)getApplication();
  }

  protected C busctx;
  public C getBusinessContext() { return busctx; }

  private static Locale defaultLocale;
  private static Locale locale;
  public Locale getLocale() { return locale; }
  /**
   * Set a new Locale for the application.
   * Will restart the application main class, if the locale is in fact new.
   *
   * @param locale
   */
  public void setLocale(final Locale locale)
  {
    Locale oldLocale = RootActivity.locale;
    RootActivity.locale = locale;
    boolean isLocaleNew = !oldLocale.toString().equalsIgnoreCase(locale.toString());

    if (isLocaleNew) restartMainActivity();
  }

  public void switchLocale()
  {
    Locale.setDefault(locale);
    Configuration config = new Configuration();
    config.locale = locale;
    getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
  }

  public void restartMainActivity()
  {
    String packageName = getPackageName();
    Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
    launchIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(launchIntent);
  }


  private ImageGetter imagegetter;
  public ImageGetter getImageGetter() { return imagegetter; }

  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    busctx = getGlobalState().getBusinessContext();

    imagegetter = new ResourceImageGetter<C, G, A, D>(this, busctx.getResourcesForImages());

    if (defaultLocale == null)
    {
      defaultLocale = Locale.getDefault();
      locale = defaultLocale;
    }
    switchLocale();
  }


  protected G guictx;
  public G getGUI() { return guictx; }

  public abstract void refreshGUI();

  public abstract void onAction(final View view, final A actionpoint, final Payload payload);
  public abstract void onReturn(final D requestcode, final int resultCode, final Intent data);

  @Override
  public final void onBackPressed()
  {
    A action = guictx.getBack();
    onAction(null, action, PayloadBack.create());
  }

  @Override
  protected void onActivityResult(final int requestCode, final int resultCode, final Intent data)
  {
    super.onActivityResult(requestCode, resultCode, data);
    guictx.onActivityReturn(requestCode, resultCode, data);
  }

  @Override
  public final boolean onCreateOptionsMenu(final Menu menu)
  {
    return guictx.onCreateOptionsMenu(menu);
  }

  @Override
  public final boolean onOptionsItemSelected(final MenuItem item)
  {
    return guictx.onOptionsItemSelected(item);
  }

  public final boolean onCreateOptionsMenuSuper(final Menu menu)
  {
    return super.onCreateOptionsMenu(menu);
  }

  public final boolean onOptionsItemSelectedSuper(final MenuItem item)
  {
    return super.onOptionsItemSelected(item);
  }



  public void showInformation(final int messageid, final Object... arguments)
  {
    String m = getString(messageid, arguments);
    Toast.makeText(this, m, Toast.LENGTH_SHORT).show();
  }

  public void showWarning(final int messageid, final Object... arguments)
  {
    String m = getString(messageid, arguments);
    Toast.makeText(this, m, Toast.LENGTH_LONG).show();
  }






  public boolean isOnline()
  {
    ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo netInfo = cm.getActiveNetworkInfo();
    return netInfo != null && netInfo.isConnected();
  }

  public boolean isOnline(final int connectivityManagerCode)
  {
    ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo netInfo = cm.getNetworkInfo(connectivityManagerCode);
    return netInfo != null && netInfo.isConnected();
  }

  public boolean isOnline(final int connectivityManagerCode, final int hostAddress)
  {
    ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    boolean routeOk = cm.requestRouteToHost(connectivityManagerCode, hostAddress);
    return routeOk;
  }

  public boolean isOnline(final int connectivityManagerCode, final String domainName)
  {
    InetAddress inet = null;
    try
    {
      inet = InetAddress.getByName(domainName);
    }
    catch (UnknownHostException e)
    {
      Log.i(TAG(), "The IP address cannot be resolved for " + domainName);
      return false;
    }

    byte[] resolvedIP = inet.getAddress();
    int ipInt = 0;
    for (int i = 0; i < resolvedIP.length; i++)
      ipInt = (ipInt << 8) + resolvedIP[i];

    ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    boolean routeOk = cm.requestRouteToHost(connectivityManagerCode, ipInt);
    return routeOk;
  }

  public String getVersionName()
  {
    try
    {
      PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
      return pInfo.versionName;
    }
    catch (NameNotFoundException e)
    {
      return "";
    }
  }

  public int getVersionCode()
  {
    try
    {
      PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
      return pInfo.versionCode;
    }
    catch (NameNotFoundException e)
    {
      return -1;
    }
  }

}
