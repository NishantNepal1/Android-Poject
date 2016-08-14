package com.hfad.androidclasss2.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.hfad.androidclasss2.R;
import com.hfad.androidclasss2.com.model.Course;
import com.hfad.androidclasss2.com.model.Teacher;

import java.util.ArrayList;

public class course_activity extends AppCompatActivity {
    TextView course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_activity);
        course = (TextView) findViewById(R.id.course);



    }

    public ArrayList<Course> getCourse() {

                ArrayList<Course> course = new ArrayList<>();
                course.add(new Course("Bba", "4 Years"));
                course.add(new Course("Mba", "2 years"));
                course.add(new Course("Bba", "4 Years"));
                course.add(new Course("Mba", "2 years"));
                course.add(new Course("Bba", "4 Years"));
                course.add(new Course("Mba", "2 years"));
                return course;


    }
}
