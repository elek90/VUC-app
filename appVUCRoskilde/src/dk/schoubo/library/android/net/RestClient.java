package dk.schoubo.library.android.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;


/* From Lukencode.com
 * https://github.com/lukencode/lukencode.github.com/blob/master/_posts/2010-04-27-calling-web-services-in-android-using-httpclient.md
 *
 */
public class RestClient
{
  private final ArrayList <NameValuePair> params;
  private final ArrayList <NameValuePair> headers;

  private final String url;

  private int responseCode;
  public int getResponseCode() { return responseCode; }

  private String message;
  public String getErrorMessage() { return message; }

  private String response;
  public String getResponse() { return response; }

  @SuppressWarnings("unused")
  private String entityMimeType;
  private AbstractHttpEntity entity;

  public RestClient(final String url)
  {
    this.url = url;
    params = new ArrayList<NameValuePair>();
    headers = new ArrayList<NameValuePair>();
  }

  public void addParam(final String name, final String value)
  {
    params.add(new BasicNameValuePair(name, value));
  }

  public void addHeader(final String name, final String value)
  {
    headers.add(new BasicNameValuePair(name, value));
  }

  public void addEntity(final String entityMimeType, final AbstractHttpEntity entity)
  {
    this.entityMimeType = entityMimeType;
    this.entity = entity;
    this.entity.setContentType(entityMimeType);
  }


  public void Execute(final RequestMethod method) throws Exception
  {
    switch(method)
    {
      case GET:
      {
        String combinedParams = combine(params);

        HttpGet request = new HttpGet(url + combinedParams);

        for (NameValuePair h : headers)
        {
          request.addHeader(h.getName(), h.getValue());
        }

        executeRequest(request, url);
        break;
      }
      case POST:
      {
        HttpPost request;

        if (entity == null)
        {
          request = new HttpPost(url);
          if (!params.isEmpty())
          {
            request.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
          }
        }
        else
        {
          String combinedParams = combine(params);

          request = new HttpPost(url + combinedParams);

          request.setEntity(entity);
        }

        for (NameValuePair h : headers)
        {
          request.addHeader(h.getName(), h.getValue());
        }

        executeRequest(request, url);
        break;
      }
    }
  }

  private String combine(final ArrayList<NameValuePair> params2) throws UnsupportedEncodingException
  {
    String combinedParams = "";
    if (!params.isEmpty())
    {
      combinedParams += "?";
      for (NameValuePair p : params)
      {
        String paramString = p.getName() + "=" + URLEncoder.encode(p.getValue(), "UTF-8");
        if (combinedParams.length() > 1)
        {
          combinedParams  +=  "&" + paramString;
        }
        else
        {
          combinedParams += paramString;
        }
      }
    }
    return combinedParams;
  }

  private void executeRequest(final HttpUriRequest request, final String url)
  {
    HttpClient client = new DefaultHttpClient();

    HttpResponse httpResponse;

    try
    {
      httpResponse = client.execute(request);
      responseCode = httpResponse.getStatusLine().getStatusCode();
      message = httpResponse.getStatusLine().getReasonPhrase();

      HttpEntity entity = httpResponse.getEntity();

      if (entity != null)
      {
        InputStream instream = entity.getContent();
        response = convertStreamToString(instream);

        // Closing the input stream will trigger connection release
        instream.close();
      }

    }
    catch (ClientProtocolException e)
    {
      client.getConnectionManager().shutdown();
      e.printStackTrace();
    }
    catch (IOException e)
    {
      client.getConnectionManager().shutdown();
      e.printStackTrace();
    }
  }

  private static String convertStreamToString(final InputStream is)
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    StringBuilder sb = new StringBuilder();

    String line = null;
    try
    {
      while ((line = reader.readLine()) != null)
      {
        sb.append(line + "\n");
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        is.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    return sb.toString();
  }

}