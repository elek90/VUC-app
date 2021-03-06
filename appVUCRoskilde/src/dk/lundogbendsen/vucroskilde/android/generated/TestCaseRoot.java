/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.app.Instrumentation.ActivityMonitor;
import android.test.TouchUtils;
import android.test.ViewAsserts;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.testinstrumentation.ActivityInstrumentationTestCase2Root;


public class TestCaseRoot extends ActivityInstrumentationTestCase2Root<FlowchartMainActivity>
{
  public TestCaseRoot(Class<FlowchartMainActivity> activityClass)
  {
    super(activityClass);
  }


  private AboutActivity about;
  protected AboutActivity getActivityAbout() { return about; }

  private ActivityMonitor monitorAbout;
  protected ActivityMonitor getMonitorAbout() { return monitorAbout; }

  protected void waitForActivityAboutWithTimeout(final int secs)
  {
    takeComment("Wait for AboutActivity");
    about = (AboutActivity) monitorAbout.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityAboutWithTimeout gave null after "+secs+" seconds", about);
    nullAllFieldsAbout();
    setLastActivity(about);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for AboutActivity");
    }
  }

  protected void prepareToWaitForActivityAbout()
  {
    if (monitorAbout == null) monitorAbout = getInstrumentation().addMonitor(AboutActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsAbout()
  {
    takeComment("Verifying all fields in AboutActivity");
    getViewAboutDescription();
  }

  protected void nullAllFieldsAbout()
  {
    textViewAboutDescription = null;
  }

  private TextView textViewAboutDescription;

  protected TextView getViewAboutDescription()
  {
    assertNotNull("about not set - did you remember to call setActivityAbout(final AboutActivity about) ?", about);
    if (textViewAboutDescription == null)
    {
      textViewAboutDescription = (TextView) about.findViewById(R.id.textViewAboutDescription);
      assertNotNull("R.id.textViewAboutDescription could not be found via about", textViewAboutDescription);
    }
    setLastActivity(about);
    return textViewAboutDescription;
  }

  protected void clickAboutDescription()
  {
    takeComment("Before click on AboutDescription");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickAboutDescription");
    TouchUtils.clickView(this, getViewAboutDescription());
  }

  protected void verifyTextAboutDescription(final int id)
  {
    assertEquals("Incorrect AboutDescription.getText()", about.getString(id), getViewAboutDescription().getText().toString());
  }

  protected void verifyTextAboutDescription(final String text)
  {
    assertEquals("Incorrect AboutDescription.getText()", text, getViewAboutDescription().getText().toString());
  }

  protected void setTextAboutDescription(final String text)
  {
    takeComment("Setting AboutDescription to '"+text+"'");
    final TextView view = getViewAboutDescription();
    about.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextAboutDescription()
  {
    return getViewAboutDescription().getText().toString();
  }

  protected void verifyOnScreenAboutDescription()
  {
    ViewAsserts.assertOnScreen(about.getWindow().getDecorView(), getViewAboutDescription());
  }

  private ActionRecordAudioActivity actionRecordAudio;
  protected ActionRecordAudioActivity getActivityActionRecordAudio() { return actionRecordAudio; }

  private ActivityMonitor monitorActionRecordAudio;
  protected ActivityMonitor getMonitorActionRecordAudio() { return monitorActionRecordAudio; }

  protected void waitForActivityActionRecordAudioWithTimeout(final int secs)
  {
    takeComment("Wait for ActionRecordAudioActivity");
    actionRecordAudio = (ActionRecordAudioActivity) monitorActionRecordAudio.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionRecordAudioWithTimeout gave null after "+secs+" seconds", actionRecordAudio);
    nullAllFieldsActionRecordAudio();
    setLastActivity(actionRecordAudio);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionRecordAudioActivity");
    }
  }

  protected void prepareToWaitForActivityActionRecordAudio()
  {
    if (monitorActionRecordAudio == null) monitorActionRecordAudio = getInstrumentation().addMonitor(ActionRecordAudioActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionRecordAudio()
  {
    takeComment("Verifying all fields in ActionRecordAudioActivity");
    getViewActionRecordAudioCaption();
    getViewActionRecordAudioDoRecord();
    getViewActionRecordAudioDoPlay();
    getViewActionRecordAudioDoRegret();
    getViewActionRecordAudioDoSave();
  }

  protected void nullAllFieldsActionRecordAudio()
  {
    textViewActionRecordAudioCaption = null;
    imageButtonActionRecordAudioDoRecord = null;
    imageButtonActionRecordAudioDoPlay = null;
    imageButtonActionRecordAudioDoRegret = null;
    imageButtonActionRecordAudioDoSave = null;
  }

  private TextView textViewActionRecordAudioCaption;

  protected TextView getViewActionRecordAudioCaption()
  {
    assertNotNull("actionRecordAudio not set - did you remember to call setActivityActionRecordAudio(final ActionRecordAudioActivity actionRecordAudio) ?", actionRecordAudio);
    if (textViewActionRecordAudioCaption == null)
    {
      textViewActionRecordAudioCaption = (TextView) actionRecordAudio.findViewById(R.id.textViewActionRecordAudioCaption);
      assertNotNull("R.id.textViewActionRecordAudioCaption could not be found via actionRecordAudio", textViewActionRecordAudioCaption);
    }
    setLastActivity(actionRecordAudio);
    return textViewActionRecordAudioCaption;
  }

  protected void clickActionRecordAudioCaption()
  {
    takeComment("Before click on ActionRecordAudioCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordAudioCaption");
    TouchUtils.clickView(this, getViewActionRecordAudioCaption());
  }

  protected void verifyTextActionRecordAudioCaption(final int id)
  {
    assertEquals("Incorrect ActionRecordAudioCaption.getText()", actionRecordAudio.getString(id), getViewActionRecordAudioCaption().getText().toString());
  }

  protected void verifyTextActionRecordAudioCaption(final String text)
  {
    assertEquals("Incorrect ActionRecordAudioCaption.getText()", text, getViewActionRecordAudioCaption().getText().toString());
  }

  protected void setTextActionRecordAudioCaption(final String text)
  {
    takeComment("Setting ActionRecordAudioCaption to '"+text+"'");
    final TextView view = getViewActionRecordAudioCaption();
    actionRecordAudio.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionRecordAudioCaption()
  {
    return getViewActionRecordAudioCaption().getText().toString();
  }

  protected void verifyOnScreenActionRecordAudioCaption()
  {
    ViewAsserts.assertOnScreen(actionRecordAudio.getWindow().getDecorView(), getViewActionRecordAudioCaption());
  }

  private ImageButton imageButtonActionRecordAudioDoRecord;

  protected ImageButton getViewActionRecordAudioDoRecord()
  {
    assertNotNull("actionRecordAudio not set - did you remember to call setActivityActionRecordAudio(final ActionRecordAudioActivity actionRecordAudio) ?", actionRecordAudio);
    if (imageButtonActionRecordAudioDoRecord == null)
    {
      imageButtonActionRecordAudioDoRecord = (ImageButton) actionRecordAudio.findViewById(R.id.imageButtonActionRecordAudioDoRecord);
      assertNotNull("R.id.imageButtonActionRecordAudioDoRecord could not be found via actionRecordAudio", imageButtonActionRecordAudioDoRecord);
    }
    setLastActivity(actionRecordAudio);
    return imageButtonActionRecordAudioDoRecord;
  }

  protected void clickActionRecordAudioDoRecord()
  {
    takeComment("Before click on ActionRecordAudioDoRecord");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordAudioDoRecord");
    TouchUtils.clickView(this, getViewActionRecordAudioDoRecord());
  }

  protected void verifyOnScreenActionRecordAudioDoRecord()
  {
    ViewAsserts.assertOnScreen(actionRecordAudio.getWindow().getDecorView(), getViewActionRecordAudioDoRecord());
  }

  private ImageButton imageButtonActionRecordAudioDoPlay;

  protected ImageButton getViewActionRecordAudioDoPlay()
  {
    assertNotNull("actionRecordAudio not set - did you remember to call setActivityActionRecordAudio(final ActionRecordAudioActivity actionRecordAudio) ?", actionRecordAudio);
    if (imageButtonActionRecordAudioDoPlay == null)
    {
      imageButtonActionRecordAudioDoPlay = (ImageButton) actionRecordAudio.findViewById(R.id.imageButtonActionRecordAudioDoPlay);
      assertNotNull("R.id.imageButtonActionRecordAudioDoPlay could not be found via actionRecordAudio", imageButtonActionRecordAudioDoPlay);
    }
    setLastActivity(actionRecordAudio);
    return imageButtonActionRecordAudioDoPlay;
  }

  protected void clickActionRecordAudioDoPlay()
  {
    takeComment("Before click on ActionRecordAudioDoPlay");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordAudioDoPlay");
    TouchUtils.clickView(this, getViewActionRecordAudioDoPlay());
  }

  protected void verifyOnScreenActionRecordAudioDoPlay()
  {
    ViewAsserts.assertOnScreen(actionRecordAudio.getWindow().getDecorView(), getViewActionRecordAudioDoPlay());
  }

  private ImageButton imageButtonActionRecordAudioDoRegret;

  protected ImageButton getViewActionRecordAudioDoRegret()
  {
    assertNotNull("actionRecordAudio not set - did you remember to call setActivityActionRecordAudio(final ActionRecordAudioActivity actionRecordAudio) ?", actionRecordAudio);
    if (imageButtonActionRecordAudioDoRegret == null)
    {
      imageButtonActionRecordAudioDoRegret = (ImageButton) actionRecordAudio.findViewById(R.id.imageButtonActionRecordAudioDoRegret);
      assertNotNull("R.id.imageButtonActionRecordAudioDoRegret could not be found via actionRecordAudio", imageButtonActionRecordAudioDoRegret);
    }
    setLastActivity(actionRecordAudio);
    return imageButtonActionRecordAudioDoRegret;
  }

  protected void clickActionRecordAudioDoRegret()
  {
    takeComment("Before click on ActionRecordAudioDoRegret");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordAudioDoRegret");
    TouchUtils.clickView(this, getViewActionRecordAudioDoRegret());
  }

  protected void verifyOnScreenActionRecordAudioDoRegret()
  {
    ViewAsserts.assertOnScreen(actionRecordAudio.getWindow().getDecorView(), getViewActionRecordAudioDoRegret());
  }

  private ImageButton imageButtonActionRecordAudioDoSave;

  protected ImageButton getViewActionRecordAudioDoSave()
  {
    assertNotNull("actionRecordAudio not set - did you remember to call setActivityActionRecordAudio(final ActionRecordAudioActivity actionRecordAudio) ?", actionRecordAudio);
    if (imageButtonActionRecordAudioDoSave == null)
    {
      imageButtonActionRecordAudioDoSave = (ImageButton) actionRecordAudio.findViewById(R.id.imageButtonActionRecordAudioDoSave);
      assertNotNull("R.id.imageButtonActionRecordAudioDoSave could not be found via actionRecordAudio", imageButtonActionRecordAudioDoSave);
    }
    setLastActivity(actionRecordAudio);
    return imageButtonActionRecordAudioDoSave;
  }

  protected void clickActionRecordAudioDoSave()
  {
    takeComment("Before click on ActionRecordAudioDoSave");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordAudioDoSave");
    TouchUtils.clickView(this, getViewActionRecordAudioDoSave());
  }

  protected void verifyOnScreenActionRecordAudioDoSave()
  {
    ViewAsserts.assertOnScreen(actionRecordAudio.getWindow().getDecorView(), getViewActionRecordAudioDoSave());
  }

  private ActionRecordImageActivity actionRecordImage;
  protected ActionRecordImageActivity getActivityActionRecordImage() { return actionRecordImage; }

  private ActivityMonitor monitorActionRecordImage;
  protected ActivityMonitor getMonitorActionRecordImage() { return monitorActionRecordImage; }

  protected void waitForActivityActionRecordImageWithTimeout(final int secs)
  {
    takeComment("Wait for ActionRecordImageActivity");
    actionRecordImage = (ActionRecordImageActivity) monitorActionRecordImage.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionRecordImageWithTimeout gave null after "+secs+" seconds", actionRecordImage);
    nullAllFieldsActionRecordImage();
    setLastActivity(actionRecordImage);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionRecordImageActivity");
    }
  }

  protected void prepareToWaitForActivityActionRecordImage()
  {
    if (monitorActionRecordImage == null) monitorActionRecordImage = getInstrumentation().addMonitor(ActionRecordImageActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionRecordImage()
  {
    takeComment("Verifying all fields in ActionRecordImageActivity");
    getViewActionRecordImageCaption();
    getViewActionRecordImageImage();
    getViewActionRecordImageDoSelect();
    getViewActionRecordImageDoRecord();
    getViewActionRecordImageDoRegret();
    getViewActionRecordImageDoSave();
  }

  protected void nullAllFieldsActionRecordImage()
  {
    textViewActionRecordImageCaption = null;
    imageViewActionRecordImageImage = null;
    imageButtonActionRecordImageDoSelect = null;
    imageButtonActionRecordImageDoRecord = null;
    imageButtonActionRecordImageDoRegret = null;
    imageButtonActionRecordImageDoSave = null;
  }

  private TextView textViewActionRecordImageCaption;

  protected TextView getViewActionRecordImageCaption()
  {
    assertNotNull("actionRecordImage not set - did you remember to call setActivityActionRecordImage(final ActionRecordImageActivity actionRecordImage) ?", actionRecordImage);
    if (textViewActionRecordImageCaption == null)
    {
      textViewActionRecordImageCaption = (TextView) actionRecordImage.findViewById(R.id.textViewActionRecordImageCaption);
      assertNotNull("R.id.textViewActionRecordImageCaption could not be found via actionRecordImage", textViewActionRecordImageCaption);
    }
    setLastActivity(actionRecordImage);
    return textViewActionRecordImageCaption;
  }

  protected void clickActionRecordImageCaption()
  {
    takeComment("Before click on ActionRecordImageCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordImageCaption");
    TouchUtils.clickView(this, getViewActionRecordImageCaption());
  }

  protected void verifyTextActionRecordImageCaption(final int id)
  {
    assertEquals("Incorrect ActionRecordImageCaption.getText()", actionRecordImage.getString(id), getViewActionRecordImageCaption().getText().toString());
  }

  protected void verifyTextActionRecordImageCaption(final String text)
  {
    assertEquals("Incorrect ActionRecordImageCaption.getText()", text, getViewActionRecordImageCaption().getText().toString());
  }

  protected void setTextActionRecordImageCaption(final String text)
  {
    takeComment("Setting ActionRecordImageCaption to '"+text+"'");
    final TextView view = getViewActionRecordImageCaption();
    actionRecordImage.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionRecordImageCaption()
  {
    return getViewActionRecordImageCaption().getText().toString();
  }

  protected void verifyOnScreenActionRecordImageCaption()
  {
    ViewAsserts.assertOnScreen(actionRecordImage.getWindow().getDecorView(), getViewActionRecordImageCaption());
  }

  private ImageView imageViewActionRecordImageImage;

  protected ImageView getViewActionRecordImageImage()
  {
    assertNotNull("actionRecordImage not set - did you remember to call setActivityActionRecordImage(final ActionRecordImageActivity actionRecordImage) ?", actionRecordImage);
    if (imageViewActionRecordImageImage == null)
    {
      imageViewActionRecordImageImage = (ImageView) actionRecordImage.findViewById(R.id.imageViewActionRecordImageImage);
      assertNotNull("R.id.imageViewActionRecordImageImage could not be found via actionRecordImage", imageViewActionRecordImageImage);
    }
    setLastActivity(actionRecordImage);
    return imageViewActionRecordImageImage;
  }

  protected void clickActionRecordImageImage()
  {
    takeComment("Before click on ActionRecordImageImage");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordImageImage");
    TouchUtils.clickView(this, getViewActionRecordImageImage());
  }

  protected void verifyOnScreenActionRecordImageImage()
  {
    ViewAsserts.assertOnScreen(actionRecordImage.getWindow().getDecorView(), getViewActionRecordImageImage());
  }

  private ImageButton imageButtonActionRecordImageDoSelect;

  protected ImageButton getViewActionRecordImageDoSelect()
  {
    assertNotNull("actionRecordImage not set - did you remember to call setActivityActionRecordImage(final ActionRecordImageActivity actionRecordImage) ?", actionRecordImage);
    if (imageButtonActionRecordImageDoSelect == null)
    {
      imageButtonActionRecordImageDoSelect = (ImageButton) actionRecordImage.findViewById(R.id.imageButtonActionRecordImageDoSelect);
      assertNotNull("R.id.imageButtonActionRecordImageDoSelect could not be found via actionRecordImage", imageButtonActionRecordImageDoSelect);
    }
    setLastActivity(actionRecordImage);
    return imageButtonActionRecordImageDoSelect;
  }

  protected void clickActionRecordImageDoSelect()
  {
    takeComment("Before click on ActionRecordImageDoSelect");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordImageDoSelect");
    TouchUtils.clickView(this, getViewActionRecordImageDoSelect());
  }

  protected void verifyOnScreenActionRecordImageDoSelect()
  {
    ViewAsserts.assertOnScreen(actionRecordImage.getWindow().getDecorView(), getViewActionRecordImageDoSelect());
  }

  private ImageButton imageButtonActionRecordImageDoRecord;

  protected ImageButton getViewActionRecordImageDoRecord()
  {
    assertNotNull("actionRecordImage not set - did you remember to call setActivityActionRecordImage(final ActionRecordImageActivity actionRecordImage) ?", actionRecordImage);
    if (imageButtonActionRecordImageDoRecord == null)
    {
      imageButtonActionRecordImageDoRecord = (ImageButton) actionRecordImage.findViewById(R.id.imageButtonActionRecordImageDoRecord);
      assertNotNull("R.id.imageButtonActionRecordImageDoRecord could not be found via actionRecordImage", imageButtonActionRecordImageDoRecord);
    }
    setLastActivity(actionRecordImage);
    return imageButtonActionRecordImageDoRecord;
  }

  protected void clickActionRecordImageDoRecord()
  {
    takeComment("Before click on ActionRecordImageDoRecord");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordImageDoRecord");
    TouchUtils.clickView(this, getViewActionRecordImageDoRecord());
  }

  protected void verifyOnScreenActionRecordImageDoRecord()
  {
    ViewAsserts.assertOnScreen(actionRecordImage.getWindow().getDecorView(), getViewActionRecordImageDoRecord());
  }

  private ImageButton imageButtonActionRecordImageDoRegret;

  protected ImageButton getViewActionRecordImageDoRegret()
  {
    assertNotNull("actionRecordImage not set - did you remember to call setActivityActionRecordImage(final ActionRecordImageActivity actionRecordImage) ?", actionRecordImage);
    if (imageButtonActionRecordImageDoRegret == null)
    {
      imageButtonActionRecordImageDoRegret = (ImageButton) actionRecordImage.findViewById(R.id.imageButtonActionRecordImageDoRegret);
      assertNotNull("R.id.imageButtonActionRecordImageDoRegret could not be found via actionRecordImage", imageButtonActionRecordImageDoRegret);
    }
    setLastActivity(actionRecordImage);
    return imageButtonActionRecordImageDoRegret;
  }

  protected void clickActionRecordImageDoRegret()
  {
    takeComment("Before click on ActionRecordImageDoRegret");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordImageDoRegret");
    TouchUtils.clickView(this, getViewActionRecordImageDoRegret());
  }

  protected void verifyOnScreenActionRecordImageDoRegret()
  {
    ViewAsserts.assertOnScreen(actionRecordImage.getWindow().getDecorView(), getViewActionRecordImageDoRegret());
  }

  private ImageButton imageButtonActionRecordImageDoSave;

  protected ImageButton getViewActionRecordImageDoSave()
  {
    assertNotNull("actionRecordImage not set - did you remember to call setActivityActionRecordImage(final ActionRecordImageActivity actionRecordImage) ?", actionRecordImage);
    if (imageButtonActionRecordImageDoSave == null)
    {
      imageButtonActionRecordImageDoSave = (ImageButton) actionRecordImage.findViewById(R.id.imageButtonActionRecordImageDoSave);
      assertNotNull("R.id.imageButtonActionRecordImageDoSave could not be found via actionRecordImage", imageButtonActionRecordImageDoSave);
    }
    setLastActivity(actionRecordImage);
    return imageButtonActionRecordImageDoSave;
  }

  protected void clickActionRecordImageDoSave()
  {
    takeComment("Before click on ActionRecordImageDoSave");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordImageDoSave");
    TouchUtils.clickView(this, getViewActionRecordImageDoSave());
  }

  protected void verifyOnScreenActionRecordImageDoSave()
  {
    ViewAsserts.assertOnScreen(actionRecordImage.getWindow().getDecorView(), getViewActionRecordImageDoSave());
  }

  private ActionRecordTextActivity actionRecordText;
  protected ActionRecordTextActivity getActivityActionRecordText() { return actionRecordText; }

  private ActivityMonitor monitorActionRecordText;
  protected ActivityMonitor getMonitorActionRecordText() { return monitorActionRecordText; }

  protected void waitForActivityActionRecordTextWithTimeout(final int secs)
  {
    takeComment("Wait for ActionRecordTextActivity");
    actionRecordText = (ActionRecordTextActivity) monitorActionRecordText.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionRecordTextWithTimeout gave null after "+secs+" seconds", actionRecordText);
    nullAllFieldsActionRecordText();
    setLastActivity(actionRecordText);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionRecordTextActivity");
    }
  }

  protected void prepareToWaitForActivityActionRecordText()
  {
    if (monitorActionRecordText == null) monitorActionRecordText = getInstrumentation().addMonitor(ActionRecordTextActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionRecordText()
  {
    takeComment("Verifying all fields in ActionRecordTextActivity");
    getViewActionRecordTextCaption();
    getViewActionRecordTextText();
    getViewActionRecordTextDoRegret();
    getViewActionRecordTextDoSave();
  }

  protected void nullAllFieldsActionRecordText()
  {
    textViewActionRecordTextCaption = null;
    editTextActionRecordTextText = null;
    imageButtonActionRecordTextDoRegret = null;
    imageButtonActionRecordTextDoSave = null;
  }

  private TextView textViewActionRecordTextCaption;

  protected TextView getViewActionRecordTextCaption()
  {
    assertNotNull("actionRecordText not set - did you remember to call setActivityActionRecordText(final ActionRecordTextActivity actionRecordText) ?", actionRecordText);
    if (textViewActionRecordTextCaption == null)
    {
      textViewActionRecordTextCaption = (TextView) actionRecordText.findViewById(R.id.textViewActionRecordTextCaption);
      assertNotNull("R.id.textViewActionRecordTextCaption could not be found via actionRecordText", textViewActionRecordTextCaption);
    }
    setLastActivity(actionRecordText);
    return textViewActionRecordTextCaption;
  }

  protected void clickActionRecordTextCaption()
  {
    takeComment("Before click on ActionRecordTextCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordTextCaption");
    TouchUtils.clickView(this, getViewActionRecordTextCaption());
  }

  protected void verifyTextActionRecordTextCaption(final int id)
  {
    assertEquals("Incorrect ActionRecordTextCaption.getText()", actionRecordText.getString(id), getViewActionRecordTextCaption().getText().toString());
  }

  protected void verifyTextActionRecordTextCaption(final String text)
  {
    assertEquals("Incorrect ActionRecordTextCaption.getText()", text, getViewActionRecordTextCaption().getText().toString());
  }

  protected void setTextActionRecordTextCaption(final String text)
  {
    takeComment("Setting ActionRecordTextCaption to '"+text+"'");
    final TextView view = getViewActionRecordTextCaption();
    actionRecordText.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionRecordTextCaption()
  {
    return getViewActionRecordTextCaption().getText().toString();
  }

  protected void verifyOnScreenActionRecordTextCaption()
  {
    ViewAsserts.assertOnScreen(actionRecordText.getWindow().getDecorView(), getViewActionRecordTextCaption());
  }

  private EditText editTextActionRecordTextText;

  protected EditText getViewActionRecordTextText()
  {
    assertNotNull("actionRecordText not set - did you remember to call setActivityActionRecordText(final ActionRecordTextActivity actionRecordText) ?", actionRecordText);
    if (editTextActionRecordTextText == null)
    {
      editTextActionRecordTextText = (EditText) actionRecordText.findViewById(R.id.editTextActionRecordTextText);
      assertNotNull("R.id.editTextActionRecordTextText could not be found via actionRecordText", editTextActionRecordTextText);
    }
    setLastActivity(actionRecordText);
    return editTextActionRecordTextText;
  }

  protected void verifyTextActionRecordTextText(final int id)
  {
    assertEquals("Incorrect ActionRecordTextText.getText()", actionRecordText.getString(id), getViewActionRecordTextText().getText().toString());
  }

  protected void verifyTextActionRecordTextText(final String text)
  {
    assertEquals("Incorrect ActionRecordTextText.getText()", text, getViewActionRecordTextText().getText().toString());
  }

  protected void setTextActionRecordTextText(final String text)
  {
    takeComment("Setting ActionRecordTextText to '"+text+"'");
    final EditText view = getViewActionRecordTextText();
    actionRecordText.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionRecordTextText()
  {
    return getViewActionRecordTextText().getText().toString();
  }

  protected void verifyOnScreenActionRecordTextText()
  {
    ViewAsserts.assertOnScreen(actionRecordText.getWindow().getDecorView(), getViewActionRecordTextText());
  }

  private ImageButton imageButtonActionRecordTextDoRegret;

  protected ImageButton getViewActionRecordTextDoRegret()
  {
    assertNotNull("actionRecordText not set - did you remember to call setActivityActionRecordText(final ActionRecordTextActivity actionRecordText) ?", actionRecordText);
    if (imageButtonActionRecordTextDoRegret == null)
    {
      imageButtonActionRecordTextDoRegret = (ImageButton) actionRecordText.findViewById(R.id.imageButtonActionRecordTextDoRegret);
      assertNotNull("R.id.imageButtonActionRecordTextDoRegret could not be found via actionRecordText", imageButtonActionRecordTextDoRegret);
    }
    setLastActivity(actionRecordText);
    return imageButtonActionRecordTextDoRegret;
  }

  protected void clickActionRecordTextDoRegret()
  {
    takeComment("Before click on ActionRecordTextDoRegret");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordTextDoRegret");
    TouchUtils.clickView(this, getViewActionRecordTextDoRegret());
  }

  protected void verifyOnScreenActionRecordTextDoRegret()
  {
    ViewAsserts.assertOnScreen(actionRecordText.getWindow().getDecorView(), getViewActionRecordTextDoRegret());
  }

  private ImageButton imageButtonActionRecordTextDoSave;

  protected ImageButton getViewActionRecordTextDoSave()
  {
    assertNotNull("actionRecordText not set - did you remember to call setActivityActionRecordText(final ActionRecordTextActivity actionRecordText) ?", actionRecordText);
    if (imageButtonActionRecordTextDoSave == null)
    {
      imageButtonActionRecordTextDoSave = (ImageButton) actionRecordText.findViewById(R.id.imageButtonActionRecordTextDoSave);
      assertNotNull("R.id.imageButtonActionRecordTextDoSave could not be found via actionRecordText", imageButtonActionRecordTextDoSave);
    }
    setLastActivity(actionRecordText);
    return imageButtonActionRecordTextDoSave;
  }

  protected void clickActionRecordTextDoSave()
  {
    takeComment("Before click on ActionRecordTextDoSave");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordTextDoSave");
    TouchUtils.clickView(this, getViewActionRecordTextDoSave());
  }

  protected void verifyOnScreenActionRecordTextDoSave()
  {
    ViewAsserts.assertOnScreen(actionRecordText.getWindow().getDecorView(), getViewActionRecordTextDoSave());
  }

  private ActionRecordVideoActivity actionRecordVideo;
  protected ActionRecordVideoActivity getActivityActionRecordVideo() { return actionRecordVideo; }

  private ActivityMonitor monitorActionRecordVideo;
  protected ActivityMonitor getMonitorActionRecordVideo() { return monitorActionRecordVideo; }

  protected void waitForActivityActionRecordVideoWithTimeout(final int secs)
  {
    takeComment("Wait for ActionRecordVideoActivity");
    actionRecordVideo = (ActionRecordVideoActivity) monitorActionRecordVideo.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionRecordVideoWithTimeout gave null after "+secs+" seconds", actionRecordVideo);
    nullAllFieldsActionRecordVideo();
    setLastActivity(actionRecordVideo);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionRecordVideoActivity");
    }
  }

  protected void prepareToWaitForActivityActionRecordVideo()
  {
    if (monitorActionRecordVideo == null) monitorActionRecordVideo = getInstrumentation().addMonitor(ActionRecordVideoActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionRecordVideo()
  {
    takeComment("Verifying all fields in ActionRecordVideoActivity");
    getViewActionRecordVideoCaption();
    getViewActionRecordVideoVideo();
    getViewActionRecordVideoDoSelect();
    getViewActionRecordVideoDoRecord();
    getViewActionRecordVideoDoPlay();
    getViewActionRecordVideoDoRegret();
    getViewActionRecordVideoDoSave();
  }

  protected void nullAllFieldsActionRecordVideo()
  {
    textViewActionRecordVideoCaption = null;
    videoViewActionRecordVideoVideo = null;
    imageButtonActionRecordVideoDoSelect = null;
    imageButtonActionRecordVideoDoRecord = null;
    imageButtonActionRecordVideoDoPlay = null;
    imageButtonActionRecordVideoDoRegret = null;
    imageButtonActionRecordVideoDoSave = null;
  }

  private TextView textViewActionRecordVideoCaption;

  protected TextView getViewActionRecordVideoCaption()
  {
    assertNotNull("actionRecordVideo not set - did you remember to call setActivityActionRecordVideo(final ActionRecordVideoActivity actionRecordVideo) ?", actionRecordVideo);
    if (textViewActionRecordVideoCaption == null)
    {
      textViewActionRecordVideoCaption = (TextView) actionRecordVideo.findViewById(R.id.textViewActionRecordVideoCaption);
      assertNotNull("R.id.textViewActionRecordVideoCaption could not be found via actionRecordVideo", textViewActionRecordVideoCaption);
    }
    setLastActivity(actionRecordVideo);
    return textViewActionRecordVideoCaption;
  }

  protected void clickActionRecordVideoCaption()
  {
    takeComment("Before click on ActionRecordVideoCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordVideoCaption");
    TouchUtils.clickView(this, getViewActionRecordVideoCaption());
  }

  protected void verifyTextActionRecordVideoCaption(final int id)
  {
    assertEquals("Incorrect ActionRecordVideoCaption.getText()", actionRecordVideo.getString(id), getViewActionRecordVideoCaption().getText().toString());
  }

  protected void verifyTextActionRecordVideoCaption(final String text)
  {
    assertEquals("Incorrect ActionRecordVideoCaption.getText()", text, getViewActionRecordVideoCaption().getText().toString());
  }

  protected void setTextActionRecordVideoCaption(final String text)
  {
    takeComment("Setting ActionRecordVideoCaption to '"+text+"'");
    final TextView view = getViewActionRecordVideoCaption();
    actionRecordVideo.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionRecordVideoCaption()
  {
    return getViewActionRecordVideoCaption().getText().toString();
  }

  protected void verifyOnScreenActionRecordVideoCaption()
  {
    ViewAsserts.assertOnScreen(actionRecordVideo.getWindow().getDecorView(), getViewActionRecordVideoCaption());
  }

  private VideoView videoViewActionRecordVideoVideo;

  protected VideoView getViewActionRecordVideoVideo()
  {
    assertNotNull("actionRecordVideo not set - did you remember to call setActivityActionRecordVideo(final ActionRecordVideoActivity actionRecordVideo) ?", actionRecordVideo);
    if (videoViewActionRecordVideoVideo == null)
    {
      videoViewActionRecordVideoVideo = (VideoView) actionRecordVideo.findViewById(R.id.videoViewActionRecordVideoVideo);
      assertNotNull("R.id.videoViewActionRecordVideoVideo could not be found via actionRecordVideo", videoViewActionRecordVideoVideo);
    }
    setLastActivity(actionRecordVideo);
    return videoViewActionRecordVideoVideo;
  }

  protected void clickActionRecordVideoVideo()
  {
    takeComment("Before click on ActionRecordVideoVideo");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordVideoVideo");
    TouchUtils.clickView(this, getViewActionRecordVideoVideo());
  }

  protected void verifyOnScreenActionRecordVideoVideo()
  {
    ViewAsserts.assertOnScreen(actionRecordVideo.getWindow().getDecorView(), getViewActionRecordVideoVideo());
  }

  private ImageButton imageButtonActionRecordVideoDoSelect;

  protected ImageButton getViewActionRecordVideoDoSelect()
  {
    assertNotNull("actionRecordVideo not set - did you remember to call setActivityActionRecordVideo(final ActionRecordVideoActivity actionRecordVideo) ?", actionRecordVideo);
    if (imageButtonActionRecordVideoDoSelect == null)
    {
      imageButtonActionRecordVideoDoSelect = (ImageButton) actionRecordVideo.findViewById(R.id.imageButtonActionRecordVideoDoSelect);
      assertNotNull("R.id.imageButtonActionRecordVideoDoSelect could not be found via actionRecordVideo", imageButtonActionRecordVideoDoSelect);
    }
    setLastActivity(actionRecordVideo);
    return imageButtonActionRecordVideoDoSelect;
  }

  protected void clickActionRecordVideoDoSelect()
  {
    takeComment("Before click on ActionRecordVideoDoSelect");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordVideoDoSelect");
    TouchUtils.clickView(this, getViewActionRecordVideoDoSelect());
  }

  protected void verifyOnScreenActionRecordVideoDoSelect()
  {
    ViewAsserts.assertOnScreen(actionRecordVideo.getWindow().getDecorView(), getViewActionRecordVideoDoSelect());
  }

  private ImageButton imageButtonActionRecordVideoDoRecord;

  protected ImageButton getViewActionRecordVideoDoRecord()
  {
    assertNotNull("actionRecordVideo not set - did you remember to call setActivityActionRecordVideo(final ActionRecordVideoActivity actionRecordVideo) ?", actionRecordVideo);
    if (imageButtonActionRecordVideoDoRecord == null)
    {
      imageButtonActionRecordVideoDoRecord = (ImageButton) actionRecordVideo.findViewById(R.id.imageButtonActionRecordVideoDoRecord);
      assertNotNull("R.id.imageButtonActionRecordVideoDoRecord could not be found via actionRecordVideo", imageButtonActionRecordVideoDoRecord);
    }
    setLastActivity(actionRecordVideo);
    return imageButtonActionRecordVideoDoRecord;
  }

  protected void clickActionRecordVideoDoRecord()
  {
    takeComment("Before click on ActionRecordVideoDoRecord");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordVideoDoRecord");
    TouchUtils.clickView(this, getViewActionRecordVideoDoRecord());
  }

  protected void verifyOnScreenActionRecordVideoDoRecord()
  {
    ViewAsserts.assertOnScreen(actionRecordVideo.getWindow().getDecorView(), getViewActionRecordVideoDoRecord());
  }

  private ImageButton imageButtonActionRecordVideoDoPlay;

  protected ImageButton getViewActionRecordVideoDoPlay()
  {
    assertNotNull("actionRecordVideo not set - did you remember to call setActivityActionRecordVideo(final ActionRecordVideoActivity actionRecordVideo) ?", actionRecordVideo);
    if (imageButtonActionRecordVideoDoPlay == null)
    {
      imageButtonActionRecordVideoDoPlay = (ImageButton) actionRecordVideo.findViewById(R.id.imageButtonActionRecordVideoDoPlay);
      assertNotNull("R.id.imageButtonActionRecordVideoDoPlay could not be found via actionRecordVideo", imageButtonActionRecordVideoDoPlay);
    }
    setLastActivity(actionRecordVideo);
    return imageButtonActionRecordVideoDoPlay;
  }

  protected void clickActionRecordVideoDoPlay()
  {
    takeComment("Before click on ActionRecordVideoDoPlay");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordVideoDoPlay");
    TouchUtils.clickView(this, getViewActionRecordVideoDoPlay());
  }

  protected void verifyOnScreenActionRecordVideoDoPlay()
  {
    ViewAsserts.assertOnScreen(actionRecordVideo.getWindow().getDecorView(), getViewActionRecordVideoDoPlay());
  }

  private ImageButton imageButtonActionRecordVideoDoRegret;

  protected ImageButton getViewActionRecordVideoDoRegret()
  {
    assertNotNull("actionRecordVideo not set - did you remember to call setActivityActionRecordVideo(final ActionRecordVideoActivity actionRecordVideo) ?", actionRecordVideo);
    if (imageButtonActionRecordVideoDoRegret == null)
    {
      imageButtonActionRecordVideoDoRegret = (ImageButton) actionRecordVideo.findViewById(R.id.imageButtonActionRecordVideoDoRegret);
      assertNotNull("R.id.imageButtonActionRecordVideoDoRegret could not be found via actionRecordVideo", imageButtonActionRecordVideoDoRegret);
    }
    setLastActivity(actionRecordVideo);
    return imageButtonActionRecordVideoDoRegret;
  }

  protected void clickActionRecordVideoDoRegret()
  {
    takeComment("Before click on ActionRecordVideoDoRegret");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordVideoDoRegret");
    TouchUtils.clickView(this, getViewActionRecordVideoDoRegret());
  }

  protected void verifyOnScreenActionRecordVideoDoRegret()
  {
    ViewAsserts.assertOnScreen(actionRecordVideo.getWindow().getDecorView(), getViewActionRecordVideoDoRegret());
  }

  private ImageButton imageButtonActionRecordVideoDoSave;

  protected ImageButton getViewActionRecordVideoDoSave()
  {
    assertNotNull("actionRecordVideo not set - did you remember to call setActivityActionRecordVideo(final ActionRecordVideoActivity actionRecordVideo) ?", actionRecordVideo);
    if (imageButtonActionRecordVideoDoSave == null)
    {
      imageButtonActionRecordVideoDoSave = (ImageButton) actionRecordVideo.findViewById(R.id.imageButtonActionRecordVideoDoSave);
      assertNotNull("R.id.imageButtonActionRecordVideoDoSave could not be found via actionRecordVideo", imageButtonActionRecordVideoDoSave);
    }
    setLastActivity(actionRecordVideo);
    return imageButtonActionRecordVideoDoSave;
  }

  protected void clickActionRecordVideoDoSave()
  {
    takeComment("Before click on ActionRecordVideoDoSave");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionRecordVideoDoSave");
    TouchUtils.clickView(this, getViewActionRecordVideoDoSave());
  }

  protected void verifyOnScreenActionRecordVideoDoSave()
  {
    ViewAsserts.assertOnScreen(actionRecordVideo.getWindow().getDecorView(), getViewActionRecordVideoDoSave());
  }

  private ActionSendReportActivity actionSendReport;
  protected ActionSendReportActivity getActivityActionSendReport() { return actionSendReport; }

  private ActivityMonitor monitorActionSendReport;
  protected ActivityMonitor getMonitorActionSendReport() { return monitorActionSendReport; }

  protected void waitForActivityActionSendReportWithTimeout(final int secs)
  {
    takeComment("Wait for ActionSendReportActivity");
    actionSendReport = (ActionSendReportActivity) monitorActionSendReport.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionSendReportWithTimeout gave null after "+secs+" seconds", actionSendReport);
    nullAllFieldsActionSendReport();
    setLastActivity(actionSendReport);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionSendReportActivity");
    }
  }

  protected void prepareToWaitForActivityActionSendReport()
  {
    if (monitorActionSendReport == null) monitorActionSendReport = getInstrumentation().addMonitor(ActionSendReportActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionSendReport()
  {
    takeComment("Verifying all fields in ActionSendReportActivity");
    getViewActionSendReportAnswers();
    getViewActionSendReportDoSend();
  }

  protected void nullAllFieldsActionSendReport()
  {
    linearLayoutActionSendReportAnswers = null;
    imageButtonActionSendReportDoSend = null;
  }

  private LinearLayout linearLayoutActionSendReportAnswers;

  protected LinearLayout getViewActionSendReportAnswers()
  {
    assertNotNull("actionSendReport not set - did you remember to call setActivityActionSendReport(final ActionSendReportActivity actionSendReport) ?", actionSendReport);
    if (linearLayoutActionSendReportAnswers == null)
    {
      linearLayoutActionSendReportAnswers = (LinearLayout) actionSendReport.findViewById(R.id.linearLayoutActionSendReportAnswers);
      assertNotNull("R.id.linearLayoutActionSendReportAnswers could not be found via actionSendReport", linearLayoutActionSendReportAnswers);
    }
    setLastActivity(actionSendReport);
    return linearLayoutActionSendReportAnswers;
  }

  protected void clickActionSendReportAnswers()
  {
    takeComment("Before click on ActionSendReportAnswers");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionSendReportAnswers");
    TouchUtils.clickView(this, getViewActionSendReportAnswers());
  }

  protected void verifyOnScreenActionSendReportAnswers()
  {
    ViewAsserts.assertOnScreen(actionSendReport.getWindow().getDecorView(), getViewActionSendReportAnswers());
  }

  private ImageButton imageButtonActionSendReportDoSend;

  protected ImageButton getViewActionSendReportDoSend()
  {
    assertNotNull("actionSendReport not set - did you remember to call setActivityActionSendReport(final ActionSendReportActivity actionSendReport) ?", actionSendReport);
    if (imageButtonActionSendReportDoSend == null)
    {
      imageButtonActionSendReportDoSend = (ImageButton) actionSendReport.findViewById(R.id.imageButtonActionSendReportDoSend);
      assertNotNull("R.id.imageButtonActionSendReportDoSend could not be found via actionSendReport", imageButtonActionSendReportDoSend);
    }
    setLastActivity(actionSendReport);
    return imageButtonActionSendReportDoSend;
  }

  protected void clickActionSendReportDoSend()
  {
    takeComment("Before click on ActionSendReportDoSend");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionSendReportDoSend");
    TouchUtils.clickView(this, getViewActionSendReportDoSend());
  }

  protected void verifyOnScreenActionSendReportDoSend()
  {
    ViewAsserts.assertOnScreen(actionSendReport.getWindow().getDecorView(), getViewActionSendReportDoSend());
  }

  private ActionShowAudioActivity actionShowAudio;
  protected ActionShowAudioActivity getActivityActionShowAudio() { return actionShowAudio; }

  private ActivityMonitor monitorActionShowAudio;
  protected ActivityMonitor getMonitorActionShowAudio() { return monitorActionShowAudio; }

  protected void waitForActivityActionShowAudioWithTimeout(final int secs)
  {
    takeComment("Wait for ActionShowAudioActivity");
    actionShowAudio = (ActionShowAudioActivity) monitorActionShowAudio.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionShowAudioWithTimeout gave null after "+secs+" seconds", actionShowAudio);
    nullAllFieldsActionShowAudio();
    setLastActivity(actionShowAudio);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionShowAudioActivity");
    }
  }

  protected void prepareToWaitForActivityActionShowAudio()
  {
    if (monitorActionShowAudio == null) monitorActionShowAudio = getInstrumentation().addMonitor(ActionShowAudioActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionShowAudio()
  {
    takeComment("Verifying all fields in ActionShowAudioActivity");
    getViewActionShowAudioDoPlay();
    getViewActionShowAudioCaption();
  }

  protected void nullAllFieldsActionShowAudio()
  {
    imageButtonActionShowAudioDoPlay = null;
    textViewActionShowAudioCaption = null;
  }

  private ImageButton imageButtonActionShowAudioDoPlay;

  protected ImageButton getViewActionShowAudioDoPlay()
  {
    assertNotNull("actionShowAudio not set - did you remember to call setActivityActionShowAudio(final ActionShowAudioActivity actionShowAudio) ?", actionShowAudio);
    if (imageButtonActionShowAudioDoPlay == null)
    {
      imageButtonActionShowAudioDoPlay = (ImageButton) actionShowAudio.findViewById(R.id.imageButtonActionShowAudioDoPlay);
      assertNotNull("R.id.imageButtonActionShowAudioDoPlay could not be found via actionShowAudio", imageButtonActionShowAudioDoPlay);
    }
    setLastActivity(actionShowAudio);
    return imageButtonActionShowAudioDoPlay;
  }

  protected void clickActionShowAudioDoPlay()
  {
    takeComment("Before click on ActionShowAudioDoPlay");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowAudioDoPlay");
    TouchUtils.clickView(this, getViewActionShowAudioDoPlay());
  }

  protected void verifyOnScreenActionShowAudioDoPlay()
  {
    ViewAsserts.assertOnScreen(actionShowAudio.getWindow().getDecorView(), getViewActionShowAudioDoPlay());
  }

  private TextView textViewActionShowAudioCaption;

  protected TextView getViewActionShowAudioCaption()
  {
    assertNotNull("actionShowAudio not set - did you remember to call setActivityActionShowAudio(final ActionShowAudioActivity actionShowAudio) ?", actionShowAudio);
    if (textViewActionShowAudioCaption == null)
    {
      textViewActionShowAudioCaption = (TextView) actionShowAudio.findViewById(R.id.textViewActionShowAudioCaption);
      assertNotNull("R.id.textViewActionShowAudioCaption could not be found via actionShowAudio", textViewActionShowAudioCaption);
    }
    setLastActivity(actionShowAudio);
    return textViewActionShowAudioCaption;
  }

  protected void clickActionShowAudioCaption()
  {
    takeComment("Before click on ActionShowAudioCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowAudioCaption");
    TouchUtils.clickView(this, getViewActionShowAudioCaption());
  }

  protected void verifyTextActionShowAudioCaption(final int id)
  {
    assertEquals("Incorrect ActionShowAudioCaption.getText()", actionShowAudio.getString(id), getViewActionShowAudioCaption().getText().toString());
  }

  protected void verifyTextActionShowAudioCaption(final String text)
  {
    assertEquals("Incorrect ActionShowAudioCaption.getText()", text, getViewActionShowAudioCaption().getText().toString());
  }

  protected void setTextActionShowAudioCaption(final String text)
  {
    takeComment("Setting ActionShowAudioCaption to '"+text+"'");
    final TextView view = getViewActionShowAudioCaption();
    actionShowAudio.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionShowAudioCaption()
  {
    return getViewActionShowAudioCaption().getText().toString();
  }

  protected void verifyOnScreenActionShowAudioCaption()
  {
    ViewAsserts.assertOnScreen(actionShowAudio.getWindow().getDecorView(), getViewActionShowAudioCaption());
  }

  private ActionShowImageActivity actionShowImage;
  protected ActionShowImageActivity getActivityActionShowImage() { return actionShowImage; }

  private ActivityMonitor monitorActionShowImage;
  protected ActivityMonitor getMonitorActionShowImage() { return monitorActionShowImage; }

  protected void waitForActivityActionShowImageWithTimeout(final int secs)
  {
    takeComment("Wait for ActionShowImageActivity");
    actionShowImage = (ActionShowImageActivity) monitorActionShowImage.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionShowImageWithTimeout gave null after "+secs+" seconds", actionShowImage);
    nullAllFieldsActionShowImage();
    setLastActivity(actionShowImage);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionShowImageActivity");
    }
  }

  protected void prepareToWaitForActivityActionShowImage()
  {
    if (monitorActionShowImage == null) monitorActionShowImage = getInstrumentation().addMonitor(ActionShowImageActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionShowImage()
  {
    takeComment("Verifying all fields in ActionShowImageActivity");
    getViewActionShowImageImage();
    getViewActionShowImageCaption();
  }

  protected void nullAllFieldsActionShowImage()
  {
    imageViewActionShowImageImage = null;
    textViewActionShowImageCaption = null;
  }

  private ImageView imageViewActionShowImageImage;

  protected ImageView getViewActionShowImageImage()
  {
    assertNotNull("actionShowImage not set - did you remember to call setActivityActionShowImage(final ActionShowImageActivity actionShowImage) ?", actionShowImage);
    if (imageViewActionShowImageImage == null)
    {
      imageViewActionShowImageImage = (ImageView) actionShowImage.findViewById(R.id.imageViewActionShowImageImage);
      assertNotNull("R.id.imageViewActionShowImageImage could not be found via actionShowImage", imageViewActionShowImageImage);
    }
    setLastActivity(actionShowImage);
    return imageViewActionShowImageImage;
  }

  protected void clickActionShowImageImage()
  {
    takeComment("Before click on ActionShowImageImage");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowImageImage");
    TouchUtils.clickView(this, getViewActionShowImageImage());
  }

  protected void verifyOnScreenActionShowImageImage()
  {
    ViewAsserts.assertOnScreen(actionShowImage.getWindow().getDecorView(), getViewActionShowImageImage());
  }

  private TextView textViewActionShowImageCaption;

  protected TextView getViewActionShowImageCaption()
  {
    assertNotNull("actionShowImage not set - did you remember to call setActivityActionShowImage(final ActionShowImageActivity actionShowImage) ?", actionShowImage);
    if (textViewActionShowImageCaption == null)
    {
      textViewActionShowImageCaption = (TextView) actionShowImage.findViewById(R.id.textViewActionShowImageCaption);
      assertNotNull("R.id.textViewActionShowImageCaption could not be found via actionShowImage", textViewActionShowImageCaption);
    }
    setLastActivity(actionShowImage);
    return textViewActionShowImageCaption;
  }

  protected void clickActionShowImageCaption()
  {
    takeComment("Before click on ActionShowImageCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowImageCaption");
    TouchUtils.clickView(this, getViewActionShowImageCaption());
  }

  protected void verifyTextActionShowImageCaption(final int id)
  {
    assertEquals("Incorrect ActionShowImageCaption.getText()", actionShowImage.getString(id), getViewActionShowImageCaption().getText().toString());
  }

  protected void verifyTextActionShowImageCaption(final String text)
  {
    assertEquals("Incorrect ActionShowImageCaption.getText()", text, getViewActionShowImageCaption().getText().toString());
  }

  protected void setTextActionShowImageCaption(final String text)
  {
    takeComment("Setting ActionShowImageCaption to '"+text+"'");
    final TextView view = getViewActionShowImageCaption();
    actionShowImage.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionShowImageCaption()
  {
    return getViewActionShowImageCaption().getText().toString();
  }

  protected void verifyOnScreenActionShowImageCaption()
  {
    ViewAsserts.assertOnScreen(actionShowImage.getWindow().getDecorView(), getViewActionShowImageCaption());
  }

  private ActionShowTextActivity actionShowText;
  protected ActionShowTextActivity getActivityActionShowText() { return actionShowText; }

  private ActivityMonitor monitorActionShowText;
  protected ActivityMonitor getMonitorActionShowText() { return monitorActionShowText; }

  protected void waitForActivityActionShowTextWithTimeout(final int secs)
  {
    takeComment("Wait for ActionShowTextActivity");
    actionShowText = (ActionShowTextActivity) monitorActionShowText.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionShowTextWithTimeout gave null after "+secs+" seconds", actionShowText);
    nullAllFieldsActionShowText();
    setLastActivity(actionShowText);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionShowTextActivity");
    }
  }

  protected void prepareToWaitForActivityActionShowText()
  {
    if (monitorActionShowText == null) monitorActionShowText = getInstrumentation().addMonitor(ActionShowTextActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionShowText()
  {
    takeComment("Verifying all fields in ActionShowTextActivity");
    getViewActionShowTextCaption();
    getViewActionShowTextText();
  }

  protected void nullAllFieldsActionShowText()
  {
    textViewActionShowTextCaption = null;
    textViewActionShowTextText = null;
  }

  private TextView textViewActionShowTextCaption;

  protected TextView getViewActionShowTextCaption()
  {
    assertNotNull("actionShowText not set - did you remember to call setActivityActionShowText(final ActionShowTextActivity actionShowText) ?", actionShowText);
    if (textViewActionShowTextCaption == null)
    {
      textViewActionShowTextCaption = (TextView) actionShowText.findViewById(R.id.textViewActionShowTextCaption);
      assertNotNull("R.id.textViewActionShowTextCaption could not be found via actionShowText", textViewActionShowTextCaption);
    }
    setLastActivity(actionShowText);
    return textViewActionShowTextCaption;
  }

  protected void clickActionShowTextCaption()
  {
    takeComment("Before click on ActionShowTextCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowTextCaption");
    TouchUtils.clickView(this, getViewActionShowTextCaption());
  }

  protected void verifyTextActionShowTextCaption(final int id)
  {
    assertEquals("Incorrect ActionShowTextCaption.getText()", actionShowText.getString(id), getViewActionShowTextCaption().getText().toString());
  }

  protected void verifyTextActionShowTextCaption(final String text)
  {
    assertEquals("Incorrect ActionShowTextCaption.getText()", text, getViewActionShowTextCaption().getText().toString());
  }

  protected void setTextActionShowTextCaption(final String text)
  {
    takeComment("Setting ActionShowTextCaption to '"+text+"'");
    final TextView view = getViewActionShowTextCaption();
    actionShowText.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionShowTextCaption()
  {
    return getViewActionShowTextCaption().getText().toString();
  }

  protected void verifyOnScreenActionShowTextCaption()
  {
    ViewAsserts.assertOnScreen(actionShowText.getWindow().getDecorView(), getViewActionShowTextCaption());
  }

  private TextView textViewActionShowTextText;

  protected TextView getViewActionShowTextText()
  {
    assertNotNull("actionShowText not set - did you remember to call setActivityActionShowText(final ActionShowTextActivity actionShowText) ?", actionShowText);
    if (textViewActionShowTextText == null)
    {
      textViewActionShowTextText = (TextView) actionShowText.findViewById(R.id.textViewActionShowTextText);
      assertNotNull("R.id.textViewActionShowTextText could not be found via actionShowText", textViewActionShowTextText);
    }
    setLastActivity(actionShowText);
    return textViewActionShowTextText;
  }

  protected void clickActionShowTextText()
  {
    takeComment("Before click on ActionShowTextText");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowTextText");
    TouchUtils.clickView(this, getViewActionShowTextText());
  }

  protected void verifyTextActionShowTextText(final int id)
  {
    assertEquals("Incorrect ActionShowTextText.getText()", actionShowText.getString(id), getViewActionShowTextText().getText().toString());
  }

  protected void verifyTextActionShowTextText(final String text)
  {
    assertEquals("Incorrect ActionShowTextText.getText()", text, getViewActionShowTextText().getText().toString());
  }

  protected void setTextActionShowTextText(final String text)
  {
    takeComment("Setting ActionShowTextText to '"+text+"'");
    final TextView view = getViewActionShowTextText();
    actionShowText.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionShowTextText()
  {
    return getViewActionShowTextText().getText().toString();
  }

  protected void verifyOnScreenActionShowTextText()
  {
    ViewAsserts.assertOnScreen(actionShowText.getWindow().getDecorView(), getViewActionShowTextText());
  }

  private ActionShowVideoActivity actionShowVideo;
  protected ActionShowVideoActivity getActivityActionShowVideo() { return actionShowVideo; }

  private ActivityMonitor monitorActionShowVideo;
  protected ActivityMonitor getMonitorActionShowVideo() { return monitorActionShowVideo; }

  protected void waitForActivityActionShowVideoWithTimeout(final int secs)
  {
    takeComment("Wait for ActionShowVideoActivity");
    actionShowVideo = (ActionShowVideoActivity) monitorActionShowVideo.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityActionShowVideoWithTimeout gave null after "+secs+" seconds", actionShowVideo);
    nullAllFieldsActionShowVideo();
    setLastActivity(actionShowVideo);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ActionShowVideoActivity");
    }
  }

  protected void prepareToWaitForActivityActionShowVideo()
  {
    if (monitorActionShowVideo == null) monitorActionShowVideo = getInstrumentation().addMonitor(ActionShowVideoActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsActionShowVideo()
  {
    takeComment("Verifying all fields in ActionShowVideoActivity");
    getViewActionShowVideoVideo();
    getViewActionShowVideoCaption();
  }

  protected void nullAllFieldsActionShowVideo()
  {
    videoViewActionShowVideoVideo = null;
    textViewActionShowVideoCaption = null;
  }

  private VideoView videoViewActionShowVideoVideo;

  protected VideoView getViewActionShowVideoVideo()
  {
    assertNotNull("actionShowVideo not set - did you remember to call setActivityActionShowVideo(final ActionShowVideoActivity actionShowVideo) ?", actionShowVideo);
    if (videoViewActionShowVideoVideo == null)
    {
      videoViewActionShowVideoVideo = (VideoView) actionShowVideo.findViewById(R.id.videoViewActionShowVideoVideo);
      assertNotNull("R.id.videoViewActionShowVideoVideo could not be found via actionShowVideo", videoViewActionShowVideoVideo);
    }
    setLastActivity(actionShowVideo);
    return videoViewActionShowVideoVideo;
  }

  protected void clickActionShowVideoVideo()
  {
    takeComment("Before click on ActionShowVideoVideo");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowVideoVideo");
    TouchUtils.clickView(this, getViewActionShowVideoVideo());
  }

  protected void verifyOnScreenActionShowVideoVideo()
  {
    ViewAsserts.assertOnScreen(actionShowVideo.getWindow().getDecorView(), getViewActionShowVideoVideo());
  }

  private TextView textViewActionShowVideoCaption;

  protected TextView getViewActionShowVideoCaption()
  {
    assertNotNull("actionShowVideo not set - did you remember to call setActivityActionShowVideo(final ActionShowVideoActivity actionShowVideo) ?", actionShowVideo);
    if (textViewActionShowVideoCaption == null)
    {
      textViewActionShowVideoCaption = (TextView) actionShowVideo.findViewById(R.id.textViewActionShowVideoCaption);
      assertNotNull("R.id.textViewActionShowVideoCaption could not be found via actionShowVideo", textViewActionShowVideoCaption);
    }
    setLastActivity(actionShowVideo);
    return textViewActionShowVideoCaption;
  }

  protected void clickActionShowVideoCaption()
  {
    takeComment("Before click on ActionShowVideoCaption");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickActionShowVideoCaption");
    TouchUtils.clickView(this, getViewActionShowVideoCaption());
  }

  protected void verifyTextActionShowVideoCaption(final int id)
  {
    assertEquals("Incorrect ActionShowVideoCaption.getText()", actionShowVideo.getString(id), getViewActionShowVideoCaption().getText().toString());
  }

  protected void verifyTextActionShowVideoCaption(final String text)
  {
    assertEquals("Incorrect ActionShowVideoCaption.getText()", text, getViewActionShowVideoCaption().getText().toString());
  }

  protected void setTextActionShowVideoCaption(final String text)
  {
    takeComment("Setting ActionShowVideoCaption to '"+text+"'");
    final TextView view = getViewActionShowVideoCaption();
    actionShowVideo.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextActionShowVideoCaption()
  {
    return getViewActionShowVideoCaption().getText().toString();
  }

  protected void verifyOnScreenActionShowVideoCaption()
  {
    ViewAsserts.assertOnScreen(actionShowVideo.getWindow().getDecorView(), getViewActionShowVideoCaption());
  }

  private TextView textViewAnswerDetailStepNumber;

  protected TextView getViewAnswerDetailStepNumber()
  {
    assertNotNull("actionSendReport not set - did you remember to call setActivityActionSendReport(final ActionSendReportActivity actionSendReport) ?", actionSendReport);
    if (textViewAnswerDetailStepNumber == null)
    {
      textViewAnswerDetailStepNumber = (TextView) actionSendReport.findViewById(R.id.textViewAnswerDetailStepNumber);
      assertNotNull("R.id.textViewAnswerDetailStepNumber could not be found via actionSendReport", textViewAnswerDetailStepNumber);
    }
    setLastActivity(actionSendReport);
    return textViewAnswerDetailStepNumber;
  }

  protected void clickAnswerDetailStepNumber()
  {
    takeComment("Before click on AnswerDetailStepNumber");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickAnswerDetailStepNumber");
    TouchUtils.clickView(this, getViewAnswerDetailStepNumber());
  }

  protected void verifyTextAnswerDetailStepNumber(final int id)
  {
    assertEquals("Incorrect AnswerDetailStepNumber.getText()", actionSendReport.getString(id), getViewAnswerDetailStepNumber().getText().toString());
  }

  protected void verifyTextAnswerDetailStepNumber(final String text)
  {
    assertEquals("Incorrect AnswerDetailStepNumber.getText()", text, getViewAnswerDetailStepNumber().getText().toString());
  }

  protected void setTextAnswerDetailStepNumber(final String text)
  {
    takeComment("Setting AnswerDetailStepNumber to '"+text+"'");
    final TextView view = getViewAnswerDetailStepNumber();
    actionSendReport.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextAnswerDetailStepNumber()
  {
    return getViewAnswerDetailStepNumber().getText().toString();
  }

  protected void verifyOnScreenAnswerDetailStepNumber()
  {
    ViewAsserts.assertOnScreen(actionSendReport.getWindow().getDecorView(), getViewAnswerDetailStepNumber());
  }

  private TextView textViewAnswerDetailStepTitle;

  protected TextView getViewAnswerDetailStepTitle()
  {
    assertNotNull("actionSendReport not set - did you remember to call setActivityActionSendReport(final ActionSendReportActivity actionSendReport) ?", actionSendReport);
    if (textViewAnswerDetailStepTitle == null)
    {
      textViewAnswerDetailStepTitle = (TextView) actionSendReport.findViewById(R.id.textViewAnswerDetailStepTitle);
      assertNotNull("R.id.textViewAnswerDetailStepTitle could not be found via actionSendReport", textViewAnswerDetailStepTitle);
    }
    setLastActivity(actionSendReport);
    return textViewAnswerDetailStepTitle;
  }

  protected void clickAnswerDetailStepTitle()
  {
    takeComment("Before click on AnswerDetailStepTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickAnswerDetailStepTitle");
    TouchUtils.clickView(this, getViewAnswerDetailStepTitle());
  }

  protected void verifyTextAnswerDetailStepTitle(final int id)
  {
    assertEquals("Incorrect AnswerDetailStepTitle.getText()", actionSendReport.getString(id), getViewAnswerDetailStepTitle().getText().toString());
  }

  protected void verifyTextAnswerDetailStepTitle(final String text)
  {
    assertEquals("Incorrect AnswerDetailStepTitle.getText()", text, getViewAnswerDetailStepTitle().getText().toString());
  }

  protected void setTextAnswerDetailStepTitle(final String text)
  {
    takeComment("Setting AnswerDetailStepTitle to '"+text+"'");
    final TextView view = getViewAnswerDetailStepTitle();
    actionSendReport.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextAnswerDetailStepTitle()
  {
    return getViewAnswerDetailStepTitle().getText().toString();
  }

  protected void verifyOnScreenAnswerDetailStepTitle()
  {
    ViewAsserts.assertOnScreen(actionSendReport.getWindow().getDecorView(), getViewAnswerDetailStepTitle());
  }

  private ImageButton imageButtonAnswerDetailDoStep;

  protected ImageButton getViewAnswerDetailDoStep()
  {
    assertNotNull("actionSendReport not set - did you remember to call setActivityActionSendReport(final ActionSendReportActivity actionSendReport) ?", actionSendReport);
    if (imageButtonAnswerDetailDoStep == null)
    {
      imageButtonAnswerDetailDoStep = (ImageButton) actionSendReport.findViewById(R.id.imageButtonAnswerDetailDoStep);
      assertNotNull("R.id.imageButtonAnswerDetailDoStep could not be found via actionSendReport", imageButtonAnswerDetailDoStep);
    }
    setLastActivity(actionSendReport);
    return imageButtonAnswerDetailDoStep;
  }

  protected void clickAnswerDetailDoStep()
  {
    takeComment("Before click on AnswerDetailDoStep");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickAnswerDetailDoStep");
    TouchUtils.clickView(this, getViewAnswerDetailDoStep());
  }

  protected void verifyOnScreenAnswerDetailDoStep()
  {
    ViewAsserts.assertOnScreen(actionSendReport.getWindow().getDecorView(), getViewAnswerDetailDoStep());
  }

  private ImageButton imageButtonAnswerDetailViewStep;

  protected ImageButton getViewAnswerDetailViewStep()
  {
    assertNotNull("actionSendReport not set - did you remember to call setActivityActionSendReport(final ActionSendReportActivity actionSendReport) ?", actionSendReport);
    if (imageButtonAnswerDetailViewStep == null)
    {
      imageButtonAnswerDetailViewStep = (ImageButton) actionSendReport.findViewById(R.id.imageButtonAnswerDetailViewStep);
      assertNotNull("R.id.imageButtonAnswerDetailViewStep could not be found via actionSendReport", imageButtonAnswerDetailViewStep);
    }
    setLastActivity(actionSendReport);
    return imageButtonAnswerDetailViewStep;
  }

  protected void clickAnswerDetailViewStep()
  {
    takeComment("Before click on AnswerDetailViewStep");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickAnswerDetailViewStep");
    TouchUtils.clickView(this, getViewAnswerDetailViewStep());
  }

  protected void verifyOnScreenAnswerDetailViewStep()
  {
    ViewAsserts.assertOnScreen(actionSendReport.getWindow().getDecorView(), getViewAnswerDetailViewStep());
  }

  private ImageButton imageButtonAnswerDetailDeleteStep;

  protected ImageButton getViewAnswerDetailDeleteStep()
  {
    assertNotNull("actionSendReport not set - did you remember to call setActivityActionSendReport(final ActionSendReportActivity actionSendReport) ?", actionSendReport);
    if (imageButtonAnswerDetailDeleteStep == null)
    {
      imageButtonAnswerDetailDeleteStep = (ImageButton) actionSendReport.findViewById(R.id.imageButtonAnswerDetailDeleteStep);
      assertNotNull("R.id.imageButtonAnswerDetailDeleteStep could not be found via actionSendReport", imageButtonAnswerDetailDeleteStep);
    }
    setLastActivity(actionSendReport);
    return imageButtonAnswerDetailDeleteStep;
  }

  protected void clickAnswerDetailDeleteStep()
  {
    takeComment("Before click on AnswerDetailDeleteStep");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickAnswerDetailDeleteStep");
    TouchUtils.clickView(this, getViewAnswerDetailDeleteStep());
  }

  protected void verifyOnScreenAnswerDetailDeleteStep()
  {
    ViewAsserts.assertOnScreen(actionSendReport.getWindow().getDecorView(), getViewAnswerDetailDeleteStep());
  }

  private ExerciseOverviewActivity exerciseOverview;
  protected ExerciseOverviewActivity getActivityExerciseOverview() { return exerciseOverview; }

  private ActivityMonitor monitorExerciseOverview;
  protected ActivityMonitor getMonitorExerciseOverview() { return monitorExerciseOverview; }

  protected void waitForActivityExerciseOverviewWithTimeout(final int secs)
  {
    takeComment("Wait for ExerciseOverviewActivity");
    exerciseOverview = (ExerciseOverviewActivity) monitorExerciseOverview.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityExerciseOverviewWithTimeout gave null after "+secs+" seconds", exerciseOverview);
    nullAllFieldsExerciseOverview();
    setLastActivity(exerciseOverview);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ExerciseOverviewActivity");
    }
  }

  protected void prepareToWaitForActivityExerciseOverview()
  {
    if (monitorExerciseOverview == null) monitorExerciseOverview = getInstrumentation().addMonitor(ExerciseOverviewActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsExerciseOverview()
  {
    takeComment("Verifying all fields in ExerciseOverviewActivity");
    getViewExerciseOverviewExerciseOverview();
    getViewExerciseOverviewExerciseTitle();
    getViewExerciseOverviewExerciseStep();
  }

  protected void nullAllFieldsExerciseOverview()
  {
    imageViewExerciseOverviewExerciseOverview = null;
    textViewExerciseOverviewExerciseTitle = null;
    textViewExerciseOverviewExerciseStep = null;
  }

  private ImageView imageViewExerciseOverviewExerciseOverview;

  protected ImageView getViewExerciseOverviewExerciseOverview()
  {
    assertNotNull("exerciseOverview not set - did you remember to call setActivityExerciseOverview(final ExerciseOverviewActivity exerciseOverview) ?", exerciseOverview);
    if (imageViewExerciseOverviewExerciseOverview == null)
    {
      imageViewExerciseOverviewExerciseOverview = (ImageView) exerciseOverview.findViewById(R.id.imageViewExerciseOverviewExerciseOverview);
      assertNotNull("R.id.imageViewExerciseOverviewExerciseOverview could not be found via exerciseOverview", imageViewExerciseOverviewExerciseOverview);
    }
    setLastActivity(exerciseOverview);
    return imageViewExerciseOverviewExerciseOverview;
  }

  protected void clickExerciseOverviewExerciseOverview()
  {
    takeComment("Before click on ExerciseOverviewExerciseOverview");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseOverviewExerciseOverview");
    TouchUtils.clickView(this, getViewExerciseOverviewExerciseOverview());
  }

  protected void verifyOnScreenExerciseOverviewExerciseOverview()
  {
    ViewAsserts.assertOnScreen(exerciseOverview.getWindow().getDecorView(), getViewExerciseOverviewExerciseOverview());
  }

  private TextView textViewExerciseOverviewExerciseTitle;

  protected TextView getViewExerciseOverviewExerciseTitle()
  {
    assertNotNull("exerciseOverview not set - did you remember to call setActivityExerciseOverview(final ExerciseOverviewActivity exerciseOverview) ?", exerciseOverview);
    if (textViewExerciseOverviewExerciseTitle == null)
    {
      textViewExerciseOverviewExerciseTitle = (TextView) exerciseOverview.findViewById(R.id.textViewExerciseOverviewExerciseTitle);
      assertNotNull("R.id.textViewExerciseOverviewExerciseTitle could not be found via exerciseOverview", textViewExerciseOverviewExerciseTitle);
    }
    setLastActivity(exerciseOverview);
    return textViewExerciseOverviewExerciseTitle;
  }

  protected void clickExerciseOverviewExerciseTitle()
  {
    takeComment("Before click on ExerciseOverviewExerciseTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseOverviewExerciseTitle");
    TouchUtils.clickView(this, getViewExerciseOverviewExerciseTitle());
  }

  protected void verifyTextExerciseOverviewExerciseTitle(final int id)
  {
    assertEquals("Incorrect ExerciseOverviewExerciseTitle.getText()", exerciseOverview.getString(id), getViewExerciseOverviewExerciseTitle().getText().toString());
  }

  protected void verifyTextExerciseOverviewExerciseTitle(final String text)
  {
    assertEquals("Incorrect ExerciseOverviewExerciseTitle.getText()", text, getViewExerciseOverviewExerciseTitle().getText().toString());
  }

  protected void setTextExerciseOverviewExerciseTitle(final String text)
  {
    takeComment("Setting ExerciseOverviewExerciseTitle to '"+text+"'");
    final TextView view = getViewExerciseOverviewExerciseTitle();
    exerciseOverview.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextExerciseOverviewExerciseTitle()
  {
    return getViewExerciseOverviewExerciseTitle().getText().toString();
  }

  protected void verifyOnScreenExerciseOverviewExerciseTitle()
  {
    ViewAsserts.assertOnScreen(exerciseOverview.getWindow().getDecorView(), getViewExerciseOverviewExerciseTitle());
  }

  private TextView textViewExerciseOverviewExerciseStep;

  protected TextView getViewExerciseOverviewExerciseStep()
  {
    assertNotNull("exerciseOverview not set - did you remember to call setActivityExerciseOverview(final ExerciseOverviewActivity exerciseOverview) ?", exerciseOverview);
    if (textViewExerciseOverviewExerciseStep == null)
    {
      textViewExerciseOverviewExerciseStep = (TextView) exerciseOverview.findViewById(R.id.textViewExerciseOverviewExerciseStep);
      assertNotNull("R.id.textViewExerciseOverviewExerciseStep could not be found via exerciseOverview", textViewExerciseOverviewExerciseStep);
    }
    setLastActivity(exerciseOverview);
    return textViewExerciseOverviewExerciseStep;
  }

  protected void clickExerciseOverviewExerciseStep()
  {
    takeComment("Before click on ExerciseOverviewExerciseStep");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseOverviewExerciseStep");
    TouchUtils.clickView(this, getViewExerciseOverviewExerciseStep());
  }

  protected void verifyTextExerciseOverviewExerciseStep(final int id)
  {
    assertEquals("Incorrect ExerciseOverviewExerciseStep.getText()", exerciseOverview.getString(id), getViewExerciseOverviewExerciseStep().getText().toString());
  }

  protected void verifyTextExerciseOverviewExerciseStep(final String text)
  {
    assertEquals("Incorrect ExerciseOverviewExerciseStep.getText()", text, getViewExerciseOverviewExerciseStep().getText().toString());
  }

  protected void setTextExerciseOverviewExerciseStep(final String text)
  {
    takeComment("Setting ExerciseOverviewExerciseStep to '"+text+"'");
    final TextView view = getViewExerciseOverviewExerciseStep();
    exerciseOverview.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextExerciseOverviewExerciseStep()
  {
    return getViewExerciseOverviewExerciseStep().getText().toString();
  }

  protected void verifyOnScreenExerciseOverviewExerciseStep()
  {
    ViewAsserts.assertOnScreen(exerciseOverview.getWindow().getDecorView(), getViewExerciseOverviewExerciseStep());
  }

  private ExerciseStepActivity exerciseStep;
  protected ExerciseStepActivity getActivityExerciseStep() { return exerciseStep; }

  private ActivityMonitor monitorExerciseStep;
  protected ActivityMonitor getMonitorExerciseStep() { return monitorExerciseStep; }

  protected void waitForActivityExerciseStepWithTimeout(final int secs)
  {
    takeComment("Wait for ExerciseStepActivity");
    exerciseStep = (ExerciseStepActivity) monitorExerciseStep.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityExerciseStepWithTimeout gave null after "+secs+" seconds", exerciseStep);
    nullAllFieldsExerciseStep();
    setLastActivity(exerciseStep);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for ExerciseStepActivity");
    }
  }

  protected void prepareToWaitForActivityExerciseStep()
  {
    if (monitorExerciseStep == null) monitorExerciseStep = getInstrumentation().addMonitor(ExerciseStepActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsExerciseStep()
  {
    takeComment("Verifying all fields in ExerciseStepActivity");
    getViewExerciseStepExerciseStep();
    getViewExerciseStepStepNumber();
    getViewExerciseStepStepTitle();
    getViewExerciseStepPreviousTitle();
    getViewExerciseStepDoPrevious();
    getViewExerciseStepNextTitle();
    getViewExerciseStepDoNext();
    getViewExerciseStepNextPrevious();
  }

  protected void nullAllFieldsExerciseStep()
  {
    linearLayoutExerciseStepExerciseStep = null;
    textViewExerciseStepStepNumber = null;
    textViewExerciseStepStepTitle = null;
    textViewExerciseStepPreviousTitle = null;
    imageButtonExerciseStepDoPrevious = null;
    textViewExerciseStepNextTitle = null;
    imageButtonExerciseStepDoNext = null;
    linearLayoutExerciseStepNextPrevious = null;
  }

  private LinearLayout linearLayoutExerciseStepExerciseStep;

  protected LinearLayout getViewExerciseStepExerciseStep()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (linearLayoutExerciseStepExerciseStep == null)
    {
      linearLayoutExerciseStepExerciseStep = (LinearLayout) exerciseStep.findViewById(R.id.linearLayoutExerciseStepExerciseStep);
      assertNotNull("R.id.linearLayoutExerciseStepExerciseStep could not be found via exerciseStep", linearLayoutExerciseStepExerciseStep);
    }
    setLastActivity(exerciseStep);
    return linearLayoutExerciseStepExerciseStep;
  }

  protected void clickExerciseStepExerciseStep()
  {
    takeComment("Before click on ExerciseStepExerciseStep");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepExerciseStep");
    TouchUtils.clickView(this, getViewExerciseStepExerciseStep());
  }

  protected void verifyOnScreenExerciseStepExerciseStep()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepExerciseStep());
  }

  private TextView textViewExerciseStepStepNumber;

  protected TextView getViewExerciseStepStepNumber()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (textViewExerciseStepStepNumber == null)
    {
      textViewExerciseStepStepNumber = (TextView) exerciseStep.findViewById(R.id.textViewExerciseStepStepNumber);
      assertNotNull("R.id.textViewExerciseStepStepNumber could not be found via exerciseStep", textViewExerciseStepStepNumber);
    }
    setLastActivity(exerciseStep);
    return textViewExerciseStepStepNumber;
  }

  protected void clickExerciseStepStepNumber()
  {
    takeComment("Before click on ExerciseStepStepNumber");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepStepNumber");
    TouchUtils.clickView(this, getViewExerciseStepStepNumber());
  }

  protected void verifyTextExerciseStepStepNumber(final int id)
  {
    assertEquals("Incorrect ExerciseStepStepNumber.getText()", exerciseStep.getString(id), getViewExerciseStepStepNumber().getText().toString());
  }

  protected void verifyTextExerciseStepStepNumber(final String text)
  {
    assertEquals("Incorrect ExerciseStepStepNumber.getText()", text, getViewExerciseStepStepNumber().getText().toString());
  }

  protected void setTextExerciseStepStepNumber(final String text)
  {
    takeComment("Setting ExerciseStepStepNumber to '"+text+"'");
    final TextView view = getViewExerciseStepStepNumber();
    exerciseStep.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextExerciseStepStepNumber()
  {
    return getViewExerciseStepStepNumber().getText().toString();
  }

  protected void verifyOnScreenExerciseStepStepNumber()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepStepNumber());
  }

  private TextView textViewExerciseStepStepTitle;

  protected TextView getViewExerciseStepStepTitle()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (textViewExerciseStepStepTitle == null)
    {
      textViewExerciseStepStepTitle = (TextView) exerciseStep.findViewById(R.id.textViewExerciseStepStepTitle);
      assertNotNull("R.id.textViewExerciseStepStepTitle could not be found via exerciseStep", textViewExerciseStepStepTitle);
    }
    setLastActivity(exerciseStep);
    return textViewExerciseStepStepTitle;
  }

  protected void clickExerciseStepStepTitle()
  {
    takeComment("Before click on ExerciseStepStepTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepStepTitle");
    TouchUtils.clickView(this, getViewExerciseStepStepTitle());
  }

  protected void verifyTextExerciseStepStepTitle(final int id)
  {
    assertEquals("Incorrect ExerciseStepStepTitle.getText()", exerciseStep.getString(id), getViewExerciseStepStepTitle().getText().toString());
  }

  protected void verifyTextExerciseStepStepTitle(final String text)
  {
    assertEquals("Incorrect ExerciseStepStepTitle.getText()", text, getViewExerciseStepStepTitle().getText().toString());
  }

  protected void setTextExerciseStepStepTitle(final String text)
  {
    takeComment("Setting ExerciseStepStepTitle to '"+text+"'");
    final TextView view = getViewExerciseStepStepTitle();
    exerciseStep.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextExerciseStepStepTitle()
  {
    return getViewExerciseStepStepTitle().getText().toString();
  }

  protected void verifyOnScreenExerciseStepStepTitle()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepStepTitle());
  }

  private TextView textViewExerciseStepPreviousTitle;

  protected TextView getViewExerciseStepPreviousTitle()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (textViewExerciseStepPreviousTitle == null)
    {
      textViewExerciseStepPreviousTitle = (TextView) exerciseStep.findViewById(R.id.textViewExerciseStepPreviousTitle);
      assertNotNull("R.id.textViewExerciseStepPreviousTitle could not be found via exerciseStep", textViewExerciseStepPreviousTitle);
    }
    setLastActivity(exerciseStep);
    return textViewExerciseStepPreviousTitle;
  }

  protected void clickExerciseStepPreviousTitle()
  {
    takeComment("Before click on ExerciseStepPreviousTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepPreviousTitle");
    TouchUtils.clickView(this, getViewExerciseStepPreviousTitle());
  }

  protected void verifyTextExerciseStepPreviousTitle(final int id)
  {
    assertEquals("Incorrect ExerciseStepPreviousTitle.getText()", exerciseStep.getString(id), getViewExerciseStepPreviousTitle().getText().toString());
  }

  protected void verifyTextExerciseStepPreviousTitle(final String text)
  {
    assertEquals("Incorrect ExerciseStepPreviousTitle.getText()", text, getViewExerciseStepPreviousTitle().getText().toString());
  }

  protected void setTextExerciseStepPreviousTitle(final String text)
  {
    takeComment("Setting ExerciseStepPreviousTitle to '"+text+"'");
    final TextView view = getViewExerciseStepPreviousTitle();
    exerciseStep.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextExerciseStepPreviousTitle()
  {
    return getViewExerciseStepPreviousTitle().getText().toString();
  }

  protected void verifyOnScreenExerciseStepPreviousTitle()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepPreviousTitle());
  }

  private ImageButton imageButtonExerciseStepDoPrevious;

  protected ImageButton getViewExerciseStepDoPrevious()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (imageButtonExerciseStepDoPrevious == null)
    {
      imageButtonExerciseStepDoPrevious = (ImageButton) exerciseStep.findViewById(R.id.imageButtonExerciseStepDoPrevious);
      assertNotNull("R.id.imageButtonExerciseStepDoPrevious could not be found via exerciseStep", imageButtonExerciseStepDoPrevious);
    }
    setLastActivity(exerciseStep);
    return imageButtonExerciseStepDoPrevious;
  }

  protected void clickExerciseStepDoPrevious()
  {
    takeComment("Before click on ExerciseStepDoPrevious");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepDoPrevious");
    TouchUtils.clickView(this, getViewExerciseStepDoPrevious());
  }

  protected void verifyOnScreenExerciseStepDoPrevious()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepDoPrevious());
  }

  private TextView textViewExerciseStepNextTitle;

  protected TextView getViewExerciseStepNextTitle()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (textViewExerciseStepNextTitle == null)
    {
      textViewExerciseStepNextTitle = (TextView) exerciseStep.findViewById(R.id.textViewExerciseStepNextTitle);
      assertNotNull("R.id.textViewExerciseStepNextTitle could not be found via exerciseStep", textViewExerciseStepNextTitle);
    }
    setLastActivity(exerciseStep);
    return textViewExerciseStepNextTitle;
  }

  protected void clickExerciseStepNextTitle()
  {
    takeComment("Before click on ExerciseStepNextTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepNextTitle");
    TouchUtils.clickView(this, getViewExerciseStepNextTitle());
  }

  protected void verifyTextExerciseStepNextTitle(final int id)
  {
    assertEquals("Incorrect ExerciseStepNextTitle.getText()", exerciseStep.getString(id), getViewExerciseStepNextTitle().getText().toString());
  }

  protected void verifyTextExerciseStepNextTitle(final String text)
  {
    assertEquals("Incorrect ExerciseStepNextTitle.getText()", text, getViewExerciseStepNextTitle().getText().toString());
  }

  protected void setTextExerciseStepNextTitle(final String text)
  {
    takeComment("Setting ExerciseStepNextTitle to '"+text+"'");
    final TextView view = getViewExerciseStepNextTitle();
    exerciseStep.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextExerciseStepNextTitle()
  {
    return getViewExerciseStepNextTitle().getText().toString();
  }

  protected void verifyOnScreenExerciseStepNextTitle()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepNextTitle());
  }

  private ImageButton imageButtonExerciseStepDoNext;

  protected ImageButton getViewExerciseStepDoNext()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (imageButtonExerciseStepDoNext == null)
    {
      imageButtonExerciseStepDoNext = (ImageButton) exerciseStep.findViewById(R.id.imageButtonExerciseStepDoNext);
      assertNotNull("R.id.imageButtonExerciseStepDoNext could not be found via exerciseStep", imageButtonExerciseStepDoNext);
    }
    setLastActivity(exerciseStep);
    return imageButtonExerciseStepDoNext;
  }

  protected void clickExerciseStepDoNext()
  {
    takeComment("Before click on ExerciseStepDoNext");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepDoNext");
    TouchUtils.clickView(this, getViewExerciseStepDoNext());
  }

  protected void verifyOnScreenExerciseStepDoNext()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepDoNext());
  }

  private LinearLayout linearLayoutExerciseStepNextPrevious;

  protected LinearLayout getViewExerciseStepNextPrevious()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (linearLayoutExerciseStepNextPrevious == null)
    {
      linearLayoutExerciseStepNextPrevious = (LinearLayout) exerciseStep.findViewById(R.id.linearLayoutExerciseStepNextPrevious);
      assertNotNull("R.id.linearLayoutExerciseStepNextPrevious could not be found via exerciseStep", linearLayoutExerciseStepNextPrevious);
    }
    setLastActivity(exerciseStep);
    return linearLayoutExerciseStepNextPrevious;
  }

  protected void clickExerciseStepNextPrevious()
  {
    takeComment("Before click on ExerciseStepNextPrevious");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepNextPrevious");
    TouchUtils.clickView(this, getViewExerciseStepNextPrevious());
  }

  protected void verifyOnScreenExerciseStepNextPrevious()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewExerciseStepNextPrevious());
  }

  private MenuItem menuItemExerciseStepShowOverview;

  protected MenuItem getViewExerciseStepShowOverview()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (menuItemExerciseStepShowOverview == null)
    {
      menuItemExerciseStepShowOverview = (MenuItem) exerciseStep.findViewById(R.id.menuItemExerciseStepShowOverview);
      assertNotNull("R.id.menuItemExerciseStepShowOverview could not be found via exerciseStep", menuItemExerciseStepShowOverview);
    }
    setLastActivity(exerciseStep);
    return menuItemExerciseStepShowOverview;
  }

  protected void clickExerciseStepShowOverview()
  {
    takeComment("Before click on ExerciseStepShowOverview");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickExerciseStepShowOverview");
    // TODO invokeContextMenuAction ?
    getInstrumentation().invokeMenuActionSync(getActivity(), R.id.menuItemExerciseStepShowOverview, 0);
  }

  private TextView textViewFlowchartDetailFlowchartTitle;

  protected TextView getViewFlowchartDetailFlowchartTitle()
  {
    assertNotNull("flowchartMain not set - did you remember to call setActivityFlowchartMain(final FlowchartMainActivity flowchartMain) ?", flowchartMain);
    if (textViewFlowchartDetailFlowchartTitle == null)
    {
      textViewFlowchartDetailFlowchartTitle = (TextView) flowchartMain.findViewById(R.id.textViewFlowchartDetailFlowchartTitle);
      assertNotNull("R.id.textViewFlowchartDetailFlowchartTitle could not be found via flowchartMain", textViewFlowchartDetailFlowchartTitle);
    }
    setLastActivity(flowchartMain);
    return textViewFlowchartDetailFlowchartTitle;
  }

  protected void clickFlowchartDetailFlowchartTitle()
  {
    takeComment("Before click on FlowchartDetailFlowchartTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickFlowchartDetailFlowchartTitle");
    TouchUtils.clickView(this, getViewFlowchartDetailFlowchartTitle());
  }

  protected void verifyTextFlowchartDetailFlowchartTitle(final int id)
  {
    assertEquals("Incorrect FlowchartDetailFlowchartTitle.getText()", flowchartMain.getString(id), getViewFlowchartDetailFlowchartTitle().getText().toString());
  }

  protected void verifyTextFlowchartDetailFlowchartTitle(final String text)
  {
    assertEquals("Incorrect FlowchartDetailFlowchartTitle.getText()", text, getViewFlowchartDetailFlowchartTitle().getText().toString());
  }

  protected void setTextFlowchartDetailFlowchartTitle(final String text)
  {
    takeComment("Setting FlowchartDetailFlowchartTitle to '"+text+"'");
    final TextView view = getViewFlowchartDetailFlowchartTitle();
    flowchartMain.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextFlowchartDetailFlowchartTitle()
  {
    return getViewFlowchartDetailFlowchartTitle().getText().toString();
  }

  protected void verifyOnScreenFlowchartDetailFlowchartTitle()
  {
    ViewAsserts.assertOnScreen(flowchartMain.getWindow().getDecorView(), getViewFlowchartDetailFlowchartTitle());
  }

  private ImageButton imageButtonFlowchartDetailDoExercise;

  protected ImageButton getViewFlowchartDetailDoExercise()
  {
    assertNotNull("flowchartMain not set - did you remember to call setActivityFlowchartMain(final FlowchartMainActivity flowchartMain) ?", flowchartMain);
    if (imageButtonFlowchartDetailDoExercise == null)
    {
      imageButtonFlowchartDetailDoExercise = (ImageButton) flowchartMain.findViewById(R.id.imageButtonFlowchartDetailDoExercise);
      assertNotNull("R.id.imageButtonFlowchartDetailDoExercise could not be found via flowchartMain", imageButtonFlowchartDetailDoExercise);
    }
    setLastActivity(flowchartMain);
    return imageButtonFlowchartDetailDoExercise;
  }

  protected void clickFlowchartDetailDoExercise()
  {
    takeComment("Before click on FlowchartDetailDoExercise");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickFlowchartDetailDoExercise");
    TouchUtils.clickView(this, getViewFlowchartDetailDoExercise());
  }

  protected void verifyOnScreenFlowchartDetailDoExercise()
  {
    ViewAsserts.assertOnScreen(flowchartMain.getWindow().getDecorView(), getViewFlowchartDetailDoExercise());
  }

  private FlowchartMainActivity flowchartMain;
  protected FlowchartMainActivity getActivityFlowchartMain() { return flowchartMain; }

  protected VUCRoskildeBusinessContext busctx;

  protected void setActivityFlowchartMain(final FlowchartMainActivity flowchartMain)
  {
    takeComment("Entering app via FlowchartMainActivity");
    this.flowchartMain = flowchartMain;
    this.busctx = flowchartMain.getGlobalState().getBusinessContext(); 
    setLastActivity(flowchartMain);
    if (isScreenshotsAutomatic()) takeScreenshot("Entered app via FlowchartMainActivity");
  }

  private ActivityMonitor monitorFlowchartMain;
  protected ActivityMonitor getMonitorFlowchartMain() { return monitorFlowchartMain; }

  protected void waitForActivityFlowchartMainWithTimeout(final int secs)
  {
    takeComment("Wait for FlowchartMainActivity");
    flowchartMain = (FlowchartMainActivity) monitorFlowchartMain.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivityFlowchartMainWithTimeout gave null after "+secs+" seconds", flowchartMain);
    nullAllFieldsFlowchartMain();
    setLastActivity(flowchartMain);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for FlowchartMainActivity");
    }
  }

  protected void prepareToWaitForActivityFlowchartMain()
  {
    if (monitorFlowchartMain == null) monitorFlowchartMain = getInstrumentation().addMonitor(FlowchartMainActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsFlowchartMain()
  {
    takeComment("Verifying all fields in FlowchartMainActivity");
    getViewFlowchartMainExerciseList();
  }

  protected void nullAllFieldsFlowchartMain()
  {
    linearLayoutFlowchartMainExerciseList = null;
  }

  private LinearLayout linearLayoutFlowchartMainExerciseList;

  protected LinearLayout getViewFlowchartMainExerciseList()
  {
    assertNotNull("flowchartMain not set - did you remember to call setActivityFlowchartMain(final FlowchartMainActivity flowchartMain) ?", flowchartMain);
    if (linearLayoutFlowchartMainExerciseList == null)
    {
      linearLayoutFlowchartMainExerciseList = (LinearLayout) flowchartMain.findViewById(R.id.linearLayoutFlowchartMainExerciseList);
      assertNotNull("R.id.linearLayoutFlowchartMainExerciseList could not be found via flowchartMain", linearLayoutFlowchartMainExerciseList);
    }
    setLastActivity(flowchartMain);
    return linearLayoutFlowchartMainExerciseList;
  }

  protected void clickFlowchartMainExerciseList()
  {
    takeComment("Before click on FlowchartMainExerciseList");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickFlowchartMainExerciseList");
    TouchUtils.clickView(this, getViewFlowchartMainExerciseList());
  }

  protected void verifyOnScreenFlowchartMainExerciseList()
  {
    ViewAsserts.assertOnScreen(flowchartMain.getWindow().getDecorView(), getViewFlowchartMainExerciseList());
  }

  private MenuItem menuItemFlowchartMainSetup;

  protected MenuItem getViewFlowchartMainSetup()
  {
    assertNotNull("flowchartMain not set - did you remember to call setActivityFlowchartMain(final FlowchartMainActivity flowchartMain) ?", flowchartMain);
    if (menuItemFlowchartMainSetup == null)
    {
      menuItemFlowchartMainSetup = (MenuItem) flowchartMain.findViewById(R.id.menuItemFlowchartMainSetup);
      assertNotNull("R.id.menuItemFlowchartMainSetup could not be found via flowchartMain", menuItemFlowchartMainSetup);
    }
    setLastActivity(flowchartMain);
    return menuItemFlowchartMainSetup;
  }

  protected void clickFlowchartMainSetup()
  {
    takeComment("Before click on FlowchartMainSetup");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickFlowchartMainSetup");
    // TODO invokeContextMenuAction ?
    getInstrumentation().invokeMenuActionSync(getActivity(), R.id.menuItemFlowchartMainSetup, 0);
  }

  private MenuItem menuItemFlowchartMainAbout;

  protected MenuItem getViewFlowchartMainAbout()
  {
    assertNotNull("flowchartMain not set - did you remember to call setActivityFlowchartMain(final FlowchartMainActivity flowchartMain) ?", flowchartMain);
    if (menuItemFlowchartMainAbout == null)
    {
      menuItemFlowchartMainAbout = (MenuItem) flowchartMain.findViewById(R.id.menuItemFlowchartMainAbout);
      assertNotNull("R.id.menuItemFlowchartMainAbout could not be found via flowchartMain", menuItemFlowchartMainAbout);
    }
    setLastActivity(flowchartMain);
    return menuItemFlowchartMainAbout;
  }

  protected void clickFlowchartMainAbout()
  {
    takeComment("Before click on FlowchartMainAbout");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickFlowchartMainAbout");
    // TODO invokeContextMenuAction ?
    getInstrumentation().invokeMenuActionSync(getActivity(), R.id.menuItemFlowchartMainAbout, 0);
  }

  private SetupActivity setup;
  protected SetupActivity getActivitySetup() { return setup; }

  private ActivityMonitor monitorSetup;
  protected ActivityMonitor getMonitorSetup() { return monitorSetup; }

  protected void waitForActivitySetupWithTimeout(final int secs)
  {
    takeComment("Wait for SetupActivity");
    setup = (SetupActivity) monitorSetup.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivitySetupWithTimeout gave null after "+secs+" seconds", setup);
    nullAllFieldsSetup();
    setLastActivity(setup);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for SetupActivity");
    }
  }

  protected void prepareToWaitForActivitySetup()
  {
    if (monitorSetup == null) monitorSetup = getInstrumentation().addMonitor(SetupActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsSetup()
  {
    takeComment("Verifying all fields in SetupActivity");
    getViewSetupTeacher();
    getViewSetupEmailLabel();
    getViewSetupEmail();
    getViewSetupHighQualityVideo();
    getViewSetupMaxVideoSizeBytesLabel();
    getViewSetupMaxVideoSizeBytes();
  }

  protected void nullAllFieldsSetup()
  {
    checkBoxSetupTeacher = null;
    textViewSetupEmailLabel = null;
    editTextSetupEmail = null;
    checkBoxSetupHighQualityVideo = null;
    textViewSetupMaxVideoSizeBytesLabel = null;
    editTextSetupMaxVideoSizeBytes = null;
  }

  private CheckBox checkBoxSetupTeacher;

  protected CheckBox getViewSetupTeacher()
  {
    assertNotNull("setup not set - did you remember to call setActivitySetup(final SetupActivity setup) ?", setup);
    if (checkBoxSetupTeacher == null)
    {
      checkBoxSetupTeacher = (CheckBox) setup.findViewById(R.id.checkBoxSetupTeacher);
      assertNotNull("R.id.checkBoxSetupTeacher could not be found via setup", checkBoxSetupTeacher);
    }
    setLastActivity(setup);
    return checkBoxSetupTeacher;
  }

  protected void clickSetupTeacher()
  {
    takeComment("Before click on SetupTeacher");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSetupTeacher");
    TouchUtils.clickView(this, getViewSetupTeacher());
  }

  protected void verifyTextSetupTeacher(final int id)
  {
    assertEquals("Incorrect SetupTeacher.getText()", setup.getString(id), getViewSetupTeacher().getText().toString());
  }

  protected void verifyTextSetupTeacher(final String text)
  {
    assertEquals("Incorrect SetupTeacher.getText()", text, getViewSetupTeacher().getText().toString());
  }

  protected void setTextSetupTeacher(final String text)
  {
    takeComment("Setting SetupTeacher to '"+text+"'");
    final CheckBox view = getViewSetupTeacher();
    setup.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSetupTeacher()
  {
    return getViewSetupTeacher().getText().toString();
  }

  protected void verifyOnScreenSetupTeacher()
  {
    ViewAsserts.assertOnScreen(setup.getWindow().getDecorView(), getViewSetupTeacher());
  }

  private TextView textViewSetupEmailLabel;

  protected TextView getViewSetupEmailLabel()
  {
    assertNotNull("setup not set - did you remember to call setActivitySetup(final SetupActivity setup) ?", setup);
    if (textViewSetupEmailLabel == null)
    {
      textViewSetupEmailLabel = (TextView) setup.findViewById(R.id.textViewSetupEmailLabel);
      assertNotNull("R.id.textViewSetupEmailLabel could not be found via setup", textViewSetupEmailLabel);
    }
    setLastActivity(setup);
    return textViewSetupEmailLabel;
  }

  protected void clickSetupEmailLabel()
  {
    takeComment("Before click on SetupEmailLabel");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSetupEmailLabel");
    TouchUtils.clickView(this, getViewSetupEmailLabel());
  }

  protected void verifyTextSetupEmailLabel(final int id)
  {
    assertEquals("Incorrect SetupEmailLabel.getText()", setup.getString(id), getViewSetupEmailLabel().getText().toString());
  }

  protected void verifyTextSetupEmailLabel(final String text)
  {
    assertEquals("Incorrect SetupEmailLabel.getText()", text, getViewSetupEmailLabel().getText().toString());
  }

  protected void setTextSetupEmailLabel(final String text)
  {
    takeComment("Setting SetupEmailLabel to '"+text+"'");
    final TextView view = getViewSetupEmailLabel();
    setup.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSetupEmailLabel()
  {
    return getViewSetupEmailLabel().getText().toString();
  }

  protected void verifyOnScreenSetupEmailLabel()
  {
    ViewAsserts.assertOnScreen(setup.getWindow().getDecorView(), getViewSetupEmailLabel());
  }

  private EditText editTextSetupEmail;

  protected EditText getViewSetupEmail()
  {
    assertNotNull("setup not set - did you remember to call setActivitySetup(final SetupActivity setup) ?", setup);
    if (editTextSetupEmail == null)
    {
      editTextSetupEmail = (EditText) setup.findViewById(R.id.editTextSetupEmail);
      assertNotNull("R.id.editTextSetupEmail could not be found via setup", editTextSetupEmail);
    }
    setLastActivity(setup);
    return editTextSetupEmail;
  }

  protected void verifyTextSetupEmail(final int id)
  {
    assertEquals("Incorrect SetupEmail.getText()", setup.getString(id), getViewSetupEmail().getText().toString());
  }

  protected void verifyTextSetupEmail(final String text)
  {
    assertEquals("Incorrect SetupEmail.getText()", text, getViewSetupEmail().getText().toString());
  }

  protected void setTextSetupEmail(final String text)
  {
    takeComment("Setting SetupEmail to '"+text+"'");
    final EditText view = getViewSetupEmail();
    setup.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSetupEmail()
  {
    return getViewSetupEmail().getText().toString();
  }

  protected void verifyOnScreenSetupEmail()
  {
    ViewAsserts.assertOnScreen(setup.getWindow().getDecorView(), getViewSetupEmail());
  }

  private CheckBox checkBoxSetupHighQualityVideo;

  protected CheckBox getViewSetupHighQualityVideo()
  {
    assertNotNull("setup not set - did you remember to call setActivitySetup(final SetupActivity setup) ?", setup);
    if (checkBoxSetupHighQualityVideo == null)
    {
      checkBoxSetupHighQualityVideo = (CheckBox) setup.findViewById(R.id.checkBoxSetupHighQualityVideo);
      assertNotNull("R.id.checkBoxSetupHighQualityVideo could not be found via setup", checkBoxSetupHighQualityVideo);
    }
    setLastActivity(setup);
    return checkBoxSetupHighQualityVideo;
  }

  protected void clickSetupHighQualityVideo()
  {
    takeComment("Before click on SetupHighQualityVideo");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSetupHighQualityVideo");
    TouchUtils.clickView(this, getViewSetupHighQualityVideo());
  }

  protected void verifyTextSetupHighQualityVideo(final int id)
  {
    assertEquals("Incorrect SetupHighQualityVideo.getText()", setup.getString(id), getViewSetupHighQualityVideo().getText().toString());
  }

  protected void verifyTextSetupHighQualityVideo(final String text)
  {
    assertEquals("Incorrect SetupHighQualityVideo.getText()", text, getViewSetupHighQualityVideo().getText().toString());
  }

  protected void setTextSetupHighQualityVideo(final String text)
  {
    takeComment("Setting SetupHighQualityVideo to '"+text+"'");
    final CheckBox view = getViewSetupHighQualityVideo();
    setup.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSetupHighQualityVideo()
  {
    return getViewSetupHighQualityVideo().getText().toString();
  }

  protected void verifyOnScreenSetupHighQualityVideo()
  {
    ViewAsserts.assertOnScreen(setup.getWindow().getDecorView(), getViewSetupHighQualityVideo());
  }

  private TextView textViewSetupMaxVideoSizeBytesLabel;

  protected TextView getViewSetupMaxVideoSizeBytesLabel()
  {
    assertNotNull("setup not set - did you remember to call setActivitySetup(final SetupActivity setup) ?", setup);
    if (textViewSetupMaxVideoSizeBytesLabel == null)
    {
      textViewSetupMaxVideoSizeBytesLabel = (TextView) setup.findViewById(R.id.textViewSetupMaxVideoSizeBytesLabel);
      assertNotNull("R.id.textViewSetupMaxVideoSizeBytesLabel could not be found via setup", textViewSetupMaxVideoSizeBytesLabel);
    }
    setLastActivity(setup);
    return textViewSetupMaxVideoSizeBytesLabel;
  }

  protected void clickSetupMaxVideoSizeBytesLabel()
  {
    takeComment("Before click on SetupMaxVideoSizeBytesLabel");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSetupMaxVideoSizeBytesLabel");
    TouchUtils.clickView(this, getViewSetupMaxVideoSizeBytesLabel());
  }

  protected void verifyTextSetupMaxVideoSizeBytesLabel(final int id)
  {
    assertEquals("Incorrect SetupMaxVideoSizeBytesLabel.getText()", setup.getString(id), getViewSetupMaxVideoSizeBytesLabel().getText().toString());
  }

  protected void verifyTextSetupMaxVideoSizeBytesLabel(final String text)
  {
    assertEquals("Incorrect SetupMaxVideoSizeBytesLabel.getText()", text, getViewSetupMaxVideoSizeBytesLabel().getText().toString());
  }

  protected void setTextSetupMaxVideoSizeBytesLabel(final String text)
  {
    takeComment("Setting SetupMaxVideoSizeBytesLabel to '"+text+"'");
    final TextView view = getViewSetupMaxVideoSizeBytesLabel();
    setup.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSetupMaxVideoSizeBytesLabel()
  {
    return getViewSetupMaxVideoSizeBytesLabel().getText().toString();
  }

  protected void verifyOnScreenSetupMaxVideoSizeBytesLabel()
  {
    ViewAsserts.assertOnScreen(setup.getWindow().getDecorView(), getViewSetupMaxVideoSizeBytesLabel());
  }

  private EditText editTextSetupMaxVideoSizeBytes;

  protected EditText getViewSetupMaxVideoSizeBytes()
  {
    assertNotNull("setup not set - did you remember to call setActivitySetup(final SetupActivity setup) ?", setup);
    if (editTextSetupMaxVideoSizeBytes == null)
    {
      editTextSetupMaxVideoSizeBytes = (EditText) setup.findViewById(R.id.editTextSetupMaxVideoSizeBytes);
      assertNotNull("R.id.editTextSetupMaxVideoSizeBytes could not be found via setup", editTextSetupMaxVideoSizeBytes);
    }
    setLastActivity(setup);
    return editTextSetupMaxVideoSizeBytes;
  }

  protected void verifyTextSetupMaxVideoSizeBytes(final int id)
  {
    assertEquals("Incorrect SetupMaxVideoSizeBytes.getText()", setup.getString(id), getViewSetupMaxVideoSizeBytes().getText().toString());
  }

  protected void verifyTextSetupMaxVideoSizeBytes(final String text)
  {
    assertEquals("Incorrect SetupMaxVideoSizeBytes.getText()", text, getViewSetupMaxVideoSizeBytes().getText().toString());
  }

  protected void setTextSetupMaxVideoSizeBytes(final String text)
  {
    takeComment("Setting SetupMaxVideoSizeBytes to '"+text+"'");
    final EditText view = getViewSetupMaxVideoSizeBytes();
    setup.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSetupMaxVideoSizeBytes()
  {
    return getViewSetupMaxVideoSizeBytes().getText().toString();
  }

  protected void verifyOnScreenSetupMaxVideoSizeBytes()
  {
    ViewAsserts.assertOnScreen(setup.getWindow().getDecorView(), getViewSetupMaxVideoSizeBytes());
  }

  private SplashActivity splash;
  protected SplashActivity getActivitySplash() { return splash; }

  private ActivityMonitor monitorSplash;
  protected ActivityMonitor getMonitorSplash() { return monitorSplash; }

  protected void waitForActivitySplashWithTimeout(final int secs)
  {
    takeComment("Wait for SplashActivity");
    splash = (SplashActivity) monitorSplash.waitForActivityWithTimeout(secs);
    assertNotNull("waitForActivitySplashWithTimeout gave null after "+secs+" seconds", splash);
    nullAllFieldsSplash();
    setLastActivity(splash);
    if (isScreenshotsAutomatic())
    {
      takeScreenshot("Waited for SplashActivity");
    }
  }

  protected void prepareToWaitForActivitySplash()
  {
    if (monitorSplash == null) monitorSplash = getInstrumentation().addMonitor(SplashActivity.class.getName(), null, false);
  }

  protected void verifyAllFieldsSplash()
  {
    takeComment("Verifying all fields in SplashActivity");
    getViewSplashVUCLogo();
    getViewSplashLundOgBendsenLogo();
    getViewSplashTitle();
    getViewSplashForAndroid();
    getViewSplashVersion();
  }

  protected void nullAllFieldsSplash()
  {
    imageViewSplashVUCLogo = null;
    imageViewSplashLundOgBendsenLogo = null;
    textViewSplashTitle = null;
    textViewSplashForAndroid = null;
    textViewSplashVersion = null;
  }

  private ImageView imageViewSplashVUCLogo;

  protected ImageView getViewSplashVUCLogo()
  {
    assertNotNull("splash not set - did you remember to call setActivitySplash(final SplashActivity splash) ?", splash);
    if (imageViewSplashVUCLogo == null)
    {
      imageViewSplashVUCLogo = (ImageView) splash.findViewById(R.id.imageViewSplashVUCLogo);
      assertNotNull("R.id.imageViewSplashVUCLogo could not be found via splash", imageViewSplashVUCLogo);
    }
    setLastActivity(splash);
    return imageViewSplashVUCLogo;
  }

  protected void clickSplashVUCLogo()
  {
    takeComment("Before click on SplashVUCLogo");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSplashVUCLogo");
    TouchUtils.clickView(this, getViewSplashVUCLogo());
  }

  protected void verifyOnScreenSplashVUCLogo()
  {
    ViewAsserts.assertOnScreen(splash.getWindow().getDecorView(), getViewSplashVUCLogo());
  }

  private ImageView imageViewSplashLundOgBendsenLogo;

  protected ImageView getViewSplashLundOgBendsenLogo()
  {
    assertNotNull("splash not set - did you remember to call setActivitySplash(final SplashActivity splash) ?", splash);
    if (imageViewSplashLundOgBendsenLogo == null)
    {
      imageViewSplashLundOgBendsenLogo = (ImageView) splash.findViewById(R.id.imageViewSplashLundOgBendsenLogo);
      assertNotNull("R.id.imageViewSplashLundOgBendsenLogo could not be found via splash", imageViewSplashLundOgBendsenLogo);
    }
    setLastActivity(splash);
    return imageViewSplashLundOgBendsenLogo;
  }

  protected void clickSplashLundOgBendsenLogo()
  {
    takeComment("Before click on SplashLundOgBendsenLogo");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSplashLundOgBendsenLogo");
    TouchUtils.clickView(this, getViewSplashLundOgBendsenLogo());
  }

  protected void verifyOnScreenSplashLundOgBendsenLogo()
  {
    ViewAsserts.assertOnScreen(splash.getWindow().getDecorView(), getViewSplashLundOgBendsenLogo());
  }

  private TextView textViewSplashTitle;

  protected TextView getViewSplashTitle()
  {
    assertNotNull("splash not set - did you remember to call setActivitySplash(final SplashActivity splash) ?", splash);
    if (textViewSplashTitle == null)
    {
      textViewSplashTitle = (TextView) splash.findViewById(R.id.textViewSplashTitle);
      assertNotNull("R.id.textViewSplashTitle could not be found via splash", textViewSplashTitle);
    }
    setLastActivity(splash);
    return textViewSplashTitle;
  }

  protected void clickSplashTitle()
  {
    takeComment("Before click on SplashTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSplashTitle");
    TouchUtils.clickView(this, getViewSplashTitle());
  }

  protected void verifyTextSplashTitle(final int id)
  {
    assertEquals("Incorrect SplashTitle.getText()", splash.getString(id), getViewSplashTitle().getText().toString());
  }

  protected void verifyTextSplashTitle(final String text)
  {
    assertEquals("Incorrect SplashTitle.getText()", text, getViewSplashTitle().getText().toString());
  }

  protected void setTextSplashTitle(final String text)
  {
    takeComment("Setting SplashTitle to '"+text+"'");
    final TextView view = getViewSplashTitle();
    splash.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSplashTitle()
  {
    return getViewSplashTitle().getText().toString();
  }

  protected void verifyOnScreenSplashTitle()
  {
    ViewAsserts.assertOnScreen(splash.getWindow().getDecorView(), getViewSplashTitle());
  }

  private TextView textViewSplashForAndroid;

  protected TextView getViewSplashForAndroid()
  {
    assertNotNull("splash not set - did you remember to call setActivitySplash(final SplashActivity splash) ?", splash);
    if (textViewSplashForAndroid == null)
    {
      textViewSplashForAndroid = (TextView) splash.findViewById(R.id.textViewSplashForAndroid);
      assertNotNull("R.id.textViewSplashForAndroid could not be found via splash", textViewSplashForAndroid);
    }
    setLastActivity(splash);
    return textViewSplashForAndroid;
  }

  protected void clickSplashForAndroid()
  {
    takeComment("Before click on SplashForAndroid");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSplashForAndroid");
    TouchUtils.clickView(this, getViewSplashForAndroid());
  }

  protected void verifyTextSplashForAndroid(final int id)
  {
    assertEquals("Incorrect SplashForAndroid.getText()", splash.getString(id), getViewSplashForAndroid().getText().toString());
  }

  protected void verifyTextSplashForAndroid(final String text)
  {
    assertEquals("Incorrect SplashForAndroid.getText()", text, getViewSplashForAndroid().getText().toString());
  }

  protected void setTextSplashForAndroid(final String text)
  {
    takeComment("Setting SplashForAndroid to '"+text+"'");
    final TextView view = getViewSplashForAndroid();
    splash.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSplashForAndroid()
  {
    return getViewSplashForAndroid().getText().toString();
  }

  protected void verifyOnScreenSplashForAndroid()
  {
    ViewAsserts.assertOnScreen(splash.getWindow().getDecorView(), getViewSplashForAndroid());
  }

  private TextView textViewSplashVersion;

  protected TextView getViewSplashVersion()
  {
    assertNotNull("splash not set - did you remember to call setActivitySplash(final SplashActivity splash) ?", splash);
    if (textViewSplashVersion == null)
    {
      textViewSplashVersion = (TextView) splash.findViewById(R.id.textViewSplashVersion);
      assertNotNull("R.id.textViewSplashVersion could not be found via splash", textViewSplashVersion);
    }
    setLastActivity(splash);
    return textViewSplashVersion;
  }

  protected void clickSplashVersion()
  {
    takeComment("Before click on SplashVersion");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickSplashVersion");
    TouchUtils.clickView(this, getViewSplashVersion());
  }

  protected void verifyTextSplashVersion(final int id)
  {
    assertEquals("Incorrect SplashVersion.getText()", splash.getString(id), getViewSplashVersion().getText().toString());
  }

  protected void verifyTextSplashVersion(final String text)
  {
    assertEquals("Incorrect SplashVersion.getText()", text, getViewSplashVersion().getText().toString());
  }

  protected void setTextSplashVersion(final String text)
  {
    takeComment("Setting SplashVersion to '"+text+"'");
    final TextView view = getViewSplashVersion();
    splash.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextSplashVersion()
  {
    return getViewSplashVersion().getText().toString();
  }

  protected void verifyOnScreenSplashVersion()
  {
    ViewAsserts.assertOnScreen(splash.getWindow().getDecorView(), getViewSplashVersion());
  }

  private TextView textViewStepDetailStepNumber;

  protected TextView getViewStepDetailStepNumber()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (textViewStepDetailStepNumber == null)
    {
      textViewStepDetailStepNumber = (TextView) exerciseStep.findViewById(R.id.textViewStepDetailStepNumber);
      assertNotNull("R.id.textViewStepDetailStepNumber could not be found via exerciseStep", textViewStepDetailStepNumber);
    }
    setLastActivity(exerciseStep);
    return textViewStepDetailStepNumber;
  }

  protected void clickStepDetailStepNumber()
  {
    takeComment("Before click on StepDetailStepNumber");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickStepDetailStepNumber");
    TouchUtils.clickView(this, getViewStepDetailStepNumber());
  }

  protected void verifyTextStepDetailStepNumber(final int id)
  {
    assertEquals("Incorrect StepDetailStepNumber.getText()", exerciseStep.getString(id), getViewStepDetailStepNumber().getText().toString());
  }

  protected void verifyTextStepDetailStepNumber(final String text)
  {
    assertEquals("Incorrect StepDetailStepNumber.getText()", text, getViewStepDetailStepNumber().getText().toString());
  }

  protected void setTextStepDetailStepNumber(final String text)
  {
    takeComment("Setting StepDetailStepNumber to '"+text+"'");
    final TextView view = getViewStepDetailStepNumber();
    exerciseStep.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextStepDetailStepNumber()
  {
    return getViewStepDetailStepNumber().getText().toString();
  }

  protected void verifyOnScreenStepDetailStepNumber()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewStepDetailStepNumber());
  }

  private TextView textViewStepDetailStepTitle;

  protected TextView getViewStepDetailStepTitle()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (textViewStepDetailStepTitle == null)
    {
      textViewStepDetailStepTitle = (TextView) exerciseStep.findViewById(R.id.textViewStepDetailStepTitle);
      assertNotNull("R.id.textViewStepDetailStepTitle could not be found via exerciseStep", textViewStepDetailStepTitle);
    }
    setLastActivity(exerciseStep);
    return textViewStepDetailStepTitle;
  }

  protected void clickStepDetailStepTitle()
  {
    takeComment("Before click on StepDetailStepTitle");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickStepDetailStepTitle");
    TouchUtils.clickView(this, getViewStepDetailStepTitle());
  }

  protected void verifyTextStepDetailStepTitle(final int id)
  {
    assertEquals("Incorrect StepDetailStepTitle.getText()", exerciseStep.getString(id), getViewStepDetailStepTitle().getText().toString());
  }

  protected void verifyTextStepDetailStepTitle(final String text)
  {
    assertEquals("Incorrect StepDetailStepTitle.getText()", text, getViewStepDetailStepTitle().getText().toString());
  }

  protected void setTextStepDetailStepTitle(final String text)
  {
    takeComment("Setting StepDetailStepTitle to '"+text+"'");
    final TextView view = getViewStepDetailStepTitle();
    exerciseStep.runOnUiThread(new Runnable() { @Override public void run() { view.setText(text); } });
  }

  protected String getTextStepDetailStepTitle()
  {
    return getViewStepDetailStepTitle().getText().toString();
  }

  protected void verifyOnScreenStepDetailStepTitle()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewStepDetailStepTitle());
  }

  private ImageButton imageButtonStepDetailDoStep;

  protected ImageButton getViewStepDetailDoStep()
  {
    assertNotNull("exerciseStep not set - did you remember to call setActivityExerciseStep(final ExerciseStepActivity exerciseStep) ?", exerciseStep);
    if (imageButtonStepDetailDoStep == null)
    {
      imageButtonStepDetailDoStep = (ImageButton) exerciseStep.findViewById(R.id.imageButtonStepDetailDoStep);
      assertNotNull("R.id.imageButtonStepDetailDoStep could not be found via exerciseStep", imageButtonStepDetailDoStep);
    }
    setLastActivity(exerciseStep);
    return imageButtonStepDetailDoStep;
  }

  protected void clickStepDetailDoStep()
  {
    takeComment("Before click on StepDetailDoStep");
    if (isScreenshotsAutomatic()) takeScreenshot("Before clickStepDetailDoStep");
    TouchUtils.clickView(this, getViewStepDetailDoStep());
  }

  protected void verifyOnScreenStepDetailDoStep()
  {
    ViewAsserts.assertOnScreen(exerciseStep.getWindow().getDecorView(), getViewStepDetailDoStep());
  }
}
