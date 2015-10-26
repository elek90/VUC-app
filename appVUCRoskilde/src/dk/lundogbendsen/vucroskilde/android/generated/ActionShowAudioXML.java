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
public class ActionShowAudioXML extends CommonXML implements Serializable
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

  protected ActionShowAudioXML()
  {
    super();
    this.parentStep = 0L;
    this.audioRef = "";
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionShowAudioXML create()
  {
    return new ActionShowAudioXML();
  }

  public static final ActionShowAudioXML BLANK = ActionShowAudioXML.create();
  @Override public ActionShowAudioXML getBlank() { return BLANK; }

  @Override public ActionShowAudioXML copy()
  {
    ActionShowAudioXML n = ActionShowAudioXML.create();
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
    return "ActionShowAudioXML" +
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
  public ActionShowAudioSQL asSQL()
  {
    ActionShowAudioSQL recordSQL = new ActionShowAudioSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.audioRef = this.audioRef; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionShowAudioXML query(final Long parentStep)
  {
    ActionShowAudioSQL recordSQL = ActionShowAudioSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowAudioXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionShowAudioSQL recordSQL = ActionShowAudioSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowAudioXML querySince(final Long parentStep, final Date since)
  {
    ActionShowAudioSQL recordSQL = ActionShowAudioSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowAudioXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionShowAudioSQL recordSQL = ActionShowAudioSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionShowAudioXML> queryAll(final Long parentStep)
  {
    List<ActionShowAudioSQL> recordListSQL = ActionShowAudioSQL.queryAll(parentStep);
    List<ActionShowAudioXML> recordListXML = new LinkedList<ActionShowAudioXML>();
    for (ActionShowAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionShowAudioXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionShowAudioSQL> recordListSQL = ActionShowAudioSQL.queryAllOrderBy(parentStep, order);
    List<ActionShowAudioXML> recordListXML = new LinkedList<ActionShowAudioXML>();
    for (ActionShowAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionShowAudioXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionShowAudioSQL> recordListSQL = ActionShowAudioSQL.queryAllSince(parentStep, since);
    List<ActionShowAudioXML> recordListXML = new LinkedList<ActionShowAudioXML>();
    for (ActionShowAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionShowAudioXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionShowAudioSQL> recordListSQL = ActionShowAudioSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionShowAudioXML> recordListXML = new LinkedList<ActionShowAudioXML>();
    for (ActionShowAudioSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionShowAudioXML get(final Long id)
  {
    ActionShowAudioSQL recordSQL = ActionShowAudioSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowAudioXML get(final Long id, final Date since)
  {
    ActionShowAudioSQL recordSQL = ActionShowAudioSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
