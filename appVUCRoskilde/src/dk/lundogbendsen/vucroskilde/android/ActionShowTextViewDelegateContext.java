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
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;


public class ActionShowTextViewDelegateContext extends ActionShowTextViewDelegateRoot
{

  private ActionShowTextViewDelegateContext(final ActionShowTextRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowTextGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionShowTextViewDelegate create(final ActionShowTextRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowTextGUI guictx)
  {
    return new ActionShowTextViewDelegateContext(activity, busctx, guictx);
  }

  
  private ActionShowTextXML action;
  
  @Override
  public void onViewBackActionShowText(final View view, final PayloadBack payload)
  {
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewRefreshActionShowText(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    guictx.textViewActionShowTextText.setText(action.getDescription());
  }

  @Override
  public void onViewCreateActionShowText(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionShowTextXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

}
