package com.example.sergey.lab7;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateUser extends AppCompatActivity {

    AppDatabase db;
    TextView firstName, lastName, age;
    Button createButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);
        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "db").allowMainThreadQueries().build();
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        age = findViewById(R.id.age);
        createButton = findViewById(R.id.createButton);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.userData().createUsers(new User(firstName.getText().toString(), lastName.getText().toString(), Integer.parseInt(age.getText().toString())));
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }
}
