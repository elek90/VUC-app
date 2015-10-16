/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidSQLite
 * 
 * Author: Jan Schoubo, schoubo reasoning
 */



package dk.schoubo.library.android.generated;

import android.database.*;
import android.database.sqlite.SQLiteStatement;
import dk.schoubo.library.android.CommonSQL;
import dk.schoubo.library.android.generated.GlobalSQLStructure;
import dk.schoubo.library.android.sql.SQLUtil;
import dk.schoubo.library.android.util.*;
import java.util.*;
import java.util.Date;


public class JobSQL extends CommonSQL implements Comparable<JobSQL>
{
  Long id;
  public Long getId() { return id; }

  String jobName;
  public String getJobName() { return jobName; }
  public void setJobName(final String jobName) { this.jobName = jobName; }

  String parameters;
  public String getParameters() { return parameters; }
  public void setParameters(final String parameters) { this.parameters = parameters; }

  Date startstamp;
  public Date getStartstamp() { return startstamp; }
  public void setStartstamp(final Date startstamp) { this.startstamp = startstamp; }

  Date finishstamp;
  public Date getFinishstamp() { return finishstamp; }
  public void setFinishstamp(final Date finishstamp) { this.finishstamp = finishstamp; }

  String status;
  public String getStatus() { return status; }
  public void setStatus(final String status) { this.status = status; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  JobSQL()
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

  public static JobSQL create() { return new JobSQL(); }

  public static final JobSQL BLANK = JobSQL.create();
  @Override public JobSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final JobSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof JobSQL) && (this.id.equals(((JobSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public JobSQL copy()
  {
    JobSQL recordSQL = new JobSQL();
    recordSQL.id = this.getId();
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

  @Override
  public String toString()
  {
    return "JobSQL" +
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
  public JobXML asXML()
  {
    JobXML recordXML = JobXML.create(this.getJobName());
    recordXML.setId(this.getId());
    recordXML.setParameters(this.getParameters());
    recordXML.setStartstamp(this.getStartstamp());
    recordXML.setFinishstamp(this.getFinishstamp());
    recordXML.setStatus(this.getStatus());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public JobSQL copy(Cursor cursor)
  {
    JobSQL recordSQL = new JobSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.jobName = cursor.getString(cursor.getColumnIndex("JOBNAME"));
    recordSQL.parameters = cursor.getString(cursor.getColumnIndex("PARAMETERS"));
    recordSQL.startstamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("STARTSTAMP")));
    recordSQL.finishstamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("FINISHSTAMP")));
    recordSQL.status = cursor.getString(cursor.getColumnIndex("STATUS"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "JOB";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, JOBNAME, PARAMETERS, STARTSTAMP, FINISHSTAMP, STATUS, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE JOB(ID INTEGER, JOBNAME TEXT NOT NULL, PARAMETERS TEXT NOT NULL, STARTSTAMP TEXT, FINISHSTAMP TEXT, STATUS TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS JOB;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO JOB(JOBNAME, PARAMETERS, STARTSTAMP, FINISHSTAMP, STATUS, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE JOB SET JOBNAME = ?, PARAMETERS = ?, STARTSTAMP = ?, FINISHSTAMP = ?, STATUS = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.jobName);
    statement.bindString(2, this.parameters);
    statement.bindString(3, DateAdapter.compactDate(this.startstamp));
    statement.bindString(4, DateAdapter.compactDate(this.finishstamp));
    statement.bindString(5, this.status);
    statement.bindString(6, DateAdapter.compactDate(this.timestamp));
    statement.bindString(7, DateAdapter.compactDate(this.changestamp));
    statement.bindString(8, this.deletestamp.toString());
    statement.bindLong(9, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT JOBNAME, PARAMETERS, STARTSTAMP, FINISHSTAMP, STATUS, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM JOB WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM JOB WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM JOB;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static JobSQL query(final String jobName)
  {
    List<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(JobSQL.BLANK,
          "jobName = ? AND deletestamp = 'false'",
          jobName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static JobSQL queryOrderBy(final String jobName, final String order)
  {
    List<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(JobSQL.BLANK,
          "jobName = ? AND deletestamp = 'false'",
          order, jobName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static JobSQL querySince(final String jobName, final Date since)
  {
    List<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(JobSQL.BLANK,
          "jobName = ? AND changestamp >= ?",
          jobName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static JobSQL queryOrderBySince(final String jobName, final String order, final Date since)
  {
    List<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(JobSQL.BLANK,
          "jobName = ? AND changestamp >= ?",
          order, jobName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<JobSQL> queryAll()
  {
    LinkedList<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(JobSQL.BLANK, "deletestamp = 'false'", "");
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<JobSQL> queryAllOrderBy(final String order)
  {
    LinkedList<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(JobSQL.BLANK, "deletestamp = 'false'", "", order);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<JobSQL> queryAllSince(final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(JobSQL.BLANK,
          filter,
          DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<JobSQL> queryAllOrderBySince(final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<JobSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(JobSQL.BLANK,
          filter,
          order, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }

  @Override
  public void get()
  {
    JobSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(JobSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.jobName = recordSQL.jobName;
      this.parameters = recordSQL.parameters;
      this.startstamp = recordSQL.startstamp;
      this.finishstamp = recordSQL.finishstamp;
      this.status = recordSQL.status;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static JobSQL get(final Long id)
  {
    JobSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(JobSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    JobSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(JobSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.jobName = recordSQL.jobName;
      this.parameters = recordSQL.parameters;
      this.startstamp = recordSQL.startstamp;
      this.finishstamp = recordSQL.finishstamp;
      this.status = recordSQL.status;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static JobSQL get(final Long id, final Date since)
  {
    JobSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(JobSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final JobSQL recordSQL)
  {
    recordSQL.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL);
  }

  @Override
  public void write()
  {
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);
  }

  @Override
  public void update()
  {
    JobSQL recordOLD = JobSQL.query(jobName);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    JobSQL recordSQL = JobSQL.get(id);
    if (recordSQL == null) return;
    recordSQL.changestamp = new Date();
    recordSQL.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL, true);
  }

  @Override
  public void delete()
  {
    this.changestamp = new Date();
    this.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);
  }

  public static void remove(final Long id)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(JobSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(JobSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(JobSQL.BLANK, this.id);
  }

  public static JobXML queryAsXML(final String jobName)
  {
    JobSQL recordSQL = JobSQL.query(jobName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static JobXML queryOrderByAsXML(final String jobName, String order)
  {
    JobSQL recordSQL = JobSQL.queryOrderBy(jobName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<JobXML> queryAllAsXML()
  {
    List<JobSQL> recordsSQL = JobSQL.queryAll();
    LinkedList<JobXML> recordsXML = new LinkedList<JobXML>();
    for (JobSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<JobXML> queryAllOrderByAsXML(String order)
  {
    List<JobSQL> recordsSQL = JobSQL.queryAllOrderBy(order);
    LinkedList<JobXML> recordsXML = new LinkedList<JobXML>();
    for (JobSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static JobXML getAsXML(final Long id)
  {
    JobSQL recordSQL = JobSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_JobName = 1;
  public static final int ID_Parameters = 2;
  public static final int ID_Startstamp = 3;
  public static final int ID_Finishstamp = 4;
  public static final int ID_Status = 5;
  public static final int ID_Timestamp = 6;
  public static final int ID_Changestamp = 7;
  public static final int ID_Deletestamp = 8;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_JobName: return jobName;
      case ID_Parameters: return parameters;
      case ID_Startstamp: return startstamp;
      case ID_Finishstamp: return finishstamp;
      case ID_Status: return status;
      case ID_Timestamp: return timestamp;
      case ID_Changestamp: return changestamp;
      case ID_Deletestamp: return deletestamp;
    }
    return null;
  }

  @Override
  public void set(final int fieldId, final Object value)
  {
    switch (fieldId)
    {
      case ID_Id: { id = (Long) value; return; }
      case ID_JobName: { jobName = (String) value; return; }
      case ID_Parameters: { parameters = (String) value; return; }
      case ID_Startstamp: { startstamp = (Date) value; return; }
      case ID_Finishstamp: { finishstamp = (Date) value; return; }
      case ID_Status: { status = (String) value; return; }
      case ID_Timestamp: { timestamp = (Date) value; return; }
      case ID_Changestamp: { changestamp = (Date) value; return; }
      case ID_Deletestamp: { deletestamp = (Boolean) value; return; }
    }
  }

  @Override
  public String getColumnName(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return "id";
      case ID_JobName: return "jobName";
      case ID_Parameters: return "parameters";
      case ID_Startstamp: return "startstamp";
      case ID_Finishstamp: return "finishstamp";
      case ID_Status: return "status";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
