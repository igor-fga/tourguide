package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView restaurantes = (TextView)findViewById(R.id.restaurantes);

        restaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(i);
            }
        });

        TextView bares = (TextView)findViewById(R.id.bares);

        bares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BarActivity.class);
                startActivity(i);
            }
        });

        TextView baladas = (TextView)findViewById(R.id.baladas);

        baladas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BaladasActivity.class);
                startActivity(i);
            }
        });

        TextView passeios = (TextView)findViewById(R.id.passeios);

        passeios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PasseiosActivity.class);
                startActivity(i);
            }
        });
    }
}
