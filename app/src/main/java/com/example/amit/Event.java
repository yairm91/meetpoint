package com.example.amit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitgal on 4/27/17.
 */

public class Event {

    public Group group;
    public double middleLongtitude;
    public double meddleLatitude;
    public Place meetPoint;
    public ArrayList<Place> places;


    public Event(Group group){
        this.group = group;
        this.meetPoint = getmeetPoint();
        this.places =

    }

    public Place getmeetPoint() {
        return meetPoint;
    }
}
