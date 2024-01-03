package com.example.mobileprogramming_deliever;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class Chicken extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken);

        ImageView btneat = findViewById(R.id.BtnEat);
        ImageView btnback=findViewById(R.id.BtnBack);
        final CheckBox ch1 = findViewById(R.id.Ch1);
        final CheckBox ch2 = findViewById(R.id.Ch2);
        final CheckBox ch3 = findViewById(R.id.Ch3);
        final CheckBox ch4 = findViewById(R.id.Ch4);
        final CheckBox ch5 = findViewById(R.id.Ch5);

        TabHost tabhost = getTabHost();

        TabSpec menu = tabhost.newTabSpec("Menu").setIndicator("메뉴");
        menu.setContent(R.id.Menu);
        tabhost.addTab(menu);

        TabSpec review=tabhost.newTabSpec("Review").setIndicator("리뷰");
        review.setContent(R.id.Review);
        tabhost.addTab(review);
        tabhost.setCurrentTab(0);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itback=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(itback);
            }
        });
        btneat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked()==true||ch2.isChecked()==true||ch3.isChecked()==true||ch4.isChecked()==true||ch5.isChecked()==true){
                    Intent iteat=new Intent(getApplicationContext(),End.class);
                    startActivity(iteat);
                }
                else{
                    Toast.makeText(getApplicationContext(),"메뉴를 선택해 주세요",Toast.LENGTH_SHORT).show();
                }
            }
        });
        final TextView tv=findViewById(R.id.Tv);
        final RatingBar ra=findViewById(R.id.Ra);
        RadioGroup rgp=findViewById(R.id.Rgp);

        tv.setVisibility(View.INVISIBLE); ra.setVisibility(View.INVISIBLE);

        rgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.Yes:
                        tv.setVisibility(View.VISIBLE); ra.setVisibility(View.VISIBLE);
                        break;
                    case R.id.No: tv.setVisibility(View.INVISIBLE);ra.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(),"먼저 식사를 하신 후 리뷰를 작성해주세요",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}