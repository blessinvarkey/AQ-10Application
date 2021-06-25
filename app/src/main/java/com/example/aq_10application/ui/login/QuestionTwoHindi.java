package com.example.aq_10application.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aq_10application.R;

public class QuestionTwoHindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two_hindi);
        getSupportActionBar().setTitle( "AQ-10: Question Two");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void nextButtonTwoHindi(View view) {
        Intent intent = new Intent(this, QuestionThreeHindi.class);
        startActivity(intent);
    }
}


