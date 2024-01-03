package com.example.mid09;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;
    RadioGroup rg;
    RadioButton r1,r2,r3;
    ToggleButton tg1,tg2;
    EditText ed;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.T1);
        t2=(TextView)findViewById(R.id.T2);
        rg=(RadioGroup)findViewById(R.id.Rg);
        r1=(RadioButton)findViewById(R.id.R1);
        r2=(RadioButton)findViewById(R.id.R2);
        r3=(RadioButton)findViewById(R.id.R3);
        tg1=(ToggleButton)findViewById(R.id.Tg1);
        tg2=(ToggleButton)findViewById(R.id.Tg2);
        ed=(EditText)findViewById(R.id.Ed);
        b1=(Button)findViewById(R.id.B1);
        b2=(Button)findViewById(R.id.B2);
        b3=(Button)findViewById(R.id.B3);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (rg.getCheckedRadioButtonId()){
                    case R.id.R1: t1.setTextColor(Color.RED);
                    break;
                    case R.id.R3: t1.setTextColor(Color.BLUE);
                        break;
                    case R.id.R2: t1.setTextColor(Color.GREEN);
                        break;
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),ed.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),Integer.toString(ed.length()),Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
ed.setText(null);            }
        });
    }
}
