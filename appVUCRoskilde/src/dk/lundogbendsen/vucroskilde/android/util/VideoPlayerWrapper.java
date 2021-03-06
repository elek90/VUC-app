package dk.lundogbendsen.vucroskilde.android.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;

public class VideoPlayerWrapper
{
  private static final String TAG = VideoPlayerWrapper.class.getName();

  private MediaController mp;

  private final MediaRefXML videoref;
  private final Activity activity;
  private final VideoView videoView;
  private final Runnable onCompletionListener;

  public VideoPlayerWrapper(final MediaRefXML videoref, final Activity activity, final VideoView videoView)
  {
    this(videoref, activity, videoView, null);
  }
  
  public VideoPlayerWrapper(final MediaRefXML videoref, final Activity activity, final VideoView videoView, final Runnable onCompletionListener)
    {
    this.videoref = videoref;
    this.activity = activity;
    this.videoView = videoView;
    this.onCompletionListener = onCompletionListener;
  }

  private ProgressDialog dialog;

  public void createMediaPlayer()
  {
  }

  public void startMediaPlayer()
  {
    dialog = new ProgressDialog(activity);

    dialog.setMessage(activity.getString(R.string.wait));
    dialog.setIndeterminate(false);
    dialog.setCancelable(false);
    dialog.show();

    try
    {
      mp = new MediaController(activity);
      mp.setAnchorView(videoView);

      switch (videoref.getPlacementType())
      {
        case ASSETS:
        {
          Log.wtf(TAG, "Showing video from ASSETS not yet implemented");
          break;
        }
        case STORAGE:
        {
          String url = videoref.getPlacementPath();
          Uri uri = Uri.parse(url);
          videoView.setVideoURI(uri);
          break;
        }
        case URL:
        {
          String url = videoref.getPlacementPath();
          Uri uri = Uri.parse(url);
          videoView.setVideoURI(uri);
          break;
        }
        case NULL:
        {
          Toast.makeText(activity, "Ingen video", Toast.LENGTH_LONG).show();
          break;
        }

      }

      videoView.setMediaController(mp);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

    videoView.requestFocus();
    videoView.setOnPreparedListener(new OnPreparedListener()
    {
      @Override
      public void onPrepared(final MediaPlayer mp)
      {
        Log.w(TAG, "onprepared");

        if (dialog.isShowing())
        {
          Log.w(TAG, "onprepared dismiss");
          dialog.dismiss();
        }
        videoView.start();
      }
    });
    videoView.setOnCompletionListener(new OnCompletionListener()
    {
      @Override
      public void onCompletion(final MediaPlayer mp)
      {
        if (dialog.isShowing())
        {
          dialog.dismiss();
        }
        if (onCompletionListener != null)
        {
          onCompletionListener.run();
        }
      }
    });

  }

  public void stopMediaPlayer()
  {
    if (mp != null)
    {
      if (dialog.isShowing())
      {
        dialog.dismiss();
      }
      videoView.stopPlayback();
    }
  }

  public void destroyMediaPlayer()
  {
    stopMediaPlayer();
    mp = null;
  }
}
