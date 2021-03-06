package com.example.amit;

import io.realm.Realm;
import io.realm.RealmList;

/**
 * Created by amitgal on 4/28/17.
 */

public class Generator {

    public static RealmList<Place> generatePlace(){
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();

        RealmList<Place> places = new RealmList<Place>();
        Place p1 = new Place();
        p1.name = "Becky";
        p1.photoUrl = "http://www.itravelisrael.co.il/Userfiles/images/Businesses/12495/business12495_367231.jpg";
        Place p2 = new Place();
        p2.name = "Hamezeg";
        p2.photoUrl = "https://www.saf.co.il/sal/usr/prj_000_1333196872.jpg";
        Place p3 = new Place();
        p3.name = "Vitrina";
        p3.photoUrl = "http://i0.wp.com/hamesanenet.co.il/wp-content/uploads/2015/06/%D7%95%D7%99%D7%98%D7%A8%D7%99%D7%A0%D7%94-1.jpg";
        Place p4 = new Place();
        p4.name = "Hasilon";
        p4.photoUrl = "http://www.telavivcity.com/allsites/allpic/a/A1976/A1976Pic3645.jpg";
        Place p5 = new Place();
        p5.name = "Hahog hazfoni";
        p5.photoUrl = "http://img.mako.co.il/2015/06/25/MMkj20_x5.jpg";
        Place p6 = new Place();
        p6.name = "Shuflend";
        p6.photoUrl = "http://img1.tapuz.co.il/TapuzAlbums/cityrat/3dbba6aa-c1c0-494a-b536-313f74ada297.jpg";

        Place place1 = realm.copyToRealm(p1);
        Place place2 = realm.copyToRealm(p2);
        Place place3 = realm.copyToRealm(p3);
        Place place4 = realm.copyToRealm(p4);
        Place place5 = realm.copyToRealm(p5);
        Place place6 = realm.copyToRealm(p6);

        places.add(place1);
        places.add(place2);
        places.add(place3);
        places.add(place4);
        places.add(place5);
        places.add(place6);

        realm.commitTransaction();

        return places;
    }



}
