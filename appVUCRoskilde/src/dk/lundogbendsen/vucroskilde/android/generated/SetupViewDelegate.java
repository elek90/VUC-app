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
import dk.schoubo.library.android.ui.framework.PayloadCheck;
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


public interface SetupViewDelegate
{
  public void onViewClickSetupTeacherCheckBox(final View view, final PayloadCheck payload);
  public void onViewBackSetup(final View view, final PayloadBack payload);
  public void onViewRefreshSetup(final View view, final PayloadRefresh payload);
  public void onViewCreateSetup(final View view, final PayloadCreate payload);
  public void onViewStartSetup(final View view, final PayloadStart payload);
  public void onViewResumeSetup(final View view, final PayloadResume payload);
  public void onViewPauseSetup(final View view, final PayloadPause payload);
  public void onViewStopSetup(final View view, final PayloadStop payload);
  public void onViewDestroySetup(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedSetup(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartSetup(final View view, final PayloadRestart payload);
  public void onViewNewIntentSetup(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateSetup(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateSetup(final View view, final PayloadRestoreInstanceState payload);


}
