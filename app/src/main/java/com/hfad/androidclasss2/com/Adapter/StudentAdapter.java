package com.hfad.androidclasss2.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hfad.androidclasss2.R;
import com.hfad.androidclasss2.com.model.Student;
import com.hfad.androidclasss2.com.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/13/2016.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    ArrayList<Student> stu;
    Context context;

    public StudentAdapter(Context context, int resource, ArrayList<Student> list) {
        super(context, resource, list);
        this.stu = list;
        this.context = context;


    }

    @Override
    public int getCount() {
        return stu.size();
    }

    @Override
    public Student getItem(int position) {
        return stu.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.student_display, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.stuname);
        TextView grade = (TextView) convertView.findViewById(R.id.stuClass);
        TextView id = (TextView) convertView.findViewById(R.id.stuID);
        TextView contact = (TextView) convertView.findViewById(R.id.stuContact);

        Student stu = getItem(position);
        name.setText(stu.getStuName());
        grade.setText(stu.getGrade());
        id.setText(stu.getId());
        contact.setText(stu.getContact());
        /*imageView.setImageDrawable(stu.getImage());*/

        return convertView;


    }
}
