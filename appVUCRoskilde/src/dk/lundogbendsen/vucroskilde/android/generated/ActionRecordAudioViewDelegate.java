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


public interface ActionRecordAudioViewDelegate
{
  public void onViewClickActionRecordAudioDoRecordImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordAudioDoPlayImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordAudioDoRegretImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordAudioDoSaveImageButton(final View view, final PayloadClick payload);
  public void onViewBackActionRecordAudio(final View view, final PayloadBack payload);
  public void onViewRefreshActionRecordAudio(final View view, final PayloadRefresh payload);
  public void onViewCreateActionRecordAudio(final View view, final PayloadCreate payload);
  public void onViewStartActionRecordAudio(final View view, final PayloadStart payload);
  public void onViewResumeActionRecordAudio(final View view, final PayloadResume payload);
  public void onViewPauseActionRecordAudio(final View view, final PayloadPause payload);
  public void onViewStopActionRecordAudio(final View view, final PayloadStop payload);
  public void onViewDestroyActionRecordAudio(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedActionRecordAudio(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartActionRecordAudio(final View view, final PayloadRestart payload);
  public void onViewNewIntentActionRecordAudio(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateActionRecordAudio(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateActionRecordAudio(final View view, final PayloadRestoreInstanceState payload);


}
