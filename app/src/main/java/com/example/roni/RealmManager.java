package com.example.roni;

import com.example.amit.*;
import io.realm.RealmResults;
import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.internal.Context;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import com.example.amit.Generator;

/**
 * Created by RoniBM on 27/04/2017.
 */

public class RealmManager {

    //add any object to database
    public void addModel(RealmObject object ){
        Realm realm = Realm.getDefaultInstance();
        realm.copyToRealm(object);
        realm.commitTransaction();
    }

    //get group by group name
    public Group getGroup(String groupName) {
        Realm realm = Realm.getDefaultInstance();
        return realm.where(Group.class).equalTo("groupName", groupName).findFirst();
    }

    //get event by id
    public Event getEvent(String id) {
        Realm realm = Realm.getDefaultInstance();
        return realm.where(Event.class).equalTo("ID", id).findFirst();
    }

    //get place by place name
    public Place getPlace(String name) {
        Realm realm = Realm.getDefaultInstance();
        return realm.where(Place.class).equalTo("placeName", name).findFirst();
    }

    //get user by user name
    public User getUser(String userName) {
        Realm realm = Realm.getDefaultInstance();
        return realm.where(User.class).equalTo("userName", userName).findFirst();
    }

    public void createDEMO(){
        for (int i=0; i<7; i++){
            Group g1 = new Group("My Army Friends");
            User u1 = new User("Amit", "053-1234567");
            User u2 = new User("Roni", "052-123456789");
            User u3 = new User("Sivan", "050-12345678");
            g1.users.add(u1);
            g1.users.add(u2);
            g1.users.add(u3);

            Group g2 = new Group("My American Friends");
            User u4 = new User("Bob", "053-1234567");
            User u5 = new User("John", "052-123456789");
            User u6 = new User("Bruce", "050-12345678");
            g2.users.add(u4);
            g2.users.add(u5);
            g2.users.add(u6);

            addModel(g1);
            addModel(g2);
        }
        Generator.generatePlace();

    }
}
