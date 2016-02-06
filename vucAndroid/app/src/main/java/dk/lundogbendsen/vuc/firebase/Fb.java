package dk.lundogbendsen.vuc.firebase;

import com.firebase.client.AuthData;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;

import java.util.Date;
import java.util.HashMap;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Bruger;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Emne;
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
  public static Firebase firebaseBruger;
  public static boolean initialiseret;

  // AuthData{uid='a50a54e7-bf82-4d2c-9816-cd50d9f31085', provider='password', token='***', expires='1453232975',
  // auth='{provider=password, uid=a50a54e7-bf82-4d2c-9816-cd50d9f31085}',
  // providerData='{email=jacno@dtu.dk, isTemporaryPassword=false, profileImageURL=https://secure.gravatar.com/avatar/36904d97418c4025ba6727ab57272ae4?d=retro}'}
  public static AuthData authData;

  public static void gemTestdata() {
    for (Emne emne : Logik.instans.emner) {
      firebaseEmner.child(emne.id).setValue(emne);
      firebaseRod.child("indtastningskodeTilEmneid").child(emne.indtastningskode).setValue(emne.id);
    }
  }

  public static void initFb() {
    Firebase.setAndroidContext(App.instans);
    Firebase.getDefaultConfig().setPersistenceEnabled(true);
    firebaseRod = new Firebase("https://vuc.firebaseio.com/v4");
    firebaseRefLogik = firebaseRod.child("_logik");
    firebaseEmner = firebaseRod.child("emner");
    sætAuthData(firebaseRod.getAuth());
  }

  public static void sætAuthData(AuthData authData1) {
    Log.d("Fb: Sæt authData="+ authData1 + " fra "+Fb.authData);
    Fb.authData = authData1;
    if (Fb.authData !=null) {
      //String email = (String) Fb.authData.getProviderData().get("email");
      firebaseBruger = firebaseRod.child("brugere").child(Fb.authData.getUid());
      firebaseBruger.child("sidst_brugt").setValue(new Date());
      App.sætErIGang(true, "sætAuthData");
      firebaseBruger.addListenerForSingleValueEvent(new FbLytter() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
          Log.d("Fb: firebaseBruger data ="+ dataSnapshot);
          final Bruger b = Brugervalg.instans.bru = dataSnapshot.getValue(Bruger.class);

          firebaseEmner.addListenerForSingleValueEvent(new FbLytter() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
              App.sætErIGang(false, "sætAuthData");
              Log.d("Fb: firebaseEmner data ="+ dataSnapshot);
              if (b.emneIdListe.isEmpty()) {
                App.kortToast("Bruger har ingen emner - tilføjer dem alle sammen");
                for (DataSnapshot x : dataSnapshot.getChildren()) b.emneIdListe.add(x.getKey());
              }

              for (String emneId : b.emneIdListe) {
                Emne e = dataSnapshot.child(emneId).getValue(Emne.class);
                if (b.svar.get(e.id)==null) b.svar.put(e.id, new HashMap<String, Svar>());
                for (Trin t : e.trin) {
                  t.emne = e;
                  t.svar = b.svar.get(e.id).get(t.id);
                  Trin.idref.put(t.id, t);
                }
                b.emner.add(e);
              }
              initialiseret = true;
              Brugervalg.instans.opdaterObservatører();
            }
          });
        }
      });
      Log.d("Fb: firebaseBruger="+ firebaseBruger);
    }
  }

  public static void gemSvarForEmne(Bruger bru, final Emne emne) {
    Firebase fbemne = firebaseBruger.child("svar").child(emne.id);
    Log.d("Fb.gemSvarForEmne("+emne+") "+fbemne.toString());
    for (Trin t : emne.trin) {
      if (t.svar==null || !t.svar.ændretSkalGemmes) continue;
      fbemne.child(t.id).setValue(t.svar);
      t.svar.ændretSkalGemmes = false;
      Log.d("Fb.gemSvarForEmne("+emne+") gemt t.id "+t.id);
    }
  }
}
