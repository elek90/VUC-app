package dk.lundogbendsen.vuc.domæne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by j on 31-10-15.
 */
@JsonIgnoreProperties
public class Emne {
  public String navn;
  public Trin[] trin;
  public String id;
  public String indtastningskode;
  public transient String tmpData = "Indlæser.....";

  public Emne() {
  }

  public Emne(String navn, Trin[] trin) {
    this.navn = navn;
    this.trin = trin;
  }

  @Override
  public String toString() {
    return navn;
  }
}
