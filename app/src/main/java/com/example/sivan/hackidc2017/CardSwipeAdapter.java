package com.example.sivan.hackidc2017;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.R;
import com.example.amit.Place;

import io.realm.RealmResults;

/**
 * Created by Sivan on 28-Apr-17.
 */

public class CardSwipeAdapter extends BaseAdapter {

    int resource;
    Context context;
    RealmResults<Place> places;

    public CardSwipeAdapter(Context context, int resource, RealmResults<Place> places) {
        super();
        this.resource=resource;
        this.context = context;
        this.places = places;
    }

    @Override
    public int getCount() {
        return places.size();
    }

    @Override
    public Object getItem(int position) {
        return places.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Place place = places.get(position);
        View view = LayoutInflater.from(context).inflate(R.layout.swipe_cards_atributes, parent, false);
        TextView nameOfPlace =(TextView) view.findViewById(R.id.placeName);
        TextView descOfPlace = (TextView) view.findViewById(R.id.placeDescription);

        nameOfPlace.setTypeface(null, Typeface.BOLD);
        nameOfPlace.setTextSize(TypedValue.COMPLEX_UNIT_PX,18);
        descOfPlace.setTextSize(TypedValue.COMPLEX_UNIT_PX,14);

        nameOfPlace.setText(place.name);
        descOfPlace.setText(place.numberOfLikes + " likes");
        view.setBackgroundColor(Color.MAGENTA);
        return view;
    }
}
