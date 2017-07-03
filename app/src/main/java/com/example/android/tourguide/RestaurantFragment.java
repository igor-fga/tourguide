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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> restaurants = new ArrayList<Tour>();

        restaurants.add(new Tour("D.O.M.", getString(R.string.descDOM), R.drawable.dom));

        restaurants.add(new Tour("FASANO", getString(R.string.desFasano), R.drawable.fasano));

        restaurants.add(new Tour("MOCOTÓ", getString(R.string.descMocoto), R.drawable.mocoto));

        restaurants.add(new Tour("MANÍ", getString(R.string.descMani), R.drawable.mani));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), restaurants, R.color.category_restaurant);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
