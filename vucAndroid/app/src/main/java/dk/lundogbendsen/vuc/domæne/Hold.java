package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 30-10-15.
 */
public class Hold {
    private final String navn;
    public Emne[] emner;
    public Hold(String n) {
        navn = n;
    }

    @Override
    public String toString() {
        return navn;
    }
}
