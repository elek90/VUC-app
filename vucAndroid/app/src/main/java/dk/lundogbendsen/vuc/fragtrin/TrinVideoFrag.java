package dk.lundogbendsen.vuc.fragtrin;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.Snackbar;
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
import android.widget.VideoView;

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

/**
 * Created by elek on 09/02/16.
 */
public class TrinVideoFrag extends TrinFrag implements View.OnClickListener{
    private static final int SELECT_VIDEO = 3;
    private static final int RECORD_VIDEO = 4;
    private AQuery aq;
    private File filPåEksterntLager;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("onCreateView "+this);
        View rod = inflater.inflate(R.layout.svar_video_frag, container, false);
        aq = new AQuery(rod);
        aq.id(R.id.tag_video).clicked(this);
        aq.id(R.id.galleri_video).clicked(this);
        recyclerView = (RecyclerView) rod.findViewById(R.id.recyclerView_video);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new MyLinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        if (trin.svar ==null) {
            trin.svar = new Svar(Brugervalg.instans.bru, trin);
        }
        if (trin.svar.optagelser ==null) trin.svar.optagelser = new ArrayList<Optagelse>();
        if (trin.svar.optagelser.isEmpty()) recyclerView.setVisibility(View.GONE);
        trin.tmpHackTrinVideoFrag = this;
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
            getActivity().startActivityForResult(i, SELECT_VIDEO);
        }
        if (v.getId() == R.id.tag_video) try {

            Intent i = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
            // Hvis vi vil læse billedet i fuld opløsning fra ekstern lager/SD-kort skal vi give en URI
            filPåEksterntLager = DiverseIO.opretUnikFil("TRIN_VIDEO_" + trin.id, ".mp4");
            i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(filPåEksterntLager));
            App.onActivityResultListe.add(this);
            getActivity().startActivityForResult(i, RECORD_VIDEO);
        } catch (Exception e) { Log.rapporterFejl(e); }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent resIntent) {
        System.out.println("onActivityResult FRAG"+ requestCode + " gav resultat " + resultCode + " med data=" + resIntent);
        //resultatHolder.removeAllViews();
        App.onActivityResultListe.remove(this);

        if (resultCode == Activity.RESULT_OK) {
            final Optagelse optagelse = new Optagelse();
            if (requestCode == SELECT_VIDEO) {
                optagelse.lokalUri = resIntent.getData().toString();
            } else if (requestCode == RECORD_VIDEO) {
                optagelse.lokalUri = Uri.fromFile(filPåEksterntLager).toString();
            }
            gemOptagelse(trin, optagelse);
        }
    }

    public static void gemOptagelse(final Trin trin, final Optagelse optagelse) {
        try {
            Log.d("gemOptagelse lokalUri="+ optagelse.lokalUri);
        } catch (Exception e) {
            Log.rapporterFejl(e);
        }
    }

    public class OptagelseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final VideoView video;
        private final ImageView slet;
        private final EditText videoText;
        public boolean billedetekstUnderOpdatering;

        public OptagelseViewHolder(View v) {
            super(v);
            video = (VideoView) v.findViewById(R.id.list_video);
            video.setOnClickListener(this);
            videoText = (EditText) v.findViewById(R.id.billedetekst);
            videoText.addTextChangedListener(new TextWatcher() {
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                public void onTextChanged(CharSequence s, int start, int before, int count) {}
                public void afterTextChanged(Editable s) {
                    if (billedetekstUnderOpdatering) return;
                    trin.svar.ændretSkalGemmes = true;
                    trin.svar.optagelser.get(getAdapterPosition()).tekst = videoText.getText().toString();
                }
            });
            slet = (ImageView) v.findViewById(R.id.slet);
            slet.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }

    RecyclerView.Adapter<OptagelseViewHolder> adapter = new RecyclerView.Adapter<OptagelseViewHolder>() {
        @Override
        public int getItemCount() {
            return trin.svar.optagelser.size();
        }

        @Override
        public OptagelseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.svar_video_listeelem, null, false);
            return new OptagelseViewHolder(v);
        }

        @Override
        public void onBindViewHolder(OptagelseViewHolder holder, int position) {
            Optagelse optagelse = trin.svar.optagelser.get(position);
            holder.billedetekstUnderOpdatering = true;
            holder.videoText.setText(trin.svar.optagelser.get(position).tekst);
            holder.billedetekstUnderOpdatering = false;
            //holder.video.setVideoURI(null);
            int højde = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 150, getResources().getDisplayMetrics());
            int bredde = (int) (højde*optagelse.aspektRatio);
            holder.video.getLayoutParams().height = højde;
            holder.video.getLayoutParams().width = bredde==0? ViewGroup.LayoutParams.WRAP_CONTENT : bredde;

            // Vis billedet. Først prøver vi med lokal URI
            if (optagelse.lokalUri!=null && !optagelse.ignorerLokalUri) {
                Uri lokalUri = Uri.parse(optagelse.lokalUri);
                try {
                    return;
                } catch (Exception e) {
                    Log.d("ignorerLokalUri for optagelse "+position+ ": " + e);
                }
            }
            else { // OK, vi henter den over nettet og cacher den hist og pist
                Uri remoteUri = Uri.parse(optagelse.url);
                holder.video.setVideoURI(remoteUri);
            }

            /*
            String url = optagelse.url;
            if (optagelse.cloudinary_id!=null) {
                url = App.cloudinary.url().transformation(new Transformation().height(højde)).generate(optagelse.cloudinary_id);
                //Log.d("cloudinary_id => "+url+ " i stedet for "+optagelse.url);
            }
            Picasso.with(getContext()).load(url).resize(bredde,højde).into(holder.billede);
            */
        }
    };
}