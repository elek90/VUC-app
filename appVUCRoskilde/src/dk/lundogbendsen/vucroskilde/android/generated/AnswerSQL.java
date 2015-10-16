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


public class AnswerSQL extends CommonSQL implements Comparable<AnswerSQL>
{
  Long id;
  public Long getId() { return id; }

  Long parentExercise;
  public Long getParentExercise() { return parentExercise; }
  public void setParentExercise(final ExerciseSQL parentExercise) { this.parentExercise = parentExercise.getId(); }
  public void setParentExercise(final Long parentExerciseId) { this.parentExercise = parentExerciseId; }

  Long stepId;
  public Long getStepId() { return stepId; }
  public void setStepId(final Long stepId) { this.stepId = stepId; }

  Long answerId;
  public Long getAnswerId() { return answerId; }
  public void setAnswerId(final Long answerId) { this.answerId = answerId; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  AnswerSQL()
  {
    super();
    this.parentExercise = 0L;
    this.stepId = 0L;
    this.answerId = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static AnswerSQL create() { return new AnswerSQL(); }

  public static final AnswerSQL BLANK = AnswerSQL.create();
  @Override public AnswerSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final AnswerSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof AnswerSQL) && (this.id.equals(((AnswerSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public AnswerSQL copy()
  {
    AnswerSQL recordSQL = new AnswerSQL();
    recordSQL.id = this.getId();
    recordSQL.parentExercise = this.parentExercise;
    recordSQL.stepId = this.stepId;
    recordSQL.answerId = this.answerId;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "AnswerSQL" +
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
  public AnswerXML asXML()
  {
    AnswerXML recordXML = AnswerXML.create();
    recordXML.setId(this.getId());
    recordXML.setParentExercise(this.getParentExercise());
    recordXML.setStepId(this.getStepId());
    recordXML.setAnswerId(this.getAnswerId());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public AnswerSQL copy(Cursor cursor)
  {
    AnswerSQL recordSQL = new AnswerSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.parentExercise = cursor.getLong(cursor.getColumnIndex("PARENTEXERCISE"));
    recordSQL.stepId = cursor.getLong(cursor.getColumnIndex("STEPID"));
    recordSQL.answerId = cursor.getLong(cursor.getColumnIndex("ANSWERID"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "ANSWER";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, PARENTEXERCISE, STEPID, ANSWERID, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE ANSWER(ID INTEGER, PARENTEXERCISE INTEGER NOT NULL, STEPID INTEGER NOT NULL, ANSWERID INTEGER NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS ANSWER;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO ANSWER(PARENTEXERCISE, STEPID, ANSWERID, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE ANSWER SET PARENTEXERCISE = ?, STEPID = ?, ANSWERID = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindLong(1, this.parentExercise);
    statement.bindLong(2, this.stepId);
    statement.bindLong(3, this.answerId);
    statement.bindString(4, DateAdapter.compactDate(this.timestamp));
    statement.bindString(5, DateAdapter.compactDate(this.changestamp));
    statement.bindString(6, this.deletestamp.toString());
    statement.bindLong(7, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT PARENTEXERCISE, STEPID, ANSWERID, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM ANSWER WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM ANSWER WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM ANSWER;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static AnswerSQL query(final Long parentExercise)
  {
    List<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerSQL.BLANK,
          "parentExercise = ? AND deletestamp = 'false'",
          ""+parentExercise);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static AnswerSQL queryOrderBy(final Long parentExercise, final String order)
  {
    List<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerSQL.BLANK,
          "parentExercise = ? AND deletestamp = 'false'",
          order, ""+parentExercise);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static AnswerSQL querySince(final Long parentExercise, final Date since)
  {
    List<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerSQL.BLANK,
          "parentExercise = ? AND changestamp >= ?",
          ""+parentExercise, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static AnswerSQL queryOrderBySince(final Long parentExercise, final String order, final Date since)
  {
    List<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerSQL.BLANK,
          "parentExercise = ? AND changestamp >= ?",
          order, ""+parentExercise, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<AnswerSQL> queryAll(final Long parentExercise)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentExercise != null) filter += sep.next() + "parentExercise = ?";
    LinkedList<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerSQL.BLANK,
          filter,
          ""+parentExercise);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<AnswerSQL> queryAllOrderBy(final Long parentExercise, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentExercise != null) filter += sep.next() + "parentExercise = ?";
    LinkedList<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerSQL.BLANK,
          filter,
          order, ""+parentExercise);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<AnswerSQL> queryAllSince(final Long parentExercise, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentExercise != null) filter += sep.next() + "parentExercise = ?";
    LinkedList<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerSQL.BLANK,
          filter,
          ""+parentExercise, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<AnswerSQL> queryAllOrderBySince(final Long parentExercise, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentExercise != null) filter += sep.next() + "parentExercise = ?";
    LinkedList<AnswerSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerSQL.BLANK,
          filter,
          order, ""+parentExercise, DateAdapter.compactDate(since));
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
    AnswerSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.parentExercise = recordSQL.parentExercise;
      this.stepId = recordSQL.stepId;
      this.answerId = recordSQL.answerId;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static AnswerSQL get(final Long id)
  {
    AnswerSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    AnswerSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.parentExercise = recordSQL.parentExercise;
      this.stepId = recordSQL.stepId;
      this.answerId = recordSQL.answerId;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static AnswerSQL get(final Long id, final Date since)
  {
    AnswerSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final AnswerSQL recordSQL)
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
    AnswerSQL recordOLD = AnswerSQL.query(parentExercise);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    AnswerSQL recordSQL = AnswerSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(AnswerSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(AnswerSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(AnswerSQL.BLANK, this.id);
  }

  public static AnswerXML queryAsXML(final Long parentExercise)
  {
    AnswerSQL recordSQL = AnswerSQL.query(parentExercise);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerXML queryOrderByAsXML(final Long parentExercise, String order)
  {
    AnswerSQL recordSQL = AnswerSQL.queryOrderBy(parentExercise, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<AnswerXML> queryAllAsXML(final Long parentExercise)
  {
    List<AnswerSQL> recordsSQL = AnswerSQL.queryAll(parentExercise);
    LinkedList<AnswerXML> recordsXML = new LinkedList<AnswerXML>();
    for (AnswerSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<AnswerXML> queryAllOrderByAsXML(final Long parentExercise, String order)
  {
    List<AnswerSQL> recordsSQL = AnswerSQL.queryAllOrderBy(parentExercise, order);
    LinkedList<AnswerXML> recordsXML = new LinkedList<AnswerXML>();
    for (AnswerSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static AnswerXML getAsXML(final Long id)
  {
    AnswerSQL recordSQL = AnswerSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_ParentExercise = 1;
  public static final int ID_StepId = 2;
  public static final int ID_AnswerId = 3;
  public static final int ID_Timestamp = 4;
  public static final int ID_Changestamp = 5;
  public static final int ID_Deletestamp = 6;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_ParentExercise: return parentExercise;
      case ID_StepId: return stepId;
      case ID_AnswerId: return answerId;
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
      case ID_ParentExercise: { parentExercise = (Long) value; return; }
      case ID_StepId: { stepId = (Long) value; return; }
      case ID_AnswerId: { answerId = (Long) value; return; }
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
      case ID_ParentExercise: return "parentExercise";
      case ID_StepId: return "stepId";
      case ID_AnswerId: return "answerId";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
