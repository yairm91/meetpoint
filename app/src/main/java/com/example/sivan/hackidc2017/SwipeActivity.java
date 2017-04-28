package com.example.sivan.hackidc2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

/**
 * Created by Sivan on 28-Apr-17.
 */

public class SwipeActivity extends AppCompatActivity {
    SwipeFlingAdapterView flingContainer;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosing_layout);

        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.swipe_FlingLayout);

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.swipe_cards_atributes, al);

//        mBtGoBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                finish();
//            }
//        });
    }
}
