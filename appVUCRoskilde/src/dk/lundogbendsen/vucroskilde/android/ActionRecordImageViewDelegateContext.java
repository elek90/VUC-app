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
import android.util.Log;
import android.view.View;
import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageGUI;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageRootActivity;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageViewDelegate;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageViewDelegateRoot;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageXML;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;
import dk.lundogbendsen.vucroskilde.android.generated.NavigationPoint;
import dk.lundogbendsen.vucroskilde.android.util.DisplayUtil;
import dk.lundogbendsen.vucroskilde.android.util.FileUtil;
import dk.schoubo.library.android.ui.framework.PayloadBack;
import dk.schoubo.library.android.ui.framework.PayloadClick;
import dk.schoubo.library.android.ui.framework.PayloadCreate;
import dk.schoubo.library.android.ui.framework.PayloadRefresh;

public class ActionRecordImageViewDelegateContext extends ActionRecordImageViewDelegateRoot
{
  private static final String TAG = ActionRecordImageViewDelegateContext.class.getName();

  private ActionRecordImageXML action;
  private ActionRecordImageXML answer;

//  private File imageFile;
  private MediaRefXML imageFileRef;

  private ActionRecordImageViewDelegateContext(final ActionRecordImageRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordImageGUI guictx)
  {
    super(activity, busctx, guictx);
  }

  public static ActionRecordImageViewDelegate create(final ActionRecordImageRootActivity activity, final VUCRoskildeBusinessContext busctx, final ActionRecordImageGUI guictx)
  {
    return new ActionRecordImageViewDelegateContext(activity, busctx, guictx);
  }

  @Override
  public void onViewClickActionRecordImageDoRecordImageButton(final View view, final PayloadClick payload)
  {
    String path = FileUtil.getNewMediaPath(activity, FileUtil.generateImageFilename(action.getId()));
    imageFileRef.setPlacementPath(path);
    imageFileRef.setPlacementType(PlacementType.STORAGE);

    goSubExternalCamera();
  }

  @Override
  public void onViewClickActionRecordImageDoSelectImageButton(final View view, final PayloadClick payload)
  {
    goSubExternalGallery();
  }

  @Override
  public void onReturnFromExternalCameraOK(final Intent data)
  {
//    answer.getImageRef().setPlacementPath(imageFileRef.getPlacementPath());
//    answer.getImageRef().setPlacementType(PlacementType.STORAGE);
    Log.i(TAG, "Image from camera: " + imageFileRef.getPlacementPath());

    // TODO MediaScannerConnection.scanFile will not work for PRIVATE storage?
    Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    File f = new File("file:" + imageFileRef.getPlacementPath());
    Uri contentUri = Uri.fromFile(f);
    mediaScanIntent.setData(contentUri);
    activity.sendBroadcast(mediaScanIntent);

    activity.refreshGUI();
  }

  @Override
  public void onReturnFromExternalGalleryOK(final Intent data)
  {
    imageFileRef.setPlacementPath(data.getData().toString());
    imageFileRef.setPlacementType(PlacementType.STORAGE);
//    answer.getImageRef().setPlacementPath(data.getData().toString());
//    answer.getImageRef().setPlacementType(PlacementType.STORAGE);
    Log.i(TAG, "Image from gallery: " + data.getData().toString());

    activity.refreshGUI();
  }

  @Override
  public void goSubExternalCamera()
  {
    // Start camera

    Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    takePicture.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(imageFileRef.getPlacementPath())));

    activity.startActivityForResult(takePicture, NavigationPoint.EXTERNALCAMERA.ordinal());
  }

  @Override
  public void goSubExternalGallery()
  {
    // Pick photo from gallery

    Intent pickPhoto = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    activity.startActivityForResult(pickPhoto, NavigationPoint.EXTERNALGALLERY.ordinal());
  }

  @Override
  public void onViewClickActionRecordImageDoRegretImageButton(final View view, final PayloadClick payload)
  {
    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      imageFileRef.setPlacementPath(answer.getImageRef().getPlacementPath());
      imageFileRef.setPlacementType(answer.getImageRef().getPlacementType());

      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewClickActionRecordImageDoSaveImageButton(final View view, final PayloadClick payload)
  {
    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      answer.getImageRef().setPlacementPath(imageFileRef.getPlacementPath());
      answer.getImageRef().setPlacementType(imageFileRef.getPlacementType());

      goReturn(Activity.RESULT_OK);
    }

  }

  @Override
  public void onViewBackActionRecordImage(final View view, final PayloadBack payload)
  {
    boolean goAhead = true;
    // TODO Are you sure?
    // goAhead måske= false;
    if (goAhead)
    {
      goReturn(Activity.RESULT_OK);
    }
  }

  @Override
  public void onViewRefreshActionRecordImage(final View view, final PayloadRefresh payload)
  {
    DisplayUtil.formatActionbar(activity, busctx.getCurrentStepIfSelected().getStepName());

    // TODO Supposes placementtype = STORAGE
    Uri selectedImage = Uri.parse(imageFileRef.getPlacementPath());
    guictx.imageViewActionRecordImageImage.setImageURI(selectedImage);

    guictx.textViewActionRecordImageText.setText(action.getDescription());
  }

  @Override
  public void onViewCreateActionRecordImage(final View view, final PayloadCreate payload)
  {
    action = busctx.<ActionRecordImageXML> getCurrentAction(busctx.getCurrentStepIfSelected());
    answer = busctx.<ActionRecordImageXML> getAnswer();
    
    imageFileRef = MediaRefXML.create();
    imageFileRef.setPlacementPath(answer.getImageRef().getPlacementPath());
    imageFileRef.setPlacementType(answer.getImageRef().getPlacementType());
  }

}
