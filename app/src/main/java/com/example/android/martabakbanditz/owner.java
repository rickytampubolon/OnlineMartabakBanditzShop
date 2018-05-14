package com.example.android.martabakbanditz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class owner extends AppCompatActivity {

    ImageView instagram;
    ImageView facebook1;
    ImageView twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        String text2 = "Semakin maraknya penjualan makanan tradisional yang sudah ditambahkan inovasi yang lebih kreatif, " +
                "seperti kue cubit, tahu, martabak dan sebagainya. Martabak sudah ada sejak lama dan terus bertahan, " +
                "karena kulineran ini bisa disantap siapa saja dan sudah banyak penggemarnya baik itu gerai di pinggir jalan hingga di " +
                "pusat perbelanjaan tak terhitung jumlahnya. Kendati banyak pemainnya, " +
                "peluang bisnis martabak masih sangat menjanjikan ditambah lagi dikemas dengan baik seperti martabak Banditz.";

        WebView riwayat2 = (WebView) findViewById(R.id.riwayat2);
        riwayat2.loadData("<p style=\"text-align: justify\">"+ text2 +"</p>", "text/html", "UTF-8");

        String text3="Saat ini Martabak Banditz yang berpusat di Jakarta Selatan dan telah berdiri sejak tahun 2015, " +
                "menawarkan paket kemitraan dengan paket Investasi sebesar 45 juta." +
                "Martabak Banditz menawarkan sejumlah varian rasa dan toping martabak dengan harga mulai dari Rp16 ribu sampai Rp 45 ribu. " +
                "Selain pilihan rasa dan varian toping yang kaya serta tekstur yang lembut.\n" +
                "Martabak Banditz juga berbeda  dari sisi kemasan. Martabak Banditz  dikemas dengan kotak yang lebih lux.\n" +
                "\n" +
                "Sesuai dengan tag line “Martabak Banditz yang Membegal di Hati”.\n" +
                "\n" +
                "Martabak Banditz yang kini hadir di Kota Balige merupakan cabang dari unit usaha Martabak Banditz yang ia gagas bersama rekannya di Jakarta.";

        WebView riwayat3 = (WebView) findViewById(R.id.riwayat3);
        riwayat3.loadData("<p style=\"text-align: justify\">"+ text3 +"</p>", "text/html", "UTF-8");

        instagram = (ImageView) findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/martabakbanditzbalige/"));
                startActivity(intent);
            }
        });

        facebook1 = (ImageView) findViewById(R.id.facebook1);
        facebook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/martabakBANDITZ/?ref=br_rs"));
                startActivity(intent);
            }
        });
        twitter = (ImageView) findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/martabakBANDITZ/?ref=br_rs"));
                startActivity(intent);
            }
        });


    }
}
