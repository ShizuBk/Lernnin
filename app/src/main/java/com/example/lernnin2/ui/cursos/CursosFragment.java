package com.example.lernnin2.ui.cursos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.lernnin2.R;
import com.example.lernnin2.ui.lecciones.fb.CFundamentosBasicos;


public class CursosFragment extends Fragment{
    public CursosFragment(){

    }

    Button btnCFb;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceOf){

        view=inflater.inflate(R.layout.fragment_cursos,container,false);

        btnCFb=(Button) view.findViewById(R.id.buttonFB);
        
        btnCFb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getActivity(), CFundamentosBasicos.class);
                startActivity(intent);
            }
        });
        
        return view;
    }


}
