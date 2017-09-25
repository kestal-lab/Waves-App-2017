package org.bits_waves.waves2017;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.relex.circleindicator.CircleIndicator;

public class Day3Nights extends Fragment {
    ViewPager viewPager;
    private View view;
    private String imgURL;
    private int bitIMG;

    public static Day3Nights newInstance() {
        Day3Nights fragment = new Day3Nights();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_day3_nights, container, false);
        viewPager = view.findViewById(R.id.viewPager);
        CircleIndicator indicator = view.findViewById(R.id.indicator);
        ViewPagerAdapterThree viewPagerAdapterThree = new ViewPagerAdapterThree(getContext());
        indicator.setViewPager(viewPager);
        viewPager.setAdapter(viewPagerAdapterThree);


        return view;

    }
}