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
    naturfag.emner[0].opgaver = new Opgave[]{
      /* VO */      new Opgave("VIDEN OM", tavle),
      /* VO */      new Opgave("Bliv klog på lys", bog, "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder. \nBølgelængden af synligt lys ligger i intervallet fra ca. 380 nm (violet lys) til ca. 740 nm (rødt lys). De mellemliggende bølgelængder ses som blå, grøn, gul og orange. \n\nMere kortbølget stråling kaldes ultraviolet lys eller UV, og mere langbølget stråling kaldes infrarødt lys eller IR. I huden findes varmefølsomme receptorer som omdanner IR til varme. I huden findes endvidere pigment som aktiveres når huden udsættes for UV. Nogle dyr, f.eks. bier, kan se UV, mens andre dyr, f.eks. klapperslanger, kan se IR.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
      /* UD */      new Opgave("UDSTYR", værktøj),
      /* UD */      new Opgave("Optag et spektrum med et spektrometer", video, "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      /* UD */      new Opgave("Lav dit eget spektroskop", video, "https://www.youtube.com/watch?v=Bke9CE59c-A&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
      /* UD */      new Opgave("Brug af hjemmelavet spektroskop", video, "https://youtu.be/n7tt0I0P8gY?list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi"),
      /* FO */      new Opgave("FORSØG", pen_og_blyant),
      /* FO */      new Opgave("Tag et billede af den blå himmel", foto),
      /* FO */      new Opgave("Tag et billede af en elektrisk pære", foto),
      /* FO */      new Opgave("Tag billeder af spektrum", foto),
      /* FO */      new Opgave("Tag billeder af lyskilde", foto),
      /* FO */      new Opgave("Beskriv dine observationer", notesblok),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[1].opgaver = new Opgave[]{
            new Opgave("Bliv klog på lys", bog, "Øjet kan se forskellige farver. De forskellige farver skyldes, at lyset kan have forskellige bølgelængder.\n\nLæs mere på https://da.wikipedia.org/wiki/Lys"),
            new Opgave("Sådan bruger du udstyret", bog, "Et spektrometer kan skille de forskellige farver ad. Kig i det, mens du holder det op en lyskilde, f.eks. himlen."),
            new Opgave("Optag et spektrum med et spektrometer", bog, "https://www.youtube.com/watch?v=ZWZYtfT0ZZk&list=PLW_WKZMCQZMvbVXJ8yHLCGNx8LJJD5WAi&index=2"),
            new Opgave("Gennemfør din egen undersøgelse", værktøj, "Nu skal du bruge spektrometret"),
            new Opgave("Tag et billede af den blå himmel", foto),
            new Opgave("Tag billeder af lyskilde", foto),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[2].opgaver = new Opgave[]{
            new Opgave("Kemi i køkkenet", bog),
            new Opgave("Forberedelse", værktøj),
            new Opgave("Mel og vand", bog),
            new Opgave("Gennemfør din egen undersøgelse", værktøj),
            new Opgave("Tag billeder af blanding", foto),
            new Aflevering("Send rapport"),
    };

    naturfag.emner[3].opgaver = new Opgave[]{
            new Opgave("Om PH-værdi"),
            new Opgave("Sikkerhed"),
            new Opgave("Mål PH-værdien af saltsyre"),
            new Opgave("Mål PH-værdien af fortyndet saltsyre"),
            new Opgave("Tag billeder af lakmuspapir"),
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
          if (e.opgaver == null) {
            e.opgaver = new Opgave[]{new Opgave("Opgave 1"), new Opgave("Opgave 2"), new Opgave("Opgave 3"), new Opgave("Opgave 4"), new Aflevering("Aflevering")};
            for (Opgave a : e.opgaver)
              a.ikon = Ikon.values()[(int) (Math.random() * Ikon.values().length)];
          }
          for (Opgave a : e.opgaver) {
            a.emne = e;
          }
        }
      }
    }
  }
}
