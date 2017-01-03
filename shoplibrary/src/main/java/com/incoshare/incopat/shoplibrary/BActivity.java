package com.incoshare.incopat.shoplibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public void goIndex(View v) {
        Intent intent = new Intent();
        intent.setAction("com.incoshare.incopat.librarydemo");
        intent.addCategory("com.incoshare.incopat.librarydemo.category");
        intent.putExtra("data", "hahaha");
        startActivity(intent);
    }
}
