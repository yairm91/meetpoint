package com.example.amit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitgal on 4/27/17.
 */

public class User {

    public String name;
    public String phone;
    public double longitude;
    public double latitude;
    public List<Group> groups;
    public List<Event> events;

    public User(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.longitude = 0;
        this.latitude = 0;
        this.groups = new ArrayList<Group>();
        this.events = new ArrayList<Event>();
    }


}
