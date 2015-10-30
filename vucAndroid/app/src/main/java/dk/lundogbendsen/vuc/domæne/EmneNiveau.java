package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 30-10-15.
 */
public class EmneNiveau {
    private final String navn;

    public EmneNiveau(String n) {
        navn = n;
    }

    @Override
    public String toString() {
        return navn;
    }
}
