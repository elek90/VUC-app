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
import dk.lundogbendsen.vucroskilde.android.generated.SetupGUI;
import dk.lundogbendsen.vucroskilde.android.generated.SetupRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.SetupViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.SetupViewDelegateRoot;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadCheck;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;


public class SetupViewDelegateContext extends SetupViewDelegateRoot
{

  private SetupViewDelegateContext(final SetupRootActivity activity, final VUCRoskildeBusinessContext busctx, final SetupGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static SetupViewDelegate create(final SetupRootActivity activity, final VUCRoskildeBusinessContext busctx, final SetupGUI guictx)
  {
    return new SetupViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickSetupTeacherCheckBox(final View view, final PayloadCheck payload)
  {
busctx.setRunAsTeacher(guictx.checkBoxSetupTeacher.isChecked());
  }

  @Override
  public void onViewRefreshSetup(final View view, final PayloadRefresh payload)
  {
    guictx.checkBoxSetupTeacher.setChecked(false);
    guictx.editTextSetupEmail.setText(busctx.getCurrentStudent().getContact().getEmail());
  }

  @Override
  public void onViewCreateSetup(final View view, final PayloadCreate payload)
  {
  }
  
  @Override
  public void onViewBackSetup(final View view, final PayloadBack payload)
  {
    String email = guictx.editTextSetupEmail.getText().toString();
    if (!email.isEmpty()) busctx.getCurrentStudent().getContact().setEmail(email);
    
    goReturn(Activity.RESULT_OK);
  }
}
