package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OutflowrptActivity extends AppCompatActivity {
    ImageView homE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outflowrpt);

        homE = findViewById(R.id.home2);

        homE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OutflowrptActivity.this, ReportActivity.class);
                startActivity(intent);
            }});
    }
}