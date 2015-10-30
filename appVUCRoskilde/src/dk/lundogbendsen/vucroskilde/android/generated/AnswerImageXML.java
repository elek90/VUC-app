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
public class AnswerImageXML extends CommonXML implements Serializable
{
  @Element
  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final Long parentStep) { this.parentStep = parentStep; }

  @Element(required=false)
  String description = "";
  public String getDescription() { return description; }
  public void setDescription(final String description) { this.description = description; }

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

  protected AnswerImageXML()
  {
    super();
    this.parentStep = 0L;
    this.description = "";
    this.imageRef = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static AnswerImageXML create()
  {
    return new AnswerImageXML();
  }

  public static final AnswerImageXML BLANK = AnswerImageXML.create();
  @Override public AnswerImageXML getBlank() { return BLANK; }

  @Override public AnswerImageXML copy()
  {
    AnswerImageXML n = AnswerImageXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.description = this.description;
    n.imageRef = this.imageRef;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "AnswerImageXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "description=" + description + ", " +
        "imageRef=" + imageRef + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public AnswerImageSQL asSQL()
  {
    AnswerImageSQL recordSQL = new AnswerImageSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.description = this.description; 
    recordSQL.imageRef = this.imageRef; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static AnswerImageXML query(final Long parentStep)
  {
    AnswerImageSQL recordSQL = AnswerImageSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerImageXML queryOrderBy(final Long parentStep, final String order)
  {
    AnswerImageSQL recordSQL = AnswerImageSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerImageXML querySince(final Long parentStep, final Date since)
  {
    AnswerImageSQL recordSQL = AnswerImageSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerImageXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    AnswerImageSQL recordSQL = AnswerImageSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<AnswerImageXML> queryAll(final Long parentStep)
  {
    List<AnswerImageSQL> recordListSQL = AnswerImageSQL.queryAll(parentStep);
    List<AnswerImageXML> recordListXML = new LinkedList<AnswerImageXML>();
    for (AnswerImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<AnswerImageXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<AnswerImageSQL> recordListSQL = AnswerImageSQL.queryAllOrderBy(parentStep, order);
    List<AnswerImageXML> recordListXML = new LinkedList<AnswerImageXML>();
    for (AnswerImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<AnswerImageXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<AnswerImageSQL> recordListSQL = AnswerImageSQL.queryAllSince(parentStep, since);
    List<AnswerImageXML> recordListXML = new LinkedList<AnswerImageXML>();
    for (AnswerImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<AnswerImageXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<AnswerImageSQL> recordListSQL = AnswerImageSQL.queryAllOrderBySince(parentStep, order, since);
    List<AnswerImageXML> recordListXML = new LinkedList<AnswerImageXML>();
    for (AnswerImageSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static AnswerImageXML get(final Long id)
  {
    AnswerImageSQL recordSQL = AnswerImageSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerImageXML get(final Long id, final Date since)
  {
    AnswerImageSQL recordSQL = AnswerImageSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
