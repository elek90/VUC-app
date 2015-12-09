package dk.lundogbendsen.vuc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeIntents;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import dk.lundogbendsen.vuc.diverse.App;
import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.domæne.Opgave;


public class SkrivTekstFrag extends SvarFrag {
  static String TEKST = "TEKST";
  private EditText tekst;

  public static Fragment nytFragment(String tekst) {
    Fragment fragment = new SkrivTekstFrag();
    Bundle args = new Bundle();
    args.putString(SkrivTekstFrag.TEKST, tekst);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    View rod = inflater.inflate(R.layout.skriv_tekst_frag, container, false);
    tekst = (EditText) rod.findViewById(R.id.tekst);
    tekst.setText(getArguments().getString(TEKST));

    return rod;
  }

  @Override
  public void opdaterBesvarelse(Opgave opgave) {
    opgave.svar.tekst = tekst.getText().toString();
  }
}
