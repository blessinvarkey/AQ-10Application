package com.example.aq_10application.ui.login;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.example.aq_10application.R;
import android.util.Log;


public class LoginActivity extends AppCompatActivity {

    public void startButton(View view){
        Log.i("this", "startButton: This button works");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
     }

}