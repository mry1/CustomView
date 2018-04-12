package com.example.myapplication.activity;

import android.animation.ValueAnimator;
import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.practice.RecyclerAdapter;
import com.example.myapplication.databinding.ActivitySecondBinding;

import java.util.Random;

/**
 * Created by louis2 on 18-2-2.
 */

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding mBinding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        RecyclerView recyclerView = mBinding.recyclerView;

        //设置RecyclerView的布局策略为线性布局
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //设置RecyclerView的item动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //设置适配器
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        recyclerView.setAdapter(recyclerAdapter);


        BitmapFactory.Options ss = null;
        ss.inPreferredConfig = Bitmap.Config.ALPHA_8;
    }
}
