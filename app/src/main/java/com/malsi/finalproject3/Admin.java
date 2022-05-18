package com.malsi.finalproject3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void datastaff(View view) {
        startActivity(new Intent(Admin.this, com.malsi.finalproject3.DataStaff.class));
    }

    public void datastock(View view) {
        startActivity(new Intent(Admin.this, com.malsi.finalproject3.DataStock.class));
    }
}