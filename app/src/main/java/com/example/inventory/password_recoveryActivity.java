package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class password_recoveryActivity extends AppCompatActivity {
    EditText namE, emaIL, phone_Number, new_password, confirm_newpassword;
    TextView suBmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);

        namE = findViewById(R.id.userName);
        new_password= findViewById(R.id.newPassword);
        confirm_newpassword= findViewById(R.id.confirmNewPassword);
        emaIL= findViewById(R.id.email);
        suBmit= findViewById(R.id.submit);
        phone_Number= findViewById(R.id.phoneNumber);

        suBmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = namE.getText().toString();
                String newPassword = new_password.getText().toString();
                String confirmNewPassword = confirm_newpassword.getText().toString();
                String email = emaIL.getText().toString();
                String phoneNumber = phone_Number.getText().toString();
// if a user does not fill up any of the fields, throw a warning text.
                if (userName.length()==0
                        || email.length()==0
                        || phoneNumber.length()==0
                        || newPassword.length()==0
                        || confirmNewPassword.length()==0) {
                    {
                        Toast.makeText(getApplicationContext(), "We advise you first fill up all the fields before you can submit! Thank you", Toast.LENGTH_SHORT).show();
                    }
                    //checking whether the passwords provided/ suggested match.
                    }else if (!newPassword.equals(confirmNewPassword)) {
                        Toast.makeText(getApplicationContext(), "The Passwords provided do not match", Toast.LENGTH_SHORT).show();

                        //checking for password vulnerability to be guessed
                    } else if (newPassword.length() < 8) {
                        Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                    } else if (!newPassword.matches(".*[0-9].*")) {
                        Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                    } else if (!newPassword.matches(".*[a-z].*")) {
                        Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                    } else if (!newPassword.matches(".*[A-Z].*")) {
                        Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU", Toast.LENGTH_SHORT).show();
                    } else if (!newPassword.matches(".*[!@#$%^&*()\\-_=+\\[{\\]}\\\\|;:'\",<.>/?].*")) {
                        Toast.makeText(getApplicationContext(), "Your Password is not strong, it must be at least 8 characters long including atleast a letter in uppercase, in lowercase, a number and a special character. THANK YOU )", Toast.LENGTH_SHORT).show();

                    } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                        Toast.makeText(getApplicationContext(), "Invalid email address, Try something of the format anslem@gmail.com", Toast.LENGTH_SHORT).show();


                    //if the user fills all the fields correctly, take him to the sign in activity to try signing in with the new password
                }else {
                    Toast.makeText(getApplicationContext(), "Your account has been recovered", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(password_recoveryActivity.this, LoginActivity.class);
                    startActivity(intent);
                }}
            });
    }
}