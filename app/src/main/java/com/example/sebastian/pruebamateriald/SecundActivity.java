package com.example.sebastian.pruebamateriald;


import android.content.Intent;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;

import com.astuetz.PagerSlidingTabStrip;


public class SecundActivity extends ActionBarActivity {

    private PagerSlidingTabStrip tabs;
    private ViewPager pager;
    private MyPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secund);

        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Sfotipy");
        setSupportActionBar(toolbar);



        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(adapter);

        final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
                .getDisplayMetrics());
        pager.setPageMargin(pageMargin);

        tabs.setViewPager(pager);
    }


    public class MyPagerAdapter extends FragmentPagerAdapter {

        //        private final String[] TITLES = { "Categories", "Home", "Top Paid", "Top Free", "Top Grossing", "Top New Paid",
//                "Top New Free", "Trending" };
//El tamaño de el array de TITLES debe ser igual al No de los fragmentos.
        private final String[] TITLES = {"citas", "pendientes", "preprospecto"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int arg0) {
            switch (arg0) {
                case 0:
                    return new PruebaFragment();
                case 1:
                    return new PruebaFragment2();
                case 2:
                    return new PruebaFragment3();
                default:
                    return null;
            }
        }

        public int getCount() {
            return TITLES.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

//        @Override
//        public int getCountTITLES() {
//            return TITLES.length;
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return SuperAwesomeCardFragment.newInstance(position);
//        }

    }
}