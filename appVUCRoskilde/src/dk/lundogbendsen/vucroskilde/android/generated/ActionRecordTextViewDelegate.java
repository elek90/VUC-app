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


public interface ActionRecordTextViewDelegate
{
  public void onViewClickActionRecordTextDoRegretImageButton(final View view, final PayloadClick payload);
  public void onViewClickActionRecordTextDoSaveImageButton(final View view, final PayloadClick payload);
  public void onViewBackActionRecordText(final View view, final PayloadBack payload);
  public void onViewRefreshActionRecordText(final View view, final PayloadRefresh payload);
  public void onViewCreateActionRecordText(final View view, final PayloadCreate payload);
  public void onViewStartActionRecordText(final View view, final PayloadStart payload);
  public void onViewResumeActionRecordText(final View view, final PayloadResume payload);
  public void onViewPauseActionRecordText(final View view, final PayloadPause payload);
  public void onViewStopActionRecordText(final View view, final PayloadStop payload);
  public void onViewDestroyActionRecordText(final View view, final PayloadDestroy payload);
  public void onViewWindowFocusChangedActionRecordText(final View view, final PayloadWindowFocusChanged payload);
  public void onViewRestartActionRecordText(final View view, final PayloadRestart payload);
  public void onViewNewIntentActionRecordText(final View view, final PayloadNewIntent payload);
  public void onViewSaveInstanceStateActionRecordText(final View view, final PayloadSaveInstanceState payload);
  public void onViewRestoreInstanceStateActionRecordText(final View view, final PayloadRestoreInstanceState payload);


}
