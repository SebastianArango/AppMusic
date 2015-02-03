package com.example.sebastian.pruebamateriald.activitys;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import com.astuetz.PagerSlidingTabStrip;
import com.example.sebastian.pruebamateriald.R;
import com.example.sebastian.pruebamateriald.fragments.AmigosFragment;
import com.example.sebastian.pruebamateriald.fragments.DescatadosFragment;
import com.example.sebastian.pruebamateriald.fragments.ProfileFragment;


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


        private final String[] TITLES = {"Destacados", "Amigos",  "perfil"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int arg0) {
            switch (arg0) {
                case 0:
                    return new DescatadosFragment();
                case 1:
                    return new AmigosFragment();
                case 2:
                    return new ProfileFragment();
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


    }
}