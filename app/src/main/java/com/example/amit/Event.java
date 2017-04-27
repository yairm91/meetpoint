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


    public Event(Group group){
        this.group = group;
        this.middleLongtitude = findMiddleLongtitude();
        this.middleLatitude = findMiddleLatitude();
        this.radius = findRadius();
    }


    private double findMiddleLatitude() {
        double ans = 0;
        for(Place p : places){
            ans += p.latitude;
        }
        ans /= places.size();
        return ans;
    }


    private double findMiddleLongtitude() {
        double ans = 0;
        for(Place p : places){
            ans += p.longitude;
        }
        ans /= places.size();
        return ans;
    }


    public double findRadius(){
        double radius = Integer.MIN_VALUE;
        for(Place p : places){
            if (radius < computeDistance(p)) {
                radius = computeDistance(p);
            }
        }
        return radius;
    }


    private double computeDistance(Place p){
        return Math.sqrt((Math.pow(p.latitude - middleLatitude, 2))
                + Math.pow(p.longitude - middleLongtitude, 2));
    }



}
