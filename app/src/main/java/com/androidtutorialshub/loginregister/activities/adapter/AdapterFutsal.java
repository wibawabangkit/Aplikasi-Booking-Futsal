package com.androidtutorialshub.loginregister.activities.adapter;

import android.app.Activity;
import android.widget.ArrayAdapter;

import com.androidtutorialshub.loginregister.R;
import com.androidtutorialshub.loginregister.activities.MainActivity;

public class AdapterFutsal extends ArrayAdapter {
    String list_nama [];
    String deskripsi [];
    int list_gambar [];
    Activity activity;
    //konstruktor
    public AdapterFutsal(MainActivity mainActivity,
                       String[] list_nama,
                       int[] list_gambar,
                       String [] deskripsi)
    {
        super(mainActivity, R.layout.tampilancustomlist, list_nama);
        this.list_gambar = list_gambar;
        activity = mainActivity;
        this.list_nama = list_nama;
        this.deskripsi = deskripsi;

    }}