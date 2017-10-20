package org.bits_waves.waves2017.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.bits_waves.waves2017.ListItems.WinnerItem;
import org.bits_waves.waves2017.R;

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
                Intent intent = new Intent(RegActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.transition.enter, R.transition.exit);
    }
}
