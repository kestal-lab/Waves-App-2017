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
        EventItem listItem = new EventItem("Inauguration","","http://bits-waves.org/static/main/images1/events/skime.JPG","17:00","Auditorium","Specials");
        listItems.add(listItem);
        EventItem listItem1 = new EventItem("Spin Off","Goa Eliminations","http://bits-waves.org/static/main/images1/events/spinoff.JPG","22:00","Outdoor Stage","Music");
        listItems.add(listItem1);
        EventItem listItem2 = new EventItem("Searock","Goa Eliminations","http://bits-waves.org/static/main/images1/events/searock.JPG","23:00","Auditorium","Music");
        listItems.add(listItem2);
        EventItem listItem3 = new EventItem("Sizzle","Eliminations","http://bits-waves.org/static/main/images1/events/sizzle.jpg","23:00","C-301","Dance");
        listItems.add(listItem3);
        EventItem listItem4 = new EventItem("Jukebox","Eliminations","http://bits-waves.org/static/main/images1/events/jokebox.JPG","23:00","LT 1/2 lawns","Music");
        listItems.add(listItem4);
        EventItem listItem5 = new EventItem("Strangely Familiar","Eliminations","http://bits-waves.org/static/main/images1/events/sf.JPG","23:00","C-306","Specials");
        listItems.add(listItem5);
        EventItem listItem6 = new EventItem("FashP","Eliminations","http://bits-waves.org/static/main/images1/events/fashp.jpg","23:00","CC","Specials");
        listItems.add(listItem6);
        EventItem listItem8 = new EventItem("Show Me The Funny","Eliminations","http://bits-waves.org/static/main/images1/events/smtf.JPG","23:00","C-302","Specials");
        listItems.add(listItem8);


//        for (int i = 0; i <= 10; i++) {
//            EventItem listItem = new EventItem("Heading 0 " + (i+1),
//                    "Hello","https://www.w3schools.com/css/trolltunga.jpg","10:00","B-Dome","Music"
//            );
//
//            listItems.add(listItem);
//        }
        return myFragmentView;

    }
}