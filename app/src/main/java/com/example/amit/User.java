package com.example.amit;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;

/**
 * Created by amitgal on 4/27/17.
 */


public class User extends RealmObject {

    public String userName;
    public String phone;

    public double longitude;
    public double latitude;

    @LinkingObjects("users")
    public final RealmResults<Group> groups = null;
//    public RealmList<Event> events;

    public int userID;
    private static int counter = 0;

    public User(){
        this.userName = "";
        this.phone = "";
        this.latitude = 0;
        this.longitude =0;
//        this.events = null;
    }

    public User(String name, String phone){
        this.userName = name;
        this.userID = counter++;
        this.phone = phone;
        this.longitude = 0;
        this.latitude = 0;
//        this.events = new RealmList<Event>();
    }




}
