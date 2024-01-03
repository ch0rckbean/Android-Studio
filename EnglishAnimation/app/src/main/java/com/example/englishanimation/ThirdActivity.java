package com.example.englishanimation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        ImageView sq=(ImageView)findViewById(R.id.Sq);
        ImageView cat=(ImageView)findViewById(R.id.Cat);
        ImageView dog=(ImageView)findViewById(R.id.Dog);
        ImageView key=(ImageView)findViewById(R.id.Key);
        final TextView o=(TextView)findViewById(R.id.O);
        final TextView x=(TextView)findViewById(R.id.X);

        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setVisibility(View.VISIBLE); o.setVisibility(View.INVISIBLE);
            }
        });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setVisibility(View.VISIBLE); o.setVisibility(View.INVISIBLE);
            }
        });
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setVisibility(View.INVISIBLE); o.setVisibility(View.VISIBLE);
            }
        });
    }
}
