package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<Tour> bares = new ArrayList<Tour>();

        bares.add(new Tour("Quitandinha", getString(R.string.descQuitandinha), R.drawable.quitandinha));

        bares.add(new Tour("Astor", getString(R.string.descAstor), R.drawable.astor));

        bares.add(new Tour("Salve Jorge", getString(R.string.descSalve), R.drawable.save));

        bares.add(new Tour("Boteco São Bento", getString(R.string.descBento), R.drawable.botecosbento));

        TourAdapter tourAdapter = new TourAdapter(this, bares, R.color.category_bar);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(tourAdapter);

    }
}
