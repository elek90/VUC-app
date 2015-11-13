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
 * 
 * Retter du via github så husk at skrive til Jacob (nordfalk@lundogbendsen.dk) bagefter.
 * Jacob Nordfalk 31-10-15.
 */
public class Logik {
    public static Logik instans = new Logik();
    public Bruger[] brugere;

    public void lavTestdata() {
        brugere = new Bruger[] { new Bruger("Hans Hansen", "hans.hansen@gmail.com") };
        Bruger hans = brugere[0];

        hans.holdListe = new Hold[] {
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
        
        naturfag.emner[0].opgaver = new Opgave[] {
                new Opgave("Bliv klog på lys", bog),
                new Opgave("Sådan laver du eksperimenter", hjælp),
                new Opgave("Byg selv dit udstyr", værktøj),
                new Opgave("Tag et billede af den blå himmel", foto),
                new Opgave("Tag et billede af en elektrisk pære", foto),
                new Opgave("Gennemfør din egen undersøgelse", video),
                new Opgave("Tag billeder af spektrum", foto),
                new Opgave("Tag billeder af lyskilde", foto),
                new Aflevering("Send rapport"),
        };

        naturfag.emner[1].opgaver = new Opgave[] {
                new Opgave("Bliv klog på lys", bog),
                new Opgave("Sådan bruger du udstyret", hjælp),
                new Opgave("Tag et billede af den blå himmel", foto),
                new Opgave("Gennemfør din egen undersøgelse", værktøj),
                new Opgave("Tag billeder af lyskilde", foto),
                new Aflevering("Send rapport"),
        };

        naturfag.emner[2].opgaver = new Opgave[] {
                new Opgave("Kemi i køkkenet", bog),
                new Opgave("Forberedelse", værktøj),
                new Opgave("Mel og vand", bog),
                new Opgave("Gennemfør din egen undersøgelse", værktøj),
                new Opgave("Tag billeder af blanding", foto),
                new Aflevering("Send rapport"),
        };

        naturfag.emner[3].opgaver = new Opgave[] {
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
        for (Bruger b : brugere) {
            if (b.holdListe ==null) b.holdListe = new Hold[] { new Hold("Et hold")};
            for (Hold f : b.holdListe) {
                if (f.emner==null) f.emner = new Emne[] { new Emne("Et emne")};
                for (Emne e : f.emner) {
                    if (e.opgaver ==null) {
                        e.opgaver = new Opgave[] { new Opgave("Opgave 1"), new Opgave("Opgave 2"), new Opgave("Opgave 3"), new Opgave("Opgave 4"), new Aflevering("Aflevering")};
                        for (Opgave a : e.opgaver) a.ikon = Ikon.values()[(int)(Math.random()*Ikon.values().length)];
                    }
                    for (Opgave a : e.opgaver) {
                        a.emne = e;
                    }
                }
            }
        }
    }
}
