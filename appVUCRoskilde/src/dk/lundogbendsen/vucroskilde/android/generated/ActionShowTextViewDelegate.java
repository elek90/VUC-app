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


public interface ActionShowTextViewDelegate
{
  public void onViewBackActionShowText(final View view, final PayloadBack payload);
  public void onViewRefreshActionShowText(final View view, final PayloadRefresh payload);
  public void onViewCreateActionShowText(final View view, final PayloadCreate payload);
  public void onViewStartActionShowText(final View view, final PayloadStart payload);
  public void onViewResumeActionShowText(final View view, final PayloadResume payload);
  public void onViewPauseActionShowText(final View view, final PayloadPause payload);
  public void onViewStopActionShowText(final View view, final PayloadStop payload);
  public void onViewDestroyActionShowText(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedActionShowText(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartActionShowText(final View view, final PayloadRestart payload);
  public void onViewNewIntentActionShowText(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateActionShowText(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateActionShowText(final View view, final PayloadRestoreInstanceState payload);


}
