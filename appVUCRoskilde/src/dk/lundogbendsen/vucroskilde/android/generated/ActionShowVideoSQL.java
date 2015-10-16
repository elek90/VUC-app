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


public class ActionShowVideoSQL extends CommonSQL implements Comparable<ActionShowVideoSQL>
{
  Long id;
  public Long getId() { return id; }

  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final StepSQL parentStep) { this.parentStep = parentStep.getId(); }
  public void setParentStep(final Long parentStepId) { this.parentStep = parentStepId; }

  String videoRef;
  public String getVideoRef() { return videoRef; }
  public void setVideoRef(final String videoRef) { this.videoRef = videoRef; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  ActionShowVideoSQL()
  {
    super();
    this.parentStep = 0L;
    this.videoRef = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionShowVideoSQL create() { return new ActionShowVideoSQL(); }

  public static final ActionShowVideoSQL BLANK = ActionShowVideoSQL.create();
  @Override public ActionShowVideoSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final ActionShowVideoSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof ActionShowVideoSQL) && (this.id.equals(((ActionShowVideoSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public ActionShowVideoSQL copy()
  {
    ActionShowVideoSQL recordSQL = new ActionShowVideoSQL();
    recordSQL.id = this.getId();
    recordSQL.parentStep = this.parentStep;
    recordSQL.videoRef = this.videoRef;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "ActionShowVideoSQL" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "videoRef=" + videoRef + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionShowVideoXML asXML()
  {
    ActionShowVideoXML recordXML = ActionShowVideoXML.create();
    recordXML.setId(this.getId());
    recordXML.setParentStep(this.getParentStep());
    recordXML.setVideoRef(this.getVideoRef());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public ActionShowVideoSQL copy(Cursor cursor)
  {
    ActionShowVideoSQL recordSQL = new ActionShowVideoSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.parentStep = cursor.getLong(cursor.getColumnIndex("PARENTSTEP"));
    recordSQL.videoRef = cursor.getString(cursor.getColumnIndex("VIDEOREF"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "ACTIONSHOWVIDEO";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, PARENTSTEP, VIDEOREF, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE ACTIONSHOWVIDEO(ID INTEGER, PARENTSTEP INTEGER NOT NULL, VIDEOREF TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS ACTIONSHOWVIDEO;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO ACTIONSHOWVIDEO(PARENTSTEP, VIDEOREF, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE ACTIONSHOWVIDEO SET PARENTSTEP = ?, VIDEOREF = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindLong(1, this.parentStep);
    statement.bindString(2, this.videoRef);
    statement.bindString(3, DateAdapter.compactDate(this.timestamp));
    statement.bindString(4, DateAdapter.compactDate(this.changestamp));
    statement.bindString(5, this.deletestamp.toString());
    statement.bindLong(6, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT PARENTSTEP, VIDEOREF, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM ACTIONSHOWVIDEO WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM ACTIONSHOWVIDEO WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM ACTIONSHOWVIDEO;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static ActionShowVideoSQL query(final Long parentStep)
  {
    List<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowVideoSQL.BLANK,
          "parentStep = ? AND deletestamp = 'false'",
          ""+parentStep);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionShowVideoSQL queryOrderBy(final Long parentStep, final String order)
  {
    List<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowVideoSQL.BLANK,
          "parentStep = ? AND deletestamp = 'false'",
          order, ""+parentStep);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionShowVideoSQL querySince(final Long parentStep, final Date since)
  {
    List<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowVideoSQL.BLANK,
          "parentStep = ? AND changestamp >= ?",
          ""+parentStep, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionShowVideoSQL queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowVideoSQL.BLANK,
          "parentStep = ? AND changestamp >= ?",
          order, ""+parentStep, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<ActionShowVideoSQL> queryAll(final Long parentStep)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowVideoSQL.BLANK,
          filter,
          ""+parentStep);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<ActionShowVideoSQL> queryAllOrderBy(final Long parentStep, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowVideoSQL.BLANK,
          filter,
          order, ""+parentStep);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<ActionShowVideoSQL> queryAllSince(final Long parentStep, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowVideoSQL.BLANK,
          filter,
          ""+parentStep, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<ActionShowVideoSQL> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowVideoSQL.BLANK,
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
    ActionShowVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowVideoSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.parentStep = recordSQL.parentStep;
      this.videoRef = recordSQL.videoRef;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ActionShowVideoSQL get(final Long id)
  {
    ActionShowVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowVideoSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    ActionShowVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowVideoSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.parentStep = recordSQL.parentStep;
      this.videoRef = recordSQL.videoRef;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ActionShowVideoSQL get(final Long id, final Date since)
  {
    ActionShowVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowVideoSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final ActionShowVideoSQL recordSQL)
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
    ActionShowVideoSQL recordOLD = ActionShowVideoSQL.query(parentStep);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(ActionShowVideoSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(ActionShowVideoSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(ActionShowVideoSQL.BLANK, this.id);
  }

  public static ActionShowVideoXML queryAsXML(final Long parentStep)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowVideoXML queryOrderByAsXML(final Long parentStep, String order)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<ActionShowVideoXML> queryAllAsXML(final Long parentStep)
  {
    List<ActionShowVideoSQL> recordsSQL = ActionShowVideoSQL.queryAll(parentStep);
    LinkedList<ActionShowVideoXML> recordsXML = new LinkedList<ActionShowVideoXML>();
    for (ActionShowVideoSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<ActionShowVideoXML> queryAllOrderByAsXML(final Long parentStep, String order)
  {
    List<ActionShowVideoSQL> recordsSQL = ActionShowVideoSQL.queryAllOrderBy(parentStep, order);
    LinkedList<ActionShowVideoXML> recordsXML = new LinkedList<ActionShowVideoXML>();
    for (ActionShowVideoSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static ActionShowVideoXML getAsXML(final Long id)
  {
    ActionShowVideoSQL recordSQL = ActionShowVideoSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_ParentStep = 1;
  public static final int ID_VideoRef = 2;
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
      case ID_VideoRef: return videoRef;
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
      case ID_VideoRef: { videoRef = (String) value; return; }
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
      case ID_VideoRef: return "videoRef";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
