/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Jan Schoubo, schoubo reasoning
 */



package dk.schoubo.library.android.generated;

import dk.schoubo.library.android.CommonXML;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import org.simpleframework.xml.*;


@Root
public class JobXML extends CommonXML implements Serializable
{
  @Element(required=false)
  String jobName = "";
  public String getJobName() { return jobName; }
  public void setJobName(final String jobName) { this.jobName = jobName; }

  @Element(required=false)
  String parameters = "";
  public String getParameters() { return parameters; }
  public void setParameters(final String parameters) { this.parameters = parameters; }

  @Element(required=false)
  Date startstamp;
  public Date getStartstamp() { return startstamp; }
  public void setStartstamp(final Date startstamp) { this.startstamp = startstamp; }

  @Element(required=false)
  Date finishstamp;
  public Date getFinishstamp() { return finishstamp; }
  public void setFinishstamp(final Date finishstamp) { this.finishstamp = finishstamp; }

  @Element(required=false)
  String status = "";
  public String getStatus() { return status; }
  public void setStatus(final String status) { this.status = status; }

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

  protected JobXML()
  {
    super();
    this.jobName = "";
    this.parameters = "";
    this.startstamp = null;
    this.finishstamp = null;
    this.status = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static JobXML create()
  {
    return new JobXML();
  }

  public JobXML(final String jobName)
   {
    this();
    this.jobName = jobName;
  }

  public static JobXML create(final String jobName)
  {
    return new JobXML(jobName);
  }

  public static final JobXML BLANK = JobXML.create();
  @Override public JobXML getBlank() { return BLANK; }

  @Override public JobXML copy()
  {
    JobXML n = JobXML.create();
    n.id = this.id;
    n.jobName = this.jobName;
    n.parameters = this.parameters;
    n.startstamp = this.startstamp;
    n.finishstamp = this.finishstamp;
    n.status = this.status;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "JobXML" +
      "[" +
        "id=" + id + ", " +
        "jobName=" + jobName + ", " +
        "parameters=" + parameters + ", " +
        "startstamp=" + startstamp + ", " +
        "finishstamp=" + finishstamp + ", " +
        "status=" + status + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public JobSQL asSQL()
  {
    JobSQL recordSQL = new JobSQL();
    recordSQL.id = this.id; 
    recordSQL.jobName = this.jobName; 
    recordSQL.parameters = this.parameters; 
    recordSQL.startstamp = this.startstamp; 
    recordSQL.finishstamp = this.finishstamp; 
    recordSQL.status = this.status; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static JobXML query(final String jobName)
  {
    JobSQL recordSQL = JobSQL.query(jobName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static JobXML queryOrderBy(final String jobName, final String order)
  {
    JobSQL recordSQL = JobSQL.queryOrderBy(jobName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static JobXML querySince(final String jobName, final Date since)
  {
    JobSQL recordSQL = JobSQL.querySince(jobName, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static JobXML queryOrderBySince(final String jobName, final String order, final Date since)
  {
    JobSQL recordSQL = JobSQL.queryOrderBySince(jobName, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<JobXML> queryAll()
  {
    List<JobSQL> recordListSQL = JobSQL.queryAll();
    List<JobXML> recordListXML = new LinkedList<JobXML>();
    for (JobSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<JobXML> queryAllOrderBy(final String order)
  {
    List<JobSQL> recordListSQL = JobSQL.queryAllOrderBy(order);
    List<JobXML> recordListXML = new LinkedList<JobXML>();
    for (JobSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<JobXML> queryAllSince(final Date since)
  {
    List<JobSQL> recordListSQL = JobSQL.queryAllSince(since);
    List<JobXML> recordListXML = new LinkedList<JobXML>();
    for (JobSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<JobXML> queryAllOrderBySince(final String order, final Date since)
  {
    List<JobSQL> recordListSQL = JobSQL.queryAllOrderBySince(order, since);
    List<JobXML> recordListXML = new LinkedList<JobXML>();
    for (JobSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static JobXML get(final Long id)
  {
    JobSQL recordSQL = JobSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static JobXML get(final Long id, final Date since)
  {
    JobSQL recordSQL = JobSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
