package com.example.amit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitgal on 4/27/17.
 */

public class Group {

    public String groupName;
    public ArrayList<User> users;
    public ArrayList<Event> events;


    public Group(String groupName){
        this.groupName = groupName;
        this.users = new ArrayList<User>();
        this.events = new ArrayList<Event>();
    }

    public Group(String groupName, ArrayList<User> users){
        this.groupName = groupName;
        this.users = users;
        this.events = new ArrayList<Event>();
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }
}
