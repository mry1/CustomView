package com.example.myapplication.messenger;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMessengerBinding;

/**
 * Created by louis2 on 18-2-23.
 */

public class MessengerActivity extends AppCompatActivity {


    private ServiceConnection conn;
    private ActivityMessengerBinding mBinding;
    private Messenger messenger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_messenger);


        Intent intent = new Intent(this, MessengerService.class);
        conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                messenger = new Messenger(service);
                Message message = Message.obtain(null, MessengerService.MSG_FROM_CLIENT);
                Bundle bundle = new Bundle();
                bundle.putString("msg", "hello,this is from client");
                message.setData(bundle);

                message.replyTo = mGetReplyMessenger;
                try {
                    messenger.send(message);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }

//                mBinding.tv.setText("33");
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        };
        bindService(intent, conn, BIND_AUTO_CREATE);
    }

    private final MessengerHandler handler = new MessengerHandler();
    Messenger mGetReplyMessenger = new Messenger(handler);

    public static class MessengerHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MessengerService.MSG_FROM_SERVICE:
                    System.out.println("----------" + msg.getData().getString("reply"));
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(conn);
    }
}
