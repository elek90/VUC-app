/** THIS FILE IS GENERATED.
 * 
 * Dont make manual changes here, as it will be overwritten by the generator.
 * The generator class is dk.schoubo.generator.products.templates.TemplateAndroidSQLite
 * 
 * Author: Lund&Bendsen, Jan Schoubo
 */



package dk.lundogbendsen.vucroskilde.android.generated;

import dk.lundogbendsen.vucroskilde.android.data.PlacementType;
import dk.schoubo.library.android.CommonBaseSQL;


public class MediaRefSQL extends CommonBaseSQL
{
  PlacementType placementType;
  public PlacementType getPlacementType() { return placementType; }
  public void setPlacementType(final PlacementType placementType) { this.placementType = placementType; }

  String placementPath;
  public String getPlacementPath() { return placementPath; }
  public void setPlacementPath(final String placementPath) { this.placementPath = placementPath; }

  MediaRefSQL()
  {
    super();
    this.placementType = null;
    this.placementPath = "";
  }

  public static MediaRefSQL create() { return new MediaRefSQL(); }

  public static final MediaRefSQL BLANK = MediaRefSQL.create();
  @Override public MediaRefSQL getBlank() { return BLANK; }

  @Override
  public MediaRefSQL copy()
  {
    MediaRefSQL recordSQL = new MediaRefSQL();
    recordSQL.placementType = this.placementType;
    recordSQL.placementPath = this.placementPath;
    return recordSQL;
  }

  @Override
  public String toString()
  {
    return "MediaRefSQL" +
      "[" +
        "placementType=" + placementType + ", " +
        "placementPath=" + placementPath +
      "]";
  }

  @Override
  public MediaRefXML asXML()
  {
    MediaRefXML recordXML = MediaRefXML.create();
    recordXML.setPlacementType(this.getPlacementType());
    recordXML.setPlacementPath(this.getPlacementPath());
    return recordXML;
  }

  public static final int ID_PlacementType = 0;
  public static final int ID_PlacementPath = 1;

  @Override
  public Object get(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_PlacementType: return placementType;
      case ID_PlacementPath: return placementPath;
    }
    return null;
  }

  @Override
  public void set(final int fieldId, final Object value)
  {
    switch (fieldId)
    {
      case ID_PlacementType: { placementType = (PlacementType) value; return; }
      case ID_PlacementPath: { placementPath = (String) value; return; }
    }
  }

  @Override
  public String getColumnName(final int fieldId)
  {
    switch (fieldId)
    {
      case ID_PlacementType: return "placementType";
      case ID_PlacementPath: return "placementPath";
    }
    return null;
  }

}
