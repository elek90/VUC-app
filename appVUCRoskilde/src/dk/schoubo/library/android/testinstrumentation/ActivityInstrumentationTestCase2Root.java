package dk.schoubo.library.android.testinstrumentation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Environment;
import android.test.ActivityInstrumentationTestCase2;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import dk.schoubo.library.android.util.LogUtil;

public class ActivityInstrumentationTestCase2Root<A extends Activity> extends ActivityInstrumentationTestCase2<A>
{
  public String TAG() { return LogUtil.getClassName(this); }


  protected static final int WAITFORACTIVITY = 1500;
  protected static final int WAITFORSPLASH = 5000;
  protected static final int WAITFORSCREENSHOT = 1500;




  public ActivityInstrumentationTestCase2Root(final Class<A> activityClass)
  {
    super(activityClass);
  }

  protected void keyBack()
  {
    if (isScreenshotsAutomatic()) takeScreenshot("Before BACK key");
    this.sendKeys(KeyEvent.KEYCODE_BACK);
  }

  protected void keyMenu()
  {
    if (isScreenshotsAutomatic()) takeScreenshot("Before MENU key");
    this.sendKeys(KeyEvent.KEYCODE_MENU);
  }

  private boolean takeScreenshotsAutomatic;
  public void setScreenshotsAutomatic(final boolean takeScreenshotsAutomatic) { this.takeScreenshotsAutomatic = takeScreenshotsAutomatic; }
  public boolean isScreenshotsAutomatic() { return takeScreenshotsAutomatic; }

  private static int testNumber = 0;
  private static int testSubNumber = 0;
  private static int testStep = 0;
  protected int newTestNumber() { testNumber += 1; testSubNumber = 1; testStep = 1; return testNumber; }

  private Activity lastActivity;
  public void setLastActivity(final Activity lastActivity) { this.lastActivity = lastActivity; }

  protected final String SCREENSHOTS_LOCATION = Environment.getExternalStorageDirectory().toString() + "/generator/screenshots/";

  protected final String GENERATORLOG_FILENAME = "generatortest";

  protected void takeScreenshot()
  {
    takeScreenshot("");
  }

  protected void takeScreenshot(final String comment)
  {
    waitMillis(WAITFORSCREENSHOT);

    Display display = lastActivity.getWindowManager().getDefaultDisplay();
    Point size = new Point();
    display.getSize(size);

    final Bitmap bitmap = Bitmap.createBitmap(size.x, size.y, Bitmap.Config.ARGB_8888);
    final Canvas canvas = new Canvas(bitmap);

    // Not needed, as we do not dump the entire screen, only the app's current activity window
    //    final Theme theme = lastActivity.getTheme();
    //    final TypedArray ta = theme.obtainStyledAttributes(new int[] { android.R.attr.windowBackground });
    //    final int res = ta.getResourceId(0, 0);
    //    final Drawable background = lastActivity.getResources().getDrawable(res);
    //    background.draw(canvas);

    final View view = lastActivity.getWindow().getDecorView();
    lastActivity.runOnUiThread(new Runnable() { @Override public void run() { view.draw(canvas); } });

    FileOutputStream fos = null;
    try
    {
      final File sddir = new File(SCREENSHOTS_LOCATION);
      if (!sddir.exists()) sddir.mkdirs();

      String filename = "" + testNumber + "." + testSubNumber + "-" + lastActivity.getClass().getSimpleName();
      if (!comment.isEmpty()) filename += "-" + comment;

      testSubNumber += 1;
      testStep = 1;

      fos = new FileOutputStream(SCREENSHOTS_LOCATION + filename + ".png");
      if (fos != null)
      {
        if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos))
        {
          Log.wtf(TAG(), "Compress/Write failed");
        }
        fos.flush();
        fos.close();
      }
    }
    catch (Exception e)
    {
      Log.wtf(TAG(), e);
    }
  }

  protected PrintStream log;

  protected void takeComment(final String comment)
  {
    if (log == null)
    {
      try
      {
        final File sddir = new File(SCREENSHOTS_LOCATION);
        if (!sddir.exists()) sddir.mkdirs();

        log = new PrintStream(new File(SCREENSHOTS_LOCATION + GENERATORLOG_FILENAME + ".log"));

        Calendar cal = GregorianCalendar.getInstance();
        String now = DateFormat.format("yyyy-MM-dd, hh:mm:ss", cal).toString();
        log.println("Generated from toolGenerator by Jan Schoubo, schoubo reasoning");
        log.println();
        log.println("File name:             " + GENERATORLOG_FILENAME + ".log");
        log.println("Time:                  " + now);
        log.println("Java Test Class:       " + this.getClass().getSimpleName());
        log.println("Automatic screenshots: " + isScreenshotsAutomatic());
        log.println();
      }
      catch (Exception e)
      {
        Log.wtf(TAG(), e);
      }
    }

    if (testStep == 1) log.println();
    log.println("" + testNumber + "." + testSubNumber + "." + testStep + ": "+comment);
    log.flush();

    testStep += 1;
  }

  protected void waitMillis(final int ms)
  {
    try { Thread.sleep(ms); } catch (InterruptedException e) { }
  }

}
