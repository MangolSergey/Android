package com.example.sergey.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button Zoomin, Zoomout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Zoomin = (Button) findViewById(R.id.RotateClock);
        Zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.idImageView);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate_clockwise);
            image.startAnimation(animation);
            }
        });
        Zoomout = (Button) findViewById(R.id.RotateAntiClock);
        Zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.idImageView);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate_anticlockwise);
            image.startAnimation(animation);
            }
        });
    }
}
