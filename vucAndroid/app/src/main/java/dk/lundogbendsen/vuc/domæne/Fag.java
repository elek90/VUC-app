package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 30-10-15.
 */
public class Fag {
    private final String navn;
    public Emne[] emner;
    public Fag(String n) {
        navn = n;
    }

    @Override
    public String toString() {
        return navn;
    }
}
