package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 30-10-15.
 */
public class Niveau {
    private final String navn;

    public Niveau(String n) {
        navn = n;
    }

    @Override
    public String toString() {
        return navn;
    }
}
