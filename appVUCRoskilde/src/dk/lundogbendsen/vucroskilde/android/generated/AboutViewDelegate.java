/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.view.View;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadNewIntent;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadRestart;
import dk.schoubo.library.android.ui.framework.PayloadRestoreInstanceState;
import dk.schoubo.library.android.ui.framework.PayloadResume;
import dk.schoubo.library.android.ui.framework.PayloadSaveInstanceState;
import dk.schoubo.library.android.ui.framework.PayloadStart;
import dk.schoubo.library.android.ui.framework.PayloadStop;
import dk.schoubo.library.android.ui.framework.PayloadWindowFocusChanged;


public interface AboutViewDelegate
{
  public void onViewBackAbout(final View view, final PayloadBack payload);
  public void onViewRefreshAbout(final View view, final PayloadRefresh payload);
  public void onViewCreateAbout(final View view, final PayloadCreate payload);
  public void onViewStartAbout(final View view, final PayloadStart payload);
  public void onViewResumeAbout(final View view, final PayloadResume payload);
  public void onViewPauseAbout(final View view, final PayloadPause payload);
  public void onViewStopAbout(final View view, final PayloadStop payload);
  public void onViewDestroyAbout(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedAbout(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartAbout(final View view, final PayloadRestart payload);
  public void onViewNewIntentAbout(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateAbout(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateAbout(final View view, final PayloadRestoreInstanceState payload);


}
