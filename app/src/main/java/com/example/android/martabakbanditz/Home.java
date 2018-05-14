package com.example.android.martabakbanditz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    LinearLayout alamat;
    LinearLayout web;

    int harga_kacangcoklat = 30000;
    int harga_keju = 20000;
    int harga_coklatkeju = 30000;
    int harga_jagungkeju = 30000;
    int harga_jagung = 20000;
    int harga_jagungcoklat = 30000;
    int harga_durian = 30000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView kacangcoklat = (TextView) findViewById(R.id.harga_kacangcoklat);
        kacangcoklat.setText("Rp. "+harga_kacangcoklat);
        TextView keju = (TextView) findViewById(R.id.harga_keju);
        keju.setText("Rp. "+harga_keju);
        TextView coklatkeju = (TextView) findViewById(R.id.harga_coklatkeju);
        coklatkeju.setText("Rp. "+harga_coklatkeju);
        TextView jagungkeju = (TextView) findViewById(R.id.harga_jagungkeju);
        jagungkeju.setText("Rp. "+harga_jagungkeju);
        TextView jagung = (TextView) findViewById(R.id.harga_jagung);
        jagung.setText("Rp. "+harga_jagung);
        TextView jagungcoklat = (TextView) findViewById(R.id.harga_jagungcoklat);
        jagungcoklat.setText("Rp. "+harga_jagungcoklat);
        TextView durian = (TextView) findViewById(R.id.harga_durian);
        durian.setText("Rp. "+harga_durian);

        alamat = (LinearLayout) findViewById(R.id.alamat);
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://goo.gl/maps/ggFaZpHwsYo"));
                startActivity(intent);
            }
        });

        web = (LinearLayout) findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://martabakbanditz.com/"));
                startActivity(intent);
            }
        });
    }
    public void durian(View view) {
        Intent intent = new Intent(Home.this, durian.class);
        startActivity(intent);
    }
    public void desainer(View view) {
        Intent intent = new Intent(Home.this, desainer.class);
        startActivity(intent);
    }
    public void owner(View view) {
        Intent intent = new Intent(Home.this, owner.class);
        startActivity(intent);
    }
    public void kacangcoklat(View view) {
        Intent intent = new Intent(Home.this, kacangcoklat.class);
        startActivity(intent);
    }
    public void keju(View view) {
        Intent intent = new Intent(Home.this, keju.class);
        startActivity(intent);
    }
    public void coklatkeju(View view) {
        Intent intent = new Intent(Home.this, coklatkeju.class);
        startActivity(intent);
    }
    public void jagungkeju(View view) {
        Intent intent = new Intent(Home.this, jagungkeju.class);
        startActivity(intent);
    }
    public void jagung(View view) {
        Intent intent = new Intent(Home.this, jagung.class);
        startActivity(intent);
    }
    public void jagungcoklat(View view) {
        Intent intent = new Intent(Home.this, jagungcoklat.class);
        startActivity(intent);
    }
}
