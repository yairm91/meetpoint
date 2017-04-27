package com.example.amit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by amitgal on 4/27/17.
 */

public class Event extends RealmObject {

    public Group group;
    public double middleLongtitude;
    public double middleLatitude;
    public Place meetPoint;
    public RealmList<Place> places;
    public double radius;

    public static int counter = 0;
    public int ID;


    public Event() {
        this.group = null;
        this.middleLongtitude = 0;
        this.middleLatitude = 0;
        this.meetPoint = null;
        this.places = null;
        this.radius = 0;
        this.ID = counter++;
    }
    public Event(Group group){
        this.group = group;
        this.middleLongtitude = findMiddleLongtitude();
        this.middleLatitude = findMiddleLatitude();
        this.radius = findRadius();
        this.ID = counter++;
    }


    private double findMiddleLatitude() {
        double ans = 0;
        for(User u : group.users){
            ans += u.latitude;
        }
        ans /= group.users.size();
        return ans;
    }


    private double findMiddleLongtitude() {
        double ans = 0;
        for(User u : group.users){
            ans += u.longitude;
        }
        ans /= group.users.size();
        return ans;
    }


    public double findRadius(){
        double radius = Integer.MIN_VALUE;
        for(User u : group.users){
            if (radius < computeDistance(u)) {
                radius = computeDistance(u);
            }
        }
        return radius;
    }


    private double computeDistance(User u){
        return Math.sqrt((Math.pow(u.latitude - middleLatitude, 2))
                + Math.pow(u.longitude - middleLongtitude, 2));
    }



}
