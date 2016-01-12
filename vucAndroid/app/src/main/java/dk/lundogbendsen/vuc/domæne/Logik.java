package dk.lundogbendsen.vuc.domæne;

/*
Få implementeret at
 1) en opgave kan vises (incl videoer, lyd og tekst)
 2) en opgave kan besvares
        (ikke kun med kamera, også med billeder fra galleri)
        (incl videoer, lyd og tekst)
        (bare en mail)
 3) en ny opgve kan oprettes og redigeres
 4) redigere en eksisterende opgave, evt "klone" den først

 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import dk.lundogbendsen.vuc.diverse.Log;

import static dk.lundogbendsen.vuc.domæne.Ikon.*;
/**
 * Roden i træet af objekter, der repræsenterer data i app'en.
 * <p/>
 * Retter du via github så husk at skrive til Jacob (nordfalk@lundogbendsen.dk) bagefter.
 * Jacob Nordfalk 31-10-15.
 */
@JsonIgnoreProperties
public class Logik {
  public static Logik instans = new Logik();
  public Bruger[] brugere;

  public void lavTestdata() {
    brugere = new Bruger[]{new Bruger("Hans Hansen", "hans.hansen@gmail.com")};
    Bruger hans = brugere[0];

    hans.holdListe = new Hold[]{
            new Hold("Naturfag"),
            new Hold("Matematik"),
            new Hold("Engelsk I"),
    };

    Hold naturfag = hans.holdListe[0];
    naturfag.emner = new Emne[]{
            new Emne("Lys - Niveau G"),
            new Emne("Vejr"),
            new Emne("Kemi i din hverdag"),
            new Emne("Lys - Niveau F-E-D"),
            new Emne("Husholdningskemi - Niveau G"),
            new Emne("Syrer og baser"),
    };

    naturfag.emner[0].trin = new Trin[]{
      new Trin(tavle, "VIDEN OM"),
      new Trin(bog, "Bliv klog på lys", "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder. \nBølgelængden af synligt lys ligger i intervallet fra ca. 380 nm (violet lys) til ca. 740 nm (rødt lys). De mellemliggende bølgelængder ses som blå, grøn, gul og orange. \n\nMere kortbølget stråling kaldes ultraviolet lys eller UV, og mere langbølget stråling kaldes infrarødt lys eller IR. I huden findes varmefølsomme receptorer som omdanner IR til varme. I huden findes endvidere pigment som aktiveres når huden udsættes for UV. Nogle dyr, f.eks. bier, kan se UV, mens andre dyr, f.eks. klapperslanger, kan se IR.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
      new Trin(værktøj, "UDSTYR"),
      new Trin(video, "Optag et spektrum med et spektrometer", "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      new Trin(video, "Lav dit eget spektroskop", "https://www.youtube.com/watch?v=Bke9CE59c-A&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      new Trin(video, "Brug af hjemmelavet spektroskop", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(pen_og_blyant, "FORSØG"),
      new Trin(foto, "Tag et billede af den blå himmel"),
      new Trin(foto, "Tag et billede af en elektrisk pære"),
      new Trin(foto, "Tag billeder af spektrum"),
      new Trin(foto, "Tag billeder af lyskilde"),
      new Trin(notesblok, "Beskriv dine observationer"),
      new Aflevering("Send rapport"),
    };

    naturfag.emner[1].trin = new Trin[]{
      new Trin(tavle, "VIDEN OM"),
      new Trin(video, "Bliv klog på vejret. Kort præsentation af forskellige vejrfænomener.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Stormvejr – kraftig blæst – vindstille som kontrast – lavtryk og højtryk", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Nedbør: regn – sne – hagl", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Temperaturer (ekstreme) – frost – hedebølge", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Skytyper", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(værktøj, "UDSTYR"),
      new Trin(video, "Lav din egen vindmåler (alternativt udlånes Vaavud vindmåler til jackstik)", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Lav din egen regnmåler", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Brug din telefon som lysmåler – hente app.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(video, "Brug din telefon som termometer – hente app. (alternativt udlånes Thermodo termometer til jackstik)", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      new Trin(pen_og_blyant, "FORSØG"),
      new Trin(foto, "Undersøge vind: Hvordan opstår vind?"),
      new Trin(foto, "Måle vindhastigheder i naturen."),
      new Trin(foto, "Undersøge nedbør: Hvordan opstår nedbør?"),
      new Trin(foto, "Undersøge skyer – lys (solindstråling) – temparetur"),
      new Trin(foto, "Tag billeder af skytyper"),
      new Aflevering("Send rapport"),
    };

    naturfag.emner[2].trin = new Trin[]{
            new Trin(tavle, "Bliv klog på kemi i hjemmet"),
            new Trin(video, "Syrers og basers egenskaber", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "pH skala og måling af syrers og basers styrke. Sammenhæng mellem fortynding og styrke", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Forklaringer på faglige begreber." +
                    "Syrer indeholder H+-ioner.\n" +
                    "Baser indeholder OH-- ioner.\n" +
                    "Hvad er et neutralt stof?", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Hvad er ioner? – grundstoffernes periodiske system og oktetreglen.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Sikkerhedsmærkning af kemikalier", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(værktøj, "UDSTYR"),
            new Trin(video, "Fremstille egne indikator farvestoffer ud fra forskellige planter", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(video, "Fremstille eget indikatorpapir.", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(pen_og_blyant, "FORSØG"),
            new Trin(video, "Sikkerhedsinstruktioner. Det er vigtigt at du bruger briller og handsker", "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
            new Trin(foto, "Kemikalier, der bruges til rengøring i hjemmet. " +
                    "Tag flere billeder. Der er både faste og flydende, og inddele i syrer-baser-neutrale stoffer. \n" +
                    "Husk at kommentere resultaterne."),
            new Trin(foto, "Undersøge madvarer og drikkevarer - både faste og flydende, og inddele i syrer-baser-neutrale stoffer. \n" +
                    "Kommentere resultaterne."),
            new Aflevering("Send rapport"),
    };



    naturfag.emner[3].trin = new Trin[]{
            new Trin(bog, "Bliv klog på lys", "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
            new Trin(bog, "Sådan bruger du udstyret", "Et spektrometer kan skille de forskellige farver ad. Kig i det, mens du holder det op en lyskilde, f.eks. himlen."),
            new Trin(bog, "Optag et spektrum med et spektrometer", "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
            new Trin(værktøj, "Gennemfør din egen undersøgelse", "Nu skal du bruge spektrometret"),
            new Trin(foto, "Tag et billede af den blå himmel"),
            new Trin(foto, "Tag billeder af lyskilde"),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[4].trin = new Trin[]{
            new Trin(bog, "Kemi i køkkenet"),
            new Trin(værktøj, "Forberedelse"),
            new Trin(bog, "Mel og vand"),
            new Trin(værktøj, "Gennemfør din egen undersøgelse"),
            new Trin(foto, "Tag billeder af blanding"),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[5].trin = new Trin[]{
            new Trin("Om PH-værdi"),
            new Trin("Sikkerhed"),
            new Trin("Mål PH-værdien af saltsyre"),
            new Trin("Mål PH-værdien af fortyndet saltsyre"),
            new Trin("Tag billeder af lakmuspapir"),
            new Aflevering("Send rapport"),
    };
    lavKonsistent();
  }


  private void lavKonsistent() {
    int nEmne = 1;
    if (brugere==null) lavTestdata();
    for (Bruger b : brugere) {
      if (b.holdListe == null) b.holdListe = new Hold[]{new Hold("Et hold")};
      for (Hold hold : b.holdListe) {
        hold.emneIdListe.clear();
        if (hold.emner == null) hold.emner = new Emne[]{new Emne("Et emne")};
        for (Emne emne : hold.emner) {
          if (emne.id==null) {
            emne.id = "e"+nEmne++;
            Log.d("Tildelt ID emne.id="+emne.id);
          }
          hold.emneIdListe.add(emne.id);
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
              Log.d("Tildelt ID trin.id="+trin.id);
            }
            Trin.idref.put(trin.id, trin);
          }
        }
      }
    }
  }
}
