package dk.schoubo.library.android.helpers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
    String[] addr = addresses.toArray(new String[addresses.size()]);
    send(context, addr, subject, message, attachmentUri);
  }

  public static void send(final Context context, final String[] addresses, final String subject, final String message, final Uri attachmentUri)
  {
    Intent emailIntent = new Intent(Intent.ACTION_SEND);
    emailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    emailIntent.setType("text/html");
    // emailIntent.setType("message/rfc822");
    emailIntent.putExtra(Intent.EXTRA_EMAIL, addresses);
    emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
    emailIntent.putExtra(Intent.EXTRA_TEXT, message);

    if (attachmentUri != null)
    {
      emailIntent.putExtra(Intent.EXTRA_STREAM, attachmentUri);
    }

    context.startActivity(Intent.createChooser(emailIntent, subject + "..."));
  }

  public static void send(final Context context, final String[] addresses, final String subject, final String message, final List<String> filePaths)
  {
    Intent emailIntent = new Intent(Intent.ACTION_SEND_MULTIPLE);
    emailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    emailIntent.setType("text/html");
    // emailIntent.setType("message/rfc822");
    emailIntent.putExtra(Intent.EXTRA_EMAIL, addresses);
    emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
    emailIntent.putExtra(Intent.EXTRA_TEXT, message);

    ArrayList<Uri> uris = new ArrayList<Uri>();
    for (String file : filePaths)
    {
      File fileIn = new File(file);
      Uri u = Uri.fromFile(fileIn);
      uris.add(u);
    }
    emailIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, uris);

    context.startActivity(Intent.createChooser(emailIntent, subject + "..."));
  }
}
