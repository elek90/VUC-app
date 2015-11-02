/**
 * THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */

package dk.lundogbendsen.vucroskilde.android;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;
import dk.lundogbendsen.vucroskilde.android.generated.NavigationPoint;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.lundogbendsen.vucroskilde.android.util.FileUtil;
import dk.lundogbendsen.vucroskilde.android.util.VideoPlayerWrapper;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadDestroy;
import dk.schoubo.library.android.ui.framework.PayloadPause;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;
import dk.schoubo.library.android.ui.framework.PayloadResume;

public class ActionRecordVideoViewDelegateContext extends ActionRecordVideoViewDelegateRoot
{
  private static final String TAG = ActionRecordVideoViewDelegateContext.class.getName();

  private ActionRecordVideoXML action;
  private ActionRecordVideoXML answer;

  private MediaRefXML videoFileRef;

  private VideoPlayerWrapper wpw;

  private ActionRecordVideoViewDelegateContext(final ActionRecordVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordVideoGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionRecordVideoViewDelegate create(final ActionRecordVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordVideoGUI guictx)
  {
    return new ActionRecordVideoViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionRecordVideoDoRecordImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }

    String path = FileUtil.getNewMediaPath(activity, FileUtil.generateVideoFilename(action.getId()));
    videoFileRef.setPlacementPath(path);
    videoFileRef.setPlacementType(PlacementType.STORAGE);

    goSubExternalVideoCamera();
  }

  @Override
  public void onViewClickActionRecordVideoDoSelectImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }

    goSubExternalVideoGallery();
  }

  @Override
  public void onReturnFromExternalVideoCameraOK(final Intent data)
  {
    Log.i(TAG, "Video from camera: " + videoFileRef.getPlacementPath());

    // TODO MediaScannerConnection.scanFile will not work for PRIVATE storage?
    Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    File f = new File("file:" + videoFileRef.getPlacementPath());
    Uri contentUri = Uri.fromFile(f);
    mediaScanIntent.setData(contentUri);
    activity.sendBroadcast(mediaScanIntent);

    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExternalVideoGalleryOK(final Intent data)
  {
    videoFileRef.setPlacementPath(data.getData().toString());
    videoFileRef.setPlacementType(PlacementType.STORAGE);
    Log.i(TAG, "Video from gallery: " + data.getData().toString());

    activity.refreshGUI();
  }

  @Override
  public void goSubExternalVideoCamera()
  {
    // Start camera
    Intent takePicture = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
    takePicture.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(videoFileRef.getPlacementPath())));
    takePicture.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, (Constants.DEFAULT_VIDEO_QUALITY_IS_HIGH ? 1 : 0));
    takePicture.putExtra(MediaStore.EXTRA_SIZE_LIMIT, busctx.getMaxVideoSizeBytes());
    
    activity.startActivityForResult(takePicture, NavigationPoint.EXTERNALVIDEOCAMERA.ordinal());
  }

  @Override
  public void goSubExternalVideoGallery()
  {
    // Pick photo from gallery
    Intent pickPhoto = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
    activity.startActivityForResult(pickPhoto, NavigationPoint.EXTERNALVIDEOGALLERY.ordinal());
  }

  @Override
  public void onViewClickActionRecordVideoDoRegretImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }

    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      videoFileRef.setPlacementPath(answer.getVideoRef().getPlacementPath());
      videoFileRef.setPlacementType(answer.getVideoRef().getPlacementType());

      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewClickActionRecordVideoDoSaveImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }

    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      answer.getVideoRef().setPlacementPath(videoFileRef.getPlacementPath());
      answer.getVideoRef().setPlacementType(videoFileRef.getPlacementType());

      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewBackActionRecordVideo(final View view, final PayloadBack payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }

    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewRefreshActionRecordVideo(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    DisplayMetrics dm = new DisplayMetrics();
    activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
    int height = dm.heightPixels;
    int width = dm.widthPixels;
    guictx.videoViewActionRecordVideoVideo.setMinimumWidth(width);
    guictx.videoViewActionRecordVideoVideo.setMinimumHeight(height);

    // Does not start automatically
    // wpw.createMediaPlayer();
    // wpw.startMediaPlayer();

    guictx.textViewActionRecordVideoCaption.setText(action.getDescription());

    if (busctx.isMediaPlaying())
    {
      guictx.imageButtonActionRecordVideoDoPlay.setImageResource(R.drawable.ic_pause_black_24dp);
    }
    else
    {
      guictx.imageButtonActionRecordVideoDoPlay.setImageResource(R.drawable.ic_play_arrow_black_24dp);
    }

  }

  @Override
  public void onViewClickActionRecordVideoDoPlayImageButton(final View view, final PayloadClick payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }
    else
    {
      wpw.createMediaPlayer();
      wpw.startMediaPlayer();
      busctx.setMediaPlaying(true);
    }

    activity.refreshGUI();
  }

  @Override
  public void onViewCreateActionRecordVideo(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordVideoXML> getCurrentAction();
    answer = busctx.<ActionRecordVideoXML> getAnswer();

    videoFileRef = MediaRefXML.create();
    videoFileRef.setPlacementPath(FileUtil.getNewMediaPath(activity, FileUtil.generateVideoFilename(action.getId())));
    videoFileRef.setPlacementType(PlacementType.STORAGE);

    wpw = new VideoPlayerWrapper(videoFileRef, activity, guictx.videoViewActionRecordVideoVideo, new Runnable()
    {
      @Override
      public void run()
      {
        busctx.setMediaPlaying(false);
        activity.refreshGUI();
      }
    });
    busctx.setMediaPlaying(false);
    busctx.setMediaPosition(0);

    activity.refreshGUI();
  }

  @Override
  public void onViewResumeActionRecordVideo(final View view, final PayloadResume payload)
  {
    wpw.createMediaPlayer();
    if (busctx.isMediaPlaying())
    {
      wpw.startMediaPlayer();
      busctx.setMediaPlaying(true);
    }

    activity.refreshGUI();
  }

  @Override
  public void onViewPauseActionRecordVideo(final View view, final PayloadPause payload)
  {
    if (busctx.isMediaPlaying())
    {
      wpw.stopMediaPlayer();
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(true);
    }
    else
    {
      wpw.destroyMediaPlayer();
      busctx.setMediaPlaying(false);
    }
  }

  @Override
  public void onViewDestroyActionRecordVideo(final View view, final PayloadDestroy payload)
  {
    wpw = null;
  }

}
