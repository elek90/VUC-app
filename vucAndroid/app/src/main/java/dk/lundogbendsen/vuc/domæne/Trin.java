package dk.lundogbendsen.vuc.domæne;

import android.net.Uri;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;

import dk.lundogbendsen.vuc.diverse.Log;

/**
 * Created by j on 01-11-15.
 */
@JsonIgnoreProperties
public class Trin implements Serializable {
  public static HashMap<String, Trin> idref = new HashMap<>();
  public String navn;
  public Ikon ikon;
  public String videoUrl = null;//"Bke9CE59c-A";
  //public String url;
  public String tekst;
  public transient boolean udført;
  public transient Emne emne;
  public transient Svar svar;
  public String id;

  public Trin() {
  }

  public Trin(String navn) {
    this(Ikon.bog, navn);
  }

  public Trin(Ikon ikon, String navn) {
    this.navn = navn;
    this.ikon = ikon;
    splitEvtNavn();
  }

  public Trin(Ikon ikon, String navn, String ekstra) {
    this(ikon, navn);
    if (ekstra.startsWith("https://youtu.be")) {
      videoUrl =  Uri.parse(ekstra).getPath().substring(1);
      if (tekst==null) tekst = "(video)";
    }
    else if (ekstra.startsWith("https://www.youtube.com")) {
      videoUrl =  Uri.parse(ekstra).getQueryParameter("v");
      if (tekst==null) tekst = "(video)";
    }
    //else if (ekstra.startsWith("http")) url = ekstra;
    else tekst = ekstra;
  }

  private void splitEvtNavn() {
    int pos = navn.indexOf(".");
    if (pos<0 && navn.length()>16) pos = navn.indexOf(":");
    if (pos<0 && navn.length()>16) pos = navn.indexOf("(");
    if (pos<0 && navn.length()>16) pos = navn.indexOf("-");
    if (pos>0) {
      tekst = navn;
      navn = navn.substring(0, pos).trim();
    }
  }

  @Override
  public String toString() {
    return navn;
  }
}
