package com.example.mid07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l2,l3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(LinearLayout)findViewById(R.id.L1);
        l2=(LinearLayout)findViewById(R.id.L2);
        l3=(LinearLayout)findViewById(R.id.L3);

l1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
Toast.makeText(getApplicationContext(),Integer.toString(l1.getHeight())+"X"+Integer.toString(l1.getWidth()),Toast.LENGTH_SHORT).show();    }
});
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),Integer.toString(l3.getHeight())+"X"+Integer.toString(l3.getWidth()),Toast.LENGTH_SHORT).show();    }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),Integer.toString(l2.getHeight())+"X"+Integer.toString(l2.getWidth()),Toast.LENGTH_SHORT).show();    }
        });






    }
}
