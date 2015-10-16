package dk.schoubo.library.android.util;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class Util
{
  public static void fixDialog(final Dialog d, final int windowResource, final int backgroundColorId, final int textColorId)
  {
    View v = d.getWindow().getDecorView();
    int backgroundColor = v.getResources().getColor(backgroundColorId);
    int textColor = v.getResources().getColor(textColorId);

    //    UtilDebug.dumpViewHierarchy(v);

    // TODO Create a proper 9-er instead
    d.getWindow().setBackgroundDrawableResource(windowResource); //backgroundColorId);

    fixDialog(d, v, 0, backgroundColor, textColor);
  }

  private static void fixDialog(final Dialog d, final View v, final int level, final int backgroundColor, final int textColor)
  {
    v.setBackgroundColor(backgroundColor);

    if (v instanceof ViewGroup)
    {
      ViewGroup gv = (ViewGroup)v;

      for (int i = 0; i < gv.getChildCount(); i++)
      {
        fixDialog(d, gv.getChildAt(i), level+1, backgroundColor, textColor);
      }

      //            if (gv.getChildCount() >= 2 &&
      //                gv.getChildAt(0) instanceof ProgressBar &&
      //                gv.getChildAt(1) instanceof TextView)
      //            {
      //              TextView tv = (TextView)gv.getChildAt(1);
      //
      //      //        ColorStateList csl = tv.getTextColors();
      //      //        Log.w(TAG, "default color from progressbar: "+Integer.toHexString(csl.getDefaultColor()));
      //
      //              tv.setTextColor(textColor);
      //            }


      //      if (v instanceof Spinner)
      //      {
      //        Spinner tv = (Spinner)v;
      //        SpinnerAdapter ad = tv.getAdapter();
      //        for (int i = 0; i < ad.getCount(); i++)
      //          {
      //           View dv = ad.getView(i, null, gv);
      //           if (dv instanceof TextView)
      //           {
      //             TextView tdv = (TextView)dv;
      //             tdv.setTextColor(textColor);
      //           }
      //          }
      //      }
    }
    else if (v instanceof TextView)
    {
      TextView tv = (TextView)v;
      tv.setTextColor(textColor);
    }
  }

}
