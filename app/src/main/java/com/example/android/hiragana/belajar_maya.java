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

public class belajar_maya extends AppCompatActivity {
    ImageView imgTulis;
    TextView txtTulis;
    int suara = R.raw.ma;
    MediaPlayer mp;
    ImageButton ma, mi, mu, me, mo, ya, yu, yo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_maya);

        txtTulis = (TextView) findViewById(R.id.txtTulis);
        imgTulis = (ImageView) findViewById(R.id.imgTulis);

        ImageButton btnSuara = (ImageButton) findViewById(R.id.btnSuara);
        btnSuara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(belajar_maya.this, suara);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ma = (ImageButton) findViewById(R.id.ma_t);
        ma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t_p);
                mi.setImageResource(R.drawable.mi_t);
                mu.setImageResource(R.drawable.mu_t);
                me.setImageResource(R.drawable.me_t);
                mo.setImageResource(R.drawable.mo_t);
                ya.setImageResource(R.drawable.ya_t);
                yu.setImageResource(R.drawable.yu_t);
                yo.setImageResource(R.drawable.yo_t);

                imgTulis.setImageResource(R.drawable.maj);
                suara = R.raw.ma;
                txtTulis.setText("Ma");
            }
        });

        mi = (ImageButton) findViewById(R.id.mi_t);
        mi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t);
                mi.setImageResource(R.drawable.mi_t_p);
                mu.setImageResource(R.drawable.mu_t);
                me.setImageResource(R.drawable.me_t);
                mo.setImageResource(R.drawable.mo_t);
                ya.setImageResource(R.drawable.ya_t);
                yu.setImageResource(R.drawable.yu_t);
                yo.setImageResource(R.drawable.yo_t);

                imgTulis.setImageResource(R.drawable.mij);
                suara = R.raw.mi;
                txtTulis.setText("Mi");
            }
        });

        mu = (ImageButton) findViewById(R.id.mu_t);
        mu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t);
                mi.setImageResource(R.drawable.mi_t);
                mu.setImageResource(R.drawable.mu_t_p);
                me.setImageResource(R.drawable.me_t);
                mo.setImageResource(R.drawable.mo_t);
                ya.setImageResource(R.drawable.ya_t);
                yu.setImageResource(R.drawable.yu_t);
                yo.setImageResource(R.drawable.yo_t);

                imgTulis.setImageResource(R.drawable.muj);
                suara = R.raw.mu;
                txtTulis.setText("Mu");
            }
        });

        me = (ImageButton) findViewById(R.id.me_t);
        me.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t);
                mi.setImageResource(R.drawable.mi_t);
                mu.setImageResource(R.drawable.mu_t);
                me.setImageResource(R.drawable.me_t_p);
                mo.setImageResource(R.drawable.mo_t);
                ya.setImageResource(R.drawable.ya_t);
                yu.setImageResource(R.drawable.yu_t);
                yo.setImageResource(R.drawable.yo_t);

                imgTulis.setImageResource(R.drawable.mej);
                suara = R.raw.me;
                txtTulis.setText("Me");
            }
        });

        mo = (ImageButton) findViewById(R.id.mo_t);
        mo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t);
                mi.setImageResource(R.drawable.mi_t);
                mu.setImageResource(R.drawable.mu_t);
                me.setImageResource(R.drawable.me_t);
                mo.setImageResource(R.drawable.mo_t_p);
                ya.setImageResource(R.drawable.ya_t);
                yu.setImageResource(R.drawable.yu_t);
                yo.setImageResource(R.drawable.yo_t);

                imgTulis.setImageResource(R.drawable.moj);
                suara = R.raw.mo;
                txtTulis.setText("Mo");
            }
        });

        ya = (ImageButton) findViewById(R.id.ya_t);
        ya.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t);
                mi.setImageResource(R.drawable.mi_t);
                mu.setImageResource(R.drawable.mu_t);
                me.setImageResource(R.drawable.me_t);
                mo.setImageResource(R.drawable.mo_t);
                ya.setImageResource(R.drawable.ya_t_p);
                yu.setImageResource(R.drawable.yu_t);
                yo.setImageResource(R.drawable.yo_t);

                imgTulis.setImageResource(R.drawable.yaj);
                suara = R.raw.ya;
                txtTulis.setText("Ya");
            }
        });

        yu = (ImageButton) findViewById(R.id.yu_t);
        yu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t);
                mi.setImageResource(R.drawable.mi_t);
                mu.setImageResource(R.drawable.mu_t);
                me.setImageResource(R.drawable.me_t);
                mo.setImageResource(R.drawable.mo_t);
                ya.setImageResource(R.drawable.ya_t);
                yu.setImageResource(R.drawable.yu_t_p);
                yo.setImageResource(R.drawable.yo_t);

                imgTulis.setImageResource(R.drawable.yuj);
                suara = R.raw.yu;
                txtTulis.setText("Yu");
            }
        });

        yo = (ImageButton) findViewById(R.id.yo_t);
        yo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ma.setImageResource(R.drawable.ma_t);
                mi.setImageResource(R.drawable.mi_t);
                mu.setImageResource(R.drawable.mu_t);
                me.setImageResource(R.drawable.me_t);
                mo.setImageResource(R.drawable.mo_t);
                ya.setImageResource(R.drawable.ya_t);
                yu.setImageResource(R.drawable.yu_t);
                yo.setImageResource(R.drawable.yo_t_p);

                imgTulis.setImageResource(R.drawable.yoj);
                suara = R.raw.yo;
                txtTulis.setText("Yo");
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar_maya.this, belajar.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}

