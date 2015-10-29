package dk.lundogbendsen.vucroskilde.android.util;

import java.io.IOException;
import java.io.InputStream;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import dk.lundogbendsen.vucroskilde.android.R;

public abstract class DisplayUtil
{

  public static void formatActionbar(final Activity activity, final String title)
  {
    ActionBar actionbar = activity.getActionBar();
    actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
    actionbar.setLogo(R.drawable.vucroskilde_logo_simple_109x48);
    actionbar.setDisplayUseLogoEnabled(true);
    actionbar.setDisplayShowTitleEnabled(true);
    actionbar.setTitle(title);
    actionbar.show();
  }

  public static Drawable getDrawableFromAsset(final Activity activity, final String imageRef)
  {
    try
    {
      InputStream ims = activity.getAssets().open(imageRef);
      Drawable d = Drawable.createFromStream(ims, null);
      return d;
    }
    catch (IOException e)
    {
      return null;
    }
  }

}
