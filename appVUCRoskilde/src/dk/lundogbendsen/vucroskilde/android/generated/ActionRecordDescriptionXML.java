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
public class ActionRecordDescriptionXML extends CommonXML implements Serializable
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

  protected ActionRecordDescriptionXML()
  {
    super();
    this.parentStep = 0L;
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionRecordDescriptionXML create()
  {
    return new ActionRecordDescriptionXML();
  }

  public static final ActionRecordDescriptionXML BLANK = ActionRecordDescriptionXML.create();
  @Override public ActionRecordDescriptionXML getBlank() { return BLANK; }

  @Override public ActionRecordDescriptionXML copy()
  {
    ActionRecordDescriptionXML n = ActionRecordDescriptionXML.create();
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
    return "ActionRecordDescriptionXML" +
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
  public ActionRecordDescriptionSQL asSQL()
  {
    ActionRecordDescriptionSQL recordSQL = new ActionRecordDescriptionSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionRecordDescriptionXML query(final Long parentStep)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordDescriptionXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordDescriptionXML querySince(final Long parentStep, final Date since)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordDescriptionXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionRecordDescriptionXML> queryAll(final Long parentStep)
  {
    List<ActionRecordDescriptionSQL> recordListSQL = ActionRecordDescriptionSQL.queryAll(parentStep);
    List<ActionRecordDescriptionXML> recordListXML = new LinkedList<ActionRecordDescriptionXML>();
    for (ActionRecordDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionRecordDescriptionXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionRecordDescriptionSQL> recordListSQL = ActionRecordDescriptionSQL.queryAllOrderBy(parentStep, order);
    List<ActionRecordDescriptionXML> recordListXML = new LinkedList<ActionRecordDescriptionXML>();
    for (ActionRecordDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionRecordDescriptionXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionRecordDescriptionSQL> recordListSQL = ActionRecordDescriptionSQL.queryAllSince(parentStep, since);
    List<ActionRecordDescriptionXML> recordListXML = new LinkedList<ActionRecordDescriptionXML>();
    for (ActionRecordDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionRecordDescriptionXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionRecordDescriptionSQL> recordListSQL = ActionRecordDescriptionSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionRecordDescriptionXML> recordListXML = new LinkedList<ActionRecordDescriptionXML>();
    for (ActionRecordDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionRecordDescriptionXML get(final Long id)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordDescriptionXML get(final Long id, final Date since)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
