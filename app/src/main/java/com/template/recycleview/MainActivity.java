package com.template.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private static ArrayList<Os> daftarOs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daftarOs = new ArrayList<Os>();

        daftarOs.add(new Os("Windows", this.getResources().getDrawable(R.drawable.windows)));
        daftarOs.add(new Os("Android", this.getResources().getDrawable(R.drawable.android)));
        daftarOs.add(new Os("Linux", this.getResources().getDrawable(R.drawable.linux)));
        daftarOs.add(new Os("Mac", this.getResources().getDrawable(R.drawable.mac)));
        daftarOs.add(new Os("Palm", this.getResources().getDrawable(R.drawable.palmm)));
        daftarOs.add(new Os("Blackberry", this.getResources().getDrawable(R.drawable.bb)));

        daftarOs.add(new Os("Windows", this.getResources().getDrawable(R.drawable.windows)));
        daftarOs.add(new Os("Android", this.getResources().getDrawable(R.drawable.android)));
        daftarOs.add(new Os("Linux", this.getResources().getDrawable(R.drawable.linux)));
        daftarOs.add(new Os("Mac", this.getResources().getDrawable(R.drawable.mac)));
        daftarOs.add(new Os("Palm", this.getResources().getDrawable(R.drawable.palmm)));
        daftarOs.add(new Os("Blackberry", this.getResources().getDrawable(R.drawable.bb)));

        daftarOs.add(new Os("Windows", this.getResources().getDrawable(R.drawable.windows)));
        daftarOs.add(new Os("Android", this.getResources().getDrawable(R.drawable.android)));
        daftarOs.add(new Os("Linux", this.getResources().getDrawable(R.drawable.linux)));
        daftarOs.add(new Os("Mac", this.getResources().getDrawable(R.drawable.mac)));
        daftarOs.add(new Os("Palm", this.getResources().getDrawable(R.drawable.palmm)));
        daftarOs.add(new Os("Blackberry", this.getResources().getDrawable(R.drawable.bb)));

        daftarOs.add(new Os("Windows", this.getResources().getDrawable(R.drawable.windows)));
        daftarOs.add(new Os("Android", this.getResources().getDrawable(R.drawable.android)));
        daftarOs.add(new Os("Linux", this.getResources().getDrawable(R.drawable.linux)));
        daftarOs.add(new Os("Mac", this.getResources().getDrawable(R.drawable.mac)));
        daftarOs.add(new Os("Palm", this.getResources().getDrawable(R.drawable.palmm)));
        daftarOs.add(new Os("Blackberry", this.getResources().getDrawable(R.drawable.bb)));

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        CustomAdapter mAdapter = new CustomAdapter(this, daftarOs);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
