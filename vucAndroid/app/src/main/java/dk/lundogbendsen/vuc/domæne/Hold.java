package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 30-10-15.
 */
public class Hold {
  public String navn;
  public Emne[] emner;

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
