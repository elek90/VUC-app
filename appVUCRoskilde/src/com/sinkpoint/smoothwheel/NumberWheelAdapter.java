package com.sinkpoint.smoothwheel;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class NumberWheelAdapter<T extends Number> implements WheelAdapter
{
  @SuppressWarnings("unused")
  private static final String TAG = NumberWheelAdapter.class.getName();

  private final ArrayList<T> items;
  private final DecimalFormat df;
  protected int currentPosition;

  public NumberWheelAdapter(final List<T> values, final String format)
  {
    df = new DecimalFormat(format);
    this.items = new ArrayList<T>(values);
    this.currentPosition = 0;

  }

  public NumberWheelAdapter(final int min, final int max, final int delta, final String format)
  {
    df = new DecimalFormat(format);
    this.items = new ArrayList<T>();
    for (int i = min; i <= max; i+=delta)
    {
      @SuppressWarnings("unchecked") T v = (T) Integer.valueOf(i);
      this.items.add(v);
    }
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
    return this.currentPosition;
  }

  @Override
  public int getCurIndex()
  {
    return this.currentPosition;
  }

  @Override
  public T getCurValue()
  {
    return this.items.get(this.getCurIndex());
  }

  @Override
  public String getLabel(final int index)
  {
    return df.format(this.items.get(index));
  }

  @Override
  public int getLen()
  {
    return this.items.size();
  }

  @Override
  public T getValue(final int index)
  {
    return this.items.get(index);
  }

  @Override
  public int nextIndex()
  {
//    Log.d(TAG, "nextIndex() called (was: "+this.currentPosition+"): "+Thread.currentThread().getStackTrace());

    if (this.currentPosition < this.getLen() - 1)
    {
      this.currentPosition += 1;
    }
    return this.currentPosition;
  }

  @Override
  public int prevIndex()
  {
//    Log.d(TAG, "prevIndex() called (was: "+this.currentPosition+"): "+Thread.currentThread().getStackTrace());

    if (this.currentPosition > 0) { this.currentPosition -= 1; }
    return this.currentPosition;
  }

  @Override
  public void setCurIndex(final int index)
  {
//    Log.d(TAG, "setCurIndex("+index+") called: "+Thread.currentThread().getStackTrace());

    this.currentPosition = index;
  }

  @SuppressWarnings("unchecked")
  @Override
  public void setValue(final int index, final Object val)
  {
    this.items.set(index, (T)val);
  }

  @Override
  public void setCurValue(final Object val)
  {
    Integer v = (Integer)val;
//    Log.d(TAG, "setCurValue("+v+") called: "+Thread.currentThread().getStackTrace());

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
