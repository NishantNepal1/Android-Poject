package com.hfad.androidclasss2.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hfad.androidclasss2.R;

public class addstu extends AppCompatActivity {
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__stu);
        add=(Button) findViewById(R.id.stuadd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(addstu.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
            });
    }}
