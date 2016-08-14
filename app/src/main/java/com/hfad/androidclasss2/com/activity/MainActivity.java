package com.hfad.androidclasss2.com.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.hfad.androidclasss2.R;
import com.hfad.androidclasss2.com.Adapter.CustomAdapter;
import com.hfad.androidclasss2.com.model.Role;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener,AdapterView.OnItemClickListener {
    Spinner splist;
    Button btn;
    TextView etUserName;
    TextView etPassWord;
    String a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        etUserName = (TextView) findViewById(R.id.name);
        etPassWord = (TextView) findViewById(R.id.pass);
        splist = (Spinner) findViewById(R.id.splist);
        btn = (Button) findViewById(R.id.login);
        CustomAdapter addit = new CustomAdapter(this, R.layout.list_view, getRole());
        splist.setAdapter(addit);
        splist.setOnItemSelectedListener(this);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFormvalid()) {
                    if (a.equals("Teacher")) {
                        Toast.makeText(MainActivity.this, "Teacher", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Teacher_Activity.class);
                        startActivity(intent);
                    } else if (a.equals("Student")) {
                        Intent intent = new Intent(MainActivity.this, Student_Activity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "student", Toast.LENGTH_SHORT).show();
                    } else {

                        Intent intent = new Intent(MainActivity.this, admin_activity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "admin", Toast.LENGTH_SHORT).show();
                    }
                }
    }
    });}


    private boolean isFormvalid() {
        if (etUserName.getText().toString().equals("leapfrog")||etPassWord.getText().toString().equals("leapfrog")) {

            return true;
        }
        etUserName.setError("Wrong UserName");
        etPassWord.setError("Wrong PassWord");
        return false;
    }

            ArrayList<Role> getRole() {
                ArrayList<Role> spinners = new ArrayList<>();
                spinners.add(new Role("Teacher"));
                spinners.add(new Role("Student"));
                spinners.add(new Role("Admin"));
                return spinners;
            }

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Role r =(Role) parent.getAdapter().getItem(position);
                a=r.gettext11();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}


