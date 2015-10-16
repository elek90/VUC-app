package dk.schoubo.library.android;

import java.util.ArrayList;

import dk.schoubo.library.android.ui.framework.ResourceInfo;
import dk.schoubo.library.android.util.LogUtil;


public abstract class BusinessContext
{
  public String TAG() { return LogUtil.getClassName(this); }

  public abstract ArrayList<ResourceInfo> getResourcesForImages();
}