/**
 * THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */

package dk.lundogbendsen.vucroskilde.android;

import android.app.Activity;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;

public class ActionRecordTextViewDelegateContext extends ActionRecordTextViewDelegateRoot
{
  @SuppressWarnings("unused")
  private ActionRecordTextXML action;
  private ActionRecordTextXML answer;

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
    boolean goAhead = true;
    String oldText = answer.getDescription();
    String newText = guictx.editTextActionRecordTextText.getText().toString();
    if (!newText.isEmpty() && !oldText.equals(newText))
    {
      // TODO Are you sure?
      // goAhead måske= false;
    }
    if (goAhead)
    {
      guictx.editTextActionRecordTextText.setText(oldText);
    }
  }

  @Override
  public void onViewClickActionRecordTextDoSaveImageButton(final View view, final PayloadClick payload)
  {
      answer.setDescription(guictx.editTextActionRecordTextText.getText().toString());
      goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewBackActionRecordText(final View view, final PayloadBack payload)
  {
    boolean goAhead = true;
    String oldText = answer.getDescription();
    String newText = guictx.editTextActionRecordTextText.getText().toString();
    if (!newText.isEmpty() && !oldText.equals(newText))
    {
      // TODO Are you sure?
      // goAhead måske= false;
    }

    if (goAhead)
    {
      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewRefreshActionRecordText(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());
  }

  @Override
  public void onViewCreateActionRecordText(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordTextXML> getCurrentAction();
    answer = busctx.<ActionRecordTextXML> getAnswer();

    guictx.editTextActionRecordTextText.setText(answer.getDescription());
  }
}
