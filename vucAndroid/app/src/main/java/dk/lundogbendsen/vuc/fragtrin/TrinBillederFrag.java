package dk.lundogbendsen.vuc.fragtrin;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.androidquery.AQuery;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

import dk.lundogbendsen.vuc.App;
import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.diverse.Diverse;
import dk.lundogbendsen.vuc.diverse.DiverseIO;
import dk.lundogbendsen.vuc.diverse.Log;
import dk.lundogbendsen.vuc.diverse.MyLinearLayoutManager;
import dk.lundogbendsen.vuc.domæne.Brugervalg;
import dk.lundogbendsen.vuc.domæne.Optagelse;
import dk.lundogbendsen.vuc.domæne.Svar;
import dk.lundogbendsen.vuc.domæne.Trin;
import dk.lundogbendsen.vuc.firebase.Fb;


public class TrinBillederFrag extends TrinFrag implements View.OnClickListener {
  private static final int VÆLG_BILLEDE = 1;
  private static final int TAG_BILLEDE = 2;
  private AQuery aq;
  private File filPåEksterntLager;
  private RecyclerView recyclerView;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    Log.d("onCreateView "+this);
    View rod = inflater.inflate(R.layout.svar_billeder_frag, container, false);
    aq = new AQuery(rod);
    aq.id(R.id.tag_billede).clicked(this);
    aq.id(R.id.galleri).clicked(this);
    recyclerView = (RecyclerView) rod.findViewById(R.id.recyclerView);
    recyclerView.setHasFixedSize(false);
    recyclerView.setLayoutManager(new MyLinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    recyclerView.setAdapter(adapter);
    if (trin.svar ==null) {
      trin.svar = new Svar(Brugervalg.instans.bru, trin);
    }
    if (trin.svar.optagelser ==null) trin.svar.optagelser = new ArrayList<Optagelse>();
    if (trin.svar.optagelser.isEmpty()) recyclerView.setVisibility(View.GONE);
    trin.tmpHackTrinBillederFrag = this;
    return rod;
  }

  @Override
  public void onDestroyView() {
    Log.d("onDestroyView "+this);
    trin.tmpHackTrinBillederFrag = null;
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
    App.onActivityResultListe.remove(this);

    if (resultCode == Activity.RESULT_OK) {
      final Optagelse optagelse = new Optagelse();
      if (requestCode == VÆLG_BILLEDE) {
        optagelse.lokalUri = resIntent.getData().toString();
      } else if (requestCode == TAG_BILLEDE) {
        optagelse.lokalUri = Uri.fromFile(filPåEksterntLager).toString();
      }
      gemOptagelse(trin, optagelse);
    }
  }

  public static void gemOptagelse(final Trin trin, final Optagelse optagelse) {
    try {
      Log.d("gemOptagelse lokalUri="+ optagelse.lokalUri);

      // Vent til allersidst i eventkøen så animationen kan ses
      Diverse.udførSidstIHovedtråden(200, new Runnable() {
        @Override
        public void run() {
          trin.svar.optagelser.add(optagelse);
          trin.svar.ændretSkalGemmes = true;
          if (trin.tmpHackTrinBillederFrag== null) return;
          TrinBillederFrag f = trin.tmpHackTrinBillederFrag;
          f.recyclerView.setVisibility(View.VISIBLE);
          f.adapter.notifyItemInserted(f.adapter.getItemCount()-1);
          f.recyclerView.smoothScrollToPosition(f.adapter.getItemCount()-1);
        }
      });
      final ContentResolver cr = App.instans.getContentResolver();
      BitmapFactory.Options bmOptions = new BitmapFactory.Options();
      bmOptions.inJustDecodeBounds = true;
      FileInputStream is = cr.openAssetFileDescriptor(Uri.parse(optagelse.lokalUri), "r").createInputStream();
      BitmapFactory.decodeStream(is, null, bmOptions);
      is.close();
      optagelse.aspektRatio = (float) bmOptions.outWidth / bmOptions.outHeight;
      App.sætErIGang(true, "cloudinary");
      new AsyncTask() {
        @Override
        protected Object doInBackground(Object[] params) {
          try {
            //uploadParams.put("resource_type", "video");
            //uploadParams.put("resource_type", "auto");
            FileInputStream is = cr.openAssetFileDescriptor(Uri.parse(optagelse.lokalUri), "r").createInputStream();
            Map m = App.cloudinary.uploader().upload(is, ObjectUtils.emptyMap());//ObjectUtils.asMap("public_id", "TRIN_" + trin.id));
            is.close();
            Log.d("cloudinary map="+m);
            Log.d("App.cloudinary.signedPreloadedImage(m) "+App.cloudinary.signedPreloadedImage(m));
            App.cloudinary.signedPreloadedImage(m);
            // map={resource_type=image, etag=441f1307c34a040d0746927f36bca2df, signature=9e0b8cd6d7956176b096e489ab916fab87568f63, url=http://res.cloudinary.com/vuc/image/upload/v1450452511/sample_remote.jpg, height=480, secure_url=https://res.cloudinary.com/vuc/image/upload/v1450452511/sample_remote.jpg, format=jpg, public_id=sample_remote, version=1450452511, original_filename=file, width=640, created_at=2015-12-18T15:28:31Z, tags=[], bytes=114102, type=upload}
            // map={resource_type=image, etag=52012cde897d0095befa9809accc07a9, signature=2099119561879b4eb6be40af3d3f6502aabdb4e4, url=http://res.cloudinary.com/vuc/image/upload/v1452530538/rqlpprmolxx9gckaza3o.jpg, height=480, secure_url=https://res.cloudinary.com/vuc/image/upload/v1452530538/rqlpprmolxx9gckaza3o.jpg, format=jpg, public_id=rqlpprmolxx9gckaza3o, version=1452530538, original_filename=file, width=640, created_at=2016-01-11T16:42:18Z, tags=[], bytes=96149, type=upload}

            return m;
          } catch (Exception e) {
            App.langToast("Det lykkedes ikke at oploade billedet.\n"+e);
            e.printStackTrace();
          }
          return null;
        }

        @Override
        protected void onPostExecute(Object o) {
          App.sætErIGang(false, "cloudinary");
          if (o instanceof Map) {
            Map m = (Map) o;
            optagelse.url = (String) m.get("url");
            optagelse.cloudinary_id = (String) m.get("public_id");
            trin.svar.ændretSkalGemmes = true;
            Fb.gemSvarForEmne(Brugervalg.instans.bru, trin.emne);
          }
        }
      }.execute();

    } catch (Exception e) {
      Log.rapporterFejl(e);
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
        trin.svar.ændretSkalGemmes = true;
        trin.svar.optagelser.remove(getAdapterPosition());
        adapter.notifyItemRemoved(getAdapterPosition());
        /*
        int pos = getAdapterPosition();
        Optagelse o = trin.svar.optagelser.remove(pos);
        trin.svar.optagelser.add(o);
        adapter.notifyItemMoved(pos, trin.svar.optagelser.size()-1);
        */
      } else {
        App.udestår("vis popop med billede");
      }
    }
  }

  RecyclerView.Adapter<OptagelseViewHolder> adapter = new RecyclerView.Adapter<OptagelseViewHolder>() {
    @Override
    public int getItemCount() {
      return trin.svar.optagelser.size();
    }

    @Override
    public OptagelseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.svar_billeder_listeelem, null, false);
      return new OptagelseViewHolder(v);
    }

    @Override
    public void onBindViewHolder(OptagelseViewHolder holder, int position) {
      Optagelse optagelse = trin.svar.optagelser.get(position);
      holder.billedetekstUnderOpdatering = true;
      holder.billedetekst.setText(trin.svar.optagelser.get(position).tekst);
      holder.billedetekstUnderOpdatering = false;
      holder.billede.setImageDrawable(null);
      int højde = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 150, getResources().getDisplayMetrics());
      int bredde = (int) (højde*optagelse.aspektRatio);
      holder.billede.getLayoutParams().height = højde;
      holder.billede.getLayoutParams().width = bredde==0? ViewGroup.LayoutParams.WRAP_CONTENT : bredde;

      // Vis billedet. Først prøver vi med lokal URI
      if (optagelse.lokalUri!=null && !optagelse.ignorerLokalUri) {
        Uri lokalUri = Uri.parse(optagelse.lokalUri);
        try {
          // Tjek om den kan læses
          InputStream stream = App.instans.getContentResolver().openInputStream(lokalUri);
          stream.close();
          Picasso.with(getContext()).load(lokalUri).resize(bredde, højde).into(holder.billede);
          //Glide.with(getContext()).load(lokalUri).into(holder.billede);
          Log.d("onBindViewHolder("+position+ ": bruger lokalUri=" +lokalUri);
          //holder.billedeaq.image(url, true, true, bredde, R.drawable.vucroskilde_logo, null, AQuery.FADE_IN_NETWORK, AQuery.RATIO_PRESERVE);
          return; // Hurra, det gik godt. Hop ud
        } catch (Exception e) {
          optagelse.ignorerLokalUri = true; // URI dur ikke på denne maskine, den kommer nok fra en anden, øv bøv
          Log.d("ignorerLokalUri for optagelse "+position+ ": " + e);
        }
      }
      // OK, vi henter den over nettet og cacher den hist og pist

      String url = optagelse.url;
      if (optagelse.cloudinary_id!=null) {
        url = App.cloudinary.url().transformation(new Transformation().height(højde)).generate(optagelse.cloudinary_id);
        //Log.d("cloudinary_id => "+url+ " i stedet for "+optagelse.url);
      }
      Picasso.with(getContext()).load(url).resize(bredde,højde).into(holder.billede);
    }

  };
}


      /*
      Log.d("onBindViewHolder("+position+ ": bruger URL for optagelse "+position+ ": " + url+"  "+optagelse.aspektRatio);
      if (optagelse.aspektRatio>0 && false) {
        // Billedet er 200dp højt
        holder.billedeaq.image(url, true, true, (int) (200/optagelse.aspektRatio), R.drawable.vucroskilde_logo, null, AQuery.FADE_IN_NETWORK, optagelse.aspektRatio);
      } else {
        holder.billedeaq.image(url, true, true, bredde, R.drawable.vucroskilde_logo, null, AQuery.FADE_IN_NETWORK, AQuery.RATIO_PRESERVE);
      }
      */

