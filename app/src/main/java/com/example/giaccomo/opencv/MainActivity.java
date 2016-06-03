package com.example.giaccomo.opencv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.giaccomo.opencv.ColorBlobDetectionActivity;
import com.example.giaccomo.opencv.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btnDetec);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, ColorBlobDetectionActivity.class);
            startActivity(i);
        }
    });
    } }