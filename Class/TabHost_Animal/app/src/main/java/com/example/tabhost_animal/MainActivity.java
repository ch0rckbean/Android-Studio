package com.example.tabhost_animal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cat=(ImageView)findViewById(R.id.Cat);
        ImageView dog=(ImageView)findViewById(R.id.Dog);
        ImageView sq=(ImageView)findViewById(R.id.Sq);
        ImageView bear=(ImageView)findViewById(R.id.Bear);

        TabHost tabHost=getTabHost();

        TabHost.TabSpec tapSpecCat=tabHost.newTabSpec("Cat").setIndicator("고양이");
        tapSpecCat.setContent(R.id.Cat);
        tabHost.addTab(tapSpecCat);

        TabHost.TabSpec tabSpecDog=tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabSpecDog.setContent(R.id.Dog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecSq=tabHost.newTabSpec("Squirrel").setIndicator("다람쥐");
        tabSpecSq.setContent(R.id.Sq);
        tabHost.addTab(tabSpecSq);

        TabHost.TabSpec tabSpecBear=tabHost.newTabSpec("Bear").setIndicator("곰돌이");
        tabSpecBear.setContent(R.id.Bear);
        tabHost.addTab(tabSpecBear);

        tabHost.setCurrentTab(0);
    }
}
