package com.example.yurijuri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IncheonMain extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incheonmain);

        ImageView lriv,utensiliv,storeiv,eventiv;
        TextView lrtv,utensiltv,storetv,eventtv;

        lriv=findViewById(R.id.LrIv);
        utensiliv=findViewById(R.id.UtensilIv);
        storeiv=findViewById(R.id.StoreIv);
        eventiv=findViewById(R.id.EventIv);
        lrtv=findViewById(R.id.LrTv);
        utensiltv=findViewById(R.id.UtensilTv);
        storetv=findViewById(R.id.StoreTv);
        eventtv=findViewById(R.id.EventTv);

        lriv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonGo.class);
                startActivity(it);
            }
        });
        lrtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonGo.class);
                startActivity(it);
            }
        });

        utensiliv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),IncheonEat.class);
                startActivity(it);
            }
        });
        utensiltv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonEat.class);
                startActivity(it);
            }
        });

        storeiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonBuy.class);
                startActivity(it);
            }
        });
        storetv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonBuy.class);
                startActivity(it);
            }
        });
        eventiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonFes.class);
                startActivity(it);
            }
        });
        eventtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonFes.class);
                startActivity(it);
            }
        });
    }
}