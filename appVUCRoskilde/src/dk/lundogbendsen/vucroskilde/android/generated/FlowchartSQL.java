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


public class FlowchartSQL extends CommonSQL implements Comparable<FlowchartSQL>
{
  Long id;
  public Long getId() { return id; }

  Boolean executable;
  public Boolean isExecutable() { return executable; }
  public void setExecutable(final Boolean executable) { this.executable = executable; }

  String flowchartName;
  public String getFlowchartName() { return flowchartName; }
  public void setFlowchartName(final String flowchartName) { this.flowchartName = flowchartName; }

  Long school;
  public Long getSchool() { return school; }
  public void setSchool(final SchoolSQL school) { this.school = school.getId(); }
  public void setSchool(final Long schoolId) { this.school = schoolId; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  FlowchartSQL()
  {
    super();
    this.executable = false;
    this.flowchartName = "";
    this.school = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static FlowchartSQL create() { return new FlowchartSQL(); }

  public static final FlowchartSQL BLANK = FlowchartSQL.create();
  @Override public FlowchartSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final FlowchartSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof FlowchartSQL) && (this.id.equals(((FlowchartSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public FlowchartSQL copy()
  {
    FlowchartSQL recordSQL = new FlowchartSQL();
    recordSQL.id = this.getId();
    recordSQL.executable = this.executable;
    recordSQL.flowchartName = this.flowchartName;
    recordSQL.school = this.school;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "FlowchartSQL" +
      "[" +
        "id=" + id + ", " +
        "executable=" + executable + ", " +
        "flowchartName=" + flowchartName + ", " +
        "school=" + school + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public FlowchartXML asXML()
  {
    FlowchartXML recordXML = FlowchartXML.create(this.getFlowchartName());
    recordXML.setId(this.getId());
    recordXML.setExecutable(this.isExecutable());
    recordXML.setSchool(this.getSchool());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public FlowchartSQL copy(Cursor cursor)
  {
    FlowchartSQL recordSQL = new FlowchartSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.executable = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("EXECUTABLE")));
    recordSQL.flowchartName = cursor.getString(cursor.getColumnIndex("FLOWCHARTNAME"));
    recordSQL.school = cursor.getLong(cursor.getColumnIndex("SCHOOL"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "FLOWCHART";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, EXECUTABLE, FLOWCHARTNAME, SCHOOL, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE FLOWCHART(ID INTEGER, EXECUTABLE TEXT NOT NULL, FLOWCHARTNAME TEXT NOT NULL, SCHOOL INTEGER NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS FLOWCHART;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO FLOWCHART(EXECUTABLE, FLOWCHARTNAME, SCHOOL, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE FLOWCHART SET EXECUTABLE = ?, FLOWCHARTNAME = ?, SCHOOL = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.executable.toString());
    statement.bindString(2, this.flowchartName);
    statement.bindLong(3, this.school);
    statement.bindString(4, DateAdapter.compactDate(this.timestamp));
    statement.bindString(5, DateAdapter.compactDate(this.changestamp));
    statement.bindString(6, this.deletestamp.toString());
    statement.bindLong(7, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT EXECUTABLE, FLOWCHARTNAME, SCHOOL, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM FLOWCHART WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM FLOWCHART WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM FLOWCHART;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static FlowchartSQL query(final String flowchartName, final Long school)
  {
    List<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(FlowchartSQL.BLANK,
          "flowchartName = ? AND school = ? AND deletestamp = 'false'",
          flowchartName, ""+school);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static FlowchartSQL queryOrderBy(final String flowchartName, final Long school, final String order)
  {
    List<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(FlowchartSQL.BLANK,
          "flowchartName = ? AND school = ? AND deletestamp = 'false'",
          order, flowchartName, ""+school);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static FlowchartSQL querySince(final String flowchartName, final Long school, final Date since)
  {
    List<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(FlowchartSQL.BLANK,
          "flowchartName = ? AND school = ? AND changestamp >= ?",
          flowchartName, ""+school, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static FlowchartSQL queryOrderBySince(final String flowchartName, final Long school, final String order, final Date since)
  {
    List<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(FlowchartSQL.BLANK,
          "flowchartName = ? AND school = ? AND changestamp >= ?",
          order, flowchartName, ""+school, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<FlowchartSQL> queryAll(final Long school)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (school != null) filter += sep.next() + "school = ?";
    LinkedList<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(FlowchartSQL.BLANK,
          filter,
          ""+school);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepsql"))
    {
      return new LinkedList<CommonSQL>(StepSQL.queryAll(this.id));
    }
    else
      return null;
  }

  public static LinkedList<FlowchartSQL> queryAllOrderBy(final Long school, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (school != null) filter += sep.next() + "school = ?";
    LinkedList<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(FlowchartSQL.BLANK,
          filter,
          order, ""+school);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepsql"))
    {
      return new LinkedList<CommonSQL>(StepSQL.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }

  public static LinkedList<FlowchartSQL> queryAllSince(final Long school, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (school != null) filter += sep.next() + "school = ?";
    LinkedList<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(FlowchartSQL.BLANK,
          filter,
          ""+school, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepsql"))
    {
      return new LinkedList<CommonSQL>(StepSQL.queryAllSince(this.id, since));
    }
    else
      return null;
  }

  public static LinkedList<FlowchartSQL> queryAllOrderBySince(final Long school, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (school != null) filter += sep.next() + "school = ?";
    LinkedList<FlowchartSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(FlowchartSQL.BLANK,
          filter,
          order, ""+school, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepsql"))
    {
      return new LinkedList<CommonSQL>(StepSQL.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }

  @Override
  public void get()
  {
    FlowchartSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(FlowchartSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.executable = recordSQL.executable;
      this.flowchartName = recordSQL.flowchartName;
      this.school = recordSQL.school;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static FlowchartSQL get(final Long id)
  {
    FlowchartSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(FlowchartSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    FlowchartSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(FlowchartSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.executable = recordSQL.executable;
      this.flowchartName = recordSQL.flowchartName;
      this.school = recordSQL.school;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static FlowchartSQL get(final Long id, final Date since)
  {
    FlowchartSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(FlowchartSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final FlowchartSQL recordSQL)
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
    FlowchartSQL recordOLD = FlowchartSQL.query(flowchartName, school);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    FlowchartSQL recordSQL = FlowchartSQL.get(id);
    if (recordSQL == null) return;
    recordSQL.changestamp = new Date();
    recordSQL.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL, true);

    List<StepSQL> childStepRecordsSQL = StepSQL.queryAll(recordSQL.id);
    for (StepSQL childStepRecordSQL : childStepRecordsSQL)
    {
      childStepRecordSQL.delete();
    }
  }

  @Override
  public void delete()
  {
    this.changestamp = new Date();
    this.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);

    List<StepSQL> childStepRecordsSQL = StepSQL.queryAll(this.id);
    for (StepSQL childStepRecordSQL : childStepRecordsSQL)
    {
      childStepRecordSQL.delete();
    }
  }

  public static void remove(final Long id)
  {
    FlowchartSQL recordSQL = FlowchartSQL.get(id);
    if (recordSQL == null) return;
    GlobalSQLStructure.getDBHelper().deleteObjectById(FlowchartSQL.BLANK, id);

    List<StepSQL> childStepRecordsSQL = StepSQL.queryAll(recordSQL.id);
    for (StepSQL childStepRecordSQL : childStepRecordsSQL)
    {
      childStepRecordSQL.remove();
    }
  }

  public static void removeAll(final Set<Long> ids)
  {
    List<FlowchartSQL> recordsSQL = new LinkedList<FlowchartSQL>();
    for (Long id : ids)
    {
      FlowchartSQL recordSQL = FlowchartSQL.get(id);
      if (recordSQL != null)
      {
        recordsSQL.add(recordSQL);
      }
    }
    GlobalSQLStructure.getDBHelper().deleteObjectsById(FlowchartSQL.BLANK, ids);
    for (FlowchartSQL recordSQL : recordsSQL)
    {

      List<StepSQL> childStepRecordsSQL = StepSQL.queryAll(recordSQL.id);
      for (StepSQL childStepRecordSQL : childStepRecordsSQL)
      {
        childStepRecordSQL.remove();
      }
    }
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(FlowchartSQL.BLANK, this.id);

    List<StepSQL> childStepRecordsSQL = StepSQL.queryAll(this.id);
    for (StepSQL childStepRecordSQL : childStepRecordsSQL)
    {
      childStepRecordSQL.remove();
    }
  }

  public static FlowchartXML queryAsXML(final String flowchartName, final Long school)
  {
    FlowchartSQL recordSQL = FlowchartSQL.query(flowchartName, school);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static FlowchartXML queryOrderByAsXML(final String flowchartName, final Long school, String order)
  {
    FlowchartSQL recordSQL = FlowchartSQL.queryOrderBy(flowchartName, school, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<FlowchartXML> queryAllAsXML(final Long school)
  {
    List<FlowchartSQL> recordsSQL = FlowchartSQL.queryAll(school);
    LinkedList<FlowchartXML> recordsXML = new LinkedList<FlowchartXML>();
    for (FlowchartSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<FlowchartXML> queryAllOrderByAsXML(final Long school, String order)
  {
    List<FlowchartSQL> recordsSQL = FlowchartSQL.queryAllOrderBy(school, order);
    LinkedList<FlowchartXML> recordsXML = new LinkedList<FlowchartXML>();
    for (FlowchartSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static FlowchartXML getAsXML(final Long id)
  {
    FlowchartSQL recordSQL = FlowchartSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_Executable = 1;
  public static final int ID_FlowchartName = 2;
  public static final int ID_School = 3;
  public static final int ID_Timestamp = 4;
  public static final int ID_Changestamp = 5;
  public static final int ID_Deletestamp = 6;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_Executable: return executable;
      case ID_FlowchartName: return flowchartName;
      case ID_School: return school;
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
      case ID_Executable: { executable = (Boolean) value; return; }
      case ID_FlowchartName: { flowchartName = (String) value; return; }
      case ID_School: { school = (Long) value; return; }
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
      case ID_Executable: return "executable";
      case ID_FlowchartName: return "flowchartName";
      case ID_School: return "school";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
