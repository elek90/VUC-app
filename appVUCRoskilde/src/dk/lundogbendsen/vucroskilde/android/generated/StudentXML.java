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
public class StudentXML extends CommonXML implements Serializable
{
  @Element
  AddressableXML contact;
  public AddressableXML getContact() { return contact; }
  public void setContact(final AddressableXML contact) { this.contact = contact; }

  @Element(required=false)
  String password = "";
  public String getPassword() { return password; }
  public void setPassword(final String password) { this.password = password; }

  @Element
  Long parentTeam;
  public Long getParentTeam() { return parentTeam; }
  public void setParentTeam(final Long parentTeam) { this.parentTeam = parentTeam; }

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

  protected StudentXML()
  {
    super();
    this.contact = AddressableXML.create();
    this.password = "";
    this.parentTeam = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static StudentXML create()
  {
    return new StudentXML();
  }

  public static final StudentXML BLANK = StudentXML.create();
  @Override public StudentXML getBlank() { return BLANK; }

  @Override public StudentXML copy()
  {
    StudentXML n = StudentXML.create();
    n.id = this.id;
    n.contact.setName(this.contact.getName());
    n.contact.setEmail(this.contact.getEmail());
    n.contact.setWebsiteURL(this.contact.getWebsiteURL());
    n.contact.setPhone(this.contact.getPhone());
    n.contact.setTwitterAddress(this.contact.getTwitterAddress());
    n.contact.setAddress1(this.contact.getAddress1());
    n.contact.setAddress2(this.contact.getAddress2());
    n.contact.setZip(this.contact.getZip());
    n.contact.setCity(this.contact.getCity());
    n.contact.setCountryISO(this.contact.getCountryISO());
    n.contact.setCountry(this.contact.getCountry());
    n.password = this.password;
    n.parentTeam = this.parentTeam;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "StudentXML" +
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
  public StudentSQL asSQL()
  {
    StudentSQL recordSQL = new StudentSQL();
    recordSQL.id = this.id; 
    recordSQL.contact.setName(this.contact.getName()); 
    recordSQL.contact.setEmail(this.contact.getEmail()); 
    recordSQL.contact.setWebsiteURL(this.contact.getWebsiteURL()); 
    recordSQL.contact.setPhone(this.contact.getPhone()); 
    recordSQL.contact.setTwitterAddress(this.contact.getTwitterAddress()); 
    recordSQL.contact.setAddress1(this.contact.getAddress1()); 
    recordSQL.contact.setAddress2(this.contact.getAddress2()); 
    recordSQL.contact.setZip(this.contact.getZip()); 
    recordSQL.contact.setCity(this.contact.getCity()); 
    recordSQL.contact.setCountryISO(this.contact.getCountryISO()); 
    recordSQL.contact.setCountry(this.contact.getCountry()); 
    recordSQL.password = this.password; 
    recordSQL.parentTeam = this.parentTeam; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static StudentXML query(final Long parentTeam)
  {
    StudentSQL recordSQL = StudentSQL.query(parentTeam);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StudentXML queryOrderBy(final Long parentTeam, final String order)
  {
    StudentSQL recordSQL = StudentSQL.queryOrderBy(parentTeam, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StudentXML querySince(final Long parentTeam, final Date since)
  {
    StudentSQL recordSQL = StudentSQL.querySince(parentTeam, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StudentXML queryOrderBySince(final Long parentTeam, final String order, final Date since)
  {
    StudentSQL recordSQL = StudentSQL.queryOrderBySince(parentTeam, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<StudentXML> queryAll(final Long parentTeam)
  {
    List<StudentSQL> recordListSQL = StudentSQL.queryAll(parentTeam);
    List<StudentXML> recordListXML = new LinkedList<StudentXML>();
    for (StudentSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<StudentXML> queryAllOrderBy(final Long parentTeam, final String order)
  {
    List<StudentSQL> recordListSQL = StudentSQL.queryAllOrderBy(parentTeam, order);
    List<StudentXML> recordListXML = new LinkedList<StudentXML>();
    for (StudentSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<StudentXML> queryAllSince(final Long parentTeam, final Date since)
  {
    List<StudentSQL> recordListSQL = StudentSQL.queryAllSince(parentTeam, since);
    List<StudentXML> recordListXML = new LinkedList<StudentXML>();
    for (StudentSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<StudentXML> queryAllOrderBySince(final Long parentTeam, final String order, final Date since)
  {
    List<StudentSQL> recordListSQL = StudentSQL.queryAllOrderBySince(parentTeam, order, since);
    List<StudentXML> recordListXML = new LinkedList<StudentXML>();
    for (StudentSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static StudentXML get(final Long id)
  {
    StudentSQL recordSQL = StudentSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StudentXML get(final Long id, final Date since)
  {
    StudentSQL recordSQL = StudentSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
