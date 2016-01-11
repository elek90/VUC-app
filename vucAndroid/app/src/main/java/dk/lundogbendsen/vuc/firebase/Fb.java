package dk.lundogbendsen.vuc.firebase;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Bruger;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Emne;
import dk.lundogbendsen.vuc.domæne.Hold;
import dk.lundogbendsen.vuc.domæne.Logik;
import dk.lundogbendsen.vuc.domæne.Svar;
import dk.lundogbendsen.vuc.domæne.Trin;

/**
 * Created by j on 10-01-16.
 */
public class Fb {
  public static Firebase firebaseRefLogik;
  public static Firebase firebaseEmner;
  public static Firebase firebaseSvar;

  public static void gemTestdata() {
    firebaseRefLogik.setValue(Logik.instans);
    int nEmne = 1;
    for (Bruger b : Logik.instans.brugere) {
      for (Hold hold : b.holdListe) {
        for (Emne emne : hold.emner) {
          //Firebase fbTilføjEmne = firebaseEmner.push();
          //emne.id = fbTilføjEmne.getKey();
          emne.id = "e"+nEmne++;
          int nTrin = 1;
          for (Trin trin : emne.trin) {
            trin.emne = emne;
            trin.id = emne.id+"t"+nTrin++;
            Trin.idref.put(trin.id, trin);
          }
          hold.emneIdListe.add(emne.id);
          firebaseEmner.child(emne.id).setValue(emne);
          //fbTilføjEmne.setValue(emne);

        }
      }
    }
  }

  public static void initFb() {
    App.sætErIGang(true, "initFb");
    Firebase.setAndroidContext(App.instans);
    Firebase firebaseRef = new Firebase("https://vuc.firebaseio.com/v2");
    firebaseRefLogik = firebaseRef.child("_logik");
    firebaseEmner = firebaseRef.child("emner");
    firebaseSvar = firebaseRef.child("svar");

    firebaseRefLogik.addValueEventListener(new ValueEventListener() {
      int kaldNummer = 1;
      int holdNr;
      @Override
      public void onDataChange(DataSnapshot dataSnapshot) {
        if (!dataSnapshot.exists()) {
          App.instans.nulstilData();
          return;
        }
        Logik.instans = dataSnapshot.getValue(Logik.class);
        Brugervalg.instans.bru = Logik.instans.brugere[0];
        Brugervalg.instans.hold = Brugervalg.instans.bru.holdListe[0];

        holdNr = 0;
        for (final Hold h : Brugervalg.instans.bru.holdListe) {
          h.emner = new Emne[h.emneIdListe.size()];
          final ArrayList<Emne> emneliste = new ArrayList<Emne>(h.emner.length);
          for (final String emneId : h.emneIdListe) {
            firebaseEmner.child(emneId).addListenerForSingleValueEvent(new FbLytter() {
              @Override
              public void onDataChange(DataSnapshot dataSnapshot) {
                if (!dataSnapshot.exists()) {
                  Log.d("Emne "+emneId+" fandtes ikke i "+ firebaseEmner);
                  App.opstartTest = false;
                  h.emner = new Emne[0];
                  return;
                }
                emneliste.add(dataSnapshot.getValue(Emne.class));
                if (emneliste.size()<h.emneIdListe.size()) return; // flere emner
                h.emner = emneliste.toArray(h.emner);
                for (Emne e : h.emner) for (Trin t : e.trin) {
                  t.emne = e;
                  Trin.idref.put(t.id, t);
                }
                holdNr++;
                if (holdNr<Brugervalg.instans.bru.holdListe.length) return; // flere hold
                Brugervalg.instans.opdaterObservatører();
                if (kaldNummer++ == 1) App.sætErIGang(false, "initFb");
                else App.kortToast("Data er blevet opdateret\n(ud i hovedmenuen for at se ændringerne)");
              }
            });
          }
        }

        //Logik.instans.lavKonsistent();
        if (App.fejlsøgning) App.kortToast("Firebase data "+Logik.instans);
      }

      @Override
      public void onCancelled(FirebaseError firebaseError) {
      }
    });
  }

  public static void indlæsSvarForEmne(Bruger bru, final Emne emne, final Runnable callback) {
    Log.d("Fb.indlæsSvarForEmne("+emne+" med id="+emne.id);
    App.sætErIGang(true, "Fb.indlæsSvarForEmne("+emne+" med id="+emne.id);
    firebaseSvar.child(bru.id).child(emne.id).addListenerForSingleValueEvent(new FbLytter() {
      @Override
      public void onDataChange(DataSnapshot dataSnapshot) {
        App.sætErIGang(false, "Fb.indlæsSvarForEmne("+emne+" med id="+emne.id);
        if (!dataSnapshot.exists()) {
          // ok, så bruger vi den vi har
          return;
        }
        for (Trin t : emne.trin) {
          DataSnapshot fbsvar = dataSnapshot.child(t.id);
          if (fbsvar==null) continue;
          Svar svar = fbsvar.getValue(Svar.class);
          t.svar = svar;
        }
        Log.d("Fb.indlæsSvarForEmne() svar "+dataSnapshot);
        callback.run();
      }
    });
  }

  public static void gemSvarForEmne(Bruger bru, final Emne emne) {
    Firebase fbemne = firebaseSvar.child(bru.id).child(emne.id);
    for (Trin t : emne.trin) {
      if (t.svar==null || !t.svar.ændretSkalGemmes) continue;
      fbemne.child(t.id).setValue(t.svar);
      t.svar.ændretSkalGemmes = false;
    }
    Log.d("Fb.gemSvarForEmne("+emne+") "+fbemne.toString());
  }
}
