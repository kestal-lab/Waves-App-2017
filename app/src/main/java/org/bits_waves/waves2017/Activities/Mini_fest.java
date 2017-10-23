package org.bits_waves.waves2017.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.bits_waves.waves2017.R;

public class Mini_fest extends AppCompatActivity implements View.OnClickListener {

    public ImageView beau_vista, florence, specials, carpedictum;
    Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_fest);

        beau_vista = (ImageView) findViewById(R.id.beau_vista);
        florence = (ImageView) findViewById(R.id.florence);
        carpedictum = (ImageView) findViewById(R.id.carpedictum);
        specials= (ImageView) findViewById(R.id.specials_minifest);



        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/rangmanch.jpg").fit().into(florence);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/mr_waves.jpg").fit().into(specials);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/artathon.jpg").fit().into(beau_vista);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG").fit().into(carpedictum);


        beau_vista.setOnClickListener(this);
        florence.setOnClickListener(this);
        carpedictum.setOnClickListener(this);
        specials.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.beau_vista:
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "BeauVista");
                break;
            case R.id.carpedictum:
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Carpedictum");
                break;
            case R.id.florence:
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Florence");
                break;
            case R.id.specials_minifest:
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Specials");
                break;
        }

        startActivity(it);
    }

}