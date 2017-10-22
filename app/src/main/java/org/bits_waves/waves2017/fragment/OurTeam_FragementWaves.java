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
        AppItem appItem1 =new AppItem("Rahul Bansal","Convener","9953241941","bansal@bits-waves.org","https://www.facebook.com/profile.php?id=100000147562780","https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/10968515_1012404305441145_6109278889630334073_n.jpg?oh=668b410c6adf3467b489a4a3a2c5aa9d&oe=5A6A5397","Yash Agarwal","Research Head","9967635466","yash@bits-waves.org","https://www.facebook.com/profile.php?id=100000577096347&ref=br_rs","https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/13934856_1404990996196790_1252702611336495014_n.jpg?oh=f06ed98f68e9a42ecfcb28c7501d2ffd&oe=5A816473");
        AppItem appItem2 =new AppItem("Aravind Venugopal","Operations Head", "9446024217","aravindv@bits-waves.org","https://www.facebook.com/profile.php?id=100001648202618","https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/10448758_755684154496518_7424487197453654128_n.jpg?oh=edeeb19b1e9c8ff41a653dd09db4b0f6&oe=5A72245A","Srivats Mohan","Events Head", "8976695524","srivats@bits-waves.org","https://www.facebook.com/srivats.mohan.37","https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/17523711_1145107858969047_2552814506952691943_n.jpg?oh=a71a7fab6beb080ed8ca4ed0cc6b73b9&oe=5A6A3860");
        AppItem appItem3 =new AppItem("Het Satra","Sponsorship Head", "9870382100","het@bits-waves.org","https://www.facebook.com/het.satra","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Fheth.jpeg?alt=media&token=e0425c16-f375-453e-97c7-7766c1d0eb22","Swapnil P. Kumar","Creative Head", "9986222942","swapnil@bits-waves.org","https://www.facebook.com/swapnilpkumar","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Fswapnil.jpeg?alt=media&token=69c4614b-e4cb-43b9-b82c-9945d2322ee8");
        AppItem appItem4 =new AppItem("Akash Pareek","Creative Head", "7507170767","akash@bits-waves.org","https://www.facebook.com/akash.pareek.9041","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Fakash.jpeg?alt=media&token=35d06883-4b84-4bc3-9a7c-dda8592661ee","Akshat Budania","", "7507167844","akshat@bits-waves.org","https://www.facebook.com/akshat.budania","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Fakshat.jpeg?alt=media&token=2143e649-86ec-4ee9-b3af-c951bfc6f960");
        AppItem appItem5 =new AppItem("Angad Singh","Media Head", "7743913668","angad@bits-waves.org","https://www.facebook.com/angad.singh.355","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Fangad.jpeg?alt=media&token=855d6af6-a4c9-4a30-91b8-6212f6c882cc","Shikhar Rastogi ","", "8130729375","shikhar@bits-waves.org","https://www.facebook.com/shikharras?ref=br_rs","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2FShikhar.jpeg?alt=media&token=6de064ca-35b0-4dda-b44a-15219be5592e");
        AppItem appItem6 =new AppItem("Aarsh Thakur ","Sponsorship Head", "7774034435","aarsh@bits-waves.org","https://www.facebook.com/aarsh.thakur","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Faarsh.jpeg?alt=media&token=c65ebcb8-528a-4e0a-bc63-60a30d32af97","Aditya Malhotra ","Backstage Head", "7696563700","aditya@bits-waves.org","https://www.facebook.com/aditya1996","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Faditya.jpeg?alt=media&token=772ef53b-47ac-4832-a286-679ba8a9bdb8");
        AppItem appItem7 =new AppItem("Kartik Kumar Saxena ","ProNites Head", "8447270128","kartik@bits-waves.org","https://www.facebook.com/simplykartik04","https://firebasestorage.googleapis.com/v0/b/waves-2017-97a39.appspot.com/o/our_team_images%2Fkartik.jpeg?alt=media&token=0ab815a3-dad1-4d67-a1ee-bbae451d9232","","", "","","http://www.facebook.com","https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjJ6dWW-ITXAhVLMY8KHV-4BlEQjRwIBw&url=https%3A%2F%2Fcommons.wikimedia.org%2Fwiki%2FFile%3AWhite_dot.svg&psig=AOvVaw3vuT_ObryCGmBrtbNRkpsv&ust=1508786043415142");

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

