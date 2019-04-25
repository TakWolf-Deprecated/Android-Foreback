package com.takwolf.android.forebackdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

public final class ToastUtils {

    private volatile static ToastUtils singleton;

    public static ToastUtils with(@NonNull Context context) {
        if (singleton == null) {
            synchronized (ToastUtils.class) {
                if (singleton == null) {
                    singleton = new ToastUtils(context);
                }
            }
        }
        return singleton;
    }

    private final Toast toast;

    @SuppressLint("ShowToast")
    private ToastUtils(@NonNull Context context) {
        toast = Toast.makeText(context.getApplicationContext(), null, Toast.LENGTH_SHORT);
    }

    public void show(CharSequence msg) {
        toast.setText(msg);
        toast.show();
    }

    public void show(@StringRes int resId) {
        toast.setText(resId);
        toast.show();
    }

}
