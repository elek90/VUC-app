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
public class StepXML extends CommonXML implements Serializable
{
  @Element
  Long parentFlowchart;
  public Long getParentFlowchart() { return parentFlowchart; }
  public void setParentFlowchart(final Long parentFlowchart) { this.parentFlowchart = parentFlowchart; }

  @Element(required=false)
  String text = "";
  public String getText() { return text; }
  public void setText(final String text) { this.text = text; }

  @Element(required=false)
  String stepType = "";
  public String getStepType() { return stepType; }
  public void setStepType(final String stepType) { this.stepType = stepType; }

  @Element
  Long actionId;
  public Long getActionId() { return actionId; }
  public void setActionId(final Long actionId) { this.actionId = actionId; }

  @Element
  Long subflowchartId;
  public Long getSubflowchartId() { return subflowchartId; }
  public void setSubflowchartId(final Long subflowchartId) { this.subflowchartId = subflowchartId; }

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

  protected StepXML()
  {
    super();
    this.parentFlowchart = 0L;
    this.text = "";
    this.stepType = "";
    this.actionId = 0L;
    this.subflowchartId = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static StepXML create()
  {
    return new StepXML();
  }

  public static final StepXML BLANK = StepXML.create();
  @Override public StepXML getBlank() { return BLANK; }

  @Override public StepXML copy()
  {
    StepXML n = StepXML.create();
    n.id = this.id;
    n.parentFlowchart = this.parentFlowchart;
    n.text = this.text;
    n.stepType = this.stepType;
    n.actionId = this.actionId;
    n.subflowchartId = this.subflowchartId;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    return n;
  }

  @Override
  public String toString()
  {
    return "StepXML" +
      "[" +
        "id=" + id + ", " +
        "parentFlowchart=" + parentFlowchart + ", " +
        "text=" + text + ", " +
        "stepType=" + stepType + ", " +
        "actionId=" + actionId + ", " +
        "subflowchartId=" + subflowchartId + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public StepSQL asSQL()
  {
    StepSQL recordSQL = new StepSQL();
    recordSQL.id = this.id; 
    recordSQL.parentFlowchart = this.parentFlowchart; 
    recordSQL.text = this.text; 
    recordSQL.stepType = this.stepType; 
    recordSQL.actionId = this.actionId; 
    recordSQL.subflowchartId = this.subflowchartId; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static StepXML query(final Long parentFlowchart)
  {
    StepSQL recordSQL = StepSQL.query(parentFlowchart);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StepXML queryOrderBy(final Long parentFlowchart, final String order)
  {
    StepSQL recordSQL = StepSQL.queryOrderBy(parentFlowchart, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StepXML querySince(final Long parentFlowchart, final Date since)
  {
    StepSQL recordSQL = StepSQL.querySince(parentFlowchart, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StepXML queryOrderBySince(final Long parentFlowchart, final String order, final Date since)
  {
    StepSQL recordSQL = StepSQL.queryOrderBySince(parentFlowchart, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<StepXML> queryAll(final Long parentFlowchart)
  {
    List<StepSQL> recordListSQL = StepSQL.queryAll(parentFlowchart);
    List<StepXML> recordListXML = new LinkedList<StepXML>();
    for (StepSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
      return null;
  }
  public static List<StepXML> queryAllOrderBy(final Long parentFlowchart, final String order)
  {
    List<StepSQL> recordListSQL = StepSQL.queryAllOrderBy(parentFlowchart, order);
    List<StepXML> recordListXML = new LinkedList<StepXML>();
    for (StepSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }
  public static List<StepXML> queryAllSince(final Long parentFlowchart, final Date since)
  {
    List<StepSQL> recordListSQL = StepSQL.queryAllSince(parentFlowchart, since);
    List<StepXML> recordListXML = new LinkedList<StepXML>();
    for (StepSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }
  public static List<StepXML> queryAllOrderBySince(final Long parentFlowchart, final String order, final Date since)
  {
    List<StepSQL> recordListSQL = StepSQL.queryAllOrderBySince(parentFlowchart, order, since);
    List<StepXML> recordListXML = new LinkedList<StepXML>();
    for (StepSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }
  public static StepXML get(final Long id)
  {
    StepSQL recordSQL = StepSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static StepXML get(final Long id, final Date since)
  {
    StepSQL recordSQL = StepSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
