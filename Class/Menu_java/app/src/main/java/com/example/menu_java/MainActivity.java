package com.example.menu_java;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout bl=findViewById(R.id.Bl);
Button btn=findViewById(R.id.Btn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //0==지정하지 않음,그룹 항목 순서 제목
        menu.add(0,1,0,"배경색(빨강)");
        menu.add(0,2,0,"배경색(초록)");
        menu.add(Menu.NONE,3,Menu.NONE,"배경색(파랑)");

        SubMenu sMenu=menu.addSubMenu("버튼 번경");
        sMenu.add(0,4,0,"버튼 45도 회전");
        sMenu.add(0,5,0,"버튼 2배 확대");
    return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
switch (item.getItemId()){

    case 1:
        bl.setBackgroundColor(Color.RED);
        return true;
        case 2:
        bl.setBackgroundColor(Color.GREEN);
        return true;
    case 3:
        bl.setBackgroundColor(Color.BLUE);
        return true;
    case 4:
      btn.setRotation(45);
        return true;
    case 5:
        btn.setScaleX(2);
        return true;
}
return false;
}
    }
