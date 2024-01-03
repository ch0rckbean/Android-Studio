package com.example.jjangnol;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SecondActivity extends AppCompatActivity{  // AppCompatActivity(안드로이드 하위버전 지원) 상속
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button btnCloth=(Button)findViewById(R.id.BtnCloth);
        Button btnFridge=(Button)findViewById(R.id.BtnFridge);
        Button btnTown=(Button)findViewById(R.id.BtnTown);

        final Fragment fr_cloth=new Fragment();  //프래그먼트 객체 생성
        final Fragment fr_fridge=new Fragment();
        final Fragment fr_town=new Fragment();


        btnCloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //프래그먼트 이벤트 구현은 이벤트 실행 할 때마다 해야 함
                FragmentManager fm=getSupportFragmentManager();
                //프래그먼트 매니저 변수 선언 후, getSupportFragmentManager(매니저 어세스) 실행
                FragmentTransaction fta=fm.beginTransaction();
                //FragmentTransaction 변수 선언 후, 매니저.beginTransaction 실행해 넣기
                fta.replace(R.id.frag,Fr_cloth.class,null);
                //FragmentTransaction 변수.replace(기존 프래그먼트, 교체 프래그먼트 파라미터)
                fta.setReorderingAllowed(true);fta.addToBackStack("name");
                fta.commit();  // 5. FragmentTransaction 변수. commit 메소드
            }
        });

        btnFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();  //1. 프래그먼트 매니저 변수 선언 후, getSupportFragmentManager 메소드(매니저 어세스) 실행
                FragmentTransaction fta=fm.beginTransaction();
                fta.replace(R.id.frag,Fr_fridge.class,null);
                fta.setReorderingAllowed(true);//4. FragmentTransaction 변수 replace(기존 프래그먼트, 교체 프래그먼트 파라미터) 메소드 실행
                fta.addToBackStack("name");
                fta.commit();
            }
        });
        btnTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();  //1. 프래그먼트 매니저 변수 선언 후, getSupportFragmentManager 메소드(매니저 어세스) 실행
                FragmentTransaction fta=fm.beginTransaction();
                fta.replace(R.id.frag,Fr_town.class,null);
                fta.setReorderingAllowed(true);//4. FragmentTransaction 변수 replace(기존 프래그먼트, 교체 프래그먼트 파라미터) 메소드 실행
                fta.addToBackStack("name");
                fta.commit();
            }
        });
    }
}
