package com.example.sebastian.pruebamateriald.fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sebastian.pruebamateriald.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescatadosFragment extends Fragment {

    public DescatadosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destacados, container, false);
    }



}
