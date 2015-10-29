package dk.lundogbendsen.vucroskilde.android.data;

import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoXML;

public enum StepType
{
  SUB_FLOWCHART(null, R.drawable.ic_menu_black_24dp),

  SHOW_TEXT(ActionShowTextXML.class, R.drawable.ic_info_black_24dp),
  SHOW_IMAGE(ActionShowImageXML.class, R.drawable.ic_photo_black_24dp),
  SHOW_AUDIO(ActionShowAudioXML.class, R.drawable.ic_play_arrow_black_24dp),
  SHOW_VIDEO(ActionShowVideoXML.class, R.drawable.ic_movie_black_24dp),
  RECORD_TEXT(ActionRecordTextXML.class, R.drawable.ic_create_black_24dp),
  RECORD_IMAGE(ActionRecordImageXML.class, R.drawable.ic_camera_alt_black_24dp),
  RECORD_AUDIO(ActionRecordAudioXML.class, R.drawable.ic_mic_black_24dp),
  RECORD_VIDEO(ActionRecordVideoXML.class, R.drawable.ic_videocam_black_24dp),

  SEND_REPORT(ActionSendReportXML.class, R.drawable.ic_check_black_24dp);

  private final Class<?> actionClass;
  private final int resId;

  private StepType(final Class<?> actionClass, final int resId)
  {
    this.actionClass = actionClass;
    this.resId = resId;
  }

  public Class<?> getActionXMLClass()
  {
    return actionClass;
  }

  public int getResId()
  {
    return resId;
  }

}
