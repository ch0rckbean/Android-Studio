package com.example.mobileprogramming_deliever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button full=findViewById(R.id.Full);
        final Button hungry=findViewById(R.id.Hungry);
        final Chronometer chr=findViewById(R.id.Chr);

        hungry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(it);
            }
        });
        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hungry.setVisibility(View.INVISIBLE); full.setVisibility(View.INVISIBLE);
                chr.setBase(SystemClock.elapsedRealtime());chr.start();chr.setVisibility(View.VISIBLE);
            }
        });
    }
}
