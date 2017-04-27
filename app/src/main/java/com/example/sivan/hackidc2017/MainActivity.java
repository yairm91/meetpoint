package com.example.sivan.hackidc2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.amit.Group;
import com.example.amit.User;

import io.realm.RealmList;

public class MainActivity extends AppCompatActivity {

    Group[] existingGroups = new Group[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RealmList<User> userRealmList1 = new RealmList<User>();
        userRealmList1.add(new User("Amit", "091-4017401"));
        userRealmList1.add(new User("Roni", "035-1589174"));

        RealmList<User> userRealmList2 = new RealmList<User>();
        userRealmList2.add(new User("Yair", "065-14590303"));
        userRealmList2.add(new User("Dar", "031-01758233"));
        userRealmList2.add(new User("Sivan", "088-98665467"));

        existingGroups[0] = new Group("no members");
        existingGroups[1] = new Group("some members", userRealmList1);
        existingGroups[2] = new Group("no members", userRealmList2);

        ArrayAdapter adapter = new ArrayAdapter<Group>(this, R.layout.activity_listview, existingGroups);


        ListView listView = (ListView) findViewById(R.id.group_list);
        listView.setAdapter(adapter);
    }
}
