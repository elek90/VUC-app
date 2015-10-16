/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Jan Schoubo, schoubo reasoning
 */



package dk.schoubo.library.android.generated;

import dk.schoubo.library.android.CommonXML;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import org.simpleframework.xml.*;


@Root
public class ParameterXML extends CommonXML implements Serializable
{
  @Element(required=false)
  String parameterName = "";
  public String getParameterName() { return parameterName; }
  public void setParameterName(final String parameterName) { this.parameterName = parameterName; }

  @Element(required=false)
  String parameterValue = "";
  public String getParameterValue() { return parameterValue; }
  public void setParameterValue(final String parameterValue) { this.parameterValue = parameterValue; }

  @Element
  Boolean serverAccessOnly;
  public Boolean isServerAccessOnly() { return serverAccessOnly; }
  public void setServerAccessOnly(final Boolean serverAccessOnly) { this.serverAccessOnly = serverAccessOnly; }

  @Element
  Date timestamp;
  public Date getTimestamp() { return timestamp; }
  public void setTimestamp(final Date timestamp) { this.timestamp = timestamp; }

  @Element
  Date changestamp;
  public Date getChangestamp() { return changestamp; }
  public void setChangestamp(final Date changestamp) { this.changestamp = changestamp; }

  @Element
  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }
  public void setDeletestamp(final Boolean deletestamp) { this.deletestamp = deletestamp; }

  protected ParameterXML()
  {
    super();
    this.parameterName = "";
    this.parameterValue = "";
    this.serverAccessOnly = false;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ParameterXML create()
  {
    return new ParameterXML();
  }

  public ParameterXML(final String parameterName)
   {
    this();
    this.parameterName = parameterName;
  }

  public static ParameterXML create(final String parameterName)
  {
    return new ParameterXML(parameterName);
  }

  public static final ParameterXML BLANK = ParameterXML.create();
  @Override public ParameterXML getBlank() { return BLANK; }

  @Override public ParameterXML copy()
  {
    ParameterXML n = ParameterXML.create();
    n.id = this.id;
    n.parameterName = this.parameterName;
    n.parameterValue = this.parameterValue;
    n.serverAccessOnly = this.serverAccessOnly;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "ParameterXML" +
      "[" +
        "id=" + id + ", " +
        "parameterName=" + parameterName + ", " +
        "parameterValue=" + parameterValue + ", " +
        "serverAccessOnly=" + serverAccessOnly + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ParameterSQL asSQL()
  {
    ParameterSQL recordSQL = new ParameterSQL();
    recordSQL.id = this.id; 
    recordSQL.parameterName = this.parameterName; 
    recordSQL.parameterValue = this.parameterValue; 
    recordSQL.serverAccessOnly = this.serverAccessOnly; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ParameterXML query(final String parameterName)
  {
    ParameterSQL recordSQL = ParameterSQL.query(parameterName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ParameterXML queryOrderBy(final String parameterName, final String order)
  {
    ParameterSQL recordSQL = ParameterSQL.queryOrderBy(parameterName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ParameterXML querySince(final String parameterName, final Date since)
  {
    ParameterSQL recordSQL = ParameterSQL.querySince(parameterName, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ParameterXML queryOrderBySince(final String parameterName, final String order, final Date since)
  {
    ParameterSQL recordSQL = ParameterSQL.queryOrderBySince(parameterName, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ParameterXML> queryAll()
  {
    List<ParameterSQL> recordListSQL = ParameterSQL.queryAll();
    List<ParameterXML> recordListXML = new LinkedList<ParameterXML>();
    for (ParameterSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ParameterXML> queryAllOrderBy(final String order)
  {
    List<ParameterSQL> recordListSQL = ParameterSQL.queryAllOrderBy(order);
    List<ParameterXML> recordListXML = new LinkedList<ParameterXML>();
    for (ParameterSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ParameterXML> queryAllSince(final Date since)
  {
    List<ParameterSQL> recordListSQL = ParameterSQL.queryAllSince(since);
    List<ParameterXML> recordListXML = new LinkedList<ParameterXML>();
    for (ParameterSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ParameterXML> queryAllOrderBySince(final String order, final Date since)
  {
    List<ParameterSQL> recordListSQL = ParameterSQL.queryAllOrderBySince(order, since);
    List<ParameterXML> recordListXML = new LinkedList<ParameterXML>();
    for (ParameterSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ParameterXML get(final Long id)
  {
    ParameterSQL recordSQL = ParameterSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ParameterXML get(final Long id, final Date since)
  {
    ParameterSQL recordSQL = ParameterSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
