package dk.lundogbendsen.vucroskilde.android.util;

import java.util.Date;

import android.text.format.DateFormat;

public class Util
{
  public static CharSequence dateFormat(final Date date)
  {
    return DateFormat.format("yyyy-MM-dd HH:mm", date);
  }
}
