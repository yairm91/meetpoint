package com.example.roni;

import android.app.Application;

import com.example.amit.User;

import io.realm.Realm;

/**
 * Created by Dar on 27/04/2017.
 */

public class MeetPointApplication extends Application {

    RealmManager realm;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

        realm = new RealmManager();
        realm.createDEMO();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
