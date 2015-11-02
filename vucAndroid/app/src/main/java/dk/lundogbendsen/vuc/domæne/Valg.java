package dk.lundogbendsen.vuc.domæne;

import java.util.ArrayList;

/**
 * De valg, brugeren aktuelt har taget
 * Jacob Nordfalk 31-10-15.
 */
public class Valg {
    public Bruger bru;
    public Fag fag;
    public Emne emne;
    public static Valg i = new Valg();
    public ArrayList<Runnable> observatører = new ArrayList<Runnable>();

    public void opretTestData(Logik l) {
        l.brugere = new Bruger[] { new Bruger("Hans Hansen", "hans.hansen@gmail.com") };
        bru = l.brugere[0];
        bru.fagListe = new Fag[] {
                new Fag("Naturfag"),
                new Fag("Matematik")
        };
        fag = bru.fagListe[0];
        fag.emner = new Emne[]{
                new Emne("Lys - Niveau G"),
                new Emne("Lys - Niveau F-E-D"),
        };
        emne = fag.emner[0];
        emne.aktiviteter = new Aktivitet[] {
                new Aktivitet("Bliv klog på lys"),
                new Aktivitet("Sådan laver du eksperimenter"),
                new Aktivitet("Byg selv dit udstyr"),
                new Aktivitet("Tag et billede af den blå himmel"),
                new Aktivitet("Tag et billede af en elektrisk pære"),
                new Aktivitet("Gennemfør din egen undersøgelse"),
                new Aktivitet("Tag billeder af spektrum"),
                new Aktivitet("Tag billeder af lyskilde"),
                new Aflevering("Send rapport"),
        };
        l.lavKonsistent();
    }

    public void opdaterObservatører() {
        for (Runnable r : observatører) r.run();
    }
}
