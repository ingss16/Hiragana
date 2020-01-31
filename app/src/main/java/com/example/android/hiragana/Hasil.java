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

public class Hasil extends Activity {
    int jd;
    String[] arrPertanyaan;
    String[] arrKunci;
    String[] arrHasil;
    int[] arrGbr;
    int[] arrSuara;

    MediaPlayer mp;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listtittle);

        Intent i = getIntent();
        arrPertanyaan = i.getStringArrayExtra("pertanyaan");
        arrKunci = i.getStringArrayExtra("kunci");
        arrHasil = i.getStringArrayExtra("hasil");
        arrGbr = i.getIntArrayExtra("gambar");
        arrSuara = i.getIntArrayExtra("suara");

        jd = arrPertanyaan.length;

        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));

        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                ItemDetails obj_itemDetails = (ItemDetails) o;

                mp = MediaPlayer.create(Hasil.this, arrSuara[position]);
                mp.start();


            }
        });
    }

    private ArrayList<ItemDetails> GetSearchResults() {
        ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
        ItemDetails item_details = null;
        for (int j = 0; j < jd; j++) {
            item_details = new ItemDetails();
            item_details.setName(arrPertanyaan[j]);
            item_details.setItemDescription(arrKunci[j]);
            item_details.setGambar(arrGbr[j]);
            item_details.setTittle(arrHasil[j]);
            item_details.setSuara(arrSuara[j]);
            results.add(item_details);
        }

        return results;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(Hasil.this, listSoal.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }

}

