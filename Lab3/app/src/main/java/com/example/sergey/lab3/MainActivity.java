package com.example.sergey.lab3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

   public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Change(View view){
        Fragment fragment = null;
        switch(view.getId()){
            case R.id.firstButton:
                fragment = new FirstFragment();
                break;
            case R.id.secondButton:
                fragment = new SecondFragment();
                break;
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fr_place, fragment);
        fragmentTransaction.commit();
    }

    public void showToast(View view){
        Toast.makeText(getApplicationContext(), "Toast with text", Toast.LENGTH_LONG).show();
    }

    public void showDialog(View view){
        TestDialog testDialog = new TestDialog();
        testDialog.show(getSupportFragmentManager(), "test dialog");
    }

    public void showNorification(View view){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "simple_notification");
        builder.setSmallIcon(R.drawable.ic_message_simple);
        builder.setContentTitle("New notification");
        builder.setContentText("This is new notification. Click here!");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1, builder.build());
    }
}
