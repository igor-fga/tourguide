package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //Create an array of restaurants

        ArrayList<String> restaurants = new ArrayList<String>();

        restaurants.add("Jordão");
        restaurants.add("Alemão");
        restaurants.add("Madeiro");
        restaurants.add("Fly");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        TextView restView = new TextView(this);
        restView.setText(restaurants.get(0));
        rootView.addView(restView);

        TextView restView2 = new TextView(this);
        restView2.setText(restaurants.get(1));
        rootView.addView(restView2);

    }
}
