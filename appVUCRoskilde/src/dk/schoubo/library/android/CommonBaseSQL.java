package dk.schoubo.library.android;

import dk.schoubo.library.android.util.LogUtil;


public abstract class CommonBaseSQL
{
  public final String TAG() { return LogUtil.getClassName(this); }

  public abstract Object get(final int fieldId);
  public abstract void set(final int fieldId, final Object value);
  public abstract String getColumnName(final int fieldId);

  public abstract CommonBaseSQL getBlank();
  public abstract CommonBaseSQL copy();
  public abstract CommonBaseXML asXML();
}
