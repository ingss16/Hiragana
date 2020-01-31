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

public class belajar_tenma1 extends AppCompatActivity {
    ImageView imgTulis;
    TextView txtTulis;
    int suara = R.raw.ga;
    MediaPlayer mp;
    ImageButton ga, gi, gu, ge, go, za, ji, zu, ze, zo, da, di, du, de, doo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_tenma1);

        txtTulis = (TextView) findViewById(R.id.txtTulis);
        imgTulis = (ImageView) findViewById(R.id.imgTulis);

        ImageButton btnSuara = (ImageButton) findViewById(R.id.btnSuara);
        btnSuara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(belajar_tenma1.this, suara);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ga = (ImageButton) findViewById(R.id.ga_t);
        ga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t_p);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.gaj);
                suara = R.raw.ga;
                txtTulis.setText("Ga");
            }
        });

        gi = (ImageButton) findViewById(R.id.gi_t);
        gi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t_p);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.gij);
                suara = R.raw.gi;
                txtTulis.setText("Gi");
            }
        });

        gu = (ImageButton) findViewById(R.id.gu_t);
        gu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t_p);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.guj);
                suara = R.raw.gu;
                txtTulis.setText("Gu");
            }
        });

        ge = (ImageButton) findViewById(R.id.ge_t);
        ge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t_p);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.gej);
                suara = R.raw.ge;
                txtTulis.setText("Ge");
            }
        });

        go = (ImageButton) findViewById(R.id.go_t);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t_p);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.goj);
                suara = R.raw.go;
                txtTulis.setText("Go");
            }
        });

        za = (ImageButton) findViewById(R.id.za_t);
        za.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t_p);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.zaj);
                suara = R.raw.za;
                txtTulis.setText("Za");
            }
        });

        ji = (ImageButton) findViewById(R.id.ji_t);
        ji.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t_p);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.jij);
                suara = R.raw.zi;
                txtTulis.setText("Ji");
            }
        });

        zu = (ImageButton) findViewById(R.id.zu_t);
        zu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t_p);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.zuj);
                suara = R.raw.zu;
                txtTulis.setText("Zu");
            }
        });

        ze = (ImageButton) findViewById(R.id.ze_t);
        ze.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t_p);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.zej);
                suara = R.raw.ze;
                txtTulis.setText("Ze");
            }
        });

        zo = (ImageButton) findViewById(R.id.zo_t);
        zo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t_p);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.zoj);
                suara = R.raw.zo;
                txtTulis.setText("Zo");
            }
        });

        da = (ImageButton) findViewById(R.id.da_t);
        da.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t_p);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.daj);
                suara = R.raw.da;
                txtTulis.setText("Da");
            }
        });

        di = (ImageButton) findViewById(R.id.di_t);
        di.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t_p);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.dij);
                suara = R.raw.di;
                txtTulis.setText("Di");
            }
        });

        du = (ImageButton) findViewById(R.id.du_t);
        du.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t_p);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.duj);
                suara = R.raw.du;
                txtTulis.setText("Du");
            }
        });

        de = (ImageButton) findViewById(R.id.de_t);
        de.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t_p);
                doo.setImageResource(R.drawable.do_t);

                imgTulis.setImageResource(R.drawable.dej);
                suara = R.raw.de;
                txtTulis.setText("De");
            }
        });

        doo = (ImageButton) findViewById(R.id.do_t);
        doo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ga.setImageResource(R.drawable.ga_t);
                gi.setImageResource(R.drawable.gi_t);
                gu.setImageResource(R.drawable.gu_t);
                ge.setImageResource(R.drawable.ge_t);
                go.setImageResource(R.drawable.go_t);
                za.setImageResource(R.drawable.za_t);
                ji.setImageResource(R.drawable.ji_t);
                zu.setImageResource(R.drawable.zu_t);
                ze.setImageResource(R.drawable.ze_t);
                zo.setImageResource(R.drawable.zo_t);
                da.setImageResource(R.drawable.da_t);
                di.setImageResource(R.drawable.di_t);
                du.setImageResource(R.drawable.du_t);
                de.setImageResource(R.drawable.de_t);
                doo.setImageResource(R.drawable.do_t_p);

                imgTulis.setImageResource(R.drawable.doj);
                suara = R.raw.doo;
                txtTulis.setText("Do");
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar_tenma1.this, belajar.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}

