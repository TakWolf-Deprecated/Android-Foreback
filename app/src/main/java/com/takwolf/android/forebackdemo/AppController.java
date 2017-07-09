package com.takwolf.android.forebackdemo;

import android.app.Activity;
import android.app.Application;

import com.takwolf.android.foreback.Foreback;

public class AppController extends Application implements Foreback.Listener {

    @Override
    public void onCreate() {
        super.onCreate();
        Foreback.init(this);
        Foreback.registerListener(this);
    }

    @Override
    public void onApplicationEnterForeground(Activity activity) {
        ToastUtils.with(this).show("Enter Foreground");
    }

    @Override
    public void onApplicationEnterBackground(Activity activity) {
        ToastUtils.with(this).show("Enter Background");
    }

}
