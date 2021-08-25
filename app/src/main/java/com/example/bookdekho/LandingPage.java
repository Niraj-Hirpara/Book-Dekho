package com.example.bookdekho;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(LandingPage.this, RegisterPage.class));
                finish();
            }
        }, 2000 );
        getSupportActionBar().hide();
    }
}