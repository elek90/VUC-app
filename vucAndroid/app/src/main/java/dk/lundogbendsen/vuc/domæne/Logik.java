package dk.lundogbendsen.vuc.domæne;

/**
 * Roden i træet af objekter, der repræsenterer data i app'en
 * Jacob Nordfalk 31-10-15.
 */
public class Logik {
    public static Logik i = new Logik();
    public Bruger[] brugere;

    public static void opretTestData(Logik l) {
        l.brugere = new Bruger[] { new Bruger("Hans Hansen", "hans.hansen@gmail.com") };
        Bruger hansHansen = l.brugere[0];
        hansHansen.fagListe = new Fag[] {
                new Fag("Naturfag"),
                new Fag("Matematik"),
                new Fag("Engelsk"),
        };
        Fag naturfag = hansHansen.fagListe[0];
        naturfag.emner = new Emne[]{
                new Emne("Lys - Niveau G"),
                new Emne("Lys - Niveau F-E-D"),
                new Emne("Husholdningskemi"),
                new Emne("Syrer og baser"),
        };
        naturfag.emner[0].aktiviteter = new Aktivitet[] {
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

        naturfag.emner[1].aktiviteter = new Aktivitet[] {
                new Aktivitet("Bliv klog på lys"),
                new Aktivitet("Sådan bruger du udstyret"),
                new Aktivitet("Tag et billede af den blå himmel"),
                new Aktivitet("Gennemfør din egen undersøgelse"),
                new Aktivitet("Tag billeder af lyskilde"),
                new Aflevering("Send rapport"),
        };

        naturfag.emner[2].aktiviteter = new Aktivitet[] {
                new Aktivitet("Kemi i køkkenet"),
                new Aktivitet("Forberedelse"),
                new Aktivitet("Mel og vand"),
                new Aktivitet("Gennemfør din egen undersøgelse"),
                new Aktivitet("Tag billeder af blanding"),
                new Aflevering("Send rapport"),
        };

        naturfag.emner[3].aktiviteter = new Aktivitet[] {
                new Aktivitet("Om PH-værdi"),
                new Aktivitet("Sikkerhed"),
                new Aktivitet("Mål PH-værdien af saltsyre"),
                new Aktivitet("Mål PH-værdien af fortyndet saltsyre"),
                new Aktivitet("Tag billeder af lakmuspapir"),
                new Aflevering("Send rapport"),
        };
        l.lavKonsistent();
    }


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
