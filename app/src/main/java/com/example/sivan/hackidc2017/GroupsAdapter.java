//package com.example.sivan.hackidc2017;
//
//import android.graphics.Typeface;
//import android.util.TypedValue;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import com.example.amit.Group;
//import com.example.amit.User;
//
//import java.util.List;
//
//import io.realm.RealmList;
//import io.realm.internal.Context;
//
///**
// * Created by Sivan on 28-Apr-17.
// */
//
//public class GroupsAdapter extends ArrayAdapter<Group> {
//    int resource;
//    String response;
//    Context context;
//
//    public GroupsAdapter(Context context, int resource, RealmList<Group> items) {
//        super(context, resource, items);
//        this.resource=resource;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent)
//    {
//        LinearLayout contactsView;
//        Group groups = getItem(position);
//        if(convertView==null) {
//            contactsView = new LinearLayout(getContext());
//            String inflater = Context.LAYOUT_INFLATER_SERVICE;
//            LayoutInflater vi;
//            vi = (LayoutInflater)getContext().getSystemService(inflater);
//            vi.inflate(resource, contactsView, true);
//        } else {
//            contactsView = (LinearLayout) convertView;
//        }
//        TextView contactName =(TextView)contactsView.findViewById(R.id.contactName);
//        contactName.setTypeface(null, Typeface.BOLD);
//        contactName.setTextSize(TypedValue.COMPLEX_UNIT_PX,18);
//        TextView contactPhone = (TextView)contactsView.findViewById(R.id.contactPhone);
//        contactPhone.setTextSize(TypedValue.COMPLEX_UNIT_PX,14);
//        contactName.setText(contact.getName());
//        contactPhone.setText(contact.getPhone());
//        return contactsView;
//    }
//}
