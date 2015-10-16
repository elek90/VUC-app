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
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
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


public class ActionShowImageViewDelegateContext extends ActionShowImageViewDelegateRoot
{

  private ActionShowImageXML action;

  private ActionShowImageViewDelegateContext(final ActionShowImageRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowImageGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionShowImageViewDelegate create(final ActionShowImageRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowImageGUI guictx)
  {
    return new ActionShowImageViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewBackActionShowImage(final View view, final PayloadBack payload)
  {
    // TODO To be filled out by YOU   -- super contains   goReturn(Activity.RESULT_CANCELED);
    goReturn(Activity.RESULT_CANCELED);
  }

  @Override
  public void onViewRefreshActionShowImage(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getText());
   // TODO To be filled out by YOU
    guictx.imageViewActionShowImageImage.setImageResource(R.drawable.ic_launcher);
  }

  @Override
  public void onViewCreateActionShowImage(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionShowImageXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewStartActionShowImage(final View view, final PayloadStart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewResumeActionShowImage(final View view, final PayloadResume payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewPauseActionShowImage(final View view, final PayloadPause payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewStopActionShowImage(final View view, final PayloadStop payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewDestroyActionShowImage(final View view, final PayloadDestroy payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewWindowFocusChangedActionShowImage(final View view, final PayloadWindowFocusChanged payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestartActionShowImage(final View view, final PayloadRestart payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewNewIntentActionShowImage(final View view, final PayloadNewIntent payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewSaveInstanceStateActionShowImage(final View view, final PayloadSaveInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }

  @Override
  public void onViewRestoreInstanceStateActionShowImage(final View view, final PayloadRestoreInstanceState payload)
  {
    // TODO To be filled out by YOU   -- super contains nothing
  }



}
