package com.applicationdev.a15017573.p09_gettingmylocations;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    boolean started;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Service", "Created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (started == false) {
            started = true;
            Log.d("Service", "Started");
        } else {
            Log.d("Service", "Still running");
            Toast.makeText(this, "Service is running", Toast.LENGTH_SHORT).show();
        }
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d("Service", "Exited");
        super.onDestroy();
    }
}
