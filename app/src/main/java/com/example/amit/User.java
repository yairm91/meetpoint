package com.example.amit;

import io.realm.RealmList;
import io.realm.RealmObject;
import java.lang.Integer;

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

    public int userID;
    private static int counter = 0;

    public User(){
        this.userName = "";
        this.phone = "";
        this.latitude = 0;
        this.longitude =0;
        this.groups = null;
        this.events = null;
    }

    public User(String name, String phone){
        this.userName = name;
        this.userID = counter++;
        this.phone = phone;
        this.longitude = 0;
        this.latitude = 0;
        this.groups = new RealmList<Group>();
        this.events = new RealmList<Event>();
    }




}
