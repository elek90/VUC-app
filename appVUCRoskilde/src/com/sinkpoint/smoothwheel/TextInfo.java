package com.sinkpoint.smoothwheel;

import android.graphics.Color;
import android.graphics.Paint;

public class TextInfo
{
  public TextInfo()
  {
    this(40, Color.GRAY);
  }

  public TextInfo(final int textSize, final int textColor)
  {
    this.textSize = textSize;

    paintText = new Paint();
    paintText.setTextSize(textSize-2);
    paintText.setAntiAlias(true);
    paintText.setColor(textColor);
    paintText.setTextAlign(Paint.Align.CENTER);

    this.backgroundColor = Color.GRAY;

    visible_offset = 3 * textSize;
  }



  private int textSize;
  public int getTextSize() { return textSize; }
  public void setTextSize(final int textSize)
  {
    this.textSize = textSize;
    visible_offset = 3*textSize;
    paintText.setTextSize(textSize);
  }

  private int textColor;
  public int getTextColor() { return textColor; }
  public void setTextColor(final int textColor)
  {
    this.textColor = textColor;
    paintText.setColor(textColor);
  }

  private int backgroundColor;
  public int getBackgroundColor() { return backgroundColor; }
  public void setBackgroundColor(final int backgroundColor) { this.backgroundColor = backgroundColor; }

  public int getOverflow() { return textSize; }

  private int visible_offset;
  public int getVisible_Offset() { return visible_offset; }
  public void setVisible_Offset(final int visibleOffset) { this.visible_offset = visibleOffset; }

  private final Paint paintText;
  public Paint getTextPaint() { return paintText; }


}
