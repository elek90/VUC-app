package dk.lundogbendsen.vuc;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.androidquery.AQuery;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import dk.lundogbendsen.vuc.diverse.App;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Opgave;
import dk.lundogbendsen.vuc.domæne.Svar;


public class TagBilledeFrag extends SvarFrag implements View.OnClickListener {
  private static final int VÆLG_BILLEDE = 1;
  private static final int TAG_BILLEDE = 2;
  private AQuery aq;
  private File filPåEksterntLager;
  private TextView resultatTextView;
  private LinearLayout resultatHolder;

  public static Fragment nytFragment(Opgave opgave) {
    TagBilledeFrag fragment = new TagBilledeFrag();
    Bundle args = new Bundle();
    //args.putSerializable(TagBilledeFrag.TEKST, tekst);
    fragment.setArguments(args);
    fragment.opgave = opgave;
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    View rod = inflater.inflate(R.layout.tag_billede_frag, container, false);
    aq = new AQuery(rod);
    aq.id(R.id.tag_billede).clicked(this);
    aq.id(R.id.galleri).clicked(this);
    resultatTextView = aq.id(R.id.log).getTextView();
    resultatHolder = (LinearLayout) aq.id(R.id.resultat).getView();
    return rod;
  }

  @Override
  public void onDestroyView() {
    App.onActivityResultListe.remove(this);
    super.onDestroyView();
  }

  @Override
  public void opdaterBesvarelse(Opgave opgave) {
    //opgave.svar.tekst = tekst.getText().toString();
  }

  @Override
  public void onClick(View v) {
    if (v.getId() == R.id.galleri) {
      Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
      App.onActivityResultListe.add(this);
      getActivity().startActivityForResult(i, VÆLG_BILLEDE);
    }
    if (v.getId() == R.id.tag_billede) {

      // Bemærk at jeg måtte have android:configChanges="orientation" for at aktiviteten
      // ikke blev vendt og jeg mistede billedet. I et rigtigt ville jeg forsyne mine views med
      // ID'er så deres indhold overlevede at skærmen skiftede orientering
      Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
      // Hvis vi vil læse billedet i fuld opløsning fra ekstern lager/SD-kort skal vi give en URI
      //filPåEksterntLager = new File(Environment.getExternalStorageDirectory(), "billede.jpg");
      //i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(filPåEksterntLager));
      App.onActivityResultListe.add(this);
      getActivity().startActivityForResult(i, TAG_BILLEDE);
    }
  }

  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent resIntent) {
    System.out.println("onActivityResult FRAG"+ requestCode + " gav resultat " + resultCode + " med data=" + resIntent);
    resultatTextView.append(requestCode + " gav resultat " + resultCode + " og data:\n" + resIntent+"\n\n");

    //resultatHolder.removeAllViews();
    ContentResolver cr = getActivity().getContentResolver();

    if (resultCode == Activity.RESULT_OK) {
      try {
        if (requestCode == VÆLG_BILLEDE) {
          AssetFileDescriptor filDS = cr.openAssetFileDescriptor(resIntent.getData(), "r");
          Bitmap bmp = BitmapFactory.decodeStream(filDS.createInputStream());
          ImageView iv = new ImageView(getActivity());
          iv.setImageBitmap(bmp);
          resultatHolder.addView(iv);
        } else if (requestCode == TAG_BILLEDE) {
          ImageView iv = new ImageView(getActivity());
          if (filPåEksterntLager==null) {
            Bitmap bmp = (Bitmap) resIntent.getExtras().get("data");
            iv.setImageBitmap(bmp);
          } else { // læs billedet i fuld opløsning fra ekstern lager/SD-kort
            Bitmap bmp = BitmapFactory.decodeFile(filPåEksterntLager.getPath());
            iv.setImageBitmap(bmp);
          }
          resultatHolder.addView(iv);
        }

      } catch (IOException e) {
        Log.rapporterFejl(e);
      }
    }
  }
}
