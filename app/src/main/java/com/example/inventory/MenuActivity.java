package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;
import android.widget.Toast;


public class MenuActivity extends AppCompatActivity {

    ImageView personalizE, stocK, saleS, purchaseS, comoditieS, reporT, helP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        personalizE = findViewById(R.id.personalize);
        stocK = findViewById(R.id.stock);
        saleS = findViewById(R.id.sales);
        purchaseS = findViewById(R.id.purchases);
        comoditieS = findViewById(R.id.comodities);
        reporT = findViewById(R.id.report);
        helP = findViewById(R.id.help);


        personalizE.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu(view);
                    }
                });

        stocK.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MenuActivity.this, StockActivity.class);
                    startActivity(intent);
        }});

        saleS.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MenuActivity.this, OutflowActivity.class);
                        startActivity(intent);
        }});

        purchaseS.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MenuActivity.this, InflowActivity.class);
                        startActivity(intent);
        }});

        comoditieS.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MenuActivity.this, ComoditiesActivity.class);
                        startActivity(intent);
        }});

        reporT.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MenuActivity.this, ReportActivity.class);
                        startActivity(intent);
        }});

        helP.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    showPopupMenu(view);
                }
        });

    }public void showPopupMenu(View view) {
        // Create a new PopupMenu object
        PopupMenu popupMenu = new PopupMenu(this, view);

        // Inflate the menu resource
        popupMenu.inflate(R.menu.menu_personalize);
        // Set a listener for menu item clicks
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override public boolean
            onMenuItemClick(MenuItem menuItem)
            {switch (menuItem.getItemId()) {
                case R.id.menu_logout:
                    // Handle logout menu item click
                    Toast.makeText(MenuActivity.this, "You have been logged out", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.menu_about:
                    // Handle logout menu item click
                    Toast.makeText(MenuActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.menu_upload:
                    // Handle upload data menu item click
                    Toast.makeText(MenuActivity.this, "Data uploaded", Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return false;
            }
            }
        });

        popupMenu.inflate(R.menu.help_menu);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
        @Override public boolean
            onMenuItemClick(MenuItem menuItem)
            {switch (menuItem.getItemId()) {
                case R.id.menu_call:
                    // Handle logout menu item click
                    Toast.makeText(MenuActivity.this, "Please wait", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.menu_message:
                    // Handle upload data menu item click
                    Toast.makeText(MenuActivity.this, "LOADING", Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return false;
            }
            }
        });

        // Show the popup menu
        popupMenu.show();
    }
}