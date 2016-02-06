package dk.lundogbendsen.vuc.domæne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by j on 30-10-15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bruger {
  public String navn;
  public String email;
  public String uid;
  public ArrayList<String> emneIdListe = new ArrayList<String>();
  public transient ArrayList<Emne> emner = new ArrayList<Emne>();
  public HashMap<String, HashMap<String, Svar>> svar = new HashMap<>(); // emne.id, trinId
  public String id = "b0";

  public Bruger() {
  }

  public Bruger(String navn, String email) {
    this.navn = navn;
    this.email = email;
  }
}
