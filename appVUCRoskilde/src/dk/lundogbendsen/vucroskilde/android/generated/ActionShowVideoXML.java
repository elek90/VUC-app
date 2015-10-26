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
public class ActionShowVideoXML extends CommonXML implements Serializable
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

  protected ActionShowVideoXML()
  {
    super();
    this.parentStep = 0L;
    this.videoRef = "";
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionShowVideoXML create()
  {
    return new ActionShowVideoXML();
  }

  public static final ActionShowVideoXML BLANK = ActionShowVideoXML.create();
  @Override public ActionShowVideoXML getBlank() { return BLANK; }

  @Override public ActionShowVideoXML copy()
  {
    ActionShowVideoXML n = ActionShowVideoXML.create();
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
    return "ActionShowVideoXML" +
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
  public ActionShowVideoSQL asSQL()
  {
    ActionShowVideoSQL recordSQL = new ActionShowVideoSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.videoRef = this.videoRef; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionShowVideoXML query(final Long parentStep)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowVideoXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowVideoXML querySince(final Long parentStep, final Date since)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowVideoXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionShowVideoXML> queryAll(final Long parentStep)
  {
    List<ActionShowVideoSQL> recordListSQL = ActionShowVideoSQL.queryAll(parentStep);
    List<ActionShowVideoXML> recordListXML = new LinkedList<ActionShowVideoXML>();
    for (ActionShowVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionShowVideoXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionShowVideoSQL> recordListSQL = ActionShowVideoSQL.queryAllOrderBy(parentStep, order);
    List<ActionShowVideoXML> recordListXML = new LinkedList<ActionShowVideoXML>();
    for (ActionShowVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionShowVideoXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionShowVideoSQL> recordListSQL = ActionShowVideoSQL.queryAllSince(parentStep, since);
    List<ActionShowVideoXML> recordListXML = new LinkedList<ActionShowVideoXML>();
    for (ActionShowVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionShowVideoXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionShowVideoSQL> recordListSQL = ActionShowVideoSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionShowVideoXML> recordListXML = new LinkedList<ActionShowVideoXML>();
    for (ActionShowVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionShowVideoXML get(final Long id)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowVideoXML get(final Long id, final Date since)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
