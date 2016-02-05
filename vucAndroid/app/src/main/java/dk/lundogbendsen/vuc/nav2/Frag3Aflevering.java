package dk.lundogbendsen.vuc.nav2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;

import com.cloudinary.Transformation;

import java.util.Date;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Bruger;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Emne;
import dk.lundogbendsen.vuc.domæne.Optagelse;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.fragtrin.TrinFrag;


public class Frag3Aflevering extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {

  private Button næste;
  private WebView webView;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    View rod = inflater.inflate(R.layout.frag3_aflevering, container, false);

    webView = (WebView) rod.findViewById(R.id.indhold);
    webView.setBackgroundColor(0); // Brug baggrundens farve
    String html = lavHtml(Brugervalg.instans.emne, Brugervalg.instans.bru);
    webView.loadData(html, "text/html; charset=utf-8", "UTF-8");

    næste = (Button) rod.findViewById(R.id.næste);
    næste.setOnClickListener(this);

    return rod;
  }

  @NonNull
  public static String lavHtml(Emne e, Bruger bru) {
    StringBuilder sb = new StringBuilder();
    sb.append("<html><head><title>Besvarelse af "+e.navn+"</title></head><body>\n\n");
    sb.append("<h3>Besvarelse af "+e.navn+"</h3>\n\n");
    sb.append("<p>Af "+bru.navn+", den "+ DateFormat.getDateFormat(App.instans).format(new Date()) +"</p>\n\n");
    for (Trin t : e.trin) {
      if (!TrinFrag.ikonTilTrinFrag.containsKey(t.ikon)) continue;
      sb.append("<p><b>"+t.navn+"</b><br/>\n");
      if (t.svar!=null && t.svar.harIndhold()) {
        if (t.svar.tekst!=null && t.svar.tekst.length()>0) sb.append(t.svar.tekst+"<br>\n");
        int optagelsesNr = 1;
        if (t.svar.optagelser!=null) for (Optagelse o:t.svar.optagelser) {
          sb.append("<a href='"+o.url+"'>Optagelse "+optagelsesNr+"</a> ");
          if (o.cloudinary_id!=null) {
            String url = App.cloudinary.url().transformation(new Transformation().height(80)).generate(o.cloudinary_id);
            sb.append("<br/>\n<img height'80' src='"+url+"'/>");
            //Log.d("cloudinary_id => "+url+ " i stedet for "+optagelse.url);
          }
          if (o.tekst!=null && o.tekst.length()>0) sb.append("<br/>").append(o.tekst);
          sb.append("<br/><br/>\n");
          optagelsesNr++;
        }
      } else {
        sb.append("mangler");
      }
      sb.append("</p>");
    }
    sb.append("</body></html>");
    return sb.toString();
  }


  @NonNull
  public static String lavTekst(Emne e) {
    StringBuilder sb = new StringBuilder();
    sb.append("Besvarelse af "+e.navn+"\n\n");
    int antal=0;
    for (Trin t : e.trin) {
      if (!TrinFrag.ikonTilTrinFrag.containsKey(t.ikon)) continue;
      antal++;
      sb.append("Svar "+antal+": "+t.navn+":\n");
      if (t.svar!=null && t.svar.harIndhold()) {
        if (t.svar.tekst!=null && t.svar.tekst.length()>0) sb.append(t.svar.tekst+"\n");
        if (t.svar.optagelser!=null) for (Optagelse o:t.svar.optagelser) {
          sb.append(o.url+"\n");
          if (o.tekst!=null && o.tekst.length()>0) sb.append(o.tekst+"\n");
        }
      } else {
        sb.append("mangler");
      }
    }
    return sb.toString();
  }


  @Override
  public void onClick(View v) {
    Intent i = new Intent(Intent.ACTION_SEND);
    i.setType("message/rfc822");
    i.setType("text/html");
    i.putExtra(Intent.EXTRA_EMAIL, new String[]{"nordfalk@lundogbendsen.dk"});
    i.putExtra(Intent.EXTRA_CC, new String[]{"nordfalk@lundogbendsen.dk"});
    String tekst = lavTekst(Brugervalg.instans.emne);
    i.putExtra(Intent.EXTRA_SUBJECT, tekst.split("\n")[0]);
    i.putExtra(Intent.EXTRA_TEXT, tekst);
    Log.d(tekst);
//        i.putExtra(Intent.EXTRA_STREAM, MinProvider.URI);

    startActivity(Intent.createChooser(i, "Send e-post..."));
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    Fragment ejerFragment = getParentFragment();
  }
}
