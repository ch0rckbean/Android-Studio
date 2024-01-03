package com.example.useoin3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Forest extends MainActivity {

    MediaPlayer mp3;
    ImageView play,pause,pre,loop;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mp3!=null){
            mp3.release();
            mp3=null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forest);

        pre=findViewById(R.id.Pre);
        play=findViewById(R.id.Play);
        pause=findViewById(R.id.Pause);
        loop=findViewById(R.id.Loop);

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),WhiteNoise.class);
                startActivity(it);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3=MediaPlayer.create(getApplicationContext(),R.raw.forest_asmr);
                mp3.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp3.isPlaying()){
                    mp3.pause();}
            }
        });
        loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.setLooping(true);
            }
        });
    }
}
