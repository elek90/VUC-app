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
public class ActionRecordAudioXML extends CommonXML implements Serializable
{
  @Element
  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final Long parentStep) { this.parentStep = parentStep; }

  @Element(required=false)
  String audioRef = "";
  public String getAudioRef() { return audioRef; }
  public void setAudioRef(final String audioRef) { this.audioRef = audioRef; }

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

  protected ActionRecordAudioXML()
  {
    super();
    this.parentStep = 0L;
    this.audioRef = "";
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionRecordAudioXML create()
  {
    return new ActionRecordAudioXML();
  }

  public static final ActionRecordAudioXML BLANK = ActionRecordAudioXML.create();
  @Override public ActionRecordAudioXML getBlank() { return BLANK; }

  @Override public ActionRecordAudioXML copy()
  {
    ActionRecordAudioXML n = ActionRecordAudioXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.audioRef = this.audioRef;
    n.description = this.description;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "ActionRecordAudioXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "audioRef=" + audioRef + ", " +
        "description=" + description + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionRecordAudioSQL asSQL()
  {
    ActionRecordAudioSQL recordSQL = new ActionRecordAudioSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.audioRef = this.audioRef; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionRecordAudioXML query(final Long parentStep)
  {
    ActionRecordAudioSQL recordSQL = ActionRecordAudioSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordAudioXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionRecordAudioSQL recordSQL = ActionRecordAudioSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordAudioXML querySince(final Long parentStep, final Date since)
  {
    ActionRecordAudioSQL recordSQL = ActionRecordAudioSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordAudioXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionRecordAudioSQL recordSQL = ActionRecordAudioSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionRecordAudioXML> queryAll(final Long parentStep)
  {
    List<ActionRecordAudioSQL> recordListSQL = ActionRecordAudioSQL.queryAll(parentStep);
    List<ActionRecordAudioXML> recordListXML = new LinkedList<ActionRecordAudioXML>();
    for (ActionRecordAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionRecordAudioXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionRecordAudioSQL> recordListSQL = ActionRecordAudioSQL.queryAllOrderBy(parentStep, order);
    List<ActionRecordAudioXML> recordListXML = new LinkedList<ActionRecordAudioXML>();
    for (ActionRecordAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionRecordAudioXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionRecordAudioSQL> recordListSQL = ActionRecordAudioSQL.queryAllSince(parentStep, since);
    List<ActionRecordAudioXML> recordListXML = new LinkedList<ActionRecordAudioXML>();
    for (ActionRecordAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionRecordAudioXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionRecordAudioSQL> recordListSQL = ActionRecordAudioSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionRecordAudioXML> recordListXML = new LinkedList<ActionRecordAudioXML>();
    for (ActionRecordAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionRecordAudioXML get(final Long id)
  {
    ActionRecordAudioSQL recordSQL = ActionRecordAudioSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordAudioXML get(final Long id, final Date since)
  {
    ActionRecordAudioSQL recordSQL = ActionRecordAudioSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
