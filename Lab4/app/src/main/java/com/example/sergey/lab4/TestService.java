package com.example.sergey.lab4;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.widget.Toast;

public class TestService extends IntentService {

    public static final String ACTION = "TEST_SERVICE_ACTION";
    android.os.Handler handler = new android.os.Handler(Looper.myLooper());

    public TestService(){
        this("Test Service");
    }

    public TestService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent){
        try {
            Thread.sleep(2000);
            handler.post(new Runnable() {
                @Override
                public void run() {
                    getToast("Intent service toast").show();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Toast getToast(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        return Toast.makeText(context, text, duration);
    }
}
