package com.example.mid01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2;
    TextView test;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("CheckBox1");
        c1=(CheckBox)findViewById(R.id.C1);
        c2=(CheckBox)findViewById(R.id.C2);
        test=(TextView) findViewById(R.id.Test);
        i=(ImageView) findViewById(R.id.I);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c1.isChecked()==true){
                    test.setTextColor(Color.RED);}else {c1.setChecked(false);test.setTextColor(Color.BLACK);}
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c2.isChecked()==true){
i.setVisibility(View.VISIBLE);}
                else {c2.setChecked(false);i.setVisibility(View.INVISIBLE);}
        };
    });
}}
