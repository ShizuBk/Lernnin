package com.example.lernnin2.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lernnin2.R;

public class Registro extends AppCompatActivity implements View.OnClickListener{
    EditText nombre,email,vemail,pass,vpass;
    Button reg;
    daUsuario dao;
    ImageView leftIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre=(EditText) findViewById(R.id.rNombre);
        email=(EditText) findViewById(R.id.rEmail);
        vemail=(EditText) findViewById(R.id.rVEmail);
        pass=(EditText) findViewById(R.id.rPass);
        vpass=(EditText) findViewById(R.id.rVPass);
        reg=(Button) findViewById(R.id.botonRegistro);
        dao=new daUsuario(this);
        reg.setOnClickListener(this);

        leftIcon=(ImageView) findViewById(R.id.leftIcon);
        leftIcon.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        String em1, em2, p1, p2;
        em1 = email.getText().toString();
        em2 = vemail.getText().toString();
        p1 = pass.getText().toString();
        p2 = vpass.getText().toString();

        switch (v.getId()) {
            case R.id.botonRegistro:
                if ((em1.equals(em2)) && (p1.equals(p2))) {
                    Usuario user = new Usuario();
                    user.setNombre(nombre.getText().toString());
                    user.setPass(pass.getText().toString());
                    user.setEmail(email.getText().toString());
                    if (!user.isNull()) {
                        Toast.makeText(this, "Rellene todos los campos", Toast.LENGTH_LONG).show();
                    } else if (dao.insertUsuario(user)) {
                        Toast.makeText(this, "¡Registro Exitoso!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(this, LoginActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(this, "Este E-mail ya está registrado", Toast.LENGTH_LONG).show();
                    }
                } else if (em1.equals(em2) == false) {
                    Toast.makeText(this, "El email proporcionado no coincide", Toast.LENGTH_LONG).show();
                } else if (p1.equals(p2) == false) {
                    Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.leftIcon:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();

        }


    }

}