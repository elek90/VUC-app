/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidSQLite
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.database.*;
import android.database.sqlite.SQLiteStatement;
import dk.schoubo.library.android.CommonSQL;
import dk.schoubo.library.android.generated.GlobalSQLStructure;
import dk.schoubo.library.android.sql.SQLUtil;
import dk.schoubo.library.android.util.*;
import java.util.*;
import java.util.Date;


public class ExerciseSQL extends CommonSQL implements Comparable<ExerciseSQL>
{
  Long id;
  public Long getId() { return id; }

  Long flowchart;
  public Long getFlowchart() { return flowchart; }
  public void setFlowchart(final FlowchartSQL flowchart) { this.flowchart = flowchart.getId(); }
  public void setFlowchart(final Long flowchartId) { this.flowchart = flowchartId; }

  Long student;
  public Long getStudent() { return student; }
  public void setStudent(final StudentSQL student) { this.student = student.getId(); }
  public void setStudent(final Long studentId) { this.student = studentId; }

  Date started;
  public Date getStarted() { return started; }
  public void setStarted(final Date started) { this.started = started; }

  Date lastSeen;
  public Date getLastSeen() { return lastSeen; }
  public void setLastSeen(final Date lastSeen) { this.lastSeen = lastSeen; }

  Date lastModified;
  public Date getLastModified() { return lastModified; }
  public void setLastModified(final Date lastModified) { this.lastModified = lastModified; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  ExerciseSQL()
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
  }

  public static ExerciseSQL create() { return new ExerciseSQL(); }

  public static final ExerciseSQL BLANK = ExerciseSQL.create();
  @Override public ExerciseSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final ExerciseSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof ExerciseSQL) && (this.id.equals(((ExerciseSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public ExerciseSQL copy()
  {
    ExerciseSQL recordSQL = new ExerciseSQL();
    recordSQL.id = this.getId();
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

  @Override
  public String toString()
  {
    return "ExerciseSQL" +
      "[" +
        "id=" + id + ", " +
        "flowchart=" + flowchart + ", " +
        "student=" + student + ", " +
        "started=" + started + ", " +
        "lastSeen=" + lastSeen + ", " +
        "lastModified=" + lastModified + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ExerciseXML asXML()
  {
    ExerciseXML recordXML = ExerciseXML.create();
    recordXML.setId(this.getId());
    recordXML.setFlowchart(this.getFlowchart());
    recordXML.setStudent(this.getStudent());
    recordXML.setStarted(this.getStarted());
    recordXML.setLastSeen(this.getLastSeen());
    recordXML.setLastModified(this.getLastModified());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public ExerciseSQL copy(Cursor cursor)
  {
    ExerciseSQL recordSQL = new ExerciseSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.flowchart = cursor.getLong(cursor.getColumnIndex("FLOWCHART"));
    recordSQL.student = cursor.getLong(cursor.getColumnIndex("STUDENT"));
    recordSQL.started = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("STARTED")));
    recordSQL.lastSeen = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("LASTSEEN")));
    recordSQL.lastModified = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("LASTMODIFIED")));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "EXERCISE";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, FLOWCHART, STUDENT, STARTED, LASTSEEN, LASTMODIFIED, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE EXERCISE(ID INTEGER, FLOWCHART INTEGER NOT NULL, STUDENT INTEGER NOT NULL, STARTED TEXT NOT NULL, LASTSEEN TEXT NOT NULL, LASTMODIFIED TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS EXERCISE;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO EXERCISE(FLOWCHART, STUDENT, STARTED, LASTSEEN, LASTMODIFIED, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE EXERCISE SET FLOWCHART = ?, STUDENT = ?, STARTED = ?, LASTSEEN = ?, LASTMODIFIED = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindLong(1, this.flowchart);
    statement.bindLong(2, this.student);
    statement.bindString(3, DateAdapter.compactDate(this.started));
    statement.bindString(4, DateAdapter.compactDate(this.lastSeen));
    statement.bindString(5, DateAdapter.compactDate(this.lastModified));
    statement.bindString(6, DateAdapter.compactDate(this.timestamp));
    statement.bindString(7, DateAdapter.compactDate(this.changestamp));
    statement.bindString(8, this.deletestamp.toString());
    statement.bindLong(9, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT FLOWCHART, STUDENT, STARTED, LASTSEEN, LASTMODIFIED, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM EXERCISE WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM EXERCISE WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM EXERCISE;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static ExerciseSQL query(final Long flowchart, final Long student)
  {
    List<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ExerciseSQL.BLANK,
          "flowchart = ? AND student = ? AND deletestamp = 'false'",
          ""+flowchart, ""+student);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ExerciseSQL queryOrderBy(final Long flowchart, final Long student, final String order)
  {
    List<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ExerciseSQL.BLANK,
          "flowchart = ? AND student = ? AND deletestamp = 'false'",
          order, ""+flowchart, ""+student);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ExerciseSQL querySince(final Long flowchart, final Long student, final Date since)
  {
    List<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ExerciseSQL.BLANK,
          "flowchart = ? AND student = ? AND changestamp >= ?",
          ""+flowchart, ""+student, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ExerciseSQL queryOrderBySince(final Long flowchart, final Long student, final String order, final Date since)
  {
    List<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ExerciseSQL.BLANK,
          "flowchart = ? AND student = ? AND changestamp >= ?",
          order, ""+flowchart, ""+student, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<ExerciseSQL> queryAll(final Long flowchart, final Long student)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (flowchart != null) filter += sep.next() + "flowchart = ?";
    if (student != null) filter += sep.next() + "student = ?";
    LinkedList<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ExerciseSQL.BLANK,
          filter,
          ""+flowchart, ""+student);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answersql"))
    {
      return new LinkedList<CommonSQL>(AnswerSQL.queryAll(this.id));
    }
    else
      return null;
  }

  public static LinkedList<ExerciseSQL> queryAllOrderBy(final Long flowchart, final Long student, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (flowchart != null) filter += sep.next() + "flowchart = ?";
    if (student != null) filter += sep.next() + "student = ?";
    LinkedList<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ExerciseSQL.BLANK,
          filter,
          order, ""+flowchart, ""+student);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answersql"))
    {
      return new LinkedList<CommonSQL>(AnswerSQL.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }

  public static LinkedList<ExerciseSQL> queryAllSince(final Long flowchart, final Long student, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (flowchart != null) filter += sep.next() + "flowchart = ?";
    if (student != null) filter += sep.next() + "student = ?";
    LinkedList<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ExerciseSQL.BLANK,
          filter,
          ""+flowchart, ""+student, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answersql"))
    {
      return new LinkedList<CommonSQL>(AnswerSQL.queryAllSince(this.id, since));
    }
    else
      return null;
  }

  public static LinkedList<ExerciseSQL> queryAllOrderBySince(final Long flowchart, final Long student, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (flowchart != null) filter += sep.next() + "flowchart = ?";
    if (student != null) filter += sep.next() + "student = ?";
    LinkedList<ExerciseSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ExerciseSQL.BLANK,
          filter,
          order, ""+flowchart, ""+student, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("answer") || name.equalsIgnoreCase("answersql"))
    {
      return new LinkedList<CommonSQL>(AnswerSQL.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }

  @Override
  public void get()
  {
    ExerciseSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ExerciseSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.flowchart = recordSQL.flowchart;
      this.student = recordSQL.student;
      this.started = recordSQL.started;
      this.lastSeen = recordSQL.lastSeen;
      this.lastModified = recordSQL.lastModified;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ExerciseSQL get(final Long id)
  {
    ExerciseSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ExerciseSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    ExerciseSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ExerciseSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.flowchart = recordSQL.flowchart;
      this.student = recordSQL.student;
      this.started = recordSQL.started;
      this.lastSeen = recordSQL.lastSeen;
      this.lastModified = recordSQL.lastModified;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ExerciseSQL get(final Long id, final Date since)
  {
    ExerciseSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ExerciseSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final ExerciseSQL recordSQL)
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
    ExerciseSQL recordOLD = ExerciseSQL.query(flowchart, student);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    ExerciseSQL recordSQL = ExerciseSQL.get(id);
    if (recordSQL == null) return;
    recordSQL.changestamp = new Date();
    recordSQL.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL, true);

    List<AnswerSQL> childAnswerRecordsSQL = AnswerSQL.queryAll(recordSQL.id);
    for (AnswerSQL childAnswerRecordSQL : childAnswerRecordsSQL)
    {
      childAnswerRecordSQL.delete();
    }
  }

  @Override
  public void delete()
  {
    this.changestamp = new Date();
    this.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);

    List<AnswerSQL> childAnswerRecordsSQL = AnswerSQL.queryAll(this.id);
    for (AnswerSQL childAnswerRecordSQL : childAnswerRecordsSQL)
    {
      childAnswerRecordSQL.delete();
    }
  }

  public static void remove(final Long id)
  {
    ExerciseSQL recordSQL = ExerciseSQL.get(id);
    if (recordSQL == null) return;
    GlobalSQLStructure.getDBHelper().deleteObjectById(ExerciseSQL.BLANK, id);

    List<AnswerSQL> childAnswerRecordsSQL = AnswerSQL.queryAll(recordSQL.id);
    for (AnswerSQL childAnswerRecordSQL : childAnswerRecordsSQL)
    {
      childAnswerRecordSQL.remove();
    }
  }

  public static void removeAll(final Set<Long> ids)
  {
    List<ExerciseSQL> recordsSQL = new LinkedList<ExerciseSQL>();
    for (Long id : ids)
    {
      ExerciseSQL recordSQL = ExerciseSQL.get(id);
      if (recordSQL != null)
      {
        recordsSQL.add(recordSQL);
      }
    }
    GlobalSQLStructure.getDBHelper().deleteObjectsById(ExerciseSQL.BLANK, ids);
    for (ExerciseSQL recordSQL : recordsSQL)
    {

      List<AnswerSQL> childAnswerRecordsSQL = AnswerSQL.queryAll(recordSQL.id);
      for (AnswerSQL childAnswerRecordSQL : childAnswerRecordsSQL)
      {
        childAnswerRecordSQL.remove();
      }
    }
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(ExerciseSQL.BLANK, this.id);

    List<AnswerSQL> childAnswerRecordsSQL = AnswerSQL.queryAll(this.id);
    for (AnswerSQL childAnswerRecordSQL : childAnswerRecordsSQL)
    {
      childAnswerRecordSQL.remove();
    }
  }

  public static ExerciseXML queryAsXML(final Long flowchart, final Long student)
  {
    ExerciseSQL recordSQL = ExerciseSQL.query(flowchart, student);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ExerciseXML queryOrderByAsXML(final Long flowchart, final Long student, String order)
  {
    ExerciseSQL recordSQL = ExerciseSQL.queryOrderBy(flowchart, student, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<ExerciseXML> queryAllAsXML(final Long flowchart, final Long student)
  {
    List<ExerciseSQL> recordsSQL = ExerciseSQL.queryAll(flowchart, student);
    LinkedList<ExerciseXML> recordsXML = new LinkedList<ExerciseXML>();
    for (ExerciseSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<ExerciseXML> queryAllOrderByAsXML(final Long flowchart, final Long student, String order)
  {
    List<ExerciseSQL> recordsSQL = ExerciseSQL.queryAllOrderBy(flowchart, student, order);
    LinkedList<ExerciseXML> recordsXML = new LinkedList<ExerciseXML>();
    for (ExerciseSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static ExerciseXML getAsXML(final Long id)
  {
    ExerciseSQL recordSQL = ExerciseSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_Flowchart = 1;
  public static final int ID_Student = 2;
  public static final int ID_Started = 3;
  public static final int ID_LastSeen = 4;
  public static final int ID_LastModified = 5;
  public static final int ID_Timestamp = 6;
  public static final int ID_Changestamp = 7;
  public static final int ID_Deletestamp = 8;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_Flowchart: return flowchart;
      case ID_Student: return student;
      case ID_Started: return started;
      case ID_LastSeen: return lastSeen;
      case ID_LastModified: return lastModified;
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
      case ID_Flowchart: { flowchart = (Long) value; return; }
      case ID_Student: { student = (Long) value; return; }
      case ID_Started: { started = (Date) value; return; }
      case ID_LastSeen: { lastSeen = (Date) value; return; }
      case ID_LastModified: { lastModified = (Date) value; return; }
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
      case ID_Flowchart: return "flowchart";
      case ID_Student: return "student";
      case ID_Started: return "started";
      case ID_LastSeen: return "lastSeen";
      case ID_LastModified: return "lastModified";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
