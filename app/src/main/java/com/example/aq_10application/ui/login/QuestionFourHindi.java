package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aq_10application.R;

public class QuestionFourHindi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four_hindi);
        getSupportActionBar().setTitle("AQ-10: Question Four");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void nextButtonFourHindi(View view) {
        Intent intent = new Intent(this, QuestionFiveHindi.class);
        startActivity(intent);

    }
}