package com.example.prauts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

// ADIVIA GILANG PRAKARSA - 17523066

public class OrderActivity extends AppCompatActivity {

    TextView data;
    String pesanan, harga;
    EditText nama, jumlah, note;
    Spinner ukuran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        data = findViewById(R.id.pesan);
        nama = findViewById(R.id.nama);
        jumlah = findViewById(R.id.jumlah);
        note = findViewById(R.id.note);
        ukuran = findViewById(R.id.planets_spinner);


        Intent intent = getIntent();

        if(intent.hasExtra("EXTRA_DONAT")) {
            pesanan = intent.getStringExtra("EXTRA_DONAT");
            harga = intent.getStringExtra("EXTRA_DONAT_PRICE");
        }
        if(intent.hasExtra("EXTRA_FROYO")) {
            pesanan = intent.getStringExtra("EXTRA_FROYO");
            harga = intent.getStringExtra("EXTRA_FROYO_PRICE");
        }
        if(intent.hasExtra("EXTRA_ICE_CREAM")) {
            pesanan = intent.getStringExtra("EXTRA_ICE_CREAM");
            harga = intent.getStringExtra("EXTRA_ICE_CREAM_PRICE");
        }

        data.setText("Pesan " + pesanan);

    }
    public void submitPesanan(View view)
    {
        Intent intent = new Intent(this, NotifikasiActivity.class);
        String setNama = nama.getText().toString();
        String setJumlah = jumlah.getText().toString();
        String setNote = note.getText().toString();
        String setUkuran = ukuran.getSelectedItem().toString();

        intent.putExtra("EXTRA_NAMA", setNama);
        intent.putExtra("EXTRA_JUMLAH", setJumlah);
        intent.putExtra("EXTRA_NOTE", setNote);
        intent.putExtra("EXTRA_PESANAN", pesanan);
        intent.putExtra("EXTRA_HARGA", harga);
        intent.putExtra("EXTRA_UKURAN", setUkuran);

        startActivity(intent);
    }
}
