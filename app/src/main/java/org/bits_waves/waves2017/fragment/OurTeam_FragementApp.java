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

public class OurTeam_FragementApp extends android.support.v4.app.Fragment{

    private static final String TAG="OurTeam_FragementApp";
    public View inf;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<AppItem> appItems;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        inf=inflater.inflate(R.layout.our_team_fragement_app, container,false);
        recyclerView = (RecyclerView) inf.findViewById(R.id.our_team_fragement_app_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        appItems =new ArrayList<>();
        AppItem appItem1 =new AppItem("Aryan Agarwal","Head Developer","9521382950","aryanagarwal15@gmail.com","https://www.facebook.com/AryanAg15","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Fme.jpg?alt=media&token=1b4a71d1-1cb3-4f35-b4c5-6ee5f6708a43","Ashish Phogat","Developer","9702324766","aryanagarwal15@gmail.com","https://www.facebook.com/profile.php?id=100000651854386","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-17%20at%207.36.57%20PM.jpeg?alt=media&token=c6b86671-72be-4ab6-8da7-88e8f89e0728");
        AppItem appItem2 =new AppItem("Keshav Mittal","Developer", "9414384385","shanumittal147@gmail.com","https://www.facebook.com/keshav.mittal.1428","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Findesx.jpeg?alt=media&token=e2b25d39-cd5e-4ef8-aad8-834cb8d92c21","Rishab Kincha","Developer", "7888013992","#","https://www.facebook.com/rishab.khincha","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FWhatsApp%20Image%202017-10-18%20at%202.26.13%20AM.jpeg?alt=media&token=bd339610-cec3-41be-a1a3-780df14f41f8");
        AppItem appItem3 =new AppItem("ANANT BANSAL","Graphic Designer","79822 70872","anant6025@gmail.com","www.facebook.com/anant.bansal.9406","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FAnant%20Bansal.jpg?alt=media&token=16f6d789-cd65-4936-9f8c-c80928f522b6","Aravind Venugopal","Operations Head", "9446024217","aravindv@bits-waves.org","https://www.facebook.com/profile.php?id=100001648202618&ref=br_rs","https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/10448758_755684154496518_7424487197453654128_n.jpg?oh=edeeb19b1e9c8ff41a653dd09db4b0f6&oe=5A72245A");

        appItems.add(appItem1);
        appItems.add(appItem2);
        appItems.add(appItem3);
        adapter = new AppAdapter(appItems,getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
        return inf;
    }
}

