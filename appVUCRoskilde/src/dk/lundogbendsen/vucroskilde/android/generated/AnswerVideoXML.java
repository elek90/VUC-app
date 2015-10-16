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
public class AnswerVideoXML extends CommonXML implements Serializable
{
  @Element(required=false)
  String text = "";
  public String getText() { return text; }
  public void setText(final String text) { this.text = text; }

  @Element(required=false)
  String videoRef = "";
  public String getVideoRef() { return videoRef; }
  public void setVideoRef(final String videoRef) { this.videoRef = videoRef; }

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

  protected AnswerVideoXML()
  {
    super();
    this.text = "";
    this.videoRef = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static AnswerVideoXML create()
  {
    return new AnswerVideoXML();
  }

  public static final AnswerVideoXML BLANK = AnswerVideoXML.create();
  @Override public AnswerVideoXML getBlank() { return BLANK; }

  @Override public AnswerVideoXML copy()
  {
    AnswerVideoXML n = AnswerVideoXML.create();
    n.id = this.id;
    n.text = this.text;
    n.videoRef = this.videoRef;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "AnswerVideoXML" +
      "[" +
        "id=" + id + ", " +
        "text=" + text + ", " +
        "videoRef=" + videoRef + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public AnswerVideoSQL asSQL()
  {
    AnswerVideoSQL recordSQL = new AnswerVideoSQL();
    recordSQL.id = this.id; 
    recordSQL.text = this.text; 
    recordSQL.videoRef = this.videoRef; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static AnswerVideoXML query()
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.query();
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerVideoXML queryOrderBy(final String order)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.queryOrderBy(order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerVideoXML querySince(final Date since)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.querySince(since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerVideoXML queryOrderBySince(final String order, final Date since)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.queryOrderBySince(order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<AnswerVideoXML> queryAll()
  {
    List<AnswerVideoSQL> recordListSQL = AnswerVideoSQL.queryAll();
    List<AnswerVideoXML> recordListXML = new LinkedList<AnswerVideoXML>();
    for (AnswerVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<AnswerVideoXML> queryAllOrderBy(final String order)
  {
    List<AnswerVideoSQL> recordListSQL = AnswerVideoSQL.queryAllOrderBy(order);
    List<AnswerVideoXML> recordListXML = new LinkedList<AnswerVideoXML>();
    for (AnswerVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<AnswerVideoXML> queryAllSince(final Date since)
  {
    List<AnswerVideoSQL> recordListSQL = AnswerVideoSQL.queryAllSince(since);
    List<AnswerVideoXML> recordListXML = new LinkedList<AnswerVideoXML>();
    for (AnswerVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<AnswerVideoXML> queryAllOrderBySince(final String order, final Date since)
  {
    List<AnswerVideoSQL> recordListSQL = AnswerVideoSQL.queryAllOrderBySince(order, since);
    List<AnswerVideoXML> recordListXML = new LinkedList<AnswerVideoXML>();
    for (AnswerVideoSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static AnswerVideoXML get(final Long id)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static AnswerVideoXML get(final Long id, final Date since)
  {
    AnswerVideoSQL recordSQL = AnswerVideoSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
