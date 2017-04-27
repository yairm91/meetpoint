package com.example.amit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by amitgal on 4/27/17.
 */

public class User extends RealmObject {

    public String userName;
    public String phone;
    public double longitude;
    public double latitude;
    public RealmList<Group> groups;
    public RealmList<Event> events;

    public User(String name, String phone){
        this.userName = name;
        this.phone = phone;
        this.longitude = 0;
        this.latitude = 0;
        this.groups = new RealmList<>();
        this.events = new RealmList<>();
    }



}
