package dk.lundogbendsen.vuc.domæne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by j on 31-10-15.
 */
@JsonIgnoreProperties
public class Emne {
  public String navn;
  public Trin[] trin;
  public String id;

  public Emne() {
  }

  public Emne(String navn) {
    this.navn = navn;
  }

  @Override
  public String toString() {
    return navn;
  }
}
