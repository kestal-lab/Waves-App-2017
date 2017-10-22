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

public class Day1 extends Fragment {
    private View myFragmentView;
    private String imgURL;
    private int bitIMG;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();
    public static Day1 newInstance() {
        Day1 fragment = new Day1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView=inflater.inflate(R.layout.activity_day1, container, false);

        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recycle2);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new EventAdapter(listItems,getActivity().getApplicationContext());

        recyclerView.setAdapter(adapter);





        EventItem listItem = new EventItem("Rangmanch","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","09:00","Auditorium","Drama");
        listItems.add(listItem);
        EventItem listItem1 = new EventItem("Dancing Duo","Eliminations","http://bits-waves.org/static/main/images1/events/dancingduo.jpg","09:00","Outdoor Stage","Dance");
        listItems.add(listItem1);
        EventItem listItem2 = new EventItem("Moot Court","","http://bits-waves.org/static/main/images1/events/moot.JPG","09:00","A & C Block","Specials");
        listItems.add(listItem2);
        EventItem listItem3 = new EventItem("Contention","","http://bits-waves.org/static/main/images1/events/Contention.JPG","09:00","A & C Block","Literary");
        listItems.add(listItem3);
        EventItem listItem5 = new EventItem("Vice Quiz","","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","LT-1","Quiz");
        listItems.add(listItem5);
        EventItem listItem6 = new EventItem("Nukkad Natak","Eliminations","http://bits-waves.org/static/main/images1/events/nukkadnatak.jpg","10:00","LT1,2Lawns","Drama");
        listItems.add(listItem6);
        EventItem listItem7 = new EventItem("Artathon","Round 1","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","LT-4","Design");
        listItems.add(listItem7);
        EventItem listItem8 = new EventItem("Blind Art","","http://bits-waves.org/static/main/images1/events/blindart.JPG","10:00","KalaRoom","Design");
        listItems.add(listItem8);
        EventItem listItem9 = new EventItem("Fashion Design","","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","C-304","Design");
        listItems.add(listItem9);
        EventItem listItem10 = new EventItem("Show Me The Funny","Finals","http://bits-waves.org/static/main/images1/events/smtf.JPG","12:30","Outdoor Stage","Specials");
        listItems.add(listItem10);
        EventItem listItem11 = new EventItem("AAROH","","http://bits-waves.org/static/main/images1/events/artathon.jpg","12:00","LT-4","Design");
        listItems.add(listItem11);
        EventItem listItem12 = new EventItem("Kala Workshop","","http://bits-waves.org/static/main/images1/events/artathon.jpg","12:00","Kalaroom","Design");
        listItems.add(listItem12);
        EventItem listItem13 = new EventItem("Sizzle","Round 1","http://bits-waves.org/static/main/images1/events/sizzle.jpg","12:00","CC","Dance");
        listItems.add(listItem13);
        EventItem listItem14 = new EventItem("Fashion Design","Finals","http://bits-waves.org/static/main/images1/events/artathon.jpg","14:00","C-304","Design");
        listItems.add(listItem14);
        EventItem listItem15 = new EventItem("Searock","Semi Final","http://bits-waves.org/static/main/images1/events/searock.JPG","00:00","Auditorium","Music");
        listItems.add(listItem15);
        EventItem listItem16 = new EventItem("SpinOff","Finals","http://bits-waves.org/static/main/images1/events/spinoff.JPG","01:00","Outdoor Stage","Music");
        listItems.add(listItem16);
        EventItem listItem17 = new EventItem("Jukebox","Elimination","http://bits-waves.org/static/main/images1/events/jokebox.JPG","00:00","LT 1,2 Lawns","Music");
        listItems.add(listItem17);
        EventItem listItem18 = new EventItem("Sizzle","Eliminations","http://bits-waves.org/static/main/images1/events/sizzle.jpg","23:30","Kala Room","Dance");
        listItems.add(listItem18);
        EventItem listItem19 = new EventItem("Natyanjali","Eliminations","http://bits-waves.org/static/main/images1/events/natyanjali.JPG","00:00","CC","Dance");
        listItems.add(listItem19);
        EventItem listItem20 = new EventItem("Mr and Ms Waves","Group Disccusion","http://bits-waves.org/static/main/images1/events/mr_waves.jpg","00:00","C-301,C-302","Specials");
        listItems.add(listItem20);
        EventItem listItem21 = new EventItem("Nukkad Natak","Finals","http://bits-waves.org/static/main/images1/events/nukkadnatak.jpg","00:00","Crossroads","Drama");
        listItems.add(listItem21);

        return myFragmentView;

    }
}