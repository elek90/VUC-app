package com.sinkpoint.smoothwheel;

import java.util.ArrayList;
import java.util.List;

public class StringWheelAdapter implements WheelAdapter
{
  private final ArrayList<String> items;
  protected int currentPosition;

  public StringWheelAdapter(final List<String> values)
  {
    this.items = new ArrayList<String>(values);
    this.currentPosition = 0;
  }

  @Override
  public int getAfterNum()
  {
    return this.getLen() - this.currentPosition;
  }

  @Override
  public int getBeforeNum()
  {
    return currentPosition;
  }

  @Override
  public int getCurIndex()
  {
    return currentPosition;
  }

  @Override
  public String getCurValue()
  {
    return this.items.get(this.getCurIndex());
  }

  @Override
  public String getLabel(final int index)
  {
    return this.items.get(index);
  }

  @Override
  public int getLen()
  {
    return this.items.size();
  }

  @Override
  public String getValue(final int index)
  {
    return this.items.get(index);
  }

  @Override
  public int nextIndex()
  {
    if (this.currentPosition < this.getLen() - 1)
    {
      this.currentPosition += 1;
    }
    return this.currentPosition;
  }

  @Override
  public int prevIndex()
  {
    if (this.currentPosition > 0)
    {
      this.currentPosition -= 1;
    }
    return this.currentPosition;
  }

  @Override
  public void setCurIndex(final int index)
  {
    this.currentPosition = index;
  }

  public void setValue(final int index, final String val)
  {
    this.items.set(index, val);
  }

  @Override
  public void setValue(final int index, final Object val)
  {
    this.items.set(index, (String)val);
  }

  @Override
  public void setCurValue(final Object val)
  {
    String v = (String)val;
    for (int i = 0; i < items.size(); i++)
    {
      if (v.equals(items.get(i)))
      {
        this.setCurIndex(i);
        return;
      }
    }
    setCurIndex(0);
  }

}
