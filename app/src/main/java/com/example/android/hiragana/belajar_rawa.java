package com.example.android.hiragana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ideapad 310 on 12/26/2017.
 */

public class belajar_rawa extends AppCompatActivity {
    ImageView imgTulis;
    TextView txtTulis;
    int suara = R.raw.ra;
    MediaPlayer mp;
    ImageButton ra, ri, ru, re, ro, wa, wo, n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_rawa);

        txtTulis = (TextView) findViewById(R.id.txtTulis);
        imgTulis = (ImageView) findViewById(R.id.imgTulis);

        ImageButton btnSuara = (ImageButton) findViewById(R.id.btnSuara);
        btnSuara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(belajar_rawa.this, suara);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ra = (ImageButton) findViewById(R.id.ra_t);
        ra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t_p);
                ri.setImageResource(R.drawable.ri_t);
                ru.setImageResource(R.drawable.ru_t);
                re.setImageResource(R.drawable.re_t);
                ro.setImageResource(R.drawable.ro_t);
                wa.setImageResource(R.drawable.wa_t);
                wo.setImageResource(R.drawable.wo_t);
                n.setImageResource(R.drawable.n_t);

                imgTulis.setImageResource(R.drawable.raj);
                suara = R.raw.ra;
                txtTulis.setText("Ra");
            }
        });

        ri = (ImageButton) findViewById(R.id.ri_t);
        ri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t);
                ri.setImageResource(R.drawable.ri_t_p);
                ru.setImageResource(R.drawable.ru_t);
                re.setImageResource(R.drawable.re_t);
                ro.setImageResource(R.drawable.ro_t);
                wa.setImageResource(R.drawable.wa_t);
                wo.setImageResource(R.drawable.wo_t);
                n.setImageResource(R.drawable.n_t);

                imgTulis.setImageResource(R.drawable.rij);
                suara = R.raw.ri;
                txtTulis.setText("Ri");
            }
        });

        ru = (ImageButton) findViewById(R.id.ru_t);
        ru.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t);
                ri.setImageResource(R.drawable.ri_t);
                ru.setImageResource(R.drawable.ru_t_p);
                re.setImageResource(R.drawable.re_t);
                ro.setImageResource(R.drawable.ro_t);
                wa.setImageResource(R.drawable.wa_t);
                wo.setImageResource(R.drawable.wo_t);
                n.setImageResource(R.drawable.n_t);

                imgTulis.setImageResource(R.drawable.ruj);
                suara = R.raw.ru;
                txtTulis.setText("Ru");
            }
        });

        re = (ImageButton) findViewById(R.id.re_t);
        re.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t);
                ri.setImageResource(R.drawable.ri_t);
                ru.setImageResource(R.drawable.ru_t);
                re.setImageResource(R.drawable.re_t_p);
                ro.setImageResource(R.drawable.ro_t);
                wa.setImageResource(R.drawable.wa_t);
                wo.setImageResource(R.drawable.wo_t);
                n.setImageResource(R.drawable.n_t);

                imgTulis.setImageResource(R.drawable.rej);
                suara = R.raw.re;
                txtTulis.setText("Re");
            }
        });

        ro = (ImageButton) findViewById(R.id.ro_t);
        ro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t);
                ri.setImageResource(R.drawable.ri_t);
                ru.setImageResource(R.drawable.ru_t);
                re.setImageResource(R.drawable.re_t);
                ro.setImageResource(R.drawable.ro_t_p);
                wa.setImageResource(R.drawable.wa_t);
                wo.setImageResource(R.drawable.wo_t);
                n.setImageResource(R.drawable.n_t);

                imgTulis.setImageResource(R.drawable.roj);
                suara = R.raw.ro;
                txtTulis.setText("Ro");
            }
        });

        wa = (ImageButton) findViewById(R.id.wa_t);
        wa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t);
                ri.setImageResource(R.drawable.ri_t);
                ru.setImageResource(R.drawable.ru_t);
                re.setImageResource(R.drawable.re_t);
                ro.setImageResource(R.drawable.ro_t);
                wa.setImageResource(R.drawable.wa_t_p);
                wo.setImageResource(R.drawable.wo_t);
                n.setImageResource(R.drawable.n_t);

                imgTulis.setImageResource(R.drawable.waj);
                suara = R.raw.wa;
                txtTulis.setText("Wa");
            }
        });

        wo = (ImageButton) findViewById(R.id.wo_t);
        wo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t);
                ri.setImageResource(R.drawable.ri_t);
                ru.setImageResource(R.drawable.ru_t);
                re.setImageResource(R.drawable.re_t);
                ro.setImageResource(R.drawable.ro_t);
                wa.setImageResource(R.drawable.wa_t);
                wo.setImageResource(R.drawable.wo_t_p);
                n.setImageResource(R.drawable.n_t);

                imgTulis.setImageResource(R.drawable.woj);
                suara = R.raw.wo;
                txtTulis.setText("Wo");
            }
        });

        n = (ImageButton) findViewById(R.id.n_t);
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ra.setImageResource(R.drawable.ra_t);
                ri.setImageResource(R.drawable.ri_t);
                ru.setImageResource(R.drawable.ru_t);
                re.setImageResource(R.drawable.re_t);
                ro.setImageResource(R.drawable.ro_t);
                wa.setImageResource(R.drawable.wa_t);
                wo.setImageResource(R.drawable.wo_t);
                n.setImageResource(R.drawable.n_t_p);

                imgTulis.setImageResource(R.drawable.nj);
                suara = R.raw.n;
                txtTulis.setText("N");
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar_rawa.this, belajar.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}

