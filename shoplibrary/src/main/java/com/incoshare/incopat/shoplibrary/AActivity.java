package com.incoshare.incopat.shoplibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void go_one(View v) {
        startActivity(new Intent(AActivity.this, com.incoshare.incopat.shoplibrary.BActivity.class));
    }

}
