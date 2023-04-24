package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ComoditiesActivity extends AppCompatActivity {

    ImageView homE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comodities);

        homE = findViewById(R.id.homeIcon);

        homE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ComoditiesActivity.this, MenuActivity.class);
                startActivity(intent);
            }});
    }
}