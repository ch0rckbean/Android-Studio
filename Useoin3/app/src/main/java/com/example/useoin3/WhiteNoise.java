package com.example.useoin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WhiteNoise extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whitenoise);

        TextView rain,bug,wave,forest;
        rain=(TextView)findViewById(R.id.Rain);
        bug=(TextView)findViewById(R.id.Bug);
        wave=(TextView)findViewById(R.id.Wave);
        forest=(TextView)findViewById(R.id.Forest);

        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Rain.class);
                startActivity(it);
            }
        });
        wave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Wave.class);
                startActivity(it);
            }
        });
        bug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Bug.class);
                startActivity(it);
            }
        });
        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Forest.class);
                startActivity(it);
            }
        });
    }
}
