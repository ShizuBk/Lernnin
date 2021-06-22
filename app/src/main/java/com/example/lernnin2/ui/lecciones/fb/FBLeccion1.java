package com.example.lernnin2.ui.lecciones.fb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lernnin2.R;

public class FBLeccion1 extends AppCompatActivity implements View.OnClickListener{
    // Variables u objetos a utilizar
    int contador = 0;
    TextView t1, t2,t3;
    TextView tope, texto;
    ImageView silueta;
    float pos=800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbleccion1);

        // Vincular la interfaz grafica con los objetos creados
        t1 = (TextView)findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView2);
        tope = (TextView)findViewById(R.id.textView9);
        silueta= (ImageView)findViewById(R.id.imgGatito);
        silueta.setOnClickListener(this);


        // En este segmento se bloquea el acceso al teclado y la edición de los objetos EditText.
        //t1.setInputType(InputType.TYPE_NULL);
        //t2.setInputType(InputType.TYPE_NULL);
        //t2.setInputType(InputType.TYPE_NULL);


        //En este segmento de código se hace la respuesta al evento escuchador de los dos botones.
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgGatito:
                if (contador == 8){
                    tope.setText("Pila llena");
                } else{
                    contador++;
                    tope.setY(pos -=100);
                    switch (contador){
                        case 1 : t1.setText("La programación parece complicada por el hecho de que " +
                                "lo relacionamos con el mundo digital y hacer funcionar las computadoras.");break;

                        case 2 : t2.setText("Per la verdad esta alejada de eso");break;
                        case 3 : t3.setText("Asi que empecemos con cosas sencillas y simples");break;


                    }
                }
                break;

        }
    }
}