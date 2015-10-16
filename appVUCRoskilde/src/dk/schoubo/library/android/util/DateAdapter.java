package dk.schoubo.library.android.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter //extends XmlAdapter<String, Date>
{
  public static final String DATEFORMAT_YYYY_MM_DDTHH_MM_SS = "yyyy-MM-dd'T'HH:mm:ss";
  public static final DateFormat DATEFORMAT_XML = new SimpleDateFormat(DATEFORMAT_YYYY_MM_DDTHH_MM_SS);
  public static String xmlDate(final Date date) { return DATEFORMAT_XML.format(date); }
  public static Date xmlDate(final String date) { try { return DATEFORMAT_XML.parse(date); } catch (ParseException e) { return null; } }

  public static final String DATEFORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
  public static final DateFormat DATEFORMAT_HUMAN = new SimpleDateFormat(DATEFORMAT_YYYY_MM_DD_HH_MM_SS);
  public static String humanDate(final Date date) { return DATEFORMAT_HUMAN.format(date); }
  public static Date humanDate(final String date) { try { return DATEFORMAT_HUMAN.parse(date); } catch (ParseException e) { return null; } }

  public static final String DATEFORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
  public static final DateFormat DATEFORMAT_COMPACT = new SimpleDateFormat(DATEFORMAT_YYYYMMDDHHMMSS);
  public static String compactDate(final Date date) { return DATEFORMAT_COMPACT.format(date); }
  public static Date compactDate(final String date) { try { return DATEFORMAT_COMPACT.parse(date); } catch (ParseException e) { return null; } }

//  @Override
//  public Date unmarshal(final String date) throws Exception
//  {
//    return DATEFORMAT_XML.parse(date);
//  }
//
//  @Override
//  public String marshal(final Date date) throws Exception
//  {
//    return DATEFORMAT_XML.format(date);
//  }

}