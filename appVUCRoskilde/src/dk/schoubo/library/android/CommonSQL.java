package dk.schoubo.library.android;

import java.util.Date;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

public abstract class CommonSQL extends CommonBaseSQL
{
  @Override public abstract CommonSQL getBlank();
  @Override public abstract CommonSQL copy();
  @Override public abstract CommonXML asXML();

  public abstract CommonSQL copy(final Cursor cursor);

  public abstract void get();
  public abstract void get(final Date since);

  public abstract void write();
  public abstract void update();
  public abstract void delete();
  public abstract void remove();

  public abstract List<CommonSQL> queryAllChildren(final String name);
  public abstract List<CommonSQL> queryAllChildrenOrderBy(final String name, final String order);
  public abstract List<CommonSQL> queryAllChildrenSince(final String name, final Date since);
  public abstract List<CommonSQL> queryAllChildrenOrderBySince(final String name, final String order, final Date since);


  public abstract String getTableNameSQL();
  public abstract String getAllFieldNamesSQL();

  public abstract String getCreateTableSQL();
  public abstract String getSelectByIdSQL();
  public abstract String getDropTableSQL();
  public abstract String getInsertSQL();
  public abstract String getUpdateSQL();
  public abstract String getDeleteByIdSQL();
  public abstract String getDeleteFromTableSQL();
  public abstract void bindForInsertOrUpdate(final SQLiteStatement statement);

}
