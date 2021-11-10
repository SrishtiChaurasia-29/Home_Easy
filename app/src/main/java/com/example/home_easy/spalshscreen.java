package com.example.home_easy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class spalshscreen extends AppCompatActivity {
    TextView home,easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalshscreen);
        home=findViewById((R.id.textview1));
        easy=findViewById((R.id.textview2));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(spalshscreen.this,MainActivity.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //invoke the SecondActivity.

                finish();
                //the current activity will get finished.
            }
        }, 3000);
    }
}