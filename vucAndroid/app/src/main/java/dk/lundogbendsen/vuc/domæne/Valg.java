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

    public void opretTestData(Logik i) {
        i.brugere = new Bruger[] { new Bruger("Hans Hansen", "hans.hansen@gmail.com") };
        bru = i.brugere[0];
        bru.fagListe = new Fag[] { new Fag("Naturfag"),  new Fag("Matematik") };
        fag = bru.fagListe[0];
        fag.emner = new Emne[]{
                new Emne("Lys - Niveau G"),
                new Emne("Lys - Niveau F-E-D"),
        };
        emne = fag.emner[0];
    }
}
