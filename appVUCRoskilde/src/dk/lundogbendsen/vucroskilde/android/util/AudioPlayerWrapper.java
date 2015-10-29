package dk.lundogbendsen.vucroskilde.android.util;

import java.io.IOException;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.util.Log;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;

public class AudioPlayerWrapper
{
  private static final String TAG = AudioPlayerWrapper.class.getName();

  private MediaPlayer mp;

  private final MediaRefXML audioref;
  private final OnCompletionListener onCompletionListener;
  private final Activity activity;

  public AudioPlayerWrapper(final MediaRefXML audioref, final Activity activity, final OnCompletionListener onCompletionListener)
  {
    this.audioref = audioref;
    this.activity = activity;
    this.onCompletionListener = onCompletionListener;
  }

  public void createMediaPlayer()
  {
    mp = new MediaPlayer();

    mp.setOnCompletionListener(onCompletionListener);

    mp.reset();

    try
    {
      switch (audioref.getPlacementType())
      {
        case ASSETS:
        {
          AssetFileDescriptor afd = activity.getAssets().openFd(audioref.getPlacementPath());
          mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
          break;
        }
        case STORAGE:
        {
          String path = FileUtil.getNewMediaPath(activity, audioref.getPlacementPath());
          mp.setDataSource(path);
          break;
        }
        case URL:
        {
          Log.wtf(TAG, "URL for MediaPlayer not yet implemented");
          break;
        }
        case NULL:
        {
          AssetFileDescriptor afd = activity.getAssets().openFd("blip.3gp");
          mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
          break;
        }
      }
      mp.prepare();
    }
    catch (IOException e)
    {
      Log.e(TAG, e.getMessage());
    }
  }

  public void startMediaPlayer(final int position)
  {
    try
    {
      mp.seekTo(position);
      mp.start();
    }
    catch (IllegalStateException e)
    {
      Log.e(TAG, e.getMessage());
    }
  }

  public void stopMediaPlayer()
  {
    if (mp != null && mp.isPlaying())
    {
      mp.stop();
    }
  }

  public void destroyMediaPlayer()
  {
    stopMediaPlayer();
    mp = null;
  }

  public int getCurrentPosition()
  {
    return (mp == null ? 0 : mp.getCurrentPosition());
  }

}
