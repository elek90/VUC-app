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
public class TemplateXML extends CommonXML implements Serializable
{
  @Element(required=false)
  String templateName = "";
  public String getTemplateName() { return templateName; }
  public void setTemplateName(final String templateName) { this.templateName = templateName; }

  @Element(required=false)
  String templateValue = "";
  public String getTemplateValue() { return templateValue; }
  public void setTemplateValue(final String templateValue) { this.templateValue = templateValue; }

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

  protected TemplateXML()
  {
    super();
    this.templateName = "";
    this.templateValue = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static TemplateXML create()
  {
    return new TemplateXML();
  }

  public TemplateXML(final String templateName)
   {
    this();
    this.templateName = templateName;
  }

  public static TemplateXML create(final String templateName)
  {
    return new TemplateXML(templateName);
  }

  public static final TemplateXML BLANK = TemplateXML.create();
  @Override public TemplateXML getBlank() { return BLANK; }

  @Override public TemplateXML copy()
  {
    TemplateXML n = TemplateXML.create();
    n.id = this.id;
    n.templateName = this.templateName;
    n.templateValue = this.templateValue;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "TemplateXML" +
      "[" +
        "id=" + id + ", " +
        "templateName=" + templateName + ", " +
        "templateValue=" + templateValue + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public TemplateSQL asSQL()
  {
    TemplateSQL recordSQL = new TemplateSQL();
    recordSQL.id = this.id; 
    recordSQL.templateName = this.templateName; 
    recordSQL.templateValue = this.templateValue; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static TemplateXML query(final String templateName)
  {
    TemplateSQL recordSQL = TemplateSQL.query(templateName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TemplateXML queryOrderBy(final String templateName, final String order)
  {
    TemplateSQL recordSQL = TemplateSQL.queryOrderBy(templateName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TemplateXML querySince(final String templateName, final Date since)
  {
    TemplateSQL recordSQL = TemplateSQL.querySince(templateName, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TemplateXML queryOrderBySince(final String templateName, final String order, final Date since)
  {
    TemplateSQL recordSQL = TemplateSQL.queryOrderBySince(templateName, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<TemplateXML> queryAll()
  {
    List<TemplateSQL> recordListSQL = TemplateSQL.queryAll();
    List<TemplateXML> recordListXML = new LinkedList<TemplateXML>();
    for (TemplateSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<TemplateXML> queryAllOrderBy(final String order)
  {
    List<TemplateSQL> recordListSQL = TemplateSQL.queryAllOrderBy(order);
    List<TemplateXML> recordListXML = new LinkedList<TemplateXML>();
    for (TemplateSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<TemplateXML> queryAllSince(final Date since)
  {
    List<TemplateSQL> recordListSQL = TemplateSQL.queryAllSince(since);
    List<TemplateXML> recordListXML = new LinkedList<TemplateXML>();
    for (TemplateSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<TemplateXML> queryAllOrderBySince(final String order, final Date since)
  {
    List<TemplateSQL> recordListSQL = TemplateSQL.queryAllOrderBySince(order, since);
    List<TemplateXML> recordListXML = new LinkedList<TemplateXML>();
    for (TemplateSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static TemplateXML get(final Long id)
  {
    TemplateSQL recordSQL = TemplateSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TemplateXML get(final Long id, final Date since)
  {
    TemplateSQL recordSQL = TemplateSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
