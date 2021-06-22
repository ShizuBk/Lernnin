package com.example.lernnin2.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lernnin2.MainActivity;
import com.example.lernnin2.R;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText user,pass;
    Button btnLogin,btnRegistro;
    daUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=(EditText) findViewById(R.id.username);
        pass=(EditText) findViewById(R.id.password);
        btnLogin=(Button) findViewById(R.id.login);
        btnRegistro=(Button) findViewById(R.id.registrarse);

        btnRegistro.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

        dao=new daUsuario(this);

        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(pass.getText().toString().isEmpty()!=true){
                    btnLogin.setEnabled(true);
                }
            }
        });

        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(user.getText().toString().isEmpty()!=true){
                    btnLogin.setEnabled(true);
                }
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                String u = user.getText().toString();
                String p = pass.getText().toString();
                if (dao.login(u, p) == 1) {
                    Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();
                    Intent inicio = new Intent(this, MainActivity.class);
                    //inicio.putExtra("Email",u);
                    startActivity(inicio);
                }

                break;
            case R.id.registrarse:
                Intent registro = new Intent(this, Registro.class);
                startActivity(registro);
                break;
        }
    }
}
