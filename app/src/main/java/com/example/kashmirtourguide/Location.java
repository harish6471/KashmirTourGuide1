package com.example.kashmirtourguide;


public class Location {

    private int mPlaceNameId;

    private int mPlaceAddressId;

    private int mImageResourceId;

    public Location(int placeNameId, int placeAddressId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mPlaceAddressId = placeAddressId;
        mImageResourceId = imageResourceId;
    }

    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    public int getPlaceAddressId() {
        return mPlaceAddressId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}