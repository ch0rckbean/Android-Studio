package com.example.useoin3;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPage extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

        TextView mm = (TextView) findViewById(R.id.mm);
        long now = System.currentTimeMillis(); //숫자 데이터 now 선언
        Date date = new Date(now); //숫자 데이터를 date 객체에 집어넣음

        SimpleDateFormat sp1 = new SimpleDateFormat("M"); //데이터 형식 선언-월
        SimpleDateFormat sp2 = new SimpleDateFormat("d"); //데이터 형식 선언-일
        SimpleDateFormat sp3 = new SimpleDateFormat("E"); //데이터 형식 선언-요일
        String month=sp1.format(date); //데이터 형식에 숫자 데이터를 품은 date 객체를 집어넣고 문자열로 선언
        String day=sp2.format(date);
        String yoil=sp3.format(date);
        mm.setText("●  " + month+" 월"+day+" 일 "+yoil);  //원하는 형태로 출력

    }
}
