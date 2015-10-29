/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.content.Intent;
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


public interface ActionRecordImageViewDelegate
{
  public void onViewClickActionRecordImageDoSelectImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordImageDoRecordImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordImageDoRegretImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordImageDoSaveImageButton(final View view, final PayloadClick payload);
  public void onViewBackActionRecordImage(final View view, final PayloadBack payload);
  public void onViewRefreshActionRecordImage(final View view, final PayloadRefresh payload);
  public void onViewCreateActionRecordImage(final View view, final PayloadCreate payload);
  public void onViewStartActionRecordImage(final View view, final PayloadStart payload);
  public void onViewResumeActionRecordImage(final View view, final PayloadResume payload);
  public void onViewPauseActionRecordImage(final View view, final PayloadPause payload);
  public void onViewStopActionRecordImage(final View view, final PayloadStop payload);
  public void onViewDestroyActionRecordImage(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedActionRecordImage(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartActionRecordImage(final View view, final PayloadRestart payload);
  public void onViewNewIntentActionRecordImage(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateActionRecordImage(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateActionRecordImage(final View view, final PayloadRestoreInstanceState payload);

  public void onReturnFromExternalCameraOK(final Intent data);
  public void onReturnFromExternalCameraRetryManually(final Intent data);
  public void onReturnFromExternalCameraCancelled(final Intent data);
  public void onReturnFromExternalGalleryOK(final Intent data);
  public void onReturnFromExternalGalleryRetryManually(final Intent data);
  public void onReturnFromExternalGalleryCancelled(final Intent data);

}
