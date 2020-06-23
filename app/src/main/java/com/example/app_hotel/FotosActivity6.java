package com.example.app_hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class FotosActivity6 extends AppCompatActivity {

    private ImageView _foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos6);

        _foto=findViewById(R.id.foto);

        String foto = "galeria" + getIntent().getExtras().getString("galeria");
        _foto.setImageResource(getResources().getIdentifier(foto,"drawable",getPackageName()));
    }
}