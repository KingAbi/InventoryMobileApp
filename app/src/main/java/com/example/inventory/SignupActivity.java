package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText naME, first_name, last_name, emaiL, countrY, phone_number, passWORD, confirm_password;
    TextView sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //mail = findViewById(R.id.email);
        naME = findViewById(R.id.userName);
        first_name= findViewById(R.id.firstName);
        last_name= findViewById(R.id.lastName);
        emaiL= findViewById(R.id.email);
        countrY= findViewById(R.id.country);
        phone_number= findViewById(R.id.phoneNumber);
        passWORD= findViewById(R.id.password);
        confirm_password= findViewById(R.id.confirmPassword);
        sign_up= findViewById(R.id.signUp);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = naME.getText().toString();
                String firstName = first_name.getText().toString();
                String lastName = last_name.getText().toString();
                String email = emaiL.getText().toString();
                //String email = mail.getText().toString();
                String phoneNumber = phone_number.getText().toString();
                String password = passWORD.getText().toString();
                String confirmPassword = confirm_password.getText().toString();


                if (userName.length() == 0
                        || firstName.length() == 0
                        || email.length() == 0
                        || phoneNumber.length() == 0
                        || password.length() == 0
                        || confirmPassword.length() == 0) {
                    {
                        Toast.makeText(getApplicationContext(), "Please fill in all the necessary fields to continue signup!!", Toast.LENGTH_SHORT).show();
                    }

                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(getApplicationContext(), "The Passwords provided do not match", Toast.LENGTH_SHORT).show();

                } else if (password.length() < 8) {
                    Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                } else if (!password.matches(".*[0-9].*")) {
                    Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                } else if (!password.matches(".*[a-z].*")) {
                    Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                } else if (!password.matches(".*[A-Z].*")) {
                    Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                } else if (!password.matches(".*[!@#$%^&*()\\-_=+\\[{\\]}\\\\|;:'\",<.>/?].*")) {
                    Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU )", Toast.LENGTH_SHORT).show();


                } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(getApplicationContext(), "Invalid email address, Try something of the format anslem@gmail.com", Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(getApplicationContext(), "Thank you for registering with us. WELCOME", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

            }

        });
        }
}