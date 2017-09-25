package org.bits_waves.waves2017;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.relex.circleindicator.CircleIndicator;

public class Day1Nights extends Fragment {
    ViewPager viewPager;
    private View view;
    private String imgURL;
    private int bitIMG;

    public static Day1Nights newInstance() {
        Day1Nights fragment = new Day1Nights();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_day1_nights, container, false);
        viewPager = view.findViewById(R.id.viewPager);
        CircleIndicator indicator = view.findViewById(R.id.indicator);
        ViewPagerAdapterOne viewPagerAdapterOne = new ViewPagerAdapterOne(getContext());
        indicator.setViewPager(viewPager);
        viewPager.setAdapter(viewPagerAdapterOne);


        return view;

    }
}