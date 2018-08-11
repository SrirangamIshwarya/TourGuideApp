package com.exampleone.s.tourguideapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TextView museum = (TextView) findViewById(R.id.museums);
// Set a click listener on that View
        museum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Rahman View is clicked on.
            @Override
            public void onClick(View view) {
                Intent museumIntent = new Intent(MainActivity.this, Museums.class);
                startActivity(museumIntent);
            }
        });
        TextView park = (TextView) findViewById(R.id.parks);
// Set a click listener on that View
        park.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Arijit View is clicked on.
            @Override
            public void onClick(View view) {
                Intent parkIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parkIntent);
            }
        });
        TextView restaurant = (TextView) findViewById(R.id.restaurants);
// Set a click listener on that View
        restaurant.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Shreya View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantIntent);
            }
        });
        TextView temple = (TextView) findViewById(R.id.temples);
// Set a click listener on that View
        temple.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Neha View is clicked on.
            @Override
            public void onClick(View view) {
                Intent templeIntent = new Intent(MainActivity.this, Temples.class);
                startActivity(templeIntent);
            }
        });
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.name));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.name1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.name2));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.name3));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
