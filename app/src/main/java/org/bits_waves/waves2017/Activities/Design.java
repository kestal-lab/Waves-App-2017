package org.bits_waves.waves2017.Activities;

/**
 * Created by Keshav on 17-Oct-17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import org.bits_waves.waves2017.Adapters.Dance_adapter;
import org.bits_waves.waves2017.Adapters.Design_adapter;
import org.bits_waves.waves2017.ListItems.EventItem;
import org.bits_waves.waves2017.R;

import java.util.ArrayList;
import java.util.List;

public class Design extends AppCompatActivity {

    private String imgURL;
    private int bitIMG;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);


        tv= (TextView) findViewById(R.id.category_title);
        tv.setText("Drama");


        recyclerView = (RecyclerView)findViewById(R.id.recycle_catogory);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new Design_adapter(listItems,getApplicationContext());

        recyclerView.setAdapter(adapter);
        EventItem listItem = new EventItem("Inaugration","","http://bits-waves.org/static/main/images1/events/skime.JPG","17:00","Auditorium","Specials");
        listItems.add(listItem);
        EventItem listItem1 = new EventItem("Spin Off","Goa Eliminations","http://bits-waves.org/static/main/images1/events/spinoff.JPG","22:00","Outdoor Stage","Music");
        listItems.add(listItem1);
        EventItem listItem2 = new EventItem("Searock","Goa Eliminations","http://bits-waves.org/static/main/images1/events/searock.JPG","23:00","Auditorium","Music");
        listItems.add(listItem2);
        EventItem listItem3 = new EventItem("Sizzel","Eliminations","http://bits-waves.org/static/main/images1/events/sizzle.jpg","23:00","C-301","Dance");
        listItems.add(listItem3);
        EventItem listItem4 = new EventItem("Jukebox","Eliminations","http://bits-waves.org/static/main/images1/events/jokebox.JPG","23:00","LT 1/2 lawns","Music");
        listItems.add(listItem4);
        EventItem listItem5 = new EventItem("Strangely Familiar","Eliminations","http://bits-waves.org/static/main/images1/events/sf.JPG","23:00","C-306","Specials");
        listItems.add(listItem5);
        EventItem listItem6 = new EventItem("FashP","Eliminations","http://bits-waves.org/static/main/images1/events/fashp.jpg","23:00","CC","Specials");
        listItems.add(listItem6);
        EventItem listItem8 = new EventItem("Show Me The Funny","Eliminations","http://bits-waves.org/static/main/images1/events/smtf.JPG","23:00","C-302","Specials");
        listItems.add(listItem8);


    }
}
