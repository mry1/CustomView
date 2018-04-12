package com.example.myapplication.practice;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.BR;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ListItemLayoutBinding;

import java.util.ArrayList;

/**
 * Created by louis2 on 18-2-2.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    //在adapter创建的时候 初始化模拟的数据
    private ArrayList<User> mDatas = new ArrayList<>();

    public RecyclerAdapter() {
        for (int i = 0; i < 20; i++) {
            mDatas.add(new User("yi", "188888888" + i, true));
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListItemLayoutBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(binding.getRoot());
        //将binding绑定到ViewHolder中
        viewHolder.setBinding(binding);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getBinding().setVariable(BR.user, mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ListItemLayoutBinding binding;

        public ListItemLayoutBinding getBinding() {
            return binding;
        }

        public void setBinding(ListItemLayoutBinding binding) {
            this.binding = binding;
        }

        public ViewHolder(final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "点击了" + getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
