package com.example.finanzas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    private Button bguardar;

    boolean botonPresionado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        bguardar=findViewById(R.id.btnguardar);

        bguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!botonPresionado){
                    finish();
                    Intent objVentana = new Intent(Inicio.this, MainActivity.class);
                    startActivity(objVentana);
                }


            }
        });
    }
    @Override
    public void onBackPressed() {
        botonPresionado = true;
        super.onBackPressed();
    }
}

