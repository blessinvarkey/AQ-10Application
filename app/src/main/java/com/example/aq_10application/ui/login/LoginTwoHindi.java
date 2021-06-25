package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aq_10application.LoginTwo;
import com.example.aq_10application.R;


public class LoginTwoHindi extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_two_hindi);
        getSupportActionBar().setTitle( "AQ-10: Question One");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void loginButtonHindi(View view) {
        Intent intent = new Intent(this, QuestionOneHindi.class);
        startActivity(intent);
    }
}

