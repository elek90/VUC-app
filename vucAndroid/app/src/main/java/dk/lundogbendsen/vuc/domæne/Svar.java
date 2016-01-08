package dk.lundogbendsen.vuc.domæne;

import java.util.ArrayList;

/**
 * Created by j on 09-12-15.
 */
public class Svar {
  public String tekst = "";
  public ArrayList<LydBillede> lydBilleder;
  public String trinId;
  public String brugerId;

  public transient String id;
  public transient Trin trin;
  public transient Bruger bruger;

  public Svar() {
  }

  public Svar(Bruger bru, Trin trin) {
    bruger = bru;
    brugerId = bruger.navn;
    this.trin = trin;
    trinId = trin.id;
  }
}
