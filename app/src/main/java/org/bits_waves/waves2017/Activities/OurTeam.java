package org.bits_waves.waves2017.Activities;


/**
 * Created by Keshav on 10-Sep-17.
 */

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.ImageButton;

import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.fragment.OurTeam_FragementApp;
import org.bits_waves.waves2017.fragment.OurTeam_FragementSponsers;
import org.bits_waves.waves2017.fragment.OurTeam_FragementWaves;

import java.util.ArrayList;
import java.util.List;

public class OurTeam extends AppCompatActivity {


    ImageButton back;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private static final String TAG="Our Team";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);

        View v=getWindow().getDecorView();
        v.setBackgroundColor(Color.CYAN);

        back=(ImageButton) findViewById(R.id.bye);
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent it=new Intent(OurTeam.this,MainActivity.class);
                        startActivity(it);
                        overridePendingTransition(R.transition.enter,R.transition.exit);
                    }
                });

        Log.d(TAG,"hello i m done");
        mSectionsPagerAdapter=new SectionsPagerAdapter(getSupportFragmentManager());


        mViewPager=(ViewPager)findViewById(R.id.container2);
        setupViewPager(mViewPager);

        TabLayout tb = (TabLayout) findViewById(R.id.tabLayout);
        tb.setupWithViewPager(mViewPager);


    }

    public void setupViewPager(ViewPager viewpager)
    {
        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OurTeam_FragementApp(),"App");
        adapter.addFragment(new OurTeam_FragementWaves(),"Waves");
        adapter.addFragment(new OurTeam_FragementSponsers(),"Sponsors");
        viewpager.setAdapter(adapter);

    }



    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        private final List<Fragment> mfragmentList = new ArrayList<>();
        private final List<String> mfragmentTitleList = new ArrayList<>();


        public void addFragment(Fragment frg, String title) {
            mfragmentList.add(frg);
            mfragmentTitleList.add(title);

        }


        @Override
        public CharSequence getPageTitle(int position) {
            return mfragmentTitleList.get(position);
        }

        @Override


        public Fragment getItem(int position) {
            return mfragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mfragmentList.size();
        }

    }
}
