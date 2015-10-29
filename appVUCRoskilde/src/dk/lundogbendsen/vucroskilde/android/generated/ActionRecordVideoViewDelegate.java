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


public interface ActionRecordVideoViewDelegate
{
  public void onViewClickActionRecordVideoDoRecordImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordVideoDoPlayImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordVideoDoRegretImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordVideoDoSaveImageButton(final View view, final PayloadClick payload);
  public void onViewBackActionRecordVideo(final View view, final PayloadBack payload);
  public void onViewRefreshActionRecordVideo(final View view, final PayloadRefresh payload);
  public void onViewCreateActionRecordVideo(final View view, final PayloadCreate payload);
  public void onViewStartActionRecordVideo(final View view, final PayloadStart payload);
  public void onViewResumeActionRecordVideo(final View view, final PayloadResume payload);
  public void onViewPauseActionRecordVideo(final View view, final PayloadPause payload);
  public void onViewStopActionRecordVideo(final View view, final PayloadStop payload);
  public void onViewDestroyActionRecordVideo(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedActionRecordVideo(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartActionRecordVideo(final View view, final PayloadRestart payload);
  public void onViewNewIntentActionRecordVideo(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateActionRecordVideo(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateActionRecordVideo(final View view, final PayloadRestoreInstanceState payload);


}
