package com.FirstApp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    Button plus;
    Button minus;
    Button reset;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button)findViewById(R.id.button);
        minus= (Button)findViewById(R.id.button2);
        reset= (Button)findViewById(R.id.button3);
        txt= (TextView) findViewById(R.id.textView);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=counter-1;
                txt.setText(counter);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=counter-1;
                txt.setText(counter);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                txt.setText(counter);
            }
        });
    }
}