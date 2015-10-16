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
public class ExerciseXML extends CommonXML implements Serializable
{
  @Element
  Long flowchart;
  public Long getFlowchart() { return flowchart; }
  public void setFlowchart(final Long flowchart) { this.flowchart = flowchart; }

  @Element
  Long student;
  public Long getStudent() { return student; }
  public void setStudent(final Long student) { this.student = student; }

  @Element
  Date started;
  public Date getStarted() { return started; }
  public void setStarted(final Date started) { this.started = started; }

  @Element
  Date lastSeen;
  public Date getLastSeen() { return lastSeen; }
  public void setLastSeen(final Date lastSeen) { this.lastSeen = lastSeen; }

  @Element
  Date lastModified;
  public Date getLastModified() { return lastModified; }
  public void setLastModified(final Date lastModified) { this.lastModified = lastModified; }

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

  @ElementList(inline=true, required=false)
  Collection<AnswerXML> answers;
  @Element
  int answersSize;
  public void clearAnswers() { this.answers.clear(); answersSize = 0; }
  public AnswerXML addAnswers(final AnswerXML record) { this.answers.add(record); answersSize = this.answers.size(); return record; }
  public Collection<AnswerXML> addAllAnswers(final Collection<AnswerXML> records) { this.answers.addAll(records); answersSize = this.answers.size(); return records; }
  public Collection<AnswerXML> getAnswers() { return answers; }
  public int getAnswersSize() { return answersSize; }

  protected ExerciseXML()
  {
    super();
    this.flowchart = 0L;
    this.student = 0L;
    this.started = new Date();
    this.lastSeen = new Date();
    this.lastModified = new Date();
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
    this.answers = new LinkedList<AnswerXML>();
  }

  public static ExerciseXML create()
  {
    return new ExerciseXML();
  }

  public static final ExerciseXML BLANK = ExerciseXML.create();
  @Override public ExerciseXML getBlank() { return BLANK; }

  @Override public ExerciseXML copy()
  {
    ExerciseXML n = ExerciseXML.create();
    n.id = this.id;
    n.flowchart = this.flowchart;
    n.student = this.student;
    n.started = this.started;
    n.lastSeen = this.lastSeen;
    n.lastModified = this.lastModified;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    n.answers.addAll(this.answers);
    n.answersSize = n.answers.size();
    return n;
  }

  @Override
  public String toString()
  {
    return "ExerciseXML" +
      "[" +
        "id=" + id + ", " +
        "flowchart=" + flowchart + ", " +
        "student=" + student + ", " +
        "started=" + started + ", " +
        "lastSeen=" + lastSeen + ", " +
        "lastModified=" + lastModified + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp + ", " +
        "answers: {" + answers.size() + "}" + ", " +
        "answersSize=" + answersSize +
      "]";
  }

  @Override
  public ExerciseSQL asSQL()
  {
    ExerciseSQL recordSQL = new ExerciseSQL();
    recordSQL.id = this.id; 
    recordSQL.flowchart = this.flowchart; 
    recordSQL.student = this.student; 
    recordSQL.started = this.started; 
    recordSQL.lastSeen = this.lastSeen; 
    recordSQL.lastModified = this.lastModified; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static ExerciseXML query(final Long flowchart, final Long student)
  {
    ExerciseSQL recordSQL = ExerciseSQL.query(flowchart, student);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ExerciseXML queryOrderBy(final Long flowchart, final Long student, final String order)
  {
    ExerciseSQL recordSQL = ExerciseSQL.queryOrderBy(flowchart, student, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ExerciseXML querySince(final Long flowchart, final Long student, final Date since)
  {
    ExerciseSQL recordSQL = ExerciseSQL.querySince(flowchart, student, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ExerciseXML queryOrderBySince(final Long flowchart, final Long student, final String order, final Date since)
  {
    ExerciseSQL recordSQL = ExerciseSQL.queryOrderBySince(flowchart, student, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<ExerciseXML> queryAll(final Long flowchart, final Long student)
  {
    List<ExerciseSQL> recordListSQL = ExerciseSQL.queryAll(flowchart, student);
    List<ExerciseXML> recordListXML = new LinkedList<ExerciseXML>();
    for (ExerciseSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answerxml"))
    {
      return new LinkedList<CommonXML>(AnswerXML.queryAll(this.id));
    }
    else
      return null;
  }
  public static List<ExerciseXML> queryAllOrderBy(final Long flowchart, final Long student, final String order)
  {
    List<ExerciseSQL> recordListSQL = ExerciseSQL.queryAllOrderBy(flowchart, student, order);
    List<ExerciseXML> recordListXML = new LinkedList<ExerciseXML>();
    for (ExerciseSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answerxml"))
    {
      return new LinkedList<CommonXML>(AnswerXML.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }
  public static List<ExerciseXML> queryAllSince(final Long flowchart, final Long student, final Date since)
  {
    List<ExerciseSQL> recordListSQL = ExerciseSQL.queryAllSince(flowchart, student, since);
    List<ExerciseXML> recordListXML = new LinkedList<ExerciseXML>();
    for (ExerciseSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answerxml"))
    {
      return new LinkedList<CommonXML>(AnswerXML.queryAllSince(this.id, since));
    }
    else
      return null;
  }
  public static List<ExerciseXML> queryAllOrderBySince(final Long flowchart, final Long student, final String order, final Date since)
  {
    List<ExerciseSQL> recordListSQL = ExerciseSQL.queryAllOrderBySince(flowchart, student, order, since);
    List<ExerciseXML> recordListXML = new LinkedList<ExerciseXML>();
    for (ExerciseSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answerxml"))
    {
      return new LinkedList<CommonXML>(AnswerXML.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }
  public static ExerciseXML get(final Long id)
  {
    ExerciseSQL recordSQL = ExerciseSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ExerciseXML get(final Long id, final Date since)
  {
    ExerciseSQL recordSQL = ExerciseSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
