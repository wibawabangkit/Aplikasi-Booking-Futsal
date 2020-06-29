package com.androidtutorialshub.loginregister.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.androidtutorialshub.loginregister.R;

public class MainActivity extends AppCompatActivity {

    String list_nama [] ={
            "Lapangan 1",
            "Lapangan 2",
            "Lapangan 3",
            "Lapangan 4",
            "Lapangan 5"

    };
    String deskripsi [] ={
            "Detail Lapangan 1\n" +
                    "Harga Pukul 08.30-16.30 WIB \n" +
                    "   - 30.000/Jam \n" +
                    "Harga Pukul 18.00-21.00 WIB\n" +
                    "   - 40.000/Jam\n" +
                    "Fasilitas :\n" +
                    "   - Bola Futsal 2\n" +
                    "   - Lapangan ukuran 1/4 " +
                    "     lapangan profesional\n" +
                    "   - Papan Skor\n" +
                    "   - Gawang Futsal\n",
            "Detail Lapangan 2\n" +
                    "Harga Pukul 08.30-16.30 WIB\n" +
                    "   - 50.000/Jam \n" +
                    "Harga Pukul 18.00-21.00 WIB\n" +
                    "   - 60.000/Jam \n" +
                    "Fasilitas :\n" +
                    "   - Bola Futsal 3\n" +
                    "   - Lapangan ukuran 1/2\n" +
                    "     lapangan profesional\n" +
                    "   - Papan Skor\n" +
                    "   - Gawang Futsal\n",
            "Detail Lapangan 3\n" +
                    "Harga : \n" +
                    "Harga Pukul 08.30-16.30 WIB\n" +
                    "   - 70.000/Jam \n" +
                    "Harga Pukul 18.00-21.00 WIB\n" +
                    "   - 80.000/Jam \n" +
                    "Fasilitas : \n" +
                    "   - Bola Futsal 5\n" +
                    "   - Lapangan Profesional\n" +
                    "   - Papan Skor\n" +
                    "   - Gawang Futsal\n",
            "Detail Lapangan 4\n" +
                    "Harga : \n" +
                    "Harga Pukul 08.30-16.30 WIB\n" +
                    "   - 70.000/Jam \n" +
                    "Harga Pukul 18.00-21.00 WIB\n" +
                    "   - 80.000/Jam \n" +
                    "Fasilitas : \n" +
                    "   - Bola Futsal 5\n" +
                    "   - Lapangan Profesional\n" +
                    "   - Papan Skor\n" +
                    "   - Gawang Futsal\n",
            "Detail Lapangan 5\n" +
                    "Harga Pukul 08.30-16.30 WIB \n" +
                    "   - 20.000/Jam \n" +
                    "Harga Pukul 18.00-21.00 WIB\n" +
                    "   - 30.000/Jam \n" +
                    "Fasilitas :\n" +
                    "   - Bola Futsal 1\n" +
                    "   - Lapangan ukuran kecil\n"+
                    "   - Papan Skor\n" +
                    "   - Gawang Futsal"

    };

    // daftar gambar
    int list_gambar [] ={
            R.drawable.lapangann1,
            R.drawable.lapangann2,
            R.drawable.lapangann3,
            R.drawable.lapangann,
            R.drawable.lapangan
    };

    ListView list_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        list_item = (ListView) findViewById(R.id.list_item);
        // membuat sebuah adapter yang berfungsi untuk menampung data sementara sebelum di tampilkan ke dalam list view
        AdapterFutsal adapter = new AdapterFutsal(this, list_nama, list_gambar, deskripsi);
        //menampilkan / memasukan adapter ke dalam ListView
        list_item.setAdapter(adapter);
        //memberikan event ketika listview diklik
        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // inten ke detail.java dengan mengirimkan parameter yang berisi nama dan gambar
                Intent a = new Intent(getApplicationContext(), DetailActivity.class);
                //kirimkan parameter
                a.putExtra("Nama", list_nama[position]);
                a.putExtra("Gambar", list_gambar[position]);
                a.putExtra("Deskripsi", deskripsi[position]);

                //kirimkan ke detail.java
                startActivity(a);
            }
        });


    }

    // class di dalam class
    private class AdapterFutsal extends ArrayAdapter {
        String list_nama[];
        String deskripsi[];
        int list_gambar[];
        Activity activity;

        //konstruktor
        public AdapterFutsal(MainActivity mainActivity, String[] list_nama, int[] list_gambar, String[] deskripsi) {
            super(mainActivity, R.layout.tampilancustomlist, list_nama);
            this.list_gambar = list_gambar;
            activity = mainActivity;
            this.list_nama = list_nama;
            this.deskripsi = deskripsi;

        }


        //menthode yang digunakan untuk memanggil layout list_buah dan mengenalkan widgetnya
        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // panggil layout list_buah
            LayoutInflater inflater = (LayoutInflater) activity.getLayoutInflater();
            View v = inflater.inflate(R.layout.tampilancustomlist, null);
            // kenalkan widget yang ada pada list buah
            ImageView gambar;
            TextView nama;

            //casting widget id
            gambar = (ImageView) v.findViewById(R.id.imglapangan);
            nama = (TextView) v.findViewById(R.id.txtlapangan);
            // set data kedalam image
            gambar.setImageResource(list_gambar[position]);
            nama.setText(list_nama[position]);

            return v;
        }
    }}
