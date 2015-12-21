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

import static dk.lundogbendsen.vuc.domæne.Ikon.*;
/**
 * Roden i træet af objekter, der repræsenterer data i app'en.
 * <p/>
 * Retter du via github så husk at skrive til Jacob (nordfalk@lundogbendsen.dk) bagefter.
 * Jacob Nordfalk 31-10-15.
 */
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
            new Emne("Lys - Niveau F-E-D"),
            new Emne("Husholdningskemi - Niveau G"),
            new Emne("Syrer og baser"),
    };
// Opgave -> Trin
    // OpgaveKategori -> TrinOverskrift
    naturfag.emner[0].trin = new Trin[]{
      /* VO */      new Trin("VIDEN OM", tavle),
      /* VO */      new Trin("Bliv klog på lys", bog, "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder. \nBølgelængden af synligt lys ligger i intervallet fra ca. 380 nm (violet lys) til ca. 740 nm (rødt lys). De mellemliggende bølgelængder ses som blå, grøn, gul og orange. \n\nMere kortbølget stråling kaldes ultraviolet lys eller UV, og mere langbølget stråling kaldes infrarødt lys eller IR. I huden findes varmefølsomme receptorer som omdanner IR til varme. I huden findes endvidere pigment som aktiveres når huden udsættes for UV. Nogle dyr, f.eks. bier, kan se UV, mens andre dyr, f.eks. klapperslanger, kan se IR.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
      /* UD */      new Trin("UDSTYR", værktøj),
      /* UD */      new Trin("Optag et spektrum med et spektrometer", video, "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      /* UD */      new Trin("Lav dit eget spektroskop", video, "https://www.youtube.com/watch?v=Bke9CE59c-A&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      /* UD */      new Trin("Brug af hjemmelavet spektroskop", video, "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      /* FO */      new Trin("FORSØG", pen_og_blyant),
      /* FO */      new Trin("Tag et billede af den blå himmel", foto),
      /* FO */      new Trin("Tag et billede af en elektrisk pære", foto),
      /* FO */      new Trin("Tag billeder af spektrum", foto),
      /* FO */      new Trin("Tag billeder af lyskilde", foto),
      /* FO */      new Trin("Beskriv dine observationer", notesblok),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[1].trin = new Trin[]{
            new Trin("Bliv klog på lys", bog, "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
            new Trin("Sådan bruger du udstyret", bog, "Et spektrometer kan skille de forskellige farver ad. Kig i det, mens du holder det op en lyskilde, f.eks. himlen."),
            new Trin("Optag et spektrum med et spektrometer", bog, "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
            new Trin("Gennemfør din egen undersøgelse", værktøj, "Nu skal du bruge spektrometret"),
            new Trin("Tag et billede af den blå himmel", foto),
            new Trin("Tag billeder af lyskilde", foto),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[2].trin = new Trin[]{
            new Trin("Kemi i køkkenet", bog),
            new Trin("Forberedelse", værktøj),
            new Trin("Mel og vand", bog),
            new Trin("Gennemfør din egen undersøgelse", værktøj),
            new Trin("Tag billeder af blanding", foto),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[3].trin = new Trin[]{
            new Trin("Om PH-værdi"),
            new Trin("Sikkerhed"),
            new Trin("Mål PH-værdien af saltsyre"),
            new Trin("Mål PH-værdien af fortyndet saltsyre"),
            new Trin("Tag billeder af lakmuspapir"),
            new Aflevering("Send rapport"),
    };
    lavKonsistent();
  }


  public void lavKonsistent() {
    if (brugere==null) lavTestdata();
    for (Bruger b : brugere) {
      if (b.holdListe == null) b.holdListe = new Hold[]{new Hold("Et hold")};
      for (Hold f : b.holdListe) {
        if (f.emner == null) f.emner = new Emne[]{new Emne("Et emne")};
        for (Emne e : f.emner) {
          if (e.trin == null) {
            e.trin = new Trin[]{new Trin("Trin 1"), new Trin("Trin 2"), new Trin("Trin 3"), new Trin("Trin 4"), new Aflevering("Aflevering")};
            for (Trin a : e.trin)
              a.ikon = Ikon.values()[(int) (Math.random() * Ikon.values().length)];
          }
          for (Trin a : e.trin) {
            a.emne = e;
          }
        }
      }
    }
  }
}
