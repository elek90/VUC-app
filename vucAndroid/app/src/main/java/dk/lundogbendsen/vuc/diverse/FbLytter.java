package dk.lundogbendsen.vuc.diverse;

import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by j on 08-01-16.
 */
public abstract class FbLytter implements ValueEventListener {

  @Override
  public void onCancelled(FirebaseError firebaseError) {
    Log.d("Der kom en FB fejl: "+firebaseError);
  }
}
