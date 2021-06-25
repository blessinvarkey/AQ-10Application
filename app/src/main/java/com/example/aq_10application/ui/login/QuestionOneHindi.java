package com.example.aq_10application.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aq_10application.R;

public class QuestionOneHindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one_hindi);
        getSupportActionBar().setTitle( "AQ-10: Question One");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    public void nextButtonOneHindi(View view) {
        Intent intent = new Intent(this, QuestionTwoHindi.class);
        startActivity(intent);
    }
}