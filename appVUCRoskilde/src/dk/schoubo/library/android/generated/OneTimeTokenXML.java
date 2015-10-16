/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Jan Schoubo, schoubo reasoning
 */



package dk.schoubo.library.android.generated;

import dk.schoubo.library.android.CommonXML;
import java.io.Serializable;
import java.util.*;
import java.util.Date;
import org.simpleframework.xml.*;


@Root
public class OneTimeTokenXML extends CommonXML implements Serializable
{
  @Element(required=false)
  String oneTimeToken = "";
  public String getOneTimeToken() { return oneTimeToken; }
  public void setOneTimeToken(final String oneTimeToken) { this.oneTimeToken = oneTimeToken; }

  @Element(required=false)
  String paymentToken = "";
  public String getPaymentToken() { return paymentToken; }
  public void setPaymentToken(final String paymentToken) { this.paymentToken = paymentToken; }

  @Element
  Long userId;
  public Long getUserId() { return userId; }
  public void setUserId(final Long userId) { this.userId = userId; }

  @Element
  Date tokenExpirationTime;
  public Date getTokenExpirationTime() { return tokenExpirationTime; }
  public void setTokenExpirationTime(final Date tokenExpirationTime) { this.tokenExpirationTime = tokenExpirationTime; }

  @Element
  Date purchaseExpirationTime;
  public Date getPurchaseExpirationTime() { return purchaseExpirationTime; }
  public void setPurchaseExpirationTime(final Date purchaseExpirationTime) { this.purchaseExpirationTime = purchaseExpirationTime; }

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

  protected OneTimeTokenXML()
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

  public static OneTimeTokenXML create()
  {
    return new OneTimeTokenXML();
  }

  public OneTimeTokenXML(final String oneTimeToken)
   {
    this();
    this.oneTimeToken = oneTimeToken;
  }

  public static OneTimeTokenXML create(final String oneTimeToken)
  {
    return new OneTimeTokenXML(oneTimeToken);
  }

  public static final OneTimeTokenXML BLANK = OneTimeTokenXML.create();
  @Override public OneTimeTokenXML getBlank() { return BLANK; }

  @Override public OneTimeTokenXML copy()
  {
    OneTimeTokenXML n = OneTimeTokenXML.create();
    n.id = this.id;
    n.oneTimeToken = this.oneTimeToken;
    n.paymentToken = this.paymentToken;
    n.userId = this.userId;
    n.tokenExpirationTime = this.tokenExpirationTime;
    n.purchaseExpirationTime = this.purchaseExpirationTime;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "OneTimeTokenXML" +
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
  public OneTimeTokenSQL asSQL()
  {
    OneTimeTokenSQL recordSQL = new OneTimeTokenSQL();
    recordSQL.id = this.id; 
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

  public static OneTimeTokenXML query(final String oneTimeToken)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.query(oneTimeToken);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static OneTimeTokenXML queryOrderBy(final String oneTimeToken, final String order)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.queryOrderBy(oneTimeToken, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static OneTimeTokenXML querySince(final String oneTimeToken, final Date since)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.querySince(oneTimeToken, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static OneTimeTokenXML queryOrderBySince(final String oneTimeToken, final String order, final Date since)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.queryOrderBySince(oneTimeToken, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<OneTimeTokenXML> queryAll()
  {
    List<OneTimeTokenSQL> recordListSQL = OneTimeTokenSQL.queryAll();
    List<OneTimeTokenXML> recordListXML = new LinkedList<OneTimeTokenXML>();
    for (OneTimeTokenSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<OneTimeTokenXML> queryAllOrderBy(final String order)
  {
    List<OneTimeTokenSQL> recordListSQL = OneTimeTokenSQL.queryAllOrderBy(order);
    List<OneTimeTokenXML> recordListXML = new LinkedList<OneTimeTokenXML>();
    for (OneTimeTokenSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<OneTimeTokenXML> queryAllSince(final Date since)
  {
    List<OneTimeTokenSQL> recordListSQL = OneTimeTokenSQL.queryAllSince(since);
    List<OneTimeTokenXML> recordListXML = new LinkedList<OneTimeTokenXML>();
    for (OneTimeTokenSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<OneTimeTokenXML> queryAllOrderBySince(final String order, final Date since)
  {
    List<OneTimeTokenSQL> recordListSQL = OneTimeTokenSQL.queryAllOrderBySince(order, since);
    List<OneTimeTokenXML> recordListXML = new LinkedList<OneTimeTokenXML>();
    for (OneTimeTokenSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static OneTimeTokenXML get(final Long id)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static OneTimeTokenXML get(final Long id, final Date since)
  {
    OneTimeTokenSQL recordSQL = OneTimeTokenSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
