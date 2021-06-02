package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button btnAdd, btnSub, btnMul, btnDiv, btnMod, btnPow;
    private TextView resultText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);

        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnMod = findViewById(R.id.btn_mod);
        btnPow = findViewById(R.id.btn_pow);

        resultText = findViewById(R.id.result);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText1.getText() + "");
                int num2 = Integer.parseInt(editText2.getText() + "");

                resultText.setText("Result is: " + (num1 + num2));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText1.getText() + "");
                int num2 = Integer.parseInt(editText2.getText() + "");

                resultText.setText("Result is: " + (num1 - num2));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText1.getText() + "");
                int num2 = Integer.parseInt(editText2.getText() + "");

                resultText.setText("Result is: " + (num1 * num2));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText1.getText() + "");
                int num2 = Integer.parseInt(editText2.getText() + "");

                resultText.setText("Result is: " + (num1 / num2));
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText1.getText() + "");
                int num2 = Integer.parseInt(editText2.getText() + "");

                resultText.setText("Result is: " + (num1 % num2));
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText1.getText() + "");
                int num2 = Integer.parseInt(editText2.getText() + "");

                resultText.setText("Result is: " + Math.pow(num1, num2));
            }
        });
    }
}