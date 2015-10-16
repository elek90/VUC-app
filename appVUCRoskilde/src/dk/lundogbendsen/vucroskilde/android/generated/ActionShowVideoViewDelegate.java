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


public interface ActionShowVideoViewDelegate
{
  public void onViewBackActionShowVideo(final View view, final PayloadBack payload);
  public void onViewRefreshActionShowVideo(final View view, final PayloadRefresh payload);
  public void onViewCreateActionShowVideo(final View view, final PayloadCreate payload);
  public void onViewStartActionShowVideo(final View view, final PayloadStart payload);
  public void onViewResumeActionShowVideo(final View view, final PayloadResume payload);
  public void onViewPauseActionShowVideo(final View view, final PayloadPause payload);
  public void onViewStopActionShowVideo(final View view, final PayloadStop payload);
  public void onViewDestroyActionShowVideo(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedActionShowVideo(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartActionShowVideo(final View view, final PayloadRestart payload);
  public void onViewNewIntentActionShowVideo(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateActionShowVideo(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateActionShowVideo(final View view, final PayloadRestoreInstanceState payload);


}
