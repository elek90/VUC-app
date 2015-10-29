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
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;

public class ActionShowImageViewDelegateContext extends ActionShowImageViewDelegateRoot
{

  private static final String TAG = ActionShowImageViewDelegateContext.class.getName();
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
    goReturn(Activity.RESULT_OK);
  }

  @Override
  public void onViewRefreshActionShowImage(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());
    guictx.textViewActionShowImageText.setText(action.getDescription());

    switch (action.getImageRef().getPlacementType())
    {
      case ASSETS:
      {
        Drawable d = DisplayUtil.getDrawableFromAsset(activity, action.getImageRef().getPlacementPath());
        guictx.imageViewActionShowImageImage.setImageDrawable(d);
        break;
      }
      case STORAGE:
      {
        Uri uri = Uri.parse(action.getImageRef().getPlacementPath());
        guictx.imageViewActionShowImageImage.setImageURI(uri);
        break;
      }
      case URL:
      {
        Log.wtf(TAG, "Show Image from URL not yet implemented");
        break;
      }
      case NULL:
      {
        guictx.imageViewActionShowImageImage.setImageResource(R.drawable.vucroskilde_logo_simple);
        break;
      }
    }
  }

  @Override
  public void onViewCreateActionShowImage(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionShowImageXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

}
