package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PasseiosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<Tour> passeios = new ArrayList<Tour>();

        passeios.add(new Tour("Parque Ibirapuera", getString(R.string.descIbira), R.drawable.ibirapuera));

        passeios.add(new Tour("MASP", getString(R.string.descMasp), R.drawable.masp));

        passeios.add(new Tour("Jardim Botânico", getString(R.string.descBotanico), R.drawable.jdbotanico));

        passeios.add(new Tour("Theatro Municipal", getString(R.string.descTheatro), R.drawable.theatro));

        TourAdapter tourAdapter = new TourAdapter(this, passeios, R.color.category_passeio);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(tourAdapter);
    }
}
