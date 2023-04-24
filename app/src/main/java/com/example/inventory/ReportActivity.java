package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ReportActivity extends AppCompatActivity {
    ImageView stockRep,stockInflowRep,stockOutflowRep,comoditiesRep,homE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        stockRep = findViewById(R.id.stockR);
        stockInflowRep = findViewById(R.id.stockInflowR);
        stockOutflowRep = findViewById(R.id.stockOutflowR);
        comoditiesRep = findViewById(R.id.comoditiesR);
        homE = findViewById(R.id.homeIcon);

        stockRep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReportActivity.this, StockrptActivity.class);
                startActivity(intent);
            }});

        stockInflowRep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReportActivity.this, InflowrptActivity.class);
                startActivity(intent);
            }});

        stockOutflowRep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReportActivity.this, OutflowrptActivity.class);
                startActivity(intent);
            }});

        comoditiesRep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReportActivity.this, ComoditiesrptActivity.class);
                startActivity(intent);
            }});

        homE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReportActivity.this, MenuActivity.class);
                startActivity(intent);
            }});
    }
}