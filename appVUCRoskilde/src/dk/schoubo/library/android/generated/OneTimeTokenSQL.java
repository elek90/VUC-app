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


public class OneTimeTokenSQL extends CommonSQL implements Comparable<OneTimeTokenSQL>
{
  Long id;
  public Long getId() { return id; }

  String oneTimeToken;
  public String getOneTimeToken() { return oneTimeToken; }
  public void setOneTimeToken(final String oneTimeToken) { this.oneTimeToken = oneTimeToken; }

  String paymentToken;
  public String getPaymentToken() { return paymentToken; }
  public void setPaymentToken(final String paymentToken) { this.paymentToken = paymentToken; }

  Long userId;
  public Long getUserId() { return userId; }
  public void setUserId(final Long userId) { this.userId = userId; }

  Date tokenExpirationTime;
  public Date getTokenExpirationTime() { return tokenExpirationTime; }
  public void setTokenExpirationTime(final Date tokenExpirationTime) { this.tokenExpirationTime = tokenExpirationTime; }

  Date purchaseExpirationTime;
  public Date getPurchaseExpirationTime() { return purchaseExpirationTime; }
  public void setPurchaseExpirationTime(final Date purchaseExpirationTime) { this.purchaseExpirationTime = purchaseExpirationTime; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  OneTimeTokenSQL()
  {
    super();
    this.oneTimeToken = "";
    this.paymentToken = "";
    this.userId = 0L;
    this.tokenExpirationTime = new Date();
    this.purchaseExpirationTime = new Date();
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static OneTimeTokenSQL create() { return new OneTimeTokenSQL(); }

  public static final OneTimeTokenSQL BLANK = OneTimeTokenSQL.create();
  @Override public OneTimeTokenSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final OneTimeTokenSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof OneTimeTokenSQL) && (this.id.equals(((OneTimeTokenSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public OneTimeTokenSQL copy()
  {
    OneTimeTokenSQL recordSQL = new OneTimeTokenSQL();
    recordSQL.id = this.getId();
    recordSQL.oneTimeToken = this.oneTimeToken;
    recordSQL.paymentToken = this.paymentToken;
    recordSQL.userId = this.userId;
    recordSQL.tokenExpirationTime = this.tokenExpirationTime;
    recordSQL.purchaseExpirationTime = this.purchaseExpirationTime;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "OneTimeTokenSQL" +
      "[" +
        "id=" + id + ", " +
        "oneTimeToken=" + oneTimeToken + ", " +
        "paymentToken=" + paymentToken + ", " +
        "userId=" + userId + ", " +
        "tokenExpirationTime=" + tokenExpirationTime + ", " +
        "purchaseExpirationTime=" + purchaseExpirationTime + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public OneTimeTokenXML asXML()
  {
    OneTimeTokenXML recordXML = OneTimeTokenXML.create(this.getOneTimeToken());
    recordXML.setId(this.getId());
    recordXML.setPaymentToken(this.getPaymentToken());
    recordXML.setUserId(this.getUserId());
    recordXML.setTokenExpirationTime(this.getTokenExpirationTime());
    recordXML.setPurchaseExpirationTime(this.getPurchaseExpirationTime());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public OneTimeTokenSQL copy(Cursor cursor)
  {
    OneTimeTokenSQL recordSQL = new OneTimeTokenSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.oneTimeToken = cursor.getString(cursor.getColumnIndex("ONETIMETOKEN"));
    recordSQL.paymentToken = cursor.getString(cursor.getColumnIndex("PAYMENTTOKEN"));
    recordSQL.userId = cursor.getLong(cursor.getColumnIndex("USERID"));
    recordSQL.tokenExpirationTime = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TOKENEXPIRATIONTIME")));
    recordSQL.purchaseExpirationTime = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("PURCHASEEXPIRATIONTIME")));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "ONETIMETOKEN";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, ONETIMETOKEN, PAYMENTTOKEN, USERID, TOKENEXPIRATIONTIME, PURCHASEEXPIRATIONTIME, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE ONETIMETOKEN(ID INTEGER, ONETIMETOKEN TEXT NOT NULL, PAYMENTTOKEN TEXT NOT NULL, USERID INTEGER NOT NULL, TOKENEXPIRATIONTIME TEXT NOT NULL, PURCHASEEXPIRATIONTIME TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS ONETIMETOKEN;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO ONETIMETOKEN(ONETIMETOKEN, PAYMENTTOKEN, USERID, TOKENEXPIRATIONTIME, PURCHASEEXPIRATIONTIME, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE ONETIMETOKEN SET ONETIMETOKEN = ?, PAYMENTTOKEN = ?, USERID = ?, TOKENEXPIRATIONTIME = ?, PURCHASEEXPIRATIONTIME = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.oneTimeToken);
    statement.bindString(2, this.paymentToken);
    statement.bindLong(3, this.userId);
    statement.bindString(4, DateAdapter.compactDate(this.tokenExpirationTime));
    statement.bindString(5, DateAdapter.compactDate(this.purchaseExpirationTime));
    statement.bindString(6, DateAdapter.compactDate(this.timestamp));
    statement.bindString(7, DateAdapter.compactDate(this.changestamp));
    statement.bindString(8, this.deletestamp.toString());
    statement.bindLong(9, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT ONETIMETOKEN, PAYMENTTOKEN, USERID, TOKENEXPIRATIONTIME, PURCHASEEXPIRATIONTIME, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM ONETIMETOKEN WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM ONETIMETOKEN WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM ONETIMETOKEN;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static OneTimeTokenSQL query(final String oneTimeToken)
  {
    List<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(OneTimeTokenSQL.BLANK,
          "oneTimeToken = ? AND deletestamp = 'false'",
          oneTimeToken);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static OneTimeTokenSQL queryOrderBy(final String oneTimeToken, final String order)
  {
    List<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(OneTimeTokenSQL.BLANK,
          "oneTimeToken = ? AND deletestamp = 'false'",
          order, oneTimeToken);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static OneTimeTokenSQL querySince(final String oneTimeToken, final Date since)
  {
    List<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(OneTimeTokenSQL.BLANK,
          "oneTimeToken = ? AND changestamp >= ?",
          oneTimeToken, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static OneTimeTokenSQL queryOrderBySince(final String oneTimeToken, final String order, final Date since)
  {
    List<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(OneTimeTokenSQL.BLANK,
          "oneTimeToken = ? AND changestamp >= ?",
          order, oneTimeToken, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<OneTimeTokenSQL> queryAll()
  {
    LinkedList<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(OneTimeTokenSQL.BLANK, "deletestamp = 'false'", "");
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<OneTimeTokenSQL> queryAllOrderBy(final String order)
  {
    LinkedList<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(OneTimeTokenSQL.BLANK, "deletestamp = 'false'", "", order);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<OneTimeTokenSQL> queryAllSince(final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(OneTimeTokenSQL.BLANK,
          filter,
          DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<OneTimeTokenSQL> queryAllOrderBySince(final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<OneTimeTokenSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(OneTimeTokenSQL.BLANK,
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
    OneTimeTokenSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(OneTimeTokenSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.oneTimeToken = recordSQL.oneTimeToken;
      this.paymentToken = recordSQL.paymentToken;
      this.userId = recordSQL.userId;
      this.tokenExpirationTime = recordSQL.tokenExpirationTime;
      this.purchaseExpirationTime = recordSQL.purchaseExpirationTime;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static OneTimeTokenSQL get(final Long id)
  {
    OneTimeTokenSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(OneTimeTokenSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    OneTimeTokenSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(OneTimeTokenSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.oneTimeToken = recordSQL.oneTimeToken;
      this.paymentToken = recordSQL.paymentToken;
      this.userId = recordSQL.userId;
      this.tokenExpirationTime = recordSQL.tokenExpirationTime;
      this.purchaseExpirationTime = recordSQL.purchaseExpirationTime;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static OneTimeTokenSQL get(final Long id, final Date since)
  {
    OneTimeTokenSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(OneTimeTokenSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final OneTimeTokenSQL recordSQL)
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
    OneTimeTokenSQL recordOLD = OneTimeTokenSQL.query(oneTimeToken);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(OneTimeTokenSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(OneTimeTokenSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(OneTimeTokenSQL.BLANK, this.id);
  }

  public static OneTimeTokenXML queryAsXML(final String oneTimeToken)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.query(oneTimeToken);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static OneTimeTokenXML queryOrderByAsXML(final String oneTimeToken, String order)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.queryOrderBy(oneTimeToken, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<OneTimeTokenXML> queryAllAsXML()
  {
    List<OneTimeTokenSQL> recordsSQL = OneTimeTokenSQL.queryAll();
    LinkedList<OneTimeTokenXML> recordsXML = new LinkedList<OneTimeTokenXML>();
    for (OneTimeTokenSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<OneTimeTokenXML> queryAllOrderByAsXML(String order)
  {
    List<OneTimeTokenSQL> recordsSQL = OneTimeTokenSQL.queryAllOrderBy(order);
    LinkedList<OneTimeTokenXML> recordsXML = new LinkedList<OneTimeTokenXML>();
    for (OneTimeTokenSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static OneTimeTokenXML getAsXML(final Long id)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_OneTimeToken = 1;
  public static final int ID_PaymentToken = 2;
  public static final int ID_UserId = 3;
  public static final int ID_TokenExpirationTime = 4;
  public static final int ID_PurchaseExpirationTime = 5;
  public static final int ID_Timestamp = 6;
  public static final int ID_Changestamp = 7;
  public static final int ID_Deletestamp = 8;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_OneTimeToken: return oneTimeToken;
      case ID_PaymentToken: return paymentToken;
      case ID_UserId: return userId;
      case ID_TokenExpirationTime: return tokenExpirationTime;
      case ID_PurchaseExpirationTime: return purchaseExpirationTime;
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
      case ID_OneTimeToken: { oneTimeToken = (String) value; return; }
      case ID_PaymentToken: { paymentToken = (String) value; return; }
      case ID_UserId: { userId = (Long) value; return; }
      case ID_TokenExpirationTime: { tokenExpirationTime = (Date) value; return; }
      case ID_PurchaseExpirationTime: { purchaseExpirationTime = (Date) value; return; }
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
      case ID_OneTimeToken: return "oneTimeToken";
      case ID_PaymentToken: return "paymentToken";
      case ID_UserId: return "userId";
      case ID_TokenExpirationTime: return "tokenExpirationTime";
      case ID_PurchaseExpirationTime: return "purchaseExpirationTime";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
