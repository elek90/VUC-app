package dk.lundogbendsen.vuc;

/**
 * Created by j on 30-10-15.
 */
public class Fag {
    private final String navn;

    public Fag(String n) {
        navn = n;
    }

    @Override
    public String toString() {
        return navn;
    }
}
