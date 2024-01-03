package com.example.yurijuri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Category extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        TextView seoul=findViewById(R.id.Seoul);
        TextView incheon=findViewById(R.id.Incheon);
        TextView sokcho=findViewById(R.id.Sokcho);
        TextView busan=findViewById(R.id.Busan);

        seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),SeoulMain.class);
                startActivity(it);
            }
        });
        incheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),IncheonMain.class);
                startActivity(it);
            }
        });
        sokcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),SokchoMain.class);
                startActivity(it);
            }
        });
        busan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),BusanMain.class);
                startActivity(it);
            }
        });
        ImageView osi=findViewById(R.id.Osi);
        osi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"이시대 최고의 귀요미들 ><",Toast.LENGTH_SHORT).show();
            }
        });
    }
}