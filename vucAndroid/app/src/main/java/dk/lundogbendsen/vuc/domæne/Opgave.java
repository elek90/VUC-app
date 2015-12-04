package dk.lundogbendsen.vuc.domæne;

import java.io.Serializable;

/**
 * Created by j on 01-11-15.
 */
public class Opgave implements Serializable {
    public String navn;
    public Ikon ikon;
    public transient Emne emne;

    public Opgave() { }

    public Opgave(String navn) { this(navn, Ikon.bog); }

    public Opgave(String navn, Ikon ikon) {
        this.navn = navn;
        this.ikon = ikon;
    }

    @Override
    public String toString() {
        return navn;
    }
}
