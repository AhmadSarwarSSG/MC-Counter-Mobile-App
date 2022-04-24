package com.FirstApp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int counter = 0;
    Button plus;
    Button minus;
    Button reset;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button) findViewById(R.id.button);
        minus= (Button)findViewById(R.id.button2);
        reset= (Button)findViewById(R.id.button3);
        txt= (TextView) findViewById(R.id.textView);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                counter=counter+1;
                txt.setText(""+counter);
                break;
            case R.id.button2:
                counter=counter-1;
                txt.setText(""+counter);
                break;
            case R.id.button3:
                counter=0;
                txt.setText(""+counter);
                break;
        }
    }
}