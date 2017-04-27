package com.example.amit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitgal on 4/27/17.
 */

public class User {

    public String userName;
    public String phone;
    public double longitude;
    public double latitude;
    public ArrayList<Group> groups;
    public ArrayList<Event> events;

    public User(String name, String phone){
        this.userName = name;
        this.phone = phone;
        this.longitude = 0;
        this.latitude = 0;
        this.groups = new ArrayList<Group>();
        this.events = new ArrayList<Event>();
    }



}
