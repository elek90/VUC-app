package dk.lundogbendsen.vucroskilde.android.util;

import java.io.IOException;

import android.media.MediaRecorder;
import android.util.Log;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;

public class AudioRecorderWrapper
{
  private static final String TAG = AudioRecorderWrapper.class.getName();

  private MediaRecorder mp;

  private final MediaRefXML audioref;
//  @SuppressWarnings("unused")
//  private final Activity activity;

  public AudioRecorderWrapper(final MediaRefXML audioref)//, final Activity activity)
  {
    this.audioref = audioref;
//    this.activity = activity;
  }

  public void createMediaRecorder()
  {
    mp = new MediaRecorder();
    mp.setAudioSource(MediaRecorder.AudioSource.MIC);
    mp.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
    mp.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

    switch (audioref.getPlacementType())
    {
      case ASSETS:
      {
        Log.wtf(TAG, "Record to ASSETS not yet implemented");
        break;
      }
//      case PRIVATE_STORAGE:
//      case PUBLIC_STORAGE:
//      {
//        String path = FileUtil.getNewMediaPath(activity, audioref.getPlacementPath());
//        mp.setOutputFile(path);
//        break;
//      }
      case STORAGE:
      {
        mp.setOutputFile(audioref.getPlacementPath());
        break;
      }
      case URL:
      {
        Log.wtf(TAG, "Record to URL not yet implemented");
        break;
      }
      case NULL:
      {
        Log.wtf(TAG, "record to NULL not yet implemented");
        break;
      }
    }

    try
    {
      mp.prepare();
    }
    catch (IOException e)
    {
      Log.e(TAG, e.getMessage());
    }
  }

  public void startMediaRecorder()
  {
    mp.start();
  }

  public void stopMediaRecorder()
  {
    if (mp != null)
    {
      mp.stop();
    }
  }

  public void destroyMediaRecorder()
  {
    if (mp != null)
    {
      mp.release();
      mp = null;
    }
  }
}
