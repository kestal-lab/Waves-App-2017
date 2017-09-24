package org.bits_waves.waves2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

import java.util.ArrayList;
import java.util.List;

public class RegActivity extends AppCompatActivity {
    public ImageButton backBut1;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<WinnerItem> listItems;
    private FirebaseDatabase fData;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        backBut1 = (ImageButton) findViewById(R.id.backit1);
        backBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegActivity.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);

            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycle5);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();
        fData = Utils.getDatabase();
        mDatabase = fData.getReference().child("Winner");
        adapter = new NewWinnerAdapter(listItems,this);
        mDatabase.keepSynced(true);
        recyclerView.setAdapter(adapter);
        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    WinnerPuller dataPuller = snapshot.getValue(WinnerPuller.class);
                    WinnerItem listItem =new WinnerItem(
                            dataPuller.getWinner_Name(), dataPuller.getEvent_Name()
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
        if(CheckNetwork.isInternetAvailable(getApplicationContext())) //returns true if internet available
        {

            //do something. loadwebview.
        }
        else
        {
            Toast.makeText(getApplicationContext(),"No Internet Connection",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.transition.enter, R.transition.exit);
    }
}
