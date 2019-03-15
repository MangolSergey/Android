package com.example.sergey.lab4;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class CommonService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        getToast("Run service toast").show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        getToast("Destroy service toast").show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private Toast getToast(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        return Toast.makeText(context, text, duration);
    }
}
