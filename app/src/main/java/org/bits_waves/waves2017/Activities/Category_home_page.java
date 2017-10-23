package org.bits_waves.waves2017.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.bits_waves.waves2017.R;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;


public class Category_home_page extends AppCompatActivity{

    ImageView dance, music, drama, specials, literary, quiz, workshop, design;
    Intent it;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_home_page);

        back= (ImageButton) findViewById(R.id.categories_back);

        drama = (ImageView) findViewById(R.id.categories_drama);
        dance = (ImageView) findViewById(R.id.categories_dance);
        specials = (ImageView) findViewById(R.id.categories_specials);
        music = (ImageView) findViewById(R.id.categories_music);
        literary = (ImageView) findViewById(R.id.categories_literary);
        quiz = (ImageView) findViewById(R.id.categories_quiz);
        workshop = (ImageView) findViewById(R.id.categories_workshop);
        design = (ImageView) findViewById(R.id.categories_design);


        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/artathon.jpg").fit().into(workshop);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/culturalgauntlet.JPG").fit().into(quiz);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/portraiture.JPG").fit().into(design);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/natyanjali.JPG").fit().into(dance);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/rangmanch.jpg").fit().into(drama);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/mr_waves.jpg").fit().into(specials);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/searock.JPG").fit().into(music);
        Picasso.with(this).load("http://bits-waves.org/static/main/images1/events/Contention.JPG").fit().into(literary);



        drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Drama");
                startActivity(it);
            }
        });
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Dance");
                startActivity(it);
            }
        });
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Design");
                startActivity(it);
            }
        });
        specials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Specials");
                startActivity(it);
            }
        });
        literary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Literary");
                startActivity(it);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Quiz");
                startActivity(it);
            }
        });
        workshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Workshop");
                startActivity(it);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), Category.class);
                it.putExtra("category_heading", "Music");
                startActivity(it);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(getApplicationContext(), MainActivity.class);
                it.putExtra("category_heading", "Music");
                startActivity(it);
            }
        });

    }


}