package dk.schoubo.library.android;

import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public abstract class CommonXML extends CommonBaseXML implements Comparable<CommonXML>
{
  @Override
  public abstract CommonXML getBlank();
  @Override
  public abstract CommonXML copy();
  @Override
  public abstract CommonSQL asSQL();

  @Element(required=false)
  protected Long id = null;
  public Long getId() { return id; }
  public void setId(final Long id) { this.id = id; }

  @Override
  public int compareTo(final CommonXML o)
  {
    return id.compareTo(o.id);
  }

  @Override
  public boolean equals(final Object o)
  {
    return (o instanceof CommonXML) && (this.id == ((CommonXML)o).id);
  }

  @Override
  public int hashCode()
  {
    return this.id.hashCode();
  }

  public abstract List<CommonXML> queryAllChildren(String name);
  public abstract List<CommonXML> queryAllChildrenOrderBy(String name, String order);
  public abstract List<CommonXML> queryAllChildrenSince(String name, Date since);
  public abstract List<CommonXML> queryAllChildrenOrderBySince(String name, String order, Date since);
}
