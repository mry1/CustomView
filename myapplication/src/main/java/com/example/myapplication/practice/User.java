package com.example.myapplication.practice;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.example.myapplication.BR;

/**
 * Created by louis2 on 18-1-31.
 */

public class User extends BaseObservable {

    private String firstName;
    private String lastName;
    private String phone; // 电话
    private boolean isShowPhone;

    public User() {
        System.out.println("new USER");
    }

    public User(String username, String phone, boolean isShowPhone) {
        this.firstName = "liu";
        this.lastName = username;
        this.phone = phone;
        this.isShowPhone = isShowPhone;
    }

    public User(String firstName, String lastName, String phone, boolean isShowPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.isShowPhone = isShowPhone;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }

    @Bindable
    public boolean isShowPhone() {
        return isShowPhone;
    }

    public void setShowPhone(boolean showPhone) {
        isShowPhone = showPhone;
        notifyPropertyChanged(BR.showPhone);
    }

    /**
     * 获取全名
     *
     * @param firstName
     * @param lastName
     * @return
     */
    public String getFullName(String firstName, String lastName) {
        StringBuilder sb = new StringBuilder();
        sb.append("全名：");
        if (!TextUtils.isEmpty(firstName)) {
            sb.append(firstName);
        }
        if (!TextUtils.isEmpty(lastName)) {
            sb.append("." + lastName);
        }
        return sb.toString();
    }

}
