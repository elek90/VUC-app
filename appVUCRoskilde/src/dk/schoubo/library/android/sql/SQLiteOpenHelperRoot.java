package dk.schoubo.library.android.sql;

import java.util.LinkedList;
import java.util.Set;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import dk.schoubo.library.android.CommonSQL;
import dk.schoubo.library.android.CommonXML;
import dk.schoubo.library.android.generated.GlobalSQLStructure;
import dk.schoubo.library.android.generated.GlobalXMLStructure;

public class SQLiteOpenHelperRoot extends SQLiteOpenHelper
{
  private static final String TAG = SQLiteOpenHelperRoot.class.getName();

  public SQLiteOpenHelperRoot(final Context context, final String databasename, final int databaseversion)
  {
    super(context, databasename, null, databaseversion);
  }

  @Override
  public void onCreate(final SQLiteDatabase db)
  {
    // TODO If FOREIGN KEYS are enabled, we may have to sort by dependencies?

    for (CommonSQL recordSQL : GlobalSQLStructure.getTableInstancesByName().values())
    {
      String create = recordSQL.getCreateTableSQL();

//      db.beginTransaction();
      db.execSQL(create);
//      db.setTransactionSuccessful();
//      db.endTransaction();

      Log.d(TAG, create);
    }
  }


  @Override
  public void onOpen(final SQLiteDatabase db)
  {
    super.onOpen(db);
//    if (!db.isReadOnly())
//    {
//      db.execSQL("PRAGMA foreign_keys=ON;");
//    }
  }





  @Override
  public void onUpgrade(final SQLiteDatabase db, final int oldVersion, final int newVersion)
  {
    // TODO If FOREIGN KEYS are enabled, we may have to sort (reversed) by dependencies?

    Log.w(TAG, "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");

    for (CommonXML record : GlobalXMLStructure.getTableInstancesByName().values())
    {
      CommonSQL recordSQL = record.asSQL();
      String create = recordSQL.getDropTableSQL();

//      db.beginTransaction();
      db.execSQL(create);
//      db.setTransactionSuccessful();
//      db.endTransaction();

      Log.d(TAG, create);
    }

    onCreate(db);
  }






  public SQLiteStatement compileStatement(final String sql)
  {
    SQLiteDatabase db = getWritableDatabase();
    return db.compileStatement(sql);
  }

  public void startTransaction()
  {
    SQLiteDatabase db = getWritableDatabase();
    db.beginTransaction();
  }

  public void commit()
  {
    SQLiteDatabase db = getWritableDatabase();
    db.setTransactionSuccessful();
    db.endTransaction();
  }

  public void rollback()
  {
    SQLiteDatabase db = getWritableDatabase();
    db.endTransaction();
  }

  @Override
  public void close()
  {
    SQLiteDatabase db = getWritableDatabase();
    db.close();
  }


  @SuppressWarnings("unchecked")
  public <T extends CommonSQL> LinkedList<T> runQuery(final T recordSQL, final String filter, final String... param)
  {
    LinkedList<T> res = new LinkedList<T>();

    SQLiteDatabase db = getWritableDatabase();
    Cursor cursor = db.query(recordSQL.getTableNameSQL(), recordSQL.getAllFieldNamesSQL().split(","), filter, param, null, null, null);
    cursor.moveToFirst();
    while (!cursor.isAfterLast())
    {
      res.add((T)recordSQL.copy(cursor));
      cursor.moveToNext();
    }
    cursor.close();

    return res;
  }

  @SuppressWarnings("unchecked")
  public <T extends CommonSQL> LinkedList<T> runQueryOrderBy(final T recordSQL, final String filter, final String order, final String... param)
  {
    LinkedList<T> res = new LinkedList<T>();

    SQLiteDatabase db = getWritableDatabase();
    Cursor cursor = db.query(recordSQL.getTableNameSQL(), recordSQL.getAllFieldNamesSQL().split(","), filter, param, null, null, order);
    cursor.moveToFirst();
    while (!cursor.isAfterLast())
    {
      res.add((T)recordSQL.copy(cursor));
      cursor.moveToNext();
    }
    cursor.close();

    return res;
  }

  public <T extends CommonSQL> T getObjectById(final T recordSQL, final Long id)
  {
    SQLiteDatabase db = getWritableDatabase();
    Cursor cursor = db.query(recordSQL.getTableNameSQL(), recordSQL.getAllFieldNamesSQL().split(","), "ID = " + id, null, null, null, null);
    cursor.moveToFirst();
    if (!cursor.isLast()) return null;

    @SuppressWarnings("unchecked")
    T res = (T)recordSQL.copy(cursor);
    cursor.close();

    return res;
  }

  public <T extends CommonSQL> void insertOrUpdate(final T recordSQL)
  {
    Long id = (Long) recordSQL.get(0);
    T oldrecord = getObjectById(recordSQL, id);

    String sql = (oldrecord != null ? recordSQL.getUpdateSQL() : recordSQL.getInsertSQL());
    SQLiteStatement statement = compileStatement(sql);
    recordSQL.bindForInsertOrUpdate(statement);
    startTransaction();
    statement.execute();
    commit();
  }


  public <T extends CommonSQL> void insertOrUpdate(final T recordSQL, final boolean update)
  {
    String sql = (update ? recordSQL.getUpdateSQL() : recordSQL.getInsertSQL());
    SQLiteStatement statement = compileStatement(sql);
    recordSQL.bindForInsertOrUpdate(statement);
    startTransaction();
    statement.execute();
    commit();
  }

//  public <T extends CommonSQL> void insertOrUpdateAll(final List<T> recordsSQL, final boolean update)
//  {
//    if (recordsSQL.size() == 0) return;
//
//    String sql = null;
//    SQLiteStatement statement = null;
//
//    startTransaction();
//    for (T recordSQL : recordsSQL)
//    {
//      if (sql == null || statement == null)
//      {
//        sql = recordSQL.getInsertSQL();
//        statement = compileStatement(sql);
//      }
//      recordSQL.bindForInsertOrUpdate(statement);
//      statement.execute();
//    }
//    commit();
//  }

  public <T extends CommonSQL> void deleteObjectById(final T recordSQL, final Long id)
  {
    String sql = recordSQL.getDeleteByIdSQL();
    SQLiteStatement statement = compileStatement(sql);
    statement.bindLong(1, id);
    startTransaction();
    statement.execute();
    commit();
  }

  public <T extends CommonSQL> void deleteObjectsById(final T recordSQL, final Set<Long> ids)
  {
    String sql = null;
    SQLiteStatement statement = null;

    startTransaction();
    for (Long id : ids)
    {
      if (sql == null || statement == null)
      {
        sql = recordSQL.getDeleteByIdSQL();
        statement = compileStatement(sql);
      }
      statement.bindLong(1, id);
      statement.execute();
    }
    commit();
  }

  public <T extends CommonSQL> void deleteEveryRecord(final T recordSQL)
  {
    String sql = recordSQL.getDeleteFromTableSQL();
    SQLiteStatement statement = compileStatement(sql);
    startTransaction();
    statement.execute();
    commit();
  }
}