/**
 * THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */

package dk.lundogbendsen.vucroskilde.android;

import android.view.View;
import dk.lundogbendsen.vucroskilde.android.generated.SplashGUI;
import dk.lundogbendsen.vucroskilde.android.generated.SplashRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.SplashViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.SplashViewDelegateRoot;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;

public class SplashViewDelegateContext extends SplashViewDelegateRoot
{

  private SplashViewDelegateContext(final SplashRootActivity activity, final VUCRoskildeBusinessContext busctx, final SplashGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static SplashViewDelegate create(final SplashRootActivity activity, final VUCRoskildeBusinessContext busctx, final SplashGUI guictx)
  {
    return new SplashViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewRefreshSplash(final View view, final PayloadRefresh payload)
  {
    activity.getActionBar().hide();
    guictx.textViewSplashVersion.setText(activity.getString(R.string.labelSplashVersion, activity.getVersionName()));
  }

  @Override
  public void onViewCreateSplash(final View view, final PayloadCreate payload)
  {
    super.onViewCreateSplash(view, payload);
    
    activity.getActionBar().hide();
    activity.refreshGUI();
  }

}
