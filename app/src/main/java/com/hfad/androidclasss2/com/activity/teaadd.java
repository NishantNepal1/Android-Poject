package com.hfad.androidclasss2.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hfad.androidclasss2.R;

public class teaadd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button add;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teaadd);
        add=(Button) findViewById(R.id.teaadd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(teaadd.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
