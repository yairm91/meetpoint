package com.example.roni;

import com.example.amit.Event;
import com.example.amit.Generator;
import com.example.amit.Group;
import com.example.amit.Place;
import com.example.amit.User;

import io.realm.Realm;
import io.realm.RealmObject;

/**
 * Created by RoniBM on 27/04/2017.
 */

public class RealmManager {

    //add any object to database
    public void addModel(RealmObject object ){
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
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

            Realm realm = Realm.getDefaultInstance();
            realm.beginTransaction();
        Group g1 = new Group("My Army Friends");
        Group g2 = new Group("My American Friends");

            User u1 = new User("Amit", "053-1234567");
            User u2 = new User("Roni", "052-123456789");
            User u3 = new User("Sivan", "050-12345678");
            User u4 = new User("Bob", "053-1234567");
            User u5 = new User("John", "052-123456789");
            User u6 = new User("Bruce", "050-12345678");

            User user1 = realm.copyToRealm(u1);
            User user2 = realm.copyToRealm(u2);
            User user3 = realm.copyToRealm(u3);
            User user4 = realm.copyToRealm(u4);
            User user5 = realm.copyToRealm(u5);
            User user6 = realm.copyToRealm(u6);

            Group group1 = realm.createObject(Group.class);
            Group group2 = realm.createObject(Group.class);

            group1.groupName = "My Army Friends";
            group2.groupName = "My American Friends";

            group1.users.add(user1);
            group1.users.add(user2);
            group1.users.add(user3);

            realm.commitTransaction();

        Generator.generatePlace();
    }
}
