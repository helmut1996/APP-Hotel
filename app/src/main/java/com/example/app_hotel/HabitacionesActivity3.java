package com.example.app_hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;

public class HabitacionesActivity3 extends AppCompatActivity implements View.OnClickListener{

    private Button _btnsinple,_btndoble,_btntriple,_btnfamiliar,_btnpersonal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitaciones3);
        _btnsinple=findViewById(R.id.btnsimple);
        _btndoble=findViewById(R.id.btndoble);
        _btntriple=findViewById(R.id.btntrple);
        _btnfamiliar=findViewById(R.id.btnFamiliar);
        _btnpersonal=findViewById(R.id.btnpersonal);

        _btnsinple.setOnClickListener(this);
        _btndoble.setOnClickListener(this);
        _btntriple.setOnClickListener(this);
        _btnfamiliar.setOnClickListener(this);
        _btnpersonal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnFamiliar:
                Lanzarwhatsapp("88541239");
                break;
            case R.id.btnsimple:
                Lanzarwhatsapp("88541239");
                break;
            case R.id.btndoble:
                Lanzarwhatsapp("88541239");
                break;
            case R.id.btntrple:
                Lanzarwhatsapp("88541239");
                break;
            case R.id.btnpersonal:
                Lanzarwhatsapp("88541239");
                break;


        }
    }

    private void Lanzarwhatsapp(String telefono) {
        Intent _intencion = new Intent("android.intent.action.MAIN");
        _intencion.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
        _intencion.putExtra("jid", PhoneNumberUtils.stripSeparators("505" + telefono)+"@s.whatsapp.net");
        startActivity(_intencion);
    }
}