package com.takwolf.android.forebackdemo;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.takwolf.android.foreback.Foreback;

public class AppController extends Application implements Foreback.Listener {

    private static final String TAG = "AppController";

    @Override
    public void onCreate() {
        super.onCreate();
        Foreback.init(this);
        Foreback.registerListener(this);
    }

    @Override
    public void onApplicationEnterForeground(Activity activity) {
        Log.d(TAG, "Enter Foreground");
        ToastUtils.with(this).show("Enter Foreground");
    }

    @Override
    public void onApplicationEnterBackground(Activity activity) {
        Log.d(TAG, "Enter Background");
        ToastUtils.with(this).show("Enter Background");
    }

}
