package com.example.sebastian.pruebamateriald.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sebastian.pruebamateriald.R;
import com.example.sebastian.pruebamateriald.model.Amigos;
import java.util.ArrayList;



/**
 * Created by sarango on 03/02/2015.
 */
public class AdapterAmigos extends RecyclerView.Adapter<AdapterAmigos.ViewHolder> {

    private ArrayList<Amigos> amigos;
    private int itemLayout;


    public AdapterAmigos(ArrayList<Amigos> amigos, int itemLayout){
        this.amigos = amigos;
        this.itemLayout = itemLayout;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(itemLayout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
       Amigos amigo = amigos.get(i);

        viewHolder.amigonombre.setText(amigo.getNombre());
        viewHolder.amigotwitter.setText(amigo.getTwitter());
        viewHolder.amigoultcancion.setText(amigo.getUltimaCancion());
    }

    @Override
    public int getItemCount() {
        return amigos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView amigonombre;
        public TextView amigotwitter;
        public TextView amigoultcancion;


        public ViewHolder(View itemView) {
            super(itemView);

            amigonombre = (TextView) itemView.findViewById(R.id.txtnombre);
            amigotwitter = (TextView) itemView.findViewById(R.id.txttwitter);
            amigoultcancion = (TextView) itemView.findViewById(R.id.txtultimacancion);
        }
    }

}
