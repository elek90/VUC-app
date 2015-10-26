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
import android.widget.Toast;
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
    guictx.editTextActionRecordTextText.setText(answer.getDescription());
  }

  @Override
  public void onViewClickActionRecordTextDoSaveImageButton(final View view, final PayloadClick payload)
  {
    answer.setDescription(guictx.editTextActionRecordTextText.getText().toString());
  }

  @Override
  public void onViewBackActionRecordText(final View view, final PayloadBack payload)
  {
    if (!answer.getDescription().equals(guictx.editTextActionRecordTextText.getText().toString()))
    {
      // TODO Are you sure dialog
      Toast.makeText(activity, "You loose text (later: Are you sure?)", Toast.LENGTH_LONG).show();
    }
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewRefreshActionRecordText(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    guictx.editTextActionRecordTextText.setText(answer.getDescription());
  }

  @Override
  public void onViewCreateActionRecordText(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordTextXML> getCurrentAction(busctx.getCurrentStepIfSelected());
    answer = busctx.<ActionRecordTextXML> getAnswer();
  }
}
