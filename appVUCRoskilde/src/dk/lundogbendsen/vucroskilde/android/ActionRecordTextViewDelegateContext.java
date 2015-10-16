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
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordDescriptionXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextViewDelegateRoot;
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


public class ActionRecordTextViewDelegateContext extends ActionRecordTextViewDelegateRoot
{

  private ActionRecordTextViewDelegateContext(final ActionRecordTextRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordTextGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionRecordTextViewDelegate create(final ActionRecordTextRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordTextGUI guictx)
  {
    return new ActionRecordTextViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionRecordTextDoRegretImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewClickActionRecordTextDoSaveImageButton(final View view, final PayloadClick payload)
  {
    // TODO To be filled out by YOU
  }

  @Override
  public void onViewBackActionRecordText(final View view, final PayloadBack payload)
  {
    // TODO To be filled out by YOU   -- super contains   goReturn(Activity.RESULT_CANCELED);
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public void onViewRefreshActionRecordText(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getText());
    // TODO To be filled out by YOU
    // guictx.editTextActionRecordTextText.setText("??");
  }

  @Override
  public void onViewCreateActionRecordText(final View view, final PayloadCreate payload)
  {
    ActionRecordDescriptionXML action = busctx.<ActionRecordDescriptionXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewStartActionRecordText(final View view, final PayloadStart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewResumeActionRecordText(final View view, final PayloadResume payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewPauseActionRecordText(final View view, final PayloadPause payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewStopActionRecordText(final View view, final PayloadStop payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewDestroyActionRecordText(final View view, final PayloadDestroy payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewWindowFocusChangedActionRecordText(final View view, final PayloadWindowFocusChanged payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestartActionRecordText(final View view, final PayloadRestart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewNewIntentActionRecordText(final View view, final PayloadNewIntent payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewSaveInstanceStateActionRecordText(final View view, final PayloadSaveInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestoreInstanceStateActionRecordText(final View view, final PayloadRestoreInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }



}
