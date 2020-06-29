package com.androidtutorialshub.loginregister.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidtutorialshub.loginregister.R;

public class DetailActivity extends AppCompatActivity {
    TextView washupcallcall;
    ImageView icon1;
    ImageView icon2;
    ImageView gambar;
    TextView nama, Des;

    // buat variable untuk menampung nama buah dan gambar
    String namalapangan;
    String deskripsi;
    int gambarlapangan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //dirext whatsapp by nomor
        washupcallcall = (TextView) findViewById(R.id.nomorWA);
        washupcallcall.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view) {String contact = "+62 87886827825";
            // use country code with your phone number
                String url = "https://api.whatsapp.com/send?phone="+contact;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url)); startActivity(i);
            } });

        //direct whatsapp by gambar
        icon1 = (ImageView) findViewById(R.id.whatsapp);
        icon1.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view) {String contact = "+62 87886827825";
                // use country code with your phone number
                String url = "https://api.whatsapp.com/send?phone="+contact;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url)); startActivity(i);
            } });
        icon2 = (ImageView) findViewById(R.id.whatsappp);
        icon2.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view) {String contact = "+62 87886827825";
                // use country code with your phone number
                String url = "https://api.whatsapp.com/send?phone="+contact;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url)); startActivity(i);
            } });

            // casting id
        gambar = (ImageView) findViewById(R.id.imglapangan);
        nama = (TextView) findViewById(R.id.txtlapangan);
        Des = (TextView) findViewById(R.id.txthargalapangan);

        // ambil nilai yang di kirim pada saat di klik
        namalapangan = getIntent().getStringExtra("Nama");
        deskripsi = getIntent().getStringExtra("Deskripsi");
        gambarlapangan = getIntent().getIntExtra("Gambar", 0);

        // tampilkan di widged
        gambar.setImageResource(gambarlapangan);
        nama.setText(namalapangan);
        Des.setText(deskripsi);
    }
}