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


public class ParameterSQL extends CommonSQL implements Comparable<ParameterSQL>
{
  Long id;
  public Long getId() { return id; }

  String parameterName;
  public String getParameterName() { return parameterName; }
  public void setParameterName(final String parameterName) { this.parameterName = parameterName; }

  String parameterValue;
  public String getParameterValue() { return parameterValue; }
  public void setParameterValue(final String parameterValue) { this.parameterValue = parameterValue; }

  Boolean serverAccessOnly;
  public Boolean isServerAccessOnly() { return serverAccessOnly; }
  public void setServerAccessOnly(final Boolean serverAccessOnly) { this.serverAccessOnly = serverAccessOnly; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  ParameterSQL()
  {
    super();
    this.parameterName = "";
    this.parameterValue = "";
    this.serverAccessOnly = false;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ParameterSQL create() { return new ParameterSQL(); }

  public static final ParameterSQL BLANK = ParameterSQL.create();
  @Override public ParameterSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final ParameterSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof ParameterSQL) && (this.id.equals(((ParameterSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public ParameterSQL copy()
  {
    ParameterSQL recordSQL = new ParameterSQL();
    recordSQL.id = this.getId();
    recordSQL.parameterName = this.parameterName;
    recordSQL.parameterValue = this.parameterValue;
    recordSQL.serverAccessOnly = this.serverAccessOnly;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "ParameterSQL" +
      "[" +
        "id=" + id + ", " +
        "parameterName=" + parameterName + ", " +
        "parameterValue=" + parameterValue + ", " +
        "serverAccessOnly=" + serverAccessOnly + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ParameterXML asXML()
  {
    ParameterXML recordXML = ParameterXML.create(this.getParameterName());
    recordXML.setId(this.getId());
    recordXML.setParameterValue(this.getParameterValue());
    recordXML.setServerAccessOnly(this.isServerAccessOnly());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public ParameterSQL copy(Cursor cursor)
  {
    ParameterSQL recordSQL = new ParameterSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.parameterName = cursor.getString(cursor.getColumnIndex("PARAMETERNAME"));
    recordSQL.parameterValue = cursor.getString(cursor.getColumnIndex("PARAMETERVALUE"));
    recordSQL.serverAccessOnly = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("SERVERACCESSONLY")));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "PARAMETER";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, PARAMETERNAME, PARAMETERVALUE, SERVERACCESSONLY, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE PARAMETER(ID INTEGER, PARAMETERNAME TEXT NOT NULL, PARAMETERVALUE TEXT NOT NULL, SERVERACCESSONLY TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS PARAMETER;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO PARAMETER(PARAMETERNAME, PARAMETERVALUE, SERVERACCESSONLY, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE PARAMETER SET PARAMETERNAME = ?, PARAMETERVALUE = ?, SERVERACCESSONLY = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.parameterName);
    statement.bindString(2, this.parameterValue);
    statement.bindString(3, this.serverAccessOnly.toString());
    statement.bindString(4, DateAdapter.compactDate(this.timestamp));
    statement.bindString(5, DateAdapter.compactDate(this.changestamp));
    statement.bindString(6, this.deletestamp.toString());
    statement.bindLong(7, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT PARAMETERNAME, PARAMETERVALUE, SERVERACCESSONLY, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM PARAMETER WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM PARAMETER WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM PARAMETER;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static ParameterSQL query(final String parameterName)
  {
    List<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ParameterSQL.BLANK,
          "parameterName = ? AND deletestamp = 'false'",
          parameterName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ParameterSQL queryOrderBy(final String parameterName, final String order)
  {
    List<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ParameterSQL.BLANK,
          "parameterName = ? AND deletestamp = 'false'",
          order, parameterName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ParameterSQL querySince(final String parameterName, final Date since)
  {
    List<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ParameterSQL.BLANK,
          "parameterName = ? AND changestamp >= ?",
          parameterName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ParameterSQL queryOrderBySince(final String parameterName, final String order, final Date since)
  {
    List<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ParameterSQL.BLANK,
          "parameterName = ? AND changestamp >= ?",
          order, parameterName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<ParameterSQL> queryAll()
  {
    LinkedList<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ParameterSQL.BLANK, "deletestamp = 'false'", "");
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<ParameterSQL> queryAllOrderBy(final String order)
  {
    LinkedList<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ParameterSQL.BLANK, "deletestamp = 'false'", "", order);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<ParameterSQL> queryAllSince(final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ParameterSQL.BLANK,
          filter,
          DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<ParameterSQL> queryAllOrderBySince(final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<ParameterSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ParameterSQL.BLANK,
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
    ParameterSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ParameterSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.parameterName = recordSQL.parameterName;
      this.parameterValue = recordSQL.parameterValue;
      this.serverAccessOnly = recordSQL.serverAccessOnly;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ParameterSQL get(final Long id)
  {
    ParameterSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ParameterSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    ParameterSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ParameterSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.parameterName = recordSQL.parameterName;
      this.parameterValue = recordSQL.parameterValue;
      this.serverAccessOnly = recordSQL.serverAccessOnly;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ParameterSQL get(final Long id, final Date since)
  {
    ParameterSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ParameterSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final ParameterSQL recordSQL)
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
    ParameterSQL recordOLD = ParameterSQL.query(parameterName);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    ParameterSQL recordSQL = ParameterSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(ParameterSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(ParameterSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(ParameterSQL.BLANK, this.id);
  }

  public static ParameterXML queryAsXML(final String parameterName)
  {
    ParameterSQL recordSQL = ParameterSQL.query(parameterName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ParameterXML queryOrderByAsXML(final String parameterName, String order)
  {
    ParameterSQL recordSQL = ParameterSQL.queryOrderBy(parameterName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<ParameterXML> queryAllAsXML()
  {
    List<ParameterSQL> recordsSQL = ParameterSQL.queryAll();
    LinkedList<ParameterXML> recordsXML = new LinkedList<ParameterXML>();
    for (ParameterSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<ParameterXML> queryAllOrderByAsXML(String order)
  {
    List<ParameterSQL> recordsSQL = ParameterSQL.queryAllOrderBy(order);
    LinkedList<ParameterXML> recordsXML = new LinkedList<ParameterXML>();
    for (ParameterSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static ParameterXML getAsXML(final Long id)
  {
    ParameterSQL recordSQL = ParameterSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_ParameterName = 1;
  public static final int ID_ParameterValue = 2;
  public static final int ID_ServerAccessOnly = 3;
  public static final int ID_Timestamp = 4;
  public static final int ID_Changestamp = 5;
  public static final int ID_Deletestamp = 6;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_ParameterName: return parameterName;
      case ID_ParameterValue: return parameterValue;
      case ID_ServerAccessOnly: return serverAccessOnly;
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
      case ID_ParameterName: { parameterName = (String) value; return; }
      case ID_ParameterValue: { parameterValue = (String) value; return; }
      case ID_ServerAccessOnly: { serverAccessOnly = (Boolean) value; return; }
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
      case ID_ParameterName: return "parameterName";
      case ID_ParameterValue: return "parameterValue";
      case ID_ServerAccessOnly: return "serverAccessOnly";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
