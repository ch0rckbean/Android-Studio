package com.example.mid02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton red,blue,green;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setTitle("RadioButton1");
    rg=(RadioGroup)findViewById(R.id.Rg);
    red=(RadioButton)findViewById(R.id.Red);
        blue=(RadioButton)findViewById(R.id.Blue);
        green=(RadioButton)findViewById(R.id.Green);
        l=(LinearLayout)findViewById(R.id.L);

        RadioGroup.OnCheckedChangeListener O=new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch ( rg.getCheckedRadioButtonId()){
                    case R.id.Red: l.setBackgroundColor(Color.RED);
                    case R.id.Blue: l.setBackgroundColor(Color.BLUE);
                    case R.id.Green: l.setBackgroundColor(Color.GREEN);
                }
            }
        };
        blue.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) O);
        red.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) O);
        green.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) O);

    }
}
