/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidSQLite
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.schoubo.library.android.CommonBaseSQL;


public class AddressableSQL extends CommonBaseSQL
{
  String name;
  public String getName() { return name; }
  public void setName(final String name) { this.name = name; }

  String email;
  public String getEmail() { return email; }
  public void setEmail(final String email) { this.email = email; }

  String websiteURL;
  public String getWebsiteURL() { return websiteURL; }
  public void setWebsiteURL(final String websiteURL) { this.websiteURL = websiteURL; }

  String phone;
  public String getPhone() { return phone; }
  public void setPhone(final String phone) { this.phone = phone; }

  String twitterAddress;
  public String getTwitterAddress() { return twitterAddress; }
  public void setTwitterAddress(final String twitterAddress) { this.twitterAddress = twitterAddress; }

  String address1;
  public String getAddress1() { return address1; }
  public void setAddress1(final String address1) { this.address1 = address1; }

  String address2;
  public String getAddress2() { return address2; }
  public void setAddress2(final String address2) { this.address2 = address2; }

  String zip;
  public String getZip() { return zip; }
  public void setZip(final String zip) { this.zip = zip; }

  String city;
  public String getCity() { return city; }
  public void setCity(final String city) { this.city = city; }

  String countryISO;
  public String getCountryISO() { return countryISO; }
  public void setCountryISO(final String countryISO) { this.countryISO = countryISO; }

  String country;
  public String getCountry() { return country; }
  public void setCountry(final String country) { this.country = country; }

  AddressableSQL()
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

  public static AddressableSQL create() { return new AddressableSQL(); }

  public static final AddressableSQL BLANK = AddressableSQL.create();
  @Override public AddressableSQL getBlank() { return BLANK; }

  @Override
  public AddressableSQL copy()
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

  @Override
  public String toString()
  {
    return "AddressableSQL" +
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
  public AddressableXML asXML()
  {
    AddressableXML recordXML = AddressableXML.create();
    recordXML.setName(this.getName());
    recordXML.setEmail(this.getEmail());
    recordXML.setWebsiteURL(this.getWebsiteURL());
    recordXML.setPhone(this.getPhone());
    recordXML.setTwitterAddress(this.getTwitterAddress());
    recordXML.setAddress1(this.getAddress1());
    recordXML.setAddress2(this.getAddress2());
    recordXML.setZip(this.getZip());
    recordXML.setCity(this.getCity());
    recordXML.setCountryISO(this.getCountryISO());
    recordXML.setCountry(this.getCountry());
    return recordXML;
  }

  public static final int ID_Name = 0;
  public static final int ID_Email = 1;
  public static final int ID_WebsiteURL = 2;
  public static final int ID_Phone = 3;
  public static final int ID_TwitterAddress = 4;
  public static final int ID_Address1 = 5;
  public static final int ID_Address2 = 6;
  public static final int ID_Zip = 7;
  public static final int ID_City = 8;
  public static final int ID_CountryISO = 9;
  public static final int ID_Country = 10;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Name: return name;
      case ID_Email: return email;
      case ID_WebsiteURL: return websiteURL;
      case ID_Phone: return phone;
      case ID_TwitterAddress: return twitterAddress;
      case ID_Address1: return address1;
      case ID_Address2: return address2;
      case ID_Zip: return zip;
      case ID_City: return city;
      case ID_CountryISO: return countryISO;
      case ID_Country: return country;
    }
    return null;
  }

  @Override
  public void set(final int fieldId, final Object value)
  {
    switch (fieldId)
    {
      case ID_Name: { name = (String) value; return; }
      case ID_Email: { email = (String) value; return; }
      case ID_WebsiteURL: { websiteURL = (String) value; return; }
      case ID_Phone: { phone = (String) value; return; }
      case ID_TwitterAddress: { twitterAddress = (String) value; return; }
      case ID_Address1: { address1 = (String) value; return; }
      case ID_Address2: { address2 = (String) value; return; }
      case ID_Zip: { zip = (String) value; return; }
      case ID_City: { city = (String) value; return; }
      case ID_CountryISO: { countryISO = (String) value; return; }
      case ID_Country: { country = (String) value; return; }
    }
  }

  @Override
  public String getColumnName(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Name: return "name";
      case ID_Email: return "email";
      case ID_WebsiteURL: return "websiteURL";
      case ID_Phone: return "phone";
      case ID_TwitterAddress: return "twitterAddress";
      case ID_Address1: return "address1";
      case ID_Address2: return "address2";
      case ID_Zip: return "zip";
      case ID_City: return "city";
      case ID_CountryISO: return "countryISO";
      case ID_Country: return "country";
    }
    return null;
  }

}
