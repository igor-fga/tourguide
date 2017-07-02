package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BaladasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        //Create an array of restaurants

        ArrayList<Tour> baladas = new ArrayList<Tour>();

        baladas.add(new Tour("A Lantera Bar", getString(R.string.descLaterna), R.drawable.laterna));

        baladas.add(new Tour("Bar Secreto", getString(R.string.descSecreto), R.drawable.barsecreto));

        baladas.add(new Tour("Over Night", getString(R.string.descOver), R.drawable.overnight));

        baladas.add(new Tour("La Fiesta", getString(R.string.descFiesta), R.drawable.lafiesta));

        TourAdapter tourAdapter = new TourAdapter(this, baladas, R.color.category_balada);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(tourAdapter);
    }
}
