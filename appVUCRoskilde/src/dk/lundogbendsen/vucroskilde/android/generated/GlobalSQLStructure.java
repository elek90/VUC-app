/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidSQLite
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.schoubo.library.android.CommonBaseSQL;
import dk.schoubo.library.android.CommonSQL;
import java.util.*;


public abstract class GlobalSQLStructure
{
  public static List<Class<? extends CommonBaseSQL>> getAllClasses() { return dk.schoubo.library.android.generated.GlobalSQLStructure.getAllClasses(); }

  static
  {
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(MediaRefSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(FlowchartSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(StepSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionShowVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionShowImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionShowAudioSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionShowTextSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionRecordVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionRecordImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionRecordAudioSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionRecordTextSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ActionSendReportSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(SchoolSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(TeamSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(StudentSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(ExerciseSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(AnswerSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(AnswerVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(AnswerImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addAllClasses(AnswerDescriptionSQL.class);
  }

  public static List<Class<? extends CommonSQL>> getTableClasses() { return dk.schoubo.library.android.generated.GlobalSQLStructure.getTableClasses(); }

  static
  {
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(FlowchartSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(StepSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionShowVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionShowImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionShowAudioSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionShowTextSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionRecordVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionRecordImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionRecordAudioSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionRecordTextSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ActionSendReportSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(SchoolSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(TeamSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(StudentSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(ExerciseSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(AnswerSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(AnswerVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(AnswerImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addTableClasses(AnswerDescriptionSQL.class);
  }

  public static List<Class<? extends CommonSQL>> getRootClasses() { return dk.schoubo.library.android.generated.GlobalSQLStructure.getRootClasses(); }

  static
  {
    dk.schoubo.library.android.generated.GlobalSQLStructure.addRootClasses(SchoolSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.addRootClasses(AnswerVideoSQL.class);
  }

  public static Map<String, List<Class<? extends CommonSQL>>> getTableClassChildren() { return dk.schoubo.library.android.generated.GlobalSQLStructure.getTableClassChildren(); }
  public static List<Class<? extends CommonSQL>> getTableClassChild(Class<? extends CommonSQL> clazz) { return dk.schoubo.library.android.generated.GlobalSQLStructure.getTableClassChild(clazz); }

  static
  {
    LinkedList<Class<? extends CommonSQL>> cc;

    cc = new LinkedList<Class<? extends CommonSQL>>();
    cc.add(StepSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(FlowchartSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(StepSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionShowVideoSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionShowImageSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionShowAudioSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionShowTextSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionRecordVideoSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionRecordImageSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionRecordAudioSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionRecordTextSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ActionSendReportSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    cc.add(FlowchartSQL.class);
    cc.add(TeamSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(SchoolSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    cc.add(StudentSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(TeamSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(StudentSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    cc.add(AnswerSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(ExerciseSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(AnswerSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(AnswerVideoSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(AnswerImageSQL.class, cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassChildren(AnswerDescriptionSQL.class, cc);

  }

  public static Map<String, Class<? extends CommonSQL>> getTableClassesByName() { return dk.schoubo.library.android.generated.GlobalSQLStructure.getTableClassesByName(); }
  public static Class<? extends CommonSQL> getTableClassByName(String name) { return dk.schoubo.library.android.generated.GlobalSQLStructure.getTableClassByName(name); }

  static
  {
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("Flowchart", FlowchartSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("Step", StepSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionShowVideo", ActionShowVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionShowImage", ActionShowImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionShowAudio", ActionShowAudioSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionShowText", ActionShowTextSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionRecordVideo", ActionRecordVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionRecordImage", ActionRecordImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionRecordAudio", ActionRecordAudioSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionRecordText", ActionRecordTextSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("ActionSendReport", ActionSendReportSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("School", SchoolSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("Team", TeamSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("Student", StudentSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("Exercise", ExerciseSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("Answer", AnswerSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("AnswerVideo", AnswerVideoSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("AnswerImage", AnswerImageSQL.class);
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableClassByName("AnswerDescription", AnswerDescriptionSQL.class);
  }

  public static Map<String, CommonSQL> getTableInstancesByName() { return dk.schoubo.library.android.generated.GlobalSQLStructure.getTableInstancesByName(); }
  public static CommonSQL getTableInstanceByName(String name) { return dk.schoubo.library.android.generated.GlobalSQLStructure.getTableInstanceByName(name); }

  static
  {
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("Flowchart", FlowchartSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("Step", StepSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionShowVideo", ActionShowVideoSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionShowImage", ActionShowImageSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionShowAudio", ActionShowAudioSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionShowText", ActionShowTextSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionRecordVideo", ActionRecordVideoSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionRecordImage", ActionRecordImageSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionRecordAudio", ActionRecordAudioSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionRecordText", ActionRecordTextSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("ActionSendReport", ActionSendReportSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("School", SchoolSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("Team", TeamSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("Student", StudentSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("Exercise", ExerciseSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("Answer", AnswerSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("AnswerVideo", AnswerVideoSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("AnswerImage", AnswerImageSQL.create());
    dk.schoubo.library.android.generated.GlobalSQLStructure.putTableInstanceByName("AnswerDescription", AnswerDescriptionSQL.create());
  }

  public static final void ensureInit() { };

}
