package org.bits_waves.waves2017.Activities;

//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.DefaultItemAnimator;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.widget.ImageButton;
//import android.widget.TextView;
//
//import org.bits_waves.waves2017.ListItems.EventItem;
//import org.bits_waves.waves2017.R;
//
//import java.util.ArrayList;
//import java.util.List;

/**
 * Created by Keshav on 17-Oct-17.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import com.squareup.picasso.Picasso;

import org.bits_waves.waves2017.Adapters.Category_adapter;
import org.bits_waves.waves2017.ListItems.EventItem;
import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.fragment.ItemOneFragment;

import java.util.ArrayList;
import java.util.List;


public class Category extends AppCompatActivity {

    private String imgURL;
    private int bitIMG;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();
    private String heading;
    public TextView tv_heading;
    public ImageButton catogory_button,back;
    public String St;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        tv_heading= (TextView) findViewById(R.id.category_title);
        catogory_button= (ImageButton) findViewById(R.id.icon_category);

        recyclerView = (RecyclerView)findViewById(R.id.recycle_catogory);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new Category_adapter(listItems,getApplicationContext());

        recyclerView.setAdapter(adapter);
//
//
//        if(catogory_button==null)
//        {
//            Toast.makeText(getApplicationContext(),"Image BUtton Null",Toast.LENGTH_LONG).show();
//        }

        Bundle b=getIntent().getExtras();
        heading =b.getString("category_heading");
        if(heading.equals("Dance"))
        {
//
//            test.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(getApplicationContext(),"sdff",Toast.LENGTH_LONG).show();
//                }
//            });

            //catogory_button.setVisibility(View.INVISIBLE);
            tv_heading.setText("Dance");
            EventItem listItem3 = new EventItem("Sizzle","","http://bits-waves.org/static/main/images1/events/sizzle.jpg","23:00","C-301","Dance");
            listItems.add(listItem3);
            //Day1
            EventItem listItem1 = new EventItem("Dancing Duo","","http://bits-waves.org/static/main/images1/events/dancingduo.jpg","09:00","Outdoor Stage","Dance");
            listItems.add(listItem1);
            EventItem listItem19 = new EventItem("Natyanjali","","http://bits-waves.org/static/main/images1/events/natyanjali.JPG","00:00","CC","Dance");
            listItems.add(listItem19);
            //day2
            //day3
        }
        else if(heading.equals("Drama"))
        {
            tv_heading.setText("Drama");
            //day1
            EventItem listItem = new EventItem("Rangmanch","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","09:00","Auditorium","Drama");
            listItems.add(listItem);
            EventItem listItem6 = new EventItem("Nukkad Natak","","http://bits-waves.org/static/main/images1/events/nukkadnatak.jpg","10:00","LT1,2Lawns","Drama");
            listItems.add(listItem6);
            //day3
            EventItem listItem5 = new EventItem("Skime","",
                    "http://bits-waves.org/static/main/images1/events/skime.JPG",
                    "09:00","Auditorium","Drama");
            listItems.add(listItem5);
        }
        else if(heading.equals("Specials"))
        {
            tv_heading.setText("Specials");
            //day0
            EventItem listItem = new EventItem("Inaugration","","http://bits-waves.org/static/main/images1/events/skime.JPG","17:00","Auditorium","Specials");
            listItems.add(listItem);
            EventItem listItem5 = new EventItem("Strangely Familiar","","http://bits-waves.org/static/main/images1/events/sf.JPG","23:00","C-306","Specials");
            listItems.add(listItem5);
            EventItem listItem6 = new EventItem("FashP","","http://bits-waves.org/static/main/images1/events/fashp.jpg","23:00","CC","Specials");
            listItems.add(listItem6);
            EventItem listItem8 = new EventItem("Show Me The Funny","","http://bits-waves.org/static/main/images1/events/smtf.JPG","23:00","C-302","Specials");
            listItems.add(listItem8);
            //day1
            EventItem listItem20 = new EventItem("Mr and Ms Waves","","http://bits-waves.org/static/main/images1/events/mr_waves.jpg","00:00","C-301,C-302","Specials");
            listItems.add(listItem20);
            //day2
            EventItem listItem211 = new EventItem("Moot Court","","http://bits-waves.org/static/main/images1/events/moot.JPG","09:00","A & C Block","Specials");
            listItems.add(listItem211);
            EventItem listItem12 = new EventItem("Hogathon","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","11:00","MarketingPavilion","Specials");
            listItems.add(listItem12);
            EventItem listItem201 = new EventItem("Waves Ball","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","00:00","LT3,4Lawns","Specials");
            listItems.add(listItem201);
            EventItem listItem21 = new EventItem("All Night Treasure Hunt","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","0100","MarketingPavilion","Specials");
            listItems.add(listItem21);
            //da3
            EventItem listItem51 = new EventItem("Premier League","","http://bits-waves.org/static/main/images1/events/moot.JPG","09:00","C-307","Specials");
            listItems.add(listItem51);

        }
        else if(heading.equals("Music"))
        {
            tv_heading.setText("Music");
            //day0
            EventItem listItem1 = new EventItem("Spin Off","","http://bits-waves.org/static/main/images1/events/spinoff.JPG","22:00","Outdoor Stage","Music");
            listItems.add(listItem1);
            EventItem listItem2 = new EventItem("Searock","","http://bits-waves.org/static/main/images1/events/searock.JPG","23:00","Auditorium","Music");
            listItems.add(listItem2);
            EventItem listItem4 = new EventItem("Jukebox","","http://bits-waves.org/static/main/images1/events/jokebox.JPG","23:00","LT 1/2 lawns","Music");
            listItems.add(listItem4);
            //day1
            //day2
            EventItem listItem47 = new EventItem("Solonote","",
                    "http://bits-waves.org/static/main/images1/events/solonote.jpg",
                    "09:00","LT3,4Lawns","Music");
            listItems.add(listItem47);
            EventItem listItem7 = new EventItem("Silence Of The Amps","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","09:30","LT 1,2 Lawns","Music");
            listItems.add(listItem7);
            EventItem listItem8 = new EventItem("Alaap","",
                    "http://bits-waves.org/static/main/images1/events/alaap.jpg","09:30",
                    "C-303","Music");
            listItems.add(listItem8);
            EventItem listItem19 = new EventItem("Indian Rock","",
                    "http://bits-waves.org/static/main/images1/events/indian_rock.jpg",
                    "00:00","Auditorium","Music");
            listItems.add(listItem19);
            //day3
            EventItem listItem1677 = new EventItem("Coffee Cats- Jazz","","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","00:00","Auditorium","Music");
            listItems.add(listItem1677);

        }
        else if(heading.equals("Literary"))
        {
            tv_heading.setText("Literary");
            //day1
            EventItem listItem3 = new EventItem("Contention","","http://bits-waves.org/static/main/images1/events/Contention.JPG","09:00","A & C Block","Literary");
            listItems.add(listItem3);
            EventItem listItem4 = new EventItem("Carpedictum","","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","09:00","C-303","Literary");
            listItems.add(listItem4);
            //day2
            EventItem listItem18 = new EventItem("Inverse","",
                    "http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","13:30","C-301","Literary");
            listItems.add(listItem18);
            //day3
            EventItem listItem7 = new EventItem("Spell Bee","","http://bits-waves.org/static/main/images1/events/moot.JPG","10:00","LT-1","Literary");
            listItems.add(listItem7);
            EventItem listItem9 = new EventItem("Irshaad","","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","12:00","Oustdoor Stage","Literary");
            listItems.add(listItem9);

        }
        else if(heading.equals("Quiz"))
        {
            tv_heading.setText("Quiz");
            //day1
            EventItem listItem5 = new EventItem("Vice Quiz","","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","LT-1","Quiz");
            listItems.add(listItem5);
            //day2
            EventItem listItem10 = new EventItem("Waves Open","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","10:00","LT-1","Quiz");
            listItems.add(listItem10);
            EventItem listItem15 = new EventItem("Quiz In Two Shades","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","14:00","LT-1","Quiz");
            listItems.add(listItem15);
            //day3
            EventItem listItem11 = new EventItem("WIPRO Quiz","","http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","10:30","LT-4","Quiz");
            listItems.add(listItem11);

        }
        else if(heading.equals("Workshop"))
        {
            tv_heading.setText("Workshop");
            //day3
            EventItem listItem12 = new EventItem("SAM Workshop","","http://bits-waves.org/static/main/images1/events/natyanjali.JPG","11:30","C-403","Workshop");
            listItems.add(listItem12);
            EventItem listItem127 = new EventItem("Kala Workshop","","http://bits-waves.org/static/main/images1/events/artathon.jpg","12:00","Kalaroom","Workshop");
            listItems.add(listItem127);

        }
        else if(heading.equals("Design"))
        {
            tv_heading.setText("Design");
            //day1
            EventItem listItem7 = new EventItem("Artathon","Round 1","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","LT-4","Design");
            listItems.add(listItem7);
            EventItem listItem8 = new EventItem("Blind Art","","http://bits-waves.org/static/main/images1/events/blindart.JPG","10:00","KalaRoom","Design");
            listItems.add(listItem8);
            EventItem listItem9 = new EventItem("Fashion Design","","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","C-304","Design");
            listItems.add(listItem9);
            EventItem listItem11 = new EventItem("AAROH","","http://bits-waves.org/static/main/images1/events/artathon.jpg","12:00","LT-4","Design");
            listItems.add(listItem11);
            //day2
            EventItem listItem5 = new EventItem("Portaiture","",
                    "http://bits-waves.org/static/main/images1/events/portraiture.JPG",
                    "09:00","C-302","Design");
            listItems.add(listItem5);
            EventItem listItem87 = new EventItem("Poster Design","","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","C-301","Design");
            listItems.add(listItem87);

        }
        else if(heading.equals("Carpedictum"))
        {
            tv_heading.setText("Carpedictum");
            EventItem listItem18 = new EventItem("Inverse","",
                    "http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG","13:30","C-301","Literary");
            listItems.add(listItem18);


        }
        else if(heading.equals("BeauVista"))
        {
            tv_heading.setText("Beau Vista");
            EventItem listItem7 = new EventItem("Artathon","Round 1","http://bits-waves.org/static/main/images1/events/artathon.jpg","10:00","LT-4","Design");
            listItems.add(listItem7);
            EventItem listItem5 = new EventItem("Portaiture","",
                    "http://bits-waves.org/static/main/images1/events/portraiture.JPG",
                    "09:00","C-302","Design");
            listItems.add(listItem5);
            EventItem listItem8 = new EventItem("Blind Art","","http://bits-waves.org/static/main/images1/events/blindart.JPG","10:00","KalaRoom","Design");
            listItems.add(listItem8);


        }
        else if(heading.equals("Florence"))
        {
            tv_heading.setText("Florence");
            //dance
            EventItem listItem3 = new EventItem("Sizzle","","http://bits-waves.org/static/main/images1/events/sizzle.jpg","23:00","C-301","Dance");
            listItems.add(listItem3);
            EventItem listItem1 = new EventItem("Dancing Duo","","http://bits-waves.org/static/main/images1/events/dancingduo.jpg","09:00","Outdoor Stage","Dance");
            listItems.add(listItem1);
            EventItem listItem19 = new EventItem("Natyanjali","","http://bits-waves.org/static/main/images1/events/natyanjali.JPG","00:00","CC","Dance");
            listItems.add(listItem19);

            //drama
            EventItem listItem = new EventItem("Rangmanch","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","09:00","Auditorium","Drama");
            listItems.add(listItem);
            EventItem listItem6 = new EventItem("Nukkad Natak","","http://bits-waves.org/static/main/images1/events/nukkadnatak.jpg","10:00","LT1,2Lawns","Drama");
            listItems.add(listItem6);
            EventItem listItem5 = new EventItem("Skime","",
                    "http://bits-waves.org/static/main/images1/events/skime.JPG",
                    "09:00","Auditorium","Drama");
            listItems.add(listItem5);

            //music
            EventItem listItem4 = new EventItem("Jukebox","","http://bits-waves.org/static/main/images1/events/jokebox.JPG","23:00","LT 1/2 lawns","Music");
            listItems.add(listItem4);
            EventItem listItem47 = new EventItem("Solonote","",
                    "http://bits-waves.org/static/main/images1/events/solonote.jpg",
                    "09:00","LT3,4Lawns","Music");
            listItems.add(listItem47);
            EventItem listItem7 = new EventItem("Silence Of The Amps","","http://bits-waves.org/static/main/images1/events/rangmanch.jpg","09:30","LT 1,2 Lawns","Music");
            listItems.add(listItem7);
            EventItem listItem8 = new EventItem("Alaap","",
                    "http://bits-waves.org/static/main/images1/events/alaap.jpg","09:30",
                    "C-303","Music");
            listItems.add(listItem8);
            EventItem listItem197 = new EventItem("Indian Rock","",
                    "http://bits-waves.org/static/main/images1/events/indian_rock.jpg",
                    "00:00","Auditorium","Music");
            listItems.add(listItem197);

        }

        back=(ImageButton) findViewById(R.id.back_button_category);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(heading.equals("Florence") || heading.equals("BeauVista") || heading.equals("Carpedictum")) {

                    Intent it = new Intent(Category.this, Mini_fest.class);
                    startActivity(it);
                }
                else
                {

                    Intent it = new Intent(Category.this, Category_home_page.class);
                    startActivity(it);
                }
            }
        });



    }
}


