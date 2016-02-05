package dk.lundogbendsen.vuc.domæne;

/**
 * Created by j on 04-11-15.
 */
public enum Ikon {
//  public Type type;
  tom, bog, mail, video, kamera, tavle, noter_i_felten, mikrofon, notesblok,
  hjælp, mennesker, pen_og_blyant, værktøj, lyd, vigtigt, pære, advarsel,
  vedhæft, pipette, hammer, reagensglas, foto,
  skriv__uden_ikon,

  kat_viden(Type.kategori),
  kat_udstyr(Type.kategori),
  kat_forsøg(Type.kategori),
  kat_rapport(Type.kategori),
  ;

  public static enum Type { normal, kategori };
  public final Type type;

  Ikon() {
    this.type = Type.normal;
  }
  Ikon(Type type) {
    this.type = type;
  }


}
