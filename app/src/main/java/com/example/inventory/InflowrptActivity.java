package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InflowrptActivity extends AppCompatActivity {

    ImageView homE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflowrpt);

        homE = findViewById(R.id.home2);

        homE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InflowrptActivity.this, ReportActivity.class);
                startActivity(intent);
            }});
    }
}