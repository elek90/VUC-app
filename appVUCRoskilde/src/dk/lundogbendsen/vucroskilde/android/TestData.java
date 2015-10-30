package dk.lundogbendsen.vucroskilde.android;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.lundogbendsen.vucroskilde.android.data.StepType;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordAudioXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordImageXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordTextXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionRecordVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionSendReportXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowAudioXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowImageXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowTextXML;
import dk.lundogbendsen.vucroskilde.android.generated.ActionShowVideoXML;
import dk.lundogbendsen.vucroskilde.android.generated.AddressableXML;
import dk.lundogbendsen.vucroskilde.android.generated.ExerciseXML;
import dk.lundogbendsen.vucroskilde.android.generated.FlowchartXML;
import dk.lundogbendsen.vucroskilde.android.generated.MediaRefXML;
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
  private final Map<Long, StepXML> steps = new TreeMap<Long, StepXML>();

  private final Map<Long, ExerciseXML> exercises = new TreeMap<Long, ExerciseXML>();

  private final Map<Long, Map<Long, Object>> answers = new HashMap<Long, Map<Long, Object>>();

  public FlowchartXML spektrometerflowchart;
  public FlowchartXML sampleflowchart;

  public SchoolXML vucschool;
  public TeamXML hold3x;
  public StudentXML studentAnna;
  public StudentXML studentBerit;

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

  public Map<Long, StepXML> getSteps()
  {
    return steps;
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
    initFlowchartExercise1();
    initFlowchartSample();
    // initExercises();
  }

  // Recommended video format for Android, when it must be H.264, is Baseline Profile
  // The following seems not to work (file format in ...full or ...small based on H.264, which seems to have many variants)
  // Original links (after setting the Google Drive file to available to anyone with the link)
  // vid01small.mp4 https://drive.google.com/open?id=0ByqV1F-KEJ--Z2JNdXQ0NG5kb2c brug spek
  // vid02small.mp4 https://drive.google.com/open?id=0ByqV1F-KEJ--d1pDMmJvUTZlQms byg eget spek
  // vid03small.mp4 https://drive.google.com/open?id=0ByqV1F-KEJ--N1A5MFhYblluLUE brug eget spek
  @SuppressWarnings("unused")
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
  private static final String massespektrometriForklaring = "massespektrometri, analysemetode til bestemmelse af molekylers masse og kemiske struktur. Massespektrometri er en af de mest specifikke og følsomme analysemetoder til kvalitativ og kvantitativ analyse af et bredt udsnit af forskellige stoftyper. Metoden anvendes inden for forskning og rutineanalyse i områder som fx kemi, biokemi, bioteknologi, geokemi, klinisk kemi og miljøkontrol.\n"
      + "Analysen foretages i et massespektrometer, som består af en ionkilde, hvor prøven ioniseres og bringes på gasform, en masseanalysator, hvor de dannede ioner adskilles efter masse i elektriske og/eller magnetiske felter, og detektoren, hvor ionernes ankomst registreres. Masseanalysator og detektor befinder sig i et højvakuumkammer. Afhængigt af den valgte ioniseringsmetode kan molekylerne tilføres overskudsenergi, hvorved de fragmenterer. Herved dannes ud over molekylarionen en række fragmentationer, som kan anvendes til at bestemme molekylets kemiske struktur. Hvis ioniseringsmetoden ikke tilfører tilstrækkelig overskudsenergi, kan fragmentering opnås ved at lade ionerne kollidere med fx neutrale gasmolekyler.\n"
      + "Ca. 1945-85 anvendtes massespektrometri næsten udelukkende til analyse af flygtige organiske forbindelser. Udvikling af nye ioniseringsmetoder, baseret på sprayteknik eller på beskydning af prøven med atomer, ioner eller fotoner kombineret med forbedrede masseanalysatorer, har åbnet for analyse af ikke-flygtige højmolekylære forbindelser som proteiner og nukleinsyrer. Ved direkte kobling til separationsmetoder som fx gas- og væskekromatografi kan meget komplekse stofblandinger analyseres.";

  @SuppressWarnings("unused")
  private void initFlowchartExercise1()
  {
    FlowchartXML f1 = newFlowchart("Bliv klog på lys", vucschool.getId());
    StepXML s11 = newStepShowText("Se video om lys", f1, "(Her skal der være en video om lysets fysik og hvad viden om lys kan bruges til...)");

    FlowchartXML f2 = newFlowchart("Praktisk arbejde", vucschool.getId());
    StepXML s21 = newStepShowVideo("Sådan laver du eksperimenter", f2, "Brug et spektrometer", ref("vid01"));
    StepXML s22 = newStepShowVideo("Byg selv dit udstyr", f2, "Byg et spektrometer", ref("vid02"));

    FlowchartXML f23 = newFlowchart("Praktisk opgave", vucschool.getId());
    StepXML s231 = newStepRecordImage("Tag et billede af den blå himmel", f23, "Spektrum for blå himmel");
    StepXML s232 = newStepRecordImage("Tag et billede af en elektrisk pære", f23, "Spektrum af lyskilde");

    StepXML s23 = newStepSubFlowchart(f2, f23);

    FlowchartXML f3 = newFlowchart("Gennemfør din egen undersøgelse", vucschool.getId());
    StepXML s31 = newStepShowVideo("Instruktion til undersøgelsen", f3, "Lav eksperimentet", ref("vid03"));

    FlowchartXML f32 = newFlowchart("Tag billeder", vucschool.getId());
    StepXML s321 = newStepRecordImage("Billede af spektrum", f32, "Spektrum for blå himmel");
    StepXML s322 = newStepRecordImage("Billede af lyskilde", f32, "Spektrum af lyskilde");

    StepXML s32 = newStepSubFlowchart(f3, f32);

    StepXML s33 = newStepSendReport("Aflever rapport", f32);

    FlowchartXML f = newFlowchart("Lys - Niveau G", vucschool.getId());
    StepXML s1 = newStepSubFlowchart(f, f1);
    StepXML s2 = newStepSubFlowchart(f, f2);
    StepXML s3 = newStepSubFlowchart(f, f3);

    f.setExecutable(true);

    f.setFlowchartSequence("");
    assignSequenceNumbers(f);

    spektrometerflowchart = f;
  }

  private final Map<Long, String> pendingTexts = new HashMap<Long, String>();
  private final Map<Long, MediaRefXML> pendingMediaRefs = new HashMap<Long, MediaRefXML>();

  @SuppressWarnings("unused")
  private void initFlowchartSample()
  {
    FlowchartXML f1 = newFlowchart("En af hver-øvelsen", vucschool.getId());
    StepXML s11 = newStepShowText("Forklaring", f1, "Denne øvelse indeholder blot et af hvert af de step-typer der kan forekomme.\nDen kan derfor forekomme lidt \"konstrueret\".");

    FlowchartXML f2 = newFlowchart("Til eleven", vucschool.getId());
    StepXML s21 = newStepShowText("Vis forklaring", f2, massespektrometriForklaring);
    StepXML s22 = newStepShowImage("Vis billede", f2, "Masse-spektrometer", "img01.jpg");
    StepXML s23 = newStepShowAudio("Afspil lydfil", f2, "Another day in Paradise", "aud01.ogg");
    StepXML s24 = newStepShowVideo("Vis video", f2, "Brug spektroskopet", ref("vid01"));

    FlowchartXML f3 = newFlowchart("Fra eleven", vucschool.getId());
    StepXML s31 = newStepRecordText("Besvar med forklaring", f3);
    StepXML s32 = newStepRecordImage("Besvar med billede", f3, "Mit billede");
    StepXML s33 = newStepRecordAudio("Besvar med audio", f3, "Min lydoptagelse");
    StepXML s34 = newStepRecordVideo("Besvar med video", f3, "Min video");

    FlowchartXML f4 = newFlowchart("Fra eleven (besvaret)", vucschool.getId());
    StepXML s41 = newStepRecordText("Besvarelse med forklaring", f4, "Dette er min forklaring til en spørgsmål.\nDen er lidt lang, da jeg gerne vil være sikker på at få det hele med.");
    StepXML s42 = newStepRecordImage("Besvarelse med billede", f4, "Mit billede", "img01.jpg", PlacementType.ASSETS);
    StepXML s43 = newStepRecordAudio("Besvarelse med audio", f4, "Min lydoptagelse", "aud01.ogg", PlacementType.ASSETS);
    StepXML s44 = newStepRecordVideo("Besvarelse med video", f4, "Min video", ref("vid01"), PlacementType.ASSETS);

    FlowchartXML f5 = newFlowchart("Rapportering", vucschool.getId());
    StepXML s51 = newStepSendReport("Aflever rapport", f5);

    FlowchartXML f = newFlowchart("En af hver - Niveau X", vucschool.getId());
    StepXML s1 = newStepSubFlowchart(f, f1);
    StepXML s2 = newStepSubFlowchart(f, f2);
    StepXML s3 = newStepSubFlowchart(f, f3);
    StepXML s4 = newStepSubFlowchart(f, f4);
    StepXML s5 = newStepSubFlowchart(f, f5);

    f.setExecutable(true);

    f.setFlowchartSequence("");
    assignSequenceNumbers(f);

    sampleflowchart = f;
  }

  private void assignSequenceNumbers(final FlowchartXML f)
  {
    int n = 1;
    for (StepXML step : f.getSteps())
    {
      String seq = (f.getFlowchartSequence().isEmpty() ? "" : f.getFlowchartSequence() + ".") + n;
      step.setStepSequence(seq);

      if (step.getStepType() == StepType.SUB_FLOWCHART)
      {
        FlowchartXML sf = flowcharts.get(step.getSubflowchartId());
        sf.setFlowchartSequence(seq);
        assignSequenceNumbers(sf);
      }

      n++;
    }

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

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionRecordTextXML newActionRecordTextXML(final StepXML step)
  {
    ActionRecordTextXML a = ActionRecordTextXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionRecordImageXML newActionRecordImageXML(final StepXML step)
  {
    ActionRecordImageXML a = ActionRecordImageXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionRecordAudioXML newActionRecordAudioXML(final StepXML step)
  {
    ActionRecordAudioXML a = ActionRecordAudioXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionRecordVideoXML newActionRecordVideoXML(final StepXML step)
  {
    ActionRecordVideoXML a = ActionRecordVideoXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionShowTextXML newActionShowTextXML(final StepXML step)
  {
    ActionShowTextXML a = ActionShowTextXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionShowImageXML newActionShowImageXML(final StepXML step)
  {
    ActionShowImageXML a = ActionShowImageXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionShowAudioXML newActionShowAudioXML(final StepXML step)
  {
    ActionShowAudioXML a = ActionShowAudioXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private ActionShowVideoXML newActionShowVideoXML(final StepXML step)
  {
    ActionShowVideoXML a = ActionShowVideoXML.create();
    a.setId(newId());
    a.setParentStep(step.getId());
    step.setActionId(a.getId());

    actions.get(step.getStepType()).put(a.getId(), a);
    return a;
  }

  private StepXML newStep(final String name, final FlowchartXML f)
  {
    StepXML s = StepXML.create();
    f.addSteps(s);
    s.setId(newId());
    s.setStepName(name);
    s.setStepSequence("!!!");
    s.setParentFlowchart(f.getId());

    steps.put(s.getId(), s);

    return s;
  }

  private StepXML newStepShowText(final String name, final FlowchartXML f, final String description)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.SHOW_TEXT);
    ActionShowTextXML a = newActionShowTextXML(s);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepShowImage(final String name, final FlowchartXML f, final String description, final String imageRef)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.SHOW_IMAGE);
    ActionShowImageXML a = newActionShowImageXML(s);
    a.getImageRef().setPlacementPath(imageRef);
    a.getImageRef().setPlacementType(PlacementType.ASSETS);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepShowAudio(final String name, final FlowchartXML f, final String description, final String audioRef)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.SHOW_AUDIO);
    ActionShowAudioXML a = newActionShowAudioXML(s);
    a.getAudioRef().setPlacementPath(audioRef);
    a.getAudioRef().setPlacementType(PlacementType.ASSETS);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepShowVideo(final String name, final FlowchartXML f, final String description, final String videoRef)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.SHOW_VIDEO);
    ActionShowVideoXML a = newActionShowVideoXML(s);
    a.getVideoRef().setPlacementPath(videoRef);
    a.getVideoRef().setPlacementType(PlacementType.URL);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepRecordText(final String name, final FlowchartXML f)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.RECORD_TEXT);
    ActionRecordTextXML a = newActionRecordTextXML(s);
    a.setDescription("");
    return s;
  }

  private StepXML newStepRecordText(final String name, final FlowchartXML f, final String text)
  {
    StepXML step = newStepRecordText(name, f);
    pendingTexts.put(step.getId(), text);
    return step;
  }

  private StepXML newStepRecordImage(final String name, final FlowchartXML f, final String description)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.RECORD_IMAGE);
    ActionRecordImageXML a = newActionRecordImageXML(s);
    a.getImageRef().setPlacementPath("");
    a.getImageRef().setPlacementType(PlacementType.NULL);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepRecordImage(final String name, final FlowchartXML f, final String description, final String path, final PlacementType type)
  {
    StepXML step = newStepRecordImage(name, f, description);
    MediaRefXML m = MediaRefXML.create();
    m.setPlacementPath(path);
    m.setPlacementType(type);
    pendingMediaRefs.put(step.getId(), m);
    return step;
  }

  private StepXML newStepRecordAudio(final String name, final FlowchartXML f, final String description)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.RECORD_AUDIO);
    ActionRecordAudioXML a = newActionRecordAudioXML(s);
    a.getAudioRef().setPlacementPath("");
    a.getAudioRef().setPlacementType(PlacementType.NULL);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepRecordAudio(final String name, final FlowchartXML f, final String description, final String path, final PlacementType type)
  {
    StepXML step = newStepRecordAudio(name, f, description);
    MediaRefXML m = MediaRefXML.create();
    m.setPlacementPath(path);
    m.setPlacementType(type);
    pendingMediaRefs.put(step.getId(), m);
    return step;
  }

  private StepXML newStepRecordVideo(final String name, final FlowchartXML f, final String description)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.RECORD_VIDEO);
    ActionRecordVideoXML a = newActionRecordVideoXML(s);
    a.getVideoRef().setPlacementPath("");
    a.getVideoRef().setPlacementType(PlacementType.NULL);
    a.setDescription(description);
    return s;
  }

  private StepXML newStepRecordVideo(final String name, final FlowchartXML f, final String description, final String path, final PlacementType type)
  {
    StepXML step = newStepRecordVideo(name, f, description);
    MediaRefXML m = MediaRefXML.create();
    m.setPlacementPath(path);
    m.setPlacementType(type);
    pendingMediaRefs.put(step.getId(), m);
    return step;
  }

  private StepXML newStepSendReport(final String name, final FlowchartXML f)
  {
    StepXML s = newStep(name, f);
    s.setStepType(StepType.SEND_REPORT);
    @SuppressWarnings("unused")
    ActionSendReportXML a = newActionSendReportXML(s);
    return s;
  }

  private StepXML newStepSubFlowchart(final FlowchartXML f, final FlowchartXML sf)
  {
    StepXML s = newStep(sf.getFlowchartName(), f);
    s.setStepType(StepType.SUB_FLOWCHART);
    s.setSubflowchartId(sf.getId());
    sf.setFlowchartSequence(s.getStepSequence());
    return s;
  }

  private FlowchartXML newFlowchart(final String name, final Long schoolid)
  {
    FlowchartXML f = FlowchartXML.create();
    f.setId(newId());
    f.setSchool(schoolid);
    f.setFlowchartName(name);
    f.setExecutable(false);
    f.setFlowchartSequence("???");

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
    sa1.setEmail("jan@lundogbendsen.dk");
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

  public ExerciseXML createExercise(final FlowchartXML flowchart, final StudentXML currentStudent)
  {
    ExerciseXML e1 = ExerciseXML.create();
    e1.setId(newId());

    e1.setStudent(currentStudent.getId());
    e1.setFlowchart(flowchart.getId());

    exercises.put(e1.getId(), e1);

    Map<Long, Object> answersToSteps = answers.get(e1.getId());
    if (answersToSteps == null)
    {
      answersToSteps = new HashMap<Long, Object>();
      answers.put(e1.getId(), answersToSteps);
    }
    fillWithBlankAnswers(answersToSteps, flowchart);

    return e1;
  }

  private void fillWithBlankAnswers(final Map<Long, Object> answersToSteps, final FlowchartXML flowchart)
  {
    for (StepXML step : flowchart.getSteps())
    {
      fillWithBlankAnswers(answersToSteps, step);
    }
  }

  private void fillWithBlankAnswers(final Map<Long, Object> answersToSteps, final StepXML step)
  {
    if (!answersToSteps.containsKey(step.getActionId()))
    {
      StepType steptype = step.getStepType();
      switch (steptype)
      {
        case RECORD_TEXT:
        {
          String text = pendingTexts.get(step.getId());
          if (text == null)
          {
            addAnswerText(answersToSteps, step, "");
          }
          else
          {
            addAnswerText(answersToSteps, step, text);
          }
          break;
        }
        case RECORD_IMAGE:
        {
          ActionRecordImageXML a = (ActionRecordImageXML) actions.get(step.getStepType()).get(step.getActionId());
          MediaRefXML m = pendingMediaRefs.get(step.getId());
          if (m == null)
          {
            addAnswerImage(answersToSteps, step, a.getDescription(), "", PlacementType.NULL);
          }
          else
          {
            addAnswerImage(answersToSteps, step, a.getDescription(), m.getPlacementPath(), m.getPlacementType());
          }
          break;
        }
        case RECORD_AUDIO:
        {
          ActionRecordAudioXML a = (ActionRecordAudioXML) actions.get(step.getStepType()).get(step.getActionId());
          MediaRefXML m = pendingMediaRefs.get(step.getId());
          if (m == null)
          {
            addAnswerAudio(answersToSteps, step, a.getDescription(), "", PlacementType.NULL);
          }
          else
          {
            addAnswerAudio(answersToSteps, step, a.getDescription(), m.getPlacementPath(), m.getPlacementType());
          }
          break;
        }
        case RECORD_VIDEO:
        {
          ActionRecordVideoXML a = (ActionRecordVideoXML) actions.get(step.getStepType()).get(step.getActionId());
          MediaRefXML m = pendingMediaRefs.get(step.getId());
          if (m == null)
          {
            addAnswerVideo(answersToSteps, step, a.getDescription(), "", PlacementType.NULL);
          }
          else
          {
            addAnswerVideo(answersToSteps, step, a.getDescription(), m.getPlacementPath(), m.getPlacementType());
          }
          break;
        }
        case SUB_FLOWCHART:
        {
          FlowchartXML sf = flowcharts.get(step.getSubflowchartId());
          fillWithBlankAnswers(answersToSteps, sf);
          break;
        }
        default:
        {
          // These step types have no answer
        }
      }
    }
  }

  private void addAnswerText(final Map<Long, Object> answersToSteps, final StepXML step, final String description)
  {
    ActionRecordTextXML an = ActionRecordTextXML.create();
    an.setParentStep(step.getId());
    an.setDescription(description);
    answersToSteps.put(step.getActionId(), an);
  }

  private void addAnswerImage(final Map<Long, Object> answersToSteps, final StepXML step, final String description, final String path, final PlacementType placement)
  {
    ActionRecordImageXML an = ActionRecordImageXML.create();
    an.setParentStep(step.getId());
    an.getImageRef().setPlacementPath(path);
    an.getImageRef().setPlacementType(placement);
    an.setDescription(description);
    answersToSteps.put(step.getActionId(), an);
  }

  private void addAnswerAudio(final Map<Long, Object> answersToSteps, final StepXML step, final String description, final String path, final PlacementType placement)
  {
    ActionRecordAudioXML an = ActionRecordAudioXML.create();
    an.setParentStep(step.getId());
    an.getAudioRef().setPlacementPath(path);
    an.getAudioRef().setPlacementType(placement);
    an.setDescription(description);
    answersToSteps.put(step.getActionId(), an);
  }

  private void addAnswerVideo(final Map<Long, Object> answersToSteps, final StepXML step, final String description, final String path, final PlacementType placement)
  {
    ActionRecordVideoXML an = ActionRecordVideoXML.create();
    an.setParentStep(step.getId());
    an.getVideoRef().setPlacementPath(path);
    an.getVideoRef().setPlacementType(placement);
    an.setDescription(description);
    answersToSteps.put(step.getActionId(), an);
  }

  @SuppressWarnings("unchecked")
  public <T> T getAction(final StepType steptype, final Long actionid)
  {
    return (T) actions.get(steptype).get(actionid);
  }

  @SuppressWarnings("unchecked")
  public <T> T getAnswer(final ExerciseXML exercise, final StepXML step)
  {
    return (T) answers.get(exercise.getId()).get(step.getActionId());
  }

  public Map<Long, Object> getAnswers(final ExerciseXML exercise)
  {
    return answers.get(exercise.getId());
  }

}
