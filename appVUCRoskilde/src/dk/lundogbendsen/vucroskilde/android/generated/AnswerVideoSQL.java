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


public class AnswerVideoSQL extends CommonSQL implements Comparable<AnswerVideoSQL>
{
  Long id;
  public Long getId() { return id; }

  String description;
  public String getDescription() { return description; }
  public void setDescription(final String description) { this.description = description; }

  String videoRef;
  public String getVideoRef() { return videoRef; }
  public void setVideoRef(final String videoRef) { this.videoRef = videoRef; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  AnswerVideoSQL()
  {
    super();
    this.description = "";
    this.videoRef = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static AnswerVideoSQL create() { return new AnswerVideoSQL(); }

  public static final AnswerVideoSQL BLANK = AnswerVideoSQL.create();
  @Override public AnswerVideoSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final AnswerVideoSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof AnswerVideoSQL) && (this.id.equals(((AnswerVideoSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public AnswerVideoSQL copy()
  {
    AnswerVideoSQL recordSQL = new AnswerVideoSQL();
    recordSQL.id = this.getId();
    recordSQL.description = this.description;
    recordSQL.videoRef = this.videoRef;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "AnswerVideoSQL" +
      "[" +
        "id=" + id + ", " +
        "description=" + description + ", " +
        "videoRef=" + videoRef + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public AnswerVideoXML asXML()
  {
    AnswerVideoXML recordXML = AnswerVideoXML.create();
    recordXML.setId(this.getId());
    recordXML.setDescription(this.getDescription());
    recordXML.setVideoRef(this.getVideoRef());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public AnswerVideoSQL copy(Cursor cursor)
  {
    AnswerVideoSQL recordSQL = new AnswerVideoSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.description = cursor.getString(cursor.getColumnIndex("DESCRIPTION"));
    recordSQL.videoRef = cursor.getString(cursor.getColumnIndex("VIDEOREF"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "ANSWERVIDEO";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, DESCRIPTION, VIDEOREF, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE ANSWERVIDEO(ID INTEGER, DESCRIPTION TEXT NOT NULL, VIDEOREF TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS ANSWERVIDEO;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO ANSWERVIDEO(DESCRIPTION, VIDEOREF, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE ANSWERVIDEO SET DESCRIPTION = ?, VIDEOREF = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.description);
    statement.bindString(2, this.videoRef);
    statement.bindString(3, DateAdapter.compactDate(this.timestamp));
    statement.bindString(4, DateAdapter.compactDate(this.changestamp));
    statement.bindString(5, this.deletestamp.toString());
    statement.bindLong(6, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT DESCRIPTION, VIDEOREF, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM ANSWERVIDEO WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM ANSWERVIDEO WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM ANSWERVIDEO;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static AnswerVideoSQL query()
  {
    List<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerVideoSQL.BLANK, "deletestamp = 'false'", "");

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static AnswerVideoSQL queryOrderBy(final String order)
  {
    List<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerVideoSQL.BLANK, "deletestamp = 'false'", "", order);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static AnswerVideoSQL querySince(final Date since)
  {
    List<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerVideoSQL.BLANK,
          " AND changestamp >= ?",
          DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static AnswerVideoSQL queryOrderBySince(final String order, final Date since)
  {
    List<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerVideoSQL.BLANK,
          " AND changestamp >= ?",
          order, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<AnswerVideoSQL> queryAll()
  {
    LinkedList<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerVideoSQL.BLANK, "deletestamp = 'false'", "");
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<AnswerVideoSQL> queryAllOrderBy(final String order)
  {
    LinkedList<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerVideoSQL.BLANK, "deletestamp = 'false'", "", order);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<AnswerVideoSQL> queryAllSince(final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(AnswerVideoSQL.BLANK,
          filter,
          DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<AnswerVideoSQL> queryAllOrderBySince(final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<AnswerVideoSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(AnswerVideoSQL.BLANK,
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
    AnswerVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerVideoSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.description = recordSQL.description;
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

  public static AnswerVideoSQL get(final Long id)
  {
    AnswerVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerVideoSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    AnswerVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerVideoSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.description = recordSQL.description;
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

  public static AnswerVideoSQL get(final Long id, final Date since)
  {
    AnswerVideoSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(AnswerVideoSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final AnswerVideoSQL recordSQL)
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
    AnswerVideoSQL recordOLD = AnswerVideoSQL.query();
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(AnswerVideoSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(AnswerVideoSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(AnswerVideoSQL.BLANK, this.id);
  }

  public static AnswerVideoXML queryAsXML()
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.query();
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerVideoXML queryOrderByAsXML(String order)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.queryOrderBy(order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<AnswerVideoXML> queryAllAsXML()
  {
    List<AnswerVideoSQL> recordsSQL = AnswerVideoSQL.queryAll();
    LinkedList<AnswerVideoXML> recordsXML = new LinkedList<AnswerVideoXML>();
    for (AnswerVideoSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<AnswerVideoXML> queryAllOrderByAsXML(String order)
  {
    List<AnswerVideoSQL> recordsSQL = AnswerVideoSQL.queryAllOrderBy(order);
    LinkedList<AnswerVideoXML> recordsXML = new LinkedList<AnswerVideoXML>();
    for (AnswerVideoSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static AnswerVideoXML getAsXML(final Long id)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_Description = 1;
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
      case ID_Description: return description;
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
      case ID_Description: { description = (String) value; return; }
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
      case ID_Description: return "description";
      case ID_VideoRef: return "videoRef";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
