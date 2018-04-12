package com.example.myapplication.activity;

import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.myapplication.CustomDataBinding;
import com.example.myapplication.messenger.MessengerActivity;
import com.example.myapplication.messenger.MessengerService;
import com.example.myapplication.practice.Main2Fragment;
import com.example.myapplication.practice.MainFragment;
import com.example.myapplication.practice.MyHandler;
import com.example.myapplication.practice.MyTask;
import com.example.myapplication.R;
import com.example.myapplication.practice.QQQ;
import com.example.myapplication.practice.SSS;
import com.example.myapplication.practice.SortPractice;
import com.example.myapplication.practice.User;
import com.example.myapplication.service.ServiceActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private User user;
    private CustomDataBinding binding;
    private Toast toast = null;
    private TextView view;
    private MainFragment mainFragment;
    private Main2Fragment main2Fragment;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // 初始化数据
        user = new User("Victor", "Fang", "13333333333", true);
        // 绑定数据
        binding.setUser(user);

        binding.setMain(this);
        System.out.println("onCreate");

        MyHandler myHandler = new MyHandler();
        MyTask myTask = new MyTask(getApplicationContext());
        binding.setHandler(myHandler);
        binding.setTask(myTask);

        mainFragment = new MainFragment();
        main2Fragment = new Main2Fragment();

    }

    public void onClick(View v) {
        Random random = new Random();
        user.setFirstName("修改了firstName" + random.nextInt());
    }

    public void onClick2(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
//        Intent intent = new Intent("com.example.myapplication2");
        intent.addCategory("com.example.myapplication2");
        intent.setDataAndType(Uri.parse("content://abc"), "video/mpeg");

        PackageManager pm = getPackageManager();
        ResolveInfo resolveInfo = pm.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
        ComponentName componentName = intent.resolveActivity(pm);
        if (resolveInfo == null) {
            Toast.makeText(this, "空", Toast.LENGTH_SHORT).show();

        } else {
            startActivity(intent);
        }
//        getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, main2Fragment, "mainFragment").commit();

    }

    public void onClick3(View v) {
        Intent intent = new Intent(this, MessengerActivity.class);
//        startActivity(intent);
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};
//        SortPractice.bubleSort(a);
//        SortPractice.insertion_sort(a);


        getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, mainFragment, "mainFragment").commit();

    }


    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");

    }

    public void onClick4(View v) {
//        binding.btn6.scrollBy(1, 1);

        startActivity(new Intent(this, ServiceActivity.class));
    }

}
