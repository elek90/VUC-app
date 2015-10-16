package dk.lundogbendsen.vucroskilde.android;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowDescriptionXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.AddressableXML;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseXML;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartXML;
import dk.lundogbendsen.vucroskilde.android.generated.SchoolXML;
import dk.lundogbendsen.vucroskilde.android.generated.StepXML;
import dk.lundogbendsen.vucroskilde.android.generated.StudentXML;
import dk.lundogbendsen.vucroskilde.android.generated.TeamXML;

public class TestData
{
  private final Map<Long, SchoolXML> schools = new TreeMap<Long, SchoolXML>();
  private final Map<Long, TeamXML> teams = new TreeMap<Long, TeamXML>();
  private final Map<Long, StudentXML> students = new TreeMap<Long, StudentXML>();

  private final Map<Long, FlowchartXML> flowcharts = new TreeMap<Long, FlowchartXML>();

  private final Map<Long, ExerciseXML> exercises = new TreeMap<Long, ExerciseXML>();

  public SchoolXML vucschool;
  public FlowchartXML spektrometerflowchart;
  public TeamXML hold3x;
  public StudentXML studentAnna;
  public StudentXML studentBerit;
  // public ExerciseXML exerciseSpectrometerAnna;
  // public ExerciseXML exerciseSpectrometerBerit;
  private final Map<StepType, LinkedHashMap<Long, Object>> actions = new TreeMap<StepType, LinkedHashMap<Long, Object>>();

  private TestData()
  {
    for (StepType st : StepType.values())
    {
      actions.put(st, new LinkedHashMap<Long, Object>());
    }
    initTestData();
  }

  private static TestData instance = null;

  public static TestData getInstance()
  {
    if (instance == null) instance = new TestData();
    return instance;
  }

  public Map<Long, ExerciseXML> getExercises()
  {
    return exercises;
  }

  public Map<Long, FlowchartXML> getFlowcharts()
  {
    return flowcharts;
  }

  public Map<Long, FlowchartXML> getExecutableFlowcharts()
  {
    TreeMap<Long, FlowchartXML> res = new TreeMap<Long, FlowchartXML>();
    for (Entry<Long, FlowchartXML> entry : flowcharts.entrySet())
    {
      if (entry.getValue().isExecutable())
      {
        res.put(entry.getKey(), entry.getValue());
      }
    }
    return res;
  }

  public void initTestData()
  {
    nextId = 1L;

    initSchools();
    initTeams();
    initFlowcharts();
    // initExercises();
  }

  // Recommended video format for Android, when it must be H.264, is Baseline Profile
  // The following seems not to work (file format in ...full or ...small based on H.264, which seems to have many variants)
  // Original links (after setting the Google Drive file to available to anyone with the link)
  // vid01small.mp4 https://drive.google.com/open?id=0ByqV1F-KEJ--Z2JNdXQ0NG5kb2c brug spek
  // vid02small.mp4 https://drive.google.com/open?id=0ByqV1F-KEJ--d1pDMmJvUTZlQms byg eget spek
  // vid03small.mp4 https://drive.google.com/open?id=0ByqV1F-KEJ--N1A5MFhYblluLUE brug eget spek
  private static final String GOOGLE_DRIVE_PREFIX = "https://drive.google.com/uc?export=download&id=";

  private static final String SR_PREFIX = "http://www.schoubo-reasoning.dk/images/stories/vuc/lab01/";

  // Created by http://video.online-convert.com/convert-to-3gp
  // private static final String SR_POSTFIX = "small4cif500kbs30fps.3gp"; // does not work
  // private static final String SR_POSTFIX = "small16cif.3gp"; // does not work
  // private static final String SR_POSTFIX = "small4cif.3gp"; // does not work

  // Created by VLC
  // private static final String SR_POSTFIX = "androidsdhigh.mp4"; // does not work
  // private static final String SR_POSTFIX = "androidhd.mp4"; // does not work
   private static final String SR_POSTFIX = "fullvp80.webm"; // works

  @SuppressWarnings("unused")
  private void initFlowcharts()
  {
    FlowchartXML f1 = newFlowchart("(F1) Bliv klog på lys", vucschool.getId());
    StepXML s11 = newStepShowDescription("(S11) Se video om lys", f1, "(Her skal der være en video om lysets fysik og hvad viden om lys kan bruges til...)");

    FlowchartXML f2 = newFlowchart("(F2) Praktisk arbejde", vucschool.getId());
    StepXML s21 = newStepShowVideo("(S21) Sådan laver du eksperimenter", f2, ref("vid01"));
    StepXML s22 = newStepShowVideo("(S22) Byg selv dit udstyr", f2, ref("vid02"));

    FlowchartXML f23 = newFlowchart("(F23) Praktisk opgave", vucschool.getId());
    StepXML s231 = newStepRecordImage("(S231) Tag et billede af den blå himmel", f23);
    StepXML s232 = newStepRecordImage("(S232) Tag et billede af en elektrisk pære", f23);

    StepXML s23 = newStepSubFlowchart(f2, f23);

    FlowchartXML f3 = newFlowchart("(F3) Gennemfør din egen undersøgelse", vucschool.getId());
    StepXML s31 = newStepShowVideo("(S31) Instruktion til undersøgelsen", f3, ref("vid03"));

    FlowchartXML f32 = newFlowchart("(F32) Tag billeder", vucschool.getId());
    StepXML s321 = newStepRecordImage("(S321) Billede af spektrum", f32);
    StepXML s322 = newStepRecordImage("(S322) Billede af lyskilde", f32);

    StepXML s32 = newStepSubFlowchart(f3, f32);

    StepXML s33 = newStepSendReport("(S33) Aflever rapport", f32);

    FlowchartXML f = newFlowchart("(F) Lys - Niveau G", vucschool.getId());
    StepXML s1 = newStepSubFlowchart(f, f1);
    StepXML s2 = newStepSubFlowchart(f, f2);
    StepXML s3 = newStepSubFlowchart(f, f3);

    f.setExecutable(true);

    spektrometerflowchart = f;
  }

  private String ref(final String name)
  {
    return SR_PREFIX + name + SR_POSTFIX;
  }

  private ActionSendReportXML newActionSendReportXML(final StepXML step)
  {
    ActionSendReportXML a = ActionSendReportXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(StepType.valueOf(step.getStepType())).put(a.getId(), a);
    return a;
  }

  private ActionRecordImageXML newActionRecordImageXML(final StepXML step)
  {
    ActionRecordImageXML a = ActionRecordImageXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(StepType.valueOf(step.getStepType())).put(a.getId(), a);
    return a;
  }

  private ActionShowVideoXML newActionShowVideoXML(final StepXML step)
  {
    ActionShowVideoXML a = ActionShowVideoXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(StepType.valueOf(step.getStepType())).put(a.getId(), a);
    return a;
  }

  private ActionShowDescriptionXML newActionShowDescriptionXML(final StepXML step)
  {
    ActionShowDescriptionXML a = ActionShowDescriptionXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(StepType.valueOf(step.getStepType())).put(a.getId(), a);
    return a;
  }

  private StepXML newStep(final String text, final FlowchartXML f)
  {
    StepXML s = StepXML.create();
    s.setId(newId());
    s.setText(text);
    s.setParentFlowchart(f.getId());
    f.addSteps(s);
    return s;
  }

  private StepXML newStepShowDescription(final String text, final FlowchartXML f, final String description)
  {
    StepXML s = newStep(text, f);
    s.setStepType(StepType.SHOW_TEXT.name());
    ActionShowDescriptionXML a = newActionShowDescriptionXML(s);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepShowVideo(final String text, final FlowchartXML f, final String videoRef)
  {
    StepXML s = newStep(text, f);
    s.setStepType(StepType.SHOW_VIDEO.name());
    ActionShowVideoXML a = newActionShowVideoXML(s);
    a.setVideoRef(videoRef);
    return s;
  }

  private StepXML newStepRecordImage(final String text, final FlowchartXML f)
  {
    StepXML s = newStep(text, f);
    s.setStepType(StepType.RECORD_IMAGE.name());
    @SuppressWarnings("unused")
    ActionRecordImageXML a = newActionRecordImageXML(s);
    return s;
  }

  private StepXML newStepSendReport(final String text, final FlowchartXML f)
  {
    StepXML s = newStep(text, f);
    s.setStepType(StepType.SEND_REPORT.name());
    @SuppressWarnings("unused")
    ActionSendReportXML a = newActionSendReportXML(s);
    return s;
  }

  private StepXML newStepSubFlowchart(final FlowchartXML f, final FlowchartXML sf)
  {
    StepXML s = newStep(f.getFlowchartName(), f);
    s.setStepType(StepType.SUB_FLOWCHART.name());
    s.setSubflowchartId(sf.getId());
    return s;
  }

  private FlowchartXML newFlowchart(final String name, final Long schoolid)
  {
    FlowchartXML f = FlowchartXML.create();
    f.setId(newId());
    f.setSchool(schoolid);
    f.setFlowchartName(name);
    f.setExecutable(false);

    flowcharts.put(f.getId(), f);
    return f;
  }

  private void initTeams()
  {
    TeamXML t1 = TeamXML.create();
    t1.setId(newId());
    StudentXML s1 = StudentXML.create();
    s1.setId(newId());
    StudentXML s2 = StudentXML.create();
    s2.setId(newId());
    AddressableXML k1 = AddressableXML.create();
    AddressableXML sa1 = AddressableXML.create();
    AddressableXML sa2 = AddressableXML.create();

    k1.setName("Bent Klarmark");
    k1.setAddress1("Læderstræde 4");
    k1.setAddress2("");
    k1.setCity("Roskilde");
    k1.setZip("4000");
    k1.setCountry("Danmark");
    k1.setCountryISO("DA");
    k1.setEmail("RBK@vucroskilde.dk");
    k1.setPhone("40125872");

    sa1.setName("Anna Andersen");
    sa1.setAddress1("Agervej 1");
    sa1.setAddress2("");
    sa1.setCity("Roskilde");
    sa1.setZip("4000");
    sa1.setCountry("Danmark");
    sa1.setCountryISO("DA");
    sa1.setEmail("anna95@gmail.com");
    sa1.setPhone("40123456");

    sa2.setName("Berit Bendixen");
    sa2.setAddress1("Baunehøj 2");
    sa2.setAddress2("");
    sa2.setCity("Roskilde");
    sa2.setZip("4000");
    sa2.setCountry("Danmark");
    sa2.setCountryISO("DA");
    sa2.setEmail("berit96@gmail.com");
    sa2.setPhone("40123457");

    s1.setContact(sa1);
    s1.setParentTeam(t1.getId());
    s1.setPassword("tystys");

    s2.setContact(sa2);
    s2.setParentTeam(t1.getId());
    s2.setPassword("shhh");

    t1.setContactPerson(k1);
    t1.setParentSchool(vucschool.getId());
    t1.setTeamName("Hold 3x");
    t1.addStudents(s1);

    teams.put(t1.getId(), t1);
    students.put(s1.getId(), s1);
    students.put(s2.getId(), s2);
    hold3x = t1;
    studentAnna = s1;
    studentBerit = s2;
  }

  private void initSchools()
  {
    AddressableXML a1 = AddressableXML.create();
    SchoolXML s1 = SchoolXML.create();
    s1.setId(newId());

    a1.setName("Anne Marie Vind Ludvigsen");
    a1.setAddress1("Læderstræde 4");
    a1.setAddress2("");
    a1.setCity("Roskilde");
    a1.setZip("4000");
    a1.setCountry("Danmark");
    a1.setCountryISO("DA");
    a1.setEmail("RAM@vucroskilde.dk");
    a1.setPhone("40125872");

    s1.setSchoolName("VUC Roskilde");
    s1.setContactPerson(a1);

    schools.put(s1.getId(), s1);
    vucschool = s1;
  }

  private long nextId;

  private Long newId()
  {
    return nextId++;
  }

  // private void initExercises()
  // {
  // ExerciseXML e1 = ExerciseXML.create();
  // e1.setId(newId());
  // ExerciseXML e2 = ExerciseXML.create();
  // e2.setId(newId());
  //
  // e1.setStudent(studentAnna.getId());
  // e1.setFlowchart(spektrometerflowchart.getId());
  //
  // e2.setStudent(studentBerit.getId());
  // e2.setFlowchart(spektrometerflowchart.getId());
  //
  // exercises.put(e1.getId(), e1);
  //
  // exerciseSpectrometerAnna = e1;
  // exerciseSpectrometerBerit = e2;
  // }

  public ExerciseXML createExercise(final FlowchartXML flowchart, final StudentXML currentStudent)
  {
    ExerciseXML e1 = ExerciseXML.create();
    e1.setId(newId());

    e1.setStudent(currentStudent.getId());
    e1.setFlowchart(flowchart.getId());

    exercises.put(e1.getId(), e1);

    return e1;
  }

  @SuppressWarnings("unchecked")
  public <T> T getAction(final StepType steptype, final Long actionid)
  {
    return (T) actions.get(steptype).get(actionid);
  }

}
