package dk.schoubo.library.android;

import dk.schoubo.library.android.util.LogUtil;
import android.app.Application;

public class RootGlobalState<C extends BusinessContext> extends Application
{
  public final String TAG() { return LogUtil.getClassName(this); }

  private boolean debug;
  public void setDebugging(final boolean debug) { this.debug = debug; }
  public boolean isDebugging() { return debug; }

  private C busctx;
  public C getBusinessContext() { return busctx; }
  public void setBusinessContext(final C busctx) { this.busctx = busctx; }

  public RootGlobalState()
  {
    super();
    this.debug = true;
  }
}