package com.sinkpoint.smoothwheel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class WheelView extends View
{
  @SuppressWarnings("unused")
  private static final String TAG = WheelView.class.getName();

  private WheelAdapter adapter;

  private OnWheelSpinListener listener;
  public void setOnWheelSpinListener(final OnWheelSpinListener listener) { this.listener = listener; }
  public OnWheelSpinListener getListener() { return listener; }

  private final TextInfo textinfo;

  private Boolean update = false;
  private Boolean automove = false;
  private int targetPos;
  private int curPos;
  @SuppressWarnings("unused")
  private int lastPos;

  private float velocity = 0f;
  @SuppressWarnings("unused")
  private float momentum = 0f;
  private final float mass = 10f;
  private final float damping = 0.04f;
  private final float spring = 0.3f;
  private final float ep = 0.5f; // distance between two values before target move to next

  private NinePatchDrawable ind9;
  private float lastTouchY;
  private boolean disable = false;

  //  @SuppressWarnings("unused")
  //  private final ScrollView scrollContainer = null;


  public int visibleNum;
  private int preNum;
  @SuppressWarnings("unused")
  private int postNum;
  private int[] center;
  private int[] adapterRange;


  private final Paint ip;

  /**
   * Constructor
   * @param context
   * @param attrs
   */
  public WheelView(final Context context, final AttributeSet attrs)
  {
    super(context, attrs);
    int drawableResourceId = this.getResources().getIdentifier("wheel_background", "drawable", context.getPackageName());
    Bitmap indbp = BitmapFactory.decodeResource(getResources(), drawableResourceId); // _ind
    if (indbp != null)
    {
      ind9 = new NinePatchDrawable(getResources(), indbp, indbp.getNinePatchChunk(), new Rect(0, 0, 0, 0), null);
    }
    //    setBackgroundColor(Color.WHITE);

    setFocusable(true);
    setFocusableInTouchMode(true);

    textinfo = new TextInfo(60, Color.LTGRAY);

    // For debug only...
    ip = new Paint();
    ip.setColor(Color.RED);
    ip.setAlpha(220);
    ip.setStrokeWidth(2);
  }

  public void setTextSize(final int textSize)
  {
    textinfo.setTextSize(textSize);
  }

  public void setTextColor(final int textColor)
  {
    textinfo.setTextColor(textColor);
  }

  @Override
  public boolean dispatchTouchEvent(final MotionEvent event)
  {
    return super.dispatchTouchEvent(event);
  }

  @Override
  protected void onFocusChanged(final boolean gainFocus, final int direction, final Rect previouslyFocusedRect)
  {
    super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
  }

  public WheelAdapter getAdapter()
  {
    return adapter;
  }

  private int[] getCenter()
  {
    int[] res = { getWidth() / 2, getHeight() / 2 };
    return res;
  }

  private int[] getTargetOffset()
  {
    adapterRange = new int[] { 0, 0 };
    center = getCenter();
    preNum = adapter.getBeforeNum();
    postNum = adapter.getAfterNum();

    int txtOffset = textinfo.getTextSize();

    int upperLimit = preNum;// Math.min(_cutoff, pre);
    // int lowerLimit = postNum;// Math.min(_cutoff, post);

    // adp_range[0] = _adp.getCurIndex() - upperLimit;
    // adp_range[1] = _adp.getCurIndex() + lowerLimit;
    adapterRange[0] = 0;
    adapterRange[1] = adapter.getLen();

    targetPos = center[1] - txtOffset * upperLimit + textinfo.getTextSize() / 2;

    return adapterRange;
  }

  @Override
  protected void onDraw(final Canvas canvas)
  {
    super.onDraw(canvas);

    //    Log.d(TAG, "WheelView.onDraw called");
    //    if (disable)
    //      setBackgroundResource(R.drawable.wheelnew_disabled_bg);
    //    else
    //      setBackgroundResource(R.drawable.wheelnew_bg);
    //    if (disable)
    //      setBackgroundColor(Color.GRAY);
    //    else
    //      setBackgroundColor(Color.WHITE);

    canvas.drawColor(textinfo.getBackgroundColor());

    if (adapter == null)
    {
      return;
    }

    int[] center = getCenter();
    int[] adpRange = getTargetOffset();

    if (!update)
    {
      curPos = targetPos;
    }

    // DEBUG
//    canvas.drawLine(0, center[1], getWidth(), center[1], ip);

    //    canvas.drawText("" + _adp.getCurIndex(), 10, 10, ip);
    //    canvas.drawText("" + curPos + " -> " +targetPos, 10, 20, ip);

    // Log.d(TAG, "curOffset:"+curOffset);
    // Log.d(TAG, "targetOffset:"+targetOffset);
    int y = curPos - 5;
    for (int i = adpRange[0]; i < adpRange[1]; i++)
    {
      if ( y > (center[1]-textinfo.getVisible_Offset()) && y < (center[1]+textinfo.getVisible_Offset()))
        canvas.drawText(adapter.getLabel(i), center[0], y, textinfo.getTextPaint());
      y += textinfo.getTextSize();

    }

    if (update)
    {
      if (curPos == targetPos)
      {
        update = false;
      }
      else if (automove == true)
      {
        // sprint back if velocity = 0
        float vmag = Math.abs(velocity);

        if (vmag < textinfo.getTextSize()/2)
        {
          float delta = targetPos - curPos;
          curPos += spring * delta;
        }
        else
        {
          velocity = velocity * (1.0f - damping);
          if ( vmag < 0.1 ) velocity = 0;

          curPos += velocity;

          if ( curPos - targetPos == 0 || isOverflow(velocity) != 0 )
          {
            velocity = 0;
          }
        }
        updateTargetOffset();
      }
      invalidate();
    }

    int h9 = textinfo.getTextSize() / 2;

    ind9.setBounds(0, center[1] - h9, getWidth(), center[1] + h9);
    ind9.draw(canvas);
  }

  @Override
  protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec)
  {
    // super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    int wmode = MeasureSpec.getMode(widthMeasureSpec);
    int hmode = MeasureSpec.getMode(heightMeasureSpec);
    int wsize = MeasureSpec.getSize(widthMeasureSpec);
    int hsize = MeasureSpec.getSize(heightMeasureSpec);

    int width = 60;
    int height = 100;

    if (wmode == MeasureSpec.EXACTLY)
    {
      width = wsize;
    }
    if (hmode == MeasureSpec.EXACTLY)
    {
      height = hsize;
    }

    textinfo.setVisible_Offset(height/2 + textinfo.getTextSize());

    setMeasuredDimension(width, height);
  }

  @Override
  public boolean onTouchEvent(final MotionEvent event)
  {
    if (disable) return true;

    getParent().requestDisallowInterceptTouchEvent(true);
    switch (event.getAction())
    {
      case MotionEvent.ACTION_DOWN:
      {
        lastTouchY = event.getY();
        automove = false;
        // System.out.println("##" + lastTouchY);
        break;
      }

      case MotionEvent.ACTION_MOVE:
      {
        float delta = event.getY() - lastTouchY;

        // Log.d(WheelView.TAG, "ACTION_MOVE DELTA:" + delta);
        // Log.d(TAG,"target:"+targetOffset+" -- cur:"+curOffset);
        if (isOverflow(delta) != 0)
        {
          velocity = 0;
        }
        else
        {
          lastPos = curPos;
          curPos += delta;
          velocity = delta;
          momentum = velocity * mass;
          updateTargetOffset();
        }

        lastTouchY = event.getY();
        break;
      }

      case MotionEvent.ACTION_UP:
      {
        getParent().requestDisallowInterceptTouchEvent(false);
        automove = true;
        break;
      }

    }

    update = true;
    invalidate();

    return true;
  }

  private int isOverflow(final float delta)
  {
    if (adapter.getCurIndex() == 0 && delta > 0)
    {
      // I'm at top, and is scrolling up
      curPos = (int) Math.min(curPos + delta, targetPos + textinfo.getOverflow());
      return 1;

    }
    else if (adapter.getCurIndex() == adapter.getLen() - 1 && delta < 0)
    {
      // I'm at bottom and scrolling down
      curPos = (int) Math.max(curPos + delta, targetPos - textinfo.getOverflow());
      return -1;
    }

    return 0;
  }

  @Override
  public boolean onTrackballEvent(final MotionEvent event)
  {
    return super.onTrackballEvent(event);
  }

  @Override
  public void onWindowFocusChanged(final boolean hasWindowFocus)
  {
    super.onWindowFocusChanged(hasWindowFocus);
  }

  public void setAdapter(final WheelAdapter adapter)
  {
    this.adapter = adapter;
    invalidate();
  }

  private void updateTargetOffset()
  {
    if (curPos - targetPos > textinfo.getTextSize() * ep)
    {
      // if we have moved down 70% of the text size, then advance target index
      adapter.prevIndex();
      getTargetOffset();
      //      Log.d(TAG, "##LESS: "+adapter.getCurIndex());
      if (listener != null) listener.onWheelSpin(this, adapter, adapter.getCurIndex());
    }
    else if (curPos - targetPos < -1 * textinfo.getTextSize() * ep)
    {
      adapter.nextIndex();
      getTargetOffset();
      //      Log.d(TAG, "##MORE: "+adapter.getCurIndex());
      if (listener != null) listener.onWheelSpin(this, adapter, adapter.getCurIndex());
    }
  }

  public void setDisabled(final boolean state)
  {
    disable = state;
  }

}
