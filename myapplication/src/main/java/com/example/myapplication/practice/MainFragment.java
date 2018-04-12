package com.example.myapplication.practice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by louis2 on 18-3-14.
 */

public class MainFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("MainFragment---onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("MainFragment---onCreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("MainFragment---onCreateView");
        TextView textView = new TextView(getContext());
        textView.setText("aaaaaaaaaaa");
        return textView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("MainFragment---onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("MainFragment---onStart");

    }


    @Override
    public void onResume() {
        super.onResume();
        System.out.println("MainFragment---onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("MainFragment---onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("MainFragment---onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("MainFragment---onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("MainFragment---onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("MainFragment---onDetach");

    }
}
