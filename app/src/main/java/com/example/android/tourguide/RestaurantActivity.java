package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemAdapter);;

    }
}
