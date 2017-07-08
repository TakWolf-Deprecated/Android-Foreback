package com.takwolf.android.forebackdemo;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_new_activity)
    void onBtnNewActivityClick() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @OnClick(R.id.btn_show_dialog)
    void onBtnShowDialogClick() {
        new AlertDialog.Builder(this)
                .setMessage("This is a Dialog.")
                .setPositiveButton("Ok", null)
                .show();
    }

    @OnClick(R.id.btn_open_camera)
    void onBtnOpenCameraClick() {
        startActivity(new Intent(MediaStore.ACTION_IMAGE_CAPTURE));
    }

}
