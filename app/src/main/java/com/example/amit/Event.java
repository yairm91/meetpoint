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
    public double meddleLatitude;
    public Place meetPoint;
    public RealmList<Place> places;


    public Event(Group group){
        this.group = group;
        this.meetPoint = getmeetPoint();

    }

    public Place getmeetPoint() {
        return meetPoint;
    }
}
