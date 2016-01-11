package dk.lundogbendsen.vuc.domæne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by j on 30-10-15.
 */
@JsonIgnoreProperties
public class Bruger {
  public String navn;
  public String konto;
  public Hold[] holdListe;
  public String id = "b0";

  public Bruger() {
  }

  public Bruger(String navn, String konto) {
    this.navn = navn;
    this.konto = konto;
  }
}
