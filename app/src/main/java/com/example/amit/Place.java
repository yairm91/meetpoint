package com.example.amit;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by amitgal on 4/27/17.
 */

public class Place extends RealmObject {

    public double longitude;
    public double latitude;
    public String photoUrl;
    public RealmList<User> likes;
    public RealmList<User> disLikes;

    public Place(){
        this.longitude = 0;
        this.latitude = 0;
        this.photoUrl = "";
    }




}
