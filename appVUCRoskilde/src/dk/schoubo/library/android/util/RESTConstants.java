package dk.schoubo.library.android.util;

public class RESTConstants
{
  public static final String CHARSET = "; charset=UTF-8";


  public static final String APPLICATION_JSONP = "application/x-javascript";
  public static final String APPLICATION_XML = "application/xml";
  public static final String APPLICATION_JSON = "application/json";
  public static final String TEXT_XML = "text/xml";
  public static final String TEXT_HTML = "text/html";
  public static final String IMAGE_PNG = "image/png";
  public static final String IMAGE_JPEG = "image/jpeg";
  public static final String IMAGE_BMP = "image/bmp";
  public static final String APPLICATION_PDF = "application/pdf";
  public static final String TEXT_CSV = "text/csv";
  public static final String APPLICATION_ZIP = "application/zip";

  public static final String APPLICATION_JSONP_UTF8 = APPLICATION_JSONP + CHARSET;
  public static final String APPLICATION_XML_UTF8 = APPLICATION_XML + CHARSET;
  public static final String APPLICATION_JSON_UTF8 = APPLICATION_JSON  + CHARSET;
  public static final String TEXT_XML_UTF8 = TEXT_XML  + CHARSET;


  public static final String JSONPARAMETER_CALLBACK = "callback";

  public static final String DEFAULT_HOSTANDPORT = "http://10.0.2.2:8888"; // Not "localhost" when running in emulator

}
