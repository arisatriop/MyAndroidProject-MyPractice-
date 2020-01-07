package com.example.prauts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// ADIVIA GILANG PRAKARSA - 17523066

public class NotifikasiActivity extends AppCompatActivity {

    String pesanan, harga, nama, jumlah, note, ukuran;
    TextView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);

        Intent intent = getIntent();

        pesanan = intent.getStringExtra("EXTRA_PESANAN");
        harga = intent.getStringExtra("EXTRA_HARGA");
        nama = intent.getStringExtra("EXTRA_NAMA");
        jumlah = intent.getStringExtra("EXTRA_JUMLAH");
        note = intent.getStringExtra("EXTRA_NOTE");
        ukuran = intent.getStringExtra("EXTRA_UKURAN");

        detail = findViewById(R.id.detail);
        detail.setText(nama + " , " + pesanan + " ukuran " + ukuran + " , Total Harga");

    }
    public void home(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
