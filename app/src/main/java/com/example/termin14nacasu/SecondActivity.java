package com.example.termin14nacasu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //int extra jer smo setovali int, -1 je stavljeno da nam baci exception
        int id = getIntent().getIntExtra("id", -1);
        Fruit voce = null;
        for (Fruit f : Fruit.fruits)
            if (f.getId() == id)
                voce = f;
        TextView twname = findViewById(R.id.textViewname);
        twname.setText(voce.getName());
        TextView twdescription = findViewById(R.id.textViewdescription);
        twdescription.setText(voce.getDescription());
        try {
            InputStream is = getAssets().open(voce.getImageFilename());
            //Formiranje slike tipa drawable
            Drawable drawable = Drawable.createFromStream(is, "");
            ImageView iv = findViewById(R.id.imageView);
            iv.setImageDrawable(drawable);
        } catch (Exception e) {
            Toast.makeText(this, "Ne postoji izabran fajl", Toast.LENGTH_SHORT).show();
        }
        RatingBar rb = findViewById(R.id.ratingBar);
        rb.setRating(voce.getRating());

    }
}