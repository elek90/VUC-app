/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Jan Schoubo, schoubo reasoning
 */



package dk.schoubo.library.android.generated;

import dk.schoubo.library.android.CommonBaseXML;
import dk.schoubo.library.android.CommonXML;
import java.util.*;
import java.util.Collections;


public abstract class GlobalXMLStructure
{
  private static final List<Class<? extends CommonBaseXML>> allclasses = new LinkedList<Class<? extends CommonBaseXML>>();
  public static List<Class<? extends CommonBaseXML>> getAllClasses() { return Collections.unmodifiableList(allclasses); }
  public static void addAllClasses(Class<? extends CommonBaseXML> clazz) { allclasses.add(clazz); }

  static
  {
    allclasses.add(ParameterXML.class);
    allclasses.add(TemplateXML.class);
    allclasses.add(OneTimeTokenXML.class);
    allclasses.add(JobXML.class);
  }

  private static final List<Class<? extends CommonXML>> tableclasses = new LinkedList<Class<? extends CommonXML>>();
  public static List<Class<? extends CommonXML>> getTableClasses() { return Collections.unmodifiableList(tableclasses); }
  public static void addTableClasses(Class<? extends CommonXML> clazz) { tableclasses.add(clazz); }

  static
  {
    tableclasses.add(ParameterXML.class);
    tableclasses.add(TemplateXML.class);
    tableclasses.add(OneTimeTokenXML.class);
    tableclasses.add(JobXML.class);
  }

  private static final List<Class<? extends CommonXML>> rootclasses = new LinkedList<Class<? extends CommonXML>>();
  public static List<Class<? extends CommonXML>> getRootClasses() { return Collections.unmodifiableList(rootclasses); }
  public static void addRootClasses(Class<? extends CommonXML> clazz) { rootclasses.add(clazz); }

  static
  {
    rootclasses.add(ParameterXML.class);
    rootclasses.add(TemplateXML.class);
    rootclasses.add(OneTimeTokenXML.class);
    rootclasses.add(JobXML.class);
  }

  private static final Map<String, List<Class<? extends CommonXML>>> tableclasschildren = new TreeMap<String, List<Class<? extends CommonXML>>>();
  public static Map<String, List<Class<? extends CommonXML>>> getTableClassChildren() { return Collections.unmodifiableMap(tableclasschildren); }
  public static List<Class<? extends CommonXML>> getTableClassChild(Class<? extends CommonXML> clazz) { return Collections.unmodifiableList(tableclasschildren.get(clazz.getName())); }
  public static void putTableClassChildren(Class<? extends CommonXML> clazz, List<Class<? extends CommonXML>> children) { tableclasschildren.put(clazz.getName(), children); }

  static
  {
    LinkedList<Class<? extends CommonXML>> cc;

    cc = new LinkedList<Class<? extends CommonXML>>();
    tableclasschildren.put(ParameterXML.class.getName(), cc);

    cc = new LinkedList<Class<? extends CommonXML>>();
    tableclasschildren.put(TemplateXML.class.getName(), cc);

    cc = new LinkedList<Class<? extends CommonXML>>();
    tableclasschildren.put(OneTimeTokenXML.class.getName(), cc);

    cc = new LinkedList<Class<? extends CommonXML>>();
    tableclasschildren.put(JobXML.class.getName(), cc);

  }

  private static final Map<String, Class<? extends CommonXML>> tableclassbyname = new TreeMap<String, Class<? extends CommonXML>>();
  public static Map<String, Class<? extends CommonXML>> getTableClassesByName() { return Collections.unmodifiableMap(tableclassbyname); }
  public static Class<? extends CommonXML> getTableClassByName(String name) { return tableclassbyname.get(name); }
  public static void putTableClassByName(String name, Class<? extends CommonXML> clazz) { tableclassbyname.put(name, clazz); }

  static
  {
    tableclassbyname.put("Parameter", ParameterXML.class);
    tableclassbyname.put("Template", TemplateXML.class);
    tableclassbyname.put("OneTimeToken", OneTimeTokenXML.class);
    tableclassbyname.put("Job", JobXML.class);
  }

  private static final Map<String, CommonXML> tableinstancebyname = new TreeMap<String, CommonXML>();
  public static Map<String, CommonXML> getTableInstancesByName() { return Collections.unmodifiableMap(tableinstancebyname); }
  public static CommonXML getTableInstanceByName(String name) { return tableinstancebyname.get(name).copy(); }
  public static void putTableInstanceByName(String name, CommonXML record) { tableinstancebyname.put(name, record); }

  static
  {
    tableinstancebyname.put("Parameter", ParameterXML.create());
    tableinstancebyname.put("Template", TemplateXML.create());
    tableinstancebyname.put("OneTimeToken", OneTimeTokenXML.create());
    tableinstancebyname.put("Job", JobXML.create());
  }

  private static final Map<String, List<Integer>> tableclasspictureids = new TreeMap<String, List<Integer>>();
  public static Map<String, List<Integer>> getTableClassPictureIDs() { return Collections.unmodifiableMap(tableclasspictureids); }
  public static List<Integer> getTableClassPictureID(Class<? extends CommonXML> clazz) { return Collections.unmodifiableList(tableclasspictureids.get(clazz.getName())); }
  public static void putTableClassPictureID(Class<? extends CommonXML> clazz, List<Integer> ids) { tableclasspictureids.put(clazz.getName(), ids); }

  static
  {
    LinkedList<Integer> cc;

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(ParameterXML.class.getName(), cc);

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(TemplateXML.class.getName(), cc);

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(OneTimeTokenXML.class.getName(), cc);

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(JobXML.class.getName(), cc);

  }

  public static final void ensureInit() { };

}
