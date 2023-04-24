package com.example.inventory;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText name, passWord;
    Button logIn;
    TextView create_account;
    TextView forgot_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.userName);
        passWord = findViewById(R.id.password);
        create_account = findViewById(R.id.createAccount);
        forgot_password = findViewById(R.id.forgotPassword);
        logIn = findViewById(R.id.login);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();
                String password = passWord.getText().toString();

                if (userName.length() == 0 || password.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill in all the fields correctly", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);
                }

                boolean logIn = true; // replace with your login logic
                if (logIn) {
                    name.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            name.setText("");
                            passWord.setText("");
                        }
                    }, 2000);
                }


            }
        });


        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, password_recoveryActivity.class);
                startActivity(intent);
            }
        });
    }}