package com.example.app_hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GaleriaActivity5 extends AppCompatActivity implements View.OnClickListener {

    private ImageView f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria5);

        f1=findViewById(R.id.foto1);
        f2=findViewById(R.id.foto2);
        f3=findViewById(R.id.foto3);
        f4=findViewById(R.id.foto4);
        f5=findViewById(R.id.foto5);
        f6=findViewById(R.id.foto6);
        f7=findViewById(R.id.foto7);
        f8=findViewById(R.id.foto8);
        f9=findViewById(R.id.foto9);
        f10=findViewById(R.id.foto10);

        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        f3.setOnClickListener(this);
        f4.setOnClickListener(this);
        f5.setOnClickListener(this);
        f6.setOnClickListener(this);
        f7.setOnClickListener(this);
        f8.setOnClickListener(this);
        f9.setOnClickListener(this);
        f10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),FotosActivity6.class).putExtra("galeria",view.getId()));
    }
}