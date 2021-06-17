package umn.ac.id;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;

public class CustomService extends Service {
    public CustomService() {

    }

    @Override
    public IBinder onBind(Intent intent){
        Log.i("CUSTOM SERVICE","onBind: Service Bind");
        return null;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("CUSTOMSERVICE","onDestroy: Service Destroyed");
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.i("CUSTOMSERVICE","onCreate: CustomService");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.i("CUSTOMSERVICE","onStartCommand: "+startId);
        return Service.START_STICKY;
    }
}
