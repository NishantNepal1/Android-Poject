package com.hfad.androidclasss2.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.hfad.androidclasss2.*;
import com.hfad.androidclasss2.com.model.Role;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Role> {
    ArrayList<Role> spinner;
    Context context;
    public CustomAdapter(Context context, int resource, ArrayList<Role> list){
        super(context, resource, list);
        this.spinner=list;
        this.context=context;

    }

    @Override
    public int getCount() {
        return spinner.size();
    }

    @Override
    public Role getItem(int position) {
        return spinner.get(position);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false);
        TextView splist= (TextView) convertView.findViewById(R.id.text11);
        Role spinner=getItem(position);
        splist.setText(spinner.gettext11());

        return convertView;
    }



    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false);
        TextView splist= (TextView) convertView.findViewById(R.id.text11);

        Role spinner=getItem(position);
        splist.setText(spinner.gettext11());

        return convertView;}





}

