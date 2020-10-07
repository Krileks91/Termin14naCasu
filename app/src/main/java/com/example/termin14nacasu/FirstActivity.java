package com.example.termin14nacasu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //Pravimo for petlju Fruit
        for(final Fruit fruit : Fruit.fruits) {
            //Instanca je this jer ga ova klasa pravi i instancira
            Button dugme = new Button(this);
            //Postavljamo ime koje ce biti ispisano na dugmetu
            dugme.setText(fruit.getName());
            //
            dugme.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Intent i  = new Intent(FirstActivity.this, SecondActivity.class);
                        i.putExtra("id", fruit.getId());
                        startActivity(i);
                }
            });
            //Metoda prihvata instancu linearlayout
            LinearLayout ll = findViewById(R.id.linearLayout);
            ll.addView(dugme);
        }
    }
}