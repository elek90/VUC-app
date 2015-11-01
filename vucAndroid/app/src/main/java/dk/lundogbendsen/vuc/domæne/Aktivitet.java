package dk.lundogbendsen.vuc.domæne;

import java.io.Serializable;

/**
 * Created by j on 01-11-15.
 */
public class Aktivitet implements Serializable {
    public final String navn;

    public Aktivitet(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
