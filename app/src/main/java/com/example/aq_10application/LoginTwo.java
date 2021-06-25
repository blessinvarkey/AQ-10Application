package com.example.aq_10application;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.aq_10application.LoginTwo;
import com.example.aq_10application.R;
import com.example.aq_10application.ui.login.QuestionOne;

public class LoginTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_two);
    }

    public void startButton2(View view) {
        Intent intent = new Intent(this, QuestionOne.class);
        startActivity(intent);
    }

    public void buttonQOne(View view) {
    }
}