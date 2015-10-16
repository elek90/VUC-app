/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidSQLite
 * 
 * Author: Jan Schoubo, schoubo reasoning
 */



package dk.schoubo.library.android.generated;

import dk.schoubo.library.android.CommonBaseSQL;
import dk.schoubo.library.android.CommonSQL;
import dk.schoubo.library.android.sql.SQLiteOpenHelperRoot;
import java.util.*;
import java.util.Collections;


public abstract class GlobalSQLStructure
{
  private static final List<Class<? extends CommonBaseSQL>> allclasses = new LinkedList<Class<? extends CommonBaseSQL>>();
  public static List<Class<? extends CommonBaseSQL>> getAllClasses() { return Collections.unmodifiableList(allclasses); }
  public static void addAllClasses(Class<? extends CommonBaseSQL> clazz) { allclasses.add(clazz); }

  private static SQLiteOpenHelperRoot dbhelper;
  public static void setDBHelper(final SQLiteOpenHelperRoot dbhelper) { GlobalSQLStructure.dbhelper = dbhelper; }
  public static SQLiteOpenHelperRoot getDBHelper() { return dbhelper; }

  static
  {
    allclasses.add(ParameterSQL.class);
    allclasses.add(TemplateSQL.class);
    allclasses.add(OneTimeTokenSQL.class);
    allclasses.add(JobSQL.class);
  }

  private static final List<Class<? extends CommonSQL>> tableclasses = new LinkedList<Class<? extends CommonSQL>>();
  public static List<Class<? extends CommonSQL>> getTableClasses() { return Collections.unmodifiableList(tableclasses); }
  public static void addTableClasses(Class<? extends CommonSQL> clazz) { tableclasses.add(clazz); }

  static
  {
    tableclasses.add(ParameterSQL.class);
    tableclasses.add(TemplateSQL.class);
    tableclasses.add(OneTimeTokenSQL.class);
    tableclasses.add(JobSQL.class);
  }

  private static final List<Class<? extends CommonSQL>> rootclasses = new LinkedList<Class<? extends CommonSQL>>();
  public static List<Class<? extends CommonSQL>> getRootClasses() { return Collections.unmodifiableList(rootclasses); }
  public static void addRootClasses(Class<? extends CommonSQL> clazz) { rootclasses.add(clazz); }

  static
  {
    rootclasses.add(ParameterSQL.class);
    rootclasses.add(TemplateSQL.class);
    rootclasses.add(OneTimeTokenSQL.class);
    rootclasses.add(JobSQL.class);
  }

  private static final Map<String, List<Class<? extends CommonSQL>>> tableclasschildren = new TreeMap<String, List<Class<? extends CommonSQL>>>();
  public static Map<String, List<Class<? extends CommonSQL>>> getTableClassChildren() { return Collections.unmodifiableMap(tableclasschildren); }
  public static List<Class<? extends CommonSQL>> getTableClassChild(Class<? extends CommonSQL> clazz) { return Collections.unmodifiableList(tableclasschildren.get(clazz.getName())); }
  public static void putTableClassChildren(Class<? extends CommonSQL> clazz, List<Class<? extends CommonSQL>> children) { tableclasschildren.put(clazz.getName(), children); }

  static
  {
    LinkedList<Class<? extends CommonSQL>> cc;

    cc = new LinkedList<Class<? extends CommonSQL>>();
    tableclasschildren.put(ParameterSQL.class.getName(), cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    tableclasschildren.put(TemplateSQL.class.getName(), cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    tableclasschildren.put(OneTimeTokenSQL.class.getName(), cc);

    cc = new LinkedList<Class<? extends CommonSQL>>();
    tableclasschildren.put(JobSQL.class.getName(), cc);

  }

  private static final Map<String, Class<? extends CommonSQL>> tableclassbyname = new TreeMap<String, Class<? extends CommonSQL>>();
  public static Map<String, Class<? extends CommonSQL>> getTableClassesByName() { return Collections.unmodifiableMap(tableclassbyname); }
  public static Class<? extends CommonSQL> getTableClassByName(String name) { return tableclassbyname.get(name); }
  public static void putTableClassByName(String name, Class<? extends CommonSQL> clazz) { tableclassbyname.put(name, clazz); }

  static
  {
    tableclassbyname.put("Parameter", ParameterSQL.class);
    tableclassbyname.put("Template", TemplateSQL.class);
    tableclassbyname.put("OneTimeToken", OneTimeTokenSQL.class);
    tableclassbyname.put("Job", JobSQL.class);
  }

  private static final Map<String, CommonSQL> tableinstancebyname = new TreeMap<String, CommonSQL>();
  public static Map<String, CommonSQL> getTableInstancesByName() { return Collections.unmodifiableMap(tableinstancebyname); }
  public static CommonSQL getTableInstanceByName(String name) { return tableinstancebyname.get(name).copy(); }
  public static void putTableInstanceByName(String name, CommonSQL record) { tableinstancebyname.put(name, record); }

  static
  {
    tableinstancebyname.put("Parameter", ParameterSQL.create());
    tableinstancebyname.put("Template", TemplateSQL.create());
    tableinstancebyname.put("OneTimeToken", OneTimeTokenSQL.create());
    tableinstancebyname.put("Job", JobSQL.create());
  }

  private static final Map<String, List<Integer>> tableclasspictureids = new TreeMap<String, List<Integer>>();
  public static Map<String, List<Integer>> getTableClassPictureIDs() { return Collections.unmodifiableMap(tableclasspictureids); }
  public static List<Integer> getTableClassPictureID(Class<? extends CommonSQL> clazz) { return Collections.unmodifiableList(tableclasspictureids.get(clazz.getName())); }
  public static void putTableClassPictureID(Class<? extends CommonSQL> clazz, List<Integer> ids) { tableclasspictureids.put(clazz.getName(), ids); }

  static
  {
    LinkedList<Integer> cc;

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(ParameterSQL.class.getName(), cc);

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(TemplateSQL.class.getName(), cc);

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(OneTimeTokenSQL.class.getName(), cc);

    cc = new LinkedList<Integer>();
    tableclasspictureids.put(JobSQL.class.getName(), cc);

  }

  public static final void ensureInit() { };

}
