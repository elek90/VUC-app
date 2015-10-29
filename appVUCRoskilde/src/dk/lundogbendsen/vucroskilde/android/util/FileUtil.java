package dk.lundogbendsen.vucroskilde.android.util;

import java.io.File;
import java.util.Date;

import android.app.Activity;
import android.os.Environment;
import android.util.Log;
import dk.schoubo.library.android.util.DateAdapter;

public abstract class FileUtil
{
  private static final String TAG = FileUtil.class.getName();

  public static boolean ensureFolder(final String dirPath)
  {
    Log.w(TAG, "Trying to ensure: " + dirPath);
    File dir = new File(dirPath);
    return dir.exists() || dir.mkdirs();
  }

  public static String generateImageFilename(final Long id)
  {
    String timeStamp = DateAdapter.compactDate(new Date());
    return "action" + id + "img" + "_" + timeStamp + ".jpg";
  }

  public static String generateAudioFilename(final Long id)
  {
    String timeStamp = DateAdapter.compactDate(new Date());
    return "action" + id + "audio" + "_" + timeStamp + ".3gp";
  }

  public static String generateVideoFilename(final Long id)
  {
    String timeStamp = DateAdapter.compactDate(new Date());
    return "action" + id + "video" + "_" + timeStamp + ".webm"; // TODO or other filetype?
  }

  private static final NewMediaPlacement placement = NewMediaPlacement.PRIVATE; // TODO PUBLIC says card is read-only, even without
                                                                                // USB attached

  public static NewMediaPlacement getNewMediaPlacement()
  {
    return placement;
  }

  public static File getNewMediaDirectory(final Activity activity)
  {
    File dir = null;
    switch (placement)
    {
      case PUBLIC:
      {
        String dirPath = null;

        String dirPath1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + "/VUC";
        String dirPath2 = "/mnt/sdcard/sd" + "/VUC";
        String dirPath3 = "/mnt/sdcard/external_sd" + "/VUC";
        String dirPath4 = "/sdcard/sd" + "/VUC";
        String dirPath5 = "/sdcard/external_sd" + "/VUC";
        String dirPath6 = "/mnt/sdcard" + "/VUC";

        if (FileUtil.ensureFolder(dirPath1))
          dirPath = dirPath1;
        else if (FileUtil.ensureFolder(dirPath2))
          dirPath = dirPath2;
        else if (FileUtil.ensureFolder(dirPath3))
          dirPath = dirPath3;
        else if (FileUtil.ensureFolder(dirPath4))
          dirPath = dirPath4;
        else if (FileUtil.ensureFolder(dirPath5))
          dirPath = dirPath5;
        else if (FileUtil.ensureFolder(dirPath6)) dirPath = dirPath6;

        if (dirPath == null)
        {
          Log.wtf(TAG, "I give up trying to create a public folder");
        }
        else
        {
          dir = new File(dirPath);
          Log.w(TAG, "Public directory for images: " + dirPath + " (canonical path: " + dir.getAbsolutePath() + ")");
        }
        break;
      }
      case PRIVATE:
      {
        dir = activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!dir.exists())
        {
          Log.e(TAG, "Private Pictures-folder does not exist?");
        }
        else
        {
          Log.w(TAG, "Private directory for images: (canonical path: " + dir.getAbsolutePath() + ")");
        }
        break;
      }
    }
    return dir;
  }

  public static String getNewMediaPath(final Activity activity, final String filename)
  {
    File dir = FileUtil.getNewMediaDirectory(activity);
    File file = new File(dir, File.separator + filename);
    return file.getAbsolutePath();
  }

}
