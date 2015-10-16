package dk.schoubo.library.android.ui.framework;

import android.app.Activity;
import android.app.ProgressDialog;
import dk.schoubo.library.android.util.Util;

public class ProgressBarBusy
{
  private final ProgressDialog progressBar;

  private final int windowResource;
  private final int backgroundColor;
  private final int textColor;

  private ProgressBarBusy(final Activity activity, final String message, final int windowResource, final int backgroundColor, final int textColor)
  {
    super();
    this.progressBar = new ProgressDialog(activity);
    this.progressBar.setCancelable(false);
    this.progressBar.setMessage(message);
    this.progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    this.progressBar.setIndeterminate(true);

    this.windowResource = windowResource;
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
  }

  public static ProgressBarBusy create(final Activity activity, final String message, final int windowResource, final int backgroundColor, final int textColor)
  {
    return new ProgressBarBusy(activity, message, windowResource, backgroundColor, textColor);
  }

  public void show()
  {
    this.progressBar.show();

    // Due to known problem with htc phones and ProgressBar - showing black in almost black if you change style theme
    Util.fixDialog(progressBar, windowResource, backgroundColor, textColor);
  }

  public void dismiss()
  {
    progressBar.dismiss();
  }

}
