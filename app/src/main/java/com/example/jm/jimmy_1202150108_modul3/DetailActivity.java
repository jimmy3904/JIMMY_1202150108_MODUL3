package com.example.jm.jimmy_1202150108_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private TextView a,b,f;
    private ImageView d,galon;
    TextView title, liter;

    private int liters = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        galon =  findViewById(R.id.galon);
        liter = findViewById(R.id.liter);

        //melakukan insiasi pada id nya

        a = (TextView) findViewById(R.id.namamakanan);

        f = (TextView) findViewById(R.id.deskripsi);

        d = (ImageView) findViewById(R.id.gambar);


        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String deskripsi = c.getStringExtra("deskripsi");
        Integer gmbr = c.getIntExtra("gambar", 0);

        //melakukan set tex maupun setImageResource untuk data yang sudah di bawa dari layout sbeelumnya
        a.setText(menu);
        f.setText(deskripsi);
        d.setImageResource(gmbr);

        Battery();
    }
    public void min(View view) {
        liters--;
        Battery();
    }

    public void pls(View view) {
        liters++;
        Battery();
    }

    public void Battery(){
        if (liters <= 0) {
            // 20%
            liter.setText("1L");
            galon.setImageResource(R.drawable.ic_battery_20);
            Toast.makeText(this, "Air sedikit", Toast.LENGTH_SHORT).show();
        } else if (liters == 1) {
            // 30%
            liter.setText("2L");
            galon.setImageResource(R.drawable.ic_battery_30);
        } else if (liters == 2) {
            // 50%
            liter.setText("3L");
            galon.setImageResource(R.drawable.ic_battery_50);
        } else if (liters == 3) {
            // 60%
             galon.setImageResource(R.drawable.ic_battery_60);
        } else if (liters == 4) {
            // 80%
            liter.setText("5L");
            galon.setImageResource(R.drawable.ic_battery_80);
        } else if (liters == 5) {
            // 90%
            liter.setText("6L");
            galon.setImageResource(R.drawable.ic_battery_90);
        } else {
            // 100%
            liter.setText("7L");
            galon.setImageResource(R.drawable.ic_battery_full);
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_SHORT).show();
        }
    }
}

