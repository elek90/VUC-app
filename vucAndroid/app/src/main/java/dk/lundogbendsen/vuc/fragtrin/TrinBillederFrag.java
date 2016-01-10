package dk.lundogbendsen.vuc.fragtrin;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.androidquery.AQuery;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.ValueEventListener;

import java.io.File;
import java.util.ArrayList;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.diverse.DiverseIO;
import dk.lundogbendsen.vuc.diverse.FbLytter;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Optagelse;
import dk.lundogbendsen.vuc.domæne.Svar;


public class TrinBillederFrag extends TrinFrag implements View.OnClickListener {
  private static final int VÆLG_BILLEDE = 1;
  private static final int TAG_BILLEDE = 2;
  private AQuery aq;
  private File filPåEksterntLager;
  private RecyclerView recyclerView;
  private Firebase firebaseTrinSvar;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View rod = inflater.inflate(R.layout.svar_billeder_frag, container, false);
    aq = new AQuery(rod);
    aq.id(R.id.tag_billede).clicked(this);
    aq.id(R.id.galleri).clicked(this);
    recyclerView = (RecyclerView) rod.findViewById(R.id.recyclerView);
    recyclerView.setHasFixedSize(false);
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    recyclerView.setAdapter(adapter);
    firebaseTrinSvar = App.firebaseSvar.child(Brugervalg.instans.bru.id).child(trin.id);
    firebaseTrinSvar.addValueEventListener(firebaseRefListener);
    if (trin.svar ==null) {
      trin.svar = new Svar(Brugervalg.instans.bru, trin);
    }
    if (trin.svar.optagelser ==null) trin.svar.optagelser = new ArrayList<Optagelse>();
    return rod;
  }

  ValueEventListener firebaseRefListener = new FbLytter() {
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
      if (!dataSnapshot.exists()) {
        // ok, så bruger vi den vi har
        return;
      }
      trin.svar = dataSnapshot.getValue(Svar.class);
      adapter.notifyDataSetChanged();
    }
  };

  @Override
  public void onDestroyView() {
    App.onActivityResultListe.remove(this);
    firebaseTrinSvar.removeEventListener(firebaseRefListener);
    if (trin.svar.ændretSkalGemmes) {
      // Gem i Firebase
      firebaseTrinSvar.setValue(trin.svar);
      trin.svar.ændretSkalGemmes = false;
    }
    super.onDestroyView();
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
      filPåEksterntLager = DiverseIO.opretUnikFil("TRIN_" + trin.id, ".jpg");
      i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(filPåEksterntLager));
      App.onActivityResultListe.add(this);
      getActivity().startActivityForResult(i, TAG_BILLEDE);
    } catch (Exception e) { Log.rapporterFejl(e); }
  }

/*
01-09 17:34:19.728 8921-8921/dk.lundogbendsen.vuc.beta W/ImageView: Unable to open content: content://com.google.android.apps.photos.contentprovider/-1/1/content%3A%2F%2Fmedia%2Fexternal%2Fimages%2Fmedia%2F15476/ACTUAL/2062263558
                                                                    java.lang.SecurityException: Permission Denial: opening provider com.google.android.apps.photos.contentprovider.MediaContentProvider from ProcessRecord{5c649a8 8921:dk.lundogbendsen.vuc.beta/u0a284} (pid=8921, uid=10284) that is not exported from uid 10257


01-09 17:35:06.947 8921-8921/dk.lundogbendsen.vuc.beta I/System.out: onActivityResult AKT1 gav resultat -1 med data=Intent { dat=content://com.google.android.apps.photos.contentprovider/-1/1/content://media/external/images/media/15400/ACTUAL/962249955 flg=0x1 (has clip) }
XXX efter gebnstart
01-09 17:38:25.481 13325-13325/dk.lundogbendsen.vuc.beta W/ImageView: Unable to open content: content://com.google.android.apps.photos.contentprovider/-1/1/content%3A%2F%2Fmedia%2Fexternal%2Fimages%2Fmedia%2F15400/ACTUAL/962249955
                                                                      java.lang.SecurityException: Permission Denial: opening provider com.google.android.apps.photos.contentprovider.MediaContentProvider from ProcessRecord{1b914d75 13325:dk.lundogbendsen.vuc.beta/u0a284} (pid=13325, uid=10284) that is not exported from uid 10257


01-09 17:39:05.559 13325-13325/dk.lundogbendsen.vuc.beta D/VUC: storageDir=/storage/emulated/0/Pictures true true

   */

  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent resIntent) {
    System.out.println("onActivityResult FRAG"+ requestCode + " gav resultat " + resultCode + " med data=" + resIntent);

    //resultatHolder.removeAllViews();
    ContentResolver cr = getActivity().getContentResolver();
    App.onActivityResultListe.remove(this);

    if (resultCode == Activity.RESULT_OK) {
      try {
        Optagelse optagelse = new Optagelse();
        if (requestCode == VÆLG_BILLEDE) {
          optagelse.lokalUri = resIntent.getData().toString();

          /*
          final AssetFileDescriptor filDS = cr.openAssetFileDescriptor(resIntent.getData(), "r");
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
          optagelse.lokalUri = Uri.fromFile(filPåEksterntLager).toString();
        }
        Log.d("optagelse.lokalUri="+ optagelse.lokalUri);
        trin.svar.optagelser.add(optagelse);
        trin.svar.ændretSkalGemmes = true;
        adapter.notifyItemInserted(adapter.getItemCount()-1);
        App.forgrundstråd.post(new Runnable() {
          @Override
          public void run() {
            recyclerView.smoothScrollToPosition(adapter.getItemCount()-1);
          }
        });
      } catch (Exception e) {
        Log.rapporterFejl(e);
      }
    }
  }



  public class OptagelseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final ImageView billede;
    private final ImageView slet;
    private final EditText billedetekst;
    public boolean billedetekstUnderOpdatering;

    public OptagelseViewHolder(View v) {
      super(v);
      billede = (ImageView) v.findViewById(R.id.billede);
      billede.setOnClickListener(this);
      billedetekst = (EditText) v.findViewById(R.id.billedetekst);
      billedetekst.addTextChangedListener(new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
        public void onTextChanged(CharSequence s, int start, int before, int count) {}
        public void afterTextChanged(Editable s) {
          if (billedetekstUnderOpdatering) return;
          trin.svar.ændretSkalGemmes = true;
          trin.svar.optagelser.get(getAdapterPosition()).tekst = billedetekst.getText().toString();
        }
      });
      slet = (ImageView) v.findViewById(R.id.slet);
      slet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      if (v==slet) {
        trin.svar.optagelser.remove(getAdapterPosition());
        adapter.notifyItemRemoved(getAdapterPosition());
      } else {
        App.udestår("vis popop med billede");
      }
    }
  }
  RecyclerView.Adapter<OptagelseViewHolder> adapter = new RecyclerView.Adapter<OptagelseViewHolder>() {
    @Override
    public OptagelseViewHolder onCreateViewHolder(ViewGroup parent,
                                                  int viewType) {
      View v = LayoutInflater.from(parent.getContext())
              .inflate(R.layout.svar_billeder_listeelem, null, false);
      OptagelseViewHolder vh = new OptagelseViewHolder(v);
      return vh;
    }

    @Override
    public void onBindViewHolder(OptagelseViewHolder holder, int position) {
      holder.billede.setImageURI(Uri.parse(trin.svar.optagelser.get(position).lokalUri));
      holder.billedetekstUnderOpdatering = true;
      holder.billedetekst.setText(trin.svar.optagelser.get(position).tekst);
      holder.billedetekstUnderOpdatering = false;
    }

    @Override
    public int getItemCount() {
      return trin.svar.optagelser.size();
    }
  };
}
