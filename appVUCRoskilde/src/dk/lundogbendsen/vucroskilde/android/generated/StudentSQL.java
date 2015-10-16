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


public class StudentSQL extends CommonSQL implements Comparable<StudentSQL>
{
  Long id;
  public Long getId() { return id; }

  AddressableSQL contact;
  public AddressableSQL getContact() { return contact; }
  public void setContact(final AddressableSQL contact) { this.contact = contact; }

  String password;
  public String getPassword() { return password; }
  public void setPassword(final String password) { this.password = password; }

  Long parentTeam;
  public Long getParentTeam() { return parentTeam; }
  public void setParentTeam(final TeamSQL parentTeam) { this.parentTeam = parentTeam.getId(); }
  public void setParentTeam(final Long parentTeamId) { this.parentTeam = parentTeamId; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  StudentSQL()
  {
    super();
    this.contact = new AddressableSQL();
    this.password = "";
    this.parentTeam = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static StudentSQL create() { return new StudentSQL(); }

  public static final StudentSQL BLANK = StudentSQL.create();
  @Override public StudentSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final StudentSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof StudentSQL) && (this.id.equals(((StudentSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public StudentSQL copy()
  {
    StudentSQL recordSQL = new StudentSQL();
    recordSQL.id = this.getId();
    recordSQL.contact.name = this.contact.name;
    recordSQL.contact.email = this.contact.email;
    recordSQL.contact.websiteURL = this.contact.websiteURL;
    recordSQL.contact.phone = this.contact.phone;
    recordSQL.contact.twitterAddress = this.contact.twitterAddress;
    recordSQL.contact.address1 = this.contact.address1;
    recordSQL.contact.address2 = this.contact.address2;
    recordSQL.contact.zip = this.contact.zip;
    recordSQL.contact.city = this.contact.city;
    recordSQL.contact.countryISO = this.contact.countryISO;
    recordSQL.contact.country = this.contact.country;
    recordSQL.password = this.password;
    recordSQL.parentTeam = this.parentTeam;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "StudentSQL" +
      "[" +
        "id=" + id + ", " +
        "contact=" + contact + ", " +
        "password=(...)" + ", " +
        "parentTeam=" + parentTeam + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public StudentXML asXML()
  {
    StudentXML recordXML = StudentXML.create();
    recordXML.setId(this.getId());
    recordXML.setContact(this.getContact().asXML());
    recordXML.setPassword(this.getPassword());
    recordXML.setParentTeam(this.getParentTeam());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public StudentSQL copy(Cursor cursor)
  {
    StudentSQL recordSQL = new StudentSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.contact.name = cursor.getString(cursor.getColumnIndex("CONTACT_NAME"));
    recordSQL.contact.email = cursor.getString(cursor.getColumnIndex("CONTACT_EMAIL"));
    recordSQL.contact.websiteURL = cursor.getString(cursor.getColumnIndex("CONTACT_WEBSITEURL"));
    recordSQL.contact.phone = cursor.getString(cursor.getColumnIndex("CONTACT_PHONE"));
    recordSQL.contact.twitterAddress = cursor.getString(cursor.getColumnIndex("CONTACT_TWITTERADDRESS"));
    recordSQL.contact.address1 = cursor.getString(cursor.getColumnIndex("CONTACT_ADDRESS1"));
    recordSQL.contact.address2 = cursor.getString(cursor.getColumnIndex("CONTACT_ADDRESS2"));
    recordSQL.contact.zip = cursor.getString(cursor.getColumnIndex("CONTACT_ZIP"));
    recordSQL.contact.city = cursor.getString(cursor.getColumnIndex("CONTACT_CITY"));
    recordSQL.contact.countryISO = cursor.getString(cursor.getColumnIndex("CONTACT_COUNTRYISO"));
    recordSQL.contact.country = cursor.getString(cursor.getColumnIndex("CONTACT_COUNTRY"));
    recordSQL.password = cursor.getString(cursor.getColumnIndex("PASSWORD"));
    recordSQL.parentTeam = cursor.getLong(cursor.getColumnIndex("PARENTTEAM"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "STUDENT";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, CONTACT_NAME, CONTACT_EMAIL, CONTACT_WEBSITEURL, CONTACT_PHONE, CONTACT_TWITTERADDRESS, CONTACT_ADDRESS1, CONTACT_ADDRESS2, CONTACT_ZIP, CONTACT_CITY, CONTACT_COUNTRYISO, CONTACT_COUNTRY, PASSWORD, PARENTTEAM, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE STUDENT(ID INTEGER, CONTACT_NAME TEXT NOT NULL, CONTACT_EMAIL TEXT NOT NULL, CONTACT_WEBSITEURL TEXT NOT NULL, CONTACT_PHONE TEXT NOT NULL, CONTACT_TWITTERADDRESS TEXT NOT NULL, CONTACT_ADDRESS1 TEXT NOT NULL, CONTACT_ADDRESS2 TEXT NOT NULL, CONTACT_ZIP TEXT NOT NULL, CONTACT_CITY TEXT NOT NULL, CONTACT_COUNTRYISO TEXT NOT NULL, CONTACT_COUNTRY TEXT NOT NULL, PASSWORD TEXT NOT NULL, PARENTTEAM INTEGER NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS STUDENT;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO STUDENT(CONTACT_NAME, CONTACT_EMAIL, CONTACT_WEBSITEURL, CONTACT_PHONE, CONTACT_TWITTERADDRESS, CONTACT_ADDRESS1, CONTACT_ADDRESS2, CONTACT_ZIP, CONTACT_CITY, CONTACT_COUNTRYISO, CONTACT_COUNTRY, PASSWORD, PARENTTEAM, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE STUDENT SET CONTACT_NAME = ?, CONTACT_EMAIL = ?, CONTACT_WEBSITEURL = ?, CONTACT_PHONE = ?, CONTACT_TWITTERADDRESS = ?, CONTACT_ADDRESS1 = ?, CONTACT_ADDRESS2 = ?, CONTACT_ZIP = ?, CONTACT_CITY = ?, CONTACT_COUNTRYISO = ?, CONTACT_COUNTRY = ?, PASSWORD = ?, PARENTTEAM = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.contact.name);
    statement.bindString(2, this.contact.email);
    statement.bindString(3, this.contact.websiteURL);
    statement.bindString(4, this.contact.phone);
    statement.bindString(5, this.contact.twitterAddress);
    statement.bindString(6, this.contact.address1);
    statement.bindString(7, this.contact.address2);
    statement.bindString(8, this.contact.zip);
    statement.bindString(9, this.contact.city);
    statement.bindString(10, this.contact.countryISO);
    statement.bindString(11, this.contact.country);
    statement.bindString(12, this.password);
    statement.bindLong(13, this.parentTeam);
    statement.bindString(14, DateAdapter.compactDate(this.timestamp));
    statement.bindString(15, DateAdapter.compactDate(this.changestamp));
    statement.bindString(16, this.deletestamp.toString());
    statement.bindLong(17, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT CONTACT_NAME, CONTACT_EMAIL, CONTACT_WEBSITEURL, CONTACT_PHONE, CONTACT_TWITTERADDRESS, CONTACT_ADDRESS1, CONTACT_ADDRESS2, CONTACT_ZIP, CONTACT_CITY, CONTACT_COUNTRYISO, CONTACT_COUNTRY, PASSWORD, PARENTTEAM, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM STUDENT WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM STUDENT WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM STUDENT;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static StudentSQL query(final Long parentTeam)
  {
    List<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StudentSQL.BLANK,
          "parentTeam = ? AND deletestamp = 'false'",
          ""+parentTeam);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static StudentSQL queryOrderBy(final Long parentTeam, final String order)
  {
    List<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StudentSQL.BLANK,
          "parentTeam = ? AND deletestamp = 'false'",
          order, ""+parentTeam);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static StudentSQL querySince(final Long parentTeam, final Date since)
  {
    List<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StudentSQL.BLANK,
          "parentTeam = ? AND changestamp >= ?",
          ""+parentTeam, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static StudentSQL queryOrderBySince(final Long parentTeam, final String order, final Date since)
  {
    List<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StudentSQL.BLANK,
          "parentTeam = ? AND changestamp >= ?",
          order, ""+parentTeam, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<StudentSQL> queryAll(final Long parentTeam)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentTeam != null) filter += sep.next() + "parentTeam = ?";
    LinkedList<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StudentSQL.BLANK,
          filter,
          ""+parentTeam);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<StudentSQL> queryAllOrderBy(final Long parentTeam, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentTeam != null) filter += sep.next() + "parentTeam = ?";
    LinkedList<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StudentSQL.BLANK,
          filter,
          order, ""+parentTeam);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<StudentSQL> queryAllSince(final Long parentTeam, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentTeam != null) filter += sep.next() + "parentTeam = ?";
    LinkedList<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(StudentSQL.BLANK,
          filter,
          ""+parentTeam, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<StudentSQL> queryAllOrderBySince(final Long parentTeam, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentTeam != null) filter += sep.next() + "parentTeam = ?";
    LinkedList<StudentSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(StudentSQL.BLANK,
          filter,
          order, ""+parentTeam, DateAdapter.compactDate(since));
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
    StudentSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StudentSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.contact = recordSQL.contact;
      this.password = recordSQL.password;
      this.parentTeam = recordSQL.parentTeam;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static StudentSQL get(final Long id)
  {
    StudentSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StudentSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    StudentSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StudentSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.contact = recordSQL.contact;
      this.password = recordSQL.password;
      this.parentTeam = recordSQL.parentTeam;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static StudentSQL get(final Long id, final Date since)
  {
    StudentSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(StudentSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final StudentSQL recordSQL)
  {
    recordSQL.changestamp = new Date();
    recordSQL.password = SQLUtil.hashString(recordSQL.password);
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL);
  }

  @Override
  public void write()
  {
    this.changestamp = new Date();
    this.password = SQLUtil.hashString(this.password);
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);
  }

  @Override
  public void update()
  {
    StudentSQL recordOLD = StudentSQL.query(parentTeam);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    StudentSQL recordSQL = StudentSQL.get(id);
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
    GlobalSQLStructure.getDBHelper().deleteObjectById(StudentSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(StudentSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(StudentSQL.BLANK, this.id);
  }

  public static StudentXML queryAsXML(final Long parentTeam)
  {
    StudentSQL recordSQL = StudentSQL.query(parentTeam);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StudentXML queryOrderByAsXML(final Long parentTeam, String order)
  {
    StudentSQL recordSQL = StudentSQL.queryOrderBy(parentTeam, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<StudentXML> queryAllAsXML(final Long parentTeam)
  {
    List<StudentSQL> recordsSQL = StudentSQL.queryAll(parentTeam);
    LinkedList<StudentXML> recordsXML = new LinkedList<StudentXML>();
    for (StudentSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<StudentXML> queryAllOrderByAsXML(final Long parentTeam, String order)
  {
    List<StudentSQL> recordsSQL = StudentSQL.queryAllOrderBy(parentTeam, order);
    LinkedList<StudentXML> recordsXML = new LinkedList<StudentXML>();
    for (StudentSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static StudentXML getAsXML(final Long id)
  {
    StudentSQL recordSQL = StudentSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_ContactName = 1;
  public static final int ID_ContactEmail = 2;
  public static final int ID_ContactWebsiteURL = 3;
  public static final int ID_ContactPhone = 4;
  public static final int ID_ContactTwitterAddress = 5;
  public static final int ID_ContactAddress1 = 6;
  public static final int ID_ContactAddress2 = 7;
  public static final int ID_ContactZip = 8;
  public static final int ID_ContactCity = 9;
  public static final int ID_ContactCountryISO = 10;
  public static final int ID_ContactCountry = 11;
  public static final int ID_Password = 12;
  public static final int ID_ParentTeam = 13;
  public static final int ID_Timestamp = 14;
  public static final int ID_Changestamp = 15;
  public static final int ID_Deletestamp = 16;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_ContactName: return contact.getName();
      case ID_ContactEmail: return contact.getEmail();
      case ID_ContactWebsiteURL: return contact.getWebsiteURL();
      case ID_ContactPhone: return contact.getPhone();
      case ID_ContactTwitterAddress: return contact.getTwitterAddress();
      case ID_ContactAddress1: return contact.getAddress1();
      case ID_ContactAddress2: return contact.getAddress2();
      case ID_ContactZip: return contact.getZip();
      case ID_ContactCity: return contact.getCity();
      case ID_ContactCountryISO: return contact.getCountryISO();
      case ID_ContactCountry: return contact.getCountry();
      case ID_Password: return password;
      case ID_ParentTeam: return parentTeam;
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
      case ID_ContactName: { contact.setName( (String) value); return; }
      case ID_ContactEmail: { contact.setEmail( (String) value); return; }
      case ID_ContactWebsiteURL: { contact.setWebsiteURL( (String) value); return; }
      case ID_ContactPhone: { contact.setPhone( (String) value); return; }
      case ID_ContactTwitterAddress: { contact.setTwitterAddress( (String) value); return; }
      case ID_ContactAddress1: { contact.setAddress1( (String) value); return; }
      case ID_ContactAddress2: { contact.setAddress2( (String) value); return; }
      case ID_ContactZip: { contact.setZip( (String) value); return; }
      case ID_ContactCity: { contact.setCity( (String) value); return; }
      case ID_ContactCountryISO: { contact.setCountryISO( (String) value); return; }
      case ID_ContactCountry: { contact.setCountry( (String) value); return; }
      case ID_Password: { password = (String) value; return; }
      case ID_ParentTeam: { parentTeam = (Long) value; return; }
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
      case ID_ContactName: return "contact.name";
      case ID_ContactEmail: return "contact.email";
      case ID_ContactWebsiteURL: return "contact.websiteURL";
      case ID_ContactPhone: return "contact.phone";
      case ID_ContactTwitterAddress: return "contact.twitterAddress";
      case ID_ContactAddress1: return "contact.address1";
      case ID_ContactAddress2: return "contact.address2";
      case ID_ContactZip: return "contact.zip";
      case ID_ContactCity: return "contact.city";
      case ID_ContactCountryISO: return "contact.countryISO";
      case ID_ContactCountry: return "contact.country";
      case ID_Password: return "password";
      case ID_ParentTeam: return "parentTeam";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
