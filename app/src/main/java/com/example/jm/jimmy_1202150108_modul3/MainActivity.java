package com.example.jm.jimmy_1202150108_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataDeskripsi;
    private ArrayList<Integer> gambar;

    //Daftar Merk Air
    private String[] Judul = {"Aqua", "Ades","Amidis","Cleo","Club","Equil",
            "Evian","Le Minerale","Nestle","Pristine","Vit"};
    //Daftar Deskripsi
    private String[] Deskripsi = {"Ini adalah Air Minum Merk Aqua", "Ini adalah Air Minum Merk Ades","Ini adalah Air Minum Merk Amidis",
            "Ini adalah Air Minum Merk Cleo","Ini adalah Air Minum Merk Club","Ini adalah Air Minum Merk Equil"
            ,"Ini adalah Air Minum Merk Evian","Ini adalah Air Minum Merk Le Minerale", "Ini adalah Air Minum Merk Nestle",
            "Ini adalah Air Minum Merk Pristine","Ini adalah Air Minum Merk Vit"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.aqua, R.drawable.ades,R.drawable.amidis,R.drawable.cleo,R.drawable.club,
            R.drawable.equil,R.drawable.evian,R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataMenu = new ArrayList<>();
        dataDeskripsi = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recycler_view);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(dataMenu,dataDeskripsi,gambar);
        rvView.setAdapter(adapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        rvView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataDeskripsi.add(Deskripsi[w]);
            gambar.add(Gambar[w]);
        }
    }
}
