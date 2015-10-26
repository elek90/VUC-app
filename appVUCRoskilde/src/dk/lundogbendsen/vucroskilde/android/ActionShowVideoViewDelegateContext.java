/**
 * THIS FILE IS GENERATED IF NOT FOUND ALREADY.
 * 
 * This is a template that must be filled out by you. Once created it will not be overwritten.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */

package dk.lundogbendsen.vucroskilde.android;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.MediaController;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoXML;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;

public class ActionShowVideoViewDelegateContext extends ActionShowVideoViewDelegateRoot
{

  private ActionShowVideoViewDelegateContext(final ActionShowVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowVideoGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionShowVideoViewDelegate create(final ActionShowVideoRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionShowVideoGUI guictx)
  {
    return new ActionShowVideoViewDelegateContext(activity, busctx, guictx);
  }

  private MediaController mediaController;
  private ActionShowVideoXML action;

  @Override
  public void onViewCreateActionShowVideo(final View view, final PayloadCreate payload)
  {
    // media_Controller = new MediaController(activity);

    action = busctx.<ActionShowVideoXML> getCurrentAction(busctx.getCurrentStepIfSelected());
  }

  @Override
  public void onViewRefreshActionShowVideo(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());
    
    busctx.setCurrentVideo(action.getVideoRef());

    DisplayMetrics dm = new DisplayMetrics();
    activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
    int height = dm.heightPixels;
    int width = dm.widthPixels;
    guictx.videoViewActionShowVideoVideo.setMinimumWidth(width);
    guictx.videoViewActionShowVideoVideo.setMinimumHeight(height);

    String url = action.getVideoRef();
    Uri uri = Uri.parse(url);

    final ProgressDialog dialog = new ProgressDialog(activity);

    dialog.setMessage(activity.getString(R.string.wait));
    dialog.setIndeterminate(false);
    dialog.setCancelable(false);
    dialog.show();

    try
    {

      mediaController = new MediaController(activity);
      mediaController.setAnchorView(guictx.videoViewActionShowVideoVideo);

      guictx.videoViewActionShowVideoVideo.setMediaController(mediaController);
      guictx.videoViewActionShowVideoVideo.setVideoURI(uri);

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

    guictx.videoViewActionShowVideoVideo.start();

    guictx.videoViewActionShowVideoVideo.requestFocus();
    guictx.videoViewActionShowVideoVideo.setOnPreparedListener(new OnPreparedListener()
    {
      @Override
      public void onPrepared(final MediaPlayer mp)
      {
        dialog.dismiss();
        guictx.videoViewActionShowVideoVideo.start();
      }
    });
    guictx.videoViewActionShowVideoVideo.setOnCompletionListener(new OnCompletionListener()
    {
      @Override
      public void onCompletion(final MediaPlayer mp)
      {
        if (dialog.isShowing())
        {
          dialog.dismiss();
        }
//        activity.finish();
      }
    });

  }

  // // TODO Use streaming - works
  // Toast.makeText(activity, "Video: "+action.getVideoRef(), Toast.LENGTH_LONG).show();
  // Uri uri = Uri.parse(action.getVideoRef());
  // Intent intent = new Intent(Intent.ACTION_VIEW, uri);
  // intent.setDataAndType(uri, "video/mp4");
  // activity.startActivity(intent);
  // husk også noget kontrol når den returnerer, så vi ikke bare spørger efter media player igen og igen...

  @Override
  public void onViewBackActionShowVideo(final View view, final PayloadBack payload)
  {
    guictx.videoViewActionShowVideoVideo.stopPlayback();
    goReturn(Activity.RESULT_OK);
  }

}
