package com.example.aq_10application.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aq_10application.LoginTwo;
import com.example.aq_10application.R;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void start(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

    public void startButton(View view) {
        Intent intent = new Intent(this, LoginTwo.class);
        startActivity(intent);
    }

    public void startButtonHindi(View view) {
        Intent intent = new Intent(this, QuestionOneHindi.class);
        startActivity(intent);
    }
}