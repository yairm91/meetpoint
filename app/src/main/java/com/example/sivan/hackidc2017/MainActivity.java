package com.example.sivan.hackidc2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Group[] exsistingGroups;
    String[] test = {"1", "2", "3", "4", "5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, exsistingGroups);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, test);


        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);;
    }
}
