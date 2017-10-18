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
        AppItem appItem1 =new AppItem("Aryan Agarwal","Head Developer","9521382950","aryanagarwal15@gmail.com","https://www.facebook.com/AryanAg15","https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/15181219_10205688930541033_3742849664562241079_n.jpg?oh=00cfa8a958be1ed381e1e0ece2bab171&oe=5A77A09F","Ashish Phogat","Developer","9521382950","aryanagarwal15@gmail.com","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg");
        AppItem appItem2 =new AppItem("Keshav Mittal","Developer", "9521382950","shanumittal147@gmail.com","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg","Rishab Kincha","Developer", "9521382950","shanumittal147@gmail.com","http://www.facebook.com","https://www.w3schools.com/css/trolltunga.jpg");
        appItems.add(appItem1);
        appItems.add(appItem2);
        adapter = new AppAdapter(appItems,getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
        return inf;
    }
}

