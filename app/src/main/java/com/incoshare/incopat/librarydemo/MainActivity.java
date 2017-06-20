package com.incoshare.incopat.librarydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.TextView;
import com.incoshare.incopat.shoplibrary.AActivity;
import com.incoshare.incopat.shoplibrary.Utils;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView text = (TextView) findViewById(R.id.text);
    text.setText(Utils.getnum() + "");
  }

  public void goLibrary(View view) {
    startActivity(new Intent(MainActivity.this, AActivity.class));
  }
}
