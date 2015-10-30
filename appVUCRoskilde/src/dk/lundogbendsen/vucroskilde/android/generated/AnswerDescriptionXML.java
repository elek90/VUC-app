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
public class AnswerDescriptionXML extends CommonXML implements Serializable
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
  String text = "";
  public String getText() { return text; }
  public void setText(final String text) { this.text = text; }

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

  protected AnswerDescriptionXML()
  {
    super();
    this.parentStep = 0L;
    this.description = "";
    this.text = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static AnswerDescriptionXML create()
  {
    return new AnswerDescriptionXML();
  }

  public static final AnswerDescriptionXML BLANK = AnswerDescriptionXML.create();
  @Override public AnswerDescriptionXML getBlank() { return BLANK; }

  @Override public AnswerDescriptionXML copy()
  {
    AnswerDescriptionXML n = AnswerDescriptionXML.create();
    n.id = this.id;
    n.parentStep = this.parentStep;
    n.description = this.description;
    n.text = this.text;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "AnswerDescriptionXML" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "description=" + description + ", " +
        "text=" + text + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public AnswerDescriptionSQL asSQL()
  {
    AnswerDescriptionSQL recordSQL = new AnswerDescriptionSQL();
    recordSQL.id = this.id; 
    recordSQL.parentStep = this.parentStep; 
    recordSQL.description = this.description; 
    recordSQL.text = this.text; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static AnswerDescriptionXML query(final Long parentStep)
  {
    AnswerDescriptionSQL recordSQL = AnswerDescriptionSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerDescriptionXML queryOrderBy(final Long parentStep, final String order)
  {
    AnswerDescriptionSQL recordSQL = AnswerDescriptionSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerDescriptionXML querySince(final Long parentStep, final Date since)
  {
    AnswerDescriptionSQL recordSQL = AnswerDescriptionSQL.querySince(parentStep, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerDescriptionXML queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    AnswerDescriptionSQL recordSQL = AnswerDescriptionSQL.queryOrderBySince(parentStep, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<AnswerDescriptionXML> queryAll(final Long parentStep)
  {
    List<AnswerDescriptionSQL> recordListSQL = AnswerDescriptionSQL.queryAll(parentStep);
    List<AnswerDescriptionXML> recordListXML = new LinkedList<AnswerDescriptionXML>();
    for (AnswerDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<AnswerDescriptionXML> queryAllOrderBy(final Long parentStep, final String order)
  {
    List<AnswerDescriptionSQL> recordListSQL = AnswerDescriptionSQL.queryAllOrderBy(parentStep, order);
    List<AnswerDescriptionXML> recordListXML = new LinkedList<AnswerDescriptionXML>();
    for (AnswerDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<AnswerDescriptionXML> queryAllSince(final Long parentStep, final Date since)
  {
    List<AnswerDescriptionSQL> recordListSQL = AnswerDescriptionSQL.queryAllSince(parentStep, since);
    List<AnswerDescriptionXML> recordListXML = new LinkedList<AnswerDescriptionXML>();
    for (AnswerDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<AnswerDescriptionXML> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<AnswerDescriptionSQL> recordListSQL = AnswerDescriptionSQL.queryAllOrderBySince(parentStep, order, since);
    List<AnswerDescriptionXML> recordListXML = new LinkedList<AnswerDescriptionXML>();
    for (AnswerDescriptionSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static AnswerDescriptionXML get(final Long id)
  {
    AnswerDescriptionSQL recordSQL = AnswerDescriptionSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerDescriptionXML get(final Long id, final Date since)
  {
    AnswerDescriptionSQL recordSQL = AnswerDescriptionSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
