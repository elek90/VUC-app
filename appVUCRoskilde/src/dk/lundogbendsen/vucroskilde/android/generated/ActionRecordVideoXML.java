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
public class ActionRecordVideoXML extends CommonXML implements Serializable
{
  @Element
  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final Long parentStep) { this.parentStep = parentStep; }

  @Element(required=false)
  String videoRef = "";
  public String getVideoRef() { return videoRef; }
  public void setVideoRef(final String videoRef) { this.videoRef = videoRef; }

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

  protected ActionRecordVideoXML()
  {
    super();
    this.parentStep = 0L;
    this.videoRef = "";
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionRecordVideoXML create()
  {
    return new ActionRecordVideoXML();
  }

  public static final ActionRecordVideoXML BLANK = ActionRecordVideoXML.create();
  @Override public ActionRecordVideoXML getBlank() { return BLANK; }

  @Override public ActionRecordVideoXML copy()
  {
    ActionRecordVideoXML n = ActionRecordVideoXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.videoRef = this.videoRef;
    n.description = this.description;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "ActionRecordVideoXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "videoRef=" + videoRef + ", " +
        "description=" + description + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionRecordVideoSQL asSQL()
  {
    ActionRecordVideoSQL recordSQL = new ActionRecordVideoSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.videoRef = this.videoRef; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionRecordVideoXML query(final Long parentStep)
  {
    ActionRecordVideoSQL recordSQL = ActionRecordVideoSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordVideoXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionRecordVideoSQL recordSQL = ActionRecordVideoSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordVideoXML querySince(final Long parentStep, final Date since)
  {
    ActionRecordVideoSQL recordSQL = ActionRecordVideoSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordVideoXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionRecordVideoSQL recordSQL = ActionRecordVideoSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionRecordVideoXML> queryAll(final Long parentStep)
  {
    List<ActionRecordVideoSQL> recordListSQL = ActionRecordVideoSQL.queryAll(parentStep);
    List<ActionRecordVideoXML> recordListXML = new LinkedList<ActionRecordVideoXML>();
    for (ActionRecordVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionRecordVideoXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionRecordVideoSQL> recordListSQL = ActionRecordVideoSQL.queryAllOrderBy(parentStep, order);
    List<ActionRecordVideoXML> recordListXML = new LinkedList<ActionRecordVideoXML>();
    for (ActionRecordVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionRecordVideoXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionRecordVideoSQL> recordListSQL = ActionRecordVideoSQL.queryAllSince(parentStep, since);
    List<ActionRecordVideoXML> recordListXML = new LinkedList<ActionRecordVideoXML>();
    for (ActionRecordVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionRecordVideoXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionRecordVideoSQL> recordListSQL = ActionRecordVideoSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionRecordVideoXML> recordListXML = new LinkedList<ActionRecordVideoXML>();
    for (ActionRecordVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionRecordVideoXML get(final Long id)
  {
    ActionRecordVideoSQL recordSQL = ActionRecordVideoSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordVideoXML get(final Long id, final Date since)
  {
    ActionRecordVideoSQL recordSQL = ActionRecordVideoSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
