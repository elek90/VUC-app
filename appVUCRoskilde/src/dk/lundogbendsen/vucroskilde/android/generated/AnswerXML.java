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
public class AnswerXML extends CommonXML implements Serializable
{
  @Element
  Long parentExercise;
  public Long getParentExercise() { return parentExercise; }
  public void setParentExercise(final Long parentExercise) { this.parentExercise = parentExercise; }

  @Element
  Long stepId;
  public Long getStepId() { return stepId; }
  public void setStepId(final Long stepId) { this.stepId = stepId; }

  @Element
  Long answerId;
  public Long getAnswerId() { return answerId; }
  public void setAnswerId(final Long answerId) { this.answerId = answerId; }

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

  protected AnswerXML()
  {
    super();
    this.parentExercise = 0L;
    this.stepId = 0L;
    this.answerId = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static AnswerXML create()
  {
    return new AnswerXML();
  }

  public static final AnswerXML BLANK = AnswerXML.create();
  @Override public AnswerXML getBlank() { return BLANK; }

  @Override public AnswerXML copy()
  {
    AnswerXML n = AnswerXML.create();
    n.id = this.id;
    n.parentExercise = this.parentExercise;
    n.stepId = this.stepId;
    n.answerId = this.answerId;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "AnswerXML" +
      "[" +
        "id=" + id + ", " +
        "parentExercise=" + parentExercise + ", " +
        "stepId=" + stepId + ", " +
        "answerId=" + answerId + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public AnswerSQL asSQL()
  {
    AnswerSQL recordSQL = new AnswerSQL();
    recordSQL.id = this.id; 
    recordSQL.parentExercise = this.parentExercise; 
    recordSQL.stepId = this.stepId; 
    recordSQL.answerId = this.answerId; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static AnswerXML query(final Long parentExercise)
  {
    AnswerSQL recordSQL = AnswerSQL.query(parentExercise);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerXML queryOrderBy(final Long parentExercise, final String order)
  {
    AnswerSQL recordSQL = AnswerSQL.queryOrderBy(parentExercise, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerXML querySince(final Long parentExercise, final Date since)
  {
    AnswerSQL recordSQL = AnswerSQL.querySince(parentExercise, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerXML queryOrderBySince(final Long parentExercise, final String order, final Date since)
  {
    AnswerSQL recordSQL = AnswerSQL.queryOrderBySince(parentExercise, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<AnswerXML> queryAll(final Long parentExercise)
  {
    List<AnswerSQL> recordListSQL = AnswerSQL.queryAll(parentExercise);
    List<AnswerXML> recordListXML = new LinkedList<AnswerXML>();
    for (AnswerSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<AnswerXML> queryAllOrderBy(final Long parentExercise, final String order)
  {
    List<AnswerSQL> recordListSQL = AnswerSQL.queryAllOrderBy(parentExercise, order);
    List<AnswerXML> recordListXML = new LinkedList<AnswerXML>();
    for (AnswerSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<AnswerXML> queryAllSince(final Long parentExercise, final Date since)
  {
    List<AnswerSQL> recordListSQL = AnswerSQL.queryAllSince(parentExercise, since);
    List<AnswerXML> recordListXML = new LinkedList<AnswerXML>();
    for (AnswerSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<AnswerXML> queryAllOrderBySince(final Long parentExercise, final String order, final Date since)
  {
    List<AnswerSQL> recordListSQL = AnswerSQL.queryAllOrderBySince(parentExercise, order, since);
    List<AnswerXML> recordListXML = new LinkedList<AnswerXML>();
    for (AnswerSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static AnswerXML get(final Long id)
  {
    AnswerSQL recordSQL = AnswerSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerXML get(final Long id, final Date since)
  {
    AnswerSQL recordSQL = AnswerSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
