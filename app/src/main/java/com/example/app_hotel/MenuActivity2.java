package com.example.app_hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnHasbitacion;
    private Button btnReservas;
    private Button btnUbicacion;
    private Button btnGaleria;
    private Button btnNosotros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnHasbitacion = findViewById(R.id.btnHabitaciones);
        btnReservas = findViewById(R.id.btnReservas);
        btnUbicacion = findViewById(R.id.btnUbicacion);
        btnGaleria = findViewById(R.id.btnGaleria);
        btnNosotros = findViewById(R.id.btnNosotros);


        btnHasbitacion.setOnClickListener(this);
        btnUbicacion.setOnClickListener(this);
        btnReservas.setOnClickListener(this);
        btnGaleria.setOnClickListener(this);
        btnNosotros.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnHabitaciones:
            startActivity( new Intent(getApplicationContext(),HabitacionesActivity3.class));
            break;
            case  R.id.btnUbicacion:
             googleMap();
             break;
            case  R.id.btnReservas:
                Reservas();
            case R.id.btnGaleria:
                startActivity( new Intent(getApplicationContext(),GaleriaActivity5.class));
                break;
            case R.id.btnNosotros:
                startActivity( new Intent(getApplicationContext(),NosotrosActivity4.class));
                break;
        }
    }

    public void googleMap(){

    }
    public void Reservas(){

    }
}