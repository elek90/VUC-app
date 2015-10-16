/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.schoubo.library.android.BusinessContext;
import dk.schoubo.library.android.ui.framework.ResourceInfo;
import java.util.ArrayList;


public abstract class VUCRoskildeBusinessContextRoot extends BusinessContext
{

  public abstract long getSplashTimeMS();

  private boolean notYetInitialized = true;
  public boolean isNotYetInitialized() { return notYetInitialized; }
  public boolean isInitialized() { return !notYetInitialized; }
  public void setInitialized() { notYetInitialized = false; }

  @Override
  public ArrayList<ResourceInfo> getResourcesForImages() { return new ArrayList<ResourceInfo>(); }

}

