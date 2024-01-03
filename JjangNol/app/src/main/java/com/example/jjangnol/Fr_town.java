package com.example.jjangnol;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fr_town extends Fragment { //Fragment 상속
    public Fr_town(){}  //꼭 필요
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //﻿프래그먼트 클래스가 Fragment 상속해야 onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 오버라이드 가능﻿
        view= inflater.inflate(R.layout.frag_town,container,false);  //﻿inflater로 해당 xml layout inflate
        return view;
    }
}
