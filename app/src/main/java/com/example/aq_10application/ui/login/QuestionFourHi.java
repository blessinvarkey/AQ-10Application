package com.example.aq_10application.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aq_10application.R;

public class QuestionFourHi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four_hin);
        getSupportActionBar().setTitle("AQ-10: Question Four");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void nextButtonFourHindi(View view) {
        Intent intent = new Intent(this, QuestionFiveHindi.class);
        startActivity(intent);

    }

}