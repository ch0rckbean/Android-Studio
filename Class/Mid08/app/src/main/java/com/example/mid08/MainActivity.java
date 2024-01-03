package com.example.mid08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;
    RadioGroup rg;
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3,c4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SelfCheck");

        t1=(TextView)findViewById(R.id.T1);
        t2=(TextView)findViewById(R.id.T2);
        rg=(RadioGroup)findViewById(R.id.Rg);
        r1=(RadioButton)findViewById(R.id.R1);
        r2=(RadioButton)findViewById(R.id.R2);
        c1=(CheckBox)findViewById(R.id.C1);
        c2=(CheckBox)findViewById(R.id.C2);
        c3=(CheckBox)findViewById(R.id.C3);
        c4=(CheckBox)findViewById(R.id.C4);
        btn=(Button)findViewById(R.id.Btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()==true&c1.isChecked()==true){
                    Toast.makeText(getApplicationContext(),"등교 가능합니다.",Toast.LENGTH_SHORT).show();
                    rg.clearCheck();c1.setChecked(false);c2.setChecked(false);c3.setChecked(false);c4.setChecked(false);
                }else if(r2.isChecked()==true||c2.isChecked()==true||c3.isChecked()==true||c4.isChecked()==true){
                    Toast.makeText(getApplicationContext(),"등교할 수 없습니다.",Toast.LENGTH_SHORT).show();
                    rg.clearCheck();c1.setChecked(false);c2.setChecked(false);c3.setChecked(false);c4.setChecked(false);
                }else if(r1.isChecked()==true||r2.isChecked()==true&c2.isChecked()==false||c3.isChecked()==false||c4.isChecked()==false||c3.isChecked()==false){
                    Toast.makeText(getApplicationContext(),"항목을 모두 선택해주세요.",Toast.LENGTH_SHORT).show();
                    rg.clearCheck();c1.setChecked(false);c2.setChecked(false);c3.setChecked(false);c4.setChecked(false);}
                else if(c1.isChecked()==true||c2.isChecked()==true||c3.isChecked()==true||c4.isChecked()==true&&r1.isChecked()==false||r2.isChecked()==false){
                        Toast.makeText(getApplicationContext(),"등교할 수 없습니다.",Toast.LENGTH_SHORT).show();
                        rg.clearCheck();c1.setChecked(false);c2.setChecked(false);c3.setChecked(false);c4.setChecked(false);}
                else {Toast.makeText(getApplicationContext(),"항목을 선택해 주세요",Toast.LENGTH_SHORT).show();}
            }
        });
    }
}
