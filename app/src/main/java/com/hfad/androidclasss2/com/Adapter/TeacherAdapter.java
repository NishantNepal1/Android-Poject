package com.hfad.androidclasss2.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.hfad.androidclasss2.*;
import com.hfad.androidclasss2.com.model.Teacher;

import java.util.ArrayList;

public class TeacherAdapter extends ArrayAdapter<Teacher> {
    ArrayList<Teacher> spinner;
    Context context;

    public TeacherAdapter(Context context, int resource, ArrayList<Teacher> list) {
        super(context, resource, list);
        this.spinner = list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return spinner.size();
    }

    @Override
    public Teacher getItem(int position) {
        return spinner.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.teacher_list_view, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView faculty=(TextView) convertView.findViewById(R.id.faculty);
        TextView contace=(TextView) convertView.findViewById(R.id.contact);
        /*ImageView imageView=(ImageView) convertView.findViewById(R.id.image);*/
        Teacher spinner = getItem(position);
        name.setText(spinner.getName());
        faculty.setText(spinner.getFaculty());
        contace.setText(spinner.getContact());
        /*imageView.setImageDrawable(spinner.getImage());*/

        return convertView;
    }



}
