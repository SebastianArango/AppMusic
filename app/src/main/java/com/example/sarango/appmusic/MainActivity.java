package com.example.sarango.appmusic;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
;

import com.example.sebastian.pruebamateriald.R;
import com.example.sebastian.pruebamateriald.activitys.SecundActivity;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void EnterActivity(View view){
        Intent intent = new Intent(this, SecundActivity.class);
        startActivity(intent);
    }
}