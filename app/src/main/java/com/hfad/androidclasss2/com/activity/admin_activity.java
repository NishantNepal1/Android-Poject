package com.hfad.androidclasss2.com.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.hfad.androidclasss2.R;

public class admin_activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Button stubutton;
    Button teaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        stubutton=(Button) findViewById(R.id.studentbutton);
        teaButton=(Button) findViewById(R.id.teacherButton);

        stubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(admin_activity.this,Teacher_Activity.class);
                startActivity(intent);
                Toast.makeText(admin_activity.this, "UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
            }

        });
        teaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(admin_activity.this,Student_Activity.class);
                startActivity(intent);
            }

        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
