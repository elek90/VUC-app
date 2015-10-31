package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 31-10-15.
 */
public class Emne {
    private final String navn;

    public Emne(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
