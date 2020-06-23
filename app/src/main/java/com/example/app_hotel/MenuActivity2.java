package com.example.app_hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
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
                Reservas("88541239");
            case R.id.btnGaleria:
                startActivity( new Intent(getApplicationContext(),GaleriaActivity5.class));
                break;
            case R.id.btnNosotros:
                startActivity( new Intent(getApplicationContext(),NosotrosActivity4.class));
                break;
        }
    }

    public void googleMap(){
    double latitude = 11.808228;
    double longitude = -86.528797;

    String label = "Hotel Colins";

    String uriBegin="geo:" +latitude+ ","+ longitude;
    String query =latitude+ "," + longitude + "("+ label + ")";
    String encodedQuery = Uri.encode(query);
    String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri uri=Uri.parse(uriString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(mapIntent);
    }
    public void Reservas(String telefono){
        Intent _intencion = new Intent("android.intent.action.MAIN");
        _intencion.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
        _intencion.putExtra(Intent.EXTRA_TEXT,"Hola Una Consulta");
        _intencion.putExtra("jid", PhoneNumberUtils.stripSeparators("505" + telefono)+"@s.whatsapp.net");
        startActivity(_intencion);
    }
}