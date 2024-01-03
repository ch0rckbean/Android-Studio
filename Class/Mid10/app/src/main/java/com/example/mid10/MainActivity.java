package com.example.mid10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    ImageView I1,I2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.B1);
        b2=(Button)findViewById(R.id.B2);
I1=(ImageView)findViewById(R.id.I1);
        I2=(ImageView)findViewById(R.id.I2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I1.setVisibility(View.INVISIBLE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I1.setImageResource(0);
            }
        });


    }
}
