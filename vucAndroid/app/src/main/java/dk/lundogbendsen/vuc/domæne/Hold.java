package dk.lundogbendsen.vuc.domæne;

import java.util.ArrayList;

/**
 * Created by j on 30-10-15.
 */
public class Hold {
  public String navn;
  public transient Emne[] emner;
  public ArrayList<String> emneIdListe = new ArrayList<String>();

  public Hold() {
  }

  public Hold(String n) {
    navn = n;
  }

  @Override
  public String toString() {
    return navn;
  }
}
