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
public class ActionSendReportXML extends CommonXML implements Serializable
{
  @Element
  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final Long parentStep) { this.parentStep = parentStep; }

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

  protected ActionSendReportXML()
  {
    super();
    this.parentStep = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionSendReportXML create()
  {
    return new ActionSendReportXML();
  }

  public static final ActionSendReportXML BLANK = ActionSendReportXML.create();
  @Override public ActionSendReportXML getBlank() { return BLANK; }

  @Override public ActionSendReportXML copy()
  {
    ActionSendReportXML n = ActionSendReportXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "ActionSendReportXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionSendReportSQL asSQL()
  {
    ActionSendReportSQL recordSQL = new ActionSendReportSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionSendReportXML query(final Long parentStep)
  {
    ActionSendReportSQL recordSQL = ActionSendReportSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionSendReportXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionSendReportSQL recordSQL = ActionSendReportSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionSendReportXML querySince(final Long parentStep, final Date since)
  {
    ActionSendReportSQL recordSQL = ActionSendReportSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionSendReportXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionSendReportSQL recordSQL = ActionSendReportSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionSendReportXML> queryAll(final Long parentStep)
  {
    List<ActionSendReportSQL> recordListSQL = ActionSendReportSQL.queryAll(parentStep);
    List<ActionSendReportXML> recordListXML = new LinkedList<ActionSendReportXML>();
    for (ActionSendReportSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionSendReportXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionSendReportSQL> recordListSQL = ActionSendReportSQL.queryAllOrderBy(parentStep, order);
    List<ActionSendReportXML> recordListXML = new LinkedList<ActionSendReportXML>();
    for (ActionSendReportSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionSendReportXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionSendReportSQL> recordListSQL = ActionSendReportSQL.queryAllSince(parentStep, since);
    List<ActionSendReportXML> recordListXML = new LinkedList<ActionSendReportXML>();
    for (ActionSendReportSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionSendReportXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionSendReportSQL> recordListSQL = ActionSendReportSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionSendReportXML> recordListXML = new LinkedList<ActionSendReportXML>();
    for (ActionSendReportSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionSendReportXML get(final Long id)
  {
    ActionSendReportSQL recordSQL = ActionSendReportSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionSendReportXML get(final Long id, final Date since)
  {
    ActionSendReportSQL recordSQL = ActionSendReportSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
