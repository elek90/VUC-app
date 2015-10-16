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
public class ActionShowDescriptionXML extends CommonXML implements Serializable
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

  protected ActionShowDescriptionXML()
  {
    super();
    this.parentStep = 0L;
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionShowDescriptionXML create()
  {
    return new ActionShowDescriptionXML();
  }

  public static final ActionShowDescriptionXML BLANK = ActionShowDescriptionXML.create();
  @Override public ActionShowDescriptionXML getBlank() { return BLANK; }

  @Override public ActionShowDescriptionXML copy()
  {
    ActionShowDescriptionXML n = ActionShowDescriptionXML.create();
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
    return "ActionShowDescriptionXML" +
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
  public ActionShowDescriptionSQL asSQL()
  {
    ActionShowDescriptionSQL recordSQL = new ActionShowDescriptionSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionShowDescriptionXML query(final Long parentStep)
  {
    ActionShowDescriptionSQL recordSQL = ActionShowDescriptionSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowDescriptionXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionShowDescriptionSQL recordSQL = ActionShowDescriptionSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowDescriptionXML querySince(final Long parentStep, final Date since)
  {
    ActionShowDescriptionSQL recordSQL = ActionShowDescriptionSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowDescriptionXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionShowDescriptionSQL recordSQL = ActionShowDescriptionSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionShowDescriptionXML> queryAll(final Long parentStep)
  {
    List<ActionShowDescriptionSQL> recordListSQL = ActionShowDescriptionSQL.queryAll(parentStep);
    List<ActionShowDescriptionXML> recordListXML = new LinkedList<ActionShowDescriptionXML>();
    for (ActionShowDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionShowDescriptionXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionShowDescriptionSQL> recordListSQL = ActionShowDescriptionSQL.queryAllOrderBy(parentStep, order);
    List<ActionShowDescriptionXML> recordListXML = new LinkedList<ActionShowDescriptionXML>();
    for (ActionShowDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionShowDescriptionXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionShowDescriptionSQL> recordListSQL = ActionShowDescriptionSQL.queryAllSince(parentStep, since);
    List<ActionShowDescriptionXML> recordListXML = new LinkedList<ActionShowDescriptionXML>();
    for (ActionShowDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionShowDescriptionXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionShowDescriptionSQL> recordListSQL = ActionShowDescriptionSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionShowDescriptionXML> recordListXML = new LinkedList<ActionShowDescriptionXML>();
    for (ActionShowDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionShowDescriptionXML get(final Long id)
  {
    ActionShowDescriptionSQL recordSQL = ActionShowDescriptionSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowDescriptionXML get(final Long id, final Date since)
  {
    ActionShowDescriptionSQL recordSQL = ActionShowDescriptionSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
