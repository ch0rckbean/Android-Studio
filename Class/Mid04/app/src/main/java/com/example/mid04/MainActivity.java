package com.example.mid04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=(CheckBox)findViewById(R.id.C1);
        c2=(CheckBox)findViewById(R.id.C2);
        c3=(CheckBox)findViewById(R.id.C3);
btn=(Button)findViewById(R.id.Btn);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(c1.isChecked()==true){ btn.setEnabled(true);}
               else {btn.setEnabled(false);}
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c1.isChecked()==true){ btn.setClickable(true);}
                else {btn.setClickable(false);}
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c3.isChecked()==true){ btn.setRotation(45);}
                else {btn.setRotation(0);}
            }
        });








    }
}
