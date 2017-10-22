package org.bits_waves.waves2017.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.bits_waves.waves2017.R;

public class Day2Nights extends Fragment {
    ViewPager viewPager;
    private View view;
    private String imgURL;
    ImageView night1;
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
        view = inflater.inflate(R.layout.activity_day1_nights, container, false);
        night1 = (ImageView) view.findViewById(R.id.image);
        Picasso.with(getActivity().getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/nights%20images%2F1.jpg?alt=media&token=03b40622-a510-49dd-8768-3653720e24eb").fit().into(night1);
        return view;

    }
}