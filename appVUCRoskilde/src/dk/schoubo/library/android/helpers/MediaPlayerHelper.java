package dk.schoubo.library.android.helpers;

import java.io.FileDescriptor;
import java.io.IOException;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Handler;

public class MediaPlayerHelper
{
  public static final long DELTATIMEMS = 200;

  private MediaPlayer mediaPlayer;
  private MediaPlayerState mediaPlayerState;

  public boolean isPlaying()
  {
    return mediaPlayerState == MediaPlayerState.PLAYING;
  }

  public boolean isPausing()
  {
    return mediaPlayerState == MediaPlayerState.PAUSING;
  }

  private final OnCompletionListener listener;
  private final Handler handler;
  private final Runnable runnableUpdate;

  public MediaPlayerHelper(final OnCompletionListener listener, final Handler handler)
  {
    this(listener, handler, null);
  }

  public MediaPlayerHelper(final OnCompletionListener listener, final Handler handler, final Runnable runnableUpdate)
  {
    super();
    this.listener = listener;
    this.handler = handler;
    this.runnableUpdate = runnableUpdate;
  }

  public void stop()
  {
    if (isPlaying() || isPausing())
    {
      mediaPlayer.stop();
      if (runnableUpdate != null) handler.removeCallbacks(runnableUpdate);
      mediaPlayerState = MediaPlayerState.READY;
    }
  }

  public void pause()
  {
    if (isPlaying())
    {
      mediaPlayer.pause();
      if (runnableUpdate != null) handler.removeCallbacks(runnableUpdate);
      mediaPlayerState = MediaPlayerState.PAUSING;
    }
  }

  public void release()
  {
    if (mediaPlayer != null) mediaPlayer.release();
    mediaPlayer = null;
    mediaPlayerState = null;
  }

  public void create()
  {
    mediaPlayer = new MediaPlayer();
    mediaPlayerState = MediaPlayerState.CREATED;
  }

  public void prepare(final FileDescriptor fd) throws IllegalArgumentException, IllegalStateException, IOException
  {
    if (mediaPlayer != null)
    {
      mediaPlayer.reset();
      mediaPlayer.setDataSource(fd);
      mediaPlayer.setOnCompletionListener(listener);
      mediaPlayer.prepare();
      mediaPlayerState = MediaPlayerState.READY;
    }
  }

  public void prepare(final AssetFileDescriptor afd) throws IllegalArgumentException, IllegalStateException, IOException
  {
    if (mediaPlayer != null)
    {
      mediaPlayer.reset();
      mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
      mediaPlayer.setOnCompletionListener(listener);
      mediaPlayer.prepare();
      mediaPlayerState = MediaPlayerState.READY;
    }
  }

  public int getDuration()
  {
    return (mediaPlayer == null ? 0 : mediaPlayer.getDuration());
  }

  public void seekTo(final int posms)
  {
    if (mediaPlayer != null) mediaPlayer.seekTo(posms);
  }

  public void start()
  {
    mediaPlayer.start();
    if (runnableUpdate != null) handler.postDelayed(runnableUpdate, DELTATIMEMS);
    mediaPlayerState = MediaPlayerState.PLAYING;
  }

  public void setError()
  {
    mediaPlayerState = MediaPlayerState.ERROR;
  }

  public MediaPlayerState getState()
  {
    return mediaPlayerState;
  }

  public int getCurrentPosition()
  {
    if (mediaPlayer != null && mediaPlayerState != MediaPlayerState.CREATED && mediaPlayerState != MediaPlayerState.ERROR)
      return mediaPlayer.getCurrentPosition();
    else
      return 0;
  }

  public void seekToDelta(final int deltams)
  {
    if (mediaPlayer != null)
    {
      int positionms = mediaPlayer.getCurrentPosition();
      int newpositionms = Math.min(Math.max(0, positionms + deltams), mediaPlayer.getDuration());
      mediaPlayer.seekTo(newpositionms);
    }
  }

  public void setLooping(final boolean looping)
  {
    if (mediaPlayer != null)
    {
      mediaPlayer.setLooping(looping);
    }
  }

}
