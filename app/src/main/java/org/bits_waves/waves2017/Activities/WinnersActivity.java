package org.bits_waves.waves2017.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.bits_waves.waves2017.Adapters.NewWinnerAdapter;
import org.bits_waves.waves2017.Adapters.RTDAdapter;
import org.bits_waves.waves2017.CheckNetwork;
import org.bits_waves.waves2017.ListItems.RTDItem;
import org.bits_waves.waves2017.ListItems.WinnerItem;
import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.RTDPuller;
import org.bits_waves.waves2017.Utils;
import org.bits_waves.waves2017.WinnerPuller;

import java.util.ArrayList;
import java.util.List;

public class WinnersActivity extends AppCompatActivity {
    public ImageButton backBut1;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<WinnerItem> listItems = new ArrayList<>();
    private DatabaseReference mDatabase;
    private FirebaseDatabase fData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_live);
        backBut1 = (ImageButton) findViewById(R.id.back_button);
        backBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WinnersActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.transition.up_to_down, R.transition.down_to_up);

            }
        });
        fData = Utils.getDatabase();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mDatabase = fData.getReference().child("Winner");
        mDatabase.keepSynced(true);
        adapter = new NewWinnerAdapter(listItems, getApplicationContext());

        recyclerView.setAdapter(adapter);

        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    WinnerPuller dataPuller = snapshot.getValue(WinnerPuller.class);
                    WinnerItem listItem = new WinnerItem(
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

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.transition.up_to_down, R.transition.down_to_up);
    }
}
