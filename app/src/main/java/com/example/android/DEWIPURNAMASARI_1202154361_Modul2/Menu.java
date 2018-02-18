package com.example.android.DEWIPURNAMASARI_1202154361_Modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    //method yang dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            //memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Nasi Goreng");
            foods.add("Cream Soup");
            foods.add("Mac n Cheese");
            foods.add("Omelet");
            foods.add("Sandwich");
            foods.add("Telur");
            foods.add("Spaghetti");
            foods.add("Siomay");

            //memanggil harga
            priceses.add(12000);
            priceses.add(15000);
            priceses.add(20000);
            priceses.add(13000);
            priceses.add(10000);
            priceses.add(4000);
            priceses.add(22000);
            priceses.add(10000);

            //memanggil foto yang ada pada drawable
            photos.add(R.drawable.nasigoreng);
            photos.add(R.drawable.creamsoup);
            photos.add(R.drawable.macncheese);
            photos.add(R.drawable.omelet);
            photos.add(R.drawable.sandwich);
            photos.add(R.drawable.telur);
            photos.add(R.drawable.spaghetti);
            photos.add(R.drawable.siomay);
        }
    }
}
