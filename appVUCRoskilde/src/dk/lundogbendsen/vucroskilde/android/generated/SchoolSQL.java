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


public class SchoolSQL extends CommonSQL implements Comparable<SchoolSQL>
{
  Long id;
  public Long getId() { return id; }

  String schoolName;
  public String getSchoolName() { return schoolName; }
  public void setSchoolName(final String schoolName) { this.schoolName = schoolName; }

  AddressableSQL contactPerson;
  public AddressableSQL getContactPerson() { return contactPerson; }
  public void setContactPerson(final AddressableSQL contactPerson) { this.contactPerson = contactPerson; }

  String logoURL;
  public String getLogoURL() { return logoURL; }
  public void setLogoURL(final String logoURL) { this.logoURL = logoURL; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  SchoolSQL()
  {
    super();
    this.schoolName = "";
    this.contactPerson = new AddressableSQL();
    this.logoURL = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static SchoolSQL create() { return new SchoolSQL(); }

  public static final SchoolSQL BLANK = SchoolSQL.create();
  @Override public SchoolSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final SchoolSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof SchoolSQL) && (this.id.equals(((SchoolSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public SchoolSQL copy()
  {
    SchoolSQL recordSQL = new SchoolSQL();
    recordSQL.id = this.getId();
    recordSQL.schoolName = this.schoolName;
    recordSQL.contactPerson.name = this.contactPerson.name;
    recordSQL.contactPerson.email = this.contactPerson.email;
    recordSQL.contactPerson.websiteURL = this.contactPerson.websiteURL;
    recordSQL.contactPerson.phone = this.contactPerson.phone;
    recordSQL.contactPerson.twitterAddress = this.contactPerson.twitterAddress;
    recordSQL.contactPerson.address1 = this.contactPerson.address1;
    recordSQL.contactPerson.address2 = this.contactPerson.address2;
    recordSQL.contactPerson.zip = this.contactPerson.zip;
    recordSQL.contactPerson.city = this.contactPerson.city;
    recordSQL.contactPerson.countryISO = this.contactPerson.countryISO;
    recordSQL.contactPerson.country = this.contactPerson.country;
    recordSQL.logoURL = this.logoURL;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "SchoolSQL" +
      "[" +
        "id=" + id + ", " +
        "schoolName=" + schoolName + ", " +
        "contactPerson=" + contactPerson + ", " +
        "logoURL=" + logoURL + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public SchoolXML asXML()
  {
    SchoolXML recordXML = SchoolXML.create(this.getSchoolName());
    recordXML.setId(this.getId());
    recordXML.setContactPerson(this.getContactPerson().asXML());
    recordXML.setLogoURL(this.getLogoURL());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public SchoolSQL copy(Cursor cursor)
  {
    SchoolSQL recordSQL = new SchoolSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.schoolName = cursor.getString(cursor.getColumnIndex("SCHOOLNAME"));
    recordSQL.contactPerson.name = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_NAME"));
    recordSQL.contactPerson.email = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_EMAIL"));
    recordSQL.contactPerson.websiteURL = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_WEBSITEURL"));
    recordSQL.contactPerson.phone = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_PHONE"));
    recordSQL.contactPerson.twitterAddress = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_TWITTERADDRESS"));
    recordSQL.contactPerson.address1 = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_ADDRESS1"));
    recordSQL.contactPerson.address2 = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_ADDRESS2"));
    recordSQL.contactPerson.zip = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_ZIP"));
    recordSQL.contactPerson.city = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_CITY"));
    recordSQL.contactPerson.countryISO = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_COUNTRYISO"));
    recordSQL.contactPerson.country = cursor.getString(cursor.getColumnIndex("CONTACTPERSON_COUNTRY"));
    recordSQL.logoURL = cursor.getString(cursor.getColumnIndex("LOGOURL"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "SCHOOL";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, SCHOOLNAME, CONTACTPERSON_NAME, CONTACTPERSON_EMAIL, CONTACTPERSON_WEBSITEURL, CONTACTPERSON_PHONE, CONTACTPERSON_TWITTERADDRESS, CONTACTPERSON_ADDRESS1, CONTACTPERSON_ADDRESS2, CONTACTPERSON_ZIP, CONTACTPERSON_CITY, CONTACTPERSON_COUNTRYISO, CONTACTPERSON_COUNTRY, LOGOURL, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE SCHOOL(ID INTEGER, SCHOOLNAME TEXT NOT NULL, CONTACTPERSON_NAME TEXT NOT NULL, CONTACTPERSON_EMAIL TEXT NOT NULL, CONTACTPERSON_WEBSITEURL TEXT NOT NULL, CONTACTPERSON_PHONE TEXT NOT NULL, CONTACTPERSON_TWITTERADDRESS TEXT NOT NULL, CONTACTPERSON_ADDRESS1 TEXT NOT NULL, CONTACTPERSON_ADDRESS2 TEXT NOT NULL, CONTACTPERSON_ZIP TEXT NOT NULL, CONTACTPERSON_CITY TEXT NOT NULL, CONTACTPERSON_COUNTRYISO TEXT NOT NULL, CONTACTPERSON_COUNTRY TEXT NOT NULL, LOGOURL TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS SCHOOL;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO SCHOOL(SCHOOLNAME, CONTACTPERSON_NAME, CONTACTPERSON_EMAIL, CONTACTPERSON_WEBSITEURL, CONTACTPERSON_PHONE, CONTACTPERSON_TWITTERADDRESS, CONTACTPERSON_ADDRESS1, CONTACTPERSON_ADDRESS2, CONTACTPERSON_ZIP, CONTACTPERSON_CITY, CONTACTPERSON_COUNTRYISO, CONTACTPERSON_COUNTRY, LOGOURL, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE SCHOOL SET SCHOOLNAME = ?, CONTACTPERSON_NAME = ?, CONTACTPERSON_EMAIL = ?, CONTACTPERSON_WEBSITEURL = ?, CONTACTPERSON_PHONE = ?, CONTACTPERSON_TWITTERADDRESS = ?, CONTACTPERSON_ADDRESS1 = ?, CONTACTPERSON_ADDRESS2 = ?, CONTACTPERSON_ZIP = ?, CONTACTPERSON_CITY = ?, CONTACTPERSON_COUNTRYISO = ?, CONTACTPERSON_COUNTRY = ?, LOGOURL = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.schoolName);
    statement.bindString(2, this.contactPerson.name);
    statement.bindString(3, this.contactPerson.email);
    statement.bindString(4, this.contactPerson.websiteURL);
    statement.bindString(5, this.contactPerson.phone);
    statement.bindString(6, this.contactPerson.twitterAddress);
    statement.bindString(7, this.contactPerson.address1);
    statement.bindString(8, this.contactPerson.address2);
    statement.bindString(9, this.contactPerson.zip);
    statement.bindString(10, this.contactPerson.city);
    statement.bindString(11, this.contactPerson.countryISO);
    statement.bindString(12, this.contactPerson.country);
    statement.bindString(13, this.logoURL);
    statement.bindString(14, DateAdapter.compactDate(this.timestamp));
    statement.bindString(15, DateAdapter.compactDate(this.changestamp));
    statement.bindString(16, this.deletestamp.toString());
    statement.bindLong(17, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT SCHOOLNAME, CONTACTPERSON_NAME, CONTACTPERSON_EMAIL, CONTACTPERSON_WEBSITEURL, CONTACTPERSON_PHONE, CONTACTPERSON_TWITTERADDRESS, CONTACTPERSON_ADDRESS1, CONTACTPERSON_ADDRESS2, CONTACTPERSON_ZIP, CONTACTPERSON_CITY, CONTACTPERSON_COUNTRYISO, CONTACTPERSON_COUNTRY, LOGOURL, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM SCHOOL WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM SCHOOL WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM SCHOOL;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static SchoolSQL query(final String schoolName)
  {
    List<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(SchoolSQL.BLANK,
          "schoolName = ? AND deletestamp = 'false'",
          schoolName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static SchoolSQL queryOrderBy(final String schoolName, final String order)
  {
    List<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(SchoolSQL.BLANK,
          "schoolName = ? AND deletestamp = 'false'",
          order, schoolName);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static SchoolSQL querySince(final String schoolName, final Date since)
  {
    List<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(SchoolSQL.BLANK,
          "schoolName = ? AND changestamp >= ?",
          schoolName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static SchoolSQL queryOrderBySince(final String schoolName, final String order, final Date since)
  {
    List<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(SchoolSQL.BLANK,
          "schoolName = ? AND changestamp >= ?",
          order, schoolName, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<SchoolSQL> queryAll()
  {
    LinkedList<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(SchoolSQL.BLANK, "deletestamp = 'false'", "");
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartsql"))
    {
      return new LinkedList<CommonSQL>(FlowchartSQL.queryAll(this.id));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamsql"))
    {
      return new LinkedList<CommonSQL>(TeamSQL.queryAll(this.id));
    }
    else
      return null;
  }

  public static LinkedList<SchoolSQL> queryAllOrderBy(final String order)
  {
    LinkedList<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(SchoolSQL.BLANK, "deletestamp = 'false'", "", order);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartsql"))
    {
      return new LinkedList<CommonSQL>(FlowchartSQL.queryAllOrderBy(this.id, order));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamsql"))
    {
      return new LinkedList<CommonSQL>(TeamSQL.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }

  public static LinkedList<SchoolSQL> queryAllSince(final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(SchoolSQL.BLANK,
          filter,
          DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartsql"))
    {
      return new LinkedList<CommonSQL>(FlowchartSQL.queryAllSince(this.id, since));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamsql"))
    {
      return new LinkedList<CommonSQL>(TeamSQL.queryAllSince(this.id, since));
    }
    else
      return null;
  }

  public static LinkedList<SchoolSQL> queryAllOrderBySince(final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    LinkedList<SchoolSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(SchoolSQL.BLANK,
          filter,
          order, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartsql"))
    {
      return new LinkedList<CommonSQL>(FlowchartSQL.queryAllOrderBySince(this.id, order, since));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamsql"))
    {
      return new LinkedList<CommonSQL>(TeamSQL.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }

  @Override
  public void get()
  {
    SchoolSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(SchoolSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.schoolName = recordSQL.schoolName;
      this.contactPerson = recordSQL.contactPerson;
      this.logoURL = recordSQL.logoURL;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static SchoolSQL get(final Long id)
  {
    SchoolSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(SchoolSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    SchoolSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(SchoolSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.schoolName = recordSQL.schoolName;
      this.contactPerson = recordSQL.contactPerson;
      this.logoURL = recordSQL.logoURL;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static SchoolSQL get(final Long id, final Date since)
  {
    SchoolSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(SchoolSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final SchoolSQL recordSQL)
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
    SchoolSQL recordOLD = SchoolSQL.query(schoolName);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    SchoolSQL recordSQL = SchoolSQL.get(id);
    if (recordSQL == null) return;
    recordSQL.changestamp = new Date();
    recordSQL.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL, true);

    List<FlowchartSQL> childFlowchartRecordsSQL = FlowchartSQL.queryAll(recordSQL.id);
    for (FlowchartSQL childFlowchartRecordSQL : childFlowchartRecordsSQL)
    {
      childFlowchartRecordSQL.delete();
    }

    List<TeamSQL> childTeamRecordsSQL = TeamSQL.queryAll(recordSQL.id);
    for (TeamSQL childTeamRecordSQL : childTeamRecordsSQL)
    {
      childTeamRecordSQL.delete();
    }
  }

  @Override
  public void delete()
  {
    this.changestamp = new Date();
    this.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);

    List<FlowchartSQL> childFlowchartRecordsSQL = FlowchartSQL.queryAll(this.id);
    for (FlowchartSQL childFlowchartRecordSQL : childFlowchartRecordsSQL)
    {
      childFlowchartRecordSQL.delete();
    }

    List<TeamSQL> childTeamRecordsSQL = TeamSQL.queryAll(this.id);
    for (TeamSQL childTeamRecordSQL : childTeamRecordsSQL)
    {
      childTeamRecordSQL.delete();
    }
  }

  public static void remove(final Long id)
  {
    SchoolSQL recordSQL = SchoolSQL.get(id);
    if (recordSQL == null) return;
    GlobalSQLStructure.getDBHelper().deleteObjectById(SchoolSQL.BLANK, id);

    List<FlowchartSQL> childFlowchartRecordsSQL = FlowchartSQL.queryAll(recordSQL.id);
    for (FlowchartSQL childFlowchartRecordSQL : childFlowchartRecordsSQL)
    {
      childFlowchartRecordSQL.remove();
    }

    List<TeamSQL> childTeamRecordsSQL = TeamSQL.queryAll(recordSQL.id);
    for (TeamSQL childTeamRecordSQL : childTeamRecordsSQL)
    {
      childTeamRecordSQL.remove();
    }
  }

  public static void removeAll(final Set<Long> ids)
  {
    List<SchoolSQL> recordsSQL = new LinkedList<SchoolSQL>();
    for (Long id : ids)
    {
      SchoolSQL recordSQL = SchoolSQL.get(id);
      if (recordSQL != null)
      {
        recordsSQL.add(recordSQL);
      }
    }
    GlobalSQLStructure.getDBHelper().deleteObjectsById(SchoolSQL.BLANK, ids);
    for (SchoolSQL recordSQL : recordsSQL)
    {

      List<FlowchartSQL> childFlowchartRecordsSQL = FlowchartSQL.queryAll(recordSQL.id);
      for (FlowchartSQL childFlowchartRecordSQL : childFlowchartRecordsSQL)
      {
        childFlowchartRecordSQL.remove();
      }

      List<TeamSQL> childTeamRecordsSQL = TeamSQL.queryAll(recordSQL.id);
      for (TeamSQL childTeamRecordSQL : childTeamRecordsSQL)
      {
        childTeamRecordSQL.remove();
      }
    }
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(SchoolSQL.BLANK, this.id);

    List<FlowchartSQL> childFlowchartRecordsSQL = FlowchartSQL.queryAll(this.id);
    for (FlowchartSQL childFlowchartRecordSQL : childFlowchartRecordsSQL)
    {
      childFlowchartRecordSQL.remove();
    }

    List<TeamSQL> childTeamRecordsSQL = TeamSQL.queryAll(this.id);
    for (TeamSQL childTeamRecordSQL : childTeamRecordsSQL)
    {
      childTeamRecordSQL.remove();
    }
  }

  public static SchoolXML queryAsXML(final String schoolName)
  {
    SchoolSQL recordSQL = SchoolSQL.query(schoolName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static SchoolXML queryOrderByAsXML(final String schoolName, String order)
  {
    SchoolSQL recordSQL = SchoolSQL.queryOrderBy(schoolName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<SchoolXML> queryAllAsXML()
  {
    List<SchoolSQL> recordsSQL = SchoolSQL.queryAll();
    LinkedList<SchoolXML> recordsXML = new LinkedList<SchoolXML>();
    for (SchoolSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<SchoolXML> queryAllOrderByAsXML(String order)
  {
    List<SchoolSQL> recordsSQL = SchoolSQL.queryAllOrderBy(order);
    LinkedList<SchoolXML> recordsXML = new LinkedList<SchoolXML>();
    for (SchoolSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static SchoolXML getAsXML(final Long id)
  {
    SchoolSQL recordSQL = SchoolSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_SchoolName = 1;
  public static final int ID_ContactPersonName = 2;
  public static final int ID_ContactPersonEmail = 3;
  public static final int ID_ContactPersonWebsiteURL = 4;
  public static final int ID_ContactPersonPhone = 5;
  public static final int ID_ContactPersonTwitterAddress = 6;
  public static final int ID_ContactPersonAddress1 = 7;
  public static final int ID_ContactPersonAddress2 = 8;
  public static final int ID_ContactPersonZip = 9;
  public static final int ID_ContactPersonCity = 10;
  public static final int ID_ContactPersonCountryISO = 11;
  public static final int ID_ContactPersonCountry = 12;
  public static final int ID_LogoURL = 13;
  public static final int ID_Timestamp = 14;
  public static final int ID_Changestamp = 15;
  public static final int ID_Deletestamp = 16;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_SchoolName: return schoolName;
      case ID_ContactPersonName: return contactPerson.getName();
      case ID_ContactPersonEmail: return contactPerson.getEmail();
      case ID_ContactPersonWebsiteURL: return contactPerson.getWebsiteURL();
      case ID_ContactPersonPhone: return contactPerson.getPhone();
      case ID_ContactPersonTwitterAddress: return contactPerson.getTwitterAddress();
      case ID_ContactPersonAddress1: return contactPerson.getAddress1();
      case ID_ContactPersonAddress2: return contactPerson.getAddress2();
      case ID_ContactPersonZip: return contactPerson.getZip();
      case ID_ContactPersonCity: return contactPerson.getCity();
      case ID_ContactPersonCountryISO: return contactPerson.getCountryISO();
      case ID_ContactPersonCountry: return contactPerson.getCountry();
      case ID_LogoURL: return logoURL;
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
      case ID_SchoolName: { schoolName = (String) value; return; }
      case ID_ContactPersonName: { contactPerson.setName( (String) value); return; }
      case ID_ContactPersonEmail: { contactPerson.setEmail( (String) value); return; }
      case ID_ContactPersonWebsiteURL: { contactPerson.setWebsiteURL( (String) value); return; }
      case ID_ContactPersonPhone: { contactPerson.setPhone( (String) value); return; }
      case ID_ContactPersonTwitterAddress: { contactPerson.setTwitterAddress( (String) value); return; }
      case ID_ContactPersonAddress1: { contactPerson.setAddress1( (String) value); return; }
      case ID_ContactPersonAddress2: { contactPerson.setAddress2( (String) value); return; }
      case ID_ContactPersonZip: { contactPerson.setZip( (String) value); return; }
      case ID_ContactPersonCity: { contactPerson.setCity( (String) value); return; }
      case ID_ContactPersonCountryISO: { contactPerson.setCountryISO( (String) value); return; }
      case ID_ContactPersonCountry: { contactPerson.setCountry( (String) value); return; }
      case ID_LogoURL: { logoURL = (String) value; return; }
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
      case ID_SchoolName: return "schoolName";
      case ID_ContactPersonName: return "contactPerson.name";
      case ID_ContactPersonEmail: return "contactPerson.email";
      case ID_ContactPersonWebsiteURL: return "contactPerson.websiteURL";
      case ID_ContactPersonPhone: return "contactPerson.phone";
      case ID_ContactPersonTwitterAddress: return "contactPerson.twitterAddress";
      case ID_ContactPersonAddress1: return "contactPerson.address1";
      case ID_ContactPersonAddress2: return "contactPerson.address2";
      case ID_ContactPersonZip: return "contactPerson.zip";
      case ID_ContactPersonCity: return "contactPerson.city";
      case ID_ContactPersonCountryISO: return "contactPerson.countryISO";
      case ID_ContactPersonCountry: return "contactPerson.country";
      case ID_LogoURL: return "logoURL";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
