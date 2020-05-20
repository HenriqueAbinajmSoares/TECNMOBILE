package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCALCULAROnClick(View view) {
        EditText txtTEMPERATURA = (EditText) findViewById(R.id.txtTEMPERATURA);
        EditText txtTIPO = (EditText) findViewById(R.id.txtTIPO);
        double TEMPERATURA = Double.parseDouble(txtTEMPERATURA.getText().toString());
        String TIPO = txtTIPO.getText().toString();
        Intent intentENVIADORA = new Intent(MainActivity.this ,Main2Activity.class);
        Bundle PARAMETROS = new Bundle();
        PARAMETROS.putDouble("key_TEMPERATURA",TEMPERATURA);
        PARAMETROS.putString("key_TIPO",TIPO);
        intentENVIADORA.putExtras(PARAMETROS);
        startActivity(intentENVIADORA);
    }

}
