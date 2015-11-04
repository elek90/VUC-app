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
                new Fag("Matematik"),
                new Fag("Engelsk"),
        };
        fag = bru.fagListe[0];
        fag.emner = new Emne[]{
                new Emne("Lys - Niveau G"),
                new Emne("Lys - Niveau F-E-D"),
                new Emne("Husholdningskemi"),
                new Emne("Syrer og baser"),
        };
        fag.emner[0].aktiviteter = new Aktivitet[] {
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

        fag.emner[1].aktiviteter = new Aktivitet[] {
                new Aktivitet("Bliv klog på lys"),
                new Aktivitet("Sådan bruger du udstyret"),
                new Aktivitet("Tag et billede af den blå himmel"),
                new Aktivitet("Gennemfør din egen undersøgelse"),
                new Aktivitet("Tag billeder af lyskilde"),
                new Aflevering("Send rapport"),
        };

        fag.emner[2].aktiviteter = new Aktivitet[] {
                new Aktivitet("Kemi i køkkenet"),
                new Aktivitet("Forberedelse"),
                new Aktivitet("Mel og vand"),
                new Aktivitet("Gennemfør din egen undersøgelse"),
                new Aktivitet("Tag billeder af blanding"),
                new Aflevering("Send rapport"),
        };

        fag.emner[3].aktiviteter = new Aktivitet[] {
                new Aktivitet("Om PH-værdi"),
                new Aktivitet("Sikkerhed"),
                new Aktivitet("Mål PH-værdien af saltsyre"),
                new Aktivitet("Mål PH-værdien af fortyndet saltsyre"),
                new Aktivitet("Tag billeder af lakmuspapir"),
                new Aflevering("Send rapport"),
        };
        emne = fag.emner[0];
        l.lavKonsistent();
    }

    /*
    https://github.com/Nimrodda/WizarDroid/
    http://hackersome.com/p/welshk91/Android-WizardPager
    https://github.com/str4d/WizardPager
     */

    public void opdaterObservatører() {
        for (Runnable r : observatører) r.run();
    }
}
