package com.malsi.finalproject3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detailProduct extends AppCompatActivity {
    ImageView image;
    TextView nama,harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);
        getSupportActionBar().hide();
        image = findViewById(R.id.detailfoto);
        nama = findViewById(R.id.detailnama);
        harga = findViewById(R.id.detailharga);

        if(getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            int fotodetail = bundle.getInt("foto");
            image.setImageResource(fotodetail);
            nama.setText(bundle.getString("nama"));
            harga.setText(bundle.getString("harga"));
        }
    }
}