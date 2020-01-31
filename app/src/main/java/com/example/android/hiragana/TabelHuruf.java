package com.example.android.hiragana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

public class TabelHuruf extends AppCompatActivity {
    TabHost tabHost;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabel_huruf);


        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        //Tab 1
        TabHost.TabSpec spec = tabHost.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Sei-on");
        tabHost.addTab(spec);

        //Tab 2
        spec = tabHost.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Daku-on");
        tabHost.addTab(spec);

        //Tab 3
        spec = tabHost.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Handaku-on");
        tabHost.addTab(spec);

        //Tab 4
        spec = tabHost.newTabSpec("Tab Four");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Yoo-on");
        tabHost.addTab(spec);

        ImageButton a_t = (ImageButton) findViewById(R.id.a_t);
        a_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.a);
                mp.start();     // audio dimainkan
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();   //audio di buang (lepas memori)
                    }
                });
            }
        });
        ImageButton i_t = (ImageButton) findViewById(R.id.i_t);
        i_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.i);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton u_t = (ImageButton) findViewById(R.id.u_t);
        u_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.u);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton e_t = (ImageButton) findViewById(R.id.e_t);
        e_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.e);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton o_t = (ImageButton) findViewById(R.id.o_t);
        o_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.o);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton ka_t = (ImageButton) findViewById(R.id.ka_t);
        ka_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ka);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton ki_t = (ImageButton) findViewById(R.id.ki_t);
        ki_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ki);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ku_t = (ImageButton) findViewById(R.id.ku_t);
        ku_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ku);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ke_t = (ImageButton) findViewById(R.id.ke_t);
        ke_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ke);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ko_t = (ImageButton) findViewById(R.id.ko_t);
        ko_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ko);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton sa_t = (ImageButton) findViewById(R.id.sa_t);
        sa_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.sa);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton shi_t = (ImageButton) findViewById(R.id.shi_t);
        shi_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.si);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton su_t = (ImageButton) findViewById(R.id.su_t);
        su_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.su);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton se_t = (ImageButton) findViewById(R.id.se_t);
        se_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.se);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton so_t = (ImageButton) findViewById(R.id.so_t);
        so_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.so);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ta_t = (ImageButton) findViewById(R.id.ta_t);
        ta_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ta);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton chi_t = (ImageButton) findViewById(R.id.chi_t);
        chi_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ti);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton tsu_t = (ImageButton) findViewById(R.id.tsu_t);
        tsu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.tu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton te_t = (ImageButton) findViewById(R.id.te_t);
        te_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.te);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton to_t = (ImageButton) findViewById(R.id.to_t);
        to_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.to);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton na_t = (ImageButton) findViewById(R.id.na_t);
        na_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.na);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ni_t = (ImageButton) findViewById(R.id.ni_t);
        ni_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ni);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton nu_t = (ImageButton) findViewById(R.id.nu_t);
        nu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.nu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ne_t = (ImageButton) findViewById(R.id.ne_t);
        ne_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ne);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton no_t = (ImageButton) findViewById(R.id.no_t);
        no_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.no);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ha_t = (ImageButton) findViewById(R.id.ha_t);
        ha_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ha);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton hi_t = (ImageButton) findViewById(R.id.hi_t);
        hi_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.hi);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton fu_t = (ImageButton) findViewById(R.id.fu_t);
        fu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.hu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton he_t = (ImageButton) findViewById(R.id.he_t);
        he_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.he);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ho_t = (ImageButton) findViewById(R.id.ho_t);
        ho_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ho);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ma_t = (ImageButton) findViewById(R.id.ma_t);
        ma_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ma);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton mi_t = (ImageButton) findViewById(R.id.mi_t);
        mi_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.mi);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton mu_t = (ImageButton) findViewById(R.id.mu_t);
        mu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.mu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton me_t = (ImageButton) findViewById(R.id.me_t);
        me_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.me);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton mo_t = (ImageButton) findViewById(R.id.mo_t);
        mo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.mo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ya_t = (ImageButton) findViewById(R.id.ya_t);
        ya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton yu_t = (ImageButton) findViewById(R.id.yu_t);
        yu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.yu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton yo_t = (ImageButton) findViewById(R.id.yo_t);
        yo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.yo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ra_t = (ImageButton) findViewById(R.id.ra_t);
        ra_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ra);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ri_t = (ImageButton) findViewById(R.id.ri_t);
        ri_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ri);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ru_t = (ImageButton) findViewById(R.id.ru_t);
        ru_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ru);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton re_t = (ImageButton) findViewById(R.id.re_t);
        re_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.re);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ro_t = (ImageButton) findViewById(R.id.ro_t);
        ro_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ro);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton wa_t = (ImageButton) findViewById(R.id.wa_t);
        wa_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.wa);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton wo_t = (ImageButton) findViewById(R.id.wo_t);
        wo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.wo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton n_t = (ImageButton) findViewById(R.id.n_t);
        n_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.n);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ga_t = (ImageButton) findViewById(R.id.ga_t);
        ga_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ga);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton gi_t = (ImageButton) findViewById(R.id.gi_t);
        gi_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.gi);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton gu_t = (ImageButton) findViewById(R.id.gu_t);
        gu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.gu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ge_t = (ImageButton) findViewById(R.id.ge_t);
        ge_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ge);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton go_t = (ImageButton) findViewById(R.id.go_t);
        go_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.go);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton za_t = (ImageButton) findViewById(R.id.za_t);
        za_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.za);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ji_t = (ImageButton) findViewById(R.id.ji_t);
        ji_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.zi);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton zu_t = (ImageButton) findViewById(R.id.zu_t);
        zu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.zu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ze_t = (ImageButton) findViewById(R.id.ze_t);
        ze_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ze);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton zo_t = (ImageButton) findViewById(R.id.zo_t);
        zo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.zo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton da_t = (ImageButton) findViewById(R.id.da_t);
        da_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.da);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton di_t = (ImageButton) findViewById(R.id.di_t);
        di_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.di);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton du_t = (ImageButton) findViewById(R.id.du_t);
        du_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.du);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton de_t = (ImageButton) findViewById(R.id.de_t);
        de_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.de);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton do_t = (ImageButton) findViewById(R.id.do_t);
        do_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.doo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton ba_t = (ImageButton) findViewById(R.id.ba_t);
        ba_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ba);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton bi_t = (ImageButton) findViewById(R.id.bi_t);
        bi_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.bi);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton bu_t = (ImageButton) findViewById(R.id.bu_t);
        bu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.bu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton be_t = (ImageButton) findViewById(R.id.be_t);
        be_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.be);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton bo_t = (ImageButton) findViewById(R.id.bo_t);
        bo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.bo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton pa_t = (ImageButton) findViewById(R.id.pa_t);
        pa_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.pa);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton pi_t = (ImageButton) findViewById(R.id.pi_t);
        pi_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.pi);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton pu_t = (ImageButton) findViewById(R.id.pu_t);
        pu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.pu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton pe_t = (ImageButton) findViewById(R.id.pe_t);
        pe_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.pe);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton po_t = (ImageButton) findViewById(R.id.po_t);
        po_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.po);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton kya_t = (ImageButton) findViewById(R.id.kya_t);
        kya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.kya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton kyu_t = (ImageButton) findViewById(R.id.kyu_t);
        kyu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.kyu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton kyo_t = (ImageButton) findViewById(R.id.kyo_t);
        kyo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.kyo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton sha_t = (ImageButton) findViewById(R.id.sha_t);
        sha_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.sha);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton shu_t = (ImageButton) findViewById(R.id.shu_t);
        shu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.shu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton sho_t = (ImageButton) findViewById(R.id.sho_t);
        sho_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.sho);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton cha_t = (ImageButton) findViewById(R.id.cha_t);
        cha_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.cha);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton chu_t = (ImageButton) findViewById(R.id.chu_t);
        chu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.chu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton cho_t = (ImageButton) findViewById(R.id.cho_t);
        cho_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.cho);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton nya_t = (ImageButton) findViewById(R.id.nya_t);
        nya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.nya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton nyu_t = (ImageButton) findViewById(R.id.nyu_t);
        nyu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.nyu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton nyo_t = (ImageButton) findViewById(R.id.nyo_t);
        nyo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.nyo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton hya_t = (ImageButton) findViewById(R.id.hya_t);
        hya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.hya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton hyu_t = (ImageButton) findViewById(R.id.hyu_t);
        hyu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.hyu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton hyo_t = (ImageButton) findViewById(R.id.hyo_t);
        hyo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.hyo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton mya_t = (ImageButton) findViewById(R.id.mya_t);
        mya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.mya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton myu_t = (ImageButton) findViewById(R.id.myu_t);
        myu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.myu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        ImageButton myo_t = (ImageButton) findViewById(R.id.myo_t);
        myo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.myo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton rya_t = (ImageButton) findViewById(R.id.rya_t);
        rya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.rya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ryu_t = (ImageButton) findViewById(R.id.ryu_t);
        ryu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ryu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ryo_t = (ImageButton) findViewById(R.id.ryo_t);
        ryo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ryo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton gya_t = (ImageButton) findViewById(R.id.gya_t);
        gya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.gya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton gyu_t = (ImageButton) findViewById(R.id.gyu_t);
        gyu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.gyu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton gyo_t = (ImageButton) findViewById(R.id.gyo_t);
        gyo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.gyo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ja_t = (ImageButton) findViewById(R.id.ja_t);
        ja_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ja);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton ju_t = (ImageButton) findViewById(R.id.ju_t);
        ju_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.ju);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton jo_t = (ImageButton) findViewById(R.id.jo_t);
        jo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.jo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton bya_t = (ImageButton) findViewById(R.id.bya_t);
        bya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.bya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton byu_t = (ImageButton) findViewById(R.id.byu_t);
        byu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.byu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton byo_t = (ImageButton) findViewById(R.id.byo_t);
        byo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.byo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton pya_t = (ImageButton) findViewById(R.id.pya_t);
        pya_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.pya);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton pyu_t = (ImageButton) findViewById(R.id.pyu_t);
        pyu_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.pyu);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        ImageButton pyo_t = (ImageButton) findViewById(R.id.pyo_t);
        pyo_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp = MediaPlayer.create(TabelHuruf.this, R.raw.pyo);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(TabelHuruf.this, MainActivity.class);     //kembali ke menu awal
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);     // membersihkan riwayat activity
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }


}
