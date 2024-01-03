package com.example.englishanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rdg=(RadioGroup)findViewById(R.id.Rdg);
        final RadioButton r1=(RadioButton)findViewById(R.id.Rd1);
        RadioButton r2=(RadioButton)findViewById(R.id.Rd2);
        RadioButton r3=(RadioButton)findViewById(R.id.Rd3);
        final TextView o=(TextView)findViewById(R.id.O);
        final TextView x=(TextView)findViewById(R.id.X);
        ImageView key=(ImageView)findViewById(R.id.Key);

        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.Rd1: x.setVisibility(View.VISIBLE); o.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.Rd2: o.setVisibility(View.VISIBLE); x. setVisibility(View.INVISIBLE);
                        break;
                    case R.id.Rd3: x.setVisibility(View.VISIBLE); o.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
