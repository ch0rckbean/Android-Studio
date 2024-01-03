package com.example.jjangnol;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class Frag extends Fragment {
    public Frag(){}
    View view;

    @Override  //Fragment 상속해야 OnCreateView 오버라이드 가능
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.frag,container,false);
        return view;
    }
}
