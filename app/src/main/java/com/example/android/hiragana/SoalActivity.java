package com.example.android.hiragana;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class SoalActivity extends Activity {

    int ike = 0;
    MediaPlayer mp;
    int[] arRandom;

    String sCatatan = "";
    RadioButton radA, radB, radC, radD;
    int sound = R.raw.a;
    int ke = 0, jumsoal = 5, jumBenar = 0;
    int jd = 5;
    String[] arr_idsoal;
    String[] arr_pertanyaan;
    String[] arr_jawabA;
    String[] arr_jawabB;
    String[] arr_jawabC;
    String[] arr_jawabD;
    String[] arr_jawabBenar;

    int[] arr_gambar;
    int[] arr_suara;

    String[] arrPertanyaan;
    String[] arrKunci;
    String[] arrHasil;
    int[] arrGbr;
    int[] arrSuara;

    ImageView imgGambar;
    TextView txtTanya, txtTanyake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan);


        Intent i = this.getIntent();
        String kategori = i.getStringExtra("kategori");
        if (kategori.equalsIgnoreCase("Keluarga")) {
            callDataKeluarga();
        } else if (kategori.equalsIgnoreCase("Dapur")) {
            callDataDapur();
        } else if (kategori.equalsIgnoreCase("Sekolah")) {
            callDataSekolah();
        } else if (kategori.equalsIgnoreCase("Kendaraan")) {
            callDataKendaraan();
        } else if (kategori.equalsIgnoreCase("Tubuh")) {
            callDataTubuh();
        } else if (kategori.equalsIgnoreCase("Makanan")) {
            callDataMakanan();
        } else if (kategori.equalsIgnoreCase("Minuman")) {
            callDataMinuman();
        } else if (kategori.equalsIgnoreCase("Buah")) {
            callDataBuah();
        } else if (kategori.equalsIgnoreCase("Sayur")) {
            callDataSayur();
        } else if (kategori.equalsIgnoreCase("Binatang")) {
            callDataBinatang();
        }

        bacaRandom();
        arrPertanyaan = new String[jd];
        arrKunci = new String[jd];
        arrHasil = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        txtTanya = (TextView) findViewById(R.id.txtTanya);
        txtTanyake = (TextView) findViewById(R.id.txtTanyaKe);
        imgGambar = (ImageView) findViewById(R.id.myGambar);

        radA = (RadioButton) findViewById(R.id.radA);
        radA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("A");
                ke = ke + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });

        radB = (RadioButton) findViewById(R.id.radB);
        radB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("B");
                ke = ke + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });
        radC = (RadioButton) findViewById(R.id.radC);
        radC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("C");
                ke = ke + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });
        radD = (RadioButton) findViewById(R.id.radD);
        radD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban("D");
                ke = ke + 1;
                if (ke >= jumsoal) {
                    selesai();
                } else {
                    lihat();
                }
            }
        });
        lihat();

        imgGambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
//                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    public void onCompletion(MediaPlayer mp) {
//                        mp.release();
//                    }
//                });
            }
        });
    }

    void cekJawaban(String pil) {

        if (arr_jawabBenar[ike].equals(pil)) {
            jumBenar = jumBenar + 20;
            sCatatan = sCatatan + "Soal-" + (ke + 1) + " Benar,";
            arrHasil[ke] = pil + " :Benar";

        } else {
            sCatatan = sCatatan + "Soal-" + (ke + 1) + " Salah,";
            arrHasil[ke] = pil + " :Salah";

        }

    }
    //algoritma random
    void bacaRandom() {
        arRandom = uniqueRandomArray(jd);
        for (int i = 0; i < jd; i++) {
            Log.v("Rnd", i + "." + arRandom[i]);
        }
    }

    public static int[] uniqueRandomArray(int n) {
        int[] A = new int[n];
        for (int i = 0; i < A.length; ) {
            if (i == A.length) {
                break;
            }
            int b = (int) (Math.random() * n) + 1;
            if (f(A, b) == false) {
                A[i++] = b;
            }
        }
        return A;
    }

    public static boolean f(int[] A, int n) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == n) {
                return true;
            }
        }
        return false;
    }

    void lihat() {
        radA.setChecked(false);
        radB.setChecked(false);
        radC.setChecked(false);
        radD.setChecked(false);
        ike = arRandom[ke] - 1;
        Log.v("Random", ke + "=" + ike + "");
        txtTanya.setText((ke + 1) + "." + arr_pertanyaan[ike]);
        radA.setText(arr_jawabA[ike]);
        radB.setText(arr_jawabB[ike]);
        radC.setText(arr_jawabC[ike]);
        radD.setText(arr_jawabD[ike]);

        sound = arr_suara[ike];
        imgGambar.setImageResource(arr_gambar[ike]);
        mp = MediaPlayer.create(SoalActivity.this, sound);

        arrKunci[ke] = arr_jawabD[ike];

        if (arr_jawabBenar[ike].equalsIgnoreCase("A")) {
            arrKunci[ke] = arr_jawabA[ike];
        } else if (arr_jawabBenar[ike].equalsIgnoreCase("B")) {
            arrKunci[ke] = arr_jawabB[ike];
        } else if (arr_jawabBenar[ike].equalsIgnoreCase("C")) {
            arrKunci[ke] = arr_jawabC[ike];
        }


        arrPertanyaan[ke] = arr_pertanyaan[ike];
        arrGbr[ke] = arr_gambar[ike];
        arrSuara[ke] = arr_suara[ike];

    }

    public void selesai() {
        new AlertDialog.Builder(this).setTitle("NILAI ANDA")
                .setMessage(jumBenar + " Point")
                .setNeutralButton("Selesai", new OnClickListener() {
                    public void onClick(DialogInterface dlg, int sumthin) {

                        Intent i = new Intent(SoalActivity.this, Hasil.class);
                        i.putExtra("pertanyaan", arrPertanyaan);
                        i.putExtra("kunci", arrKunci);
                        i.putExtra("hasil", arrHasil);
                        i.putExtra("gambar", arrGbr);
                        i.putExtra("suara", arrSuara);

                        startActivity(i);
                        finish();

                    }
                }).show();
    }

    public void keluarYN() {
        AlertDialog.Builder ad = new AlertDialog.Builder(SoalActivity.this);
        ad.setMessage("Apakah anda yakin ingin kembali?");

        ad.setPositiveButton("YA", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (mp.isPlaying()) {
                    mp.pause();
                    mp.stop();
                }

                try {
                    mp.pause();
                    mp.stop();
                } catch (Exception ee) {
                }

                finish();
                Intent i = new Intent(SoalActivity.this, listSoal.class); //kembali ke kategori soal
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        ad.setNegativeButton("TIDAK", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });

        ad.show();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            keluarYN();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    void callDataKeluarga() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Ha Ha";
        arr_jawabA[0] = "A. ちち";
        arr_jawabB[0] = "B. はは";
        arr_jawabC[0] = "C. あね";
        arr_jawabD[0] = "D. おとうと";
        arr_jawabBenar[0] = "B";
        arr_gambar[0] = R.drawable.haha;
        arr_suara[0] = R.raw.haha;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " I To Ko";
        arr_jawabA[1] = "A. いとこ";
        arr_jawabB[1] = "B. はは";
        arr_jawabC[1] = "C. あね";
        arr_jawabD[1] = "D. おとうと";
        arr_jawabBenar[1] = "A";
        arr_gambar[1] = R.drawable.itoko;
        arr_suara[1] = R.raw.itoko;


        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " A Ne";
        arr_jawabA[2] = "A. いとこ";
        arr_jawabB[2] = "B. はは";
        arr_jawabC[2] = "C. あね";
        arr_jawabD[2] = "D. おとうと";
        arr_jawabBenar[2] = "C";
        arr_gambar[2] = R.drawable.ane;
        arr_suara[2] = R.raw.ane;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Chichi";
        arr_jawabA[3] = "A. いとこ";
        arr_jawabB[3] = "B. おとうと";
        arr_jawabC[3] = "C. あね";
        arr_jawabD[3] = "D. ちち";
        arr_jawabBenar[3] = "D";
        arr_gambar[3] = R.drawable.chichi;
        arr_suara[3] = R.raw.chichi;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " O To U To";
        arr_jawabA[4] = "A. いとこ";
        arr_jawabB[4] = "B. おとうと";
        arr_jawabC[4] = "C. あね";
        arr_jawabD[4] = "D. ちち";
        arr_jawabBenar[4] = "B";
        arr_gambar[4] = R.drawable.otouto;
        arr_suara[4] = R.raw.otouto;

    }

    void callDataDapur() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Na Be";
        arr_jawabA[0] = "A. なべ";
        arr_jawabB[0] = "B. まないた";
        arr_jawabC[0] = "C. ごみばこ";
        arr_jawabD[0] = "D. ひしゃく";
        arr_jawabBenar[0] = "A";
        arr_gambar[0] = R.drawable.nabe;
        arr_suara[0] = R.raw.nabe;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " Ma Na I Ta";
        arr_jawabA[1] = "A. なべ";
        arr_jawabB[1] = "B. まないた";
        arr_jawabC[1] = "C. ごみばこ";
        arr_jawabD[1] = "D. ひしゃく";
        arr_jawabBenar[1] = "B";
        arr_gambar[1] = R.drawable.manaita;
        arr_suara[1] = R.raw.manaita;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " Go Mi Ba Ko";
        arr_jawabA[2] = "A. なべ";
        arr_jawabB[2] = "B. まないた";
        arr_jawabC[2] = "C. ごみばこ";
        arr_jawabD[2] = "D. ひしゃく";
        arr_jawabBenar[2] = "C";
        arr_gambar[2] = R.drawable.gomibako;
        arr_suara[2] = R.raw.gomibako;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Hi Ra Na Be";
        arr_jawabA[3] = "A. なべ";
        arr_jawabB[3] = "B. まないた";
        arr_jawabC[3] = "C. ひしゃく";
        arr_jawabD[3] = "D. ひらなべ";
        arr_jawabBenar[3] = "D";
        arr_gambar[3] = R.drawable.hiranabe;
        arr_suara[3] = R.raw.hiranabe;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " Hi Sha Ku";
        arr_jawabA[4] = "A. ひしゃく";
        arr_jawabB[4] = "B. まないた";
        arr_jawabC[4] = "C. ひらなべ";
        arr_jawabD[4] = "D. なべ";
        arr_jawabBenar[4] = "A";
        arr_gambar[4] = R.drawable.hishaku;
        arr_suara[4] = R.raw.hishaku;
    }

    void callDataSekolah() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Ji Sho";
        arr_jawabA[0] = "A. じしょ";
        arr_jawabB[0] = "B. じょうぎ";
        arr_jawabC[0] = "C. きょうかしょ";
        arr_jawabD[0] = "D. つくえ";
        arr_jawabBenar[0] = "A";
        arr_gambar[0] = R.drawable.jisho;
        arr_suara[0] = R.raw.jisho;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " Jo U Gi";
        arr_jawabA[1] = "A. じしょ";
        arr_jawabB[1] = "B. じょうぎ";
        arr_jawabC[1] = "C. きょうかしょ";
        arr_jawabD[1] = "D. つくえ";
        arr_jawabBenar[1] = "B";
        arr_gambar[1] = R.drawable.jougi;
        arr_suara[1] = R.raw.jougi;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " Tsu Ku E";
        arr_jawabA[2] = "A. じしょ";
        arr_jawabB[2] = "B. じょうぎ";
        arr_jawabC[2] = "C. つくえ";
        arr_jawabD[2] = "D. きょうかしょ";
        arr_jawabBenar[2] = "C";
        arr_gambar[2] = R.drawable.tsukue;
        arr_suara[2] = R.raw.tsukue;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Kyo U Ka Sho";
        arr_jawabA[3] = "A. じしょ";
        arr_jawabB[3] = "B. いす";
        arr_jawabC[3] = "C. つくえ";
        arr_jawabD[3] = "D. きょうかしょ";
        arr_jawabBenar[3] = "D";
        arr_gambar[3] = R.drawable.kyoukasho;
        arr_suara[3] = R.raw.kyoukasho;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " I Su";
        arr_jawabA[4] = "A. じしょ";
        arr_jawabB[4] = "B. いす";
        arr_jawabC[4] = "C. つくえ";
        arr_jawabD[4] = "D. きょうかしょ";
        arr_jawabBenar[4] = "B";
        arr_gambar[4] = R.drawable.isu;
        arr_suara[4] = R.raw.isu;
    }

    void callDataKendaraan() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Ku Ru Ma";
        arr_jawabA[0] = "A. くるま";
        arr_jawabB[0] = "B. でんしゃ";
        arr_jawabC[0] = "C. じてんしゃ";
        arr_jawabD[0] = "D. ひこうき";
        arr_jawabBenar[0] = "A";
        arr_gambar[0] = R.drawable.kuruma;
        arr_suara[0] = R.raw.kuruma;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " De N Sha";
        arr_jawabA[1] = "A. くるま";
        arr_jawabB[1] = "B. でんしゃ";
        arr_jawabC[1] = "C. じてんしゃ";
        arr_jawabD[1] = "D. ひこうき";
        arr_jawabBenar[1] = "B";
        arr_gambar[1] = R.drawable.densha;
        arr_suara[1] = R.raw.densha;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " Hi Ko U Ki";
        arr_jawabA[2] = "A. くるま";
        arr_jawabB[2] = "B. でんしゃ";
        arr_jawabC[2] = "C. ひこうき";
        arr_jawabD[2] = "D. じてんしゃ";
        arr_jawabBenar[2] = "C";
        arr_gambar[2] = R.drawable.hikouki;
        arr_suara[2] = R.raw.hikouki;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Ji Te N Sha";
        arr_jawabA[3] = "A. くるま";
        arr_jawabB[3] = "B. でんしゃ";
        arr_jawabC[3] = "C. ふね";
        arr_jawabD[3] = "D. じてんしゃ";
        arr_jawabBenar[3] = "D";
        arr_gambar[3] = R.drawable.jitensha;
        arr_suara[3] = R.raw.jitensha;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " Fu Ne";
        arr_jawabA[4] = "A. くるま";
        arr_jawabB[4] = "B. でんしゃ";
        arr_jawabC[4] = "C. ふね";
        arr_jawabD[4] = "D. じてんしゃ";
        arr_jawabBenar[4] = "C";
        arr_gambar[4] = R.drawable.fune;
        arr_suara[4] = R.raw.fune;
    }

    void callDataTubuh() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Ku Chi Bi Ru";
        arr_jawabA[0] = "A. くちびる";
        arr_jawabB[0] = "B. て";
        arr_jawabC[0] = "C. みみ";
        arr_jawabD[0] = "D. め";
        arr_jawabBenar[0] = "A";
        arr_gambar[0] = R.drawable.kuchibiru;
        arr_suara[0] = R.raw.kuchibiru;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " Te";
        arr_jawabA[1] = "A. め";
        arr_jawabB[1] = "B. て";
        arr_jawabC[1] = "C. みみ";
        arr_jawabD[1] = "D. くちびる";
        arr_jawabBenar[1] = "B";
        arr_gambar[1] = R.drawable.te_tangan;
        arr_suara[1] = R.raw.te_tangan;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " Me";
        arr_jawabA[2] = "A. て";
        arr_jawabB[2] = "B. あし";
        arr_jawabC[2] = "C. みみ";
        arr_jawabD[2] = "D. め";
        arr_jawabBenar[2] = "D";
        arr_gambar[2] = R.drawable.me_mata;
        arr_suara[2] = R.raw.me_mata;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " A Shi";
        arr_jawabA[3] = "A. め";
        arr_jawabB[3] = "B. あし";
        arr_jawabC[3] = "C. みみ";
        arr_jawabD[3] = "D. て";
        arr_jawabBenar[3] = "B";
        arr_gambar[3] = R.drawable.ashi;
        arr_suara[3] = R.raw.ashi;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " Mi Mi";
        arr_jawabA[4] = "A. め";
        arr_jawabB[4] = "B. あし";
        arr_jawabC[4] = "C. みみ";
        arr_jawabD[4] = "D. て";
        arr_jawabBenar[4] = "C";
        arr_gambar[4] = R.drawable.mimi;
        arr_suara[4] = R.raw.mimi;
    }

    void callDataMakanan() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Go Ha N";
        arr_jawabA[0] = "A. ごはん";
        arr_jawabB[0] = "B. たまご";
        arr_jawabC[0] = "C. にく";
        arr_jawabD[0] = "D. のり";
        arr_jawabBenar[0] = "A";
        arr_gambar[0] = R.drawable.gohan;
        arr_suara[0] = R.raw.gohan;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " Ta Ma Go";
        arr_jawabA[1] = "A. ごはん";
        arr_jawabB[1] = "B. たまご";
        arr_jawabC[1] = "C. にく";
        arr_jawabD[1] = "D. のり";
        arr_jawabBenar[1] = "B";
        arr_gambar[1] = R.drawable.tamago;
        arr_suara[1] = R.raw.tamago;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " Su Shi";
        arr_jawabA[2] = "A. ごはん";
        arr_jawabB[2] = "B. たまご";
        arr_jawabC[2] = "C. すし";
        arr_jawabD[2] = "D. のり";
        arr_jawabBenar[2] = "C";
        arr_gambar[2] = R.drawable.sushi;
        arr_suara[2] = R.raw.sushi;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Ni Ku";
        arr_jawabA[3] = "A. ごはん";
        arr_jawabB[3] = "B. たまご";
        arr_jawabC[3] = "C. すし";
        arr_jawabD[3] = "D. にく";
        arr_jawabBenar[3] = "D";
        arr_gambar[3] = R.drawable.niku;
        arr_suara[3] = R.raw.niku;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " No Ri";
        arr_jawabA[4] = "A. ごはん";
        arr_jawabB[4] = "B. たまご";
        arr_jawabC[4] = "C. すし";
        arr_jawabD[4] = "D. のり";
        arr_jawabBenar[4] = "D";
        arr_gambar[4] = R.drawable.nori;
        arr_suara[4] = R.raw.nori;
    }

    void callDataMinuman() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " O Sa Ke";
        arr_jawabA[0] = "A. みず";
        arr_jawabB[0] = "B. ぎゅうにゅう";
        arr_jawabC[0] = "C. おさけ";
        arr_jawabD[0] = "D. おちゃ";
        arr_jawabBenar[0] = "C";
        arr_gambar[0] = R.drawable.osake;
        arr_suara[0] = R.raw.osake;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " Gyu U Nyu U";
        arr_jawabA[1] = "A. みず";
        arr_jawabB[1] = "B. おちゃ";
        arr_jawabC[1] = "C. おさけ";
        arr_jawabD[1] = "D. ぎゅうにゅう";
        arr_jawabBenar[1] = "D";
        arr_gambar[1] = R.drawable.gyunyuu;
        arr_suara[1] = R.raw.gyuunyuu;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " O Cha";
        arr_jawabA[2] = "A. ぎゅうにゅう";
        arr_jawabB[2] = "B. おちゃ";
        arr_jawabC[2] = "C. おさけ";
        arr_jawabD[2] = "D. みず";
        arr_jawabBenar[2] = "B";
        arr_gambar[2] = R.drawable.ocha;
        arr_suara[2] = R.raw.ocha;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Mi Zu";
        arr_jawabA[3] = "A. みず";
        arr_jawabB[3] = "B. おちゃ";
        arr_jawabC[3] = "C. こうちゃ";
        arr_jawabD[3] = "D. おさけ";
        arr_jawabBenar[3] = "A";
        arr_gambar[3] = R.drawable.mizu;
        arr_suara[3] = R.raw.mizu;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " Ko U Cha";
        arr_jawabA[4] = "A. おさけ";
        arr_jawabB[4] = "B. みず";
        arr_jawabC[4] = "C. こうちゃ ";
        arr_jawabD[4] = "D. おちゃ";
        arr_jawabBenar[4] = "C";
        arr_gambar[4] = R.drawable.koucha;
        arr_suara[4] = R.raw.koucha;
    }

    void callDataBuah() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " I Chi Go";
        arr_jawabA[0] = "A. ようなし";
        arr_jawabB[0] = "B. いちご";
        arr_jawabC[0] = "C. ぶどう";
        arr_jawabD[0] = "D. みかん";
        arr_jawabBenar[0] = "B";
        arr_gambar[0] = R.drawable.ichigo;
        arr_suara[0] = R.raw.ichigo;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " Mi Ka N";
        arr_jawabA[1] = "A. みかん";
        arr_jawabB[1] = "B. いちご";
        arr_jawabC[1] = "C. ぶどう";
        arr_jawabD[1] = "D. ようなし";
        arr_jawabBenar[1] = "A";
        arr_gambar[1] = R.drawable.mikan;
        arr_suara[1] = R.raw.mikan;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " Ri N Go";
        arr_jawabA[2] = "A. ぶどう";
        arr_jawabB[2] = "B. いちご";
        arr_jawabC[2] = "C. みかん";
        arr_jawabD[2] = "D. りんご";
        arr_jawabBenar[2] = "D";
        arr_gambar[2] = R.drawable.ringo;
        arr_suara[2] = R.raw.ringo;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Yo U Na Shi";
        arr_jawabA[3] = "A. みかん";
        arr_jawabB[3] = "B. りんご";
        arr_jawabC[3] = "C. ようなし";
        arr_jawabD[3] = "D. いちご";
        arr_jawabBenar[3] = "C";
        arr_gambar[3] = R.drawable.younashi;
        arr_suara[3] = R.raw.younashi;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " Bu Do U";
        arr_jawabA[4] = "A. ぶどう";
        arr_jawabB[4] = "B. いちご";
        arr_jawabC[4] = "C. りんご";
        arr_jawabD[4] = "D. ようなし";
        arr_jawabBenar[4] = "A";
        arr_gambar[4] = R.drawable.budou;
        arr_suara[4] = R.raw.budou;
    }

    void callDataSayur() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Ni N Ji N";
        arr_jawabA[0] = "A. だいこん";
        arr_jawabB[0] = "B. ほうれんそう";
        arr_jawabC[0] = "C. にんじん";
        arr_jawabD[0] = "D. きゅうり";
        arr_jawabBenar[0] = "C";
        arr_gambar[0] = R.drawable.ninjin;
        arr_suara[0] = R.raw.ninjin;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " Ho U Re N So U";
        arr_jawabA[1] = "A. きゅうり";
        arr_jawabB[1] = "B. だいこん";
        arr_jawabC[1] = "C. にんじん";
        arr_jawabD[1] = "D. ほうれんそう";
        arr_jawabBenar[1] = "D";
        arr_gambar[1] = R.drawable.hourensou;
        arr_suara[1] = R.raw.hourensou;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " Kyu U Ri";
        arr_jawabA[2] = "A. ほうれんそう";
        arr_jawabB[2] = "B. きゅうり";
        arr_jawabC[2] = "C. にんじん";
        arr_jawabD[2] = "D. だいこん";
        arr_jawabBenar[2] = "B";
        arr_gambar[2] = R.drawable.kyuuri;
        arr_suara[2] = R.raw.kyuuri;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " Ta Ma Ne Gi";
        arr_jawabA[3] = "A. たまねぎ";
        arr_jawabB[3] = "B. ほうれんそう";
        arr_jawabC[3] = "C. きゅうり";
        arr_jawabD[3] = "D. にんじん";
        arr_jawabBenar[3] = "A";
        arr_gambar[3] = R.drawable.tamanegi;
        arr_suara[3] = R.raw.tamanegi;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " Da I Ko N";
        arr_jawabA[4] = "A. だいこん";
        arr_jawabB[4] = "B. きゅうり";
        arr_jawabC[4] = "C. にんじん";
        arr_jawabD[4] = "D. たまねぎ";
        arr_jawabBenar[4] = "A";
        arr_gambar[4] = R.drawable.daikon;
        arr_suara[4] = R.raw.daikon;
    }

    void callDataBinatang() {
        jd = 5;
        arr_idsoal = new String[jd];
        arr_pertanyaan = new String[jd];
        arr_jawabA = new String[jd];
        arr_jawabB = new String[jd];
        arr_jawabC = new String[jd];
        arr_jawabD = new String[jd];
        arr_jawabBenar = new String[jd];
        arr_gambar = new int[jd];
        arr_suara = new int[jd];

        // soal-soal
        arr_idsoal[0] = "S01";
        arr_pertanyaan[0] = " Ne Ko";
        arr_jawabA[0] = "A. いぬ";
        arr_jawabB[0] = "B. かめ";
        arr_jawabC[0] = "C. へび";
        arr_jawabD[0] = "D. ねこ";
        arr_jawabBenar[0] = "D";
        arr_gambar[0] = R.drawable.neko;
        arr_suara[0] = R.raw.neko;

        arr_idsoal[1] = "S02";
        arr_pertanyaan[1] = " He Bi";
        arr_jawabA[1] = "A. かめ";
        arr_jawabB[1] = "B. いぬ";
        arr_jawabC[1] = "C. へび";
        arr_jawabD[1] = "D. ねこ";
        arr_jawabBenar[1] = "C";
        arr_gambar[1] = R.drawable.hebi;
        arr_suara[1] = R.raw.hebi;

        arr_idsoal[2] = "S03";
        arr_pertanyaan[2] = " I Nu";
        arr_jawabA[2] = "A. かめ";
        arr_jawabB[2] = "B. いぬ";
        arr_jawabC[2] = "C. ねこ";
        arr_jawabD[2] = "D. へび";
        arr_jawabBenar[2] = "B";
        arr_gambar[2] = R.drawable.inu;
        arr_suara[2] = R.raw.inu;

        arr_idsoal[3] = "S04";
        arr_pertanyaan[3] = " To Ri";
        arr_jawabA[3] = "A. とり";
        arr_jawabB[3] = "B. ねこ";
        arr_jawabC[3] = "C. へび";
        arr_jawabD[3] = "D. かめ";
        arr_jawabBenar[3] = "A";
        arr_gambar[3] = R.drawable.tori;
        arr_suara[3] = R.raw.tori;

        arr_idsoal[4] = "S05";
        arr_pertanyaan[4] = " Ka Me";
        arr_jawabA[4] = "A. とり";
        arr_jawabB[4] = "B. いぬ";
        arr_jawabC[4] = "C. かめ";
        arr_jawabD[4] = "D. ねこ";
        arr_jawabBenar[4] = "C";
        arr_gambar[4] = R.drawable.kame;
        arr_suara[4] = R.raw.kame;
    }
}

