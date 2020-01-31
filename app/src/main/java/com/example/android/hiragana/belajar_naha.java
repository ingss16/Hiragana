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

public class belajar_naha extends AppCompatActivity {
    ImageView imgTulis;
    TextView txtTulis;
    int suara = R.raw.na;
    MediaPlayer mp;
    ImageButton na, ni, nu, ne, no, ha, hi, fu, he, ho;

    @Override
    protected void onCreate(Bundle navedInstanceState) {
        super.onCreate(navedInstanceState);
        setContentView(R.layout.belajar_naha);

        txtTulis = (TextView) findViewById(R.id.txtTulis);
        imgTulis = (ImageView) findViewById(R.id.imgTulis);

        ImageButton btnSuara = (ImageButton) findViewById(R.id.btnSuara);
        btnSuara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(belajar_naha.this, suara);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        na = (ImageButton) findViewById(R.id.na_t);
        na.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t_p);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.naj);
                suara = R.raw.na;
                txtTulis.setText("Na");
            }
        });

        ni = (ImageButton) findViewById(R.id.ni_t);
        ni.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t_p);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.nij);
                suara = R.raw.ni;
                txtTulis.setText("Ni");
            }
        });

        nu = (ImageButton) findViewById(R.id.nu_t);
        nu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t_p);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.nuj);
                suara = R.raw.nu;
                txtTulis.setText("Nu");
            }
        });

        ne = (ImageButton) findViewById(R.id.ne_t);
        ne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t_p);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.nej);
                suara = R.raw.ne;
                txtTulis.setText("Ne");
            }
        });

        no = (ImageButton) findViewById(R.id.no_t);
        no.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t_p);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.noj);
                suara = R.raw.no;
                txtTulis.setText("No");
            }
        });

        ha = (ImageButton) findViewById(R.id.ha_t);
        ha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t_p);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.haj);
                suara = R.raw.ha;
                txtTulis.setText("Ha");
            }
        });

        hi = (ImageButton) findViewById(R.id.hi_t);
        hi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t_p);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.hij);
                suara = R.raw.hi;
                txtTulis.setText("Hi");
            }
        });

        fu = (ImageButton) findViewById(R.id.fu_t);
        fu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t_p);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.fuj);
                suara = R.raw.hu;
                txtTulis.setText("Fu");
            }
        });

        he = (ImageButton) findViewById(R.id.he_t);
        he.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t_p);
                ho.setImageResource(R.drawable.ho_t);

                imgTulis.setImageResource(R.drawable.hej);
                suara = R.raw.he;
                txtTulis.setText("He");
            }
        });

        ho = (ImageButton) findViewById(R.id.ho_t);
        ho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                na.setImageResource(R.drawable.na_t);
                ni.setImageResource(R.drawable.ni_t);
                nu.setImageResource(R.drawable.nu_t);
                ne.setImageResource(R.drawable.ne_t);
                no.setImageResource(R.drawable.no_t);
                ha.setImageResource(R.drawable.ha_t);
                hi.setImageResource(R.drawable.hi_t);
                fu.setImageResource(R.drawable.fu_t);
                he.setImageResource(R.drawable.he_t);
                ho.setImageResource(R.drawable.ho_t_p);

                imgTulis.setImageResource(R.drawable.hoj);
                suara = R.raw.ho;
                txtTulis.setText("Ho");
            }
        });
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar_naha.this, belajar.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);

    }
}

