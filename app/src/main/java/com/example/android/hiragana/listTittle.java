package com.example.android.hiragana;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class listTittle extends Activity {
    int jd;
    String[] arrNama;
    String[] arrDes;
    String[] arrTittle;
    int[] arrGbr;
    int[] arrSuara;
    MediaPlayer mp;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listtittle);

        Intent i = getIntent();
        String data = i.getStringExtra("data");

        if (data.equalsIgnoreCase("Keluarga")) {
            calldata1();
        } else if (data.equalsIgnoreCase("Dapur")) {
            calldata2();
        } else if (data.equalsIgnoreCase("Sekolah")) {
            calldata3();
        } else if (data.equalsIgnoreCase("Kendaraan")) {
            calldata4();
        } else if (data.equalsIgnoreCase("Tubuh")) {
            calldata5();
        } else if (data.equalsIgnoreCase("Makanan")) {
            calldata6();
        } else if (data.equalsIgnoreCase("Minuman")) {
            calldata7();
        } else if (data.equalsIgnoreCase("Buah")) {
            calldata8();
        } else if (data.equalsIgnoreCase("Sayur")) {
            calldata9();
        } else if (data.equalsIgnoreCase("Binatang")) {
            calldata10();
        }


        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));

        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                ItemDetails obj_itemDetails = (ItemDetails) o;

                mp = MediaPlayer.create(listTittle.this, obj_itemDetails.getSuara());
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
    }

    private ArrayList<ItemDetails> GetSearchResults() {
        ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
        ItemDetails item_details = null;
        for (int j = 0; j < jd; j++) {
            item_details = new ItemDetails();
            item_details.setName(arrNama[j]);
            item_details.setItemDescription(arrDes[j]);
            item_details.setGambar(arrGbr[j]);
            item_details.setTittle(arrTittle[j]);
            item_details.setSuara(arrSuara[j]);
            results.add(item_details);
        }

        return results;
    }


    void calldata1() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "ちち";
        arrNama[0] = "Chichi";
        arrDes[0] = "Ayah";
        arrGbr[0] = R.drawable.chichi;
        arrSuara[0] = R.raw.chichi;

        arrTittle[1] = "はは";
        arrNama[1] = "Haha";
        arrDes[1] = "Ibu";
        arrGbr[1] = R.drawable.haha;
        arrSuara[1] = R.raw.haha;

        arrTittle[2] = "あね";
        arrNama[2] = "Ane";
        arrDes[2] = "Kakak perempuan";
        arrGbr[2] = R.drawable.ane;
        arrSuara[2] = R.raw.ane;

        arrTittle[3] = "おとうと";
        arrNama[3] = "Otouto";
        arrDes[3] = "Adik laki-laki";
        arrGbr[3] = R.drawable.otouto;
        arrSuara[3] = R.raw.otouto;

        arrTittle[4] = "いとこ";
        arrNama[4] = "Itoko";
        arrDes[4] = "Sepupu";
        arrGbr[4] = R.drawable.itoko;
        arrSuara[4] = R.raw.itoko;
    }

    void calldata2() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "なべ";
        arrNama[0] = "Nabe";
        arrDes[0] = "Panci masak";
        arrGbr[0] = R.drawable.nabe;
        arrSuara[0] = R.raw.nabe;

        arrTittle[1] = "まないた";
        arrNama[1] = "Manaita";
        arrDes[1] = "Talenan";
        arrGbr[1] = R.drawable.manaita;
        arrSuara[1] = R.raw.manaita;

        arrTittle[2] = "ごみばこ";
        arrNama[2] = "Gomibako";
        arrDes[2] = "Tempat sampah";
        arrGbr[2] = R.drawable.gomibako;
        arrSuara[2] = R.raw.gomibako;

        arrTittle[3] = "ひらなべ";
        arrNama[3] = "Hiranabe";
        arrDes[3] = "Wajan";
        arrGbr[3] = R.drawable.hiranabe;
        arrSuara[3] = R.raw.hiranabe;

        arrTittle[4] = "ひしゃく";
        arrNama[4] = "Hishaku";
        arrDes[4] = "Sendok sayur";
        arrGbr[4] = R.drawable.hishaku;
        arrSuara[4] = R.raw.hishaku;
    }

    void calldata3() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "じしょ";
        arrNama[0] = "Jisho";
        arrDes[0] = "Kamus";
        arrGbr[0] = R.drawable.jisho;
        arrSuara[0] = R.raw.jisho;

        arrTittle[1] = "じょうぎ";
        arrNama[1] = "Jougi";
        arrDes[1] = "Penggaris";
        arrGbr[1] = R.drawable.jougi;
        arrSuara[1] = R.raw.jougi;

        arrTittle[2] = "きょうかしょ";
        arrNama[2] = "Kyoukasho";
        arrDes[2] = "Buku pelajaran";
        arrGbr[2] = R.drawable.kyoukasho;
        arrSuara[2] = R.raw.kyoukasho;

        arrTittle[3] = "つくえ";
        arrNama[3] = "Tsukue";
        arrDes[3] = "Meja";
        arrGbr[3] = R.drawable.tsukue;
        arrSuara[3] = R.raw.tsukue;

        arrTittle[4] = "いす";
        arrNama[4] = "Isu";
        arrDes[4] = "Kursi";
        arrGbr[4] = R.drawable.isu;
        arrSuara[4] = R.raw.isu;
    }

    void calldata4() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "くるま";
        arrNama[0] = "Kuruma";
        arrDes[0] = "Mobil";
        arrGbr[0] = R.drawable.kuruma;
        arrSuara[0] = R.raw.kuruma;

        arrTittle[1] = "でんしゃ";
        arrNama[1] = "Densha";
        arrDes[1] = "Kereta api";
        arrGbr[1] = R.drawable.densha;
        arrSuara[1] = R.raw.densha;

        arrTittle[2] = "じてんしゃ";
        arrNama[2] = "Jitensha";
        arrDes[2] = "Sepeda";
        arrGbr[2] = R.drawable.jitensha;
        arrSuara[2] = R.raw.jitensha;

        arrTittle[3] = "ふね";
        arrNama[3] = "Fune";
        arrDes[3] = "Kapal";
        arrGbr[3] = R.drawable.fune;
        arrSuara[3] = R.raw.fune;

        arrTittle[4] = "ひこうき";
        arrNama[4] = "Hikouki";
        arrDes[4] = "Pesawat terbang";
        arrGbr[4] = R.drawable.hikouki;
        arrSuara[4] = R.raw.hikouki;
    }

    void calldata5() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "め";
        arrNama[0] = "Me";
        arrDes[0] = "Mata";
        arrGbr[0] = R.drawable.me_mata;
        arrSuara[0] = R.raw.me_mata;

        arrTittle[1] = "みみ";
        arrNama[1] = "Mimi";
        arrDes[1] = "Telinga";
        arrGbr[1] = R.drawable.mimi;
        arrSuara[1] = R.raw.mimi;

        arrTittle[2] = "て";
        arrNama[2] = "Te";
        arrDes[2] = "Tangan";
        arrGbr[2] = R.drawable.te_tangan;
        arrSuara[2] = R.raw.te_tangan;

        arrTittle[3] = "あし";
        arrNama[3] = "Ashi";
        arrDes[3] = "Kaki";
        arrGbr[3] = R.drawable.ashi;
        arrSuara[3] = R.raw.ashi;

        arrTittle[4] = "くちびる";
        arrNama[4] = "Kuchibiru";
        arrDes[4] = "Bibir";
        arrGbr[4] = R.drawable.kuchibiru;
        arrSuara[4] = R.raw.kuchibiru;
    }

    void calldata6() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "にく";
        arrNama[0] = "Niku";
        arrDes[0] = "Daging";
        arrGbr[0] = R.drawable.niku;
        arrSuara[0] = R.raw.niku;

        arrTittle[1] = "たまご";
        arrNama[1] = "Tamago";
        arrDes[1] = "Telur";
        arrGbr[1] = R.drawable.tamago;
        arrSuara[1] = R.raw.tamago;

        arrTittle[2] = "ごはん";
        arrNama[2] = "Gohan";
        arrDes[2] = "Nasi";
        arrGbr[2] = R.drawable.gohan;
        arrSuara[2] = R.raw.gohan;

        arrTittle[3] = "のり";
        arrNama[3] = "Nori";
        arrDes[3] = "Rumput laut";
        arrGbr[3] = R.drawable.nori;
        arrSuara[3] = R.raw.nori;

        arrTittle[4] = "すし";
        arrNama[4] = "Sushi";
        arrDes[4] = "Sushi";
        arrGbr[4] = R.drawable.sushi;
        arrSuara[4] = R.raw.sushi;
    }

    void calldata7() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "みず";
        arrNama[0] = "Mizu";
        arrDes[0] = "Air mineral";
        arrGbr[0] = R.drawable.mizu;
        arrSuara[0] = R.raw.mizu;

        arrTittle[1] = "おちゃ";
        arrNama[1] = "Ocha";
        arrDes[1] = "Teh";
        arrGbr[1] = R.drawable.ocha;
        arrSuara[1] = R.raw.ocha;

        arrTittle[2] = "ぎゅうにゅう";
        arrNama[2] = "Gyuunyuu";
        arrDes[2] = "Susu";
        arrGbr[2] = R.drawable.gyunyuu;
        arrSuara[2] = R.raw.gyuunyuu;

        arrTittle[3] = "おさけ";
        arrNama[3] = "Osake";
        arrDes[3] = "Sake";
        arrGbr[3] = R.drawable.osake;
        arrSuara[3] = R.raw.osake;

        arrTittle[4] = "こうちゃ";
        arrNama[4] = "Koucha";
        arrDes[4] = "Teh hitam";
        arrGbr[4] = R.drawable.koucha;
        arrSuara[4] = R.raw.koucha;
    }

    void calldata8() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "みかん";
        arrNama[0] = "Mikan";
        arrDes[0] = "Jeruk";
        arrGbr[0] = R.drawable.mikan;
        arrSuara[0] = R.raw.mikan;

        arrTittle[1] = "いちご";
        arrNama[1] = "Ichigo";
        arrDes[1] = "Strawberry";
        arrGbr[1] = R.drawable.ichigo;
        arrSuara[1] = R.raw.ichigo;

        arrTittle[2] = "ぶどう";
        arrNama[2] = "Budou";
        arrDes[2] = "Anggur";
        arrGbr[2] = R.drawable.budou;
        arrSuara[2] = R.raw.budou;

        arrTittle[3] = "りんご";
        arrNama[3] = "Ringo";
        arrDes[3] = "Apel";
        arrGbr[3] = R.drawable.ringo;
        arrSuara[3] = R.raw.ringo;

        arrTittle[4] = "ようなし";
        arrNama[4] = "Younashi";
        arrDes[4] = "Pir";
        arrGbr[4] = R.drawable.younashi;
        arrSuara[4] = R.raw.younashi;
    }

    void calldata9() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "きゅうり";
        arrNama[0] = "Kyuuri";
        arrDes[0] = "Mentimun";
        arrGbr[0] = R.drawable.kyuuri;
        arrSuara[0] = R.raw.kyuuri;

        arrTittle[1] = "たまねぎ";
        arrNama[1] = "Tamanegi";
        arrDes[1] = "Bawang";
        arrGbr[1] = R.drawable.tamanegi;
        arrSuara[1] = R.raw.tamanegi;

        arrTittle[2] = "にんじん";
        arrNama[2] = "Ninjin";
        arrDes[2] = "Wortel";
        arrGbr[2] = R.drawable.ninjin;
        arrSuara[2] = R.raw.ninjin;

        arrTittle[3] = "ほうれんそう";
        arrNama[3] = "Hourensou";
        arrDes[3] = "Bayam";
        arrGbr[3] = R.drawable.hourensou;
        arrSuara[3] = R.raw.hourensou;

        arrTittle[4] = "だいこん";
        arrNama[4] = "Daikon";
        arrDes[4] = "Lobak";
        arrGbr[4] = R.drawable.daikon;
        arrSuara[4] = R.raw.daikon;
    }

    void calldata10() {
        jd = 5;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "ねこ";
        arrNama[0] = "Neko";
        arrDes[0] = "Kucing";
        arrGbr[0] = R.drawable.neko;
        arrSuara[0] = R.raw.neko;

        arrTittle[1] = "いぬ";
        arrNama[1] = "Inu";
        arrDes[1] = "Anjing";
        arrGbr[1] = R.drawable.inu;
        arrSuara[1] = R.raw.inu;

        arrTittle[2] = "とり";
        arrNama[2] = "Tori";
        arrDes[2] = "Burung";
        arrGbr[2] = R.drawable.tori;
        arrSuara[2] = R.raw.tori;

        arrTittle[3] = "かめ";
        arrNama[3] = "Kame";
        arrDes[3] = "Kura - kura";
        arrGbr[3] = R.drawable.kame;
        arrSuara[3] = R.raw.kame;

        arrTittle[4] = "へび";
        arrNama[4] = "Hebi";
        arrDes[4] = "Ular";
        arrGbr[4] = R.drawable.hebi;
        arrSuara[4] = R.raw.hebi;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(listTittle.this, listKategori.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}


