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

public class belajar_sata extends AppCompatActivity {
    ImageView imgTulis;
    TextView txtTulis;
    int suara = R.raw.sa;
    MediaPlayer mp;
    ImageButton sa, shi, su, se, so, ta, chi, tsu, te, to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_sata);

        txtTulis = (TextView) findViewById(R.id.txtTulis);
        imgTulis = (ImageView) findViewById(R.id.imgTulis);

        ImageButton btnSuara = (ImageButton) findViewById(R.id.btnSuara);
        btnSuara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(belajar_sata.this, suara);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        sa = (ImageButton) findViewById(R.id.sa_t);
        sa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t_p);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.saj);
                suara = R.raw.sa;
                txtTulis.setText("Sa");
            }
        });

        shi = (ImageButton) findViewById(R.id.shi_t);
        shi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t_p);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.shij);
                suara = R.raw.si;
                txtTulis.setText("Shi");
            }
        });

        su = (ImageButton) findViewById(R.id.su_t);
        su.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t_p);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.suj);
                suara = R.raw.su;
                txtTulis.setText("Su");
            }
        });

        se = (ImageButton) findViewById(R.id.se_t);
        se.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t_p);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.sej);
                suara = R.raw.se;
                txtTulis.setText("Se");
            }
        });

        so = (ImageButton) findViewById(R.id.so_t);
        so.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t_p);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.soj);
                suara = R.raw.so;
                txtTulis.setText("So");
            }
        });

        ta = (ImageButton) findViewById(R.id.ta_t);
        ta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t_p);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.taj);
                suara = R.raw.ta;
                txtTulis.setText("Ta");
            }
        });

        chi = (ImageButton) findViewById(R.id.chi_t);
        chi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t_p);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.chij);
                suara = R.raw.ti;
                txtTulis.setText("Chi");
            }
        });

        tsu = (ImageButton) findViewById(R.id.tsu_t);
        tsu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t_p);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.tsuj);
                suara = R.raw.tu;
                txtTulis.setText("Tsu");
            }
        });

        te = (ImageButton) findViewById(R.id.te_t);
        te.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t_p);
                to.setImageResource(R.drawable.to_t);

                imgTulis.setImageResource(R.drawable.tej);
                suara = R.raw.te;
                txtTulis.setText("Te");
            }
        });

        to = (ImageButton) findViewById(R.id.to_t);
        to.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                sa.setImageResource(R.drawable.sa_t);
                shi.setImageResource(R.drawable.shi_t);
                su.setImageResource(R.drawable.su_t);
                se.setImageResource(R.drawable.se_t);
                so.setImageResource(R.drawable.so_t);
                ta.setImageResource(R.drawable.ta_t);
                chi.setImageResource(R.drawable.chi_t);
                tsu.setImageResource(R.drawable.tsu_t);
                te.setImageResource(R.drawable.te_t);
                to.setImageResource(R.drawable.to_t_p);

                imgTulis.setImageResource(R.drawable.toj);
                suara = R.raw.to;
                txtTulis.setText("To");
            }
        });
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar_sata.this, belajar.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);

    }
}