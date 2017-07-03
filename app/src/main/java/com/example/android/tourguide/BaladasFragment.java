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
public class BaladasFragment extends Fragment {


    public BaladasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> baladas = new ArrayList<Tour>();

        baladas.add(new Tour("A Lantera Bar", getString(R.string.descLaterna), R.drawable.laterna));

        baladas.add(new Tour("Bar Secreto", getString(R.string.descSecreto), R.drawable.barsecreto));

        baladas.add(new Tour("Over Night", getString(R.string.descOver), R.drawable.overnight));

        baladas.add(new Tour("La Fiesta", getString(R.string.descFiesta), R.drawable.lafiesta));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), baladas, R.color.category_balada);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
