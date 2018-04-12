package com.example.myapplication.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.example.myapplication.R;
import com.example.myapplication.practice.SSS;

/**
 * Created by louis2 on 18-2-24.
 */

public class ServiceActivity extends AppCompatActivity {

    private Intent intent;
    private ServiceConnection conn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);


        SSS sss = new SSS();

        WindowManager windowManager = getWindowManager();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = WindowManager.LayoutParams.TYPE_APPLICATION;

        intent = new Intent(this, TestService.class);
        conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                System.out.println("==========onServiceConnected");
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        };
    }

    public void startService(View v) {
        startService(intent);
    }

    public void bindService(View v) {
        bindService(intent, conn, BIND_AUTO_CREATE);

    }

    public void stopService(View v) {
        stopService(intent);
    }

    public void unbindService(View v) {
        unbindService(conn);
    }

    public void setOnDataChangeListener(){

    }
    public interface DataListener {
        void onDataChangerListener(String data);
    }

}
