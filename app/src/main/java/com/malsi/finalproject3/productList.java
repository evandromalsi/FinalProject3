package com.malsi.finalproject3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class productList extends AppCompatActivity {
    TextView txtShirt;
    TextView txtFormals;
    TextView txtBottomWear;
    TextView txtShoes;
    LinearLayout shirt,formals,bottomWear,shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        getSupportActionBar().hide();
        txtShirt = findViewById(R.id.txtshirt);
        txtFormals = findViewById(R.id.txtformal);
        txtBottomWear = findViewById(R.id.txtbottomwear);
        txtShoes = findViewById(R.id.txtshoes);
        shirt = findViewById(R.id.tShirt);
        formals = findViewById(R.id.formalClothes);
        bottomWear = findViewById(R.id.bottomWear);
        shoes = findViewById(R.id.shoes);

        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            int resShirt = bundle.getInt("tShirt");
            shirt.setBackgroundResource(resShirt);

            int resFormals = bundle.getInt("formals");
            formals.setBackgroundResource(resFormals);

            int resBottomWear = bundle.getInt("bottomwear");
            bottomWear.setBackgroundResource(resBottomWear);

            int resShoes = bundle.getInt("shoes");
            shoes.setBackgroundResource(resShoes);
        }

        txtShirt.setOnClickListener( v ->{
            Intent intent = new Intent(this, previewList.class);
            intent.putExtra("foto", R.drawable.samyang);
            intent.putExtra("nama", "Samyang");
            intent.putExtra("harga", "20.000");
            intent.putExtra("foto1", R.drawable.chisung);
            intent.putExtra("nama1", "Chisung");
            intent.putExtra("harga1", "15.000");
            startActivity(intent);
        });

        txtFormals.setOnClickListener( v -> {
            Intent intent = new Intent(this, previewList.class);
            intent.putExtra("foto", R.drawable.topoki);
            intent.putExtra("nama", "Topokki");
            intent.putExtra("harga", "35.000");
            intent.putExtra("foto1", R.drawable.olatte);
            intent.putExtra("nama1", "Olatte");
            intent.putExtra("harga1", "10.000");
            startActivity(intent);
        });

        txtBottomWear.setOnClickListener(v -> {
            Intent intent = new Intent(this, previewList.class);
            intent.putExtra("foto", R.drawable.rabboki);
            intent.putExtra("nama", "Rabboki");
            intent.putExtra("harga", "40.000");
            intent.putExtra("foto1", R.drawable.soju);
            intent.putExtra("nama1", "Soju");
            intent.putExtra("harga1", "40.000");
            startActivity(intent);
        });

        txtShoes.setOnClickListener(v -> {
            Intent intent = new Intent(this, previewList.class);
            intent.putExtra("foto", R.drawable.kimchi);
            intent.putExtra("nama", "Kimchi");
            intent.putExtra("harga", "25.000");
            intent.putExtra("foto1", R.drawable.milkis);
            intent.putExtra("nama1", "milkis");
            intent.putExtra("harga1", "10.000");
            startActivity(intent);
        });
    }
}