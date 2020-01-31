package com.example.android.hiragana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;


public class listSoal extends Activity implements OnItemClickListener {
    private ListView listView1;
    listheaderKategori[] listdata;
    int jd = 0;
    String[] arrKat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        jd = 10;
        arrKat = new String[jd];
        arrKat[0] = "Keluarga";
        arrKat[1] = "Dapur";
        arrKat[2] = "Sekolah";
        arrKat[3] = "Kendaraan";
        arrKat[4] = "Tubuh";
        arrKat[5] = "Makanan";
        arrKat[6] = "Minuman";
        arrKat[7] = "Buah";
        arrKat[8] = "Sayur";
        arrKat[9] = "Binatang";


        listdata = new listheaderKategori[jd];
        for (int j = 0; j < jd; j++) {
            listdata[j] = new listheaderKategori(R.drawable.star_on, arrKat[j]);
        }
        listitemKategori adapter = new listitemKategori(this, R.layout.listitem, listdata);
        listView1 = (ListView) findViewById(R.id.listView1);
        View header = (View) getLayoutInflater().inflate(R.layout.listheader, null);
        listView1.addHeaderView(header);
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener((OnItemClickListener) this);

        TextView txtMarquee = (TextView) findViewById(R.id.txtHeader);
        txtMarquee.setSelected(true);
        String kata = " Latihan ";
        String POLA = getString(R.string.marquee);
        String kalimat = String.format(POLA, TextUtils.htmlEncode(kata));
        txtMarquee.setText(Html.fromHtml(kalimat));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent i = new Intent(listSoal.this, SoalActivity.class);
        i.putExtra("kategori", arrKat[position - 1]);
        finish();
        startActivity(i);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(listSoal.this, MainActivity.class); //kembali ke menu utama
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }

}