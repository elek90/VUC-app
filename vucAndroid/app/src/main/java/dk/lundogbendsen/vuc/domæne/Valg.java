package dk.lundogbendsen.vuc.domæne;

/**
 * De valg, brugeren aktuelt har taget
 * Jacob Nordfalk 31-10-15.
 */
public class Valg {
    public Bruger bru;
    public Fag fag;
    public Emne emne;
    public static Valg i = new Valg();

    public void opretTestData(Logik l) {
        l.brugere = new Bruger[] { new Bruger("Hans Hansen", "hans.hansen@gmail.com") };
        bru = l.brugere[0];
        bru.fagListe = new Fag[] { new Fag("Naturfag"),  new Fag("Matematik") };
        fag = bru.fagListe[0];
        fag.emner = new Emne[]{
                new Emne("Lys - Niveau G"),
                new Emne("Lys - Niveau F-E-D"),
        };
        emne = fag.emner[0];
        emne.aktiviteter = new Aktivitet[] {
                new Aktivitet("1 Bliv klog på lys"),
                new Aktivitet("2.1 Sådan laver du eksperimenter"),
                new Aktivitet("2.2 Byg selv dit udstyr"),
                new Aktivitet("2.3.1 Tag et billede af den blå himmel"),
                new Aktivitet("2.3.2 Tag et billede af en elektrisk pære"),
                new Aktivitet("3 Gennemfør din egen undersøgelse"),
                new Aktivitet("3.1 Tag billeder af spektrum"),
                new Aktivitet("3.2 Tag billeder af lyskilde"),
                new Aktivitet("3.3 Aflever rapport"),
        };
    }
}
