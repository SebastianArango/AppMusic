package com.example.sebastian.pruebamateriald.activitys;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.sebastian.pruebamateriald.R;

public class MainActivity extends ActionBarActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Sfotipy");
        setSupportActionBar(toolbar);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton1);
    }

    public void EnterActivity(View view) {
        Intent intent = new Intent(this, SecundActivity.class);
        startActivity(intent);
    }

}


