package com.example.sergey.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runIntentService(View view){
        Intent intent = new Intent(this, TestService.class);
        startService(intent);
    }

    public void runService(View view){
        Intent intent = new Intent(this, CommonService.class);
        startService(intent);
    }

    public void stopService(View view){
        Intent intent = new Intent(this, CommonService.class);
        stopService(intent);
    }
}
