package com.exampleone.s.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1){
            return new ParksFragment();
        }
        else if (position == 2){
            return new RestaurantsFragment();
        }else {
            return new TemplesFragment();
        }
    }
    @Override
    public int getCount() {

        return 4;
    }
}
