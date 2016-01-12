package dk.lundogbendsen.vuc.nav2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by j on 12-01-16.
 */
public class DrawerLayout2 extends android.support.v4.widget.DrawerLayout {

  public DrawerLayout2(Context context) {
    super(context);
  }

  public DrawerLayout2(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public DrawerLayout2(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  public boolean onTouchEvent(MotionEvent ev) {
    return super.onTouchEvent(ev);
    //return false;
  }

  @Override
  public boolean onInterceptTouchEvent(MotionEvent ev) {
    return super.onInterceptTouchEvent(ev);
    //return false;
  }
}
