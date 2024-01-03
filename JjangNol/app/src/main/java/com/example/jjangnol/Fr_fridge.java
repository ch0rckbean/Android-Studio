package com.example.jjangnol;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fr_fridge extends Fragment {
    public Fr_fridge(){}
    View view;

    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.frag_fridge,container,false);
        return view;
    }
}
