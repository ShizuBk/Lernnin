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

    View view;
    Button btnL1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceOf){

        view=inflater.inflate(R.layout.fragment_cursos,container,false);

        btnL1=(Button) view.findViewById(R.id.buttonFB);

        btnL1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getActivity(), FbL1.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
