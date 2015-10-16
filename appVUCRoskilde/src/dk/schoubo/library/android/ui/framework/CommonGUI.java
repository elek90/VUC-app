package dk.schoubo.library.android.ui.framework;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import dk.schoubo.library.android.BusinessContext;


public abstract class CommonGUI<C extends BusinessContext, A extends Enum<?>, D extends Enum<?>>
{
  @SuppressWarnings("unused")
  private static final String TAG = CommonGUI.class.getName();

  protected final RootActivity<C, ? extends CommonGUI<C, A, D>, A, D> activity;
  public RootActivity<C, ? extends CommonGUI<C, A, D>, A, D> getActivity() { return activity; }

  protected CommonGUI(final RootActivity<C, ? extends CommonGUI<C, A, D>, A, D> activity)
  {
    super();
    this.activity = activity;
  }

  public abstract A getBack();
  public abstract A getRefresh();

  // Lifecycle events
  public abstract A getCreate();
  public abstract A getStart();
  public abstract A getResume();
  public abstract A getPause();
  public abstract A getStop();
  public abstract A getDestroy();
  public abstract A getWindowFocusChanged();
  public abstract A getRestart();
  public abstract A getNewIntent();
  public abstract A getSaveInstanceState();
  public abstract A getRestoreInstanceState();

  protected abstract void onItemSelected(AdapterView<?> parent, View view, int pos, long id);
  protected abstract void onNothingSelected(AdapterView<?> parent);
  protected abstract boolean onCreateOptionsMenu(final Menu menu);
  protected abstract boolean onOptionsItemSelected(final MenuItem item);

  protected abstract void onActivityReturn(final int requestCode, final int resultCode, final Intent data);
}