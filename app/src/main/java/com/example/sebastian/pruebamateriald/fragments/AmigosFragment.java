package com.example.sebastian.pruebamateriald.fragments;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sebastian.pruebamateriald.R;
import com.example.sebastian.pruebamateriald.adapters.AdapterAmigos;
import com.example.sebastian.pruebamateriald.model.Amigos;

import java.net.URL;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AmigosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_amigos, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Amigos> amigosArrayList = new  ArrayList<Amigos>();
        Amigos amigos = new Amigos();

        amigos.setNombre("Sebastian");
        amigos.setTwitter("@twitterSebastian");
        amigos.setUltimaCancion("El gram combo");
        amigosArrayList.add(amigos);

        Amigos amigos1 = new Amigos();
        amigos1.setNombre("Sebastian");
        amigos1.setTwitter("@twitterSebastian");
        amigos1.setUltimaCancion("El gram combo");
        amigosArrayList.add(amigos1);

        Amigos amigos2 = new Amigos();
        amigos2.setNombre("Sebastian");
        amigos2.setTwitter("@twitterSebastian");
        amigos2.setUltimaCancion("El gram combo");
        amigosArrayList.add(amigos2);

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AdapterAmigos(amigosArrayList, R.layout.row_amigos));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());


    }

}
