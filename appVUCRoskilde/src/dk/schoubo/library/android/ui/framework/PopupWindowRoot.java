package dk.schoubo.library.android.ui.framework;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;

public class PopupWindowRoot extends PopupWindow
{
  private Activity activity;

  public static PopupWindowRoot create(final Activity activity, final View contentView)
  {
    PopupWindowRoot popup = new PopupWindowRoot(contentView);

    popup.activity = activity;

    popup.setFocusable(true);

    // http://stackoverflow.com/questions/3121232/android-popup-window-dismissal
    popup.setBackgroundDrawable(new BitmapDrawable(activity.getResources()));
    popup.setOutsideTouchable(false);

    popup.setPopupWidthPercent(90);
    popup.setPopupHeight(LayoutParams.WRAP_CONTENT);

    return popup;
  }


  public PopupWindowRoot setPopupWidthPercent(final int percent)
  {
    this.setWidth((activity.getWindow().getDecorView().getWidth()*percent)/100);

    return this;
  }

  public PopupWindowRoot setPopupHeightPercent(final int percent)
  {
    this.setHeight((activity.getWindow().getDecorView().getHeight()*percent)/100);

    return this;
  }

  public PopupWindowRoot setPopupWidthHeightPercent(final int percent)
  {
    this.setWidth((activity.getWindow().getDecorView().getWidth()*percent)/100);
    this.setHeight((activity.getWindow().getDecorView().getHeight()*percent)/100);

    return this;
  }

  public PopupWindowRoot setPopupWidth(final int width)
  {
    this.setWidth(width);

    return this;
  }

  public PopupWindowRoot setPopupHeight(final int height)
  {
    this.setHeight(height);

    return this;
  }

  public PopupWindowRoot setPopupWidthHeight(final int width, final int height)
  {
    this.setWidth(width);
    this.setHeight(height);

    return this;
  }





  public PopupWindowRoot()
  {
    super();
  }

  public PopupWindowRoot(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes)
  {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  public PopupWindowRoot(final Context context, final AttributeSet attrs, final int defStyle)
  {
    super(context, attrs, defStyle);
  }

  public PopupWindowRoot(final Context context, final AttributeSet attrs)
  {
    super(context, attrs);
  }

  public PopupWindowRoot(final Context context)
  {
    super(context);
  }

  public PopupWindowRoot(final int width, final int height)
  {
    super(width, height);
  }

  public PopupWindowRoot(final View contentView)
  {
    super(contentView);
  }

  public PopupWindowRoot(final View contentView, final int width, final int height, final boolean focusable)
  {
    super(contentView, width, height, focusable);
  }

  public PopupWindowRoot(final View contentView, final int width, final int height)
  {
    super(contentView, width, height);
  }


}
