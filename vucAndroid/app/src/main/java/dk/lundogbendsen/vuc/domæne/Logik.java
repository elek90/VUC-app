package dk.lundogbendsen.vuc.domæne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

import dk.lundogbendsen.vuc.diverse.Log;

import static dk.lundogbendsen.vuc.domæne.Ikon.bog;
import static dk.lundogbendsen.vuc.domæne.Ikon.foto;
import static dk.lundogbendsen.vuc.domæne.Ikon.kat_forsøg;
import static dk.lundogbendsen.vuc.domæne.Ikon.kat_rapport;
import static dk.lundogbendsen.vuc.domæne.Ikon.kat_udstyr;
import static dk.lundogbendsen.vuc.domæne.Ikon.kat_viden;
import static dk.lundogbendsen.vuc.domæne.Ikon.notesblok;
import static dk.lundogbendsen.vuc.domæne.Ikon.skriv__uden_ikon;
import static dk.lundogbendsen.vuc.domæne.Ikon.video;
import static dk.lundogbendsen.vuc.domæne.Ikon.værktøj;
/**
 * Roden i træet af objekter, der repræsenterer data i app'en.
 * <p/>
 * Retter du via github så husk at skrive til Jacob (nordfalk@lundogbendsen.dk) bagefter.
 * Jacob Nordfalk 31-10-15.
 */
@JsonIgnoreProperties
public class Logik {
  public static Logik instans = new Logik();
  public transient Bruger[] brugere;
  public transient ArrayList<Emne> emner;

  public void lavTestdata() {
    brugere = new Bruger[]{new Bruger("Hans Hansen", "hans.hansen@gmail.com")};

    emner = new ArrayList<>();

    emner.add(new Emne("Lys - Niveau G", new Trin[]{
      new Trin(kat_viden, "Viden"),
      new Trin(bog, "Bliv klog på lys", "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder. \nBølgelængden af synligt lys ligger i intervallet fra ca. 380 nm (violet lys) til ca. 740 nm (rødt lys). De mellemliggende bølgelængder ses som blå, grøn, gul og orange. \n\nMere kortbølget stråling kaldes ultraviolet lys eller UV, og mere langbølget stråling kaldes infrarødt lys eller IR. I huden findes varmefølsomme receptorer som omdanner IR til varme. I huden findes endvidere pigment som aktiveres når huden udsættes for UV. Nogle dyr, f.eks. bier, kan se UV, mens andre dyr, f.eks. klapperslanger, kan se IR.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
      new Trin(kat_udstyr, "Udstyr"),
      new Trin(video, "Optag et spektrum med et spektrometer", "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      new Trin(video, "Lav dit eget spektroskop", "https://www.youtube.com/watch?v=Bke9CE59c-A&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      new Trin(video, "Brug af hjemmelavet spektroskop", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(kat_forsøg, "Forsøg"),
      new Trin(foto, "Tag et billede af den blå himmel"),
      new Trin(foto, "Tag et billede af en elektrisk pære"),
      new Trin(foto, "Tag billeder af spektrum"),
      new Trin(foto, "Tag billeder af lyskilde"),
      new Trin(kat_rapport, "Rapport"),
      new Trin(skriv__uden_ikon, "Beskriv dine observationer"),
      new Aflevering("Send rapport"),
    }));

    emner.add(new Emne("Vejr", new Trin[]{
      new Trin(kat_viden, "Viden"),
      new Trin(video, "Bliv klog på vejret. Kort præsentation af forskellige vejrfænomener.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Stormvejr – kraftig blæst – vindstille som kontrast – lavtryk og højtryk", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Nedbør: regn – sne – hagl", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Temperaturer (ekstreme) – frost – hedebølge", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Skytyper", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(kat_udstyr, "Udstyr"),
      new Trin(video, "Lav din egen vindmåler (alternativt udlånes Vaavud vindmåler til jackstik)", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Lav din egen regnmåler", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Brug din telefon som lysmåler – hente app.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Brug din telefon som termometer – hente app. (alternativt udlånes Thermodo termometer til jackstik)", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(kat_forsøg, "Forsøg"),
      new Trin(foto, "Undersøge vind: Hvordan opstår vind?"),
      new Trin(foto, "Måle vindhastigheder i naturen."),
      new Trin(foto, "Undersøge nedbør: Hvordan opstår nedbør?"),
      new Trin(foto, "Undersøge skyer – lys (solindstråling) – temparetur"),
      new Trin(foto, "Tag billeder af skytyper"),
      new Trin(kat_rapport, "Rapport"),
      new Trin(notesblok, "Beskriv dine observationer"),
      new Aflevering("Send rapport"),
    }));

    emner.add(new Emne("Kemi i din hverdag", new Trin[]{
            new Trin(kat_viden, "Bliv klog på kemi i hjemmet"),
            new Trin(video, "Syrers og basers egenskaber", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "pH skala og måling af syrers og basers styrke. Sammenhæng mellem fortynding og styrke", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Forklaringer på faglige begreber. " +
                    "Syrer indeholder H+-ioner.\n" +
                    "Baser indeholder OH-- ioner.\n" +
                    "Hvad er et neutralt stof?", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Hvad er ioner? – grundstoffernes periodiske system og oktetreglen.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Sikkerhedsmærkning af kemikalier", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(kat_udstyr, "Udstyr"),
            new Trin(video, "Fremstille egne indikator farvestoffer ud fra forskellige planter", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Fremstille eget indikatorpapir.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(kat_forsøg, "Forsøg"),
            new Trin(video, "Sikkerhedsinstruktioner. Det er vigtigt at du bruger briller og handsker", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(foto, "Kemikalier, der bruges til rengøring i hjemmet. " +
                    "Tag flere billeder. Der er både faste og flydende, og inddele i syrer-baser-neutrale stoffer. \n" +
                    "Husk at kommentere resultaterne."),
            new Trin(foto, "Undersøge madvarer og drikkevarer - både faste og flydende, og inddele i syrer-baser-neutrale stoffer. \n" +
                    "Kommentere resultaterne."),
            new Aflevering("Send rapport"),
    }));



    emner.add(new Emne("Lys - Niveau F-E-D", new Trin[]{
            new Trin(bog, "Bliv klog på lys", "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
            new Trin(bog, "Sådan bruger du udstyret", "Et spektrometer kan skille de forskellige farver ad. Kig i det, mens du holder det op en lyskilde, f.eks. himlen."),
            new Trin(bog, "Optag et spektrum med et spektrometer", "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
            new Trin(værktøj, "Gennemfør din egen undersøgelse", "Nu skal du bruge spektrometret"),
            new Trin(foto, "Tag et billede af den blå himmel"),
            new Trin(foto, "Tag billeder af lyskilde"),
            new Aflevering("Send rapport"),
    }));

    emner.add(new Emne("Husholdningskemi - Niveau G", new Trin[]{
            new Trin(bog, "Kemi i køkkenet"),
            new Trin(kat_udstyr, "Forberedelse"),
            new Trin(bog, "Mel og vand"),
            new Trin(kat_forsøg, "Gennemfør din egen undersøgelse"),
            new Trin(foto, "Tag billeder af blanding"),
            new Aflevering("Send rapport"),
    }));

    emner.add(new Emne("Syrer og baser", new Trin[]{
            new Trin("Om PH-værdi"),
            new Trin("Sikkerhed"),
            new Trin("Mål PH-værdien af saltsyre"),
            new Trin("Mål PH-værdien af fortyndet saltsyre"),
            new Trin("Tag billeder af lakmuspapir"),
            new Aflevering("Send rapport"),
    }));
    lavKonsistent();
  }


  private void lavKonsistent() {
    int nEmne = 1;
    Bruger b = brugere[0];
    for (Emne emne : emner) {
      if (emne.id==null) {
        emne.indtastningskode = ""+(1000+nEmne);
        emne.id = "e"+nEmne++;
        Log.d("Tildelt ID emne.id="+emne.id);
      }
      b.emneIdListe.add(emne.id);
      int nTrin = 1;
      if (emne.trin == null) {
        emne.trin = new Trin[]{new Trin("Trin 1"), new Trin("Trin 2"), new Trin("Trin 3"), new Trin("Trin 4"), new Aflevering("Aflevering")};
        for (Trin trin : emne.trin) {
          trin.ikon = Ikon.values()[(int) (Math.random() * Ikon.values().length)];
        }
      }
      for (Trin trin : emne.trin) {
        trin.emne = emne;
        if (trin.id==null) {
          trin.id = emne.id+"t"+nTrin++;
          Log.d("Tildelt ID trin.id="+trin.id + " "+trin.ikon+"/"+trin.navn);
        }
        Trin.idref.put(trin.id, trin);
      }
    }
  }
}
