package com.example.myapplication.practice;

import android.view.View;
import android.widget.Toast;

/**
 * Created by louis2 on 18-2-2.
 */

public class MyHandler {
    public void showTost(View view) {
        Toast.makeText(view.getContext(), "展示吐司", Toast.LENGTH_SHORT).show();
    }

    public void onEventListenerExecute(MyTask task) {
        task.run();
    }
}
