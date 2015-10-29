/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateGAEServerXML
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.schoubo.library.android.CommonBaseXML;
import java.io.Serializable;
import org.simpleframework.xml.*;


public class MediaRefXML extends CommonBaseXML implements Serializable
{
  @Element
  PlacementType placementType;
  public PlacementType getPlacementType() { return placementType; }
  public void setPlacementType(final PlacementType placementType) { this.placementType = placementType; }

  @Element(required=false)
  String placementPath = "";
  public String getPlacementPath() { return placementPath; }
  public void setPlacementPath(final String placementPath) { this.placementPath = placementPath; }

  protected MediaRefXML()
  {
    super();
    this.placementType = null;
    this.placementPath = "";
  }

  public static MediaRefXML create()
  {
    return new MediaRefXML();
  }

  public static final MediaRefXML BLANK = MediaRefXML.create();
  @Override public MediaRefXML getBlank() { return BLANK; }

  @Override public MediaRefXML copy()
  {
    MediaRefXML n = MediaRefXML.create();
    n.placementType = this.placementType;
    n.placementPath = this.placementPath;
    return n;
  }

  @Override
  public String toString()
  {
    return "MediaRefXML" +
      "[" +
        "placementType=" + placementType + ", " +
        "placementPath=" + placementPath +
      "]";
  }

  @Override
  public MediaRefSQL asSQL()
  {
    MediaRefSQL recordSQL = new MediaRefSQL();
    recordSQL.placementType = this.placementType; 
    recordSQL.placementPath = this.placementPath; 
    return recordSQL;
  }

}
