package dk.lundogbendsen.vuc;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.androidquery.AQuery;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import dk.lundogbendsen.vuc.diverse.App;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Svar;
import dk.lundogbendsen.vuc.domæne.Trin;


public class TagBilledeFrag extends SvarFrag implements View.OnClickListener {
  private static final int VÆLG_BILLEDE = 1;
  private static final int TAG_BILLEDE = 2;
  private AQuery aq;
  private File filPåEksterntLager;
  private RecyclerView recyclerView;
  private Svar svar;
  private boolean ændret;
  private Firebase firebaseTrinSvar;

  public static Fragment nytFragment(Trin trin) {
    TagBilledeFrag fragment = new TagBilledeFrag();
    Bundle args = new Bundle();
    //args.putSerializable(TagBilledeFrag.TEKST, tekst);
    fragment.setArguments(args);
    fragment.trin = trin;
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View rod = inflater.inflate(R.layout.tag_billede_frag, container, false);
    aq = new AQuery(rod);
    aq.id(R.id.tag_billede).clicked(this);
    aq.id(R.id.galleri).clicked(this);
    recyclerView = (RecyclerView) rod.findViewById(R.id.recyclerView);

    // use this setting to improve performance if you know that changes
    // in content do not change the layout size of the RecyclerView
    recyclerView.setHasFixedSize(false);
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    recyclerView.setAdapter(adapter);
    firebaseTrinSvar = App.firebaseSvar.child(Brugervalg.instans.bru.id).child(trin.id);
    firebaseTrinSvar.addValueEventListener(firebaseRefListener);
    if (trin.svar ==null) {
      trin.svar = new Svar(Brugervalg.instans.bru, trin);
    }
    svar = trin.svar;
    if (svar.lydBilleder==null) svar.lydBilleder = new ArrayList<LydBillede>();
    ændret = false;
    return rod;
  }

  ValueEventListener firebaseRefListener = new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
      if (!dataSnapshot.exists()) {
        // ok, så bruger vi den vi har
        return;
      }
      svar = trin.svar = dataSnapshot.getValue(Svar.class);
      adapter.notifyDataSetChanged();
    }

    @Override
    public void onCancelled(FirebaseError firebaseError) {
    }
  };

  @Override
  public void onDestroyView() {
    App.onActivityResultListe.remove(this);
    firebaseTrinSvar.removeEventListener(firebaseRefListener);
    if (ændret) {
      // Gem i Firebase
      firebaseTrinSvar.setValue(svar);
    }
    super.onDestroyView();
  }

  @Override
  public void opdaterBesvarelse(Trin trin) {
    //trin.svar.tekst = tekst.getText().toString();
  }

  @Override
  public void onClick(View v) {
    if (v.getId() == R.id.galleri) {
      Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
      App.onActivityResultListe.add(this);
      getActivity().startActivityForResult(i, VÆLG_BILLEDE);
    }
    if (v.getId() == R.id.tag_billede) try {

      Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
      // Hvis vi vil læse billedet i fuld opløsning fra ekstern lager/SD-kort skal vi give en URI
      filPåEksterntLager = createImageFile();// new File(App.fillager, "billede.jpg");
      i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(filPåEksterntLager));
      App.onActivityResultListe.add(this);
      getActivity().startActivityForResult(i, TAG_BILLEDE);
    } catch (Exception e) { Log.rapporterFejl(e); }
  }

  private File createImageFile() throws IOException {
    // Create an image file name
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    String imageFileName = "JPEG_" + timeStamp + "_";
    File storageDir = Environment.getExternalStoragePublicDirectory(
            Environment.DIRECTORY_PICTURES);
    File image = File.createTempFile(
            imageFileName,  /* prefix */
            ".jpg",         /* suffix */
            storageDir      /* directory */
    );
    return image;
  }
  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent resIntent) {
    System.out.println("onActivityResult FRAG"+ requestCode + " gav resultat " + resultCode + " med data=" + resIntent);

    //resultatHolder.removeAllViews();
    ContentResolver cr = getActivity().getContentResolver();
    App.onActivityResultListe.remove(this);

    if (resultCode == Activity.RESULT_OK) {
      try {
        LydBillede lydBillede = new LydBillede();
        if (requestCode == VÆLG_BILLEDE) {
          final AssetFileDescriptor filDS = cr.openAssetFileDescriptor(resIntent.getData(), "r");
          Log.d("resIntent.getData() "+resIntent.getData());

          lydBillede.filLokalt = resIntent.getData().toString();

          /*
          int n = 0;
          do { // lav unikt filnavn
            svar.filLokalt = App.fillager + "/svarLokalt/" + trin.id + n++ + ".jpg";
          } while (new File(svar.filLokalt).exists());
          File fil = new File(svar.filLokalt);
          fil.getParentFile().mkdirs();
          FilCache.kopierOgLuk(filDS.createInputStream(), new FileOutputStream(fil));

          new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] params) {
              try {
                Map m = App.cloudinary.uploader().upload(filDS.createInputStream(), ObjectUtils.asMap("public_id", "sample_remote"));
                Log.d("cliudinary map="+m);
                // map={resource_type=image, etag=441f1307c34a040d0746927f36bca2df, signature=9e0b8cd6d7956176b096e489ab916fab87568f63, url=http://res.cloudinary.com/vuc/image/upload/v1450452511/sample_remote.jpg, height=480, secure_url=https://res.cloudinary.com/vuc/image/upload/v1450452511/sample_remote.jpg, format=jpg, public_id=sample_remote, version=1450452511, original_filename=file, width=640, created_at=2015-12-18T15:28:31Z, tags=[], bytes=114102, type=upload}
                return m;
              } catch (IOException e) {
                e.printStackTrace();
              }
              return null;
            }
          }.execute();
          */
        } else if (requestCode == TAG_BILLEDE) {
          lydBillede.filLokalt = filPåEksterntLager.toString();
        }
        svar.lydBilleder.add(lydBillede);
        ændret = true;
        adapter.notifyDataSetChanged();
        recyclerView.fling(recyclerView.getMaxFlingVelocity()/4, 0);
      } catch (IOException e) {
        Log.rapporterFejl(e);
      }
    }
  }



  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final ImageView billede;
    private final ImageView slet;
    public int pos;

    public ViewHolder(View v) {
      super(v);
      billede = (ImageView) v.findViewById(R.id.billede);
      slet = (ImageView) v.findViewById(R.id.slet);
      slet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      svar.lydBilleder.remove(pos);
      adapter.notifyDataSetChanged();
    }
  }
  RecyclerView.Adapter<ViewHolder> adapter = new RecyclerView.Adapter<ViewHolder>() {

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
      // create a new view
      View v = LayoutInflater.from(parent.getContext())
              .inflate(R.layout.tag_billede_listeelem, null, false);
      // set the view's size, margins, paddings and layout parameters
      ViewHolder vh = new ViewHolder(v);
      return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
      holder.billede.setImageURI(Uri.parse(svar.lydBilleder.get(position).filLokalt));
      holder.pos = position;
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
      return svar.lydBilleder.size();
    }
  };
}
