package com.example.android.hiragana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


public class belajar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar);

        Button aKa = findViewById(R.id.belajar_aKa);
        aKa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_aka.class);
                startActivity(i);
            }
        });

        Button saTa = findViewById(R.id.belajar_saTa);
        saTa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_sata.class);
                startActivity(i);
            }
        });

        Button naHa = findViewById(R.id.belajar_naHa);
        naHa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_naha.class);
                startActivity(i);
            }
        });

        Button maYa = findViewById(R.id.belajar_maYa);
        maYa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_maya.class);
                startActivity(i);
            }
        });

        Button raWa = findViewById(R.id.belajar_raWa);
        raWa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_rawa.class);
                startActivity(i);
            }
        });

        Button tenMa1 = findViewById(R.id.belajar_tenMa1);
        tenMa1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_tenma1.class);
                startActivity(i);
            }
        });

        Button tenMa2 = findViewById(R.id.belajar_tenMa2);
        tenMa2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_tenma2.class);
                startActivity(i);
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar.this, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}
