package com.example.englishanimation;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        ImageView meat=(ImageView)findViewById(R.id.Meat);
        ImageView onigiri=(ImageView)findViewById(R.id.Onigiri);
        ImageView okasi=(ImageView)findViewById(R.id.Okasi);
        final TextView o=(TextView)findViewById(R.id.O);
        final TextView x=(TextView)findViewById(R.id.X);
        ImageView key=(ImageView)findViewById(R.id.Key);

        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setVisibility(View.VISIBLE); o.setVisibility(View.INVISIBLE);
            }
        });
        onigiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setVisibility(View.VISIBLE); o.setVisibility(View.INVISIBLE);
            }
        });
        okasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o.setVisibility(View.VISIBLE); x.setVisibility(View.INVISIBLE);
            }
        });
        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
