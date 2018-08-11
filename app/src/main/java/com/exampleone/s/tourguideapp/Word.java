package com.exampleone.s.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Word {
    private int TourPlaceName;
    private int Address;
    private int sImageResource;;
    public Word(int tourplaceName, int address,int ImageResource) {
        TourPlaceName = tourplaceName;
        Address = address;
        sImageResource=ImageResource;
    }
    /**
     * Get the TourPlaceName of the word.
     */
    public int getTourPlaceName() {
        return TourPlaceName;
    }
    /**
     * Get the Address of the word.
     */    public int getAddress() {
        return Address;
    }
    public int getsImageResource() {
        return sImageResource;
    }
}
