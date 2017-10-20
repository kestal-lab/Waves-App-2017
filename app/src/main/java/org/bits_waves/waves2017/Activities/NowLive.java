package org.bits_waves.waves2017.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.bits_waves.waves2017.Adapters.RTDAdapter;
import org.bits_waves.waves2017.ListItems.RTDItem;
import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.RTDPuller;
import org.bits_waves.waves2017.Utils;

import java.util.ArrayList;
import java.util.List;

public class NowLive extends AppCompatActivity {
    public ImageButton backBut1;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<RTDItem> listItems = new ArrayList<>();
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
                Intent intent = new Intent(NowLive.this, MainActivity.class);
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
        mDatabase = fData.getReference().child("rtd");
        mDatabase.keepSynced(true);
        adapter = new RTDAdapter(listItems, getApplicationContext());

        recyclerView.setAdapter(adapter);

        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    RTDPuller dataPuller = snapshot.getValue(RTDPuller.class);
                    RTDItem listItem = new RTDItem(
                            dataPuller.getNewshead(), dataPuller.getNewsdesc()
                    );
                    listItems.add(listItem);
                    Log.d("Name", dataPuller.getNewshead());
                    Log.d("Mobile", dataPuller.getNewsdesc());
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
