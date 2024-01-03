package com.example.useoin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondPage extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        TextView white, my,tv1,tv2;
        white=(TextView)findViewById(R.id.White);
        my=(TextView)findViewById(R.id.My);
        tv1=(TextView)findViewById(R.id.Tv1);
        tv2=(TextView)findViewById(R.id.Tv2);

        LinearLayout l1,l2;
        l1=findViewById(R.id.L1);
        l2=findViewById(R.id.L2);

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),WhiteNoise.class);
                startActivity(it);
            }
        });
       tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),WhiteNoise.class);
                startActivity(it);
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),WhiteNoise.class);
                startActivity(it);
            }
        });

        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),MyPage.class);
                startActivity(it);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),MyPage.class);
                startActivity(it);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),MyPage.class);
                startActivity(it);
            }
        });
    }
}
