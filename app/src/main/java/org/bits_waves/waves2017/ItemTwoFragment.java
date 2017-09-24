package org.bits_waves.waves2017;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ItemTwoFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<RTDItem> listItems = new ArrayList<>();
    private DatabaseReference mDatabase;
    private FirebaseDatabase fData;
    private View myFragmentView;
    private String imgURL;
    private int bitIMG;
    public static ItemTwoFragment newInstance() {
        ItemTwoFragment fragment = new ItemTwoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(CheckNetwork.isInternetAvailable(getActivity().getApplicationContext())) //returns true if internet available
        {

            //do something. loadwebview.
        }
        else
        {
            Toast.makeText(getActivity().getApplicationContext(),"No Internet Connection",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView=inflater.inflate(R.layout.fragment_item_two, container, false);
        fData = Utils.getDatabase();
        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recycle3);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mDatabase = fData.getReference().child("rtd");
        mDatabase.keepSynced(true);
        adapter = new RTDAdapter(listItems,getActivity().getApplicationContext());

        recyclerView.setAdapter(adapter);

//        for (int i = 0; i <= 10; i++) {
//            RTDItem listItem = new RTDItem("Heading " + (i+1),
//                    "Hello","https://www.w3schools.com/css/trolltunga.jpg"
//            );
//
//            listItems.add(listItem);
//        }

        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    RTDPuller dataPuller = snapshot.getValue(RTDPuller.class);
                    RTDItem listItem =new RTDItem(
                            dataPuller.getNewshead(), dataPuller.getNewsdesc()
                    );
                    listItems.add(listItem);
                    Log.d( "Name", dataPuller.getNewshead());
                    Log.d( "Mobile", dataPuller.getNewsdesc());
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }

        });


        return myFragmentView;
    }
}
