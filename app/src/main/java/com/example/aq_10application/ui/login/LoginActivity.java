package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.aq_10application.LoginTwo;
import com.example.aq_10application.R;


public class LoginActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void startButton(View view){
        Intent intent = new Intent(this, LoginTwo.class);
        startActivity(intent);
    }



}