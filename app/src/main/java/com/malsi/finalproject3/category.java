package com.malsi.finalproject3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class category extends AppCompatActivity {
    TextView menClothing, womenClothing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().hide();
        menClothing = findViewById(R.id.mensclothing);
        womenClothing =findViewById(R.id.womensclothing);

        menClothing.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.malsi.finalproject3.productList.class);
            intent.putExtra("tShirt", R.drawable.samyang);
            intent.putExtra("formals", R.drawable.topoki);
            intent.putExtra("bottomwear", R.drawable.rabboki);
            intent.putExtra("shoes", R.drawable.kimchi);
            startActivity(intent);
        });

        womenClothing.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.malsi.finalproject3.productList.class);
            intent.putExtra("tShirt", R.drawable.chisung);
            intent.putExtra("formals", R.drawable.olatte);
            intent.putExtra("bottomwear", R.drawable.soju);
            intent.putExtra("shoes", R.drawable.milkis);
            startActivity(intent);
        });
    }
}