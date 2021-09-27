package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        output = (TextView) findViewById(R.id.OutputNum);
        Intent intent = getIntent();
        String calcNum = intent.getStringExtra("output");
        output.setText(calcNum);

    }
}