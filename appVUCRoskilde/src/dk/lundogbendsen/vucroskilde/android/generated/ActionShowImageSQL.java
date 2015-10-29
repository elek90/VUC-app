/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidSQLite
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.database.*;
import android.database.sqlite.SQLiteStatement;
import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.schoubo.library.android.CommonSQL;
import dk.schoubo.library.android.generated.GlobalSQLStructure;
import dk.schoubo.library.android.sql.SQLUtil;
import dk.schoubo.library.android.util.*;
import java.util.*;
import java.util.Date;


public class ActionShowImageSQL extends CommonSQL implements Comparable<ActionShowImageSQL>
{
  Long id;
  public Long getId() { return id; }

  Long parentStep;
  public Long getParentStep() { return parentStep; }
  public void setParentStep(final StepSQL parentStep) { this.parentStep = parentStep.getId(); }
  public void setParentStep(final Long parentStepId) { this.parentStep = parentStepId; }

  MediaRefSQL imageRef;
  public MediaRefSQL getImageRef() { return imageRef; }
  public void setImageRef(final MediaRefSQL imageRef) { this.imageRef = imageRef; }

  String description;
  public String getDescription() { return description; }
  public void setDescription(final String description) { this.description = description; }

  Date timestamp;
  public Date getTimestamp() { return timestamp; }

  Date changestamp;
  public Date getChangestamp() { return changestamp; }

  Boolean deletestamp;
  public Boolean isDeletestamp() { return deletestamp; }

  ActionShowImageSQL()
  {
    super();
    this.parentStep = 0L;
    this.imageRef = new MediaRefSQL();
    this.description = "";
    this.timestamp = new Date();
    this.changestamp = new Date();
    this.deletestamp = false;
  }

  public static ActionShowImageSQL create() { return new ActionShowImageSQL(); }

  public static final ActionShowImageSQL BLANK = ActionShowImageSQL.create();
  @Override public ActionShowImageSQL getBlank() { return BLANK; }

  @Override
  public int compareTo(final ActionShowImageSQL o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof ActionShowImageSQL) && (this.id.equals(((ActionShowImageSQL)o).id)); 
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode(); 
  }

  @Override
  public ActionShowImageSQL copy()
  {
    ActionShowImageSQL recordSQL = new ActionShowImageSQL();
    recordSQL.id = this.getId();
    recordSQL.parentStep = this.parentStep;
    recordSQL.imageRef.placementType = this.imageRef.placementType;
    recordSQL.imageRef.placementPath = this.imageRef.placementPath;
    recordSQL.description = this.description;
    recordSQL.timestamp = this.timestamp;
    recordSQL.changestamp = this.changestamp;
    recordSQL.deletestamp = this.deletestamp;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "ActionShowImageSQL" +
      "[" +
        "id=" + id + ", " +
        "parentStep=" + parentStep + ", " +
        "imageRef=" + imageRef + ", " +
        "description=" + description + ", " +
        "timestamp=" + timestamp + ", " +
        "changestamp=" + changestamp + ", " +
        "deletestamp=" + deletestamp +
      "]";
  }

  @Override
  public ActionShowImageXML asXML()
  {
    ActionShowImageXML recordXML = ActionShowImageXML.create();
    recordXML.setId(this.getId());
    recordXML.setParentStep(this.getParentStep());
    recordXML.setImageRef(this.getImageRef().asXML());
    recordXML.setDescription(this.getDescription());
    recordXML.setTimestamp(this.getTimestamp());
    recordXML.setChangestamp(this.getChangestamp());
    recordXML.setDeletestamp(this.isDeletestamp());
    return recordXML;
  }

  @Override
  public ActionShowImageSQL copy(Cursor cursor)
  {
    ActionShowImageSQL recordSQL = new ActionShowImageSQL();
    recordSQL.id = cursor.getLong(cursor.getColumnIndex("ID"));
    recordSQL.parentStep = cursor.getLong(cursor.getColumnIndex("PARENTSTEP"));
    recordSQL.imageRef.placementType = PlacementType.valueOf(cursor.getString(cursor.getColumnIndex("IMAGEREF_PLACEMENTTYPE")));
    recordSQL.imageRef.placementPath = cursor.getString(cursor.getColumnIndex("IMAGEREF_PLACEMENTPATH"));
    recordSQL.description = cursor.getString(cursor.getColumnIndex("DESCRIPTION"));
    recordSQL.timestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("TIMESTAMP")));
    recordSQL.changestamp = DateAdapter.compactDate(cursor.getString(cursor.getColumnIndex("CHANGESTAMP")));
    recordSQL.deletestamp = Boolean.valueOf(cursor.getString(cursor.getColumnIndex("DELETESTAMP")));
    return recordSQL;
  }

  private static final String TABLE_NAME = "ACTIONSHOWIMAGE";
  @Override public String getTableNameSQL() { return TABLE_NAME; }

  private static final String ALL_FIELD_NAMES = "ID, PARENTSTEP, IMAGEREF_PLACEMENTTYPE, IMAGEREF_PLACEMENTPATH, DESCRIPTION, TIMESTAMP, CHANGESTAMP, DELETESTAMP";
  @Override public String getAllFieldNamesSQL() { return ALL_FIELD_NAMES; }

  private static final String CREATE_TABLE_STATEMENT = "CREATE TABLE ACTIONSHOWIMAGE(ID INTEGER, PARENTSTEP INTEGER NOT NULL, IMAGEREF_PLACEMENTTYPE TEXT NOT NULL, IMAGEREF_PLACEMENTPATH TEXT NOT NULL, DESCRIPTION TEXT NOT NULL, TIMESTAMP TEXT NOT NULL, CHANGESTAMP TEXT NOT NULL, DELETESTAMP TEXT NOT NULL, PRIMARY KEY (ID));";
  @Override public String getCreateTableSQL() { return CREATE_TABLE_STATEMENT; }

  private static final String DROP_TABLE_STATEMENT = "DROP TABLE IF EXISTS ACTIONSHOWIMAGE;";
  @Override public String getDropTableSQL() { return DROP_TABLE_STATEMENT; }

  private static final String INSERT_STATEMENT = "INSERT INTO ACTIONSHOWIMAGE(PARENTSTEP, IMAGEREF_PLACEMENTTYPE, IMAGEREF_PLACEMENTPATH, DESCRIPTION, TIMESTAMP, CHANGESTAMP, DELETESTAMP, ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
  @Override public String getInsertSQL() { return INSERT_STATEMENT; }

  private static final String UPDATE_STATEMENT = "UPDATE ACTIONSHOWIMAGE SET PARENTSTEP = ?, IMAGEREF_PLACEMENTTYPE = ?, IMAGEREF_PLACEMENTPATH = ?, DESCRIPTION = ?, TIMESTAMP = ?, CHANGESTAMP = ?, DELETESTAMP = ? WHERE ID = ?;";
  @Override public String getUpdateSQL() { return UPDATE_STATEMENT; }

  @Override
  public void bindForInsertOrUpdate(final SQLiteStatement statement)
  {
    statement.bindLong(1, this.parentStep);
    statement.bindString(2, this.imageRef.placementType.name());
    statement.bindString(3, this.imageRef.placementPath);
    statement.bindString(4, this.description);
    statement.bindString(5, DateAdapter.compactDate(this.timestamp));
    statement.bindString(6, DateAdapter.compactDate(this.changestamp));
    statement.bindString(7, this.deletestamp.toString());
    statement.bindLong(8, this.id);
  }

  private static final String SELECT_BY_ID_STATEMENT = "SELECT PARENTSTEP, IMAGEREF_PLACEMENTTYPE, IMAGEREF_PLACEMENTPATH, DESCRIPTION, TIMESTAMP, CHANGESTAMP, DELETESTAMP FROM ACTIONSHOWIMAGE WHERE ID=?;";
  @Override public String getSelectByIdSQL() { return SELECT_BY_ID_STATEMENT; }

  private static final String DELETE_BY_ID_STATEMENT = "DELETE FROM ACTIONSHOWIMAGE WHERE ID=?;";
  @Override public String getDeleteByIdSQL() { return DELETE_BY_ID_STATEMENT; }

  private static final String DELETE_FROM_TABLE_STATEMENT = "DELETE FROM ACTIONSHOWIMAGE;";
  @Override public String getDeleteFromTableSQL() { return DELETE_FROM_TABLE_STATEMENT; }

  public static ActionShowImageSQL query(final Long parentStep)
  {
    List<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowImageSQL.BLANK,
          "parentStep = ? AND deletestamp = 'false'",
          ""+parentStep);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionShowImageSQL queryOrderBy(final Long parentStep, final String order)
  {
    List<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowImageSQL.BLANK,
          "parentStep = ? AND deletestamp = 'false'",
          order, ""+parentStep);

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionShowImageSQL querySince(final Long parentStep, final Date since)
  {
    List<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowImageSQL.BLANK,
          "parentStep = ? AND changestamp >= ?",
          ""+parentStep, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static ActionShowImageSQL queryOrderBySince(final Long parentStep, final String order, final Date since)
  {
    List<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowImageSQL.BLANK,
          "parentStep = ? AND changestamp >= ?",
          order, ""+parentStep, DateAdapter.compactDate(since));

    if (records.size() == 0) return null;

    return records.iterator().next();
  }

  public static LinkedList<ActionShowImageSQL> queryAll(final Long parentStep)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowImageSQL.BLANK,
          filter,
          ""+parentStep);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildren(String name)
  {
      return null;
  }

  public static LinkedList<ActionShowImageSQL> queryAllOrderBy(final Long parentStep, final String order)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "deletestamp = 'false'";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowImageSQL.BLANK,
          filter,
          order, ""+parentStep);
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBy(String name, final String order)
  {
      return null;
  }

  public static LinkedList<ActionShowImageSQL> queryAllSince(final Long parentStep, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQuery(ActionShowImageSQL.BLANK,
          filter,
          ""+parentStep, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenSince(String name, final Date since)
  {
      return null;
  }

  public static LinkedList<ActionShowImageSQL> queryAllOrderBySince(final Long parentStep, final String order, final Date since)
  {
    Separator sep = new Separator("", " AND ");
    String filter = "";
    filter += sep.next() + "changestamp >= ?";
    if (parentStep != null) filter += sep.next() + "parentStep = ?";
    LinkedList<ActionShowImageSQL> records =
      GlobalSQLStructure.getDBHelper().runQueryOrderBy(ActionShowImageSQL.BLANK,
          filter,
          order, ""+parentStep, DateAdapter.compactDate(since));
    return records;
  }

  @Override
  public List<CommonSQL> queryAllChildrenOrderBySince(String name, final String order, final Date since)
  {
      return null;
  }

  @Override
  public void get()
  {
    ActionShowImageSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowImageSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.deletestamp) return;
      this.parentStep = recordSQL.parentStep;
      this.imageRef = recordSQL.imageRef;
      this.description = recordSQL.description;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ActionShowImageSQL get(final Long id)
  {
    ActionShowImageSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowImageSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.deletestamp) return null;
    return recordSQL;
  }

  @Override
  public void get(final Date since)
  {
    ActionShowImageSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowImageSQL.BLANK, id);
    if (recordSQL != null)
    {
      if (recordSQL.changestamp.before(since)) return;
      this.parentStep = recordSQL.parentStep;
      this.imageRef = recordSQL.imageRef;
      this.description = recordSQL.description;
      this.timestamp = recordSQL.timestamp;
      this.changestamp = recordSQL.changestamp;
      this.deletestamp = recordSQL.deletestamp;
    }
    else
    {
      this.id = null;
    }
  }

  public static ActionShowImageSQL get(final Long id, final Date since)
  {
    ActionShowImageSQL recordSQL = GlobalSQLStructure.getDBHelper().getObjectById(ActionShowImageSQL.BLANK, id);
    if (recordSQL == null) return null;
    if (recordSQL.changestamp.before(since)) return null;
    return recordSQL;
  }

  public static void write(final ActionShowImageSQL recordSQL)
  {
    recordSQL.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL);
  }

  @Override
  public void write()
  {
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);
  }

  @Override
  public void update()
  {
    ActionShowImageSQL recordOLD = ActionShowImageSQL.query(parentStep);
    if (recordOLD != null) this.id = recordOLD.id; else if (this.id == null) this.id = SQLUtil.nextId();
    this.changestamp = new Date();
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this, recordOLD != null);
  }

  public static void delete(final Long id)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.get(id);
    if (recordSQL == null) return;
    recordSQL.changestamp = new Date();
    recordSQL.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(recordSQL, true);
  }

  @Override
  public void delete()
  {
    this.changestamp = new Date();
    this.deletestamp = true;
    GlobalSQLStructure.getDBHelper().insertOrUpdate(this);
  }

  public static void remove(final Long id)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(ActionShowImageSQL.BLANK, id);
  }

  public static void removeAll(final Set<Long> ids)
  {
    GlobalSQLStructure.getDBHelper().deleteObjectsById(ActionShowImageSQL.BLANK, ids);
  }

  @Override
  public void remove()
  {
    GlobalSQLStructure.getDBHelper().deleteObjectById(ActionShowImageSQL.BLANK, this.id);
  }

  public static ActionShowImageXML queryAsXML(final Long parentStep)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.query(parentStep);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static ActionShowImageXML queryOrderByAsXML(final Long parentStep, String order)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.queryOrderBy(parentStep, order);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static LinkedList<ActionShowImageXML> queryAllAsXML(final Long parentStep)
  {
    List<ActionShowImageSQL> recordsSQL = ActionShowImageSQL.queryAll(parentStep);
    LinkedList<ActionShowImageXML> recordsXML = new LinkedList<ActionShowImageXML>();
    for (ActionShowImageSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static LinkedList<ActionShowImageXML> queryAllOrderByAsXML(final Long parentStep, String order)
  {
    List<ActionShowImageSQL> recordsSQL = ActionShowImageSQL.queryAllOrderBy(parentStep, order);
    LinkedList<ActionShowImageXML> recordsXML = new LinkedList<ActionShowImageXML>();
    for (ActionShowImageSQL recordSQL : recordsSQL) recordsXML.add(recordSQL.asXML());
    return recordsXML;
  }

  public static ActionShowImageXML getAsXML(final Long id)
  {
    ActionShowImageSQL recordSQL = ActionShowImageSQL.get(id);
    if (recordSQL == null) return null;
    return recordSQL.asXML();
  }

  public static final int ID_Id = 0;
  public static final int ID_ParentStep = 1;
  public static final int ID_ImageRefPlacementType = 2;
  public static final int ID_ImageRefPlacementPath = 3;
  public static final int ID_Description = 4;
  public static final int ID_Timestamp = 5;
  public static final int ID_Changestamp = 6;
  public static final int ID_Deletestamp = 7;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return id;
      case ID_ParentStep: return parentStep;
      case ID_ImageRefPlacementType: return imageRef.placementType;
      case ID_ImageRefPlacementPath: return imageRef.placementPath;
      case ID_Description: return description;
      case ID_Timestamp: return timestamp;
      case ID_Changestamp: return changestamp;
      case ID_Deletestamp: return deletestamp;
    }
    return null;
  }

  @Override
  public void set(final int fieldId, final Object value)
  {
    switch (fieldId)
    {
      case ID_Id: { id = (Long) value; return; }
      case ID_ParentStep: { parentStep = (Long) value; return; }
      case ID_ImageRefPlacementType: { imageRef.placementType = (PlacementType) value; return; }
      case ID_ImageRefPlacementPath: { imageRef.placementPath = (String) value; return; }
      case ID_Description: { description = (String) value; return; }
      case ID_Timestamp: { timestamp = (Date) value; return; }
      case ID_Changestamp: { changestamp = (Date) value; return; }
      case ID_Deletestamp: { deletestamp = (Boolean) value; return; }
    }
  }

  @Override
  public String getColumnName(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_Id: return "id";
      case ID_ParentStep: return "parentStep";
      case ID_ImageRefPlacementType: return "imageRef.placementType";
      case ID_ImageRefPlacementPath: return "imageRef.placementPath";
      case ID_Description: return "description";
      case ID_Timestamp: return "timestamp";
      case ID_Changestamp: return "changestamp";
      case ID_Deletestamp: return "deletestamp";
    }
    return null;
  }

}
