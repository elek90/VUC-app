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
public class ActionShowTextXML extends CommonXML implements Serializable
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

  protected ActionShowTextXML()
  {
    super();
    this.parentStep = 0L;
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionShowTextXML create()
  {
    return new ActionShowTextXML();
  }

  public static final ActionShowTextXML BLANK = ActionShowTextXML.create();
  @Override public ActionShowTextXML getBlank() { return BLANK; }

  @Override public ActionShowTextXML copy()
  {
    ActionShowTextXML n = ActionShowTextXML.create();
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
    return "ActionShowTextXML" +
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
  public ActionShowTextSQL asSQL()
  {
    ActionShowTextSQL recordSQL = new ActionShowTextSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionShowTextXML query(final Long parentStep)
  {
    ActionShowTextSQL recordSQL = ActionShowTextSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowTextXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionShowTextSQL recordSQL = ActionShowTextSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowTextXML querySince(final Long parentStep, final Date since)
  {
    ActionShowTextSQL recordSQL = ActionShowTextSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowTextXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionShowTextSQL recordSQL = ActionShowTextSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionShowTextXML> queryAll(final Long parentStep)
  {
    List<ActionShowTextSQL> recordListSQL = ActionShowTextSQL.queryAll(parentStep);
    List<ActionShowTextXML> recordListXML = new LinkedList<ActionShowTextXML>();
    for (ActionShowTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionShowTextXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionShowTextSQL> recordListSQL = ActionShowTextSQL.queryAllOrderBy(parentStep, order);
    List<ActionShowTextXML> recordListXML = new LinkedList<ActionShowTextXML>();
    for (ActionShowTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionShowTextXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionShowTextSQL> recordListSQL = ActionShowTextSQL.queryAllSince(parentStep, since);
    List<ActionShowTextXML> recordListXML = new LinkedList<ActionShowTextXML>();
    for (ActionShowTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionShowTextXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionShowTextSQL> recordListSQL = ActionShowTextSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionShowTextXML> recordListXML = new LinkedList<ActionShowTextXML>();
    for (ActionShowTextSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionShowTextXML get(final Long id)
  {
    ActionShowTextSQL recordSQL = ActionShowTextSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowTextXML get(final Long id, final Date since)
  {
    ActionShowTextSQL recordSQL = ActionShowTextSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
