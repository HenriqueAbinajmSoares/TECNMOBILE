package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intentRECEBEDORA = getIntent();
        Bundle PARAMETROS = intentRECEBEDORA.getExtras();
        if(PARAMETROS != null){
            double TEMPERATURA = PARAMETROS.getDouble("key_TEMPERATURA");
            String TIPO = PARAMETROS.getString("key_TIPO");
            if(TIPO.equals("C") || TIPO.equals("c")){
                double RESULTADO = ((9/5)*TEMPERATURA)+32;
                Toast.makeText(Main2Activity.this,"Temperatura =" + RESULTADO, Toast.LENGTH_LONG).show();
            }
            else {
                double RESULTADO = (TEMPERATURA-32)/(9/5);
                Toast.makeText(Main2Activity.this,"Temperatura =" + RESULTADO, Toast.LENGTH_LONG).show();
            }

            }
        }
    }

