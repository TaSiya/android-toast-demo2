package com.example.toastdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void LoginUser(View view) {
        EditText emailView = findViewById(R.id.emailId);
        EditText passwordView = findViewById(R.id.passwordId);

        String email = emailView.getText().toString();
        String password = passwordView.getText().toString();

        if(email.equalsIgnoreCase("siya@uber5.com")) {
            Toast.makeText(this,"email: "+email +" with password "+password+" is OK", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"only siya can log in", Toast.LENGTH_LONG).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
