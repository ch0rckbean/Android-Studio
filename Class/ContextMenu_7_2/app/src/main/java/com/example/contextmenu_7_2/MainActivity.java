package com.example.contextmenu_7_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout bl= findViewById(R.id.Bl);
    Button b1=findViewById(R.id.btn1);
    Button b2=findViewById(R.id.btn2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu(b1);
        registerForContextMenu(b2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu,v,menuInfo);
        MenuInflater MI=getMenuInflater();
        if(v==b1){menu.setHeaderTitle("배경색 변경");
        MI.inflate(R.menu.menu1,menu);
    }
        if (v == b2){
            menu.setHeaderTitle("버튼 번경");
            MI.inflate(R.menu.menu2,menu);
        }
        }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.R:
                bl.setBackgroundColor(Color.RED);
                return true;
            case R.id.G:
                bl.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.B:
                bl.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.Rt:
                b2.setRotation(45);
                return true;
            case R.id.Zoom:
                b2.setScaleX(2);
                return true;
        }
        return false;
    }
}
