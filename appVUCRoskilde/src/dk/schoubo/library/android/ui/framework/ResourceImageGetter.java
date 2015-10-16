package dk.schoubo.library.android.ui.framework;

import java.util.ArrayList;
import java.util.HashMap;

import android.graphics.drawable.Drawable;
import android.text.Html.ImageGetter;
import android.util.Log;
import dk.schoubo.library.android.BusinessContext;

public class ResourceImageGetter <C extends BusinessContext, G extends CommonGUI<C, A, D>, A extends Enum<?>, D extends Enum<?>> implements ImageGetter
{
  private static final String TAG = ResourceImageGetter.class.getName();

  private final RootActivity<C, G, A, D> activity;
  private final HashMap<String, Integer> table;

  public ResourceImageGetter(final RootActivity<C, G, A, D> activity, final ArrayList<ResourceInfo> ressources)
  {
    super();
    this.activity = activity;
    this.table = new HashMap<String, Integer>();

    for (ResourceInfo info : ressources)
    {
      this.table.put(info.getName(), info.getId());
    }
  }

  @Override
  public Drawable getDrawable(final String source)
  {
    Integer id = table.get(source);

    if (id == null)
    {
      Log.w(TAG, "Image file not defined:"+source);
      return null;
    }

    Drawable d = activity.getResources().getDrawable(id);
    d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
    return d;
  }

}
