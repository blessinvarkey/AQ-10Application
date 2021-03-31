package com.example.aq_10application.ui.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.aq_10application.R;
import com.example.aq_10application.ui.login.QuestionTwo;

public class QuestionOne extends AppCompatActivity {

    public void buttonQOne(View view){
        Intent intent = new Intent(this, QuestionTwo.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

    }

}