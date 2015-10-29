package dk.lundogbendsen.vucroskilde.android.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;

public abstract class ImageUtil
{
  private static final String TAG = ImageUtil.class.getName();

  public static boolean saveBitmapToFile(final Bitmap bmp, final File file)
  {

    FileOutputStream fOut = null;
    try
    {
      fOut = new FileOutputStream(file);

      bmp.compress(Bitmap.CompressFormat.JPEG, 85, fOut);
      fOut.flush();
      fOut.close();
      return true;
    }
    catch (FileNotFoundException e)
    {
      Log.e(TAG, "Could not store image in file " + file.getAbsolutePath() + ": " + e.getMessage());
    }
    catch (IOException e)
    {
      Log.e(TAG, "Could not store image in file " + file.getAbsolutePath() + ": " + e.getMessage());
    }
    finally
    {
      if (fOut != null)
      {
        try
        {
          fOut.close();
        }
        catch (IOException e)
        {
        }
      }
    }
    return false;
  }

  // Decode a Scaled Image
  //
  // Managing multiple full-sized images can be tricky with limited memory.
  // If you find your application running out of memory after displaying just a few images,
  // you can dramatically reduce the amount of dynamic heap used by expanding the JPEG into a
  // memory array that's already scaled to match the size of the destination view.
  // The following example method demonstrates this technique.

  // From http://developer.android.com/training/camera/photobasics.html

  public static void setPrescaledImage(final ImageView imageView, final String imageFilePath)
  {
    // Get the dimensions of the View
    int targetW = imageView.getWidth();
    int targetH = imageView.getHeight();

    // Get the dimensions of the bitmap
    BitmapFactory.Options bmOptions = new BitmapFactory.Options();
    bmOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(imageFilePath, bmOptions);
    int photoW = bmOptions.outWidth;
    int photoH = bmOptions.outHeight;

    // Determine how much to scale down the image
    int scaleFactor = Math.min(photoW / targetW, photoH / targetH);

    // Decode the image file into a Bitmap sized to fill the View
    bmOptions.inJustDecodeBounds = false;
    bmOptions.inSampleSize = scaleFactor;
    // bmOptions.inPurgeable = true;

    Bitmap bitmap = BitmapFactory.decodeFile(imageFilePath, bmOptions);
    imageView.setImageBitmap(bitmap);
  }

}
