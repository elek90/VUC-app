package dk.lundogbendsen.vuc;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListPopupWindow;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.firebase.Fb;
import dk.lundogbendsen.vuc.nav2.HovedAkt;

public class Login_akt extends AppCompatActivity implements Firebase.AuthStateListener, View.OnClickListener {

  private EditText emailText;
  private EditText passwordText;
  private EditText navnText;
  private static boolean oprettelse = false;
  private ListPopupWindow lpw;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.login_akt);

    navnText = (EditText) findViewById(R.id.navn);
    emailText = (EditText) findViewById(R.id.email);
    passwordText = (EditText) findViewById(R.id.adgangskode);

    String email = App.prefs.getString("email", "");
    navnText.setText(App.prefs.getString("navn", ""));

    Log.d("Konti: " + Arrays.toString(AccountManager.get(this).getAccounts()));
    /*
    Account[] konti = accountManager.getAccounts();   giver konti: [
    Account {name=user@updatecenter, type=com.sonyericsson.updatecenter.account.default},
    Account {name=Phone contacts, type=com.sonyericsson.localcontacts},
    Account {name=SDN contacts, type=com.sonyericsson.sdncontacts},
    Account {name=jacob.nordfalk@gmail.com, type=com.google}]
    */

    final ArrayList<String> kontiEmail = new ArrayList<>();
    for (String type : new String[] {"com.google", "com.twitter.android.auth.login", "com.twitter", "com.facebook.auth.login", "com.facebook"}) {
      final Account[] konti = AccountManager.get(this).getAccountsByType(type);
      Log.d("Konti for "+ type + Arrays.toString(konti));
      for (Account k : konti) {
        if (!Patterns.EMAIL_ADDRESS.matcher(k.name).matches()) continue;
        if (email.isEmpty()) email = k.name;
        kontiEmail.add(k.name);
        //navnText.setText(email.substring(0, email.indexOf("@")));
      }
    }
    Log.d("kontiEmail "+ kontiEmail);
    //final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, konti);
    lpw = new ListPopupWindow(this);
    lpw.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, kontiEmail));
    //lpw.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, konti));
    lpw.setAnchorView(emailText);
    //lpw.setModal(true);
    emailText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
      @Override
      public void onFocusChange(View v, boolean hasFocus) {
        if (!v.isShown()) return;
        if (hasFocus) lpw.show();
        else lpw.dismiss();
      }
    });
    lpw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        emailText.setText(kontiEmail.get(position));
        lpw.dismiss();
      }
    });
    emailText.setText(email);

    findViewById(R.id.log_ind).setOnClickListener(this);
    findViewById(R.id.ny_bruger).setOnClickListener(this);
    findViewById(R.id.opret_bruger).setOnClickListener(this);

    visSkjulFelter();

    Fb.firebaseRod.addAuthStateListener(this);
  }

  private void visSkjulFelter() {
    findViewById(R.id.or_section).setVisibility(View.GONE);
    findViewById(R.id.facebook_button).setVisibility(View.GONE);
    findViewById(R.id.google_button).setVisibility(View.GONE);
    findViewById(R.id.twitter_button).setVisibility(View.GONE);

    findViewById(R.id.loading_section).setVisibility(View.GONE);

    findViewById(R.id.log_ind).setVisibility(!oprettelse?View.VISIBLE:View.GONE);
    findViewById(R.id.ny_bruger).setVisibility(!oprettelse?View.VISIBLE:View.GONE);

    findViewById(R.id.navn).setVisibility(oprettelse?View.VISIBLE:View.GONE);
    findViewById(R.id.opret_bruger).setVisibility(oprettelse?View.VISIBLE:View.GONE);

  }

  @Override
  protected void onDestroy() {
    Fb.firebaseRod.removeAuthStateListener(this);
    super.onDestroy();
  }

  @Override
  public void onAuthStateChanged(AuthData authData) {
    Log.d("onAuthStateChanged  xx "+authData);
    Fb.sætAuthData(authData);
    if (authData==null) return;
    finish();
    startActivity(new Intent(this, HovedAkt.class));
  }

  @Override
  public void onBackPressed() {
    if (oprettelse) {
      oprettelse = false;
      visSkjulFelter();
      return;
    }
    super.onBackPressed();
  }

  @Override
  public void onClick(View v) {
    if (v.getId()==R.id.log_ind) {
      findViewById(R.id.loading_section).setVisibility(View.VISIBLE);
      Fb.firebaseRod.authWithPassword(emailText.getText().toString(), passwordText.getText().toString(), new Firebase.AuthResultHandler() {
        @Override
        public void onAuthenticated(AuthData authData) {
          App.langToast("Du blev logget ind.");
          App.prefs.edit().putString("navn", navnText.getText().toString())
                          .putString("email", emailText.getText().toString()).commit();
          Fb.sætAuthData(authData);
          Fb.firebaseBruger.child("sidst_logget_ind").setValue(new Date());
          findViewById(R.id.loading_section).setVisibility(View.GONE);
          //Answers.getInstance().logLogin(new LoginEvent().putSuccess(true));
        }

        @Override
        public void onAuthenticationError(FirebaseError firebaseError) {
          App.langToast("Fejl: " + firebaseError);
          findViewById(R.id.loading_section).setVisibility(View.GONE);
          //Answers.getInstance().logLogin(new LoginEvent().putSuccess(false));
        }
      });
    }
    if (v.getId()==R.id.ny_bruger) {
      oprettelse = true;
      visSkjulFelter();
    }

    if (v.getId()==R.id.opret_bruger) {
      findViewById(R.id.loading_section).setVisibility(View.VISIBLE);
      Fb.firebaseRod.createUser(emailText.getText().toString(), passwordText.getText().toString(),new Firebase.ValueResultHandler<Map<String, Object>>() {
        @Override
        public void onSuccess(Map<String, Object> result) {
          System.out.println("Successfully created user account with uid: " + result.get("uid"));
          Fb.firebaseBruger = Fb.firebaseRod.child("brugere").child(result.get("uid").toString());
          Fb.firebaseBruger.child("navn").setValue(navnText.getText().toString());
          Fb.firebaseBruger.child("email").setValue(emailText.getText().toString());
          App.langToast("Bruger oprettet.");
          findViewById(R.id.loading_section).setVisibility(View.GONE);
          oprettelse = false;
          visSkjulFelter();
          //Answers.getInstance().logSignUp(new SignUpEvent().putSuccess(true));
          onClick(findViewById(R.id.log_ind));
        }

        @Override
        public void onError(FirebaseError firebaseError) {
          App.langToast("Fejl: " + firebaseError);
          findViewById(R.id.loading_section).setVisibility(View.GONE);
          //Answers.getInstance().logSignUp(new SignUpEvent().putSuccess(false));
        }
      });
    }
  }
  int n;
}