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


public class ActionRecordDescriptionSQL extends CommonSQL implements Comparable<ActionRecordDescriptionSQL>
{
  Long id;
  public Long getId() { return id; }

  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final StepSQL parentStep) { this.parentStep = parentStep.getId(); }
  public void setParentStep(final Long parentStepId) { this.parentStep = parentStepId; }

  String description;
  public String getDescription() { return description; }
  public void setDescription(final String description) { this.description = description; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  ActionRecordDescriptionSQL()
  {
    super();
    this.parentStep = 0L;
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionRecordDescriptionSQL create() { return new ActionRecordDescriptionSQL(); }

  public static final ActionRecordDescriptionSQL BLANK = ActionRecordDescriptionSQL.create();
  @Override public ActionRecordDescriptionSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final ActionRecordDescriptionSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof ActionRecordDescriptionSQL) && (this.id.equals(((ActionRecordDescriptionSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public ActionRecordDescriptionSQL copy()
  {
    ActionRecordDescriptionSQL recordSQL = new ActionRecordDescriptionSQL();
    recordSQL.id = this.getId();
    recordSQL.parentStep = this.parentStep;
    recordSQL.description = this.description;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "ActionRecordDescriptionSQL" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "description=" + description + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionRecordDescriptionXML asXML()
  {
    ActionRecordDescriptionXML recordXML = ActionRecordDescriptionXML.create();
    recordXML.setId(this.getId());
    recordXML.setParentStep(this.getParentStep());
    recordXML.setDescription(this.getDescription());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public ActionRecordDescriptionSQL copy(Cursor cursor)
  {
    ActionRecordDescriptionSQL recordSQL = new ActionRecordDescriptionSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.parentStep = cursor.getLong(cursor.getColumnIndex("PARENTSTEP"));
    recordSQL.description = cursor.getString(cursor.getColumnIndex("DESCRIPTION"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "ACTIONRECORDDESCRIPTION";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, PARENTSTEP, DESCRIPTION, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE ACTIONRECORDDESCRIPTION(ID INTEGER, PARENTSTEP INTEGER NOT NULL, DESCRIPTION TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS ACTIONRECORDDESCRIPTION;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO ACTIONRECORDDESCRIPTION(PARENTSTEP, DESCRIPTION, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE ACTIONRECORDDESCRIPTION SET PARENTSTEP = ?, DESCRIPTION = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindLong(1, this.parentStep);
    statement.bindString(2, this.description);
    statement.bindString(3, DateAdapter.compactDate(this.timestamp));
    statement.bindString(4, DateAdapter.compactDate(this.changestamp));
    statement.bindString(5, this.deletestamp.toString());
    statement.bindLong(6, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT PARENTSTEP, DESCRIPTION, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM ACTIONRECORDDESCRIPTION WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM ACTIONRECORDDESCRIPTION WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM ACTIONRECORDDESCRIPTION;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static ActionRecordDescriptionSQL query(final Long parentStep)
  {
    List<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionRecordDescriptionSQL.BLANK,
          "parentStep = ? AND deletestamp = 'false'",
          ""+parentStep);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionRecordDescriptionSQL queryOrderBy(final Long parentStep, final String order)
  {
    List<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionRecordDescriptionSQL.BLANK,
          "parentStep = ? AND deletestamp = 'false'",
          order, ""+parentStep);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionRecordDescriptionSQL querySince(final Long parentStep, final Date since)
  {
    List<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionRecordDescriptionSQL.BLANK,
          "parentStep = ? AND changestamp >= ?",
          ""+parentStep, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionRecordDescriptionSQL queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionRecordDescriptionSQL.BLANK,
          "parentStep = ? AND changestamp >= ?",
          order, ""+parentStep, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<ActionRecordDescriptionSQL> queryAll(final Long parentStep)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionRecordDescriptionSQL.BLANK,
          filter,
          ""+parentStep);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<ActionRecordDescriptionSQL> queryAllOrderBy(final Long parentStep, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionRecordDescriptionSQL.BLANK,
          filter,
          order, ""+parentStep);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<ActionRecordDescriptionSQL> queryAllSince(final Long parentStep, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionRecordDescriptionSQL.BLANK,
          filter,
          ""+parentStep, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<ActionRecordDescriptionSQL> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionRecordDescriptionSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionRecordDescriptionSQL.BLANK,
          filter,
          order, ""+parentStep, DateAdapter.compactDate(since));
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
    ActionRecordDescriptionSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionRecordDescriptionSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.parentStep = recordSQL.parentStep;
      this.description = recordSQL.description;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ActionRecordDescriptionSQL get(final Long id)
  {
    ActionRecordDescriptionSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionRecordDescriptionSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    ActionRecordDescriptionSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionRecordDescriptionSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.parentStep = recordSQL.parentStep;
      this.description = recordSQL.description;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ActionRecordDescriptionSQL get(final Long id, final Date since)
  {
    ActionRecordDescriptionSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionRecordDescriptionSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final ActionRecordDescriptionSQL recordSQL)
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
    ActionRecordDescriptionSQL recordOLD = ActionRecordDescriptionSQL.query(parentStep);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(ActionRecordDescriptionSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(ActionRecordDescriptionSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(ActionRecordDescriptionSQL.BLANK, this.id);
  }

  public static ActionRecordDescriptionXML queryAsXML(final Long parentStep)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionRecordDescriptionXML queryOrderByAsXML(final Long parentStep, String order)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<ActionRecordDescriptionXML> queryAllAsXML(final Long parentStep)
  {
    List<ActionRecordDescriptionSQL> recordsSQL = ActionRecordDescriptionSQL.queryAll(parentStep);
    LinkedList<ActionRecordDescriptionXML> recordsXML = new LinkedList<ActionRecordDescriptionXML>();
    for (ActionRecordDescriptionSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<ActionRecordDescriptionXML> queryAllOrderByAsXML(final Long parentStep, String order)
  {
    List<ActionRecordDescriptionSQL> recordsSQL = ActionRecordDescriptionSQL.queryAllOrderBy(parentStep, order);
    LinkedList<ActionRecordDescriptionXML> recordsXML = new LinkedList<ActionRecordDescriptionXML>();
    for (ActionRecordDescriptionSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static ActionRecordDescriptionXML getAsXML(final Long id)
  {
    ActionRecordDescriptionSQL recordSQL = ActionRecordDescriptionSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_ParentStep = 1;
  public static final int ID_Description = 2;
  public static final int ID_Timestamp = 3;
  public static final int ID_Changestamp = 4;
  public static final int ID_Deletestamp = 5;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_ParentStep: return parentStep;
      case ID_Description: return description;
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
      case ID_ParentStep: { parentStep = (Long) value; return; }
      case ID_Description: { description = (String) value; return; }
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
      case ID_ParentStep: return "parentStep";
      case ID_Description: return "description";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
