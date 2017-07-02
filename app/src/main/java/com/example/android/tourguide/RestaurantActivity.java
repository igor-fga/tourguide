package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        //Create an array of restaurants

        ArrayList<Tour> restaurants = new ArrayList<Tour>();

        restaurants.add(new Tour("D.O.M.", getString(R.string.descDOM), R.drawable.dom));

        restaurants.add(new Tour("FASANO", getString(R.string.desFasano), R.drawable.fasano));

        restaurants.add(new Tour("MOCOTÓ", getString(R.string.descMocoto), R.drawable.mocoto));

        restaurants.add(new Tour("MANÍ", getString(R.string.descMani), R.drawable.mani));

        TourAdapter tourAdapter = new TourAdapter(this, restaurants, R.color.category_restaurant);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(tourAdapter);

    }
}
