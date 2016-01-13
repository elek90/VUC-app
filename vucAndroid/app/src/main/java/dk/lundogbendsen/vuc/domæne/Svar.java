package dk.lundogbendsen.vuc.domæne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by j on 09-12-15.
 */
@JsonIgnoreProperties
public class Svar {
  public String tekst = "";
  public ArrayList<Optagelse> optagelser;
  public String trinId;
  public String brugerId;

  public transient String id;
  public transient Trin trin;
  public transient Bruger bruger;
  public transient boolean ændretSkalGemmes;

  public Svar() {
  }

  public Svar(Bruger bru, Trin trin) {
    bruger = bru;
    brugerId = bruger.navn;
    this.trin = trin;
    trinId = trin.id;
  }

  public boolean harIndhold() {
    if (tekst!=null && tekst.length()>0) return true;
    if (optagelser!=null && optagelser.size()>0) return true;
    return false;
  }
}
