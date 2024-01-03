package com.example.mid05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.function.ToDoubleFunction;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;
    EditText ed;
    ToggleButton tg;
    Button a,b,red,green,blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.T1);
        t2=(TextView)findViewById(R.id.T2);
ed=(EditText)findViewById(R.id.Ed);
tg=(ToggleButton)findViewById(R.id.Tg);
a=(Button)findViewById(R.id.A);
        b=(Button)findViewById(R.id.B);
        red=(Button)findViewById(R.id.Red);
        green=(Button)findViewById(R.id.Green);
        blue=(Button)findViewById(R.id.Blue);

        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String U=ed.getText().toString().toUpperCase();
                ed.setText(U);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(0);
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I=new Intent(MainActivity.this,activity)
            }
        });


    }
}
