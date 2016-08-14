package com.hfad.androidclasss2.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hfad.androidclasss2.R;
import com.hfad.androidclasss2.com.model.Course;

import java.util.ArrayList;

/**
 * Created by user on 8/14/2016.
 */
/*public class Course_Adapter extends Course_Adapter {
    ArrayList<Course> course;
    Context context;

   public Course_Adapter(Context context, int resource, ArrayList<Course> list) {
        super(context, resource, list);
        this.course = list;
        this.context = context;


    }

    @Override
    public int getCount() {
        return course.size();
    }

    @Override
    public Course getItem(int position) {
        return course.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.course_list, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.course);
        TextView grade = (TextView) convertView.findViewById(R.id.courseduration);

        Course course = getItem(position);
        name.setText(course.getCourse());
        name.setText(course.getDuration());


        return convertView;


    }*/

