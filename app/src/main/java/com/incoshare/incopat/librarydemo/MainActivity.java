package com.incoshare.incopat.librarydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.incoshare.incopat.shoplibrary.AActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goLibrary(View view) {
        startActivity(new Intent(MainActivity.this, AActivity.class));
    }
}
