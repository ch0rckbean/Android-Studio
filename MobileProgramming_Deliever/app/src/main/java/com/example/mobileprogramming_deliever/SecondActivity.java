package com.example.mobileprogramming_deliever;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;

public class SecondActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        final ToggleButton btnad=findViewById(R.id.BtnAd);
        Button btnchic=findViewById(R.id.BtnChic);
        Button btnpizza=findViewById(R.id.BtnPizza);
        Button btnsushi=findViewById(R.id.BtnSushi);
        Button btnchi=findViewById(R.id.BtnChi);
        Button btndess=findViewById(R.id.BtnDess);
        ImageView chic=findViewById(R.id.Chick);
        ImageView pizza=findViewById(R.id.Pizza);
        ImageView sushi=findViewById(R.id.Sushi);
        ImageView chi=findViewById(R.id.Chi);
        ImageView dess=findViewById(R.id.Dess);
        final ViewFlipper vf=findViewById(R.id.Vf);

        vf.setFlipInterval(1000);
        btnad.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){vf.startFlipping();}
                else {vf.stopFlipping();}
            }
        });
        btnchic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(), Chicken.class);
                startActivity(Goit);
            }
        });
        chic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(), Chicken.class);
                startActivity(Goit);
            }
        });
        btnpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Pizza.class);
                startActivity(Goit);
            }
        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Pizza.class);
                startActivity(Goit);
            }
        });

        btnsushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Sushi.class);
                startActivity(Goit);
            }
        });
        sushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Sushi.class);
                startActivity(Goit);
            }
        });

        btnchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Chi.class);
                startActivity(Goit);
            }
        });
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Chi.class);
                startActivity(Goit);
            }
        });

        btndess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Dess.class);
                startActivity(Goit);
            }
        });
        dess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Goit=new Intent(getApplicationContext(),Dess.class);
                startActivity(Goit);
            }
        });
    }
}