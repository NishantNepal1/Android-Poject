package com.hfad.androidclasss2.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.EditText;

import com.hfad.androidclasss2.R;
import com.hfad.androidclasss2.com.Adapter.StudentAdapter;
import com.hfad.androidclasss2.com.model.Student;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Student_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gvList;
   /* EditText etname;
    EditText etgrade;
    EditText etid;
    EditText etcontact;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);
       /* etname=(EditText)findViewById(R.id.a2);
        etgrade=(EditText)findViewById(R.id.a3);
        etid=(EditText) findViewById(R.id.a4);
        etcontact=(EditText)findViewById(R.id.a5);*/
        gvList=(GridView)findViewById(R.id.gvList);
        StudentAdapter addit= new StudentAdapter(this,R.layout.student_display,getStudent());
        gvList.setAdapter(addit);
        gvList.setOnItemClickListener(this);
    }


    public ArrayList<Student> getStudent() {

        /*imgview = (ImageView) findViewById(R.id.rect1);*/
        ArrayList<Student> Students = new ArrayList<>();
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));

        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));
        Students.add(new Student("Pratik", "12694", "Bsc It","9836274838"));
        Students.add(new Student("Samyog","13768","Bba","9812636273"));
        Students.add(new Student("Garima","14828","Msc MicroBiology","9825425365"));

        return Students;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
