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

public class belajar_tenma2 extends AppCompatActivity {
    ImageView imgTulis;
    TextView txtTulis;
    int suara = R.raw.ba;
    MediaPlayer mp;
    ImageButton ba, bi, bu, be, bo, pa, pi, pu, pe, po;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_tenma2);

        txtTulis = (TextView) findViewById(R.id.txtTulis);
        imgTulis = (ImageView) findViewById(R.id.imgTulis);

        ImageButton btnSuara = (ImageButton) findViewById(R.id.btnSuara);
        btnSuara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(belajar_tenma2.this, suara);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ba = (ImageButton) findViewById(R.id.ba_t);
        ba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t_p);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.baj);
                suara = R.raw.ba;
                txtTulis.setText("Ba");
            }
        });

        bi = (ImageButton) findViewById(R.id.bi_t);
        bi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t_p);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.bij);
                suara = R.raw.bi;
                txtTulis.setText("Bi");
            }
        });

        bu = (ImageButton) findViewById(R.id.bu_t);
        bu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t_p);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.buj);
                suara = R.raw.bu;
                txtTulis.setText("Bu");
            }
        });

        be = (ImageButton) findViewById(R.id.be_t);
        be.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t_p);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.bej);
                suara = R.raw.be;
                txtTulis.setText("Be");
            }
        });

        bo = (ImageButton) findViewById(R.id.bo_t);
        bo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t_p);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.boj);
                suara = R.raw.bo;
                txtTulis.setText("Bo");
            }
        });

        pa = (ImageButton) findViewById(R.id.pa_t);
        pa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t_p);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.paj);
                suara = R.raw.pa;
                txtTulis.setText("Pa");
            }
        });

        pi = (ImageButton) findViewById(R.id.pi_t);
        pi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t_p);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.pij);
                suara = R.raw.pi;
                txtTulis.setText("Pi");
            }
        });

        pu = (ImageButton) findViewById(R.id.pu_t);
        pu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t_p);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.puj);
                suara = R.raw.pu;
                txtTulis.setText("Pu");
            }
        });

        pe = (ImageButton) findViewById(R.id.pe_t);
        pe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t_p);
                po.setImageResource(R.drawable.po_t);

                imgTulis.setImageResource(R.drawable.pej);
                suara = R.raw.pe;
                txtTulis.setText("Pe");
            }
        });

        po = (ImageButton) findViewById(R.id.po_t);
        po.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ba.setImageResource(R.drawable.ba_t);
                bi.setImageResource(R.drawable.bi_t);
                bu.setImageResource(R.drawable.bu_t);
                be.setImageResource(R.drawable.be_t);
                bo.setImageResource(R.drawable.bo_t);
                pa.setImageResource(R.drawable.pa_t);
                pi.setImageResource(R.drawable.pi_t);
                pu.setImageResource(R.drawable.pu_t);
                pe.setImageResource(R.drawable.pe_t);
                po.setImageResource(R.drawable.po_t_p);

                imgTulis.setImageResource(R.drawable.poj);
                suara = R.raw.po;
                txtTulis.setText("Po");
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar_tenma2.this, belajar.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}

