package com.example.android.tourguide;

/**
 * Created by ifgan on 01/07/2017.
 */

public class Tour {

    private String mPlaceName;

    private String mDescPlace;

    private int mImageResourceId;

    public Tour (String placeName, String descPlace)
    {
        mPlaceName = placeName;
        mDescPlace = descPlace;
    }

    public Tour (String placeName, String descPlace, Integer imageResourceId)
    {
        mPlaceName = placeName;
        mDescPlace = descPlace;
        mImageResourceId = imageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }


    public String getDescPlace() {
        return mDescPlace;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
}
