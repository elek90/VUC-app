package dk.schoubo.library.android.ui.framework;

public class ResourceInfo
{
  private final String name;
  public String getName() { return name; }

  private final int id;
  public int getId() { return id; }

  public ResourceInfo(final String name, final int id)
  {
    super();
    this.name = name;
    this.id = id;
  }
}
