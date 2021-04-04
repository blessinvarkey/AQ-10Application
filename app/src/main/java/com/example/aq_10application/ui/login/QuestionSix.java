package com.example.aq_10application.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aq_10application.R;

public class QuestionSix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six);
        getSupportActionBar().setTitle("AQ-10 Question Six");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void nextButtonSix(View view) {
        Intent intent = new Intent(this, QuestionSeven.class);
        startActivity(intent);

    }
}