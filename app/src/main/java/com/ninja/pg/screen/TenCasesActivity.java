package com.ninja.pg.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ninja.pg.R;

import java.util.ArrayList;
import java.util.List;

public abstract class TenCasesActivity extends AppCompatActivity {

    protected static final List<String> stringList = new ArrayList<>();
    static {
        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ccc");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_cases);
    }

    public void onCase001Clicked(View view) {
    }

    public void onCase002Clicked(View view) {
    }

    public void onCase003Clicked(View view) {
    }

    public void onCase004Clicked(View view) {
    }

    public void onCase005Clicked(View view) {
    }

    public void onCase006Clicked(View view) {
    }

    public void onCase007Clicked(View view) {
    }

    public void onCase008Clicked(View view) {
    }

    public void onCase009Clicked(View view) {
    }

    public void onCase010Clicked(View view) {
    }
}
