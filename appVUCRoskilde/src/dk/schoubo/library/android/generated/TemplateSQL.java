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


public class TemplateSQL extends CommonSQL implements Comparable<TemplateSQL>
{
  Long id;
  public Long getId() { return id; }

  String templateName;
  public String getTemplateName() { return templateName; }
  public void setTemplateName(final String templateName) { this.templateName = templateName; }

  String templateValue;
  public String getTemplateValue() { return templateValue; }
  public void setTemplateValue(final String templateValue) { this.templateValue = templateValue; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  TemplateSQL()
  {
    super();
    this.templateName = "";
    this.templateValue = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static TemplateSQL create() { return new TemplateSQL(); }

  public static final TemplateSQL BLANK = TemplateSQL.create();
  @Override public TemplateSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final TemplateSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof TemplateSQL) && (this.id.equals(((TemplateSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public TemplateSQL copy()
  {
    TemplateSQL recordSQL = new TemplateSQL();
    recordSQL.id = this.getId();
    recordSQL.templateName = this.templateName;
    recordSQL.templateValue = this.templateValue;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "TemplateSQL" +
      "[" +
        "id=" + id + ", " +
        "templateName=" + templateName + ", " +
        "templateValue=" + templateValue + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public TemplateXML asXML()
  {
    TemplateXML recordXML = TemplateXML.create(this.getTemplateName());
    recordXML.setId(this.getId());
    recordXML.setTemplateValue(this.getTemplateValue());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public TemplateSQL copy(Cursor cursor)
  {
    TemplateSQL recordSQL = new TemplateSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.templateName = cursor.getString(cursor.getColumnIndex("TEMPLATENAME"));
    recordSQL.templateValue = cursor.getString(cursor.getColumnIndex("TEMPLATEVALUE"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "TEMPLATE";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, TEMPLATENAME, TEMPLATEVALUE, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE TEMPLATE(ID INTEGER, TEMPLATENAME TEXT NOT NULL, TEMPLATEVALUE TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS TEMPLATE;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO TEMPLATE(TEMPLATENAME, TEMPLATEVALUE, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE TEMPLATE SET TEMPLATENAME = ?, TEMPLATEVALUE = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.templateName);
    statement.bindString(2, this.templateValue);
    statement.bindString(3, DateAdapter.compactDate(this.timestamp));
    statement.bindString(4, DateAdapter.compactDate(this.changestamp));
    statement.bindString(5, this.deletestamp.toString());
    statement.bindLong(6, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT TEMPLATENAME, TEMPLATEVALUE, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM TEMPLATE WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM TEMPLATE WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM TEMPLATE;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static TemplateSQL query(final String templateName)
  {
    List<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TemplateSQL.BLANK,
          "templateName = ? AND deletestamp = 'false'",
          templateName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static TemplateSQL queryOrderBy(final String templateName, final String order)
  {
    List<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TemplateSQL.BLANK,
          "templateName = ? AND deletestamp = 'false'",
          order, templateName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static TemplateSQL querySince(final String templateName, final Date since)
  {
    List<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TemplateSQL.BLANK,
          "templateName = ? AND changestamp >= ?",
          templateName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static TemplateSQL queryOrderBySince(final String templateName, final String order, final Date since)
  {
    List<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TemplateSQL.BLANK,
          "templateName = ? AND changestamp >= ?",
          order, templateName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<TemplateSQL> queryAll()
  {
    LinkedList<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TemplateSQL.BLANK, "deletestamp = 'false'", "");
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<TemplateSQL> queryAllOrderBy(final String order)
  {
    LinkedList<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TemplateSQL.BLANK, "deletestamp = 'false'", "", order);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<TemplateSQL> queryAllSince(final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TemplateSQL.BLANK,
          filter,
          DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<TemplateSQL> queryAllOrderBySince(final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<TemplateSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TemplateSQL.BLANK,
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
    TemplateSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TemplateSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.templateName = recordSQL.templateName;
      this.templateValue = recordSQL.templateValue;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static TemplateSQL get(final Long id)
  {
    TemplateSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TemplateSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    TemplateSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TemplateSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.templateName = recordSQL.templateName;
      this.templateValue = recordSQL.templateValue;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static TemplateSQL get(final Long id, final Date since)
  {
    TemplateSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TemplateSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final TemplateSQL recordSQL)
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
    TemplateSQL recordOLD = TemplateSQL.query(templateName);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    TemplateSQL recordSQL = TemplateSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(TemplateSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(TemplateSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(TemplateSQL.BLANK, this.id);
  }

  public static TemplateXML queryAsXML(final String templateName)
  {
    TemplateSQL recordSQL = TemplateSQL.query(templateName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TemplateXML queryOrderByAsXML(final String templateName, String order)
  {
    TemplateSQL recordSQL = TemplateSQL.queryOrderBy(templateName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<TemplateXML> queryAllAsXML()
  {
    List<TemplateSQL> recordsSQL = TemplateSQL.queryAll();
    LinkedList<TemplateXML> recordsXML = new LinkedList<TemplateXML>();
    for (TemplateSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<TemplateXML> queryAllOrderByAsXML(String order)
  {
    List<TemplateSQL> recordsSQL = TemplateSQL.queryAllOrderBy(order);
    LinkedList<TemplateXML> recordsXML = new LinkedList<TemplateXML>();
    for (TemplateSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static TemplateXML getAsXML(final Long id)
  {
    TemplateSQL recordSQL = TemplateSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_TemplateName = 1;
  public static final int ID_TemplateValue = 2;
  public static final int ID_Timestamp = 3;
  public static final int ID_Changestamp = 4;
  public static final int ID_Deletestamp = 5;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_TemplateName: return templateName;
      case ID_TemplateValue: return templateValue;
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
      case ID_TemplateName: { templateName = (String) value; return; }
      case ID_TemplateValue: { templateValue = (String) value; return; }
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
      case ID_TemplateName: return "templateName";
      case ID_TemplateValue: return "templateValue";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
