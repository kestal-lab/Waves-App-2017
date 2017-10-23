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

public class Day3 extends Fragment {
    private View myFragmentView;
    private String imgURL;
    private int bitIMG;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();
    public static Day3 newInstance() {
        Day3 fragment = new Day3();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView=inflater.inflate(R.layout.activity_day3, container, false);

        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recycle2);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new EventAdapter(listItems,getActivity().getApplicationContext());

        recyclerView.setAdapter(adapter);

        EventItem listItem = new EventItem("Skime","______",
                "http://bits-waves.org/static/main/images1/events/skime.JPG",
                "09:00","Auditorium","Drama");
        listItems.add(listItem);
        EventItem listItem1 = new EventItem("Moot Court","","http://bits-waves.org/static/main/images1/events/moot.JPG","09:00","A & C Block","Specials");
        listItems.add(listItem1);

        EventItem listItem3 = new EventItem("Contention","","http://bits-waves.org/static/main/images1/events/Contention.JPG","09:00","A & C Block","Literary");
        listItems.add(listItem3);
        EventItem listItem4 = new EventItem("Kala Workshop 2","","http://bits-waves.org/static/main/images1/events/skime.JPG","09:00","C-303","Design");
        listItems.add(listItem4);
        EventItem listItem5 = new EventItem("Premier League","","http://bits-waves.org/static/main/images1/events/moot.JPG","09:00","C-307","Specials");
        listItems.add(listItem5);
        EventItem listItem6 = new EventItem("Jukebox","Finals",
                "http://bits-waves.org/static/main/images1/events/jokebox.JPG","",
                "","Music");
        listItems.add(listItem6);
        EventItem listItem7 = new EventItem("Spell Bee","","http://bits-waves.org/static/main/images1/events/moot.JPG","10:00","LT-1","Literary");
        listItems.add(listItem7);
        EventItem listItem8 = new EventItem("Poster Design","","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","C-301","Design");
        listItems.add(listItem8);
        EventItem listItem57 = new EventItem("Strangely Familiar","Finals","http://bits-waves.org/static/main/images1/events/sf.JPG","13:00","Auditorium","Specials");
        listItems.add(listItem57);
        EventItem listItem9 = new EventItem("Irshaad","Finals","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","12:00","Oustdoor Stage","Literary");
        listItems.add(listItem9);
        EventItem listItem10 = new EventItem("Artathon","Round 3",
                "http://bits-waves.org/static/main/images1/events/artathon.jpg",
                "12:00","LT-1","Design");
        listItems.add(listItem10);
        EventItem listItem11 = new EventItem("WIPRO Quiz","","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","10:30","LT-4","Quiz");
        listItems.add(listItem11);
        EventItem listItem12 = new EventItem("SAM Workshop","","http://bits-waves.org/static/main/images1/events/natyanjali.JPG","11:30","C-403","Workshop");
        listItems.add(listItem12);
        EventItem listItem13 = new EventItem("Mr And Ms Waves","Finals",
                "http://bits-waves.org/static/main/images1/events/mr_waves.jpg",
                "14:00","Auditorium","Specials");
        listItems.add(listItem13);
        EventItem listItem14 = new EventItem("Lonewolf","","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","14:00","LT-4","");
        listItems.add(listItem14);
        EventItem listItem15 = new EventItem("Natyanjali","Finals",
                "http://bits-waves.org/static/main/images1/events/natyanjali.JPG",
                "17:00","Auditorium","Dance");
        listItems.add(listItem15);
        EventItem listItem16 = new EventItem("Coffee Cats- Jazz","","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","00:00","Auditorium","Music");
        listItems.add(listItem16);

        return myFragmentView;

    }
}