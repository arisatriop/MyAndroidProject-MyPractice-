package com.example.prauts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// ADIVIA GILANG PRAKARSA - 17523066

public class MainActivity extends AppCompatActivity {

    TextView iceCream, iceCreamPrice, froyo, froyoPrice, donat, donatPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iceCream = findViewById(R.id.ini_ice);
        iceCreamPrice = findViewById(R.id.harga_ice);

        donat = findViewById(R.id.ini_donut);
        donatPrice = findViewById(R.id.harga_donut);

        froyo = findViewById(R.id.ini_froyo);
        froyoPrice = findViewById(R.id.harga_froyo);
    }

    public void clickIceCream(View view)
    {
        Intent intent = new Intent(this, OrderActivity.class);
        String ice_cream = iceCream.getText().toString();
        String ice_cream_price = iceCream.getText().toString();

        intent.putExtra("EXTRA_ICE_CREAM", ice_cream);
        intent.putExtra("EXTRA_ICE_CREAM_PRICE", ice_cream_price);

        startActivity(intent);
    }

    public void clickFroyo(View view)
    {
        Intent intent = new Intent(this, OrderActivity.class);

        String froyoo = froyo.getText().toString();
        String froyoo_price = froyoPrice.getText().toString();

        intent.putExtra("EXTRA_FROYO", froyoo);
        intent.putExtra("EXTRA_FROYO_PRICE", froyoo_price);

        startActivity(intent);
    }

    public void clickDonat(View view)
    {
        Intent intent = new Intent(this, OrderActivity.class);

        String donatt = donat.getText().toString();
        String donatt_price = donat.getText().toString();

        intent.putExtra("EXTRA_DONAT", donatt);
        intent.putExtra("EXTRA_DONAT_PRICE", donatt_price);

        startActivity(intent);
    }
}
