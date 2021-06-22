package com.example.lernnin2.ui.lecciones.fb;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.lernnin2.R;

public class CFb extends Fragment {
    public CFb(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceOf){
        return inflater.inflate(R.layout.fragment_cursos,container,false);

    }

}
