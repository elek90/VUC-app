/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidJava
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.lundogbendsen.vucroskilde.android.VUCRoskildeBusinessContext;
import dk.schoubo.library.android.RootGlobalState;
import dk.schoubo.library.android.sql.SQLiteOpenHelperRoot;
import static dk.lundogbendsen.vucroskilde.android.Constants.DATABASE_NAME;
import static dk.lundogbendsen.vucroskilde.android.Constants.DATABASE_VERSION;


public class GlobalState extends RootGlobalState<VUCRoskildeBusinessContext>
{

  @Override
  public void onCreate()
  {
    setBusinessContext(VUCRoskildeBusinessContext.INSTANCE);
    dk.schoubo.library.android.generated.GlobalSQLStructure.ensureInit();
    dk.lundogbendsen.vucroskilde.android.generated.GlobalSQLStructure.ensureInit();
    dk.schoubo.library.android.generated.GlobalXMLStructure.ensureInit();
    dk.lundogbendsen.vucroskilde.android.generated.GlobalXMLStructure.ensureInit();
    dk.schoubo.library.android.generated.GlobalSQLStructure.setDBHelper(new SQLiteOpenHelperRoot(this, DATABASE_NAME, DATABASE_VERSION));
  }
}
