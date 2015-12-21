package dk.lundogbendsen.vuc.domæne;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by j on 01-11-15.
 */
public class Trin implements Serializable {
  public String navn;
  public Ikon ikon;
  public String videoUrl = null;//"Bke9CE59c-A";
  //public String url;
  public String tekst;
  public transient boolean udført;
  public transient Emne emne;
  public transient Svar svar;

  public Trin() {
  }

  public Trin(String navn) {
    this(navn, Ikon.bog);
  }

  public Trin(String navn, Ikon ikon) {
    this.navn = navn;
    this.ikon = ikon;
  }

  public Trin(String navn, Ikon ikon, String ekstra) {
    this(navn, ikon);
    if (ekstra.startsWith("https://youtu.be")) {
      videoUrl =  Uri.parse(ekstra).getPath().substring(1);
      tekst = "\n(Klik på videoen ovenfor)";
    }
    else if (ekstra.startsWith("https://www.youtube.com")) {
      videoUrl =  Uri.parse(ekstra).getQueryParameter("v");
      tekst = "\n(Klik på videoen ovenfor)";
    }
    //else if (ekstra.startsWith("http")) url = ekstra;
    else tekst = ekstra;
  }

  @Override
  public String toString() {
    return navn;
  }
}
