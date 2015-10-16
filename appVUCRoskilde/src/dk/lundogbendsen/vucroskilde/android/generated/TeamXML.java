/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.schoubo.library.android.CommonXML;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import org.simpleframework.xml.*;


@Root
public class TeamXML extends CommonXML implements Serializable
{
  @Element(required=false)
  String teamName = "";
  public String getTeamName() { return teamName; }
  public void setTeamName(final String teamName) { this.teamName = teamName; }

  @Element
  AddressableXML contactPerson;
  public AddressableXML getContactPerson() { return contactPerson; }
  public void setContactPerson(final AddressableXML contactPerson) { this.contactPerson = contactPerson; }

  @Element
  Long parentSchool;
  public Long getParentSchool() { return parentSchool; }
  public void setParentSchool(final Long parentSchool) { this.parentSchool = parentSchool; }

  @Element
  Date timestamp;
  public Date getTimestamp() { return timestamp; }
  public void setTimestamp(final Date timestamp) { this.timestamp = timestamp; }

  @Element
  Date changestamp;
  public Date getChangestamp() { return changestamp; }
  public void setChangestamp(final Date changestamp) { this.changestamp = changestamp; }

  @Element
  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }
  public void setDeletestamp(final Boolean deletestamp) { this.deletestamp = deletestamp; }

  @ElementList(inline=true, required=false)
  Collection<StudentXML> students;
  @Element
  int studentsSize;
  public void clearStudents() { this.students.clear(); studentsSize = 0; }
  public StudentXML addStudents(final StudentXML record) { this.students.add(record); studentsSize = this.students.size(); return record; }
  public Collection<StudentXML> addAllStudents(final Collection<StudentXML> records) { this.students.addAll(records); studentsSize = this.students.size(); return records; }
  public Collection<StudentXML> getStudents() { return students; }
  public int getStudentsSize() { return studentsSize; }

  protected TeamXML()
  {
    super();
    this.teamName = "";
    this.contactPerson = AddressableXML.create();
    this.parentSchool = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
    this.students = new LinkedList<StudentXML>();
  }

  public static TeamXML create()
  {
    return new TeamXML();
  }

  public TeamXML(final String teamName)
   {
    this();
    this.teamName = teamName;
  }

  public static TeamXML create(final String teamName)
  {
    return new TeamXML(teamName);
  }

  public static final TeamXML BLANK = TeamXML.create();
  @Override public TeamXML getBlank() { return BLANK; }

  @Override public TeamXML copy()
  {
    TeamXML n = TeamXML.create();
    n.id = this.id;
    n.teamName = this.teamName;
    n.contactPerson.setName(this.contactPerson.getName());
    n.contactPerson.setEmail(this.contactPerson.getEmail());
    n.contactPerson.setWebsiteURL(this.contactPerson.getWebsiteURL());
    n.contactPerson.setPhone(this.contactPerson.getPhone());
    n.contactPerson.setTwitterAddress(this.contactPerson.getTwitterAddress());
    n.contactPerson.setAddress1(this.contactPerson.getAddress1());
    n.contactPerson.setAddress2(this.contactPerson.getAddress2());
    n.contactPerson.setZip(this.contactPerson.getZip());
    n.contactPerson.setCity(this.contactPerson.getCity());
    n.contactPerson.setCountryISO(this.contactPerson.getCountryISO());
    n.contactPerson.setCountry(this.contactPerson.getCountry());
    n.parentSchool = this.parentSchool;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    n.students.addAll(this.students);
    n.studentsSize = n.students.size();
    return n;
  }

  @Override
  public String toString()
  {
    return "TeamXML" +
      "[" +
        "id=" + id + ", " +
        "teamName=" + teamName + ", " +
        "contactPerson=" + contactPerson + ", " +
        "parentSchool=" + parentSchool + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp + ", " +
        "students: {" + students.size() + "}" + ", " +
        "studentsSize=" + studentsSize +
      "]";
  }

  @Override
  public TeamSQL asSQL()
  {
    TeamSQL recordSQL = new TeamSQL();
    recordSQL.id = this.id; 
    recordSQL.teamName = this.teamName; 
    recordSQL.contactPerson.setName(this.contactPerson.getName()); 
    recordSQL.contactPerson.setEmail(this.contactPerson.getEmail()); 
    recordSQL.contactPerson.setWebsiteURL(this.contactPerson.getWebsiteURL()); 
    recordSQL.contactPerson.setPhone(this.contactPerson.getPhone()); 
    recordSQL.contactPerson.setTwitterAddress(this.contactPerson.getTwitterAddress()); 
    recordSQL.contactPerson.setAddress1(this.contactPerson.getAddress1()); 
    recordSQL.contactPerson.setAddress2(this.contactPerson.getAddress2()); 
    recordSQL.contactPerson.setZip(this.contactPerson.getZip()); 
    recordSQL.contactPerson.setCity(this.contactPerson.getCity()); 
    recordSQL.contactPerson.setCountryISO(this.contactPerson.getCountryISO()); 
    recordSQL.contactPerson.setCountry(this.contactPerson.getCountry()); 
    recordSQL.parentSchool = this.parentSchool; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static TeamXML query(final String teamName, final Long parentSchool)
  {
    TeamSQL recordSQL = TeamSQL.query(teamName, parentSchool);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TeamXML queryOrderBy(final String teamName, final Long parentSchool, final String order)
  {
    TeamSQL recordSQL = TeamSQL.queryOrderBy(teamName, parentSchool, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TeamXML querySince(final String teamName, final Long parentSchool, final Date since)
  {
    TeamSQL recordSQL = TeamSQL.querySince(teamName, parentSchool, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TeamXML queryOrderBySince(final String teamName, final Long parentSchool, final String order, final Date since)
  {
    TeamSQL recordSQL = TeamSQL.queryOrderBySince(teamName, parentSchool, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<TeamXML> queryAll(final Long parentSchool)
  {
    List<TeamSQL> recordListSQL = TeamSQL.queryAll(parentSchool);
    List<TeamXML> recordListXML = new LinkedList<TeamXML>();
    for (TeamSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentxml"))
    {
      return new LinkedList<CommonXML>(StudentXML.queryAll(this.id));
    }
    else
      return null;
  }
  public static List<TeamXML> queryAllOrderBy(final Long parentSchool, final String order)
  {
    List<TeamSQL> recordListSQL = TeamSQL.queryAllOrderBy(parentSchool, order);
    List<TeamXML> recordListXML = new LinkedList<TeamXML>();
    for (TeamSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentxml"))
    {
      return new LinkedList<CommonXML>(StudentXML.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }
  public static List<TeamXML> queryAllSince(final Long parentSchool, final Date since)
  {
    List<TeamSQL> recordListSQL = TeamSQL.queryAllSince(parentSchool, since);
    List<TeamXML> recordListXML = new LinkedList<TeamXML>();
    for (TeamSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentxml"))
    {
      return new LinkedList<CommonXML>(StudentXML.queryAllSince(this.id, since));
    }
    else
      return null;
  }
  public static List<TeamXML> queryAllOrderBySince(final Long parentSchool, final String order, final Date since)
  {
    List<TeamSQL> recordListSQL = TeamSQL.queryAllOrderBySince(parentSchool, order, since);
    List<TeamXML> recordListXML = new LinkedList<TeamXML>();
    for (TeamSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("student") || name.equalsIgnoreCase("studentxml"))
    {
      return new LinkedList<CommonXML>(StudentXML.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }
  public static TeamXML get(final Long id)
  {
    TeamSQL recordSQL = TeamSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static TeamXML get(final Long id, final Date since)
  {
    TeamSQL recordSQL = TeamSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
