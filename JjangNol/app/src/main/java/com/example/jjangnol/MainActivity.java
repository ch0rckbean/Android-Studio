package com.example.jjangnol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView face=(ImageView)findViewById(R.id.face);
        final ImageView face2=(ImageView)findViewById(R.id.face2);
        ImageView play=(ImageView)findViewById(R.id.Play);
        ImageView stop=(ImageView)findViewById(R.id.Stop);

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                face.setVisibility(View.INVISIBLE);
                face2.setVisibility(View.VISIBLE);
                Intent it=new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(it);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(getApplicationContext(),MusicService.class));
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getApplicationContext(),MusicService.class));
            }
        });
    }
}
