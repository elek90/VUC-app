package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 30-10-15.
 */
public class Logik {
    public static Logik i = new Logik();
    public Bruger[] brugere;
    public Valg valg = Valg.i;

    public void lavKonsistent() {
        for (Bruger b : brugere) {
            if (b.fagListe==null) b.fagListe = new Fag[] { new Fag("Et fag")};
            for (Fag f : b.fagListe) {
                if (f.emner==null) f.emner = new Emne[] { new Emne("Et emne")};
                for (Emne e : f.emner) {
                    if (e.aktiviteter==null) e.aktiviteter = new Aktivitet[] { new Aktivitet("Aktivitet 1"), new Aktivitet("Aktivitet 2"), new Aflevering("Aflevering")};
                    for (Aktivitet a : e.aktiviteter) {
                        a.emne = e;
                    }
                }
            }
        }
    }
}
