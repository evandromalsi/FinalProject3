package com.malsi.finalproject3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Register(View view) {
        startActivity(new Intent(MainActivity.this,RegisterUser.class));
    }

    public void login(View view) {
        startActivity(new Intent(MainActivity.this, com.malsi.finalproject3.LoginUser.class));
    }

    public void loginadmin(View view) {startActivity(new Intent(MainActivity.this, com.malsi.finalproject3.LoginAdmin.class));
    }

    public void loginstaff(View view) {startActivity(new Intent(MainActivity.this, LoginStaff.class));
    }

    public void infotoko(View view) {startActivity(new Intent(MainActivity.this, aboutPages.class));
    }
}