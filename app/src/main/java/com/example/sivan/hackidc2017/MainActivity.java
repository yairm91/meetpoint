package com.example.sivan.hackidc2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.R;
import com.example.amit.Group;
import com.example.amit.User;

import io.realm.RealmList;

public class MainActivity extends AppCompatActivity {

    Group[] existingGroups = new Group[3];
    String[] strings = new String[3];
    ImageView profilePicImageView;
    ImageView editImageView;
    ImageView settingsImageView;
    TextView meTextView;
    ListView listView;
    Button button;


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
        existingGroups[2] = new Group("more members", userRealmList2);

        strings[0] = "Army guys\n\nAmy, Dana, Amit, Liad";
        strings[1] = "BFF\n\nLiron";
        strings[2] = "EilatIDC 2017\n\nAlex, Adar, Ben, Gili, Noam, Yair";

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, strings);

        profilePicImageView = (ImageView) findViewById(R.id.my_profile_pic);
        editImageView = (ImageView) findViewById(R.id.edit_pic);
        meTextView = (TextView) findViewById(R.id.me_text);
        listView = (ListView) findViewById(R.id.group_list);
        settingsImageView = (ImageView) findViewById(R.id.settings_pic);
        button = (Button) findViewById(R.id.create_new_group_button);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity();
            }
        });

    }

    private void startActivity() {
        Intent intent = new Intent(this, SwipeActivity.class);
        startActivity(intent);
    }
}
