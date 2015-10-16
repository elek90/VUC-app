package dk.lundogbendsen.vucroskilde.android.util;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import dk.lundogbendsen.vucroskilde.android.R;

public abstract class DisplayUtil
{

  public static void formatActionbar(final Activity activity, final String title)
  {
    ActionBar actionbar = activity.getActionBar();
    actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
    actionbar.setLogo(R.drawable.vucroskilde_logo_landscape_209x48);
    actionbar.setDisplayUseLogoEnabled(true);
    actionbar.setDisplayShowTitleEnabled(true);
    actionbar.setTitle(title);
    actionbar.show();
  }

}
