package com.example.android.martabakbanditz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class coklatkeju extends AppCompatActivity {
    int quantity = 30000;
    String jenis="Coklat Keju";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coklatkeju);

        TextView quantityTextView = (TextView) findViewById(R.id.harga_coklatkeju);
        quantityTextView.setText("Rp. "+quantity);

        String text = "Martabak coklat keju merupakan salah satu cemilan yang bisa mengganjal perut " +
                "serta juga paling banyak diminati oleh semua kalangan masyarakat luas yang ada di wilayah indonesia. " +
                "Martabak manis ini adalah makanan yang mempunyai segala macam citarasa. " +
                "Rasa manis dari coklat meises ditambahnya gurihnya keju berpadu denga lembutnya kulit martabak, " +
                "menjadikan mulut tak akan berhenti menikmati sensasinya.";

        WebView riwayat = (WebView) findViewById(R.id.deskripsi);
        riwayat.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
    }
    private String createOrderSummary(String name,String alamat,String telp,String jumlah, String note){
        String priceMessage="Name : "+name;
        priceMessage +="\nAlamat : "+alamat;
        priceMessage +="\nNo. Telp : "+telp;
        priceMessage +="\nJumlah : "+jumlah;
        priceMessage +="\nHarga Rp. "+quantity;
        priceMessage +="\nNote :" +note;
        priceMessage +="\nTerima Kasih!";
        return priceMessage;
    }
    public void pesan(View view){

        EditText text = (EditText)findViewById(R.id.nama);
        String name = text.getText().toString();

        EditText text2 = (EditText)findViewById(R.id.alamat);
        String alamat = text2.getText().toString();

        EditText text3 = (EditText)findViewById(R.id.telp);
        String telp = text3.getText().toString();

        EditText text4 = (EditText)findViewById(R.id.jumlah);
        String jumlah = text4.getText().toString();

        EditText text5 = (EditText)findViewById(R.id.note);
        String note = text5.getText().toString();

        if(text.length()==0||text2.length()==0||text3.length()==0 ||text4.length()==0){
            Toast.makeText(this, "Diisi dulu yaaa :)", Toast.LENGTH_SHORT).show();
        }else{
            String priceMessage=createOrderSummary(name,alamat,telp,jumlah,note);

            Intent intent=new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto: rickytampubolon97@gmail.com")); //hanya email app yang bisa menangani ini
            intent.putExtra(Intent.EXTRA_SUBJECT,jenis+" Mas, dari "+name);
            intent.putExtra(Intent.EXTRA_TEXT,priceMessage);
            if(intent.resolveActivity(getPackageManager())!=null){
                startActivity(intent);
            }

        }
//====================

    }
}
