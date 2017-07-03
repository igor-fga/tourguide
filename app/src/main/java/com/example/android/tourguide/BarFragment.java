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
public class BarFragment extends Fragment {


    public BarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> bares = new ArrayList<Tour>();

        bares.add(new Tour("Quitandinha", getString(R.string.descQuitandinha), R.drawable.quitandinha));

        bares.add(new Tour("Astor", getString(R.string.descAstor), R.drawable.astor));

        bares.add(new Tour("Salve Jorge", getString(R.string.descSalve), R.drawable.save));

        bares.add(new Tour("Boteco São Bento", getString(R.string.descBento), R.drawable.botecosbento));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), bares, R.color.category_bar);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
