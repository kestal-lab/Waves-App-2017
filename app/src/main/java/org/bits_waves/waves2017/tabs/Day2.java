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

public class Day2 extends Fragment {
    private View myFragmentView;
    private String imgURL;
    private int bitIMG;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();
    public static Day2 newInstance() {
        Day2 fragment = new Day2();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView=inflater.inflate(R.layout.activity_day2, container, false);

        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recycle2);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new EventAdapter(listItems,getActivity().getApplicationContext());

        recyclerView.setAdapter(adapter);
        EventItem listItem = new EventItem("Rangmanch","___",
                "http://bits-waves.org/static/main/images1/events/rangmanch.jpg",
                "09:00","Auditorium","Drama");
        listItems.add(listItem);
        EventItem listItem1 = new EventItem("Dancing Duo","Eliminations","http://bits-waves.org/static/main/images1/events/dancingduo.jpg","09:00","Outdoor Stage","Dance");
        listItems.add(listItem1);
        EventItem listItem2 = new EventItem("Moot Court","","http://bits-waves.org/static/main/images1/events/moot.JPG","09:00","A & C Block","Specials");
        listItems.add(listItem2);
        EventItem listItem3 = new EventItem("Contention","","http://bits-waves.org/static/main/images1/events/Contention.JPG","09:00","A & C Block","Literary");
        listItems.add(listItem3);
        EventItem listItem4 = new EventItem("Solonote","",
                "http://bits-waves.org/static/main/images1/events/solonote.jpg",
                "09:00","LT3,4Lawns","Music");
        listItems.add(listItem4);
        EventItem listItem5 = new EventItem("Portaiture","",
                "http://bits-waves.org/static/main/images1/events/portraiture.JPG",
                "09:00","C-302","Design");
        listItems.add(listItem5);

        EventItem listItem7 = new EventItem("Silence Of The Amps","Eliminations+Finals","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","09:30","LT 1,2 Lawns","Music");
        listItems.add(listItem7);
        EventItem listItem8 = new EventItem("Alaap","",
                "http://bits-waves.org/static/main/images1/events/alaap.jpg","09:30",
                "C-303","Music");
        listItems.add(listItem8);
        EventItem listItem9 = new EventItem("Dancing Duo","Finals",
                "http://bits-waves.org/static/main/images1/events/dancingduo.jpg",
                "10:30","OutdoorStage","Dance");
        listItems.add(listItem9);
        EventItem listItem10 = new EventItem("Waves Open","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","10:00","LT-1","Quiz");
        listItems.add(listItem10);
        EventItem listItem11 = new EventItem("Artathon","Round2",
                "http://bits-waves.org/static/main/images1/events/artathon.jpg",
                "11:30","LT-4","Design");
        listItems.add(listItem11);
        EventItem listItem12 = new EventItem("Hogathon","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","11:00","Marketing Pavilion","Specials");
        listItems.add(listItem12);
        EventItem listItem13 = new EventItem("FashP","Finals",
                "http://bits-waves.org/static/main/images1/events/fashp.jpg","13:00",
                "Auditorium","Specials");
        listItems.add(listItem13);
        EventItem listItem14 = new EventItem("Fashion Design","Finals","http://bits-waves.org/static/main/images1/events/artathon.jpg","14:00","C-304","Design");
        listItems.add(listItem14);
        EventItem listItem15 = new EventItem("Quiz In Two Shades","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","14:00","LT-1","Quiz");
        listItems.add(listItem15);
        EventItem listItem16 = new EventItem("Searock","Final",
                "http://bits-waves.org/static/main/images1/events/searock.JPG",
                "17:00","Auditorium","Music");
        listItems.add(listItem16);
        EventItem listItem17 = new EventItem("Handpan Work","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","11:30","C-301","");
        listItems.add(listItem17);
        EventItem listItem18 = new EventItem("Inverse","Eliminations",
                "http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","13:30","C-301","Literary");
        listItems.add(listItem18);
        EventItem listItem19 = new EventItem("Indian Rock","",
                "http://bits-waves.org/static/main/images1/events/indian_rock.jpg",
                "00:00","Auditorium","Music");
        listItems.add(listItem19);
        EventItem listItem23 = new EventItem("Strangely Familiar","Semi Finals","http://bits-waves.org/static/main/images1/events/sf.JPG","00:00","Outdoor Stage","Specials");
        listItems.add(listItem23);
        EventItem listItem20 = new EventItem("Waves Ball","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","00:00","LT3,4Lawns","Specials");
        listItems.add(listItem20);
        EventItem listItem21 = new EventItem("All Night Treasure Hunt","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","0100","Marketing Pavilion","Specials");
        listItems.add(listItem21);
        EventItem listItem22 = new EventItem("Inverse","Finals",
                "http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","00:00","C-301","Literary");
        listItems.add(listItem22);
        return myFragmentView;

    }
}