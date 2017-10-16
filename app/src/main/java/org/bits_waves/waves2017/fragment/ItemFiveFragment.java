package org.bits_waves.waves2017.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.bits_waves.waves2017.Adapters.NewWinnerAdapter;
import org.bits_waves.waves2017.CheckNetwork;
import org.bits_waves.waves2017.ListItems.WinnerItem;
import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.Utils;
import org.bits_waves.waves2017.WinnerPuller;

import java.util.ArrayList;
import java.util.List;

public class ItemFiveFragment extends Fragment {
    private View myFragmentView;
    public ImageButton backBut1;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<WinnerItem> listItems;
    private FirebaseDatabase fData;
    private DatabaseReference mDatabase;

    public static ItemFiveFragment newInstance() {
        ItemFiveFragment fragment = new ItemFiveFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myFragmentView=inflater.inflate(R.layout.fragment_item_five, container, false);
        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recycle5);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        listItems = new ArrayList<>();
        fData = Utils.getDatabase();
        mDatabase = fData.getReference().child("Winner");
        adapter = new NewWinnerAdapter(listItems,getActivity().getApplicationContext());
        mDatabase.keepSynced(true);
        recyclerView.setAdapter(adapter);
        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    WinnerPuller dataPuller = snapshot.getValue(WinnerPuller.class);
                    WinnerItem listItem =new WinnerItem(
                            dataPuller.getEvent_Name(), dataPuller.getWinner_Name(), dataPuller.getWinner_2(), dataPuller.getWinner_3()
                    );
                    listItems.add(listItem);
                    Log.d( "Winner_Name", dataPuller.getWinner_Name());
                    Log.d( "Event_Name", dataPuller.getEvent_Name());
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }

        });
        if(CheckNetwork.isInternetAvailable(getActivity().getApplicationContext())) //returns true if internet available
        {

            //do something. loadwebview.
        }
        else
        {
            Toast.makeText(getActivity().getApplicationContext(),"No Internet Connection",Toast.LENGTH_LONG).show();
        }

        return myFragmentView;
    }
}
