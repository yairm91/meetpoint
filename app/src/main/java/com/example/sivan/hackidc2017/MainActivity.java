package com.example.sivan.hackidc2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.amit.*;

public class MainActivity extends AppCompatActivity {

    Group[] existingGroups = new Group[3];
    existingGroups[0] = new Group("no members", {new User("amit", "013")});

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<Group>(this, R.layout.activity_listview, existingGroups);


        ListView listView = (ListView) findViewById(R.id.group_list);
        listView.setAdapter(adapter);
    }
}
