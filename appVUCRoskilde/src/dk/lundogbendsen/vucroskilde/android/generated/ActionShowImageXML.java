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
public class ActionShowImageXML extends CommonXML implements Serializable
{
  @Element
  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final Long parentStep) { this.parentStep = parentStep; }

  @Element(required=false)
  String imageRef = "";
  public String getImageRef() { return imageRef; }
  public void setImageRef(final String imageRef) { this.imageRef = imageRef; }

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

  protected ActionShowImageXML()
  {
    super();
    this.parentStep = 0L;
    this.imageRef = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionShowImageXML create()
  {
    return new ActionShowImageXML();
  }

  public static final ActionShowImageXML BLANK = ActionShowImageXML.create();
  @Override public ActionShowImageXML getBlank() { return BLANK; }

  @Override public ActionShowImageXML copy()
  {
    ActionShowImageXML n = ActionShowImageXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.imageRef = this.imageRef;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "ActionShowImageXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "imageRef=" + imageRef + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionShowImageSQL asSQL()
  {
    ActionShowImageSQL recordSQL = new ActionShowImageSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.imageRef = this.imageRef; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ActionShowImageXML query(final Long parentStep)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowImageXML queryOrderBy(final Long parentStep, final String order)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowImageXML querySince(final Long parentStep, final Date since)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowImageXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ActionShowImageXML> queryAll(final Long parentStep)
  {
    List<ActionShowImageSQL> recordListSQL = ActionShowImageSQL.queryAll(parentStep);
    List<ActionShowImageXML> recordListXML = new LinkedList<ActionShowImageXML>();
    for (ActionShowImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<ActionShowImageXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<ActionShowImageSQL> recordListSQL = ActionShowImageSQL.queryAllOrderBy(parentStep, order);
    List<ActionShowImageXML> recordListXML = new LinkedList<ActionShowImageXML>();
    for (ActionShowImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<ActionShowImageXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<ActionShowImageSQL> recordListSQL = ActionShowImageSQL.queryAllSince(parentStep, since);
    List<ActionShowImageXML> recordListXML = new LinkedList<ActionShowImageXML>();
    for (ActionShowImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<ActionShowImageXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionShowImageSQL> recordListSQL = ActionShowImageSQL.queryAllOrderBySince(parentStep, order, since);
    List<ActionShowImageXML> recordListXML = new LinkedList<ActionShowImageXML>();
    for (ActionShowImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static ActionShowImageXML get(final Long id)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowImageXML get(final Long id, final Date since)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
