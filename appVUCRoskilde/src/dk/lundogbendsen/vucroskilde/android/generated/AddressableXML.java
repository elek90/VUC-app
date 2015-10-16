/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.schoubo.library.android.CommonBaseXML;
import java.io.Serializable;
import org.simpleframework.xml.*;


public class AddressableXML extends CommonBaseXML implements Serializable
{
  @Element(required=false)
  String name = "";
  public String getName() { return name; }
  public void setName(final String name) { this.name = name; }

  @Element(required=false)
  String email = "";
  public String getEmail() { return email; }
  public void setEmail(final String email) { this.email = email; }

  @Element(required=false)
  String websiteURL = "";
  public String getWebsiteURL() { return websiteURL; }
  public void setWebsiteURL(final String websiteURL) { this.websiteURL = websiteURL; }

  @Element(required=false)
  String phone = "";
  public String getPhone() { return phone; }
  public void setPhone(final String phone) { this.phone = phone; }

  @Element(required=false)
  String twitterAddress = "";
  public String getTwitterAddress() { return twitterAddress; }
  public void setTwitterAddress(final String twitterAddress) { this.twitterAddress = twitterAddress; }

  @Element(required=false)
  String address1 = "";
  public String getAddress1() { return address1; }
  public void setAddress1(final String address1) { this.address1 = address1; }

  @Element(required=false)
  String address2 = "";
  public String getAddress2() { return address2; }
  public void setAddress2(final String address2) { this.address2 = address2; }

  @Element(required=false)
  String zip = "";
  public String getZip() { return zip; }
  public void setZip(final String zip) { this.zip = zip; }

  @Element(required=false)
  String city = "";
  public String getCity() { return city; }
  public void setCity(final String city) { this.city = city; }

  @Element(required=false)
  String countryISO = "";
  public String getCountryISO() { return countryISO; }
  public void setCountryISO(final String countryISO) { this.countryISO = countryISO; }

  @Element(required=false)
  String country = "";
  public String getCountry() { return country; }
  public void setCountry(final String country) { this.country = country; }

  protected AddressableXML()
  {
    super();
    this.name = "";
    this.email = "";
    this.websiteURL = "";
    this.phone = "";
    this.twitterAddress = "";
    this.address1 = "";
    this.address2 = "";
    this.zip = "";
    this.city = "";
    this.countryISO = "";
    this.country = "";
  }

  public static AddressableXML create()
  {
    return new AddressableXML();
  }

  public static final AddressableXML BLANK = AddressableXML.create();
  @Override public AddressableXML getBlank() { return BLANK; }

  @Override public AddressableXML copy()
  {
    AddressableXML n = AddressableXML.create();
    n.name = this.name;
    n.email = this.email;
    n.websiteURL = this.websiteURL;
    n.phone = this.phone;
    n.twitterAddress = this.twitterAddress;
    n.address1 = this.address1;
    n.address2 = this.address2;
    n.zip = this.zip;
    n.city = this.city;
    n.countryISO = this.countryISO;
    n.country = this.country;
    return n;
  }

  @Override
  public String toString()
  {
    return "AddressableXML" +
      "[" +
        "name=" + name + ", " +
        "email=" + email + ", " +
        "websiteURL=" + websiteURL + ", " +
        "phone=" + phone + ", " +
        "twitterAddress=" + twitterAddress + ", " +
        "address1=" + address1 + ", " +
        "address2=" + address2 + ", " +
        "zip=" + zip + ", " +
        "city=" + city + ", " +
        "countryISO=" + countryISO + ", " +
        "country=" + country +
      "]";
  }

  @Override
  public AddressableSQL asSQL()
  {
    AddressableSQL recordSQL = new AddressableSQL();
    recordSQL.name = this.name; 
    recordSQL.email = this.email; 
    recordSQL.websiteURL = this.websiteURL; 
    recordSQL.phone = this.phone; 
    recordSQL.twitterAddress = this.twitterAddress; 
    recordSQL.address1 = this.address1; 
    recordSQL.address2 = this.address2; 
    recordSQL.zip = this.zip; 
    recordSQL.city = this.city; 
    recordSQL.countryISO = this.countryISO; 
    recordSQL.country = this.country; 
    return recordSQL;
  }

}
