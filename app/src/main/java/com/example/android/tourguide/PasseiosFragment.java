package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PasseiosFragment extends Fragment {


    public PasseiosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> passeios = new ArrayList<Tour>();

        passeios.add(new Tour("Parque Ibirapuera", getString(R.string.descIbira), R.drawable.ibirapuera));

        passeios.add(new Tour("MASP", getString(R.string.descMasp), R.drawable.masp));

        passeios.add(new Tour("Jardim Botânico", getString(R.string.descBotanico), R.drawable.jdbotanico));

        passeios.add(new Tour("Theatro Municipal", getString(R.string.descTheatro), R.drawable.theatro));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), passeios, R.color.category_passeio);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
