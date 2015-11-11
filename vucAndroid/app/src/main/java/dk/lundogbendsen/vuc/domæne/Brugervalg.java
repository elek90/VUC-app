package dk.lundogbendsen.vuc.domæne;

import java.util.ArrayList;

/**
 * De valg, brugeren aktuelt har taget
 * Jacob Nordfalk 31-10-15.
 */
public class Brugervalg {
    public Bruger bru;
    public Fag fag;
    public Emne emne;
    public static Brugervalg instans = new Brugervalg();
    public ArrayList<Runnable> observatører = new ArrayList<Runnable>();

    public void initTestData(Logik l) {
        bru = l.brugere[0];
        fag = bru.fagListe[0];
        emne = fag.emner[0];
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
