package org.bits_waves.waves2017.tabs;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2017.Adapters.EventAdapter;
import org.bits_waves.waves2017.ListItems.EventItem;
import org.bits_waves.waves2017.R;

import java.util.ArrayList;
import java.util.List;

public class Day0 extends Fragment {
    private View myFragmentView;
    private String imgURL;
    private int bitIMG;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();
    public static Day0 newInstance() {
        Day0 fragment = new Day0();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView=inflater.inflate(R.layout.activity_day0, container, false);

        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recycle2);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new EventAdapter(listItems,getActivity().getApplicationContext());

        recyclerView.setAdapter(adapter);

        for (int i = 0; i <= 10; i++) {
            EventItem listItem = new EventItem("Heading 0 " + (i+1),
                    "Hello","https://www.w3schools.com/css/trolltunga.jpg","10:00","B-Dome","Music"
            );

            listItems.add(listItem);
        }
        return myFragmentView;

    }
}