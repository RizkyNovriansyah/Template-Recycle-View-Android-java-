package com.template.recycleview;

import android.graphics.drawable.Drawable;

/**
 * Created by Mohammad Arda on 11/1/2017.
 */

public class Os {

    public String nama;
    public Drawable gambar;
    public String data;

    public Os(String nama, Drawable gambar) {
        this.nama = nama;
        this.gambar = gambar;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
