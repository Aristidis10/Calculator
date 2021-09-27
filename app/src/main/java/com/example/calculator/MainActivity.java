package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        int output = 0;
        EditText firstNumBox = (EditText) findViewById(R.id.FirstNum);
        EditText secondNumBox = (EditText) findViewById(R.id.SecondNum);
        int firstNum = Integer.parseInt(firstNumBox.getText().toString());
        int secondNum = Integer.parseInt(secondNumBox.getText().toString());

        if (view.getId() == R.id.buttonadd) {
            output = firstNum + secondNum;
            goToCalculation(String.valueOf(output));
        }
        else if (view.getId() == R.id.buttonsub) {
            output = firstNum - secondNum;
            goToCalculation(String.valueOf(output));
        }
        else if (view.getId() == R.id.buttonmult) {
            output = firstNum * secondNum;
            goToCalculation(String.valueOf(output));
        }
        else if (view.getId() == R.id.buttondiv) {
            if (secondNum == 0) {
                goToCalculation(String.valueOf(output));
            } else {
                output = firstNum / secondNum;
                goToCalculation(String.valueOf(output));
            }
        } else {
            goToCalculation(String.valueOf(output));
        }
    }

    private void goToCalculation(String out) {
        Intent intent = new Intent(this, Final.class);
        intent.putExtra("output", out);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}