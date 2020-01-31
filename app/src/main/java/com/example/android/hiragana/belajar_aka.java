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

public class belajar_aka extends AppCompatActivity {
    ImageView imgTulis;
    TextView txtTulis;
    int suara = R.raw.a;
    MediaPlayer mp;
    ImageButton a, i, u, e, o, ka, ki, ku, ke, ko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_aka);

        txtTulis = (TextView) findViewById(R.id.txtTulis);
        imgTulis = (ImageView) findViewById(R.id.imgTulis);

        ImageButton btnSuara = (ImageButton) findViewById(R.id.btnSuara);
        btnSuara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(belajar_aka.this, suara);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        a = (ImageButton) findViewById(R.id.a_t);
        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t_p);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.aj);
                suara = R.raw.a;
                txtTulis.setText("A");
            }
        });

        i = (ImageButton) findViewById(R.id.i_t);
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t_p);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.ij);
                suara = R.raw.i;
                txtTulis.setText("I");
            }
        });

        u = (ImageButton) findViewById(R.id.u_t);
        u.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t_p);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.uj);
                suara = R.raw.u;
                txtTulis.setText("U");
            }
        });

        e = (ImageButton) findViewById(R.id.e_t);
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t_p);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.ej);
                suara = R.raw.e;
                txtTulis.setText("E");
            }
        });

        o = (ImageButton) findViewById(R.id.o_t);
        o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t_p);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.oj);
                suara = R.raw.o;
                txtTulis.setText("O");
            }
        });

        ka = (ImageButton) findViewById(R.id.ka_t);
        ka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t_p);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.kaj);
                suara = R.raw.ka;
                txtTulis.setText("Ka");
            }
        });

        ki = (ImageButton) findViewById(R.id.ki_t);
        ki.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t_p);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.kij);
                suara = R.raw.ki;
                txtTulis.setText("Ki");
            }
        });

        ku = (ImageButton) findViewById(R.id.ku_t);
        ku.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t_p);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.kuj);
                suara = R.raw.ku;
                txtTulis.setText("Ku");
            }
        });

        ke = (ImageButton) findViewById(R.id.ke_t);
        ke.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t_p);
                ko.setImageResource(R.drawable.ko_t);

                imgTulis.setImageResource(R.drawable.kej);
                suara = R.raw.ke;
                txtTulis.setText("Ke");
            }
        });

        ko = (ImageButton) findViewById(R.id.ko_t);
        ko.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                a.setImageResource(R.drawable.a_t);
                i.setImageResource(R.drawable.i_t);
                u.setImageResource(R.drawable.u_t);
                e.setImageResource(R.drawable.e_t);
                o.setImageResource(R.drawable.o_t);
                ka.setImageResource(R.drawable.ka_t);
                ki.setImageResource(R.drawable.ki_t);
                ku.setImageResource(R.drawable.ku_t);
                ke.setImageResource(R.drawable.ke_t);
                ko.setImageResource(R.drawable.ko_t_p);

                imgTulis.setImageResource(R.drawable.koj);
                suara = R.raw.ko;
                txtTulis.setText("Ko");
            }
        });
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar_aka.this, belajar.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }

}


