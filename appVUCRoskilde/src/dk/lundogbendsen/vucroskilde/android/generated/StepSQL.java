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
import dk.lundogbendsen.vucroskilde.android.data.StepType;
import dk.schoubo.library.android.CommonSQL;
import dk.schoubo.library.android.generated.GlobalSQLStructure;
import dk.schoubo.library.android.sql.SQLUtil;
import dk.schoubo.library.android.util.*;
import java.util.*;
import java.util.Date;


public class StepSQL extends CommonSQL implements Comparable<StepSQL>
{
  Long id;
  public Long getId() { return id; }

  Long parentFlowchart;
  public Long getParentFlowchart() { return parentFlowchart; }
  public void setParentFlowchart(final FlowchartSQL parentFlowchart) { this.parentFlowchart = parentFlowchart.getId(); }
  public void setParentFlowchart(final Long parentFlowchartId) { this.parentFlowchart = parentFlowchartId; }

  String stepName;
  public String getStepName() { return stepName; }
  public void setStepName(final String stepName) { this.stepName = stepName; }

  String stepSequence;
  public String getStepSequence() { return stepSequence; }
  public void setStepSequence(final String stepSequence) { this.stepSequence = stepSequence; }

  StepType stepType;
  public StepType getStepType() { return stepType; }
  public void setStepType(final StepType stepType) { this.stepType = stepType; }

  Long actionId;
  public Long getActionId() { return actionId; }
  public void setActionId(final Long actionId) { this.actionId = actionId; }

  Long subflowchartId;
  public Long getSubflowchartId() { return subflowchartId; }
  public void setSubflowchartId(final Long subflowchartId) { this.subflowchartId = subflowchartId; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  StepSQL()
  {
    super();
    this.parentFlowchart = 0L;
    this.stepName = "";
    this.stepSequence = "";
    this.stepType = null;
    this.actionId = 0L;
    this.subflowchartId = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static StepSQL create() { return new StepSQL(); }

  public static final StepSQL BLANK = StepSQL.create();
  @Override public StepSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final StepSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof StepSQL) && (this.id.equals(((StepSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public StepSQL copy()
  {
    StepSQL recordSQL = new StepSQL();
    recordSQL.id = this.getId();
    recordSQL.parentFlowchart = this.parentFlowchart;
    recordSQL.stepName = this.stepName;
    recordSQL.stepSequence = this.stepSequence;
    recordSQL.stepType = this.stepType;
    recordSQL.actionId = this.actionId;
    recordSQL.subflowchartId = this.subflowchartId;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "StepSQL" +
      "[" +
        "id=" + id + ", " +
        "parentFlowchart=" + parentFlowchart + ", " +
        "stepName=" + stepName + ", " +
        "stepSequence=" + stepSequence + ", " +
        "stepType=" + stepType + ", " +
        "actionId=" + actionId + ", " +
        "subflowchartId=" + subflowchartId + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public StepXML asXML()
  {
    StepXML recordXML = StepXML.create();
    recordXML.setId(this.getId());
    recordXML.setParentFlowchart(this.getParentFlowchart());
    recordXML.setStepName(this.getStepName());
    recordXML.setStepSequence(this.getStepSequence());
    recordXML.setStepType(this.getStepType());
    recordXML.setActionId(this.getActionId());
    recordXML.setSubflowchartId(this.getSubflowchartId());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public StepSQL copy(Cursor cursor)
  {
    StepSQL recordSQL = new StepSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.parentFlowchart = cursor.getLong(cursor.getColumnIndex("PARENTFLOWCHART"));
    recordSQL.stepName = cursor.getString(cursor.getColumnIndex("STEPNAME"));
    recordSQL.stepSequence = cursor.getString(cursor.getColumnIndex("STEPSEQUENCE"));
    recordSQL.stepType = StepType.valueOf(cursor.getString(cursor.getColumnIndex("STEPTYPE")));
    recordSQL.actionId = cursor.getLong(cursor.getColumnIndex("ACTIONID"));
    recordSQL.subflowchartId = cursor.getLong(cursor.getColumnIndex("SUBFLOWCHARTID"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "STEP";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, PARENTFLOWCHART, STEPNAME, STEPSEQUENCE, STEPTYPE, ACTIONID, SUBFLOWCHARTID, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE STEP(ID INTEGER, PARENTFLOWCHART INTEGER NOT NULL, STEPNAME TEXT NOT NULL, STEPSEQUENCE TEXT NOT NULL, STEPTYPE TEXT NOT NULL, ACTIONID INTEGER NOT NULL, SUBFLOWCHARTID INTEGER NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS STEP;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO STEP(PARENTFLOWCHART, STEPNAME, STEPSEQUENCE, STEPTYPE, ACTIONID, SUBFLOWCHARTID, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE STEP SET PARENTFLOWCHART = ?, STEPNAME = ?, STEPSEQUENCE = ?, STEPTYPE = ?, ACTIONID = ?, SUBFLOWCHARTID = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindLong(1, this.parentFlowchart);
    statement.bindString(2, this.stepName);
    statement.bindString(3, this.stepSequence);
    statement.bindString(4, this.stepType.name());
    statement.bindLong(5, this.actionId);
    statement.bindLong(6, this.subflowchartId);
    statement.bindString(7, DateAdapter.compactDate(this.timestamp));
    statement.bindString(8, DateAdapter.compactDate(this.changestamp));
    statement.bindString(9, this.deletestamp.toString());
    statement.bindLong(10, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT PARENTFLOWCHART, STEPNAME, STEPSEQUENCE, STEPTYPE, ACTIONID, SUBFLOWCHARTID, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM STEP WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM STEP WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM STEP;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static StepSQL query(final Long parentFlowchart)
  {
    List<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StepSQL.BLANK,
          "parentFlowchart = ? AND deletestamp = 'false'",
          ""+parentFlowchart);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static StepSQL queryOrderBy(final Long parentFlowchart, final String order)
  {
    List<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StepSQL.BLANK,
          "parentFlowchart = ? AND deletestamp = 'false'",
          order, ""+parentFlowchart);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static StepSQL querySince(final Long parentFlowchart, final Date since)
  {
    List<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StepSQL.BLANK,
          "parentFlowchart = ? AND changestamp >= ?",
          ""+parentFlowchart, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static StepSQL queryOrderBySince(final Long parentFlowchart, final String order, final Date since)
  {
    List<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StepSQL.BLANK,
          "parentFlowchart = ? AND changestamp >= ?",
          order, ""+parentFlowchart, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<StepSQL> queryAll(final Long parentFlowchart)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentFlowchart != null) filter += sep.next() + "parentFlowchart = ?";
    LinkedList<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StepSQL.BLANK,
          filter,
          ""+parentFlowchart);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<StepSQL> queryAllOrderBy(final Long parentFlowchart, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentFlowchart != null) filter += sep.next() + "parentFlowchart = ?";
    LinkedList<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StepSQL.BLANK,
          filter,
          order, ""+parentFlowchart);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<StepSQL> queryAllSince(final Long parentFlowchart, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentFlowchart != null) filter += sep.next() + "parentFlowchart = ?";
    LinkedList<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StepSQL.BLANK,
          filter,
          ""+parentFlowchart, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<StepSQL> queryAllOrderBySince(final Long parentFlowchart, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentFlowchart != null) filter += sep.next() + "parentFlowchart = ?";
    LinkedList<StepSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StepSQL.BLANK,
          filter,
          order, ""+parentFlowchart, DateAdapter.compactDate(since));
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
    StepSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StepSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.parentFlowchart = recordSQL.parentFlowchart;
      this.stepName = recordSQL.stepName;
      this.stepSequence = recordSQL.stepSequence;
      this.stepType = recordSQL.stepType;
      this.actionId = recordSQL.actionId;
      this.subflowchartId = recordSQL.subflowchartId;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static StepSQL get(final Long id)
  {
    StepSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StepSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    StepSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StepSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.parentFlowchart = recordSQL.parentFlowchart;
      this.stepName = recordSQL.stepName;
      this.stepSequence = recordSQL.stepSequence;
      this.stepType = recordSQL.stepType;
      this.actionId = recordSQL.actionId;
      this.subflowchartId = recordSQL.subflowchartId;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static StepSQL get(final Long id, final Date since)
  {
    StepSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StepSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final StepSQL recordSQL)
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
    StepSQL recordOLD = StepSQL.query(parentFlowchart);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    StepSQL recordSQL = StepSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(StepSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(StepSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(StepSQL.BLANK, this.id);
  }

  public static StepXML queryAsXML(final Long parentFlowchart)
  {
    StepSQL recordSQL = StepSQL.query(parentFlowchart);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StepXML queryOrderByAsXML(final Long parentFlowchart, String order)
  {
    StepSQL recordSQL = StepSQL.queryOrderBy(parentFlowchart, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<StepXML> queryAllAsXML(final Long parentFlowchart)
  {
    List<StepSQL> recordsSQL = StepSQL.queryAll(parentFlowchart);
    LinkedList<StepXML> recordsXML = new LinkedList<StepXML>();
    for (StepSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<StepXML> queryAllOrderByAsXML(final Long parentFlowchart, String order)
  {
    List<StepSQL> recordsSQL = StepSQL.queryAllOrderBy(parentFlowchart, order);
    LinkedList<StepXML> recordsXML = new LinkedList<StepXML>();
    for (StepSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static StepXML getAsXML(final Long id)
  {
    StepSQL recordSQL = StepSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_ParentFlowchart = 1;
  public static final int ID_StepName = 2;
  public static final int ID_StepSequence = 3;
  public static final int ID_StepType = 4;
  public static final int ID_ActionId = 5;
  public static final int ID_SubflowchartId = 6;
  public static final int ID_Timestamp = 7;
  public static final int ID_Changestamp = 8;
  public static final int ID_Deletestamp = 9;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_ParentFlowchart: return parentFlowchart;
      case ID_StepName: return stepName;
      case ID_StepSequence: return stepSequence;
      case ID_StepType: return stepType;
      case ID_ActionId: return actionId;
      case ID_SubflowchartId: return subflowchartId;
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
      case ID_ParentFlowchart: { parentFlowchart = (Long) value; return; }
      case ID_StepName: { stepName = (String) value; return; }
      case ID_StepSequence: { stepSequence = (String) value; return; }
      case ID_StepType: { stepType = (StepType) value; return; }
      case ID_ActionId: { actionId = (Long) value; return; }
      case ID_SubflowchartId: { subflowchartId = (Long) value; return; }
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
      case ID_ParentFlowchart: return "parentFlowchart";
      case ID_StepName: return "stepName";
      case ID_StepSequence: return "stepSequence";
      case ID_StepType: return "stepType";
      case ID_ActionId: return "actionId";
      case ID_SubflowchartId: return "subflowchartId";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
