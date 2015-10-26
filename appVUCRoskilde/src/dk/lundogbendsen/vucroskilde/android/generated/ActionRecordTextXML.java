/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.schoubo.library.android.CommonXML;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import org.simpleframework.xml.*;


@Root
public class ActionRecordTextXML extends CommonXML implements Serializable
{
  @Element
  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final Long parentStep) { this.parentStep = parentStep; }

  @Element(required=false)
  String description = "";
  public String getDescription() { return description; }
  public void setDescription(final String description) { this.description = description; }

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

  protected ActionRecordTextXML()
  {
    super();
    this.parentStep = 0L;
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionRecordTextXML create()
  {
    return new ActionRecordTextXML();
  }

  public static final ActionRecordTextXML BLANK = ActionRecordTextXML.create();
  @Override public ActionRecordTextXML getBlank() { return BLANK; }

  @Override public ActionRecordTextXML copy()
  {
    ActionRecordTextXML n = ActionRecordTextXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.description = this.description;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "ActionRecordTextXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "description=" + description + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionRecordTextSQL asSQL()
  {
    ActionRecordTextSQL recordSQL = new ActionRecordTextSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionRecordTextXML query(final Long parentStep)
  {
    ActionRecordTextSQL recordSQL = ActionRecordTextSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordTextXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionRecordTextSQL recordSQL = ActionRecordTextSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordTextXML querySince(final Long parentStep, final Date since)
  {
    ActionRecordTextSQL recordSQL = ActionRecordTextSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordTextXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionRecordTextSQL recordSQL = ActionRecordTextSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionRecordTextXML> queryAll(final Long parentStep)
  {
    List<ActionRecordTextSQL> recordListSQL = ActionRecordTextSQL.queryAll(parentStep);
    List<ActionRecordTextXML> recordListXML = new LinkedList<ActionRecordTextXML>();
    for (ActionRecordTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionRecordTextXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionRecordTextSQL> recordListSQL = ActionRecordTextSQL.queryAllOrderBy(parentStep, order);
    List<ActionRecordTextXML> recordListXML = new LinkedList<ActionRecordTextXML>();
    for (ActionRecordTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionRecordTextXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionRecordTextSQL> recordListSQL = ActionRecordTextSQL.queryAllSince(parentStep, since);
    List<ActionRecordTextXML> recordListXML = new LinkedList<ActionRecordTextXML>();
    for (ActionRecordTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionRecordTextXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionRecordTextSQL> recordListSQL = ActionRecordTextSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionRecordTextXML> recordListXML = new LinkedList<ActionRecordTextXML>();
    for (ActionRecordTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionRecordTextXML get(final Long id)
  {
    ActionRecordTextSQL recordSQL = ActionRecordTextSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordTextXML get(final Long id, final Date since)
  {
    ActionRecordTextSQL recordSQL = ActionRecordTextSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
