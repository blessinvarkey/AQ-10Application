package com.example.aq_10application.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aq_10application.R;

public class QuestionFive extends AppCompatActivity {

    public void nextButtonFive(View view){
        Intent intent = new Intent(this, QuestionSix.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);
        getSupportActionBar().setTitle("AQ-10: Question Five");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}