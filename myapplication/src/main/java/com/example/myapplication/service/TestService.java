package com.example.myapplication.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by louis2 on 18-2-24.
 */

public class TestService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("=============onBind");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("=============onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("=============onStartCommand");

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("=============onDestroy");

    }

    @Override
    public boolean onUnbind(Intent intent) {
        System.out.println("=============onUnbind");

        return super.onUnbind(intent);
    }
}
