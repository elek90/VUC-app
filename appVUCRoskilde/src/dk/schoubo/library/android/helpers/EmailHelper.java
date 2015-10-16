package dk.schoubo.library.android.helpers;

import java.util.Collection;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public abstract class EmailHelper
{
  public static void send(final Context context, final Collection<String> addresses, final String subject, final String message)
  {
    send(context, addresses, subject, message, null);
  }

  public static void send(final Context context, final Collection<String> addresses, final String subject, final String message, final Uri attachmentUri)
  {
    Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
    emailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    emailIntent.setType("text/html");
//    emailIntent.setType("message/rfc822");
    String[] addr = addresses.toArray(new String[addresses.size()]);
    emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, addr);
    emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
    emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);

    if (attachmentUri != null)
    {
      emailIntent.putExtra(android.content.Intent.EXTRA_STREAM, attachmentUri);
    }

    context.startActivity(Intent.createChooser(emailIntent, subject + "..."));
  }
}

