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
public class SchoolXML extends CommonXML implements Serializable
{
  @Element(required=false)
  String schoolName = "";
  public String getSchoolName() { return schoolName; }
  public void setSchoolName(final String schoolName) { this.schoolName = schoolName; }

  @Element
  AddressableXML contactPerson;
  public AddressableXML getContactPerson() { return contactPerson; }
  public void setContactPerson(final AddressableXML contactPerson) { this.contactPerson = contactPerson; }

  @Element(required=false)
  String logoURL = "";
  public String getLogoURL() { return logoURL; }
  public void setLogoURL(final String logoURL) { this.logoURL = logoURL; }

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
  Collection<FlowchartXML> flowcharts;
  @Element
  int flowchartsSize;
  public void clearFlowcharts() { this.flowcharts.clear(); flowchartsSize = 0; }
  public FlowchartXML addFlowcharts(final FlowchartXML record) { this.flowcharts.add(record); flowchartsSize = this.flowcharts.size(); return record; }
  public Collection<FlowchartXML> addAllFlowcharts(final Collection<FlowchartXML> records) { this.flowcharts.addAll(records); flowchartsSize = this.flowcharts.size(); return records; }
  public Collection<FlowchartXML> getFlowcharts() { return flowcharts; }
  public int getFlowchartsSize() { return flowchartsSize; }

  @ElementList(inline=true, required=false)
  Collection<TeamXML> teams;
  @Element
  int teamsSize;
  public void clearTeams() { this.teams.clear(); teamsSize = 0; }
  public TeamXML addTeams(final TeamXML record) { this.teams.add(record); teamsSize = this.teams.size(); return record; }
  public Collection<TeamXML> addAllTeams(final Collection<TeamXML> records) { this.teams.addAll(records); teamsSize = this.teams.size(); return records; }
  public Collection<TeamXML> getTeams() { return teams; }
  public int getTeamsSize() { return teamsSize; }

  protected SchoolXML()
  {
    super();
    this.schoolName = "";
    this.contactPerson = AddressableXML.create();
    this.logoURL = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
    this.flowcharts = new LinkedList<FlowchartXML>();
    this.teams = new LinkedList<TeamXML>();
  }

  public static SchoolXML create()
  {
    return new SchoolXML();
  }

  public SchoolXML(final String schoolName)
   {
    this();
    this.schoolName = schoolName;
  }

  public static SchoolXML create(final String schoolName)
  {
    return new SchoolXML(schoolName);
  }

  public static final SchoolXML BLANK = SchoolXML.create();
  @Override public SchoolXML getBlank() { return BLANK; }

  @Override public SchoolXML copy()
  {
    SchoolXML n = SchoolXML.create();
    n.id = this.id;
    n.schoolName = this.schoolName;
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
    n.logoURL = this.logoURL;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    n.flowcharts.addAll(this.flowcharts);
    n.flowchartsSize = n.flowcharts.size();
    n.teams.addAll(this.teams);
    n.teamsSize = n.teams.size();
    return n;
  }

  @Override
  public String toString()
  {
    return "SchoolXML" +
      "[" +
        "id=" + id + ", " +
        "schoolName=" + schoolName + ", " +
        "contactPerson=" + contactPerson + ", " +
        "logoURL=" + logoURL + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp + ", " +
        "flowcharts: {" + flowcharts.size() + "}" + ", " +
        "flowchartsSize=" + flowchartsSize + ", " +
        "teams: {" + teams.size() + "}" + ", " +
        "teamsSize=" + teamsSize +
      "]";
  }

  @Override
  public SchoolSQL asSQL()
  {
    SchoolSQL recordSQL = new SchoolSQL();
    recordSQL.id = this.id; 
    recordSQL.schoolName = this.schoolName; 
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
    recordSQL.logoURL = this.logoURL; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static SchoolXML query(final String schoolName)
  {
    SchoolSQL recordSQL = SchoolSQL.query(schoolName);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static SchoolXML queryOrderBy(final String schoolName, final String order)
  {
    SchoolSQL recordSQL = SchoolSQL.queryOrderBy(schoolName, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static SchoolXML querySince(final String schoolName, final Date since)
  {
    SchoolSQL recordSQL = SchoolSQL.querySince(schoolName, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static SchoolXML queryOrderBySince(final String schoolName, final String order, final Date since)
  {
    SchoolSQL recordSQL = SchoolSQL.queryOrderBySince(schoolName, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<SchoolXML> queryAll()
  {
    List<SchoolSQL> recordListSQL = SchoolSQL.queryAll();
    List<SchoolXML> recordListXML = new LinkedList<SchoolXML>();
    for (SchoolSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartxml"))
    {
      return new LinkedList<CommonXML>(FlowchartXML.queryAll(this.id));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamxml"))
    {
      return new LinkedList<CommonXML>(TeamXML.queryAll(this.id));
    }
    else
      return null;
  }
  public static List<SchoolXML> queryAllOrderBy(final String order)
  {
    List<SchoolSQL> recordListSQL = SchoolSQL.queryAllOrderBy(order);
    List<SchoolXML> recordListXML = new LinkedList<SchoolXML>();
    for (SchoolSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartxml"))
    {
      return new LinkedList<CommonXML>(FlowchartXML.queryAllOrderBy(this.id, order));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamxml"))
    {
      return new LinkedList<CommonXML>(TeamXML.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }
  public static List<SchoolXML> queryAllSince(final Date since)
  {
    List<SchoolSQL> recordListSQL = SchoolSQL.queryAllSince(since);
    List<SchoolXML> recordListXML = new LinkedList<SchoolXML>();
    for (SchoolSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartxml"))
    {
      return new LinkedList<CommonXML>(FlowchartXML.queryAllSince(this.id, since));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamxml"))
    {
      return new LinkedList<CommonXML>(TeamXML.queryAllSince(this.id, since));
    }
    else
      return null;
  }
  public static List<SchoolXML> queryAllOrderBySince(final String order, final Date since)
  {
    List<SchoolSQL> recordListSQL = SchoolSQL.queryAllOrderBySince(order, since);
    List<SchoolXML> recordListXML = new LinkedList<SchoolXML>();
    for (SchoolSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("flowchart") || name.equalsIgnoreCase("flowchartxml"))
    {
      return new LinkedList<CommonXML>(FlowchartXML.queryAllOrderBySince(this.id, order, since));
    }
    else if (name.equalsIgnoreCase("team") || name.equalsIgnoreCase("teamxml"))
    {
      return new LinkedList<CommonXML>(TeamXML.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }
  public static SchoolXML get(final Long id)
  {
    SchoolSQL recordSQL = SchoolSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static SchoolXML get(final Long id, final Date since)
  {
    SchoolSQL recordSQL = SchoolSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
