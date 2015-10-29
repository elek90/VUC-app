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
public class ActionRecordImageXML extends CommonXML implements Serializable
{
  @Element
  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final Long parentStep) { this.parentStep = parentStep; }

  @Element
  MediaRefXML imageRef;
  public MediaRefXML getImageRef() { return imageRef; }
  public void setImageRef(final MediaRefXML imageRef) { this.imageRef = imageRef; }

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

  protected ActionRecordImageXML()
  {
    super();
    this.parentStep = 0L;
    this.imageRef = new MediaRefXML();
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionRecordImageXML create()
  {
    return new ActionRecordImageXML();
  }

  public static final ActionRecordImageXML BLANK = ActionRecordImageXML.create();
  @Override public ActionRecordImageXML getBlank() { return BLANK; }

  @Override public ActionRecordImageXML copy()
  {
    ActionRecordImageXML n = ActionRecordImageXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.imageRef.placementType = this.imageRef.placementType;
    n.imageRef.placementPath = this.imageRef.placementPath;
    n.description = this.description;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "ActionRecordImageXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "imageRef=" + imageRef + ", " +
        "description=" + description + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionRecordImageSQL asSQL()
  {
    ActionRecordImageSQL recordSQL = new ActionRecordImageSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.imageRef.placementType = this.imageRef.placementType; 
    recordSQL.imageRef.placementPath = this.imageRef.placementPath; 
    recordSQL.description = this.description; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionRecordImageXML query(final Long parentStep)
  {
    ActionRecordImageSQL recordSQL = ActionRecordImageSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordImageXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionRecordImageSQL recordSQL = ActionRecordImageSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordImageXML querySince(final Long parentStep, final Date since)
  {
    ActionRecordImageSQL recordSQL = ActionRecordImageSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordImageXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionRecordImageSQL recordSQL = ActionRecordImageSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionRecordImageXML> queryAll(final Long parentStep)
  {
    List<ActionRecordImageSQL> recordListSQL = ActionRecordImageSQL.queryAll(parentStep);
    List<ActionRecordImageXML> recordListXML = new LinkedList<ActionRecordImageXML>();
    for (ActionRecordImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionRecordImageXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionRecordImageSQL> recordListSQL = ActionRecordImageSQL.queryAllOrderBy(parentStep, order);
    List<ActionRecordImageXML> recordListXML = new LinkedList<ActionRecordImageXML>();
    for (ActionRecordImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionRecordImageXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionRecordImageSQL> recordListSQL = ActionRecordImageSQL.queryAllSince(parentStep, since);
    List<ActionRecordImageXML> recordListXML = new LinkedList<ActionRecordImageXML>();
    for (ActionRecordImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionRecordImageXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionRecordImageSQL> recordListSQL = ActionRecordImageSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionRecordImageXML> recordListXML = new LinkedList<ActionRecordImageXML>();
    for (ActionRecordImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionRecordImageXML get(final Long id)
  {
    ActionRecordImageSQL recordSQL = ActionRecordImageSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordImageXML get(final Long id, final Date since)
  {
    ActionRecordImageSQL recordSQL = ActionRecordImageSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
