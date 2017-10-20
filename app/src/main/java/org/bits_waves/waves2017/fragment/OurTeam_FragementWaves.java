package org.bits_waves.waves2017.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2017.Adapters.AppAdapter;
import org.bits_waves.waves2017.ListItems.AppItem;
import org.bits_waves.waves2017.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Keshav on 09-Sep-17.
 */

public class OurTeam_FragementWaves extends android.support.v4.app.Fragment{

    private static final String TAG="OurTeam_FragementWaves";
    public View inf;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<AppItem> appItems;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        inf=inflater.inflate(R.layout.our_team_fragement_waves, container,false);
        recyclerView = (RecyclerView) inf.findViewById(R.id.our_team_fragement_waves_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        appItems =new ArrayList<>();
        AppItem appItem1 =new AppItem("Rahul Bansal","Convener","9953241941","bansal@bits-waves.org","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","Yash Agarwal","Research Head","9967635466","yash@bits-waves.org","http://www.facebook.com","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-17%20at%207.36.57%20PM.jpeg?alt=media&token=c6b86671-72be-4ab6-8da7-88e8f89e0728");
        AppItem appItem2 =new AppItem("Aravind Venugopal","Operations Head", "9446024217","aravindv@bits-waves.org","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","Srivats Mohan","Events Head", "8976695524","srivats@bits-waves.org","http://www.facebook.com","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-18%20at%202.26.13%20AM.jpeg?alt=media&token=bd339610-cec3-41be-a1a3-780df14f41f8");
        AppItem appItem3 =new AppItem("Het Satra","Sponsorship Head", "9870382100","het@bits-waves.org","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","Swapnil P. Kumar","Creative Head", "9986222942","swapnil@bits-waves.org","http://www.facebook.com","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-18%20at%202.26.13%20AM.jpeg?alt=media&token=bd339610-cec3-41be-a1a3-780df14f41f8");
        AppItem appItem4 =new AppItem("Akash Pareek","Creative Head", "7507170767","akash@bits-waves.org","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","Akshat Budania","", "7507167844","akshat@bits-waves.org","http://www.facebook.com","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-18%20at%202.26.13%20AM.jpeg?alt=media&token=bd339610-cec3-41be-a1a3-780df14f41f8");
        AppItem appItem5 =new AppItem("Angad Singh","Media Head", "7743913668","angad@bits-waves.org","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","Shikhar Rastogi ","", "8130729375","shikhar@bits-waves.org","http://www.facebook.com","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-18%20at%202.26.13%20AM.jpeg?alt=media&token=bd339610-cec3-41be-a1a3-780df14f41f8");
        AppItem appItem6 =new AppItem("Aarsh Thakur ","Sponsorship Head", "7774034435","aarsh@bits-waves.org","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","Aditya Malhotra ","Backstage Head", "7696563700","aditya@bits-waves.org","http://www.facebook.com","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-18%20at%202.26.13%20AM.jpeg?alt=media&token=bd339610-cec3-41be-a1a3-780df14f41f8");
        AppItem appItem7 =new AppItem("Kartik Kumar Saxena ","ProNites Head", "8447270128","kartik@bits-waves.org","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","","", "8976695524","srivats@bits-waves.org","http://www.facebook.com","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-18%20at%202.26.13%20AM.jpeg?alt=media&token=bd339610-cec3-41be-a1a3-780df14f41f8");

        appItems.add(appItem1);
        appItems.add(appItem2);
        appItems.add(appItem3);
        appItems.add(appItem4);
        appItems.add(appItem5);
        appItems.add(appItem6);
        appItems.add(appItem7);
        adapter = new AppAdapter(appItems,getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
        return inf;
    }
}

