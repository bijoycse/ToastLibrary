package com.example.toastlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toastmodule.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast.showToast(this, "This is my toast!!!");
    }
}