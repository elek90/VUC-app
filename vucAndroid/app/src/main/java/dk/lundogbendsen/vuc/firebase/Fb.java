package dk.lundogbendsen.vuc.firebase;

import com.firebase.client.AuthData;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.Date;

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
  public static Firebase firebaseRod;
  public static Firebase firebaseRefLogik;
  public static Firebase firebaseEmner;
  public static Firebase firebaseSvar;
  public static Firebase firebaseBruger;
  public static boolean initialiseret;

  // AuthData{uid='a50a54e7-bf82-4d2c-9816-cd50d9f31085', provider='password', token='***', expires='1453232975',
  // auth='{provider=password, uid=a50a54e7-bf82-4d2c-9816-cd50d9f31085}',
  // providerData='{email=jacno@dtu.dk, isTemporaryPassword=false, profileImageURL=https://secure.gravatar.com/avatar/36904d97418c4025ba6727ab57272ae4?d=retro}'}
  public static AuthData authData;

  public static void gemTestdata() {
    firebaseRefLogik.setValue(Logik.instans);
    for (Bruger b : Logik.instans.brugere) {
      for (Hold hold : b.holdListe) {
        for (Emne emne : hold.emner) {
          firebaseEmner.child(emne.id).setValue(emne);
        }
      }
    }
  }

  public static void initFb() {
    App.sætErIGang(true, "initFb");
    Firebase.setAndroidContext(App.instans);
    Firebase.getDefaultConfig().setPersistenceEnabled(true);
    firebaseRod = new Firebase("https://vuctest.firebaseio.com/v3");
    firebaseRefLogik = firebaseRod.child("_logik");
    firebaseEmner = firebaseRod.child("emner");
    firebaseSvar = firebaseRod.child("svar");
    sætAuthData(firebaseRod.getAuth());

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
                for (Emne e : h.emner) for (Trin trin : e.trin) {
                  trin.emne = e;
                  Trin.idref.put(trin.id, trin);
                  Log.d("TildeltFb ID trin.id="+trin.id + " "+trin.ikon+"/"+trin.navn);
                }
                holdNr++;
                if (holdNr<Brugervalg.instans.bru.holdListe.length) return; // flere hold
                initialiseret = true;
                Brugervalg.instans.opdaterValgFraNyLogikinstans(Logik.instans);
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

  public static void sætAuthData(AuthData authData1) {
    Log.d("Fb: Sæt authData="+ authData1 + " fra "+Fb.authData);
    Fb.authData = authData1;
    if (Fb.authData !=null) {
      firebaseBruger = firebaseRod.child("brugere").child(Fb.authData.getUid());
      firebaseBruger.child("sidst_brugt").setValue(new Date());
      Log.d("Fb: firebaseBruger="+ firebaseBruger);
    }
  }

  public static void indlæsSvarForEmne(Bruger bru, final Emne emne, final Runnable observatør) {
    Log.d("Fb.indlæsSvarForEmne("+emne+" med id="+emne.id);
    App.sætErIGang(true, "Fb.indlæsSvarForEmne("+emne+" med id="+emne.id);
    firebaseSvar.child(bru.id).child(emne.id).addListenerForSingleValueEvent(new FbLytter() {
      @Override
      public void onDataChange(DataSnapshot dataSnapshot) {
        App.sætErIGang(false, "Fb.indlæsSvarForEmne("+emne+" med id="+emne.id);
        if (dataSnapshot.exists()) {
          for (Trin t : emne.trin) {
            DataSnapshot fbsvar = dataSnapshot.child(t.id);
            Log.d("Fb.indlæsSvarForEmne t.id=" + t.id + " har " + fbsvar);
            if (fbsvar == null) continue;
            Svar svar = fbsvar.getValue(Svar.class);
            if (svar == null) continue;
            t.svar = svar;
            svar.trin = t;
          }
          Log.d("Fb.indlæsSvarForEmne() svar " + dataSnapshot);
        }
        observatør.run();
      }
    });
  }

  public static void gemSvarForEmne(Bruger bru, final Emne emne) {
    Firebase fbemne = firebaseSvar.child(bru.id).child(emne.id);
    Log.d("Fb.gemSvarForEmne("+emne+") "+fbemne.toString());
    for (Trin t : emne.trin) {
      if (t.svar==null || !t.svar.ændretSkalGemmes) continue;
      fbemne.child(t.id).setValue(t.svar);
      t.svar.ændretSkalGemmes = false;
      Log.d("Fb.gemSvarForEmne("+emne+") gemt t.id "+t.id);
    }
  }
}
