package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 31-10-15.
 */
public class Emne {
    public final String navn;
    public Opgave[] opgaver;

    public Emne(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
