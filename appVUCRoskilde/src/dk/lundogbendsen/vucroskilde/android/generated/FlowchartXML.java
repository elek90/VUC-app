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
public class FlowchartXML extends CommonXML implements Serializable
{
  @Element
  Boolean executable;
  public Boolean isExecutable() { return executable; }
  public void setExecutable(final Boolean executable) { this.executable = executable; }

  @Element(required=false)
  String flowchartName = "";
  public String getFlowchartName() { return flowchartName; }
  public void setFlowchartName(final String flowchartName) { this.flowchartName = flowchartName; }

  @Element(required=false)
  String flowchartSequence = "";
  public String getFlowchartSequence() { return flowchartSequence; }
  public void setFlowchartSequence(final String flowchartSequence) { this.flowchartSequence = flowchartSequence; }

  @Element
  Long school;
  public Long getSchool() { return school; }
  public void setSchool(final Long school) { this.school = school; }

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
  Collection<StepXML> steps;
  @Element
  int stepsSize;
  public void clearSteps() { this.steps.clear(); stepsSize = 0; }
  public StepXML addSteps(final StepXML record) { this.steps.add(record); stepsSize = this.steps.size(); return record; }
  public Collection<StepXML> addAllSteps(final Collection<StepXML> records) { this.steps.addAll(records); stepsSize = this.steps.size(); return records; }
  public Collection<StepXML> getSteps() { return steps; }
  public int getStepsSize() { return stepsSize; }

  protected FlowchartXML()
  {
    super();
    this.executable = false;
    this.flowchartName = "";
    this.flowchartSequence = "";
    this.school = 0L;
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
    this.steps = new LinkedList<StepXML>();
  }

  public static FlowchartXML create()
  {
    return new FlowchartXML();
  }

  public FlowchartXML(final String flowchartName)
   {
    this();
    this.flowchartName = flowchartName;
  }

  public static FlowchartXML create(final String flowchartName)
  {
    return new FlowchartXML(flowchartName);
  }

  public static final FlowchartXML BLANK = FlowchartXML.create();
  @Override public FlowchartXML getBlank() { return BLANK; }

  @Override public FlowchartXML copy()
  {
    FlowchartXML n = FlowchartXML.create();
    n.id = this.id;
    n.executable = this.executable;
    n.flowchartName = this.flowchartName;
    n.flowchartSequence = this.flowchartSequence;
    n.school = this.school;
    n.timestamp = this.timestamp;
    n.changestamp = this.changestamp;
    n.deletestamp = this.deletestamp;
    n.steps.addAll(this.steps);
    n.stepsSize = n.steps.size();
    return n;
  }

  @Override
  public String toString()
  {
    return "FlowchartXML" +
      "[" +
        "id=" + id + ", " +
        "executable=" + executable + ", " +
        "flowchartName=" + flowchartName + ", " +
        "flowchartSequence=" + flowchartSequence + ", " +
        "school=" + school + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp + ", " +
        "steps: {" + steps.size() + "}" + ", " +
        "stepsSize=" + stepsSize +
      "]";
  }

  @Override
  public FlowchartSQL asSQL()
  {
    FlowchartSQL recordSQL = new FlowchartSQL();
    recordSQL.id = this.id; 
    recordSQL.executable = this.executable; 
    recordSQL.flowchartName = this.flowchartName; 
    recordSQL.flowchartSequence = this.flowchartSequence; 
    recordSQL.school = this.school; 
    recordSQL.timestamp = this.timestamp; 
    recordSQL.changestamp = this.changestamp; 
    recordSQL.deletestamp = this.deletestamp; 
    return recordSQL;
  }

  public static FlowchartXML query(final String flowchartName, final Long school)
  {
    FlowchartSQL recordSQL = FlowchartSQL.query(flowchartName, school);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static FlowchartXML queryOrderBy(final String flowchartName, final Long school, final String order)
  {
    FlowchartSQL recordSQL = FlowchartSQL.queryOrderBy(flowchartName, school, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static FlowchartXML querySince(final String flowchartName, final Long school, final Date since)
  {
    FlowchartSQL recordSQL = FlowchartSQL.querySince(flowchartName, school, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static FlowchartXML queryOrderBySince(final String flowchartName, final Long school, final String order, final Date since)
  {
    FlowchartSQL recordSQL = FlowchartSQL.queryOrderBySince(flowchartName, school, order, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static List<FlowchartXML> queryAll(final Long school)
  {
    List<FlowchartSQL> recordListSQL = FlowchartSQL.queryAll(school);
    List<FlowchartXML> recordListXML = new LinkedList<FlowchartXML>();
    for (FlowchartSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildren(String name)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepxml"))
    {
      return new LinkedList<CommonXML>(StepXML.queryAll(this.id));
    }
    else
      return null;
  }
  public static List<FlowchartXML> queryAllOrderBy(final Long school, final String order)
  {
    List<FlowchartSQL> recordListSQL = FlowchartSQL.queryAllOrderBy(school, order);
    List<FlowchartXML> recordListXML = new LinkedList<FlowchartXML>();
    for (FlowchartSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBy(String name, final String order)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepxml"))
    {
      return new LinkedList<CommonXML>(StepXML.queryAllOrderBy(this.id, order));
    }
    else
      return null;
  }
  public static List<FlowchartXML> queryAllSince(final Long school, final Date since)
  {
    List<FlowchartSQL> recordListSQL = FlowchartSQL.queryAllSince(school, since);
    List<FlowchartXML> recordListXML = new LinkedList<FlowchartXML>();
    for (FlowchartSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenSince(String name, final Date since)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepxml"))
    {
      return new LinkedList<CommonXML>(StepXML.queryAllSince(this.id, since));
    }
    else
      return null;
  }
  public static List<FlowchartXML> queryAllOrderBySince(final Long school, final String order, final Date since)
  {
    List<FlowchartSQL> recordListSQL = FlowchartSQL.queryAllOrderBySince(school, order, since);
    List<FlowchartXML> recordListXML = new LinkedList<FlowchartXML>();
    for (FlowchartSQL recordSQL : recordListSQL) recordListXML.add(recordSQL.asXML());
    return recordListXML;
  }

  @Override
  public List<CommonXML> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
    if (name.equalsIgnoreCase("step") || name.equalsIgnoreCase("stepxml"))
    {
      return new LinkedList<CommonXML>(StepXML.queryAllOrderBySince(this.id, order, since));
    }
    else
      return null;
  }
  public static FlowchartXML get(final Long id)
  {
    FlowchartSQL recordSQL = FlowchartSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static FlowchartXML get(final Long id, final Date since)
  {
    FlowchartSQL recordSQL = FlowchartSQL.get(id, since);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

}
