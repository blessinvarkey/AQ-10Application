package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aq_10application.R;

public class QuestionFiveHindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five_hindi);
        getSupportActionBar().setTitle("AQ-10: Question Five");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void nextButtonFiveHindi(View view) {
        Intent intent = new Intent(this, QuestionSixHindi.class);
        startActivity(intent);
    }
}