package org.bits_waves.waves2017.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2017.Adapters.ViewPagerAdapterTwo;
import org.bits_waves.waves2017.R;

import me.relex.circleindicator.CircleIndicator;

public class Day2Nights extends Fragment {
    ViewPager viewPager;
    private View view;
    private String imgURL;
    private int bitIMG;

    public static Day2Nights newInstance() {
        Day2Nights fragment = new Day2Nights();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_day2_nights, container, false);
        viewPager = view.findViewById(R.id.viewPager);
        CircleIndicator indicator = view.findViewById(R.id.indicator);
        ViewPagerAdapterTwo viewPagerAdapterTwo = new ViewPagerAdapterTwo(getContext());
        indicator.setViewPager(viewPager);
        viewPager.setAdapter(viewPagerAdapterTwo);


        return view;

    }
}