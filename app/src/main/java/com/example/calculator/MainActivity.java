package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText input1;
    EditText input2;
    Button mod;
    Button plus;
    Button multiply;
    Button minus;
    Button divide;
    Button eq;
    char x=' ';
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        //////
        output=(TextView) findViewById(R.id.output);
        input1=(EditText) findViewById(R.id.input1);
        input2=(EditText) findViewById(R.id.input2);
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(v -> {
            a=Integer.parseInt(input1.getText().toString())+Integer.parseInt(input2.getText().toString());
            x='+';
        });

        minus = findViewById(R.id.minus);
        minus.setOnClickListener(v -> {
            a=Integer.parseInt(input1.getText().toString())-Integer.parseInt(input2.getText().toString());
            x='-';
        });

        mod = findViewById(R.id.mod);
        mod.setOnClickListener(v -> {
            a=Integer.parseInt(input1.getText().toString())%Integer.parseInt(input2.getText().toString());
            x='%';
        });

        multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(v -> {
            a=Integer.parseInt(input1.getText().toString())*Integer.parseInt(input2.getText().toString());
            x='*';
        });

        divide = findViewById(R.id.divide);
        divide.setOnClickListener(v -> {
            a=Integer.parseInt(input1.getText().toString())/Integer.parseInt(input2.getText().toString());
            x='/';
        });

        eq = findViewById(R.id.equals);
        eq.setOnClickListener(v -> {
            output.setText(Integer.toString(a));
            if(x==' ') {
                output.setText("please chose a sign");
            }
        });






    }//onCreate


}//main