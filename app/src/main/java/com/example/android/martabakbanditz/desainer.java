package com.example.android.martabakbanditz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class desainer extends AppCompatActivity {
LinearLayout ricky;
LinearLayout kevin;
LinearLayout khairani;
LinearLayout elida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desainer);

        ricky = (LinearLayout) findViewById(R.id.ricky);
        ricky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/rickytpbln"));
                startActivity(intent);
            }
        });

        kevin = (LinearLayout) findViewById(R.id.kevin);
        kevin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/pardamaian97/"));
                startActivity(intent);
            }
        });
        khairani = (LinearLayout) findViewById(R.id.khairani);
        khairani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/khairanimalau"));
                startActivity(intent);
            }
        });
        elida = (LinearLayout) findViewById(R.id.elida);
        elida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/elidasimangunsong"));
                startActivity(intent);
            }
        });

    }
}
