package com.example.menu_xml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn = findViewById(R.id.Btn);
    LinearLayout baselayout = findViewById(R.id.Baselayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater MI = getMenuInflater();
        MI.inflate(R.menu.menu01,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Red:
                baselayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.Green:
                baselayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.Blue:
                baselayout.setBackgroundColor(Color.BLUE);                return true;
            case R.id.Ch:
                Toast.makeText(this,item.getItemId()+"선택",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ro45:
                btn.setRotation(45);
                return true;
            case R.id.Zoom:
                btn.setScaleX(2);
                return true;
        }
        return false;
    }
}