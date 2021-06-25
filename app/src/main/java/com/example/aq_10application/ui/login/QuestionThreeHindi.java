package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aq_10application.R;

public class QuestionThreeHindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three_hindi);
        getSupportActionBar().setTitle("AQ-10: Question Three");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void nextButtonThreeHindi(View view) {
        Intent intent = new Intent(this, QuestionFourHindi.class);
        startActivity(intent);
    }
}


