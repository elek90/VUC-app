package dk.lundogbendsen.vuc.domæne;

import java.util.ArrayList;

/**
 * De valg, brugeren aktuelt har taget
 * Jacob Nordfalk 31-10-15.
 */
public class Brugervalg {
  public Bruger bru;
  public Emne emne;
  public static Brugervalg instans = new Brugervalg();
  public ArrayList<Runnable> observatører = new ArrayList<Runnable>();
  public boolean redigeringstilstand;
  public boolean redigererNu;

  public void opdaterObservatører() {
    for (Runnable r : new ArrayList<>(observatører)) r.run();
  }

  public void tilføjOgKørObservatør(Runnable runnable) {
    observatører.add(runnable);
    runnable.run();
  }
}
