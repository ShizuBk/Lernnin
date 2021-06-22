package com.example.lernnin2.ui.lecciones.fb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lernnin2.MainActivity;
import com.example.lernnin2.R;
import com.example.lernnin2.ui.login.Registro;

public class CFundamentosBasicos extends AppCompatActivity implements View.OnClickListener{

    Button btnLogica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfundamentos_basicos);
        btnLogica=(Button) findViewById(R.id.leccion1);
        btnLogica.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.leccion1:
            Intent intent=new Intent(this,FBLeccion1.class);
            startActivity(intent);
        }

    }
}