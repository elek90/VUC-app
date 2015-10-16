/** THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android;

import android.app.Activity;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
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


public class ActionRecordImageViewDelegateContext extends ActionRecordImageViewDelegateRoot
{

  private ActionRecordImageXML action;

  private ActionRecordImageViewDelegateContext(final ActionRecordImageRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordImageGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionRecordImageViewDelegate create(final ActionRecordImageRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordImageGUI guictx)
  {
    return new ActionRecordImageViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionRecordImageDoRecordImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewClickActionRecordImageDoRegretImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewClickActionRecordImageDoSaveImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewBackActionRecordImage(final View view, final PayloadBack payload)
  {
    // TODO To be filled out by YOU   -- super contains   goReturn(Activity.RESULT_CANCELED);
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public void onViewRefreshActionRecordImage(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getText());
    // TODO To be filled out by YOU
    guictx.imageViewActionRecordImageImage.setImageResource(R.drawable.ic_launcher);
  }

  @Override
  public void onViewCreateActionRecordImage(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordImageXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewStartActionRecordImage(final View view, final PayloadStart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewResumeActionRecordImage(final View view, final PayloadResume payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewPauseActionRecordImage(final View view, final PayloadPause payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewStopActionRecordImage(final View view, final PayloadStop payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewDestroyActionRecordImage(final View view, final PayloadDestroy payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewWindowFocusChangedActionRecordImage(final View view, final PayloadWindowFocusChanged payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestartActionRecordImage(final View view, final PayloadRestart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewNewIntentActionRecordImage(final View view, final PayloadNewIntent payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewSaveInstanceStateActionRecordImage(final View view, final PayloadSaveInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestoreInstanceStateActionRecordImage(final View view, final PayloadRestoreInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }



}
