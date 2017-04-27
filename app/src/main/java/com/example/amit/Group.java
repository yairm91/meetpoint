package com.example.amit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by amitgal on 4/27/17.
 */

public class Group extends RealmObject {

    public String groupName;
    public RealmList<User> users;
    public RealmList<Event> events;


    public Group(String groupName){
        this.groupName = groupName;
        this.users = new RealmList<>();
        this.events = new RealmList<>();
    }

    public Group(String groupName, RealmList<User> users){
        this.groupName = groupName;
        this.users = users;
        this.events = new RealmList<>();
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }
}
