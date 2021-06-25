package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aq_10application.R;

public class QuestionNineHindi extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_nine_hindi);
        getSupportActionBar().setTitle("AQ-10: Question Nine");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void nextButtonNineHindi(View view) {
        Intent intent = new Intent(this, QuestionTenHindi.class);
        startActivity(intent);
    }
}