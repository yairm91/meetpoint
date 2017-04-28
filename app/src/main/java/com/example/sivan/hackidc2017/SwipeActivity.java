package com.example.sivan.hackidc2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.R;
import com.example.amit.Place;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Sivan on 28-Apr-17.
 */

public class SwipeActivity extends AppCompatActivity {
    SwipeFlingAdapterView flingContainer;
    CardSwipeAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosing_layout);

        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.swipe_FlingLayout);

        Realm realm = Realm.getDefaultInstance();
        RealmResults<Place> places = realm.where(Place.class).findAll();

        arrayAdapter = new CardSwipeAdapter(this, R.layout.swipe_cards_atributes, places);

        flingContainer.setAdapter(arrayAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {

            }

            @Override
            public void onLeftCardExit(Object o) {

            }

            @Override
            public void onRightCardExit(Object o) {

            }

            @Override
            public void onAdapterAboutToEmpty(int i) {

            }

            @Override
            public void onScroll(float v) {

            }
        });
    }
}
