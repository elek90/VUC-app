package dk.lundogbendsen.vuc.domæne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by j on 07-01-16.
 */
@JsonIgnoreProperties
public class Optagelse {
  public transient String id;

  /** URI (fil eller contentprovider) der har den lokale fil */
  public String lokalUri;

  /** URL til server hvor filen kan hentes */
  public String url;
  public String cloudinary_id;

  /** Om lokalUri findes på denne telefon. Det kan være den kommer fra en anden enhed */
  public transient boolean ignorerLokalUri;

  /** Dimensioner af billedet (bredde/højde, typisk 1.33) */
  public float aspektRatio;

  /** Beskrivelse af optagelsen */
  public String tekst;
}
