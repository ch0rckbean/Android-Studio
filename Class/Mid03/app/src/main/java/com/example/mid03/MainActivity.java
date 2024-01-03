package com.example.mid03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView t1,t2;
        CheckBox c;
        RadioGroup rg;
        RadioButton r1,r2,r3;
        ImageView dog,cat,rabbit;
        Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.T1);
        t2=(TextView)findViewById(R.id.T2);
c=(CheckBox)findViewById(R.id.C);
        rg=(RadioGroup) findViewById(R.id.Rg);
        r1=(RadioButton) findViewById(R.id.R1);
        r2=(RadioButton) findViewById(R.id.R2);
        r3=(RadioButton) findViewById(R.id.R3);
dog=(ImageView)findViewById(R.id.Dog);
        cat=(ImageView)findViewById(R.id.Cat);
        rabbit=(ImageView)findViewById(R.id.Rabbit);
btn=(Button)findViewById(R.id.Btn);

    c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            t2.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            btn.setVisibility(View.VISIBLE);
        }
    });
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             switch (rg.getCheckedRadioButtonId()){
                 case R.id.R1:dog.setVisibility(View.VISIBLE);cat.setVisibility(View.INVISIBLE);rabbit.setVisibility(View.INVISIBLE);
                 break;
                 case R.id.R2:cat.setVisibility(View.VISIBLE);dog.setVisibility(View.INVISIBLE);rabbit.setVisibility(View.INVISIBLE);
                 break;
                 case R.id.R3:rabbit.setVisibility(View.VISIBLE);cat.setVisibility(View.INVISIBLE);dog.setVisibility(View.INVISIBLE);
             break;
             }
         }
     });
    }
}
