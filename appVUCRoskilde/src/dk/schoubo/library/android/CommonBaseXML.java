package dk.schoubo.library.android;

import java.io.Serializable;

import dk.schoubo.library.android.util.LogUtil;

public abstract class CommonBaseXML implements Serializable
{
  public final String TAG() { return LogUtil.getClassName(this); }

  public abstract CommonBaseXML getBlank();
  public abstract CommonBaseXML copy();
  public abstract CommonBaseSQL asSQL();
}
