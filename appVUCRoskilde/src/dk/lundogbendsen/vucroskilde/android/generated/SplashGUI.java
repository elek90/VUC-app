/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.sinkpoint.smoothwheel.OnWheelSpinListener;
import com.sinkpoint.smoothwheel.WheelAdapter;
import dk.lundogbendsen.vucroskilde.android.R;
import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.ui.framework.CommonGUI;
import dk.schoubo.library.android.ui.framework.RootActivity;


public class SplashGUI extends CommonGUI<VUCRoskildeBusinessContext, SplashActionPoint, NavigationPoint> implements OnClickListener, OnItemSelectedListener, OnWheelSpinListener, OnCheckedChangeListener
{

  public final ImageView imageViewSplashVUCLogo;
  public final ImageView imageViewSplashLundOgBendsenLogo;
  public final TextView textViewSplashTitle;
  public final TextView textViewSplashForAndroid;
  public final TextView textViewSplashVersion;

  public SplashGUI(final RootActivity<VUCRoskildeBusinessContext, SplashGUI, SplashActionPoint, NavigationPoint> activity)
  {
    super(activity);
    activity.switchLocale();
    activity.setContentView(R.layout.layout_splash);

    imageViewSplashVUCLogo = (ImageView) activity.findViewById(R.id.imageViewSplashVUCLogo);
    imageViewSplashLundOgBendsenLogo = (ImageView) activity.findViewById(R.id.imageViewSplashLundOgBendsenLogo);
    textViewSplashTitle = (TextView) activity.findViewById(R.id.textViewSplashTitle);
    textViewSplashForAndroid = (TextView) activity.findViewById(R.id.textViewSplashForAndroid);
    textViewSplashVersion = (TextView) activity.findViewById(R.id.textViewSplashVersion);
  }

  public static SplashGUI create(final RootActivity<VUCRoskildeBusinessContext, SplashGUI, SplashActionPoint, NavigationPoint> activity)
  {
    return new SplashGUI(activity);
  }

  @Override
  public void onClick(final View view)
  {
    switch (view.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onClick not covered..."); } 
    }
  }

  @Override
  public void onItemSelected(final AdapterView<?> parent, final View view, final int pos, final long id)
  {
    switch (parent.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onItemSelected not covered..."); } 
    }
  }

  @Override
  public void onNothingSelected(final AdapterView<?> parent)
  {
    switch (parent.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onNothingSelected not covered..."); } 
    }
  }

  @Override
  public void onWheelSpin(final View view, final WheelAdapter adapter, final int pos)
  {
    switch (view.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onWheelSpin not covered..."); } 
    }
  }

  @Override
  public void onCheckedChanged(final CompoundButton button, final boolean isChecked)
  {
    switch (button.getId())
    {
      default: { throw new RuntimeException("Serious error in generated code: onCheckedChanged not covered..."); } 
    }
  }

  @Override
  public boolean onCreateOptionsMenu(final Menu menu)
  {
    return activity.onCreateOptionsMenuSuper(menu);
  }

  @Override
  public boolean onOptionsItemSelected(final MenuItem item)
  {
    return activity.onOptionsItemSelectedSuper(item); 
  }

  @Override public SplashActionPoint getBack() { return SplashActionPoint.BACKSPLASH; } 

  @Override public SplashActionPoint getRefresh() { return SplashActionPoint.REFRESHSPLASH; } 

  @Override public SplashActionPoint getCreate() { return SplashActionPoint.CREATESPLASH; } 

  @Override public SplashActionPoint getStart() { return SplashActionPoint.STARTSPLASH; } 

  @Override public SplashActionPoint getResume() { return SplashActionPoint.RESUMESPLASH; } 

  @Override public SplashActionPoint getPause() { return SplashActionPoint.PAUSESPLASH; } 

  @Override public SplashActionPoint getStop() { return SplashActionPoint.STOPSPLASH; } 

  @Override public SplashActionPoint getDestroy() { return SplashActionPoint.DESTROYSPLASH; } 

  @Override public SplashActionPoint getWindowFocusChanged() { return SplashActionPoint.WINDOWFOCUSCHANGEDSPLASH; } 

  @Override public SplashActionPoint getRestart() { return SplashActionPoint.RESTARTSPLASH; } 

  @Override public SplashActionPoint getNewIntent() { return SplashActionPoint.NEWINTENTSPLASH; } 

  @Override public SplashActionPoint getSaveInstanceState() { return SplashActionPoint.SAVEINSTANCESTATESPLASH; } 

  @Override public SplashActionPoint getRestoreInstanceState() { return SplashActionPoint.RESTOREINSTANCESTATESPLASH; } 

  @Override
  protected void onActivityReturn(final int requestCode, final int resultCode, final Intent data)
  {
  }

}
