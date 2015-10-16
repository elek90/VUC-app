package dk.schoubo.library.android.util;

import java.util.Iterator;

public class Separator implements Iterator<String>
{
  private final String first;
  private final String subsequent;

  private String next;

  public Separator(final String first, final String subsequent)
  {
    super();
    this.first = first;
    this.subsequent = subsequent;

    this.next = first;
  }

  @Override
  public String next()
  {
    String res = next;
    next = subsequent;
    return res;
  }

  public void clear()
  {
    next = first;
  }

  @Override
  public boolean hasNext()
  {
    return true;
  }

  @Override
  public void remove()
  {
  }

}
