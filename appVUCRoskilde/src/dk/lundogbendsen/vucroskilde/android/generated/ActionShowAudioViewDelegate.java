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
import dk.schoubo.library.android.ui.framework.PayloadClick;
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


public interface ActionShowAudioViewDelegate
{
  public void onViewClickActionShowAudioDoPlayImageButton(final View view, final PayloadClick payload);
  public void onViewBackActionShowAudio(final View view, final PayloadBack payload);
  public void onViewRefreshActionShowAudio(final View view, final PayloadRefresh payload);
  public void onViewCreateActionShowAudio(final View view, final PayloadCreate payload);
  public void onViewStartActionShowAudio(final View view, final PayloadStart payload);
  public void onViewResumeActionShowAudio(final View view, final PayloadResume payload);
  public void onViewPauseActionShowAudio(final View view, final PayloadPause payload);
  public void onViewStopActionShowAudio(final View view, final PayloadStop payload);
  public void onViewDestroyActionShowAudio(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedActionShowAudio(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartActionShowAudio(final View view, final PayloadRestart payload);
  public void onViewNewIntentActionShowAudio(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateActionShowAudio(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateActionShowAudio(final View view, final PayloadRestoreInstanceState payload);


}
