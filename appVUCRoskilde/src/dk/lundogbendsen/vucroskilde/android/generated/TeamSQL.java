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


public class TeamSQL extends CommonSQL implements Comparable<TeamSQL>
{
  Long id;
  public Long getId() { return id; }

  String teamName;
  public String getTeamName() { return teamName; }
  public void setTeamName(final String teamName) { this.teamName = teamName; }

  AddressableSQL contactPerson;
  public AddressableSQL getContactPerson() { return contactPerson; }
  public void setContactPerson(final AddressableSQL contactPerson) { this.contactPerson = contactPerson; }

  Long parentSchool;
  public Long getParentSchool() { return parentSchool; }
  public void setParentSchool(final SchoolSQL parentSchool) { this.parentSchool = parentSchool.getId(); }
  public void setParentSchool(final Long parentSchoolId) { this.parentSchool = parentSchoolId; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  TeamSQL()
  {
    super();
    this.teamName = "";
    this.contactPerson = new AddressableSQL();
    this.parentSchool = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static TeamSQL create() { return new TeamSQL(); }

  public static final TeamSQL BLANK = TeamSQL.create();
  @Override public TeamSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final TeamSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof TeamSQL) && (this.id.equals(((TeamSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public TeamSQL copy()
  {
    TeamSQL recordSQL = new TeamSQL();
    recordSQL.id = this.getId();
    recordSQL.teamName = this.teamName;
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
    recordSQL.parentSchool = this.parentSchool;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "TeamSQL" +
      "[" +
        "id=" + id + ", " +
        "teamName=" + teamName + ", " +
        "contactPerson=" + contactPerson + ", " +
        "parentSchool=" + parentSchool + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public TeamXML asXML()
  {
    TeamXML recordXML = TeamXML.create(this.getTeamName());
    recordXML.setId(this.getId());
    recordXML.setContactPerson(this.getContactPerson().asXML());
    recordXML.setParentSchool(this.getParentSchool());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public TeamSQL copy(Cursor cursor)
  {
    TeamSQL recordSQL = new TeamSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.teamName = cursor.getString(cursor.getColumnIndex("TEAMNAME"));
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
    recordSQL.parentSchool = cursor.getLong(cursor.getColumnIndex("PARENTSCHOOL"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "TEAM";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, TEAMNAME, CONTACTPERSON_NAME, CONTACTPERSON_EMAIL, CONTACTPERSON_WEBSITEURL, CONTACTPERSON_PHONE, CONTACTPERSON_TWITTERADDRESS, CONTACTPERSON_ADDRESS1, CONTACTPERSON_ADDRESS2, CONTACTPERSON_ZIP, CONTACTPERSON_CITY, CONTACTPERSON_COUNTRYISO, CONTACTPERSON_COUNTRY, PARENTSCHOOL, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE TEAM(ID INTEGER, TEAMNAME TEXT NOT NULL, CONTACTPERSON_NAME TEXT NOT NULL, CONTACTPERSON_EMAIL TEXT NOT NULL, CONTACTPERSON_WEBSITEURL TEXT NOT NULL, CONTACTPERSON_PHONE TEXT NOT NULL, CONTACTPERSON_TWITTERADDRESS TEXT NOT NULL, CONTACTPERSON_ADDRESS1 TEXT NOT NULL, CONTACTPERSON_ADDRESS2 TEXT NOT NULL, CONTACTPERSON_ZIP TEXT NOT NULL, CONTACTPERSON_CITY TEXT NOT NULL, CONTACTPERSON_COUNTRYISO TEXT NOT NULL, CONTACTPERSON_COUNTRY TEXT NOT NULL, PARENTSCHOOL INTEGER NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS TEAM;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO TEAM(TEAMNAME, CONTACTPERSON_NAME, CONTACTPERSON_EMAIL, CONTACTPERSON_WEBSITEURL, CONTACTPERSON_PHONE, CONTACTPERSON_TWITTERADDRESS, CONTACTPERSON_ADDRESS1, CONTACTPERSON_ADDRESS2, CONTACTPERSON_ZIP, CONTACTPERSON_CITY, CONTACTPERSON_COUNTRYISO, CONTACTPERSON_COUNTRY, PARENTSCHOOL, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE TEAM SET TEAMNAME = ?, CONTACTPERSON_NAME = ?, CONTACTPERSON_EMAIL = ?, CONTACTPERSON_WEBSITEURL = ?, CONTACTPERSON_PHONE = ?, CONTACTPERSON_TWITTERADDRESS = ?, CONTACTPERSON_ADDRESS1 = ?, CONTACTPERSON_ADDRESS2 = ?, CONTACTPERSON_ZIP = ?, CONTACTPERSON_CITY = ?, CONTACTPERSON_COUNTRYISO = ?, CONTACTPERSON_COUNTRY = ?, PARENTSCHOOL = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindString(1, this.teamName);
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
    statement.bindLong(13, this.parentSchool);
    statement.bindString(14, DateAdapter.compactDate(this.timestamp));
    statement.bindString(15, DateAdapter.compactDate(this.changestamp));
    statement.bindString(16, this.deletestamp.toString());
    statement.bindLong(17, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT TEAMNAME, CONTACTPERSON_NAME, CONTACTPERSON_EMAIL, CONTACTPERSON_WEBSITEURL, CONTACTPERSON_PHONE, CONTACTPERSON_TWITTERADDRESS, CONTACTPERSON_ADDRESS1, CONTACTPERSON_ADDRESS2, CONTACTPERSON_ZIP, CONTACTPERSON_CITY, CONTACTPERSON_COUNTRYISO, CONTACTPERSON_COUNTRY, PARENTSCHOOL, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM TEAM WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM TEAM WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM TEAM;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static TeamSQL query(final String teamName, final Long parentSchool)
  {
    List<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TeamSQL.BLANK,
          "teamName = ? AND parentSchool = ? AND deletestamp = 'false'",
          teamName, ""+parentSchool);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static TeamSQL queryOrderBy(final String teamName, final Long parentSchool, final String order)
  {
    List<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TeamSQL.BLANK,
          "teamName = ? AND parentSchool = ? AND deletestamp = 'false'",
          order, teamName, ""+parentSchool);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static TeamSQL querySince(final String teamName, final Long parentSchool, final Date since)
  {
    List<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TeamSQL.BLANK,
          "teamName = ? AND parentSchool = ? AND changestamp >= ?",
          teamName, ""+parentSchool, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static TeamSQL queryOrderBySince(final String teamName, final Long parentSchool, final String order, final Date since)
  {
    List<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TeamSQL.BLANK,
          "teamName = ? AND parentSchool = ? AND changestamp >= ?",
          order, teamName, ""+parentSchool, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<TeamSQL> queryAll(final Long parentSchool)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentSchool != null) filter += sep.next() + "parentSchool = ?";
    LinkedList<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TeamSQL.BLANK,
          filter,
          ""+parentSchool);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentsql"))
    {
      return new LinkedList<CommonSQL>(StudentSQL.queryAll(this.id));
    }
    else
      return null;
  }

  public static LinkedList<TeamSQL> queryAllOrderBy(final Long parentSchool, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentSchool != null) filter += sep.next() + "parentSchool = ?";
    LinkedList<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TeamSQL.BLANK,
          filter,
          order, ""+parentSchool);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentsql"))
    {
      return new LinkedList<CommonSQL>(StudentSQL.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }

  public static LinkedList<TeamSQL> queryAllSince(final Long parentSchool, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentSchool != null) filter += sep.next() + "parentSchool = ?";
    LinkedList<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(TeamSQL.BLANK,
          filter,
          ""+parentSchool, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentsql"))
    {
      return new LinkedList<CommonSQL>(StudentSQL.queryAllSince(this.id, since));
    }
    else
      return null;
  }

  public static LinkedList<TeamSQL> queryAllOrderBySince(final Long parentSchool, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentSchool != null) filter += sep.next() + "parentSchool = ?";
    LinkedList<TeamSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(TeamSQL.BLANK,
          filter,
          order, ""+parentSchool, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentsql"))
    {
      return new LinkedList<CommonSQL>(StudentSQL.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }

  @Override
  public void get()
  {
    TeamSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TeamSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.teamName = recordSQL.teamName;
      this.contactPerson = recordSQL.contactPerson;
      this.parentSchool = recordSQL.parentSchool;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static TeamSQL get(final Long id)
  {
    TeamSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TeamSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    TeamSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TeamSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.teamName = recordSQL.teamName;
      this.contactPerson = recordSQL.contactPerson;
      this.parentSchool = recordSQL.parentSchool;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static TeamSQL get(final Long id, final Date since)
  {
    TeamSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(TeamSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final TeamSQL recordSQL)
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
    TeamSQL recordOLD = TeamSQL.query(teamName, parentSchool);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    TeamSQL recordSQL = TeamSQL.get(id);
    if (recordSQL == null) return;
    recordSQL.changestamp = new Date();
    recordSQL.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL, true);

    List<StudentSQL> childStudentRecordsSQL = StudentSQL.queryAll(recordSQL.id);
    for (StudentSQL childStudentRecordSQL : childStudentRecordsSQL)
    {
      childStudentRecordSQL.delete();
    }
  }

  @Override
  public void delete()
  {
    this.changestamp = new Date();
    this.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);

    List<StudentSQL> childStudentRecordsSQL = StudentSQL.queryAll(this.id);
    for (StudentSQL childStudentRecordSQL : childStudentRecordsSQL)
    {
      childStudentRecordSQL.delete();
    }
  }

  public static void remove(final Long id)
  {
    TeamSQL recordSQL = TeamSQL.get(id);
    if (recordSQL == null) return;
    GlobalSQLStructure.getDBHelper().deleteObjectById(TeamSQL.BLANK, id);

    List<StudentSQL> childStudentRecordsSQL = StudentSQL.queryAll(recordSQL.id);
    for (StudentSQL childStudentRecordSQL : childStudentRecordsSQL)
    {
      childStudentRecordSQL.remove();
    }
  }

  public static void removeAll(final Set<Long> ids)
  {
    List<TeamSQL> recordsSQL = new LinkedList<TeamSQL>();
    for (Long id : ids)
    {
      TeamSQL recordSQL = TeamSQL.get(id);
      if (recordSQL != null)
      {
        recordsSQL.add(recordSQL);
      }
    }
    GlobalSQLStructure.getDBHelper().deleteObjectsById(TeamSQL.BLANK, ids);
    for (TeamSQL recordSQL : recordsSQL)
    {

      List<StudentSQL> childStudentRecordsSQL = StudentSQL.queryAll(recordSQL.id);
      for (StudentSQL childStudentRecordSQL : childStudentRecordsSQL)
      {
        childStudentRecordSQL.remove();
      }
    }
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(TeamSQL.BLANK, this.id);

    List<StudentSQL> childStudentRecordsSQL = StudentSQL.queryAll(this.id);
    for (StudentSQL childStudentRecordSQL : childStudentRecordsSQL)
    {
      childStudentRecordSQL.remove();
    }
  }

  public static TeamXML queryAsXML(final String teamName, final Long parentSchool)
  {
    TeamSQL recordSQL = TeamSQL.query(teamName, parentSchool);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TeamXML queryOrderByAsXML(final String teamName, final Long parentSchool, String order)
  {
    TeamSQL recordSQL = TeamSQL.queryOrderBy(teamName, parentSchool, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<TeamXML> queryAllAsXML(final Long parentSchool)
  {
    List<TeamSQL> recordsSQL = TeamSQL.queryAll(parentSchool);
    LinkedList<TeamXML> recordsXML = new LinkedList<TeamXML>();
    for (TeamSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<TeamXML> queryAllOrderByAsXML(final Long parentSchool, String order)
  {
    List<TeamSQL> recordsSQL = TeamSQL.queryAllOrderBy(parentSchool, order);
    LinkedList<TeamXML> recordsXML = new LinkedList<TeamXML>();
    for (TeamSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static TeamXML getAsXML(final Long id)
  {
    TeamSQL recordSQL = TeamSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_TeamName = 1;
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
  public static final int ID_ParentSchool = 13;
  public static final int ID_Timestamp = 14;
  public static final int ID_Changestamp = 15;
  public static final int ID_Deletestamp = 16;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_TeamName: return teamName;
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
      case ID_ParentSchool: return parentSchool;
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
      case ID_TeamName: { teamName = (String) value; return; }
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
      case ID_ParentSchool: { parentSchool = (Long) value; return; }
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
      case ID_TeamName: return "teamName";
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
      case ID_ParentSchool: return "parentSchool";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
