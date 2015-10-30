package dk.lundogbendsen.vuc;

/**
 * Created by j on 30-10-15.
 */
public class Fag {
    private final String navn;
    public EmneNiveau[] emner = {
            new EmneNiveau("Lys G"),
            new EmneNiveau("Lys F-E-D"),
            new EmneNiveau("Vejr"),
            new EmneNiveau("Kemi")};

    public Fag(String n) {
        navn = n;
    }

    @Override
    public String toString() {
        return navn;
    }
}
