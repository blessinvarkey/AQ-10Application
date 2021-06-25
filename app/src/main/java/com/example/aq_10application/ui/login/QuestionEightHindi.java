package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aq_10application.R;

public class QuestionEightHindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eight_hindi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("AQ-10 Question Eight");


    }

    public void nextButtonEightHindi(View view) {
        Intent intent = new Intent(this, QuestionNineHindi.class);
        startActivity(intent);
    }
}