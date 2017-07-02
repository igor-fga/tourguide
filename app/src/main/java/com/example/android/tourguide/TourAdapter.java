package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ifgan on 01/07/2017.
 */

public class TourAdapter extends ArrayAdapter<Tour> {

    private int mColorResourceId;

    public TourAdapter(Context context, ArrayList<Tour> tour, int colorResourceId)
    {
        super(context, 0, tour);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentTour = getItem(position);

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_name_text_view);

        placeTextView.setText(currentTour.getPlaceName());


        TextView descTextView = (TextView) listItemView.findViewById(R.id.desc_place_textview);

        descTextView.setText(currentTour.getDescPlace());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentTour.getmImageResourceId());

        View container = listItemView.findViewById(R.id.container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        container.setBackgroundColor(color);



        return listItemView;

    }
}
