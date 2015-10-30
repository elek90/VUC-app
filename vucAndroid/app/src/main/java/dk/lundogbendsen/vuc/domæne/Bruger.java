package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 30-10-15.
 */
public class Bruger {
    String navn = "Hans Hansen";
    String konto = "hans.hansen@gmail.com";
    public Fag[] fagListe = { new Fag("Fysik"), new Fag("Kemi")};
    public Fag fag = fagListe[0];
}
