package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox c1, c2, c3, c4, c5, c6, c7;
    TextView display;
    Button b,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) this.findViewById(R.id.button);
        b2 = (Button) this.findViewById(R.id.button1);
        display = (TextView) this.findViewById(R.id.textView3);
        c1 = (CheckBox) findViewById(R.id.checkBox1);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        c5 = (CheckBox) findViewById(R.id.checkBox5);
        c6 = (CheckBox) findViewById(R.id.checkBox6);
        c7 = (CheckBox) findViewById(R.id.checkBox7);
        b.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int day = 0;
        if (c1.isChecked()) {
            day = day+1;
        }
        if (c2.isChecked()) {
            day = day+1;
        }
        if (c3.isChecked()) {
            day = day+1;
        }
        if (c4.isChecked()) {
            day = day+1;
        }
        if (c5.isChecked()) {
            day = day+1;
        }
        if (c6.isChecked()) {
            day = day+1;
        }
        if (c7.isChecked()) {
            day = day+1;
        }
        display.setText("number of days selected:"+day);
    }
    public void clear(View v) {
            c1.setChecked(false);
            c2.setChecked(false);
            c3.setChecked(false);
            c4.setChecked(false);
            c5.setChecked(false);
            c6.setChecked(false);
            c7.setChecked(false);
        display.setText("RESULT");
    }
}