package com.hfad.androidclasss2.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.hfad.androidclasss2.R;
import com.hfad.androidclasss2.com.Adapter.TeacherAdapter;
import com.hfad.androidclasss2.com.model.Teacher;

import java.util.ArrayList;

public class Teacher_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvlist;
    /*ImageView imgview;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_display);
        lvlist=(ListView) findViewById( R.id.lvList);
        TeacherAdapter addit= new TeacherAdapter(this,R.layout.teacher_list_view,getTeacher());
        lvlist.setAdapter(addit);
        lvlist.setOnItemClickListener(this);



    }
    public  ArrayList<Teacher> getTeacher() {

        /*imgview = (ImageView) findViewById(R.id.rect1);*/
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Ram", "Science", "9851023456"));
        teachers.add(new Teacher("Shyam","Management","9841234551"));
        teachers.add(new Teacher("Rita","Humanities","9876543212"));

        teachers.add(new Teacher("Ram", "Science", "9851023456"));
        teachers.add(new Teacher("Shyam","Management","9841234551"));
        teachers.add(new Teacher("Rita","Humanities","9876543212"));

        teachers.add(new Teacher("Ram", "Science", "9851023456"));
        teachers.add(new Teacher("Shyam","Management","9841234551"));
        teachers.add(new Teacher("Rita","Humanities","9876543212"));

        teachers.add(new Teacher("Ram", "Science", "9851023456"));
        teachers.add(new Teacher("Shyam","Management","9841234551"));
        teachers.add(new Teacher("Rita","Humanities","9876543212"));

        teachers.add(new Teacher("Ram", "Science", "9851023456"));
        teachers.add(new Teacher("Shyam","Management","9841234551"));
        teachers.add(new Teacher("Rita","Humanities","9876543212"));

        teachers.add(new Teacher("Ram", "Science", "9851023456"));
        teachers.add(new Teacher("Shyam","Management","9841234551"));
        teachers.add(new Teacher("Rita","Humanities","9876543212"));
        return teachers;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
