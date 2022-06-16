package com.example.firstactivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DefinationLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defination_layout);
        ActionBar actionBar=getSupportActionBar();//隐藏默认的任务栏
        if(actionBar!=null){
            actionBar.hide();
        }
    }
}