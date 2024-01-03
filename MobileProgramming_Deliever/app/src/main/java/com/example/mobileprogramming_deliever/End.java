package com.example.mobileprogramming_deliever;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class End extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);

        final RadioGroup rg=findViewById(R.id.Rg);
        final RadioButton rb1=findViewById(R.id.Rb1);
        final RadioButton rb2=findViewById(R.id.Rb2);
        final RadioButton rb3=findViewById(R.id.Rb3);
        final RadioButton rb4=findViewById(R.id.Rb4);
        Button edit=findViewById(R.id.Edit);
        Button let=findViewById(R.id.Let);
        final EditText edtadd=findViewById(R.id.EdtAdd);

        let.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()==true||rb2.isChecked()==true||rb3.isChecked()==true||rb4.isChecked()==true)
                {   Intent itlet=new Intent(getApplicationContext(),Let.class);
                    startActivity(itlet); }
                 else {Toast.makeText(getApplicationContext(),"결제방법을 선택 해주세요",Toast.LENGTH_SHORT).show();}
        }});
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();            }
        });
    }}
